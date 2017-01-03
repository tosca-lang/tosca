// Copyright (c) 2016 IBM Corporation.
#include <iostream>
#include <vector>
#include <stack>
#include "term.h"
#include "compat.h"
#include "termprinter.h"
#include "strutils.h"
#include "ts.h"
#include "iowrapper.h"

namespace tosca {

    // Temporary debugging helpers.
    static const bool TRACK_REFS = getenv("toscatrackref") != 0;
    static long allocated_count = 0;
    static std::unordered_map<class Ref*, long> allocated;
    static long track_allocated = getenv("toscatrackid") ? atol(getenv("toscatrackid")) : -1;
    
    static bool Alive(class Ref* ref)
    {
        if (ref->refcount <= 0)
        {
            std::cerr << "Invalid use of freed reference ";
            if (TRACK_REFS)
                std::cerr << allocated[ref] << "\n";
            return false;
        }
        return true;
    }



    // --- Ref

    Ref::Ref(): refcount(1), track(false)
    {
        if (TRACK_REFS)
        {
            allocated[this] = allocated_count ++;
            if (track_allocated == allocated[this])
                std::cerr << "\n[" << allocated[this] << "] created ";
        }
    }

    Ref::Ref(bool immortal): refcount(immortal ? IMMORTAL : 1), track(false)
    {
        if (TRACK_REFS)
        {
            allocated[this] = allocated_count ++;
            if (track_allocated == allocated[this])
                std::cerr << "\n[" << allocated[this] << "] created ";
        }
    }

    Ref::~Ref()
    {
    	assert(refcount != IMMORTAL);
        //std::cout << "delete ref\n";
        //assert(refcount == 0); // refcount not zero when term allocated on stack
    }

    void Ref::AddRef()
    {
        assert(Alive(this));
        if (refcount != IMMORTAL)
        {
        	refcount++;
        	if (TRACK_REFS && (track || track_allocated == allocated[this]))
        		std::cerr << "\n[" << allocated[this] << "] add ref " << refcount ;
        }
    }

    void Ref::Release()
    {
        assert(Alive(this));
        if (refcount != IMMORTAL)
        {
        	refcount--;

        	if (TRACK_REFS && (track || track_allocated == allocated[this]))
        		std::cerr << "\n[" << allocated[this] << "] released " << refcount;

        	if (refcount == 0)
        	{
        		if (TRACK_REFS)
        			allocated.erase(this);

        		delete this;
        	}
        }
    }

    void Ref::Track(long id)
    {
        track_allocated = id;
    }


    void Ref::PrintAlive()
    {
    	if (TRACK_REFS)
    	{
    		for (auto it = allocated.begin(); it != allocated.end(); it++)
    		{
    			std::cerr << "\n[" << it->second << "] " << it->first->refcount;
    		}
    	}
    }

    // --- Term


    Term::Term() : Ref() {}

    Term::~Term() {}
    
    const std::string& Term::Symbol() const
    {
        auto v = this->GetGVariable();
        if (v)
            return v.value().Symbol();
    
        static const std::string empty;
        return empty;
    }

    Term& Term::Copy(Context& ctx)
    {
        throw new std::runtime_error("Internal error: missing Copy override");
    }

    bool Term::Data() const
    {
        return true;
    }

    unsigned Term::Arity() const
    {
    	int arity = 0;
    	while (Sub(arity))
    		arity ++;
    	return arity;
    }

    Optional<Term> Term::Sub(int i) const
    {
        return Optional<Term>::nullopt;
    }

    void Term::SetSub(int i, Term& sub)
    {
        assert(false);
    }

    Optional<Variable> Term::Binder(int i, int j) const
    {
        return Optional<Variable>::nullopt;
    }

    void Term::SetBinder(int i, int j, Variable& var)
    {
        assert(false);
    }

    Optional<Variable> Term::GetGVariable() const
    {
        return Optional<Variable>::nullopt;
    }

    Optional<Variable> Term::GetGVariable()
    {
        return static_cast<const Term*>(this)->GetGVariable();
    }

