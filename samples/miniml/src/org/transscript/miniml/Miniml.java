
/** Generated File */

package org.transscript.miniml;

import static org.transscript.runtime.ConstructionDescriptor.makeData;
import static org.transscript.runtime.ConstructionDescriptor.makeFunction;
import static org.transscript.runtime.Normalizer.thunk;
import static org.transscript.runtime.Normalizer.force;
import static org.transscript.runtime.Normalizer.forceSub;
import static org.transscript.runtime.Normalizer.normalize;
import static org.transscript.runtime.Reference.safeRef;
import static org.transscript.runtime.Term.isVariableUse;

import org.transscript.runtime.*;
import org.transscript.runtime.ConstructionDescriptor.*;



import static org.transscript.compiler.std.Text.*;
import static org.transscript.compiler.std.List.*;
import static org.transscript.compiler.std.Core.*;
import static org.transscript.compiler.text.Text4.*;

@SuppressWarnings("unused")
public class Miniml {

  /* Enumerations */
  
final public static ConstructionDescriptor _M_MiniML_xtimesExpr_xA1 = makeData("MiniML_timesExpr_A1");
final public static ConstructionDescriptor _M_MiniML_xtimesExpr_xA2 = makeData("MiniML_timesExpr_A2");
final public static ConstructionDescriptor _M_MiniML_xcompExpr_xA1 = makeData("MiniML_compExpr_A1");
final public static ConstructionDescriptor _M_MiniML_xcompExpr_xA2 = makeData("MiniML_compExpr_A2");
final public static ConstructionDescriptor _M_MiniML_xcompExpr_xA3 = makeData("MiniML_compExpr_A3");
final public static ConstructionDescriptor _M_MiniML_xprimaryExpr_xA1 = makeData("MiniML_primaryExpr_A1");
final public static ConstructionDescriptor _M_MiniML_xprimaryExpr_xA2 = makeData("MiniML_primaryExpr_A2");
final public static ConstructionDescriptor _M_MiniML_xprimaryExpr_xA3 = makeData("MiniML_primaryExpr_A3");
final public static ConstructionDescriptor _M_MiniML_xprimaryExpr_xA4 = makeData("MiniML_primaryExpr_A4");
final public static ConstructionDescriptor _M_MiniML_xtoplevel_xA1 = makeData("MiniML_toplevel_A1");
final public static ConstructionDescriptor _M_MiniML_xtoplevel_xA2 = makeData("MiniML_toplevel_A2");
final public static ConstructionDescriptor _M_MiniML_xexpr_xA1 = makeData("MiniML_expr_A1");
final public static ConstructionDescriptor _M_MiniML_xexpr_xA2 = makeData("MiniML_expr_A2");
final public static ConstructionDescriptor _M_MiniML_xexpr_xA3 = makeData("MiniML_expr_A3");
final public static ConstructionDescriptor _M_MiniML_xty_xA1 = makeData("MiniML_ty_A1");
final public static ConstructionDescriptor _M_MiniML_xty_xA2 = makeData("MiniML_ty_A2");
final public static ConstructionDescriptor _M_MiniML_xtyPrimary_xA1 = makeData("MiniML_tyPrimary_A1");
final public static ConstructionDescriptor _M_MiniML_xtyPrimary_xA2 = makeData("MiniML_tyPrimary_A2");
final public static ConstructionDescriptor _M_MiniML_xtyPrimary_xA3 = makeData("MiniML_tyPrimary_A3");
final public static ConstructionDescriptor _M_MiniML_xapp_xexpr_xA1 = makeData("MiniML_app_expr_A1");
final public static ConstructionDescriptor _M_MiniML_xapp_xexpr_xA2 = makeData("MiniML_app_expr_A2");
final public static ConstructionDescriptor _M_MiniML_xsimple_xexpr_xA1 = makeData("MiniML_simple_expr_A1");
final public static ConstructionDescriptor _M_MiniML_xsimple_xexpr_xA2 = makeData("MiniML_simple_expr_A2");
final public static ConstructionDescriptor _M_MiniML_xsimple_xexpr_xA3 = makeData("MiniML_simple_expr_A3");
final public static ConstructionDescriptor _M_MiniML_xsimple_xexpr_xA4 = makeData("MiniML_simple_expr_A4");
final public static ConstructionDescriptor _M_MiniML_xsimple_xexpr_xA5 = makeData("MiniML_simple_expr_A5");

