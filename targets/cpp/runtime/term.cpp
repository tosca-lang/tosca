// Copyright (c) 2016 IBM Corporation.
#include <iostream>

#include "term.h"
#include "compat.h"
#include "ts.h"

namespace tosca {

    // --- Ref

    Ref::Ref() :
    refcount(1)
    {
    }

    Ref::~Ref()
    {
        std::cout << "delete ref\n";
        // assert(refcount == 0);
    }

    void Ref::AddRef()
    {
        // assert(refcount > 0);
        refcount++;
    }

    void Ref::Release()
    {
        //assert(refcount > 0);
        refcount--;
        //if (refcount == 0)
        //  delete this;
    }

    // --- Term


    Term::Term() : Ref() {}

    Term::~Term(){}

    std::string& Term::Symbol() const
    {
       auto v = this->GetGVariable();
       if (v)
         return v.value().Symbol();

       return *(new std::string(""));
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

    Optional<Variable> Term::Binder(int i, int j)
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
    
    bool Term::operator==(const Term& rhs) {
        std::cout << "DEEP EQUAL NOT IMPLEMENTED";
        return true;
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

    std::string& Variable::Symbol() const
    {
        return name;
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

    CStringTerm::CStringTerm(const std::string& val) : value(*new std::string(val))
    {
    }

    CStringTerm::~CStringTerm()
    {
        // delete &value;
    }

    Term CStringTerm::Copy(Context& ctx)
    {
        Ref();
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

    Term CDoubleTerm::Copy(Context& ctx)
    {
        Ref();
        return *this;
    }

    double CDoubleTerm::Unbox() const
    {
        return value;
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