    bool Term::IsMap() const
    {
        return false;
    }

    void Term::MapKeys(std::set<Term*>& keys) const
    {
    }

    Optional<Term> Term::MapGetValue(Context& ctx, Term& key) const
    {
        return Optional<Term>::nullopt;
    }

    Term& Term::MapPutValue(Context& ctx, Term& key, Term& value)
    {
        throw std::runtime_error("Error: cannot put a value on a non-map term.");
    }


    bool Term::DeepEquals(const Term& rhs, std::unordered_map<Variable*, Variable*>& varmap) const
    {
        if (Symbol() != rhs.Symbol())
            return false;

        int i = 0;
        while (true)
        {
            Optional<Term> osub1 = Sub(i);
            Optional<Term> osub2 = rhs.Sub(i);

            // no more subs?
            if (!osub1 && !osub2)
                return true;

            if (osub1 && !osub2)
                return false;

            if (!osub1 && osub2)
                return false;

            // Update variable map if any binders
            int j = 0;
            std::vector<Variable*> shadowed;
            while (true)
            {
                Optional<Variable> obinder1 = Binder(i, j);
                Optional<Variable> obinder2 = rhs.Binder(i, j);

                if (!obinder1 && !obinder2)
                    break; // no more binders. Move on.
                if (obinder1 && !obinder2)
                    return false;
                if (!obinder1 && obinder2)
                    return false;

                shadowed.push_back(varmap[&obinder1.value()]);
                varmap[&obinder1.value()] = &obinder2.value();
                j++;
            }
            // deep equal on subs
            if (!osub1.value().DeepEquals(osub2.value(), varmap))
                return false;

            // Remove binders.
            j = 0;
            while (true)
            {
                Optional<Variable> obinder1 = Binder(i, j);
                Optional<Variable> obinder2 = rhs.Binder(i, j);

                if (!obinder1 && !obinder2)
                    break; // no more binders. Move on.

                varmap.erase(&obinder1.value());
                Variable* s = shadowed[j];
                if (s)
                    varmap[&obinder1.value()] = s;
                j++;
            }
            i++;
        }
        return true;
    }

    Term& Term::Substitute(tosca::Context& ctx, std::unordered_map<Variable*, Term*>& substitutes)
    {
        Optional<Variable> ovariable = GetGVariable();
        if (ovariable)
        {
            // Substitute variable

            auto substitute = substitutes.find(&ovariable.value());
            if (substitute != substitutes.end())
            {
                Release();
                substitute->second->AddRef();
                return *substitute->second;
            }

            return *this; // Transfer reference
        }

        // Substitute construction.
        Term& copy = Copy(ctx);
        int i = 0;
        while (true)
        {
            Optional<Term> osub = Sub(i); // peek at sub
            if (!osub)
                break;

            Optional<Variable> obinder = Binder(i, 0);
            if (!obinder)
            {
                // --  i'th subterm with no binders: just continue copying.
                if (substitutes.empty())
                {
                    // Nothing to substitute: just reference sub
                    Term& sub =  osub.value();
                    sub.AddRef();
                    copy.SetSub(i, sub);
                }
                else
                {
                    // Recursively substitute.
                    Term& sub = osub.value();
                    sub.AddRef();
                    copy.SetSub(i, sub.Substitute(ctx, substitutes));
                }
            }
            else
            {
                // -- i'th subterm with binders, second and following copy: add new binders to substitution!
                int j = 0;
                std::vector<Term*> shadowed;
                while (true)
                {
                    Optional<Variable> ooldbinder = Binder(i, j);
                    if (!ooldbinder)
                        break;

                    Variable& oldbinder = ooldbinder.value();
                    Variable& subbinder = oldbinder.Copy(ctx);

                    Term* s = substitutes[&oldbinder];
                    shadowed.push_back(s);
                    substitutes[&oldbinder] = &subbinder.GUse(ctx); // Acquire bound varuse reference
                    subbinder.AddRef();
                    copy.SetBinder(i, j, subbinder);
                    j++;
                }

                Term& sub = osub.value();
                sub.AddRef();
                copy.SetSub(i, sub.Substitute(ctx, substitutes));

                // Cleanup
                j = 0;
                while (true)
                {
                    Optional<Variable> ooldbinder = Binder(i, j);
                    if (!ooldbinder)
                        break;
                    
                    Variable& oldbinder = ooldbinder.value();
                    Term* olduse = substitutes[&oldbinder];
                    substitutes.erase(&oldbinder);
                    olduse->Release(); // Release bound varuse reference

                    Term* s = shadowed[j];
                    if (s)
                        substitutes[&oldbinder] = s;

                    j++;
                }
            }
            i ++;
        }
        Release();
        return copy;
    }

