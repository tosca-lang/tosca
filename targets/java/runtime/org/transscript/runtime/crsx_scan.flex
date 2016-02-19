/* Copyright (c) 2012-2014 IBM Corporation. */
// $Id: crsx_scan.flex,v 3.1 2013/06/19 19:46:46 villardl Exp $
package org.crsx.runtime;
 
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayDeque;

///////////////////////////////////////////////////////////////////////////////////////////////////
// CRSX JAVA SCANNER 
///////////////////////////////////////////////////////////////////////////////////////////////////
 

%%

%class CrsxLexer
%unicode
%line
%column 
%final
%public
%int

%{

    enum Tag {LINK_UNDEFINED_TAG, LINK_BASE_TAG, LINK_CONSTRUCTION_TAG, LINK_NAMED_PROPERTY_TAG, LINK_VARIABLE_PROPERTY_TAG, LINK_STRING_TAG, LINK_FIRST_BINDER_TAG, LINK_FOLLOWING_BINDER_TAG} ;

    /** Context */
	private Context context;
	
    /** Sink stack */
	private ArrayDeque<Sink> sinkStack = new ArrayDeque<Sink>();

    /** Tag stack */
	private ArrayDeque<Tag> tagStack = new ArrayDeque<Tag>();

    /** 
     * Data stack 
     * ConstructionDescriptor for LINK_CONSTRUCTION_TAG 
     * String for LINK_NAMED_PROPERTY_TAG and LINK_STRING_TAG 
     * Variable for LINK_VARIABLE_PROPERTY_TAG and LINK_*_BINDER_TAG 
     */
	private ArrayDeque<Object> dataStack = new ArrayDeque<Object>();
 
    /** Variables in scope for this constructor */
    private ArrayDeque<Variable[]> variableStack  = new ArrayDeque<Variable[]>();
 	
    /** Special variable null value */
    private Variable[] novariable = new Variable[0];

    /** Special data value */
    private Object nodata = new Object();

	// Push a state description of a particular kind and send any initialization events.
	final private void makeBase(Sink sink)
	{
	    sinkStack.push(sink);
	    tagStack.push(Tag.LINK_BASE_TAG);
	    dataStack.push(nodata);
	  	variableStack.push(novariable);
	  	context = sink.context();   
	}

	final private void pushConstruction(ConstructionDescriptor descriptor)
	{
		sinkStack.push(sinkStack.peek());
		tagStack.push(Tag.LINK_CONSTRUCTION_TAG);
	 	dataStack.push(descriptor);
	    variableStack.push(novariable);
	    
	    sinkStack.peek().start(descriptor);
	}

	final private void pushNamedProperty(String name)
	{
		sinkStack.push(new BufferSink(context));
		tagStack.push(Tag.LINK_NAMED_PROPERTY_TAG);
	    dataStack.push(name);
	    variableStack.push(novariable);
	}

	final private void pushVariableProperty(String variableName)
	{
		sinkStack.push(new BufferSink(context));
	    tagStack.push(Tag.LINK_VARIABLE_PROPERTY_TAG);
	    dataStack.push(lookupName(variableName));
	    variableStack.push(novariable);
	}

	final private void pushString(String string)
	{
		sinkStack.push(sinkStack.peek());
		tagStack.push(Tag.LINK_STRING_TAG);
	    dataStack.push(string);
	    variableStack.push(novariable);
	}

	final private void pushFirstBinder(String name)
	{
	   sinkStack.push(sinkStack.peek());
       tagStack.push(Tag.LINK_FIRST_BINDER_TAG);
	    
	   Variable variable = new Variable(name);
	   dataStack.push(variable);
	    
	   variableStack.push(novariable); 
	}

	final private void pushFollowingBinder(String name)
	{
	   sinkStack.push(sinkStack.peek());
       tagStack.push(Tag.LINK_FOLLOWING_BINDER_TAG); 
	    
	  final Variable variable = new Variable(name);
	  dataStack.push(variable);
	  
	  variableStack.add(novariable);  
	}

	// Pop a state of a particular kind including sending any pending events.
	final private void popBase()
	{
	}

	final private void popConstruction()
	{
		assert tagStack.peek() == Tag.LINK_CONSTRUCTION_TAG;
	    //assert dataStack.peek() instanceof ConstructionDescriptor;
	    
	    sinkStack.peek().end();
	    
	 	sinkStack.pop();
	    tagStack.pop();
	  	dataStack.pop();
	  	variableStack.pop();
	}

	final private void popProperty()
	{
		// Pop
		final Sink sink = sinkStack.pop();
	    final Tag tag = tagStack.pop();
	  	final Object data = dataStack.pop();
	  	variableStack.pop(); 
	
	    //
	    switch (tag)
	    {
	    case LINK_NAMED_PROPERTY_TAG :
		{
		    String name = (String) data;
		    Term term = ((BufferSink) sink).term(); 
		    sinkStack.peek().propertyNamed(name, term);
		    break;
		}
	    case LINK_VARIABLE_PROPERTY_TAG :
		{
	        Variable variable = (Variable) data;
		    Term term = ((BufferSink) sink).term(); 
		    sinkStack.peek().propertyVariable(variable, term);
		    break;
	    }
	    default :
	        assert false : "state->tag != LINK_*_PROPERTY_TAG";
	    }
	}

	final private void popString()
	{
	  	assert Tag.LINK_STRING_TAG ==  tagStack.peek();
	
		// Pop
	    sinkStack.pop();
	    tagStack.pop();
	  	dataStack.pop();
	  	variableStack.pop(); 
	}

	//  Send binders. Only called when there is at least one binder.
	final private Variable[] popBinders() 
	{
	    /* First count the number of binders. */
	    int size = 0; 
	    for (Tag tag : tagStack)
	    { 
	    	if (tag != Tag.LINK_FOLLOWING_BINDER_TAG && tag !=  Tag.LINK_FIRST_BINDER_TAG)
	    		break;
	    	size ++;
	    }
	    
	    /* Extract binder variables and pop the stack */
	    Variable[] binders = new Variable[size];
	    for (int i = size-1; i >= 0; --i)
	    {
	        assert ((i>0 && tagStack.peek() == Tag.LINK_FOLLOWING_BINDER_TAG) || (i==0 && tagStack.peek() == Tag.LINK_FIRST_BINDER_TAG));
	        binders[i] = (Variable) dataStack.peek();
	        
	        // Pop
	    	sinkStack.pop();
	    	tagStack.pop();
	  		dataStack.pop();
	  		variableStack.pop();
	    }
	    
	    topSink().binds(binders);
	   
	    return binders; 
	}

	// Retrieve the stored value in the top state.
	final private String topString()  // use before popString()
	{
	   return (String) dataStack.peek();
	}

	final private Sink topSink()
	{
	  return sinkStack.peek();
	}

	final private void setNames(Variable[] names)
	{
	    variableStack.pop();
	    variableStack.push(names);
	}

	// Find variable or allocate as fresh if previously not seen.
	final private Variable lookupName(String name)
	{
	    // First search for bound variable.
	    
	    for (Variable[] variables: variableStack)
		{ 
	        for (int i = 0; i < variables.length; i ++)
	            if (variables[i].name().equals(name))
	                return variables[i];
	    }
	     
	    // Allocate as fresh variable.
	    final Variable variable = new Variable(name);
	    
	    setNames(new Variable[] { variable });
	    
	    return variable;
	}	
 
	final private ConstructionDescriptor lookupDescriptor(String name)
	{
	   return context.lookupDescriptor(name); 
	}
 
	// Helper to remove quotes.
	final private String unquote(String quoted)
	{
		char q = quoted.charAt(0);
		if (q != '"' && q != '\'')
			return quoted;

		char[] unquoted = new char[quoted.length()];
		char c;
		int j = 0;
		for (int i = 1; i < quoted.length() - 1; i++)
		{
			c = quoted.charAt(i);
			if (c == q) // shouldn't be needed (unless occurring in middle of quoted)
			{
				// ignore...
			}
			else if (c == '\\')
			{
				i ++;
				c = quoted.charAt(i);
				switch (c)
				{
					case '0' :
					case '1' :
					case '2' :
					case '3' :
					case '4' :
					case '5' :
					case '6' :
					case '7' : {
						int n = 0, m = 0;
						do
						{
							n = (n << 3) + (c - '0');
							i++;
							c = quoted.charAt(i);
							++m;
						}
						while (m < 3 && '0' <= c && c <= '7');
						unquoted[j++] = (char) n;
					}
						break;
					//  case 'a': unquoted[j++] = '\a'; break; Bell not supported
					case 'b' :
						unquoted[j++] = '\b';
						break;
					case 'f' :
						unquoted[j++] = '\f';
						break;
					case 'n' :
						unquoted[j++] = '\n';
						break;
					case 'r' :
						unquoted[j++] = '\r';
						break;
					default :
						unquoted[j++] = c;
				}
			}
			else
			{
				unquoted[j++] = c;
			}
		}

		return new String(unquoted);
	}

	/* Main entry points. */
	final public int scanTerm(Sink sink, Reader input) throws IOException
	{
		yyreset(input);
		makeBase(sink);
		yybegin(Before);
		int result = yylex();
		popBase();

		return result;
	}

	final public int loadTerm(Sink sink, String name) throws IOException
	{
		FileReader reader = new FileReader(name);
		scanTerm(sink, reader);

		return 1;
	}


// Inner classes


static class VariableNameMapLink
{
   	VariableNameMapLink link;
    String key;
    Variable value;
    
    VariableNameMapLink(VariableNameMapLink link, String key, Variable value)
    {
     	this.link = link;
     	this.key = key;
     	this.value = value;
    }
};

%}


