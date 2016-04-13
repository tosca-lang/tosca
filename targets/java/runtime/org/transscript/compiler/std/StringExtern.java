
package org.transscript.compiler.std;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.StringReader;

import org.transscript.runtime.BufferSink;
import org.transscript.runtime.Construction;
import org.transscript.runtime.Context;
import org.transscript.runtime.Normalizer;
import org.transscript.runtime.Parser;
import org.transscript.runtime.ParsingUtils;
import org.transscript.runtime.Sink;
import org.transscript.runtime.StringUtils;
import org.transscript.runtime.Term;
 

public class StringExtern
{
	
//
//	public static StringTerm Rescape(Context context, StringTerm x_634)
//	{
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	public static StringTerm AfterFirst(Context context, StringTerm x_645, StringTerm x_650)
//	{
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	public static StringTerm Mangle(Context context, StringTerm x_661, StringTerm x_665, StringTerm x_669)
//	{
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	public static Bool StartsWith(Context context, StringTerm x_679, StringTerm x_683)
//	{
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	public static <a extends org.transscript.runtime.v2.Term> a ParseText(Context context, StringTerm x_695, StringTerm x_700)
//	{
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	public static StringTerm BeforeFirst(Context context, StringTerm x_711, StringTerm x_716)
//	{
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	public static <a extends org.transscript.runtime.v2.Term> a ParseResource(Context context, StringTerm x_1259, StringTerm x_1264)
//	{
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	public static StringTerm UpCase(Context context, StringTerm x_1275)
//	{
//		// TODO Auto-generated method stub
//		return null;
//	}
////
////	public static TransScript_term_sort ParseToMetaTerm(Context context, StringTerm x_1286, StringTerm x_1291)
////	{
////		// TODO Auto-generated method stub
////		return null;
////	}
//
//	public static StringTerm Substring(Context context, StringTerm x_1302, DoubleTerm x_1307, DoubleTerm x_1312)
//	{
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	public static StringTerm Escape(Context context, StringTerm x_1323, StringTerm x_1327, StringTerm x_1331)
//	{
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	public static StringTerm Replace(Context context, StringTerm x_1341, StringTerm x_1346, StringTerm x_1351)
//	{
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	public static StringTerm Trim(Context context, StringTerm x_2016)
//	{
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	public static StringTerm ConcatString(Context context, StringTerm x_2236, StringTerm x_2240)
//	{
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	public static StringTerm DownCase(Context context, StringTerm x_2717)
//	{
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	public static a ParseTerm(Context context, StringTerm x_2730)
//	{
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	public static DoubleTerm Length(Context context, StringTerm x_2741)
//	{
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	public static StringTerm FormatNumber(Context context, DoubleTerm x_2751)
//	{
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	public static Bool StringEqual(Context context, StringTerm x_2761, StringTerm x_2765)
//	{
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	public static Bool Contains(Context context, StringTerm x_2844, StringTerm x_2848)
//	{
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	public static Bool EndsWith(Context context, StringTerm x_3372, StringTerm x_3376)
//	{
//		// TODO Auto-generated method stub
//		return null;
//	}


	final public static boolean _M_EndsWith(Sink sink, Term string, Term suffix)
	{
		final Context context = sink.context();
		string = Normalizer.normalize(context, string);
		suffix = Normalizer.normalize(context, suffix);

		if (!Construction.isConstant(string) || !Construction.isConstant(suffix))
			throw new RuntimeException("Invalid argument in EndsWith");

		sink.start(string.symbol().endsWith(suffix.symbol()) ? Core._M_TRUE : Core._M_FALSE).end();

		string.release();
		suffix.release();
		return true;
	}

	final public static boolean _M_StartsWith(Sink sink, Term string, Term prefix)
	{
		final Context context = sink.context();
		string = Normalizer.normalize(context, string);
		prefix = Normalizer.normalize(context, prefix);

		if (!Construction.isConstant(string) || !Construction.isConstant(prefix))
			throw new RuntimeException("Invalid argument in StartsWith");

		sink.start(string.symbol().startsWith(prefix.symbol()) ? Core._M_TRUE : Core._M_FALSE).end();

		string.release();
		prefix.release();
		return true;
	}

	final public static boolean _M_Contains(Sink sink, Term string, Term search)
	{
		final Context context = sink.context();
		string = Normalizer.normalize(context, string);
		search = Normalizer.normalize(context, search);

		if (!Construction.isConstant(string) || !Construction.isConstant(search))
			throw new RuntimeException("Invalid argument in StartsWith");

		sink.start(string.symbol().contains(search.symbol()) ? Core._M_TRUE : Core._M_FALSE).end();

		string.release();
		search.release();
		return true;
	}

