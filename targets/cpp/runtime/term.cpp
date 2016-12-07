// Copyright (c) 2016 IBM Corporation.
#include <iostream>
#include <vector>
#include "term.h"
#include "compat.h"
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

    Ref::~Ref()
    {
        //std::cout << "delete ref\n";
        //assert(refcount == 0); // refcount not zero when term allocated on stack
    }

    void Ref::AddRef()
    {
        assert(Alive(this));

        refcount++;
        if (TRACK_REFS && (track || track_allocated == allocated[this]))
          std::cerr << "\n[" << allocated[this] << "] add ref " << refcount ;
    }

    void Ref::Release()
    {
        assert(Alive(this));
        refcount--;

        if (TRACK_REFS && (track || track_allocated == allocated[this]))
          std::cerr << "\n[" << allocated[this] << "] released " << refcount;

        if (refcount == 0)
          delete this;
    }

    void Ref::Track(long id)
    {
        track_allocated = id;
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

    void Term::MapPutValue(Context& ctx, Term& key, Term& value)
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
        return Optional<_CStringTermVar::_CStringTermVar>::nullopt;
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
        out.Write(Unbox());
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
        return Optional<_CDoubleTermVar::_CDoubleTermVar>::nullopt;
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

    _CDoubleTerm::_CDoubleTerm(double val) : value(val), str(std::to_string((long double) val))
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