/* DEFINITIONS. */

/* White space. */
SPACE_T = [\s]

/* Constructor. */
CONSTRUCTOR_T =  ([[:uppercase:]$][[:jletterdigit:]_$-]*|['']([^''\\]|\\[0-7][0-7]?[0-7]?|\\[^0-7\n])*[''])

/* Literal. */
LITERAL_T =  ([""]([^""\\]|\\[0-7][0-7]?[0-7]?|\\[^0-7\n])*[""]|[0-9+-][0-9]*([.][0-9]+)?([Ee][+-]?[0-9]+)?)

/* Variable name (includes Unicode for �). */
VARIABLE_T =  ([[:lowercase:]]([[:jletterdigit:]_-]|"\302\271")*)

/* STATES. */

%x Before BeforeWithBinders AfterSimple BeforeKey AfterProperties AfterConstructor BeforeArgument AfterArguments AfterKey AfterFirstVariable AfterBinder
 
/* RULES. */

/*
Here is the grammar with the state established by each token:

<Before,BeforeWithBinders,BeforeArgument>
t  ::=
        V <AfterSimple,AfterFirstVariable>
     |
        L <AfterSimple>
     |
        ( '{' <BeforeKey>
              ps? '}' <AfterProperties>
                      )? C <AfterConstructor>
                           ( '[' <BeforeArgument>
                                 as ']' <AfterArguments>
                                        )? <AfterConstructor,AfterArguments>

<BeforeKey>
ps  ::=  p ( ';' <BeforeKey>
                 p )* <AfterSimple,AfterFirstVariable,AfterConstructor,AfterArguments>

<BeforeKey>
p  ::=
        V <AfterKey>
          ':' <Before>
              t <AfterSimple,AfterFirstVariable,AfterConstructor,AfterArguments>
     |
        L <AfterKey>
          ':' <Before>
              t <AfterSimple,AfterFirstVariable,AfterConstructor,AfterArguments>

<BeforeArgument>
as  ::=  ( a <AfterSimple,AfterFirstVariable,AfterArgument,AfterFirstVariable>
             ( ',' <BeforeArgument>
                   a )* )? <AfterSimple,AfterFirstVariable,AfterArgument,AfterFirstVariable>

<BeforeArgument>
a  ::=
        ( V <AfterFirstVariable>
            ( V <AfterBinder>
                )* '.' <BeforeWithBinders>
                       )? t <AfterSimple,AfterFirstVariable,AfterArgument,AfterFirstVariable>
*/