  /* Function descriptors */
  final public static DynamicFunctionDescriptor _M_MiniML_xPrint_xtimesExpr = makeFunction("MiniML_Print_timesExpr", Miniml.class, "_M_MiniML_xPrint_xtimesExpr");final public static DynamicFunctionDescriptor _M_MiniML_xPrint_xprimaryExpr = makeFunction("MiniML_Print_primaryExpr", Miniml.class, "_M_MiniML_xPrint_xprimaryExpr");final public static DynamicFunctionDescriptor _M_MiniML_xPrint_xtyPrimary = makeFunction("MiniML_Print_tyPrimary", Miniml.class, "_M_MiniML_xPrint_xtyPrimary");final public static DynamicFunctionDescriptor _M_MiniML_xPrint_xexpr = makeFunction("MiniML_Print_expr", Miniml.class, "_M_MiniML_xPrint_xexpr");final public static DynamicFunctionDescriptor _M_MiniML_xPrint_xty = makeFunction("MiniML_Print_ty", Miniml.class, "_M_MiniML_xPrint_xty");final public static DynamicFunctionDescriptor _M_MiniML_xPrint_xcompExpr = makeFunction("MiniML_Print_compExpr", Miniml.class, "_M_MiniML_xPrint_xcompExpr");final public static DynamicFunctionDescriptor _M_MiniML_xPrint_xapp_xexpr = makeFunction("MiniML_Print_app_expr", Miniml.class, "_M_MiniML_xPrint_xapp_xexpr");final public static DynamicFunctionDescriptor _M_MiniML_xPrint_xsimple_xexpr = makeFunction("MiniML_Print_simple_expr", Miniml.class, "_M_MiniML_xPrint_xsimple_xexpr");final public static DynamicFunctionDescriptor _M_MiniML_xPrint_xtoplevel = makeFunction("MiniML_Print_toplevel", Miniml.class, "_M_MiniML_xPrint_xtoplevel");

