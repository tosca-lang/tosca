// Copyright (c) 2015 IBM Corporation.

package org.crsx.runtime;

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

}