    Term& Term::Substitute2(tosca::Context& ctx, Term& term, std::unordered_map<Variable*, Term*>& substitutes)
	{
//    	std::cerr << " === start subst\n";
//    	for (auto it = substitutes.begin(); it != substitutes.end(); it ++)
//    	{
//    		std::cerr << it->first->Symbol();
//    		std::cerr << " -> ";
//    		PT(*it->second);
//    		std::cerr << "\n";
//
//    	}
//
//    	 std::cerr << "=== term\n";
//
//    	PT(term);
    	std::vector<Term*> stack; // Stack of term. Own a reference to each term.
    	std::vector<int> subidx;
    	std::vector<bool> shared;
    	std::vector<Term*> shadowed;

    	stack.push_back(&term);
    	subidx.push_back(0);
    	shared.push_back(term.refcount > 1);

    	Term* current;
    	Term* output = 0;
    	while (true)
    	{
    		if (output)
			{
    			// Going back up the tree. Update node on top of stack and move on to next sub (if any)
    			stack.pop_back(); // no release of term: this has been done when setting the output
    			subidx.pop_back();
    			shared.pop_back();

    			if (stack.empty())
    				break; // Reached the top

    			Term* parent = stack.back(); // Peek at parent
				int subi = subidx.back();

				if (&parent->Sub(subi).value() != output)
				{
					if (shared.back())
					{
						Term* newparent = &parent->Copy(ctx); // Make sure we don't overrides the other shared terms.

						// For now set sub and binders here.
						int i = 0;
						while(true)
						{
							auto osub = parent->Sub(i);
							if (!osub)
								break;

							osub.value().AddRef();
							newparent->SetSub(i, osub.value());

							int j = 0;
							while (true)
							{
								auto obinder = parent->Binder(i, j);
								if (!obinder)
									break;

								obinder.value().AddRef();
								newparent->SetBinder(i, j, obinder.value());
								j++;
							}
							i++;
						}
						stack.pop_back();
						parent->Release();

						parent = newparent;

						stack.push_back(parent); // transfer ref

						shared.pop_back();
						shared.push_back(false);
					}

					parent->SetSub(subi, *output); // Transfer output ref
				}
				else
					output->Release();

				// Restore shadowed binders.
				int j = 0;
				while (true)
				{
					Optional<Variable> obinder = parent->Binder(subi, j);
					if (!obinder)
						break;

					Term* s = shadowed.back();
					shadowed.pop_back();
					if (s)
						substitutes[&obinder.value()] = s;
					j++;
				}

				// Move on to next sibling or parent.
				Optional<Term> osibling = parent->Sub(subi + 1);
				if (osibling)
				{
					subi ++;
					// Make sure one of the binders does not shadowed one of the substituted binders,
					// in which case temporarily remove it from the substitution map.
					int j = 0;
					while (true)
					{
						Optional<Variable> obinder = parent->Binder(subi, j);
						if (!obinder)
							break;

						Variable& binder = obinder.value();
						auto s = substitutes.find(&binder);
						if (s != substitutes.end())
							shadowed.push_back(s->second);
						else
							shadowed.push_back(0);

						substitutes.erase(&binder);
						j++;
					}

					subidx.pop_back();
					subidx.push_back(subi);

					auto& sibling = osibling.value();
					stack.push_back(&sibling);
					subidx.push_back(0);
					shared.push_back(sibling.refcount > 1 || shared.back());
					sibling.AddRef(); // stack own a reference
					output = 0; // move down
				}
				else
				{
					parent->AddRef();
					output = parent; // move up with result.
				}
			}
			else
			{
	    		current = stack.back();

	    		// Going down the tree.
				if (substitutes.empty())
				{
					// Nothing to substitute so stop traversal.
					output = current; // Transfer ref
				}
				else
				{
					int subi = subidx.back();

					// -- subi'th subterm with maybe binders
					// If that's the case, make sure one of the binders does not shadowed one of the substituted binders,
					// in which case remove it temporarily from the substitution map.

					int j = 0;
					while (true)
					{
						Optional<Variable> obinder = current->Binder(subi, j);
						if (!obinder)
							break;

						Variable& binder = obinder.value();
						auto s = substitutes.find(&binder);
						if (s != substitutes.end())
							shadowed.push_back(s->second);
						else
							shadowed.push_back(0);

						substitutes.erase(&binder);
						j++;
					}

					Optional<Variable> ovariable = current->GetGVariable();
					if (ovariable)
					{
						auto substitute = substitutes.find(&ovariable.value());
						if (substitute != substitutes.end())
						{
							output = substitute->second;
							output->AddRef();
							current->Release();
						}
						else
							output = current; // Transfer ref
					}
					else if (current->IsMap())
					{
						output = &current->Substitute(ctx, substitutes);
					}
					else
					{
						Optional<Term> osub = current->Sub(subi); // peek at sub
						if (!osub)
						{
							// No more sub: move back up
							output = current; // Transfer ref
						}
						else
						{
							// --  Process on substituting first sub
							Term& sub = osub.value();
							stack.push_back(&sub);
							subidx.push_back(0);
							shared.push_back(osub.value().refcount > 1 || shared.back());
							sub.AddRef(); // Done after shared.

							assert(!output);
						}
					}
					current = 0;
				}
			}
    	}
//    	std::cerr << "===  result\n";
//       	PT(*output);
//       	std::cerr << "===\n";

       	return *output;
	}