  final public static boolean _M_MiniML_xPrint_xtimesExpr(Sink sink, Term x_123)
{if (sink.context().sd ++ < 256) {

x_133:{
x_123 = force(sink.context(), x_123);
if (x_123.descriptor() != _M_MiniML_xtimesExpr_xA1)
{
  break x_133;
}
Term x_147 = x_123.sub(0).ref();
/* #1=x_147 */
Term x_162 = x_123.sub(1).ref();
/* #2=x_162 */
sink.start(_M_Text4_xtext_xA1);
sink.start(_M_Text4_xcontent_xA1);
sink.start(_M_MiniML_xPrint_xcompExpr);
sink.copy(x_147.ref());sink.end();sink.end();
sink.start(_M_Text4_xtext_xA1);
sink.start(_M_Text4_xcontent_xA1);sink.literal(" * ");sink.end();
sink.start(_M_Text4_xtext_xA1);
sink.start(_M_Text4_xcontent_xA1);
sink.start(_M_MiniML_xPrint_xtimesExpr);
sink.copy(x_162.ref());sink.end();sink.end();
sink.start(_M_Text4_xtext_xA2);sink.end();sink.end();sink.end();sink.end();return true;
}x_804:{
x_123 = force(sink.context(), x_123);
if (x_123.descriptor() != _M_MiniML_xtimesExpr_xA2)
{
  break x_804;
}
Term x_818 = x_123.sub(0).ref();
/* #1=x_818 */
sink.start(_M_Text4_xtext_xA1);
sink.start(_M_Text4_xcontent_xA1);
sink.start(_M_MiniML_xPrint_xcompExpr);
sink.copy(x_818.ref());sink.end();sink.end();
sink.start(_M_Text4_xtext_xA2);sink.end();sink.end();return true;
}
}
return thunk(sink, _M_MiniML_xPrint_xtimesExpr, x_123);
}final public static boolean _M_MiniML_xPrint_xprimaryExpr(Sink sink, Term x_1012)
{if (sink.context().sd ++ < 256) {

x_1022:{
x_1012 = force(sink.context(), x_1012);
if (x_1012.descriptor() != _M_MiniML_xprimaryExpr_xA1)
{
  break x_1022;
}
Term x_1036 = x_1012.sub(0).ref();
/* #1=x_1036 */
sink.start(_M_Text4_xtext_xA1);
sink.start(_M_Text4_xcontent_xA1);
sink.start(_M_MiniML_xPrint_xapp_xexpr);
sink.copy(x_1036.ref());sink.end();sink.end();
sink.start(_M_Text4_xtext_xA2);sink.end();sink.end();return true;
}x_1227:{
x_1012 = force(sink.context(), x_1012);
if (x_1012.descriptor() != _M_MiniML_xprimaryExpr_xA2)
{
  break x_1227;
}
Term x_1241 = x_1012.sub(0).ref();
/* #1=x_1241 */
sink.start(_M_Text4_xtext_xA1);
sink.start(_M_Text4_xcontent_xA1);sink.literal(" - ");sink.end();
sink.start(_M_Text4_xtext_xA1);
sink.start(_M_Text4_xcontent_xA4);
sink.start(_M_Text4_xtext_xA1);
sink.start(_M_Text4_xcontent_xA1);
sink.copy(x_1241.ref());sink.end();
sink.start(_M_Text4_xtext_xA2);sink.end();sink.end();sink.end();
sink.start(_M_Text4_xtext_xA2);sink.end();sink.end();sink.end();return true;
}x_1785:{
x_1012 = force(sink.context(), x_1012);
if (x_1012.descriptor() != _M_MiniML_xprimaryExpr_xA3)
{
  break x_1785;
}
Term x_1799 = x_1012.sub(0).ref();
/* #1=x_1799 */
Term x_1814 = x_1012.sub(1).ref();
/* #2=x_1814 */
Term x_1829 = x_1012.sub(2).ref();
/* #3=x_1829 */
sink.start(_M_Text4_xtext_xA1);
sink.start(_M_Text4_xcontent_xA1);sink.literal(" if ");sink.end();
sink.start(_M_Text4_xtext_xA1);
sink.start(_M_Text4_xcontent_xA1);
sink.start(_M_MiniML_xPrint_xexpr);
sink.copy(x_1799.ref());sink.end();sink.end();
sink.start(_M_Text4_xtext_xA1);
sink.start(_M_Text4_xcontent_xA1);sink.literal(" then ");sink.end();
sink.start(_M_Text4_xtext_xA1);
sink.start(_M_Text4_xcontent_xA1);
sink.start(_M_MiniML_xPrint_xexpr);
sink.copy(x_1814.ref());sink.end();sink.end();
sink.start(_M_Text4_xtext_xA1);
sink.start(_M_Text4_xcontent_xA1);sink.literal(" else ");sink.end();
sink.start(_M_Text4_xtext_xA1);
sink.start(_M_Text4_xcontent_xA1);
sink.start(_M_MiniML_xPrint_xexpr);
sink.copy(x_1829.ref());sink.end();sink.end();
sink.start(_M_Text4_xtext_xA2);sink.end();sink.end();sink.end();sink.end();sink.end();sink.end();sink.end();return true;
}x_3588:{
x_1012 = force(sink.context(), x_1012);
if (x_1012.descriptor() != _M_MiniML_xprimaryExpr_xA4)
{
  break x_3588;
}
Term x_3602 = x_1012.sub(0).ref();
/* #1=x_3602 */
Term x_3619 = x_1012.sub(1).ref();
/* #2=x_3619 */
Term x_3636 = x_1012.sub(2).ref();
/* #3=x_3636 */
Term x_3653 = x_1012.sub(3).ref();
Variable x_3660 = x_1012.binders(3)[0];
/* #4=x_3653 */
sink.start(_M_Text4_xtext_xA1);
sink.start(_M_Text4_xcontent_xA1);sink.literal(" fun ");sink.end();
sink.start(_M_Text4_xtext_xA1);
sink.start(_M_Text4_xcontent_xA4);
sink.start(_M_Text4_xtext_xA1);
sink.start(_M_Text4_xcontent_xA1);
sink.copy(x_3602.ref());sink.end();
sink.start(_M_Text4_xtext_xA1);
sink.start(_M_Text4_xcontent_xA1);sink.literal(" ( ");sink.end();
sink.start(_M_Text4_xtext_xA1);
sink.start(_M_Text4_xcontent_xA1);
sink.start(_M_Show);
Variable x_4689 = sink.context().makeVariable("x"); sink.use(x_4689);sink.end();sink.end();
sink.start(_M_Text4_xtext_xA1);
sink.start(_M_Text4_xcontent_xA1);sink.literal(" : ");sink.end();
sink.start(_M_Text4_xtext_xA1);
sink.start(_M_Text4_xcontent_xA1);
sink.start(_M_MiniML_xPrint_xty);
sink.copy(x_3619.ref());sink.end();sink.end();
sink.start(_M_Text4_xtext_xA1);
sink.start(_M_Text4_xcontent_xA1);sink.literal(" )  : ");sink.end();
sink.start(_M_Text4_xtext_xA1);
sink.start(_M_Text4_xcontent_xA1);
sink.start(_M_MiniML_xPrint_xty);
sink.copy(x_3636.ref());sink.end();sink.end();
sink.start(_M_Text4_xtext_xA1);
sink.start(_M_Text4_xcontent_xA1);sink.literal(" is ");sink.end();
sink.start(_M_Text4_xtext_xA1);
sink.start(_M_Text4_xcontent_xA1);
sink.start(_M_MiniML_xPrint_xexpr);Term x_8222;{
BufferSink x_8223 = sink.context().makeBuffer();
x_8223.use(x_4689);
x_8222 = x_8223.term();
}
sink.substitute(x_3653.ref(), new Variable[] { x_3660 }, new Term[] {x_8222});sink.end();sink.end();
sink.start(_M_Text4_xtext_xA2);sink.end();sink.end();sink.end();sink.end();sink.end();sink.end();sink.end();sink.end();sink.end();sink.end();sink.end();
sink.start(_M_Text4_xtext_xA2);sink.end();sink.end();sink.end();return true;
}
}
return thunk(sink, _M_MiniML_xPrint_xprimaryExpr, x_1012);
}final public static boolean _M_MiniML_xPrint_xtyPrimary(Sink sink, Term x_9093)
{if (sink.context().sd ++ < 256) {

x_9103:{
x_9093 = force(sink.context(), x_9093);
if (x_9093.descriptor() != _M_MiniML_xtyPrimary_xA1)
{
  break x_9103;
}
sink.start(_M_Text4_xtext_xA1);
sink.start(_M_Text4_xcontent_xA1);sink.literal(" bool ");sink.end();
sink.start(_M_Text4_xtext_xA2);sink.end();sink.end();return true;
}x_9214:{
x_9093 = force(sink.context(), x_9093);
if (x_9093.descriptor() != _M_MiniML_xtyPrimary_xA2)
{
  break x_9214;
}
sink.start(_M_Text4_xtext_xA1);
sink.start(_M_Text4_xcontent_xA1);sink.literal(" int ");sink.end();
sink.start(_M_Text4_xtext_xA2);sink.end();sink.end();return true;
}x_9325:{
x_9093 = force(sink.context(), x_9093);
if (x_9093.descriptor() != _M_MiniML_xtyPrimary_xA3)
{
  break x_9325;
}
Term x_9339 = x_9093.sub(0).ref();
/* #1=x_9339 */
sink.start(_M_Text4_xtext_xA1);
sink.start(_M_Text4_xcontent_xA1);sink.literal(" ( ");sink.end();
sink.start(_M_Text4_xtext_xA1);
sink.start(_M_Text4_xcontent_xA1);
sink.start(_M_MiniML_xPrint_xty);
sink.copy(x_9339.ref());sink.end();sink.end();
sink.start(_M_Text4_xtext_xA1);
sink.start(_M_Text4_xcontent_xA1);sink.literal(" ) ");sink.end();
sink.start(_M_Text4_xtext_xA2);sink.end();sink.end();sink.end();sink.end();return true;
}
}
return thunk(sink, _M_MiniML_xPrint_xtyPrimary, x_9093);
}final public static boolean _M_MiniML_xPrint_xexpr(Sink sink, Term x_9884)
{if (sink.context().sd ++ < 256) {

x_9894:{
x_9884 = force(sink.context(), x_9884);
if (x_9884.descriptor() != _M_MiniML_xexpr_xA1)
{
  break x_9894;
}
Term x_9908 = x_9884.sub(0).ref();
/* #1=x_9908 */
Term x_9923 = x_9884.sub(1).ref();
/* #2=x_9923 */
sink.start(_M_Text4_xtext_xA1);
sink.start(_M_Text4_xcontent_xA1);
sink.start(_M_MiniML_xPrint_xtimesExpr);
sink.copy(x_9908.ref());sink.end();sink.end();
sink.start(_M_Text4_xtext_xA1);
sink.start(_M_Text4_xcontent_xA1);sink.literal(" + ");sink.end();
sink.start(_M_Text4_xtext_xA1);
sink.start(_M_Text4_xcontent_xA1);
sink.start(_M_MiniML_xPrint_xexpr);
sink.copy(x_9923.ref());sink.end();sink.end();
sink.start(_M_Text4_xtext_xA2);sink.end();sink.end();sink.end();sink.end();return true;
}x_10565:{
x_9884 = force(sink.context(), x_9884);
if (x_9884.descriptor() != _M_MiniML_xexpr_xA2)
{
  break x_10565;
}
Term x_10579 = x_9884.sub(0).ref();
/* #1=x_10579 */
Term x_10594 = x_9884.sub(1).ref();
/* #2=x_10594 */
sink.start(_M_Text4_xtext_xA1);
sink.start(_M_Text4_xcontent_xA1);
sink.start(_M_MiniML_xPrint_xtimesExpr);
sink.copy(x_10579.ref());sink.end();sink.end();
sink.start(_M_Text4_xtext_xA1);
sink.start(_M_Text4_xcontent_xA1);sink.literal(" - ");sink.end();
sink.start(_M_Text4_xtext_xA1);
sink.start(_M_Text4_xcontent_xA1);
sink.start(_M_MiniML_xPrint_xexpr);
sink.copy(x_10594.ref());sink.end();sink.end();
sink.start(_M_Text4_xtext_xA2);sink.end();sink.end();sink.end();sink.end();return true;
}x_11236:{
x_9884 = force(sink.context(), x_9884);
if (x_9884.descriptor() != _M_MiniML_xexpr_xA3)
{
  break x_11236;
}
Term x_11250 = x_9884.sub(0).ref();
/* #1=x_11250 */
sink.start(_M_Text4_xtext_xA1);
sink.start(_M_Text4_xcontent_xA1);
sink.start(_M_MiniML_xPrint_xtimesExpr);
sink.copy(x_11250.ref());sink.end();sink.end();
sink.start(_M_Text4_xtext_xA2);sink.end();sink.end();return true;
}
}
return thunk(sink, _M_MiniML_xPrint_xexpr, x_9884);
}final public static boolean _M_MiniML_xPrint_xty(Sink sink, Term x_11444)
{if (sink.context().sd ++ < 256) {

x_11454:{
x_11444 = force(sink.context(), x_11444);
if (x_11444.descriptor() != _M_MiniML_xty_xA1)
{
  break x_11454;
}
Term x_11468 = x_11444.sub(0).ref();
/* #1=x_11468 */
sink.start(_M_Text4_xtext_xA1);
sink.start(_M_Text4_xcontent_xA1);
sink.start(_M_MiniML_xPrint_xtyPrimary);
sink.copy(x_11468.ref());sink.end();sink.end();
sink.start(_M_Text4_xtext_xA2);sink.end();sink.end();return true;
}x_11659:{
x_11444 = force(sink.context(), x_11444);
if (x_11444.descriptor() != _M_MiniML_xty_xA2)
{
  break x_11659;
}
Term x_11673 = x_11444.sub(0).ref();
/* #1=x_11673 */
Term x_11688 = x_11444.sub(1).ref();
/* #2=x_11688 */
sink.start(_M_Text4_xtext_xA1);
sink.start(_M_Text4_xcontent_xA1);
sink.start(_M_MiniML_xPrint_xtyPrimary);
sink.copy(x_11673.ref());sink.end();sink.end();
sink.start(_M_Text4_xtext_xA1);
sink.start(_M_Text4_xcontent_xA1);sink.literal(" -> ");sink.end();
sink.start(_M_Text4_xtext_xA1);
sink.start(_M_Text4_xcontent_xA1);
sink.start(_M_MiniML_xPrint_xty);
sink.copy(x_11688.ref());sink.end();sink.end();
sink.start(_M_Text4_xtext_xA2);sink.end();sink.end();sink.end();sink.end();return true;
}
}
return thunk(sink, _M_MiniML_xPrint_xty, x_11444);
}final public static boolean _M_MiniML_xPrint_xcompExpr(Sink sink, Term x_12333)
{if (sink.context().sd ++ < 256) {

x_12343:{
x_12333 = force(sink.context(), x_12333);
if (x_12333.descriptor() != _M_MiniML_xcompExpr_xA1)
{
  break x_12343;
}
Term x_12357 = x_12333.sub(0).ref();
/* #1=x_12357 */
Term x_12372 = x_12333.sub(1).ref();
/* #2=x_12372 */
sink.start(_M_Text4_xtext_xA1);
sink.start(_M_Text4_xcontent_xA1);
sink.start(_M_MiniML_xPrint_xprimaryExpr);
sink.copy(x_12357.ref());sink.end();sink.end();
sink.start(_M_Text4_xtext_xA1);
sink.start(_M_Text4_xcontent_xA1);sink.literal(" < ");sink.end();
sink.start(_M_Text4_xtext_xA1);
sink.start(_M_Text4_xcontent_xA1);
sink.start(_M_MiniML_xPrint_xcompExpr);
sink.copy(x_12372.ref());sink.end();sink.end();
sink.start(_M_Text4_xtext_xA2);sink.end();sink.end();sink.end();sink.end();return true;
}x_13014:{
x_12333 = force(sink.context(), x_12333);
if (x_12333.descriptor() != _M_MiniML_xcompExpr_xA2)
{
  break x_13014;
}
Term x_13028 = x_12333.sub(0).ref();
/* #1=x_13028 */
Term x_13043 = x_12333.sub(1).ref();
/* #2=x_13043 */
sink.start(_M_Text4_xtext_xA1);
sink.start(_M_Text4_xcontent_xA1);
sink.start(_M_MiniML_xPrint_xprimaryExpr);
sink.copy(x_13028.ref());sink.end();sink.end();
sink.start(_M_Text4_xtext_xA1);
sink.start(_M_Text4_xcontent_xA1);sink.literal(" = ");sink.end();
sink.start(_M_Text4_xtext_xA1);
sink.start(_M_Text4_xcontent_xA1);
sink.start(_M_MiniML_xPrint_xcompExpr);
sink.copy(x_13043.ref());sink.end();sink.end();
sink.start(_M_Text4_xtext_xA2);sink.end();sink.end();sink.end();sink.end();return true;
}x_13685:{
x_12333 = force(sink.context(), x_12333);
if (x_12333.descriptor() != _M_MiniML_xcompExpr_xA3)
{
  break x_13685;
}
Term x_13699 = x_12333.sub(0).ref();
/* #1=x_13699 */
sink.start(_M_Text4_xtext_xA1);
sink.start(_M_Text4_xcontent_xA1);
sink.start(_M_MiniML_xPrint_xprimaryExpr);
sink.copy(x_13699.ref());sink.end();sink.end();
sink.start(_M_Text4_xtext_xA2);sink.end();sink.end();return true;
}
}
return thunk(sink, _M_MiniML_xPrint_xcompExpr, x_12333);
}final public static boolean _M_MiniML_xPrint_xapp_xexpr(Sink sink, Term x_13893)
{if (sink.context().sd ++ < 256) {

x_13903:{
x_13893 = force(sink.context(), x_13893);
if (x_13893.descriptor() != _M_MiniML_xapp_xexpr_xA1)
{
  break x_13903;
}
Term x_13917 = x_13893.sub(0).ref();
/* #1=x_13917 */
sink.start(_M_Text4_xtext_xA1);
sink.start(_M_Text4_xcontent_xA1);
sink.start(_M_MiniML_xPrint_xsimple_xexpr);
sink.copy(x_13917.ref());sink.end();sink.end();
sink.start(_M_Text4_xtext_xA2);sink.end();sink.end();return true;
}x_14108:{
x_13893 = force(sink.context(), x_13893);
if (x_13893.descriptor() != _M_MiniML_xapp_xexpr_xA2)
{
  break x_14108;
}
Term x_14122 = x_13893.sub(0).ref();
/* #1=x_14122 */
Term x_14137 = x_13893.sub(1).ref();
/* #2=x_14137 */
sink.start(_M_Text4_xtext_xA1);
sink.start(_M_Text4_xcontent_xA1);
sink.start(_M_MiniML_xPrint_xsimple_xexpr);
sink.copy(x_14122.ref());sink.end();sink.end();
sink.start(_M_Text4_xtext_xA1);
sink.start(_M_Text4_xcontent_xA1);
sink.start(_M_MiniML_xPrint_xapp_xexpr);
sink.copy(x_14137.ref());sink.end();sink.end();
sink.start(_M_Text4_xtext_xA2);sink.end();sink.end();sink.end();return true;
}
}
return thunk(sink, _M_MiniML_xPrint_xapp_xexpr, x_13893);
}final public static boolean _M_MiniML_xPrint_xsimple_xexpr(Sink sink, Term x_14569)
{if (sink.context().sd ++ < 256) {

x_14579:{
x_14569 = force(sink.context(), x_14569);
if (x_14569.descriptor() != _M_MiniML_xsimple_xexpr_xA1)
{
  break x_14579;
}
Term x_14593 = x_14569.sub(0).ref();
/* #1=x_14593 */
sink.start(_M_Text4_xtext_xA1);
sink.start(_M_Text4_xcontent_xA4);
sink.start(_M_Text4_xtext_xA1);
sink.start(_M_Text4_xcontent_xA1);
sink.copy(x_14593.ref());sink.end();
sink.start(_M_Text4_xtext_xA2);sink.end();sink.end();sink.end();
sink.start(_M_Text4_xtext_xA2);sink.end();sink.end();return true;
}x_14936:{
x_14569 = force(sink.context(), x_14569);
if (x_14569.descriptor() != _M_MiniML_xsimple_xexpr_xA2)
{
  break x_14936;
}
sink.start(_M_Text4_xtext_xA1);
sink.start(_M_Text4_xcontent_xA1);sink.literal(" true ");sink.end();
sink.start(_M_Text4_xtext_xA2);sink.end();sink.end();return true;
}x_15047:{
x_14569 = force(sink.context(), x_14569);
if (x_14569.descriptor() != _M_MiniML_xsimple_xexpr_xA3)
{
  break x_15047;
}
sink.start(_M_Text4_xtext_xA1);
sink.start(_M_Text4_xcontent_xA1);sink.literal(" false ");sink.end();
sink.start(_M_Text4_xtext_xA2);sink.end();sink.end();return true;
}x_15158:{
x_14569 = force(sink.context(), x_14569);
if (x_14569.descriptor() != _M_MiniML_xsimple_xexpr_xA4)
{
  break x_15158;
}
Term x_15172 = x_14569.sub(0).ref();
/* #1=x_15172 */
sink.start(_M_Text4_xtext_xA1);
sink.start(_M_Text4_xcontent_xA4);
sink.start(_M_Text4_xtext_xA1);
sink.start(_M_Text4_xcontent_xA1);
sink.copy(x_15172.ref());sink.end();
sink.start(_M_Text4_xtext_xA2);sink.end();sink.end();sink.end();
sink.start(_M_Text4_xtext_xA2);sink.end();sink.end();return true;
}x_15515:{
x_14569 = force(sink.context(), x_14569);
if (x_14569.descriptor() != _M_MiniML_xsimple_xexpr_xA5)
{
  break x_15515;
}
Term x_15529 = x_14569.sub(0).ref();
/* #1=x_15529 */
sink.start(_M_Text4_xtext_xA1);
sink.start(_M_Text4_xcontent_xA1);sink.literal(" ( ");sink.end();
sink.start(_M_Text4_xtext_xA1);
sink.start(_M_Text4_xcontent_xA1);
sink.start(_M_MiniML_xPrint_xexpr);
sink.copy(x_15529.ref());sink.end();sink.end();
sink.start(_M_Text4_xtext_xA1);
sink.start(_M_Text4_xcontent_xA1);sink.literal(" ) ");sink.end();
sink.start(_M_Text4_xtext_xA2);sink.end();sink.end();sink.end();sink.end();return true;
}
}
return thunk(sink, _M_MiniML_xPrint_xsimple_xexpr, x_14569);
}final public static boolean _M_MiniML_xPrint_xtoplevel(Sink sink, Term x_16074)
{if (sink.context().sd ++ < 256) {

x_16084:{
x_16074 = force(sink.context(), x_16074);
if (x_16074.descriptor() != _M_MiniML_xtoplevel_xA1)
{
  break x_16084;
}
Term x_16098 = x_16074.sub(0).ref();
/* #1=x_16098 */
Term x_16115 = x_16074.sub(1).ref();
Variable x_16122 = x_16074.binders(1)[0];
/* #2=x_16115 */
sink.start(_M_Text4_xtext_xA1);
sink.start(_M_Text4_xcontent_xA1);sink.literal(" let ");sink.end();
sink.start(_M_Text4_xtext_xA1);
sink.start(_M_Text4_xcontent_xA1);
sink.start(_M_Show);
Variable x_16389 = sink.context().makeVariable("x"); sink.use(x_16389);sink.end();sink.end();
sink.start(_M_Text4_xtext_xA1);
sink.start(_M_Text4_xcontent_xA1);sink.literal(" = ");sink.end();
sink.start(_M_Text4_xtext_xA1);
sink.start(_M_Text4_xcontent_xA1);
sink.start(_M_MiniML_xPrint_xexpr);
sink.copy(x_16098.ref());sink.end();sink.end();
sink.start(_M_Text4_xtext_xA1);
sink.start(_M_Text4_xcontent_xA1);sink.literal(" ;; ");sink.end();
sink.start(_M_Text4_xtext_xA1);
sink.start(_M_Text4_xcontent_xA1);
sink.start(_M_MiniML_xPrint_xtoplevel);Term x_17603;{
BufferSink x_17604 = sink.context().makeBuffer();
x_17604.use(x_16389);
x_17603 = x_17604.term();
}
sink.substitute(x_16115.ref(), new Variable[] { x_16122 }, new Term[] {x_17603});sink.end();sink.end();
sink.start(_M_Text4_xtext_xA1);
sink.start(_M_Text4_xcontent_xA1);sink.literal(" ;; ");sink.end();
sink.start(_M_Text4_xtext_xA2);sink.end();sink.end();sink.end();sink.end();sink.end();sink.end();sink.end();sink.end();return true;
}x_18320:{
x_16074 = force(sink.context(), x_16074);
if (x_16074.descriptor() != _M_MiniML_xtoplevel_xA2)
{
  break x_18320;
}
Term x_18334 = x_16074.sub(0).ref();
/* #1=x_18334 */
sink.start(_M_Text4_xtext_xA1);
sink.start(_M_Text4_xcontent_xA1);
sink.start(_M_MiniML_xPrint_xexpr);
sink.copy(x_18334.ref());sink.end();sink.end();
sink.start(_M_Text4_xtext_xA1);
sink.start(_M_Text4_xcontent_xA1);sink.literal(" ;; ");sink.end();
sink.start(_M_Text4_xtext_xA2);sink.end();sink.end();sink.end();return true;
}
}
return thunk(sink, _M_MiniML_xPrint_xtoplevel, x_16074);
}

  
private static boolean initialized = false;
public static void init(Context context)
{
if (!initialized)
{
initialized = true;

context.register(_M_MiniML_xtimesExpr_xA1);
context.register(_M_MiniML_xtimesExpr_xA2);
context.register(_M_MiniML_xcompExpr_xA1);
context.register(_M_MiniML_xcompExpr_xA2);
context.register(_M_MiniML_xcompExpr_xA3);
context.register(_M_MiniML_xprimaryExpr_xA1);
context.register(_M_MiniML_xprimaryExpr_xA2);
context.register(_M_MiniML_xprimaryExpr_xA3);
context.register(_M_MiniML_xprimaryExpr_xA4);
context.register(_M_MiniML_xtoplevel_xA1);
context.register(_M_MiniML_xtoplevel_xA2);
context.register(_M_MiniML_xexpr_xA1);
context.register(_M_MiniML_xexpr_xA2);
context.register(_M_MiniML_xexpr_xA3);
context.register(_M_MiniML_xty_xA1);
context.register(_M_MiniML_xty_xA2);
context.register(_M_MiniML_xtyPrimary_xA1);
context.register(_M_MiniML_xtyPrimary_xA2);
context.register(_M_MiniML_xtyPrimary_xA3);
context.register(_M_MiniML_xapp_xexpr_xA1);
context.register(_M_MiniML_xapp_xexpr_xA2);
context.register(_M_MiniML_xsimple_xexpr_xA1);
context.register(_M_MiniML_xsimple_xexpr_xA2);
context.register(_M_MiniML_xsimple_xexpr_xA3);
context.register(_M_MiniML_xsimple_xexpr_xA4);
context.register(_M_MiniML_xsimple_xexpr_xA5);

context.register(_M_MiniML_xPrint_xtimesExpr);
context.register(_M_MiniML_xPrint_xprimaryExpr);
context.register(_M_MiniML_xPrint_xtyPrimary);
context.register(_M_MiniML_xPrint_xexpr);
context.register(_M_MiniML_xPrint_xty);
context.register(_M_MiniML_xPrint_xcompExpr);
context.register(_M_MiniML_xPrint_xapp_xexpr);
context.register(_M_MiniML_xPrint_xsimple_xexpr);
context.register(_M_MiniML_xPrint_xtoplevel);

org.transscript.compiler.std.Text.init(context);
org.transscript.compiler.std.List.init(context);
org.transscript.compiler.std.Core.init(context);
org.transscript.compiler.text.Text4.init(context);
}
}
}