%%

    // INITIALIZE.
//    StateLink state = yyextra;
//    yybegin(Before);

    /* V as top level t or property value t. */
<Before>{VARIABLE_T}             { topSink().use(lookupName(yytext())); yybegin(AfterSimple); }
    /* V as t in a without binders or as first binder in a. */
<BeforeArgument>{VARIABLE_T}     { pushString(yytext()); yybegin(AfterFirstVariable); }
    /* V as t in a after binders. */
<BeforeWithBinders>{VARIABLE_T}  { Variable variable = lookupName(yytext()); popBinders(); topSink().use(variable); yybegin(AfterSimple); }
    /* V as key in p. */
<BeforeKey>{VARIABLE_T}          { pushVariableProperty(yytext()); yybegin(AfterKey); }
    /* V as second binder in a. */
<AfterFirstVariable>{VARIABLE_T} { String firstName = topString(); popString(); pushFirstBinder(firstName); pushFollowingBinder(yytext()); yybegin(AfterBinder); }
    /* V as third or subsequent binder in a. */
<AfterBinder>{VARIABLE_T}        { pushFollowingBinder(yytext()); }

    /* L as top level t or property value t. */
<Before>{LITERAL_T}            { topSink().literal(unquote(yytext())); yybegin(AfterSimple); }
    /* L as t in a without binders. */
<BeforeArgument>{LITERAL_T}    { topSink().literal(unquote(yytext())); yybegin(AfterSimple); }
    /* L as t in a after binders. */
<BeforeWithBinders>{LITERAL_T} { popBinders(); topSink().literal(unquote(yytext())); yybegin(AfterSimple); }
    /* L as key in p. */
<BeforeKey>{LITERAL_T}         { pushNamedProperty(unquote(yytext())); yybegin(AfterKey); }
    /* L in illegal places. */
<AfterFirstVariable,AfterBinder>{LITERAL_T} { throw new Error("Unexpected " + yytext() + " literal where binder expected!\n"); }

    /* C starts or is top level t or property value t. */
