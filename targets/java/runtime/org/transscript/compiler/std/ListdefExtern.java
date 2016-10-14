/* Copyright (c) 2016 IBM Corporation. */

package org.transscript.compiler.std;

import org.transscript.compiler.std.Listdef.List;
import org.transscript.compiler.std.Listdef._Cons;
import org.transscript.runtime.Context;
import org.transscript.runtime.Functions.Closure1;
import org.transscript.runtime.Functions.ThunkMaker;
import org.transscript.runtime.Term;

import static org.transscript.runtime.Ref.ref;

public class ListdefExtern
{

	/** Apply each item in the list to the given function */
	final public static <a extends Term, b extends Term> List<b> Map(Context context, ThunkMaker<a> tma, ThunkMaker<b> tmb, Closure1<b, a> function, List<a> list)
	{
		List<a> in = list;
		List<b> head = null;
		_Cons<b> tail = null;
		while (true)
		{
			_Cons<a> link = in.asCons(context);
			if (link == null)
				break;

			a item = ref(link.getField1(context, true));
			List<a> next = ref(link.getField2(context, true));
			in.release();

			b nitem = ref(function).eval(context, item);

			_Cons<b> c = new _Cons<>(nitem, null);
			if (head == null)
			{
				head = c;
				tail = c;
			}
			else
			{
				tail.setSub(1, c);
				tail = c;
			}

			in = next;
		}
		if (head == null)
			head = Listdef.Nil(context);
		else
			tail.setSub(1, Listdef.Nil(context));

		function.release();
		return head;
	}
}