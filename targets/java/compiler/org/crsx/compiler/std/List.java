/** Generated File */
package org.crsx.compiler.std;
import static org.crsx.runtime.ConstructionDescriptor.makeData; 
import static org.crsx.runtime.ConstructionDescriptor.makeFunction; 
import static org.crsx.runtime.Normalizer.thunk; 
import static org.crsx.runtime.Normalizer.force; 
import static org.crsx.runtime.Normalizer.forceSub;
import static org.crsx.runtime.Normalizer.normalize;
import static org.crsx.runtime.Reference.safeRef;
import static org.crsx.runtime.Term.isVariableUse;  

import org.crsx.runtime.*;
import org.crsx.runtime.ConstructionDescriptor.*;


import static org.crsx.compiler.std.Num.*;
import static org.crsx.compiler.std.Pair.*;
import static org.crsx.compiler.std.Core.*;

@SuppressWarnings("unused")
public class List
{
final public static ConstructionDescriptor _M_Cons = makeData("Cons");
final public static ConstructionDescriptor _M_Nil = makeData("Nil");
final public static DynamicFunctionDescriptor _M_IsEmpty = makeFunction("IsEmpty", List.class, "_M_IsEmpty");final public static DynamicFunctionDescriptor _M_Zip = makeFunction("Zip", List.class, "_M_Zip");final public static DynamicFunctionDescriptor _M_Null = makeFunction("Null", List.class, "_M_Null");final public static DynamicFunctionDescriptor _M_Reverse = makeFunction("Reverse", List.class, "_M_Reverse");final public static DynamicFunctionDescriptor _M_PickFirst = makeFunction("PickFirst", List.class, "_M_PickFirst");final public static DynamicFunctionDescriptor _M_FoldlP = makeFunction("FoldlP", List.class, "_M_FoldlP");final public static DynamicFunctionDescriptor _M_MatchPartition = makeFunction("MatchPartition", List.class, "_M_MatchPartition");final public static DynamicFunctionDescriptor _M_IWrapFoldlP = makeFunction("IWrapFoldlP", List.class, "_M_IWrapFoldlP");final public static DynamicFunctionDescriptor _M_Insert = makeFunction("Insert", List.class, "_M_Insert");final public static DynamicFunctionDescriptor _M_ConditionalInsert = makeFunction("ConditionalInsert", List.class, "_M_ConditionalInsert");final public static DynamicFunctionDescriptor _M_Union = makeFunction("Union", List.class, "_M_Union");final public static DynamicFunctionDescriptor _M_Elem = makeFunction("Elem", List.class, "_M_Elem");final public static DynamicFunctionDescriptor _M_Concat = makeFunction("Concat", List.class, "_M_Concat");final public static DynamicFunctionDescriptor _M_Intersect = makeFunction("Intersect", List.class, "_M_Intersect");final public static DynamicFunctionDescriptor _M_Map2 = makeFunction("Map2", List.class, "_M_Map2");final public static DynamicFunctionDescriptor _M_At = makeFunction("At", List.class, "_M_At");final public static DynamicFunctionDescriptor _M_Tail = makeFunction("Tail", List.class, "_M_Tail");final public static DynamicFunctionDescriptor _M_IfSingleton = makeFunction("IfSingleton", List.class, "_M_IfSingleton");final public static DynamicFunctionDescriptor _M_ListEqual = makeFunction("ListEqual", List.class, "_M_ListEqual");final public static DynamicFunctionDescriptor _M_Partition = makeFunction("Partition", List.class, "_M_Partition");final public static DynamicFunctionDescriptor _M_Head = makeFunction("Head", List.class, "_M_Head");final public static DynamicFunctionDescriptor _M_IfEmpty = makeFunction("IfEmpty", List.class, "_M_IfEmpty");final public static DynamicFunctionDescriptor _M_ContainsDuplicates = makeFunction("ContainsDuplicates", List.class, "_M_ContainsDuplicates");final public static DynamicFunctionDescriptor _M_Foldl = makeFunction("Foldl", List.class, "_M_Foldl");final public static DynamicFunctionDescriptor _M_PickFirst1 = makeFunction("PickFirst1", List.class, "_M_PickFirst1");final public static DynamicFunctionDescriptor _M_Flatten = makeFunction("Flatten", List.class, "_M_Flatten");final public static DynamicFunctionDescriptor _M_MapM3 = makeFunction("MapM3", List.class, "_M_MapM3");final public static DynamicFunctionDescriptor _M_MapM2 = makeFunction("MapM2", List.class, "_M_MapM2");final public static DynamicFunctionDescriptor _M_RemoveDuplicates = makeFunction("RemoveDuplicates", List.class, "_M_RemoveDuplicates");final public static DynamicFunctionDescriptor _M_IsSingleton = makeFunction("IsSingleton", List.class, "_M_IsSingleton");final public static DynamicFunctionDescriptor _M_Append = makeFunction("Append", List.class, "_M_Append");final public static DynamicFunctionDescriptor _M_IsNotEmpty = makeFunction("IsNotEmpty", List.class, "_M_IsNotEmpty");final public static DynamicFunctionDescriptor _M_Length = makeFunction("Length", List.class, "_M_Length");final public static DynamicFunctionDescriptor _M_MapM = makeFunction("MapM", List.class, "_M_MapM");final public static DynamicFunctionDescriptor _M_Filter = makeFunction("Filter", List.class, "_M_Filter");final public static DynamicFunctionDescriptor _M_DelEntry = makeFunction("DelEntry", List.class, "_M_DelEntry");final public static DynamicFunctionDescriptor _M_LookUp = makeFunction("LookUp", List.class, "_M_LookUp");final public static DynamicFunctionDescriptor _M_Map = makeFunction("Map", List.class, "_M_Map");final public static DynamicFunctionDescriptor _M_Foldr = makeFunction("Foldr", List.class, "_M_Foldr");
final public static boolean _M_IsEmpty(Sink sink, Term x_175) 
{if (sink.context().sd ++ < 256) {

x_185:{
x_175 = force(sink.context(), x_175); 
if (x_175.descriptor() != _M_Nil)
{
  break x_185; 
}
sink.start(_M_TRUE);sink.end();return true;
}x_209:{
x_175 = force(sink.context(), x_175); 
if (x_175.descriptor() != _M_Cons)
{
  break x_209; 
}
Term x_223 = x_175.sub(0).ref();
/* #=x_223 */
Term x_238 = x_175.sub(1).ref();
/* #s=x_238 */
sink.start(_M_FALSE);sink.end();return true;
}
}
return thunk(sink, _M_IsEmpty, x_175); 
}final public static boolean _M_Zip(Sink sink, Term x_269, Term x_273) 
{if (sink.context().sd ++ < 256) {

x_283:{
x_269 = force(sink.context(), x_269); 
if (x_269.descriptor() != _M_Nil)
{
  break x_283; 
}
x_273 = force(sink.context(), x_273); 
if (x_273.descriptor() != _M_Nil)
{
  break x_283; 
}
sink.start(_M_Nil);sink.end();return true;
}x_317:{
x_269 = force(sink.context(), x_269); 
if (x_269.descriptor() != _M_Nil)
{
  break x_317; 
}
/* #=x_273 */
sink.start(_M_Error);sink.literal("ListExtension.Zip: second argument list was longer");sink.end();return true;
}x_365:{
/* #=x_269 */
x_273 = force(sink.context(), x_273); 
if (x_273.descriptor() != _M_Nil)
{
  break x_365; 
}
sink.start(_M_Error);sink.literal("ListExtension.Zip: first argument list was longer");sink.end();return true;
}x_413:{
x_269 = force(sink.context(), x_269); 
if (x_269.descriptor() != _M_Cons)
{
  break x_413; 
}
Term x_427 = x_269.sub(0).ref();
/* #X=x_427 */
Term x_442 = x_269.sub(1).ref();
/* #XS=x_442 */
x_273 = force(sink.context(), x_273); 
if (x_273.descriptor() != _M_Cons)
{
  break x_413; 
}
Term x_470 = x_273.sub(0).ref();
/* #Y=x_470 */
Term x_485 = x_273.sub(1).ref();
/* #YS=x_485 */
sink.start(_M_Cons);
sink.start(_M_PairCons);
sink.copy(x_427.ref());
sink.copy(x_470.ref());sink.end();
sink.start(_M_Zip);
sink.copy(x_442.ref());
sink.copy(x_485.ref());sink.end();sink.end();return true;
}
}
return thunk(sink, _M_Zip, x_269, x_273); 
}final public static boolean _M_Null(Sink sink, Term x_711) 
{if (sink.context().sd ++ < 256) {

x_721:{
x_711 = force(sink.context(), x_711); 
if (x_711.descriptor() != _M_Nil)
{
  break x_721; 
}
sink.start(_M_TRUE);sink.end();return true;
}x_745:{
x_711 = force(sink.context(), x_711); 
if (x_711.descriptor() != _M_Cons)
{
  break x_745; 
}
Term x_759 = x_711.sub(0).ref();
/* #H=x_759 */
Term x_774 = x_711.sub(1).ref();
/* #T=x_774 */
sink.start(_M_FALSE);sink.end();return true;
}
}
return thunk(sink, _M_Null, x_711); 
}final public static boolean _M_Reverse(Sink sink, Term x_805) 
{if (sink.context().sd ++ < 256) {

x_815:{
/* #XS=x_805 */
sink.start(_M_Foldl);
Variable x_847 = sink.context().makeVariable("x");
Variable x_858 = sink.context().makeVariable("x");
sink.binds(new Variable[] { x_847, x_858 });
sink.start(_M_Insert);
sink.use(x_847);
sink.use(x_858);sink.end();
sink.start(_M_Nil);sink.end();
sink.copy(x_805.ref());sink.end();return true;
}
}
return thunk(sink, _M_Reverse, x_805); 
}final public static boolean _M_PickFirst(Sink sink, Term x_1030, Variable x_1034, Term x_1037) 
{if (sink.context().sd ++ < 256) {

x_1047:{
x_1030 = force(sink.context(), x_1030); 
if (x_1030.descriptor() != _M_Nil)
{
  break x_1047; 
}
/* #=x_1037 */
sink.start(_M_NONE);sink.end();return true;
}x_1089:{
x_1030 = force(sink.context(), x_1030); 
if (x_1030.descriptor() != _M_Cons)
{
  break x_1089; 
}
Term x_1107 = x_1030.sub(0).ref();
/* #1=x_1107 */
Term x_1128 = x_1030.sub(1).ref();
/* #s=x_1128 */
/* #=x_1037 */
sink.start(_M_PickFirst1);Term x_1208;{
BufferSink x_1209 = sink.context().makeBuffer();
x_1209.copy(x_1107.ref());
x_1208 = x_1209.term();
}
sink.substitute(x_1037.ref(), new Variable[] { x_1034 }, new Term[] {x_1208});
sink.copy(x_1107.ref());
sink.copy(x_1128.ref());
Variable x_1277 = sink.context().makeVariable("x");
sink.binds(new Variable[] { x_1277 });Term x_1306;{
BufferSink x_1307 = sink.context().makeBuffer();
x_1307.use(x_1277);
x_1306 = x_1307.term();
}
sink.substitute(x_1037.ref(), new Variable[] { x_1034 }, new Term[] {x_1306});sink.end();return true;
}
}
return thunk(sink, _M_PickFirst, x_1030, x_1034, x_1037); 
}final public static boolean _M_FoldlP(Sink sink, Variable x_1335, Variable x_1338, Term x_1341, Term x_1345, Term x_1350) 
{if (sink.context().sd ++ < 256) {
x_1345 = normalize(sink.context(), x_1345);
x_1362:{
/* #F=x_1341 */
/* #Z=x_1345 */
x_1350 = force(sink.context(), x_1350); 
if (x_1350.descriptor() != _M_Nil)
{
  break x_1362; 
}
sink.copy(x_1345.ref());return true;
}x_1416:{
/* #F=x_1341 */
/* #Z=x_1345 */
x_1350 = force(sink.context(), x_1350); 
if (x_1350.descriptor() != _M_Cons)
{
  break x_1416; 
}
Term x_1478 = x_1350.sub(0).ref();
/* #H=x_1478 */
Term x_1499 = x_1350.sub(1).ref();
/* #T=x_1499 */
sink.start(_M_FoldlP);
Variable x_1541 = sink.context().makeVariable("x");
Variable x_1552 = sink.context().makeVariable("x");
sink.binds(new Variable[] { x_1541, x_1552 });Term x_1581;{
BufferSink x_1582 = sink.context().makeBuffer();
x_1582.use(x_1541);
x_1581 = x_1582.term();
}Term x_1597;{
BufferSink x_1598 = sink.context().makeBuffer();
x_1598.use(x_1552);
x_1597 = x_1598.term();
}
sink.substitute(x_1341.ref(), new Variable[] { x_1335, x_1338 }, new Term[] {x_1581, x_1597});Term x_1645;{
BufferSink x_1646 = sink.context().makeBuffer();
x_1646.copy(x_1478.ref());
x_1645 = x_1646.term();
}Term x_1660;{
BufferSink x_1661 = sink.context().makeBuffer();
x_1661.copy(x_1345.ref());
x_1660 = x_1661.term();
}
sink.substitute(x_1341.ref(), new Variable[] { x_1335, x_1338 }, new Term[] {x_1645, x_1660});
sink.copy(x_1499.ref());sink.end();return true;
}
}
return thunk(sink, _M_FoldlP, x_1335, x_1338, x_1341, x_1345, x_1350); 
}final public static boolean _M_MatchPartition(Sink sink, Term x_1712, Term x_1716, Term x_1720) 
{if (sink.context().sd ++ < 256) {

x_1730:{
x_1712 = force(sink.context(), x_1712); 
if (x_1712.descriptor() != _M_TRUE)
{
  break x_1730; 
}
/* #X=x_1716 */
x_1720 = force(sink.context(), x_1720); 
if (x_1720.descriptor() != _M_PairCons)
{
  break x_1730; 
}
Term x_1762 = x_1720.sub(0).ref();
/* #TS=x_1762 */
Term x_1777 = x_1720.sub(1).ref();
/* #FS=x_1777 */
sink.start(_M_PairCons);
sink.start(_M_Insert);
sink.copy(x_1716.ref());
sink.copy(x_1762.ref());sink.end();
sink.copy(x_1777.ref());sink.end();return true;
}x_1924:{
x_1712 = force(sink.context(), x_1712); 
if (x_1712.descriptor() != _M_FALSE)
{
  break x_1924; 
}
/* #X=x_1716 */
x_1720 = force(sink.context(), x_1720); 
if (x_1720.descriptor() != _M_PairCons)
{
  break x_1924; 
}
Term x_1956 = x_1720.sub(0).ref();
/* #TS=x_1956 */
Term x_1971 = x_1720.sub(1).ref();
/* #FS=x_1971 */
sink.start(_M_PairCons);
sink.copy(x_1956.ref());
sink.start(_M_Insert);
sink.copy(x_1716.ref());
sink.copy(x_1971.ref());sink.end();sink.end();return true;
}
}
return thunk(sink, _M_MatchPartition, x_1712, x_1716, x_1720); 
}final public static boolean _M_IWrapFoldlP(Sink sink, Variable x_2121, Variable x_2124, Term x_2127, Term x_2131, Term x_2135) 
{if (sink.context().sd ++ < 256) {

x_2145:{
/* #F=x_2127 */
/* #Z=x_2131 */
/* #XS=x_2135 */
sink.start(_M_FoldlP);
Variable x_2221 = sink.context().makeVariable("x");
Variable x_2232 = sink.context().makeVariable("x");
sink.binds(new Variable[] { x_2221, x_2232 });Term x_2261;{
BufferSink x_2262 = sink.context().makeBuffer();
x_2262.use(x_2221);
x_2261 = x_2262.term();
}Term x_2277;{
BufferSink x_2278 = sink.context().makeBuffer();
x_2278.use(x_2232);
x_2277 = x_2278.term();
}
sink.substitute(x_2127.ref(), new Variable[] { x_2121, x_2124 }, new Term[] {x_2261, x_2277});
sink.copy(x_2131.ref());
sink.copy(x_2135.ref());sink.end();return true;
}
}
return thunk(sink, _M_IWrapFoldlP, x_2121, x_2124, x_2127, x_2131, x_2135); 
}final public static boolean _M_Insert(Sink sink, Term x_2350, Term x_2354) 
{if (sink.context().sd ++ < 256) {

x_2364:{
/* #X=x_2350 */
/* #XS=x_2354 */
sink.start(_M_Cons);
sink.copy(x_2350.ref());
sink.copy(x_2354.ref());sink.end();return true;
}
}
return thunk(sink, _M_Insert, x_2350, x_2354); 
}final public static boolean _M_ConditionalInsert(Sink sink, Term x_2440, Term x_2444, Term x_2448) 
{if (sink.context().sd ++ < 256) {

x_2458:{
x_2440 = force(sink.context(), x_2440); 
if (x_2440.descriptor() != _M_TRUE)
{
  break x_2458; 
}
/* #X=x_2444 */
/* #XS=x_2448 */
sink.start(_M_Insert);
sink.copy(x_2444.ref());
sink.copy(x_2448.ref());sink.end();return true;
}x_2541:{
x_2440 = force(sink.context(), x_2440); 
if (x_2440.descriptor() != _M_FALSE)
{
  break x_2541; 
}
/* #X=x_2444 */
/* #XS=x_2448 */
sink.copy(x_2448.ref());return true;
}
}
return thunk(sink, _M_ConditionalInsert, x_2440, x_2444, x_2448); 
}final public static boolean _M_Union(Sink sink, Term x_2582, Term x_2586) 
{if (sink.context().sd ++ < 256) {

x_2596:{
/* #XS=x_2582 */
/* #YS=x_2586 */
sink.start(_M_RemoveDuplicates);
sink.start(_M_Concat);
sink.copy(x_2582.ref());
sink.copy(x_2586.ref());sink.end();sink.end();return true;
}
}
return thunk(sink, _M_Union, x_2582, x_2586); 
}final public static boolean _M_Elem(Sink sink, Term x_2730, Term x_2734) 
{if (sink.context().sd ++ < 256) {

x_2744:{
/* #X=x_2730 */
/* #XS=x_2734 */
sink.start(_M_Foldr);
Variable x_2788 = sink.context().makeVariable("x");
Variable x_2799 = sink.context().makeVariable("x");
sink.binds(new Variable[] { x_2788, x_2799 });
sink.start(_M_Or);
sink.start(_M_Equal);
sink.copy(x_2730.ref());
sink.use(x_2788);sink.end();
sink.use(x_2799);sink.end();
sink.start(_M_FALSE);sink.end();
sink.copy(x_2734.ref());sink.end();return true;
}
}
return thunk(sink, _M_Elem, x_2730, x_2734); 
}final public static boolean _M_Concat(Sink sink, Term x_3085, Term x_3089) 
{if (sink.context().sd ++ < 256) {

x_3099:{
x_3085 = force(sink.context(), x_3085); 
if (x_3085.descriptor() != _M_Nil)
{
  break x_3099; 
}
/* #tail=x_3089 */
sink.copy(x_3089.ref());return true;
}x_3129:{
x_3085 = force(sink.context(), x_3085); 
if (x_3085.descriptor() != _M_Cons)
{
  break x_3129; 
}
Term x_3143 = x_3085.sub(0).ref();
/* #1=x_3143 */
Term x_3158 = x_3085.sub(1).ref();
/* #s=x_3158 */
/* #tail=x_3089 */
sink.start(_M_Cons);
sink.copy(x_3143.ref());
sink.start(_M_Concat);
sink.copy(x_3158.ref());
sink.copy(x_3089.ref());sink.end();sink.end();return true;
}
}
return thunk(sink, _M_Concat, x_3085, x_3089); 
}final public static boolean _M_Intersect(Sink sink, Term x_3316, Term x_3320) 
{if (sink.context().sd ++ < 256) {

x_3330:{
/* #XS=x_3316 */
/* #YS=x_3320 */
sink.start(_M_Foldr);
Variable x_3374 = sink.context().makeVariable("x");
Variable x_3385 = sink.context().makeVariable("x");
sink.binds(new Variable[] { x_3374, x_3385 });
sink.start(_M_ConditionalInsert);
sink.start(_M_Elem);
sink.use(x_3374);
sink.copy(x_3320.ref());sink.end();
sink.use(x_3374);
sink.use(x_3385);sink.end();
sink.start(_M_Nil);sink.end();
sink.copy(x_3316.ref());sink.end();return true;
}
}
return thunk(sink, _M_Intersect, x_3316, x_3320); 
}final public static boolean _M_Map2(Sink sink, Variable x_3709, Term x_3712, Term x_3716) 
{if (sink.context().sd ++ < 256) {

x_3726:{
/* #F=x_3712 */
/* #XS=x_3716 */
sink.start(_M_Foldr);
Variable x_3780 = sink.context().makeVariable("x");
Variable x_3791 = sink.context().makeVariable("x");
sink.binds(new Variable[] { x_3780, x_3791 });
sink.start(_M_Insert);Term x_3858;{
BufferSink x_3859 = sink.context().makeBuffer();
x_3859.use(x_3780);
x_3858 = x_3859.term();
}
sink.substitute(x_3712.ref(), new Variable[] { x_3709 }, new Term[] {x_3858});
sink.use(x_3791);sink.end();
sink.start(_M_Nil);sink.end();
sink.copy(x_3716.ref());sink.end();return true;
}
}
return thunk(sink, _M_Map2, x_3709, x_3712, x_3716); 
}final public static boolean _M_At(Sink sink, Term x_3981, Term x_3985) 
{if (sink.context().sd ++ < 256) {
x_3985 = normalize(sink.context(), x_3985);
x_3998:{
x_3981 = force(sink.context(), x_3981); 
if (x_3981.descriptor() != _M_Nil)
{
  break x_3998; 
}
/* #i=x_3985 */
sink.start(_M_NONE);sink.end();return true;
}x_4030:{
x_3981 = force(sink.context(), x_3981); 
if (x_3981.descriptor() != _M_Cons)
{
  break x_4030; 
}
Term x_4044 = x_3981.sub(0).ref();
/* #=x_4044 */
Term x_4059 = x_3981.sub(1).ref();
/* #s=x_4059 */
/* #i=x_3985 */
sink.start(_M_If);
sink.start(_M_Equal);
sink.copy(x_3985.ref());sink.literal(0);sink.end();
sink.start(_M_SOME);
sink.copy(x_4044.ref());sink.end();
sink.start(_M_At);
sink.copy(x_4059.ref());
sink.start(_M_Minus);
sink.copy(x_3985.ref());sink.literal(1);sink.end();sink.end();sink.end();return true;
}
}
return thunk(sink, _M_At, x_3981, x_3985); 
}final public static boolean _M_Tail(Sink sink, Term x_4449) 
{if (sink.context().sd ++ < 256) {

x_4459:{
x_4449 = force(sink.context(), x_4449); 
if (x_4449.descriptor() != _M_Nil)
{
  break x_4459; 
}
sink.start(_M_Error);sink.literal("Tail of empty list");sink.end();return true;
}x_4499:{
x_4449 = force(sink.context(), x_4449); 
if (x_4449.descriptor() != _M_Cons)
{
  break x_4499; 
}
Term x_4513 = x_4449.sub(0).ref();
/* #=x_4513 */
Term x_4528 = x_4449.sub(1).ref();
/* #s=x_4528 */
sink.copy(x_4528.ref());return true;
}
}
return thunk(sink, _M_Tail, x_4449); 
}final public static boolean _M_IfSingleton(Sink sink, Term x_4556, Term x_4560, Term x_4564) 
{if (sink.context().sd ++ < 256) {

x_4574:{
x_4556 = force(sink.context(), x_4556); 
if (x_4556.descriptor() != _M_Nil)
{
  break x_4574; 
}
/* #1=x_4560 */
/* #2=x_4564 */
sink.copy(x_4564.ref());return true;
}x_4612:{
x_4556 = force(sink.context(), x_4556); 
if (x_4556.descriptor() != _M_Cons)
{
  break x_4612; 
}
Term x_4626 = x_4556.sub(0).ref();
/* #=x_4626 */
Term x_4641 = x_4556.sub(1).ref();
/* #s=x_4641 */
/* #1=x_4560 */
/* #2=x_4564 */
sink.start(_M_IfEmpty);
sink.copy(x_4641.ref());
sink.copy(x_4560.ref());
sink.copy(x_4564.ref());sink.end();return true;
}
}
return thunk(sink, _M_IfSingleton, x_4556, x_4560, x_4564); 
}final public static boolean _M_ListEqual(Sink sink, Variable x_4750, Variable x_4753, Term x_4756, Term x_4760, Term x_4764) 
{if (sink.context().sd ++ < 256) {

x_4774:{
/* #C=x_4756 */
x_4760 = force(sink.context(), x_4760); 
if (x_4760.descriptor() != _M_Nil)
{
  break x_4774; 
}
x_4764 = force(sink.context(), x_4764); 
if (x_4764.descriptor() != _M_Nil)
{
  break x_4774; 
}
sink.start(_M_TRUE);sink.end();return true;
}x_4832:{
/* #C=x_4756 */
x_4760 = force(sink.context(), x_4760); 
if (x_4760.descriptor() != _M_Cons)
{
  break x_4832; 
}
Term x_4870 = x_4760.sub(0).ref();
/* #x=x_4870 */
Term x_4885 = x_4760.sub(1).ref();
/* #xs=x_4885 */
x_4764 = force(sink.context(), x_4764); 
if (x_4764.descriptor() != _M_Nil)
{
  break x_4832; 
}
sink.start(_M_FALSE);sink.end();return true;
}x_4923:{
/* #C=x_4756 */
x_4760 = force(sink.context(), x_4760); 
if (x_4760.descriptor() != _M_Nil)
{
  break x_4923; 
}
x_4764 = force(sink.context(), x_4764); 
if (x_4764.descriptor() != _M_Cons)
{
  break x_4923; 
}
Term x_4971 = x_4764.sub(0).ref();
/* #y=x_4971 */
Term x_4986 = x_4764.sub(1).ref();
/* #ys=x_4986 */
sink.start(_M_FALSE);sink.end();return true;
}x_5014:{
/* #C=x_4756 */
x_4760 = force(sink.context(), x_4760); 
if (x_4760.descriptor() != _M_Cons)
{
  break x_5014; 
}
Term x_5064 = x_4760.sub(0).ref();
/* #x=x_5064 */
Term x_5085 = x_4760.sub(1).ref();
/* #xs=x_5085 */
x_4764 = force(sink.context(), x_4764); 
if (x_4764.descriptor() != _M_Cons)
{
  break x_5014; 
}
Term x_5125 = x_4764.sub(0).ref();
/* #y=x_5125 */
Term x_5146 = x_4764.sub(1).ref();
/* #ys=x_5146 */
sink.start(_M_And);Term x_5211;{
BufferSink x_5212 = sink.context().makeBuffer();
x_5212.copy(x_5064.ref());
x_5211 = x_5212.term();
}Term x_5226;{
BufferSink x_5227 = sink.context().makeBuffer();
x_5227.copy(x_5125.ref());
x_5226 = x_5227.term();
}
sink.substitute(x_4756.ref(), new Variable[] { x_4750, x_4753 }, new Term[] {x_5211, x_5226});
sink.start(_M_ListEqual);
Variable x_5287 = sink.context().makeVariable("x");
Variable x_5301 = sink.context().makeVariable("x");
sink.binds(new Variable[] { x_5287, x_5301 });Term x_5342;{
BufferSink x_5343 = sink.context().makeBuffer();
x_5343.use(x_5287);
x_5342 = x_5343.term();
}Term x_5358;{
BufferSink x_5359 = sink.context().makeBuffer();
x_5359.use(x_5301);
x_5358 = x_5359.term();
}
sink.substitute(x_4756.ref(), new Variable[] { x_4750, x_4753 }, new Term[] {x_5342, x_5358});
sink.copy(x_5085.ref());
sink.copy(x_5146.ref());sink.end();sink.end();return true;
}
}
return thunk(sink, _M_ListEqual, x_4750, x_4753, x_4756, x_4760, x_4764); 
}final public static boolean _M_Partition(Sink sink, Variable x_5461, Term x_5464, Term x_5468) 
{if (sink.context().sd ++ < 256) {

x_5478:{
/* #C=x_5464 */
/* #XS=x_5468 */
sink.start(_M_Foldr);
Variable x_5532 = sink.context().makeVariable("x");
Variable x_5543 = sink.context().makeVariable("x");
sink.binds(new Variable[] { x_5532, x_5543 });
sink.start(_M_MatchPartition);Term x_5610;{
BufferSink x_5611 = sink.context().makeBuffer();
x_5611.use(x_5532);
x_5610 = x_5611.term();
}
sink.substitute(x_5464.ref(), new Variable[] { x_5461 }, new Term[] {x_5610});
sink.use(x_5532);
sink.use(x_5543);sink.end();
sink.start(_M_PairCons);
sink.start(_M_Nil);sink.end();
sink.start(_M_Nil);sink.end();sink.end();
sink.copy(x_5468.ref());sink.end();return true;
}
}
return thunk(sink, _M_Partition, x_5461, x_5464, x_5468); 
}final public static boolean _M_Head(Sink sink, Term x_5869) 
{if (sink.context().sd ++ < 256) {

x_5879:{
x_5869 = force(sink.context(), x_5869); 
if (x_5869.descriptor() != _M_Nil)
{
  break x_5879; 
}
sink.start(_M_Error);sink.literal("Head of empty list");sink.end();return true;
}x_5919:{
x_5869 = force(sink.context(), x_5869); 
if (x_5869.descriptor() != _M_Cons)
{
  break x_5919; 
}
Term x_5933 = x_5869.sub(0).ref();
/* #=x_5933 */
Term x_5948 = x_5869.sub(1).ref();
/* #s=x_5948 */
sink.copy(x_5933.ref());return true;
}
}
return thunk(sink, _M_Head, x_5869); 
}final public static boolean _M_IfEmpty(Sink sink, Term x_5976, Term x_5980, Term x_5984) 
{if (sink.context().sd ++ < 256) {

x_5994:{
x_5976 = force(sink.context(), x_5976); 
if (x_5976.descriptor() != _M_Nil)
{
  break x_5994; 
}
/* #1=x_5980 */
/* #2=x_5984 */
sink.copy(x_5980.ref());return true;
}x_6032:{
x_5976 = force(sink.context(), x_5976); 
if (x_5976.descriptor() != _M_Cons)
{
  break x_6032; 
}
Term x_6046 = x_5976.sub(0).ref();
/* #=x_6046 */
Term x_6061 = x_5976.sub(1).ref();
/* #s=x_6061 */
/* #1=x_5980 */
/* #2=x_5984 */
sink.copy(x_5984.ref());return true;
}
}
return thunk(sink, _M_IfEmpty, x_5976, x_5980, x_5984); 
}final public static boolean _M_ContainsDuplicates(Sink sink, Term x_6106) 
{if (sink.context().sd ++ < 256) {

x_6116:{
x_6106 = force(sink.context(), x_6106); 
if (x_6106.descriptor() != _M_Nil)
{
  break x_6116; 
}
sink.start(_M_FALSE);sink.end();return true;
}x_6140:{
x_6106 = force(sink.context(), x_6106); 
if (x_6106.descriptor() != _M_Cons)
{
  break x_6140; 
}
Term x_6154 = x_6106.sub(0).ref();
/* #H=x_6154 */
Term x_6169 = x_6106.sub(1).ref();
/* #T=x_6169 */
sink.start(_M_Or);
sink.start(_M_Elem);
sink.copy(x_6154.ref());
sink.copy(x_6169.ref());sink.end();
sink.start(_M_ContainsDuplicates);
sink.copy(x_6169.ref());sink.end();sink.end();return true;
}
}
return thunk(sink, _M_ContainsDuplicates, x_6106); 
}final public static boolean _M_Foldl(Sink sink, Variable x_6364, Variable x_6367, Term x_6370, Term x_6374, Term x_6378) 
{if (sink.context().sd ++ < 256) {

x_6388:{
/* #F=x_6370 */
/* #Z=x_6374 */
x_6378 = force(sink.context(), x_6378); 
if (x_6378.descriptor() != _M_Nil)
{
  break x_6388; 
}
sink.copy(x_6374.ref());return true;
}x_6442:{
/* #F=x_6370 */
/* #Z=x_6374 */
x_6378 = force(sink.context(), x_6378); 
if (x_6378.descriptor() != _M_Cons)
{
  break x_6442; 
}
Term x_6504 = x_6378.sub(0).ref();
/* #H=x_6504 */
Term x_6525 = x_6378.sub(1).ref();
/* #T=x_6525 */
sink.start(_M_Foldl);
Variable x_6567 = sink.context().makeVariable("x");
Variable x_6578 = sink.context().makeVariable("x");
sink.binds(new Variable[] { x_6567, x_6578 });Term x_6607;{
BufferSink x_6608 = sink.context().makeBuffer();
x_6608.use(x_6567);
x_6607 = x_6608.term();
}Term x_6623;{
BufferSink x_6624 = sink.context().makeBuffer();
x_6624.use(x_6578);
x_6623 = x_6624.term();
}
sink.substitute(x_6370.ref(), new Variable[] { x_6364, x_6367 }, new Term[] {x_6607, x_6623});Term x_6671;{
BufferSink x_6672 = sink.context().makeBuffer();
x_6672.copy(x_6504.ref());
x_6671 = x_6672.term();
}Term x_6686;{
BufferSink x_6687 = sink.context().makeBuffer();
x_6687.copy(x_6374.ref());
x_6686 = x_6687.term();
}
sink.substitute(x_6370.ref(), new Variable[] { x_6364, x_6367 }, new Term[] {x_6671, x_6686});
sink.copy(x_6525.ref());sink.end();return true;
}
}
return thunk(sink, _M_Foldl, x_6364, x_6367, x_6370, x_6374, x_6378); 
}final public static boolean _M_PickFirst1(Sink sink, Term x_6738, Term x_6742, Term x_6746, Variable x_6750, Term x_6753) 
{if (sink.context().sd ++ < 256) {

x_6763:{
x_6738 = force(sink.context(), x_6738); 
if (x_6738.descriptor() != _M_TRUE)
{
  break x_6763; 
}
/* #1=x_6742 */
/* #s=x_6746 */
/* #=x_6753 */
sink.start(_M_SOME);
sink.copy(x_6742.ref());sink.end();return true;
}x_6848:{
x_6738 = force(sink.context(), x_6738); 
if (x_6738.descriptor() != _M_FALSE)
{
  break x_6848; 
}
/* #1=x_6742 */
/* #s=x_6746 */
/* #=x_6753 */
sink.start(_M_PickFirst);
sink.copy(x_6746.ref());
Variable x_6946 = sink.context().makeVariable("x");
sink.binds(new Variable[] { x_6946 });Term x_6975;{
BufferSink x_6976 = sink.context().makeBuffer();
x_6976.use(x_6946);
x_6975 = x_6976.term();
}
sink.substitute(x_6753.ref(), new Variable[] { x_6750 }, new Term[] {x_6975});sink.end();return true;
}
}
return thunk(sink, _M_PickFirst1, x_6738, x_6742, x_6746, x_6750, x_6753); 
}final public static boolean _M_Flatten(Sink sink, Term x_7004) 
{if (sink.context().sd ++ < 256) {

x_7014:{
x_7004 = force(sink.context(), x_7004); 
if (x_7004.descriptor() != _M_Nil)
{
  break x_7014; 
}
sink.start(_M_Nil);sink.end();return true;
}x_7038:{
x_7004 = force(sink.context(), x_7004); 
if (x_7004.descriptor() != _M_Cons)
{
  break x_7038; 
}
Term x_7052 = x_7004.sub(0).ref();
/* #1=x_7052 */
Term x_7067 = x_7004.sub(1).ref();
/* #s=x_7067 */
sink.start(_M_Concat);
sink.copy(x_7052.ref());
sink.start(_M_Flatten);
sink.copy(x_7067.ref());sink.end();sink.end();return true;
}
}
return thunk(sink, _M_Flatten, x_7004); 
}final public static boolean _M_MapM3(Sink sink, Term x_7185, Variable x_7189, Variable x_7192, Term x_7195, Term x_7199, Term x_7203) 
{if (sink.context().sd ++ < 256) {

x_7213:{
x_7185 = force(sink.context(), x_7185); 
if (x_7185.descriptor() != _M_PairCons)
{
  break x_7213; 
}
Term x_7235 = x_7185.sub(0).ref();
/* #nstate=x_7235 */
Term x_7262 = x_7185.sub(1).ref();
/* #r=x_7262 */
/* #=x_7195 */
/* #s=x_7199 */
/* #rs=x_7203 */
sink.start(_M_MapM2);
Variable x_7368 = sink.context().makeVariable("x");
Variable x_7379 = sink.context().makeVariable("x");
sink.binds(new Variable[] { x_7368, x_7379 });Term x_7408;{
BufferSink x_7409 = sink.context().makeBuffer();
x_7409.use(x_7368);
x_7408 = x_7409.term();
}Term x_7424;{
BufferSink x_7425 = sink.context().makeBuffer();
x_7425.use(x_7379);
x_7424 = x_7425.term();
}
sink.substitute(x_7195.ref(), new Variable[] { x_7189, x_7192 }, new Term[] {x_7408, x_7424});
sink.copy(x_7235.ref());
sink.copy(x_7199.ref());
sink.start(_M_Append);
sink.copy(x_7262.ref());
sink.copy(x_7203.ref());sink.end();sink.end();return true;
}
}
return thunk(sink, _M_MapM3, x_7185, x_7189, x_7192, x_7195, x_7199, x_7203); 
}final public static boolean _M_MapM2(Sink sink, Variable x_7593, Variable x_7596, Term x_7599, Term x_7603, Term x_7607, Term x_7611) 
{if (sink.context().sd ++ < 256) {

x_7621:{
/* #=x_7599 */
/* #state=x_7603 */
x_7607 = force(sink.context(), x_7607); 
if (x_7607.descriptor() != _M_Nil)
{
  break x_7621; 
}
/* #rs=x_7611 */
sink.start(_M_PairCons);
sink.copy(x_7603.ref());
sink.copy(x_7611.ref());sink.end();return true;
}x_7728:{
/* #=x_7599 */
/* #state=x_7603 */
x_7607 = force(sink.context(), x_7607); 
if (x_7607.descriptor() != _M_Cons)
{
  break x_7728; 
}
Term x_7790 = x_7607.sub(0).ref();
/* #1=x_7790 */
Term x_7811 = x_7607.sub(1).ref();
/* #s=x_7811 */
/* #rs=x_7611 */
sink.start(_M_MapM3);Term x_7888;{
BufferSink x_7889 = sink.context().makeBuffer();
x_7889.copy(x_7603.ref());
x_7888 = x_7889.term();
}Term x_7904;{
BufferSink x_7905 = sink.context().makeBuffer();
x_7905.copy(x_7790.ref());
x_7904 = x_7905.term();
}
sink.substitute(x_7599.ref(), new Variable[] { x_7593, x_7596 }, new Term[] {x_7888, x_7904});
Variable x_7934 = sink.context().makeVariable("x");
Variable x_7945 = sink.context().makeVariable("x");
sink.binds(new Variable[] { x_7934, x_7945 });Term x_7974;{
BufferSink x_7975 = sink.context().makeBuffer();
x_7975.use(x_7934);
x_7974 = x_7975.term();
}Term x_7990;{
BufferSink x_7991 = sink.context().makeBuffer();
x_7991.use(x_7945);
x_7990 = x_7991.term();
}
sink.substitute(x_7599.ref(), new Variable[] { x_7593, x_7596 }, new Term[] {x_7974, x_7990});
sink.copy(x_7811.ref());
sink.copy(x_7611.ref());sink.end();return true;
}
}
return thunk(sink, _M_MapM2, x_7593, x_7596, x_7599, x_7603, x_7607, x_7611); 
}final public static boolean _M_RemoveDuplicates(Sink sink, Term x_8062) 
{if (sink.context().sd ++ < 256) {

x_8072:{
x_8062 = force(sink.context(), x_8062); 
if (x_8062.descriptor() != _M_Nil)
{
  break x_8072; 
}
sink.start(_M_Nil);sink.end();return true;
}x_8096:{
x_8062 = force(sink.context(), x_8062); 
if (x_8062.descriptor() != _M_Cons)
{
  break x_8096; 
}
Term x_8112 = x_8062.sub(0).ref();
/* #X=x_8112 */
Term x_8130 = x_8062.sub(1).ref();
/* #XS=x_8130 */
sink.start(_M_Cons);
sink.copy(x_8112.ref());
sink.start(_M_RemoveDuplicates);
sink.start(_M_Filter);
Variable x_8263 = sink.context().makeVariable("x");
sink.binds(new Variable[] { x_8263 });
sink.start(_M_Not);
sink.start(_M_Equal);
sink.use(x_8263);
sink.copy(x_8112.ref());sink.end();sink.end();
sink.copy(x_8130.ref());sink.end();sink.end();sink.end();return true;
}
}
return thunk(sink, _M_RemoveDuplicates, x_8062); 
}final public static boolean _M_IsSingleton(Sink sink, Term x_8665) 
{if (sink.context().sd ++ < 256) {

x_8675:{
x_8665 = force(sink.context(), x_8665); 
if (x_8665.descriptor() != _M_Nil)
{
  break x_8675; 
}
sink.start(_M_FALSE);sink.end();return true;
}x_8699:{
x_8665 = force(sink.context(), x_8665); 
if (x_8665.descriptor() != _M_Cons)
{
  break x_8699; 
}
Term x_8713 = x_8665.sub(0).ref();
/* #=x_8713 */
Term x_8728 = x_8665.sub(1).ref();
/* #s=x_8728 */
sink.start(_M_IsEmpty);
sink.copy(x_8728.ref());sink.end();return true;
}
}
return thunk(sink, _M_IsSingleton, x_8665); 
}final public static boolean _M_Append(Sink sink, Term x_8781, Term x_8785) 
{if (sink.context().sd ++ < 256) {

x_8795:{
/* #x=x_8781 */
x_8785 = force(sink.context(), x_8785); 
if (x_8785.descriptor() != _M_Nil)
{
  break x_8795; 
}
sink.start(_M_Cons);
sink.copy(x_8781.ref());
sink.start(_M_Nil);sink.end();sink.end();return true;
}x_8867:{
/* #x=x_8781 */
x_8785 = force(sink.context(), x_8785); 
if (x_8785.descriptor() != _M_Cons)
{
  break x_8867; 
}
Term x_8889 = x_8785.sub(0).ref();
/* #1=x_8889 */
Term x_8904 = x_8785.sub(1).ref();
/* #s=x_8904 */
sink.start(_M_Cons);
sink.copy(x_8889.ref());
sink.start(_M_Append);
sink.copy(x_8781.ref());
sink.copy(x_8904.ref());sink.end();sink.end();return true;
}
}
return thunk(sink, _M_Append, x_8781, x_8785); 
}final public static boolean _M_IsNotEmpty(Sink sink, Term x_9054) 
{if (sink.context().sd ++ < 256) {

x_9064:{
x_9054 = force(sink.context(), x_9054); 
if (x_9054.descriptor() != _M_Nil)
{
  break x_9064; 
}
sink.start(_M_FALSE);sink.end();return true;
}x_9088:{
x_9054 = force(sink.context(), x_9054); 
if (x_9054.descriptor() != _M_Cons)
{
  break x_9088; 
}
Term x_9102 = x_9054.sub(0).ref();
/* #=x_9102 */
Term x_9117 = x_9054.sub(1).ref();
/* #s=x_9117 */
sink.start(_M_TRUE);sink.end();return true;
}
}
return thunk(sink, _M_IsNotEmpty, x_9054); 
}final public static boolean _M_Length(Sink sink, Term x_9148) 
{if (sink.context().sd ++ < 256) {

x_9158:{
/* #XS=x_9148 */
sink.start(_M_IWrapFoldlP);
Variable x_9190 = sink.context().makeVariable("x");
Variable x_9201 = sink.context().makeVariable("x");
sink.binds(new Variable[] { x_9190, x_9201 });
sink.start(_M_NumberPlus);sink.literal(1);
sink.use(x_9201);sink.end();sink.literal(0);
sink.copy(x_9148.ref());sink.end();return true;
}
}
return thunk(sink, _M_Length, x_9148); 
}final public static boolean _M_MapM(Sink sink, Variable x_9342, Variable x_9345, Term x_9348, Term x_9352, Term x_9356) 
{if (sink.context().sd ++ < 256) {

x_9366:{
/* #=x_9348 */
/* #state=x_9352 */
/* #s=x_9356 */
sink.start(_M_MapM2);
Variable x_9442 = sink.context().makeVariable("x");
Variable x_9453 = sink.context().makeVariable("x");
sink.binds(new Variable[] { x_9442, x_9453 });Term x_9482;{
BufferSink x_9483 = sink.context().makeBuffer();
x_9483.use(x_9442);
x_9482 = x_9483.term();
}Term x_9498;{
BufferSink x_9499 = sink.context().makeBuffer();
x_9499.use(x_9453);
x_9498 = x_9499.term();
}
sink.substitute(x_9348.ref(), new Variable[] { x_9342, x_9345 }, new Term[] {x_9482, x_9498});
sink.copy(x_9352.ref());
sink.copy(x_9356.ref());
sink.start(_M_Nil);sink.end();sink.end();return true;
}
}
return thunk(sink, _M_MapM, x_9342, x_9345, x_9348, x_9352, x_9356); 
}final public static boolean _M_Filter(Sink sink, Variable x_9599, Term x_9602, Term x_9606) 
{if (sink.context().sd ++ < 256) {

x_9616:{
/* #C=x_9602 */
/* #XS=x_9606 */
sink.start(_M_Foldr);
Variable x_9670 = sink.context().makeVariable("x");
Variable x_9681 = sink.context().makeVariable("x");
sink.binds(new Variable[] { x_9670, x_9681 });
sink.start(_M_ConditionalInsert);Term x_9748;{
BufferSink x_9749 = sink.context().makeBuffer();
x_9749.use(x_9670);
x_9748 = x_9749.term();
}
sink.substitute(x_9602.ref(), new Variable[] { x_9599 }, new Term[] {x_9748});
sink.use(x_9670);
sink.use(x_9681);sink.end();
sink.start(_M_Nil);sink.end();
sink.copy(x_9606.ref());sink.end();return true;
}
}
return thunk(sink, _M_Filter, x_9599, x_9602, x_9606); 
}final public static boolean _M_DelEntry(Sink sink, Term x_9909, Term x_9913) 
{if (sink.context().sd ++ < 256) {

x_9923:{
/* #Key=x_9909 */
/* #KeyValueList=x_9913 */
sink.start(_M_Filter);
Variable x_9961 = sink.context().makeVariable("x");
sink.binds(new Variable[] { x_9961 });
sink.start(_M_Not);
sink.start(_M_Equal);
sink.start(_M_Fst);
sink.use(x_9961);sink.end();
sink.copy(x_9909.ref());sink.end();sink.end();
sink.copy(x_9913.ref());sink.end();return true;
}
}
return thunk(sink, _M_DelEntry, x_9909, x_9913); 
}final public static boolean _M_LookUp(Sink sink, Term x_10272, Term x_10276) 
{if (sink.context().sd ++ < 256) {
x_10276 = normalize(sink.context(), x_10276);
x_10289:{
/* #Key=x_10272 */
/* #KeyValueList=x_10276 */
sink.start(_M_Map);
Variable x_10332 = sink.context().makeVariable("x");
sink.binds(new Variable[] { x_10332 });
sink.start(_M_Snd);
sink.use(x_10332);sink.end();
sink.start(_M_Filter);
Variable x_10457 = sink.context().makeVariable("x");
sink.binds(new Variable[] { x_10457 });
sink.start(_M_Equal);
sink.copy(x_10272.ref());
sink.start(_M_Fst);
sink.use(x_10457);sink.end();sink.end();
sink.copy(x_10276.ref());sink.end();sink.end();return true;
}
}
return thunk(sink, _M_LookUp, x_10272, x_10276); 
}final public static boolean _M_Map(Sink sink, Variable x_10754, Term x_10757, Term x_10761) 
{if (sink.context().sd ++ < 256) {

x_10771:{
/* #=x_10757 */
x_10761 = force(sink.context(), x_10761); 
if (x_10761.descriptor() != _M_Nil)
{
  break x_10771; 
}
sink.start(_M_Nil);sink.end();return true;
}x_10811:{
/* #=x_10757 */
x_10761 = force(sink.context(), x_10761); 
if (x_10761.descriptor() != _M_Cons)
{
  break x_10811; 
}
Term x_10846 = x_10761.sub(0).ref();
/* #1=x_10846 */
Term x_10864 = x_10761.sub(1).ref();
/* #s=x_10864 */
sink.start(_M_Cons);Term x_10921;{
BufferSink x_10922 = sink.context().makeBuffer();
x_10922.copy(x_10846.ref());
x_10921 = x_10922.term();
}
sink.substitute(x_10757.ref(), new Variable[] { x_10754 }, new Term[] {x_10921});
sink.start(_M_Map);
Variable x_10976 = sink.context().makeVariable("x");
sink.binds(new Variable[] { x_10976 });Term x_11017;{
BufferSink x_11018 = sink.context().makeBuffer();
x_11018.use(x_10976);
x_11017 = x_11018.term();
}
sink.substitute(x_10757.ref(), new Variable[] { x_10754 }, new Term[] {x_11017});
sink.copy(x_10864.ref());sink.end();sink.end();return true;
}
}
return thunk(sink, _M_Map, x_10754, x_10757, x_10761); 
}final public static boolean _M_Foldr(Sink sink, Variable x_11085, Variable x_11088, Term x_11091, Term x_11095, Term x_11099) 
{if (sink.context().sd ++ < 256) {

x_11109:{
/* #F=x_11091 */
/* #Z=x_11095 */
x_11099 = force(sink.context(), x_11099); 
if (x_11099.descriptor() != _M_Nil)
{
  break x_11109; 
}
sink.copy(x_11095.ref());return true;
}x_11163:{
/* #F=x_11091 */
/* #Z=x_11095 */
x_11099 = force(sink.context(), x_11099); 
if (x_11099.descriptor() != _M_Cons)
{
  break x_11163; 
}
Term x_11225 = x_11099.sub(0).ref();
/* #H=x_11225 */
Term x_11246 = x_11099.sub(1).ref();
/* #T=x_11246 */Term x_11282;{
BufferSink x_11283 = sink.context().makeBuffer();
x_11283.copy(x_11225.ref());
x_11282 = x_11283.term();
}Term x_11299;{
BufferSink x_11300 = sink.context().makeBuffer();
x_11300.start(_M_Foldr);
Variable x_11323 = x_11300.context().makeVariable("x");
Variable x_11334 = x_11300.context().makeVariable("x");
x_11300.binds(new Variable[] { x_11323, x_11334 });Term x_11363;{
BufferSink x_11364 = x_11300.context().makeBuffer();
x_11364.use(x_11323);
x_11363 = x_11364.term();
}Term x_11379;{
BufferSink x_11380 = x_11300.context().makeBuffer();
x_11380.use(x_11334);
x_11379 = x_11380.term();
}
x_11300.substitute(x_11091.ref(), new Variable[] { x_11085, x_11088 }, new Term[] {x_11363, x_11379});
x_11300.copy(x_11095.ref());
x_11300.copy(x_11246.ref());x_11300.end();
x_11299 = x_11300.term();
}
sink.substitute(x_11091.ref(), new Variable[] { x_11085, x_11088 }, new Term[] {x_11282, x_11299});return true;
}
}
return thunk(sink, _M_Foldr, x_11085, x_11088, x_11091, x_11095, x_11099); 
}

private static boolean initialized = false; 
public static void init(Context context)
{
if (!initialized) 
{
initialized = true; 

context.register(_M_Cons);
context.register(_M_Nil);

context.register(_M_IsEmpty);
context.register(_M_Zip);
context.register(_M_Null);
context.register(_M_Reverse);
context.register(_M_PickFirst);
context.register(_M_FoldlP);
context.register(_M_MatchPartition);
context.register(_M_IWrapFoldlP);
context.register(_M_Insert);
context.register(_M_ConditionalInsert);
context.register(_M_Union);
context.register(_M_Elem);
context.register(_M_Concat);
context.register(_M_Intersect);
context.register(_M_Map2);
context.register(_M_At);
context.register(_M_Tail);
context.register(_M_IfSingleton);
context.register(_M_ListEqual);
context.register(_M_Partition);
context.register(_M_Head);
context.register(_M_IfEmpty);
context.register(_M_ContainsDuplicates);
context.register(_M_Foldl);
context.register(_M_PickFirst1);
context.register(_M_Flatten);
context.register(_M_MapM3);
context.register(_M_MapM2);
context.register(_M_RemoveDuplicates);
context.register(_M_IsSingleton);
context.register(_M_Append);
context.register(_M_IsNotEmpty);
context.register(_M_Length);
context.register(_M_MapM);
context.register(_M_Filter);
context.register(_M_DelEntry);
context.register(_M_LookUp);
context.register(_M_Map);
context.register(_M_Foldr);

org.crsx.compiler.std.Num.init(context);
org.crsx.compiler.std.Pair.init(context);
org.crsx.compiler.std.Core.init(context);
}
}
}