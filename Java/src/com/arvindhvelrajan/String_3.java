package com.arvindhvelrajan;

import static com.arvindhvelrajan.UI_Functions.*;

/**
 * @author arvindhvelrajan
 * @code This class is to demonstrate the implementation for all functions in String-3 from codingbat.com
 */
public class String_3
{
	/**
	 * This function introduces the user to the class that is being demonstrated.
	 */
	private void welcome()
	{
		System.out.println("\n\nString-3 Functions\n");
	}

	/**
	 * Given a string, count the number of words ending in 'y' or 'z' -- so the 'y' in "heavy" and
	 * the 'z' in "fez" count, but not the 'y' in "yellow" (not case sensitive).
	 * We'll say that a y or z is at the end of a word if there is not an alphabetic letter immediately following it.
	 * (Note: Character.isLetter(char) tests if a char is an alphabetic letter.)
	 *
	 * countYZ("fez day") → 2
	 * countYZ("day fez") → 2
	 * countYZ("day fyyyz") → 2
	 */
	public int countYZ(String str)
	{
		throw new UnsupportedOperationException("Not supported yet.");
	}

	/**
	 * Given two strings, base and remove, return a version of the base string where all instances of the remove string
	 * have been removed (not case sensitive). You may assume that the remove string is length 1 or more.
	 * Remove only non-overlapping instances, so with "xxx" removing "xx" leaves "x".
	 *
	 * withoutString("Hello there", "llo") → "He there"
	 * withoutString("Hello there", "e") → "Hllo thr"
	 * withoutString("Hello there", "x") → "Hello there"
	 */
	public String withoutString(String base, String remove)
	{
		throw new UnsupportedOperationException("Not supported yet.");
	}

	/**
	 * Given a string, return true if the number of appearances of "is" anywhere in the string is equal to the number of
	 * appearances of "not" anywhere in the string (case sensitive).
	 *
	 * equalIsNot("This is not") → false
	 * equalIsNot("This is notnot") → true
	 * equalIsNot("noisxxnotyynotxisi") → true
	 */
	public boolean equalIsNot(String str)
	{
		throw new UnsupportedOperationException("Not supported yet.");
	}

	/**
	 * We'll say that a lowercase 'g' in a string is "happy" if there is another 'g' immediately to its left or right.
	 * Return true if all the g's in the given string are happy.
	 *
	 * gHappy("xxggxx") → true
	 * gHappy("xxgxx") → false
	 * gHappy("xxggyygxx") → false
	 */
	public boolean gHappy(String str)
	{
		throw new UnsupportedOperationException("Not supported yet.");
	}

	/**
	 * We'll say that a "triple" in a string is a char appearing three times in a row.
	 * Return the number of triples in the given string. The triples may overlap.
	 *
	 * countTriple("abcXXXabc") → 1
	 * countTriple("xxxabyyyycd") → 3
	 * countTriple("a") → 0
	 */
	public int countTriple(String str)
	{
		throw new UnsupportedOperationException("Not supported yet.");
	}

	/**
	 * Given a string, return the sum of the digits 0-9 that appear in the string,
	 * ignoring all other characters. Return 0 if there are no digits in the string.
	 * (Note: Character.isDigit(char) tests if a char is one of the chars '0', '1', .. '9'.
	 * Integer.parseInt(string) converts a string to an int.)
	 *
	 * sumDigits("aa1bc2d3") → 6
	 * sumDigits("aa11b33") → 8
	 * sumDigits("Chocolate") → 0
	 */
	public int sumDigits(String str)
	{
		throw new UnsupportedOperationException("Not supported yet.");
	}

	/**
	 * Given a string, return the longest substring that appears at both the beginning and end of the string without
	 * overlapping. For example, sameEnds("abXab") is "ab".
	 *
	 * sameEnds("abXYab") → "ab"
	 * sameEnds("xx") → "x"
	 * sameEnds("xxx") → "x"
	 */
	public String sameEnds(String string)
	{
		throw new UnsupportedOperationException("Not supported yet.");
	}