	final public static boolean _M_StringEqual(Sink sink, Term str1, Term str2)
	{
		final Context context = sink.context();
		str1 = Normalizer.normalize(context, str1);
		str2 = Normalizer.normalize(context, str2);

		if (!Construction.isConstant(str1) || !Construction.isConstant(str2))
			throw new RuntimeException("Invalid argument in StringEqual");

		sink.start(str1.symbol().equals(str2.symbol()) ? Core._M_TRUE : Core._M_FALSE).end();

		str1.release();
		str2.release();
		return true;
	}

	final public static boolean _M_FormatNumber(Sink sink, Term num)
	{
		final Context context = sink.context();
		num = Normalizer.normalize(context, num);

		if (Construction.isConstant(num))
		{
			sink.literal(num.symbol());

			num.release();
			return true;

		}
		return Normalizer.thunk(sink, String._M_FormatNumber, num);
	}

	final public static boolean _M_Length(Sink sink, Term str)
	{
		final Context context = sink.context();
		str = Normalizer.normalize(context, str);

		if (!Construction.isConstant(str))
			throw new RuntimeException("Invalid argument in Length");

		sink.literal(str.symbol().length());

		str.release();
		return true;
	}

	final public static boolean _M_DownCase(Sink sink, Term str)
	{
		final Context context = sink.context();
		str = Normalizer.normalize(context, str);

		if (!Construction.isConstant(str))
			throw new RuntimeException("Invalid argument in DownCase");

		sink.literal(str.symbol().toLowerCase());

		str.release();
		return true;
	}

	final public static boolean _M_UpCase(Sink sink, Term str)
	{
		final Context context = sink.context();
		str = Normalizer.normalize(context, str);

		if (!Construction.isConstant(str))
			throw new RuntimeException("Invalid argument in UpCase");

		sink.literal(str.symbol().toUpperCase());

		str.release();
		return true;
	}

	final public static boolean _M_Trim(Sink sink, Term str)
	{
		final Context context = sink.context();
		str = Normalizer.normalize(context, str);

		if (!Construction.isConstant(str))
			throw new RuntimeException("Invalid argument in Trim");

		sink.literal(str.symbol().trim());

		str.release();
		return true;
	}

	final public static boolean _M_Mangle(Sink sink, Term str)
	{
		final Context context = sink.context();
		str = Normalizer.normalize(context, str);

		if (!Construction.isConstant(str))
			throw new RuntimeException("Invalid argument in Mangle");

		sink.literal(StringUtils.mangle(str.symbol()));

		str.release();
		return true;
	}

	final public static boolean _M_Rescape(Sink sink, Term str)
	{
		final Context context = sink.context();
		str = Normalizer.normalize(context, str);

		if (!Construction.isConstant(str))
			throw new RuntimeException("Invalid argument in Rescape");

		sink.literal(StringUtils.unquoteJava(str.symbol()));

		str.release();
		return true;
	}

	final public static boolean _M_Escape(Sink sink, Term str)
	{
		final Context context = sink.context();
		str = Normalizer.normalize(context, str);

		if (!Construction.isConstant(str))
			throw new RuntimeException("Invalid argument in Rescape");

		sink.literal(StringUtils.quoteJava(str.symbol()));

		str.release();
		return true;
	}

	final public static boolean _M_Replace(Sink sink, Term str, Term from, Term to)
	{
		final Context context = sink.context();
		str = Normalizer.normalize(context, str);
		from = Normalizer.normalize(context, from);
		to = Normalizer.normalize(context, to);

		if (!Construction.isConstant(str) || !Construction.isConstant(from) || !Construction.isConstant(to))
			throw new RuntimeException("Invalid argument in Replace");

		sink.literal(str.symbol().replace(from.symbol(), to.symbol()));

		str.release();
		from.release();
		to.release();
		return true;
	}

	final public static boolean _M_Substring(Sink sink, Term str, Term start, Term end)
	{
		final Context context = sink.context();
		str = Normalizer.normalize(context, str);
		start = Normalizer.normalize(context, start);

		if (!Construction.isConstant(str) || !Construction.isConstant(start))
			throw new RuntimeException("Invalid argument in Substring");

		if (end != null)
		{
			end = Normalizer.normalize(context, end);
			if (!Construction.isConstant(end))
				throw new RuntimeException("Invalid argument in Substring");
		}

		java.lang.String pre = str.symbol();
		int s = Integer.parseInt(start.symbol());
		int e = end == null ? pre.length() : Integer.parseInt(end.symbol());

		sink.literal(s < e ? pre.substring(s, e) : "");

		str.release();
		start.release();
		if (end != null)
			end.release();
		return true;
	}

