// Copyright (c) 2015 IBM Corporation.

package org.transscript.runtime.utils;

import java.io.IOException;

/**
 * Collection of static utility methods related to string manipulation.
 * 
 * @author Lionel Villard
 * @author Kristoffer Rose
 */
public class StringUtils
{

	/**
	 * Append unescaped characters from string.
	 * @param appendable to append to
	 * @param stringWithEscapes text to append after resolving escape sequences
	 * @param begin index of first character to output
	 * @param end index of character just after last to output
	 * @param quote character for which two consecutive copies are reduced to one
	 * @throws IOException if there is an output error
	 */
	public static void appendUnescaped(Appendable appendable, String stringWithEscapes, int begin, int end, char quote)
			throws IOException
	{
		if (stringWithEscapes == null)
			return;

		for (int i = begin; i < end; ++i)
		{
			char c = stringWithEscapes.charAt(i);
			if (c == quote)
			{
				// Possibly repeated quote.
				c = stringWithEscapes.charAt(++i);
				if (c != quote)
					appendable.append(quote); // not a repeated quote so echo the quote and continue...
			}
			if (c == '\\')
			{
				// Escape characters.
				switch (c = stringWithEscapes.charAt(++i))
				{
					case 'b' :
						appendable.append('\b');
						break;
					case 't' :
						appendable.append('\t');
						break;
					case 'n' :
						appendable.append('\n');
						break;
					case 'f' :
						appendable.append('\f');
						break;
					case 'r' :
						appendable.append('\r');
						break;

					case '0' :
					case '1' :
					case '2' :
					case '3' :
						appendable.append((char) Integer.parseInt(stringWithEscapes.substring(i, i + 3), 8));
						i += 3;
						break;

					case 'u' : {
						String sub = (stringWithEscapes.length() - i < 5
								? stringWithEscapes.substring(i + 1)
								: stringWithEscapes.substring(i + 1, i + 5));
						appendable.append((char) Integer.parseInt(sub, 16));
						i += sub.length();
						break;
					}

					case 'U' : {
						int codePoint = Integer.parseInt(stringWithEscapes.substring(i + 1, i + 9), 16);
						i += 8;
						char[] chars = Character.toChars(codePoint);
						for (char surrogate : chars)
							appendable.append(surrogate);
						break;
					}

					default :
						appendable.append(c);
						if (Character.isHighSurrogate(c))
							appendable.append(c = stringWithEscapes.charAt(++i));
				}
			}
			else
			{
				appendable.append(c);
				if (Character.isHighSurrogate(c))
					appendable.append(c = stringWithEscapes.charAt(++i));
			}
		}
	}

	/**
	 * Generalized quote remover.
	 * <ol>
	 * <li>Removes leading and trailing spaces.
	 * <li>Removes one quote character from each end.
	 * <li>
	 * </ol>
	 * @param quotedString
	 * @return
	 */
	public static String unquoteJava(String quotedString)
	{
		if (quotedString == null || quotedString.length() == 0)
			return "";
		quotedString = quotedString.trim();
		assert quotedString.length() >= 2;
		char quote = quotedString.charAt(0);
		switch (quote)
		{
			case '\'' :
			case '"' :
				assert quote == quotedString.charAt(quotedString.length() - 1) : "Bad Java string: " + quotedString;
				break;
		}
		StringBuilder b = new StringBuilder();
		try
		{
			appendUnescaped(b, quotedString, 1, quotedString.length() - 1, quote);
		}
		catch (IOException e)
		{
			assert false : "Unexpected exception: " + e.getMessage();
		}
		return b.toString();
	}

	/** 
	 * Convert string to Java/C identifier form   
	 */
	public static String mangle2(String s)
	{
		StringBuilder b = new StringBuilder();
		final int n = s.length();
		for (int i = 0; i < n; ++i)
		{
			char c = s.charAt(i);
			switch (c)
			{
				case '-' : {
					if (i + 1 >= s.length() || ('A' <= s.charAt(i + 1) && s.charAt(i + 1) <= 'Z'))
						b.append("_");
					else
						b.append("__");
					break;
				}
				case '_' :
					b.append("_x");
					break;
				case '~' :
					b.append("_w");
					break;
				case '$' :
					b.append("_s");
					break;
				case '#' :
					b.append("_h");
					break;
				default :
					if (c <= '~')
					{
						if (Character.isJavaIdentifierPart(c))
							b.append(c);
						else
							b.append("_" + hex(c, "00").toLowerCase());
					}
					else
						b.append("_u" + hex(c, "0000").toLowerCase());
			}
		}
		return b.toString();
	}

	/** 
	 * Convert string to Java-compatible source form. 
	 * */
	public static String quoteJava(String s)
	{
		StringBuilder b = new StringBuilder();
		b.append('"');
		quoteJavaContent(s, b);
		b.append('"');
		return b.toString();
	}

	/** 
	 * Convert string to Java-compatible source form. 
	 */
	public static void quoteJavaContent(String s, StringBuilder b)
	{
		for (int i = 0; i < s.length(); ++i)
		{
			char c = s.charAt(i);
			if (Character.isHighSurrogate(c))
			{
				int codepoint = Character.codePointAt(s, i++);
				if (codepoint < 0xFFFF)
					b.append("\\u" + hex(codepoint, "0000"));
				else
					b.append("\\U" + hex(codepoint, "00000000"));
			}
			else
				quotedJavaChar(c, b);
		}
	}

	/**
	 * Convert character to Java-compatible source form for use in a string.
	 * @param c character
	 * @param b stream to append to
	 */
	public static void quotedJavaChar(char c, StringBuilder b)
	{
		switch (c)
		{
			case '\b' :
				b.append("\\b");
				break;
			case '\t' :
				b.append("\\t");
				break;
			case '\n' :
				b.append("\\n");
				break;
			case '\f' :
				b.append("\\f");
				break;
			case '\r' :
				b.append("\\r");
				break;
			case '\'' :
				b.append("\\'");
				break;
			case '\"' :
				b.append("\\\"");
				break;
			case '\\' :
				b.append("\\\\");
				break;
			default :
				if (Character.isISOControl(c))
					b.append("\\" + octal((int) c, "000"));
				else if (c <= '~')
					b.append(c);
				else
					b.append("\\u" + hex((int) c, "0000"));
		}
	}

	/** 
	 * Return hex string for character inserted right adjusted in template. 
	 */
	public static String hex(int c, String template)
	{
		String s = Integer.toHexString(c);
		return template.substring(s.length()) + s;
	}

	/**
	 *  Return octal string for character inserted right adjusted in template. 
	 */
	public static String octal(int c, String template)
	{
		String s = Integer.toOctalString(c);
		return template.substring(s.length()) + s;
	}
}
