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
	}
}