<Before>{CONSTRUCTOR_T}             { pushConstruction(lookupDescriptor(unquote(yytext()))); yybegin(AfterConstructor); }
    /* C starts or is t in a without binders. */
<BeforeArgument>{CONSTRUCTOR_T}     { pushConstruction(lookupDescriptor(unquote(yytext()))); yybegin(AfterConstructor); }
    /* C starts or is t in a after binders. */
<BeforeWithBinders>{CONSTRUCTOR_T}  { Variable[] scope = popBinders(); pushConstruction(lookupDescriptor(unquote(yytext()))); yybegin(AfterConstructor); setNames(scope); }
    /* C starts part of t after a property set. */
<AfterProperties>{CONSTRUCTOR_T}    { pushConstruction(lookupDescriptor(unquote(yytext()))); yybegin(AfterConstructor); }
    /* C in illegal places. */
<AfterFirstVariable,AfterBinder>{CONSTRUCTOR_T} { throw new Error("Unexpected constructor where binder expected!\n"); }

    /* "{" starts top level t or property value t. */
<Before>"{"            { yybegin(BeforeKey); }
    /* '{' starts t in a without binders. */
<BeforeArgument>"{"    { yybegin(BeforeKey); }
    /* '{' starts t in a after binders. */
<BeforeWithBinders>"{" { popBinders(); yybegin(BeforeKey); }
    /* "{" in illegal places. */
<BeforeKey>"{" { throw new Error("Unexpected '{' where property key expected!\n"); }
<AfterFirstVariable,AfterBinder>"{" { throw new Error("Unexpected '{' where binder expected!\n"); }

    /* ":" */
<AfterKey>":" { yybegin(Before); }
    /* ":" errors */
<Before,BeforeArgument,BeforeWithBinders,AfterFirstVariable,AfterBinder,AfterConstructor,AfterArguments>":" { throw new Error("Expected ':' after property key!\n"); }

    /* ";" */
<AfterSimple>";"		             { popProperty(); yybegin(BeforeKey); }
    /* ";" */
<AfterConstructor,AfterArguments>";" { popConstruction(); popProperty(); yybegin(BeforeKey); }
    /* ";" */
<Before,BeforeArgument,BeforeWithBinders,AfterFirstVariable,AfterBinder>";" { throw new Error("';' only allowed after finished property mapping!\n"); }

    /* "}" */
<AfterSimple>"}"                     { popProperty(); yybegin(AfterProperties); }
<AfterConstructor,AfterArguments>"}" { popConstruction(); popProperty(); yybegin(AfterProperties); }
<Before,BeforeArgument,BeforeWithBinders,AfterFirstVariable,AfterBinder>"}" { throw new Error("'}' only allowed after finished property mapping!\n"); }

    /* "[" */
<AfterConstructor>"[" { yybegin(BeforeArgument); }
<Before,BeforeArgument,BeforeWithBinders,AfterFirstVariable,AfterBinder,AfterSimple,AfterArguments>"[" { throw new Error("'[' only allowed after constructor!\n"); }

    /* "," */
<AfterSimple>","                     { yybegin(BeforeArgument); }
<AfterConstructor,AfterArguments>"," { popConstruction(); yybegin(BeforeArgument); }
<AfterFirstVariable>","              { topSink().use(lookupName(topString())); popString(); yybegin(BeforeArgument); }

    /* "]" */
<AfterSimple>"]"                     { yybegin(AfterArguments); }
<AfterConstructor,AfterArguments>"]" { popConstruction(); yybegin(AfterArguments); }
<AfterFirstVariable>"]"              { topSink().use(lookupName(topString())); popString(); yybegin(AfterArguments); }

    /* "." */
<AfterFirstVariable>"." { String firstName = topString(); popString(); pushFirstBinder(firstName); yybegin(BeforeWithBinders); }
<AfterBinder>"."        { yybegin(BeforeWithBinders); }

    /* EOF */
<AfterSimple><<EOF>>                     { yyclose(); return YYEOF; }
<AfterConstructor,AfterArguments><<EOF>> { popConstruction(); yyclose(); return YYEOF; }
<AfterFirstVariable><<EOF>>              { topSink().use(lookupName(topString())); popString(); yyclose(); return YYEOF;}

    /* Skip spaces. */
<Before,BeforeArgument,BeforeWithBinders,AfterFirstVariable,AfterBinder,AfterConstructor,AfterArguments>{SPACE_T} {}
<Before,BeforeArgument,BeforeWithBinders,AfterFirstVariable,AfterBinder,AfterConstructor,AfterArguments>"//".*"\n" {}

    /* Everything else is an error... */
<Before,BeforeArgument,BeforeWithBinders,AfterFirstVariable,AfterBinder,AfterConstructor,AfterArguments>. { throw new Error("Illegal character <"+ yytext()+ ">"); }