	/**
	 * @param args commandline arguments
	 */
	public void main(String[] args)
	{
		welcome();
		printFunction("countYZ");
		System.out.println("countYZ(\"fez day\") → " + countYZ("fez day"));
		System.out.println("countYZ(\"day fez\") → " + countYZ("day fez"));
		System.out.println("countYZ(\"day fyyyz\") → " + countYZ("day fyyyz"));
		System.out.println("countYZ(\"day yak\") → " + countYZ("day yak"));
		System.out.println("countYZ(\"day:yak\") → " + countYZ("day:yak"));
		System.out.println("countYZ(\"!!day--yaz!!\") → " + countYZ("!!day--yaz!!"));
		System.out.println("countYZ(\"yak zak\") → " + countYZ("yak zak"));
		System.out.println("countYZ(\"DAY abc XYZ\") → " + countYZ("DAY abc XYZ"));
		System.out.println("countYZ(\"aaz yyz my\") → " + countYZ("aaz yyz my"));
		System.out.println("countYZ(\"y2bz\") → " + countYZ("y2bz"));
		System.out.println("countYZ(\"zxyx\") → " + countYZ("zxyx"));
		printFunction("withoutString");
		System.out.println("withoutString(\"Hello there\", \"llo\") → \"" + withoutString("Hello there", "llo") + "\"");
		System.out.println("withoutString(\"Hello there\", \"e\") → \"" + withoutString("Hello there", "e") + "\"");
		System.out.println("withoutString(\"Hello there\", \"x\") → \"" + withoutString("Hello there", "x") + "\"");
		System.out.println("withoutString(\"There is a FISH\", \"IS\") → \"" + withoutString("There is a FISH", "IS") + "\"");
		System.out.println("withoutString(\"THIS is a FISH\", \"is\") → \"" + withoutString("THIS is a FISH", "is") + "\"");
		System.out.println("withoutString(\"THIS is a FISH\", \"iS\") → \"" + withoutString("THIS is a FISH", "iS") + "\"");
		System.out.println("withoutString(\"abxxxxab\", \"xx\") → \"" + withoutString("abxxxxab", "xx") + "\"");
		System.out.println("withoutString(\"abxxxab\", \"xx\") → \"" + withoutString("abxxxab", "xx") + "\"");
		System.out.println("withoutString(\"abxxxab\", \"x\") → \"" + withoutString("abxxxab", "x") + "\"");
		System.out.println("withoutString(\"xxx\", \"x\") → \"" + withoutString("xxx", "x") + "\"");
		System.out.println("withoutString(\"xxx\", \"xx\") → \"" + withoutString("xxx", "xx") + "\"");
		System.out.println("withoutString(\"xyzzy\", \"Y\") → \"" + withoutString("xyzzy", "Y") + "\"");
		System.out.println("withoutString(\"\", \"x\") → \"" + withoutString("", "x") + "\"");
		System.out.println("withoutString(\"abcabc\", \"b\") → \"" + withoutString("abcabc", "b") + "\"");
		System.out.println("withoutString(\"AA22bb\", \"2\") → \"" + withoutString("AA22bb", "2") + "\"");
		System.out.println("withoutString(\"1111\", \"1\") → \"" + withoutString("1111", "1") + "\"");
		System.out.println("withoutString(\"1111\", \"11\") → \"" + withoutString("1111", "11") + "\"");
		System.out.println("withoutString(\"MkjtMkx\", \"Mk\") → \"" + withoutString("MkjtMkx", "Mk") + "\"");
		System.out.println("withoutString(\"Hi HoHo\", \"Ho\") → \"" + withoutString("Hi HoHo", "Ho") + "\"");
		printFunction("equalIsNot");
		System.out.println("equalIsNot(\"This is not\") → " + equalIsNot("This is not"));
		System.out.println("equalIsNot(\"This is notnot\") → " + equalIsNot("This is notnot"));
		System.out.println("equalIsNot(\"noisxxnotyynotxisi\") → " + equalIsNot("noisxxnotyynotxisi"));
		System.out.println("equalIsNot(\"noisxxnotyynotxsi\") → " + equalIsNot("noisxxnotyynotxsi"));
		System.out.println("equalIsNot(\"xxxyyyzzzintint\") → " + equalIsNot("xxxyyyzzzintint"));
		System.out.println("equalIsNot(\"\") → " + equalIsNot(""));
		System.out.println("equalIsNot(\"isisnotnot\") → " + equalIsNot("isisnotnot"));
		System.out.println("equalIsNot(\"isisnotno7Not\") → " + equalIsNot("isisnotno7Not"));
		System.out.println("equalIsNot(\"isnotis\") → " + equalIsNot("isnotis"));
		System.out.println("equalIsNot(\"mis3notpotbotis\") → " + equalIsNot("mis3notpotbotis"));
		printFunction("gHappy");
		System.out.println("gHappy(\"xxggxx\") → " + gHappy("xxggxx"));
		System.out.println("gHappy(\"xxgxx\") → " + gHappy("xxgxx"));
		System.out.println("gHappy(\"xxggyygxx\") → " + gHappy("xxggyygxx"));
		System.out.println("gHappy(\"g\") → " + gHappy("g"));
		System.out.println("gHappy(\"gg\") → " + gHappy("gg"));
		System.out.println("gHappy(\"\") → " + gHappy(""));
		System.out.println("gHappy(\"xxgggxyz\") → " + gHappy("xxgggxyz"));
		System.out.println("gHappy(\"xxgggxyg\") → " + gHappy("xxgggxyg"));
		System.out.println("gHappy(\"xxgggxygg\") → " + gHappy("xxgggxygg"));
		System.out.println("gHappy(\"mgm\") → " + gHappy("mgm"));
		System.out.println("gHappy(\"mggm\") → " + gHappy("mggm"));
		System.out.println("gHappy(\"yyygggxyy\") → " + gHappy("yyygggxyy"));
		printFunction("countTriple");
		System.out.println("countTriple(\"abcXXXabc\") → " + countTriple("abcXXXabc"));
		System.out.println("countTriple(\"xxxabyyyycd\") → " + countTriple("xxxabyyycd"));
		System.out.println("countTriple(\"a\") → " + countTriple("a"));
		System.out.println("countTriple(\"\") → " + countTriple(""));
		System.out.println("countTriple(\"XXXabc\") → " + countTriple("XXXabc"));
		System.out.println("countTriple(\"XXXXabc\") → " + countTriple("XXXXabc"));
		System.out.println("countTriple(\"XXXXXabc\") → " + countTriple("XXXXXabc"));
		System.out.println("countTriple(\"222abyyycdXXX\") → " + countTriple("222abyyycd"));
		System.out.println("countTriple(\"abYYYabXXXXXab\") → " + countTriple("abYYYabXXXXXab"));
		System.out.println("countTriple(\"abYYXabXXYXXab\") → " + countTriple("abYYXabXXYXXab"));
		System.out.println("countTriple(\"abYYXabXXYXXab\") → " + countTriple("abYYXabXXYXXab"));
		System.out.println("countTriple(\"122abhhh2\") → " + countTriple("122abhhh2"));
		printFunction("sumDigits");
		System.out.println("sumDigits(\"aa1bc2d3\") → " + sumDigits("aa1bc2d3"));
		System.out.println("sumDigits(\"aa11b33\") → " + sumDigits("aa11b33"));
		System.out.println("sumDigits(\"Chocolate\") → " + sumDigits("Chocolate"));
		System.out.println("sumDigits(\"5hoco1a1e\") → " + sumDigits("5hoco1a1e"));
		System.out.println("sumDigits(\"123abc123\") → " + sumDigits("123abc123"));
		System.out.println("sumDigits(\"\") → " + sumDigits(""));
		System.out.println("sumDigits(\"Hello\") → " + sumDigits("Hello"));
		System.out.println("sumDigits(\"X1z9b2\") → " + sumDigits("X1z9b2"));
		System.out.println("sumDigits(\"5432a\") → " + sumDigits("5432a"));
	}
}