    size_t Term::HashCode()
    {
        std::unordered_set<tosca::Variable*> var;
        return Hash(0, var);
    }

    size_t Term::Hash(size_t code, std::unordered_set<tosca::Variable*>& deBruijn)
    {
        Optional<Variable> ovar = GetGVariable();
        if (ovar)
        {
            auto search = deBruijn.find(&ovar.value());
            if (search != deBruijn.end())
                return code * 19ll;

            return code ^ std::hash<void*>{}(this);
        }

        int i = 0;
        while (true)
        {
            Optional<Term> osub = Sub(i); // peek at sub
            if (!osub)
                break;

            int j = 0;
            while (true)
            {
                Optional<Variable> obinder = Binder(i, j);
                if (!obinder)
                    break;

                deBruijn.insert(&obinder.value());
                j++;
            }

            code ^= osub.value().Hash(code, deBruijn) ^ (1<<i);

            j = 0;
            while (true)
            {
                Optional<Variable> obinder = Binder(i, j);
                if (!obinder)
                    break;

                deBruijn.erase(&obinder.value());
                j++;
            }
            i++;
        }

        return code ^ std::hash<std::string>{}(Symbol());

    }

    Variable& Term::MakeFree(Context& ctx, int i, const std::string& hint)
    {
        throw std::out_of_range("Internal Error: index out of range.");
    }

    Variable& Term::MakeBound(Context& ctx, int i, int j,  const std::string& hint)
    {
        throw std::out_of_range("Internal Error: index out of range.");
    }

    Term& Term::MakeSubTerm(Context& ctx, int i, const std::string& symbol)
    {
        throw std::out_of_range("Internal Error: index out of range.");
    }

    Variable& Term::MakeVariable(Context& ctx,  const std::string& hint)
    {
        throw std::runtime_error("Internal error: enumeration does not allow variables.");
    }

    Term& Term::MakeTerm(Context& ctx, const std::string& symbol)
    {
        throw std::runtime_error("Internal error: enumeration does not allow associated values.");
    }

