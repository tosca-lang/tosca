// Copyright (c) 2016 IBM Corporation.
#include <iostream>

#include "term.h"
#include "compat.h"
#include "ts.h"

namespace tosca {

    // --- Ref

    Ref::Ref(): refcount(1)
    {
    }

    Ref::~Ref()
    {
        //std::cout << "delete ref\n";
        assert(refcount == 0);
    }

    void Ref::AddRef()
    {
        assert(refcount > 0);
        refcount++;
    }

    void Ref::Release()
    {
        assert(refcount > 0);
        refcount--;
        if (refcount == 0)
          delete this;
    }

    // --- Term


    Term::Term() : Ref() {}

    Term::~Term() {}

    const std::string Term::Symbol() const
    {
       auto v = this->GetGVariable();
       if (v)
         return v.value().Symbol();

       return "";
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

                varmap.insert({&obinder1.value(), &obinder2.value()});
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
                while (true)
                {
                    Optional<Variable> ooldbinder = Binder(i, j);
                    if (!ooldbinder)
                        break;

                    Variable& oldbinder = ooldbinder.value();
                    Variable& subbinder = oldbinder.Copy(ctx);

                    substitutes.insert({&oldbinder, &subbinder.GUse()});
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

                    substitutes.erase(&ooldbinder.value());
                    j++;
                }
            }
            i ++;
        }
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

    // --- Variable Use

    Optional<Variable> VariableUse::GetGVariable() const
    {
        return make_optional<Variable>(var);
    }

    // --- Variable

    Variable::Variable(std::string& n) : name(*new std::string(n)), uses(1)
    {
    }

    Term& Variable::GUse()
    {
        throw std::runtime_error("Internal Error: cannot create untyped variable use.");
    }

    const std::string Variable::Symbol() const
    {
        return name; // copy.
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

    const std::string StringTerm::Symbol() const
    {
        return Unbox();
    }

    size_t StringTerm::Hash(size_t code, std::unordered_set<tosca::Variable*>& deBruijn)
    {
        return std::hash<std::string>{}(Unbox());
    }

    CStringTermVar::CStringTermVar(std::string& name) : Variable(name)
    {
    }

    StringTerm& CStringTermVar::Use()
    {
        return *(new CStringTermVarUse(*this));
    }

    Term& CStringTermVar::GUse()
    {
        return Use();
    }

    CStringTermVarUse::CStringTermVarUse(CStringTermVar& v) : VariableUse::VariableUse(v)
    {
    }

    const std::string& CStringTermVarUse::Unbox() const
    {
      return var.Symbol();
    }

    CStringTerm::CStringTerm(const std::string& val) : value(*new std::string(val))
    {
    }

    CStringTerm::~CStringTerm()
    {
        // delete &value;
    }


    Term& CStringTerm::Copy(Context& ctx)
    {
        AddRef();
        return *this;
    }

    const std::string& CStringTerm::Unbox() const
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

    CDoubleTermVarUse::CDoubleTermVarUse(CDoubleTermVar& v) : VariableUse::VariableUse(v)
    {
    }


    CDoubleTermVar::CDoubleTermVar(std::string& name) : Variable(name)
    {
    }

    DoubleTerm& CDoubleTermVar::Use()
    {
        return *(new CDoubleTermVarUse(*this));
    }

    Term& CDoubleTermVar::GUse()
    {
        return Use();
    }

    CDoubleTerm::CDoubleTerm(double val) : value(val)
    {
    }

    Term& CDoubleTerm::Copy(Context& ctx)
    {
        AddRef();
        return *this;
    }

    double CDoubleTerm::Unbox() const
    {
        return value;
    }

    const std::string CDoubleTerm::Symbol() const
    {
        return std::to_string((long double) Unbox());
    }

}

using namespace tosca;

StringTerm& newStringTerm(std::string&& val)
{
    return *(new CStringTerm(*(new std::string(val))));
}

StringTerm& newStringTerm(const std::string& val)
{
    return *(new CStringTerm(val));
}

CStringTermVar& varStringTerm(tosca::Context& ctx, const std::string& hint)
{
    return *(new CStringTermVar(ctx.MakeGlobalName(hint)));
}


DoubleTerm& newDoubleTerm(double val)
{
    return *(new CDoubleTerm(val));
}

CDoubleTermVar& varDoubleTerm(tosca::Context& ctx, const std::string& hint)
{
    return *(new CDoubleTermVar(ctx.MakeGlobalName(hint)));
}
