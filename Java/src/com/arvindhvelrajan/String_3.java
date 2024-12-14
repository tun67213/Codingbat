package com.arvindhvelrajan;

import static com.arvindhvelrajan.UI_Functions.*;
import java.util.List;
import java.util.ArrayList;

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
		List<String> list = splitString(str);
		int count = 0;
		for(String currentString : list)
		{
			if(currentString.endsWith("y") || currentString.endsWith("z"))
			{
				count++;
			}
		}
		return count;
	}
	/**
	 * This is a helper function to split the String into a List of words.
	 */
	private List<String> splitString(String str)
	{
		str = str.toLowerCase();
		List<String> list = new ArrayList<>();
		String currentWord = "";
		for(int i = 0; i < str.length(); i++)
		{
			if(Character.isLetter(str.charAt(i)))
			{
				currentWord += str.substring(i, i + 1);
			}
			else if(!currentWord.isEmpty())
			{
				list.add(currentWord);
				currentWord = "";
			}
		}
		if(!currentWord.isEmpty())
		{
			list.add(currentWord);
		}
		return list;
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
		String newBase = base.toLowerCase();
		String newRemove = remove.toLowerCase();
		StringBuilder newWord = new StringBuilder();

		int i = 0;
		while(i < base.length())
		{
			if(i + remove.length() <= base.length() && newBase.substring(i, i + remove.length()).equals(newRemove))
			{
				i += remove.length();
			}
			else
			{
				newWord.append(base.charAt(i));
				i++;
			}
		}
		return newWord.toString();
	}
	/**
	 * The following is a recursive algorithm for the withoutString() method above.
	 */
	private String withoutStringRecursive(String base, String remove)
	{
		if(base.isEmpty() || remove.isEmpty() || base.length() < remove.length())
		{
			return base;
		}
		String newBase = base.toLowerCase(), newRemove = remove.toLowerCase();
		if(newBase.startsWith(newRemove))
		{
			return withoutStringRecursive(base.substring(remove.length()), remove);
		}
		return base.charAt(0) + withoutStringRecursive(base.substring(1), remove);
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
		if(str.length() <= 1)
		{
			return true;
		}
		int countIs = 0, countNot = 0;
		for(int i = 0; i < str.length() - 2; i++)
		{
			if(str.substring(i, i + 2).equals("is"))
			{
				countIs++;
			}
			if(str.substring(i, i + 3).equals("not"))
			{
				countNot++;
			}
		}
		if(str.endsWith("is"))
		{
			countIs++;
		}
		return countIs == countNot;
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
		if(str.isEmpty())
		{
			return true;
		}
		if(str.length() == 1)
		{
			return !(str.equals("g"));
		}
		if(str.length() == 2)
		{
			if(str.charAt(0) == 'g' || str.charAt(1) == 'g')
			{
				return str.equals("gg");
			}
			return true;
		}
		if(str.charAt(0) == 'g' && !(str.charAt(1) == 'g'))
		{
			return false;
		}
		for(int i = 1; i < str.length() - 1; i++)
		{
			if(str.charAt(i) == 'g' && !(str.charAt(i - 1) == 'g' || str.charAt(i + 1) == 'g'))
			{
				return false;
			}
		}
		if(str.charAt(str.length() - 1) == 'g')
		{
			return str.charAt(str.length() - 2) == 'g';
		}
		return true;
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
		int count = 0;
		for(int i = 0; i < str.length() - 2; i++)
		{
			if(str.charAt(i) == str.charAt(i + 1) && str.charAt(i) == str.charAt(i + 2))
			{
				count++;
			}
		}
		return count;
	}
	/**
	 * The following is a recursive implementation for the method countTriple().
	 */
	private int countTripleRecursive(String str)
	{
		if(str.length() <= 2)
		{
			return 0;
		}
		if(str.charAt(0) == str.charAt(1) && str.charAt(0) == str.charAt(2))
		{
			return 1 + countTripleRecursive(str.substring(1));
		}
		return countTripleRecursive(str.substring(1));
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
		int sum = 0;
		for(int i = 0; i < str.length(); i++)
		{
			if(Character.isDigit(str.charAt(i)))
			{
				sum += Integer.parseInt(str.substring(i, i + 1));
			}
		}
		return sum;
	}
	/**
	 * The following is a recursive implementation of sumDigits().
	 */
	private int sumDigitsRecursive(String str)
	{
		if(str.isEmpty())
		{
			return 0;
		}
		if(Character.isDigit(str.charAt(0)))
		{
			return Integer.parseInt(str.substring(0, 1)) + sumDigitsRecursive(str.substring(1));
		}
		return sumDigitsRecursive(str.substring(1));
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
		int rightNow = string.length() / 2;
		while(!string.substring(0, rightNow).equals(string.substring(string.length() - rightNow)))
		{
			rightNow--;
		}
		if(rightNow <= 0)
		{
			return "";
		}
		return string.substring(0, rightNow);
	}

	/**
	 * Given a string, look for a mirror image (backwards) string at both the beginning and end of the given string.
	 * In other words, zero or more characters at the very begining of the given string, and at the very end of the
	 * string in reverse order (possibly overlapping). For example, the string "abXYZba" has the mirror end "ab".
	 *
	 * mirrorEnds("abXYZba") → "ab"
	 * mirrorEnds("abca") → "a"
	 * mirrorEnds("aba") → "aba"
	 */
	public String mirrorEnds(String string) {
		StringBuilder result = new StringBuilder();
		for(int i = 0; i < string.length(); i++)
		{
			if(string.charAt(i) == string.charAt(string.length() - i - 1))
			{
				result.append(string.charAt(i));
			}
			else
			{
				break;
			}
		}

		return result.toString();
	}

	/**
	 * Given a string, return the length of the largest "block" in the string. A block is a run of adjacent chars that
	 * are the same.
	 *
	 * maxBlock("hoopla") → 2
	 * maxBlock("abbCCCddBBBxx") → 3
	 * maxBlock("") → 0
	 */
	public int maxBlock(String str)
	{
		if(str.isEmpty())
		{
			return 0;
		}
		int largest = 0;
		int current = 1;
		for(int i = 1; i < str.length(); i++)
		{
			if(str.charAt(i) != str.charAt(i-1))
			{
				if(current > largest)
				{
					largest = current;
				}
				current = 1;
			}
			else
			{
				current++;
			}
		}
		return Math.max(largest, current);
	}

	/**
	 * Given a string, return the sum of the numbers appearing in the string, ignoring all other characters.
	 * A number is a series of 1 or more digit chars in a row. (Note: Character.isDigit(char) tests if a char is
	 * one of the chars '0', '1', .. '9'. Integer.parseInt(string) converts a string to an int.)
	 *
	 * sumNumbers("abc123xyz") → 123
	 * sumNumbers("aa11b33") → 44
	 * sumNumbers("7 11") → 18
	 */
	public int sumNumbers(String str)
	{
		int sum = 0;
		String currentString = "";
		for(int i = 0; i < str.length(); i++)
		{
			if(Character.isDigit(str.charAt(i)))
			{
				currentString += str.substring(i, i + 1);
			}
			else if(!currentString.isEmpty())
			{
				sum += Integer.parseInt(currentString);
				currentString = "";
			}
		}
		if(!currentString.isEmpty())
		{
			sum += Integer.parseInt(currentString);
		}
		return sum;
	}

	/**
	 * Given a string, return a string where every appearance of the lowercase word "is" has been replaced with
	 * "is not". The word "is" should not be immediately preceeded or followed by a letter -- so for example the
	 * "is" in "this" does not count. (Note: Character.isLetter(char) tests if a char is a letter.)
	 *
	 * notReplace("is test") → "is not test"
	 * notReplace("is-is") → "is not-is not"
	 * notReplace("This is right") → "This is not right"
	 */
	public String notReplace(String str)
	{
		throw new UnsupportedOperationException("Not supported yet.");
	}

	/**
	 * @param args commandline arguments
	 */
	public void main(String[] args)
	{
		resetCallCount();
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
		System.out.println("countTriple(\"xxxabyyyycd\") → " + countTriple("xxxabyyyycd"));
		System.out.println("countTriple(\"a\") → " + countTriple("a"));
		System.out.println("countTriple(\"\") → " + countTriple(""));
		System.out.println("countTriple(\"XXXabc\") → " + countTriple("XXXabc"));
		System.out.println("countTriple(\"XXXXabc\") → " + countTriple("XXXXabc"));
		System.out.println("countTriple(\"XXXXXabc\") → " + countTriple("XXXXXabc"));
		System.out.println("countTriple(\"222abyyycdXXX\") → " + countTriple("222abyyycdXXX"));
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
		printFunction("sameEnds");
		System.out.println("sameEnds(\"abXYab\") → \"" + sameEnds("abXYab") + "\"");
		System.out.println("sameEnds(\"xx\") → \"" + sameEnds("xx") + "\"");
		System.out.println("sameEnds(\"xxx\") → \"" + sameEnds("xxx") + "\"");
		System.out.println("sameEnds(\"xxxx\") → \"" + sameEnds("xxxx") + "\"");
		System.out.println("sameEnds(\"javaXYZjava\") → \"" + sameEnds("javaXYZjava") + "\"");
		System.out.println("sameEnds(\"javajava\") → \"" + sameEnds("javajava") + "\"");
		System.out.println("sameEnds(\"xavaXYZjava\") → \"" + sameEnds("xavaXYZjava") + "\"");
		System.out.println("sameEnds(\"Hello! and Hello!\") → \"" + sameEnds("Hello! and Hello!") + "\"");
		System.out.println("sameEnds(\"x\") → \"" + sameEnds("x") + "\"");
		System.out.println("sameEnds(\"\") → \"" + sameEnds("") + "\"");
		System.out.println("sameEnds(\"abcd\") → \"" + sameEnds("abcd") + "\"");
		System.out.println("sameEnds(\"mymmy\") → \"" + sameEnds("mymmy") + "\"");
		printFunction("mirrorEnds");
		System.out.println("mirrorEnds(\"abXYZba\") → \"" + mirrorEnds("abXYZba") + "\"");
		System.out.println("mirrorEnds(\"abca\") → \"" + mirrorEnds("abca") + "\"");
		System.out.println("mirrorEnds(\"aba\") → \"" + mirrorEnds("aba") + "\"");
		System.out.println("mirrorEnds(\"abab\") → \"" + mirrorEnds("abab") + "\"");
		System.out.println("mirrorEnds(\"xxx\") → \"" + mirrorEnds("xxx") + "\"");
		System.out.println("mirrorEnds(\"xxYxx\") → \"" + mirrorEnds("xxYxx") + "\"");
		System.out.println("mirrorEnds(\"Hi and iH\") → \"" + mirrorEnds("Hi and iH") + "\"");
		System.out.println("mirrorEnds(\"x\") → \"" + mirrorEnds("x") + "\"");
		System.out.println("mirrorEnds(\"\") → \"" + mirrorEnds("") + "\"");
		System.out.println("mirrorEnds(\"123and then 321\") → \"" + mirrorEnds("123and then 321") + "\"");
		System.out.println("mirrorEnds(\"band andab\") → \"" + mirrorEnds("band andab") + "\"");
		printFunction("maxBlock");
		System.out.println("maxBlock(\"hoopla\") → " + maxBlock("hoopla"));
		System.out.println("maxBlock(\"abbCCCddBBBxx\") → " + maxBlock("abbCCCddBBBxx"));
		System.out.println("maxBlock(\"\") → " + maxBlock(""));
		System.out.println("maxBlock(\"xyz\") → " + maxBlock("xyz"));
		System.out.println("maxBlock(\"xxyz\") → " + maxBlock("xxyz"));
		System.out.println("maxBlock(\"xyzz\") → " + maxBlock("xyzz"));
		System.out.println("maxBlock(\"abbbcbbbxbbbx\") → " + maxBlock("abbbcbbbxbbbx"));
		System.out.println("maxBlock(\"XXBBBbbxx\") → " + maxBlock("XXBBBbbxx"));
		System.out.println("maxBlock(\"XXBBBBbbxx\") → " + maxBlock("XXBBBBbbxx"));
		System.out.println("maxBlock(\"XXBBBbbxxXXXX\") → " + maxBlock("XXBBBbbxxXXXX"));
		System.out.println("maxBlock(\"XX2222BBBbbXX2222\") → " + maxBlock("XX2222BBBbbXX2222"));
		printFunction("sumNumbers");
		System.out.println("sumNumbers(\"abc123xyz\") → " + sumNumbers("abc123xyz"));
		System.out.println("sumNumbers(\"aa11b33\") → " + sumNumbers("aa11b33"));
		System.out.println("sumNumbers(\"7 11\") → " + sumNumbers("7 11"));
		System.out.println("sumNumbers(\"Chocolate\") → " + sumNumbers("Chocolate"));
		System.out.println("sumNumbers(\"5hoco1a1e\") → " + sumNumbers("5hoco1a1e"));
		System.out.println("sumNumbers(\"5$$1;;1!!\") → " + sumNumbers("5$$1;;1!!"));
		System.out.println("sumNumbers(\"a1234bb11\") → " + sumNumbers("a1234bb11"));
		System.out.println("sumNumbers(\"\") → " + sumNumbers(""));
		System.out.println("sumNumbers(\"a22bbb3\") → " + sumNumbers("a22bbb3"));
		printFunction("notReplace");
		System.out.println("notReplace(\"is test\") → \"" + notReplace("is test") + "\"");
		System.out.println("notReplace(\"is-is\") → \"" + notReplace("is-is") + "\"");
		System.out.println("notReplace(\"This is right\") → \"" + notReplace("This is right") + "\"");
		System.out.println("notReplace(\"This is isabell\") → \"" + notReplace("This is isabell") + "\"");
		System.out.println("notReplace(\"\") → \"" + notReplace("") + "\"");
		System.out.println("notReplace(\"is\") → \"" + notReplace("is") + "\"");
		System.out.println("notReplace(\"isis\") → \"" + notReplace("isis") + "\"");
		System.out.println("notReplace(\"Dis is bliss is\") → \"" + notReplace("Dis is bliss is") + "\"");
		System.out.println("notReplace(\"is his\") → \"" + notReplace("is his") + "\"");
		System.out.println("notReplace(\"xis yis\") → \"" + notReplace("xis yis") + "\"");
		System.out.println("notReplace(\"AAAis is\") → \"" + notReplace("AAAis is") + "\"");
	}
}
