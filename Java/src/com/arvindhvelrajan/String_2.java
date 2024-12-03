package com.arvindhvelrajan;

import static com.arvindhvelrajan.UI_Functions.*;

/**
 * @author arvindhvelrajan
 * @code This class is to demonstrate the implementation for all functions in String-2 from codingbat.com
 */
public class String_2
{
	/**
	 * This function introduces the user to the class that is being demonstrated.
	 */
	private void welcome()
	{
		System.out.println("\n\nString-2 Functions\n");
	}

	/**
	 * Given a string, return a string where for every char in the original, there are two chars.
	 *
	 * doubleChar("The") → "TThhee"
	 * doubleChar("AAbb") → "AAAAbbbb"
	 * doubleChar("Hi-There") → "HHii--TThheerree"
	 */
	public String doubleChar(String str)
	{
		throw new UnsupportedOperationException("Not supported yet.");
	}

	/**
	 * Return the number of times that the string "hi" appears anywhere in the given string.
	 *
	 * countHi("abc hi ho") → 1
	 * countHi("ABChi hi") → 2
	 * countHi("hihi") → 2
	 */
	public int countHi(String str)
	{
		throw new UnsupportedOperationException("Not supported yet.");
	}

	/**
	 * Return true if the string "cat" and "dog" appear the same number of times in the given string.
	 *
	 * catDog("catdog") → true
	 * catDog("catcat") → false
	 * catDog("1cat1cadodog") → true
	 */
	public boolean catDog(String str)
	{
		throw new UnsupportedOperationException("Not supported yet.");
	}

	/**
	 * Return the number of times that the string "code" appears anywhere in the given string,
	 * except we'll accept any letter for the 'd', so "cope" and "cooe" count.
	 *
	 * countCode("aaacodebbb") → 1
	 * countCode("codexxcode") → 2
	 * countCode("cozexxcope") → 2
	 */
	public int countCode(String str)
	{
		throw new UnsupportedOperationException("Not supported yet.");
	}

	/**
	 * Given two strings, return true if either of the strings appears at the very end of the other string,
	 * ignoring upper/lower case differences (in other words, the computation should not be "case sensitive").
	 * Note: str.toLowerCase() returns the lowercase version of a string.
	 *
	 * endOther("Hiabc", "abc") → true
	 * endOther("AbC", "HiaBc") → true
	 * endOther("abc", "abXabc") → true
	 */
	public boolean endOther(String a, String b)
	{
		throw new UnsupportedOperationException("Not supported yet.");
	}

	/**
	 * Return true if the given string contains an appearance of "xyz" where the xyz is not directly preceeded by a period (.). So "xxyz" counts but "x.xyz" does not.
	 *
	 * xyzThere("abcxyz") → true
	 * xyzThere("abc.xyz") → false
	 * xyzThere("xyz.abc") → true
	 */
	public boolean xyzThere(String str)
	{
		throw new UnsupportedOperationException("Not supported yet.");
	}