    void Term::Print(IOWrapper& out, int count, bool indent)
    {
        // TODO: support for UTF-8
        out.Write('\n');
        if (indent)
            out.Indent(count);
        out.Write(Symbol());

        // Print subs
        int i = 0;
        Optional<Term> osub = Sub(i);
        if (osub)
        {
            out.Write('(');
            while (osub)
            {
                if (i > 0)
                    out.Write(',');

                int j = 0;
                Optional<Variable> obinder = Binder(i, j);
                while (obinder)
                {
                    out.Write((j == 0 ? '[' : ' '));
                    out.Write(obinder.value().Symbol());
                    obinder = Binder(i, ++j);

                }
                if (Binder(i, 0))
                    out.Write("]->");

                osub.value().Print(out, count + 2, indent);
                osub = Sub(++i);
            }
            out.Write(")");
        }
    }

    // --- Variable Use
    VariableUse::VariableUse(Variable& v) : var(v)
    {
    	var.uses++;
    }

    VariableUse::~VariableUse()
    {
    	var.Release();
    }

    Optional<Variable> VariableUse::GetGVariable() const
    {
        return make_optional<Variable>(var);
    }

    // --- Variable

    Variable::Variable(std::string n) : name(std::move(n)), uses(1)
    {
    }

    Term& Variable::GUse(Context& ctx)
    {
        throw std::runtime_error("Internal Error: cannot create untyped variable use.");
    }

    const std::string& Variable::Symbol() const
    {
        return name;
    }

    Variable& Variable::Copy(Context& ctx) const
    {
        throw new std::runtime_error("Internal error: cannot create untyped variable");
    }

    // --- Variable Use

    bool VariableUse::DeepEquals(const Term& rhs, std::unordered_map<Variable*, Variable*>& varmap) const
    {
        Optional<Variable> ovar2 = rhs.GetGVariable();
        if (ovar2)
        {
            auto search = varmap.find(&var);
            return search == varmap.end() ? &ovar2.value() == &var : search->second == &var;
        }
        return false;
    }

    size_t VariableUse::Hash(size_t code, std::unordered_set<tosca::Variable*>& deBruijn)
    {
        auto search = deBruijn.find(&var);
        if (search != deBruijn.end())
            return code * 19ll;

        return code ^ std::hash<void*>{}(this); // Free variable.

    }

    // --- String

    StringTerm::StringTerm()
    {
    }

    StringTerm::~StringTerm()
    {
    }

    const std::string& StringTerm::Unbox()  const
    {
       throw std::runtime_error("Fatal error: cannot access unevaluated string value.");
    }

    const std::string& StringTerm::Symbol() const
    {
        return Unbox();
    }
    
    Optional<_CStringTermVar> StringTerm::GetVariable() const
    {
        return Optional<_CStringTermVar>::nullopt;
    }

    Variable& StringTerm::MakeVariable(Context& ctx, const std::string& hint)
    {
        return varStringTerm(ctx, hint);
    }

    Term& StringTerm::MakeTerm(Context& ctx, const std::string& symbol)
    {
        return newStringTerm(ctx, symbol);
    }

    size_t StringTerm::Hash(size_t code, std::unordered_set<tosca::Variable*>& deBruijn)
    {
        return std::hash<std::string>{}(Unbox());
    }

    void StringTerm::Print(IOWrapper& out, int count, bool indent)
    {
        out.Write("\"");
        out.Write(makeEscaped(Unbox()));
        out.Write("\"");
    }

    _CStringTermVar::_CStringTermVar(std::string name) : Variable(name)
    {
    }

    StringTerm& _CStringTermVar::Use(Context& ctx)
    {
    	this->AddRef();
        return *(new (ctx) _CStringTermVarUse(*this));
    }

    Term& _CStringTermVar::GUse(Context& ctx)
    {
        return Use(ctx);
    }

    _CStringTermVarUse::_CStringTermVarUse(_CStringTermVar& v) : VariableUse::VariableUse(v)
    {
    }
    