	final public static boolean _M_BeforeFirst(Sink sink, Term str, Term first)
	{
		final Context context = sink.context();
		str = Normalizer.normalize(context, str);
		first = Normalizer.normalize(context, first);

		if (!Construction.isConstant(str) || !Construction.isConstant(first))
			throw new RuntimeException("Invalid argument in BeforeFirst");

		int index = str.symbol().indexOf(first.symbol());
		if (index == -1)
		{
			sink.literal("");
		}
		else
			sink.literal(str.symbol().substring(0, index));

		str.release();
		first.release();
		return true;
	}

	final public static boolean _M_AfterFirst(Sink sink, Term str, Term first)
	{
		final Context context = sink.context();
		str = Normalizer.normalize(context, str);
		first = Normalizer.normalize(context, first);

		if (!Construction.isConstant(str) || !Construction.isConstant(first))
			throw new RuntimeException("Invalid argument in Replace");

		int index = str.symbol().indexOf(first.symbol());
		if (index == -1)
		{
			sink.literal("");
		}
		else
			sink.literal(str.symbol().substring(index + first.symbol().length()));

		str.release();
		first.release();
		return true;
	}

	final public static boolean _M_ConcatString(Sink sink, Term str1, Term str2)
	{
		final Context context = sink.context();
		str1 = Normalizer.normalize(context, str1);
		str2 = Normalizer.normalize(context, str2);

		if (!Construction.isConstant(str1) || !Construction.isConstant(str2))
			throw new RuntimeException("Invalid argument in ConcatString");

		sink.literal(str1.symbol() + str2.symbol());

		str1.release();
		str2.release();
		return true;
	}

	final public static boolean _M_ParseResource(Sink sink, Term term1, Term term2)
	{
		final Context context = sink.context();
		final java.lang.String category = Normalizer.normalize(context, term1).symbol();
		final java.lang.String name = Normalizer.normalize(context, term2).symbol();

		Parser parser = context.getParser(category, false);
		if (parser == null)
			throw new RuntimeException("Fatal error: no parser found for category " + category);

		try
		{
			parser.parse(sink, category, new FileReader(name), null, 0, 0, null);
		}
		catch (FileNotFoundException e)
		{
			throw new RuntimeException("Fatal error: file not found " + name);
		}

		term1.release();
		term2.release();
		return true;
	}

	final public static boolean _M_ParseText(Sink sink, Term term1, Term term2)
	{
		final Context context = sink.context();
		final java.lang.String category = Normalizer.normalize(context, term1).symbol();
		final java.lang.String text = Normalizer.normalize(context, term2).symbol();

		Parser parser = context.getParser(category, false);
		if (parser == null)
			throw new RuntimeException("Fatal error: no parser found for category " + category);

		parser.parse(sink, category, new StringReader(text), null, 0, 0, null);

		term1.release();
		term2.release();
		return true;
	}

	final public static boolean _M_ParseToMetaTerm(Sink sink, Term term1, Term term2)
	{
		final Context context = sink.context();
		final java.lang.String category = Normalizer.normalize(context, term1).symbol();
		final java.lang.String text = Normalizer.normalize(context, term2).symbol();

		Parser parser = context.getParser(category, true); // Get latest boot parser.
		if (parser == null)
			throw new RuntimeException("Fatal error: no parser found for category " + category);
		
		BufferSink parsed = context.makeBuffer();
		try
		{
			parser.parse(parsed, category, new StringReader(text), null, 0, 0, null);
		}
		catch (RuntimeException e)
		{
			System.err.println("Error while parsing: " + text);
			throw e;
		}
		Term result = parsed.term();
		java.lang.String textResult = result.toString4();
		//	System.out.println(textResult);
		parser = context.getParser("term", false);
		parser.parse(sink, "term", new StringReader(textResult), null, 0, 0, null);

		term1.release();
		term2.release();
		return true;
	}

	final public static boolean _M_ParseTerm(Sink sink, Term term1)
	{
		final Context context = sink.context();
		final java.lang.String inputname = Normalizer.normalize(context, term1).symbol();

		try
		{
			ParsingUtils.parseTerm(sink, inputname);
		}
		catch (IOException e)
		{
			throw new RuntimeException(e);
		}

		term1.release();
		return true;
	}

}