	/**
	 * @param args commandline arguments
	 */
	public void main(String[] args)
	{
		welcome();
		printFunction("doubleChar");
		System.out.println("doubleChar(\"The\") --> \"" + doubleChar("The") + "\"");
		System.out.println("doubleChar(\"AAbb\") --> \"" + doubleChar("AAbb") + "\"");
		System.out.println("doubleChar(\"Hi-There\") --> \"" + doubleChar("Hi-There") + "\"");
		System.out.println("doubleChar(\"Word!\") --> \"" + doubleChar("Word!") + "\"");
		System.out.println("doubleChar(\"!!\") --> \"" + doubleChar("!!") + "\"");
		System.out.println("doubleChar(\"\") --> \"" + doubleChar("") + "\"");
		System.out.println("doubleChar(\"a\") --> \"" + doubleChar("a") + "\"");
		System.out.println("doubleChar(\".\") --> \"" + doubleChar(".") + "\"");
		System.out.println("doubleChar(\"aa\") --> \"" + doubleChar("aa") + "\"");
		printFunction("countHi");
		System.out.println("countHi(\"abc hi ho\") --> " + countHi("abc hi ho"));
		System.out.println("countHi(\"ABChi hi\") --> " + countHi("ABChi hi"));
		System.out.println("countHi(\"hihi\") --> " + countHi("hihi"));
		System.out.println("countHi(\"hiHIhi\") --> " + countHi("hiHIhi"));
		System.out.println("countHi(\"\") --> \"" + countHi("") + "\"");
		System.out.println("countHi(\"h\") --> \"" + countHi("h") + "\"");
		System.out.println("countHi(\"hi\") --> " + countHi("hi") + "\"");
		System.out.println("countHi(\"Hi is no HI on ahI\") --> " + countHi("Hi is no HI on ahI"));
		System.out.println("countHi(\"hiho not HOHIhi\") --> " + countHi("hiho not HOHIhi"));
		printFunction("catDog");
		System.out.println("catDog(\"catdog\") --> " + catDog("catdog"));
		System.out.println("catDog(\"catcat\") --> " + catDog("catcat"));
		System.out.println("catDog(\"1cat1cadodog\") --> " + catDog("1cat1cadodog"));
		System.out.println("catDog(\"catxxdogxxxdog\") --> " + catDog("catxxdogxxxdog"));
		System.out.println("catDog(\"catxdogxdogxcat\") --> " + catDog("catxdogxdogxcat"));
		System.out.println("catDog(\"catxdogxdogxca\") --> " + catDog("catxdogxdogxca"));
		System.out.println("catDog(\"dogdogcat\") --> " + catDog("dogdogcat"));
		System.out.println("catDog(\"dogogcat\") --> " + catDog("dogogcat"));
		System.out.println("catDog(\"dog\") --> " + catDog("dog"));
		System.out.println("catDog(\"cat\") --> " + catDog("cat"));
		System.out.println("catDog(\"ca\") --> " + catDog("ca"));
		System.out.println("catDog(\"c\") --> " + catDog("c"));
		System.out.println("catDog(\"\") --> " + catDog(""));
		printFunction("countCode");
		System.out.println("countCode(\"aaacodebbb\") --> " + countCode("aaacodebbb"));
		System.out.println("countCode(\"codexxcode\") --> " + countCode("codexxcode"));
		System.out.println("countCode(\"cozexxcope\") --> " + countCode("cozexxcope"));
		System.out.println("countCode(\"cozfxxcope\") --> " + countCode("cozfxxcope"));
		System.out.println("countCode(\"xxcozeyycop\") --> " + countCode("xxcozeyycop"));
		System.out.println("countCode(\"cozcop\") --> " + countCode("cozcop"));
		System.out.println("countCode(\"abcxyz\") --> " + countCode("abcxyz"));
		System.out.println("countCode(\"code\") --> " + countCode("code"));
		System.out.println("countCode(\"ode\") --> " + countCode("ode"));
		System.out.println("countCode(\"c\") --> " + countCode("c"));
		System.out.println("countCode(\"\") --> " + countCode(""));
		System.out.println("countCode(\"AAcodeBBcoleCCccoreDD\") --> " + countCode("AAcodeBBcoleCCccoreDD"));
		System.out.println("countCode(\"AAcodeBBcoleCCccorfDD\") --> " + countCode("AAcodeBBcoleCCccorfDD"));
		System.out.println("countCode(\"coAcodeBcoleccoreDD\") --> " + countCode("coAcodeBcoleccoreDD"));
		printFunction("endOther");
		System.out.println("endOther(\"Hiabc\", \"abc\") --> " + endOther("Hiabc", "abc"));
		System.out.println("endOther(\"AbC\", \"HiaBc\") --> " + endOther("AbC", "HiaBc"));
		System.out.println("endOther(\"abc\", \"abXabc\") --> " + endOther("abc", "abXabc"));
		System.out.println("endOther(\"Hiabc\", \"abcd\") --> " + endOther("Hiabc", "abcd"));
		System.out.println("endOther(\"Hiabc\", \"bc\") --> " + endOther("Hiabc", "bc"));
		System.out.println("endOther(\"Hiabcx\", \"bc\") --> " + endOther("Hiabcx", "bc"));
		System.out.println("endOther(\"abc\", \"abc\") --> " + endOther("abc", "abc"));
		System.out.println("endOther(\"xyz\", \"12xyz\") --> " + endOther("xyz", "12xyz"));
		System.out.println("endOther(\"yz\", \"12xz\") --> " + endOther("yz", "12xz"));
		System.out.println("endOther(\"Z\", \"12xz\") --> " + endOther("Z", "12xz"));
		System.out.println("endOther(\"12\", \"12\") --> " + endOther("12", "12"));
		System.out.println("endOther(\"abcXYZ\", \"abcDEF\") --> " + endOther("abcXYZ", "abcDEF"));
		System.out.println("endOther(\"ab\", \"ab12\") --> " + endOther("ab", "ab12"));
		System.out.println("endOther(\"ab\", \"12ab\") --> " + endOther("ab", "12ab"));
	}
}