    Optional<_CStringTermVar> _CStringTermVarUse::GetVariable() const
    {
        return make_optional<_CStringTermVar>(dynamic_cast<_CStringTermVar&>(VariableUse::GetGVariable().value()));
    }

    Optional<tosca::Variable> _CStringTermVarUse::GetGVariable() const
    {
    	return VariableUse::GetGVariable();
    }

    const std::string& _CStringTermVarUse::Unbox() const
    {
        return var.Symbol();
    }
    
    _CStringTerm::_CStringTerm(const std::string&& val) : value(val)
    {
    }
    
    _CStringTerm::_CStringTerm(const std::string& val) : value(val)
    {
    }

    _CStringTerm::~_CStringTerm()
    {}


    Term& _CStringTerm::Copy(Context& ctx)
    {
        AddRef();
        return *this;
    }

    const std::string& _CStringTerm::Unbox() const
    {
        return value;
    }

    // --- Numeric

    DoubleTerm::~DoubleTerm()
    {
    }

    size_t DoubleTerm::Hash(size_t code, std::unordered_set<tosca::Variable*>& deBruijn)
    {
        return std::hash<std::string>{}(Symbol());
    }
    
    Optional<_CDoubleTermVar> DoubleTerm::GetVariable() const
    {
        return Optional<_CDoubleTermVar>::nullopt;
    }

    Variable& DoubleTerm::MakeVariable(Context& ctx, const std::string& hint)
    {
        return varDoubleTerm(ctx, hint);
    }


    Term& DoubleTerm::MakeTerm(Context& ctx, const std::string& symbol)
    {
        double value = std::stod(symbol);
        return newDoubleTerm(ctx, value);
    }

    void DoubleTerm::Print(IOWrapper& out, int count, bool indent)
    {
        out.Write(Symbol());
    }

    _CDoubleTermVarUse::_CDoubleTermVarUse(_CDoubleTermVar& v) : VariableUse::VariableUse(v)
    {
    }

    Optional<_CDoubleTermVar> _CDoubleTermVarUse::GetVariable() const
    {
        return make_optional<_CDoubleTermVar>(dynamic_cast<_CDoubleTermVar&>(VariableUse::GetGVariable().value()));
    }

    Optional<tosca::Variable> _CDoubleTermVarUse::GetGVariable() const
    {
    	return VariableUse::GetGVariable();
    }

    _CDoubleTermVar::_CDoubleTermVar(std::string name) : Variable(std::move(name))
    {
    }

    DoubleTerm& _CDoubleTermVar::Use(Context& ctx)
    {
    	this->AddRef();
        return *(new (ctx) _CDoubleTermVarUse(*this));
    }

    Term& _CDoubleTermVar::GUse(Context& ctx)
    {
        return Use(ctx);
    }

    _CDoubleTerm::_CDoubleTerm(double val) : value(val), str(double15ToString(val))
    {
    }

    Term& _CDoubleTerm::Copy(Context& ctx)
    {
        AddRef();
        return *this;
    }

    double _CDoubleTerm::Unbox() const
    {
        return value;
    }

    const std::string& _CDoubleTerm::Symbol() const
    {
        return str;
    }

}

using namespace tosca;

StringTerm& newStringTerm(tosca::Context& ctx, std::string&& val)
{
    return *(new (ctx) _CStringTerm(val));
}

StringTerm& newStringTerm(tosca::Context& ctx, const std::string& val)
{
    return *(new (ctx) _CStringTerm(val));
}

_CStringTermVar& varStringTerm(tosca::Context& ctx, const std::string& hint)
{
    return *(new (ctx) _CStringTermVar(ctx.MakeGlobalName(hint)));
}

DoubleTerm& newDoubleTerm(tosca::Context& ctx, double val)
{
    return *(new (ctx) _CDoubleTerm(val));
}

_CDoubleTermVar& varDoubleTerm(tosca::Context& ctx, const std::string& hint)
{
    return *(new (ctx) _CDoubleTermVar(ctx.MakeGlobalName(hint)));
}
