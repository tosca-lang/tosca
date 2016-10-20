
 
/** Generated File */

import java.util.function.Function;
import org.transscript.runtime.Context;
import org.transscript.runtime.Term;
import org.transscript.runtime.Variable;
import org.transscript.runtime.VariableUse;
import org.transscript.runtime.LazyTerm;
import org.transscript.runtime.StringTerm;
import org.transscript.runtime.StringTerm.VarStringTerm;
import org.transscript.runtime.DoubleTerm;
import org.transscript.runtime.DoubleTerm.VarDoubleTerm;
import org.transscript.runtime.MapTerm;
import static org.transscript.runtime.Term.unbox;
import static org.transscript.runtime.Term.force;
import static org.transscript.runtime.Term.subst;
import static org.transscript.runtime.Functions.*;
import static org.transscript.runtime.StringTerm.lazyStringTerm;
import static org.transscript.runtime.StringTerm.lazyStringTermMaker;
import static org.transscript.runtime.StringTerm.stringTerm;
import static org.transscript.runtime.StringTerm.varStringTerm;
import static org.transscript.runtime.DoubleTerm.lazyDoubleTerm;
import static org.transscript.runtime.DoubleTerm.lazyDoubleTermMaker;
import static org.transscript.runtime.DoubleTerm.doubleTerm;
import static org.transscript.runtime.MapTerm.lazyMapTerm;
import static org.transscript.runtime.MapTerm.lazyMapTermMaker;
import static org.transscript.runtime.LazyTerm.thunk;


import static org.transscript.compiler.std.Listdef.*;
import static org.transscript.compiler.std.Mapdef.*;
import static org.transscript.compiler.std.Core.*;
@SuppressWarnings("unused")
public class Hello {
  /* Typed enumerations */
  
  final public static  DoubleTerm Main(Context context
    ) {
        return Trace(context, lazyDoubleTermMaker(), 
      stringTerm("Hello World!"), thunk(c1 -> 
      doubleTerm(0)));
        
      }
  
    private static boolean initialized = false;
    public static void init(Context context) {
      if (!initialized) {
        initialized = true;
        
        
    org.transscript.compiler.std.Listdef.init(context);
    org.transscript.compiler.std.Mapdef.init(context);
    org.transscript.compiler.std.Core.init(context);
      }
}
}
