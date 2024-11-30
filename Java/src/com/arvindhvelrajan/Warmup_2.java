package com.arvindhvelrajan;

import static com.arvindhvelrajan.UI_Functions.*;

/**
 * @author arvindhvelrajan
 * @code This class is to demonstrate the implementation for all functions in Warmup-2 from codingbat.com
 */
public class Warmup_2
{
	/**
	 * This function introduces the user to the class that is being demonstrated.
	 */
	private void welcome()
	{
		System.out.println("\n\nWarmup-2 Functions\n");
	}

	/**
	 * Given a string and a non-negative int n, return a larger string that is n copies
	 * of the original string.
	 *
	 * stringTimes("Hi", 2) → "HiHi"
	 * stringTimes("Hi", 3) → "HiHiHi"
	 * stringTimes("Hi", 1) → "Hi"
	 */
	public String stringTimes(String str, int n)
	{
		throw new UnsupportedOperationException("Not supported yet.");
	}

	/**
	 * Given a string and a non-negative int n, we'll say that the front of the string is the first 3 chars, or whatever is there if the string is less than length 3. Return n copies of the front;
	 *
	 * frontTimes("Chocolate", 2) → "ChoCho"
	 * frontTimes("Chocolate", 3) → "ChoChoCho"
	 * frontTimes("Abc", 3) → "AbcAbcAbc"
	 */
	public String frontTimes(String str, int n)
	{
		throw new UnsupportedOperationException("Not supported yet.");
	}

	/**
	 * Count the number of "xx" in the given string. We'll say that overlapping is allowed,
	 * so "xxx" contains 2 "xx".
	 *
	 * countXX("abcxx") → 1
	 * countXX("xxx") → 2
	 * countXX("xxxx") → 3
	 */
	public int countXX(String str)
	{
		throw new UnsupportedOperationException("Not supported yet.");
	}

	/**
	 * Given a string, return true if the first instance of "x" in the string is immediately followed
	 * by another "x".
	 *
	 * doubleX("axxbb") → true
	 * doubleX("axaxax") → false
	 * doubleX("xxxxx") → true
	 */
	public boolean doubleX(String str)
	{
		throw new UnsupportedOperationException("Not supported yet.");
	}

	/**
	 * Given a string, return a new string made of every other char starting with the first,
	 * so "Hello" yields "Hlo".
	 *
	 * stringBits("Hello") → "Hlo"
	 * stringBits("Hi") → "H"
	 * stringBits("Heeololeo") → "Hello"
	 */
	public String stringBits(String str)
	{
		throw new UnsupportedOperationException("Not supported yet.");
	}

	/**
	 * Given a non-empty string like "Code" return a string like "CCoCodCode".
	 *
	 * stringSplosion("Code") → "CCoCodCode"
	 * stringSplosion("abc") → "aababc"
	 * stringSplosion("ab") → "aab"
	 */
	public String stringSplosion(String str)
	{
		throw new UnsupportedOperationException("Not supported yet.");
	}

	/**
	 * Given a string, return the count of the number of times that a substring length 2
	 * appears in the string and also as the last 2 chars of the string,
	 * so "hixxxhi" yields 1 (we won't count the end substring).
	 *
	 * last2("hixxhi") → 1
	 * last2("xaxxaxaxx") → 1
	 * last2("axxxaaxx") → 2
	 */
	public int last2(String str)
	{
		throw new UnsupportedOperationException("Not supported yet.");
	}

	/**
	 * Given an array of ints, return the number of 9's in the array.
	 *
	 * arrayCount9([1, 2, 9]) → 1
	 * arrayCount9([1, 9, 9]) → 2
	 * arrayCount9([1, 9, 9, 3, 9]) → 3
	 */
	public int arrayCount9(int[] nums)
	{
		throw new UnsupportedOperationException("Not supported yet.");
	}

	/**
	 * Given an array of ints, return true if one of the first 4 elements in the array is a 9. The array length may be less than 4.
	 *
	 * arrayFront9([1, 2, 9, 3, 4]) → true
	 * arrayFront9([1, 2, 3, 4, 9]) → false
	 * arrayFront9([1, 2, 3, 4, 5]) → false
	 */
	public boolean arrayFront9(int[] nums)
	{
		throw new UnsupportedOperationException("Not supported yet.");
	}

	/**
	 * @param args commandline arguments
	 */
	public void main(String[] args)
	{
		welcome();
		printFunction("stringTimes");
		System.out.println("stringTimes(\"Hi\", 2) --> \"" + stringTimes("Hi", 2) + "\"");
		System.out.println("stringTimes(\"Hi\", 3) --> \"" + stringTimes("Hi", 3) + "\"");
		System.out.println("stringTimes(\"Hi\", 1) --> \"" + stringTimes("Hi", 1) + "\"");
		System.out.println("stringTimes(\"Hi\", 0) --> \"" + stringTimes("Hi", 0) + "\"");
		System.out.println("stringTimes(\"Oh Boy!\", 2) --> \"" + stringTimes("Oh Boy!", 2) + "\"");
		System.out.println("stringTimes(\"x\", 4) --> \"" + stringTimes("x", 4) + "\"");
		System.out.println("stringTimes(\"\", 4) --> \"" + stringTimes("", 4) + "\"");
		System.out.println("stringTimes(\"code\", 2) --> \"" + stringTimes("code", 2) + "\"");
		System.out.println("stringTimes(\"code\", 3) --> \"" + stringTimes("code", 3) + "\"");
		printFunction("frontTimes");
		System.out.println("frontTimes(\"Chocolate\", 2) --> \"" + frontTimes("Chocolate", 2) + "\"");
		System.out.println("frontTimes(\"Chocolate\", 3) --> \"" + frontTimes("Chocolate", 3) + "\"");
		System.out.println("frontTimes(\"Abc\", 3) --> \"" + frontTimes("Abc", 3) + "\"");
		System.out.println("frontTimes(\"Ab\", 4) --> \"" + frontTimes("Ab", 4) + "\"");
		System.out.println("frontTimes(\"A\", 4) --> \"" + frontTimes("A", 4) + "\"");
		System.out.println("frontTimes(\"\", 4) --> \"" + frontTimes("", 4) + "\"");
		System.out.println("frontTimes(\"Abc\", 0) --> \"" + frontTimes("Abc", 0) + "\"");
		printFunction("countXX");
		System.out.println("countXX(\"abcxx\") --> " + countXX("abcxx"));
		System.out.println("countXX(\"xxx\") --> " + countXX("xxx"));
		System.out.println("countXX(\"xxxx\") --> " + countXX("xxxx"));
		System.out.println("countXX(\"abc\") --> " + countXX("abc"));
		System.out.println("countXX(\"Hello there\") --> " + countXX("Hello there"));
		System.out.println("countXX(\"Hexxo thxxe\") --> " + countXX("Hexxo thxxe"));
		System.out.println("countXX(\"\") --> " + countXX("\"\""));
		System.out.println("countXX(\"Kittens\") --> " + countXX("Kittens"));
		System.out.println("countXX(\"Kittensxxx\") --> " + countXX("Kittensxxx"));
		printFunction("doubleX");
		System.out.println("doubleX(\"axxbb\") --> " + doubleX("axxbb"));
		System.out.println("doubleX(\"axaxax\") --> " + doubleX("axaxax"));
		System.out.println("doubleX(\"xxxxx\") --> " + doubleX("xxxxx"));
		System.out.println("doubleX(\"xaxxx\") --> " + doubleX("xaxxx"));
		System.out.println("doubleX(\"aaaax\") --> " + doubleX("aaaax"));
		System.out.println("doubleX(\"\") --> " + doubleX(""));
		System.out.println("doubleX(\"abc\") --> " + doubleX("abc"));
		System.out.println("doubleX(\"x\") --> " + doubleX("x"));
		System.out.println("doubleX(\"xx\") --> " + doubleX("xx"));
		System.out.println("doubleX(\"xax\") --> " + doubleX("xax"));
		System.out.println("doubleX(\"xaxx\") --> " + doubleX("xaxx"));
		printFunction("stringBits");
		System.out.println("stringBits(\"Hello\") --> \"" + stringBits("Hello") + "\"");
		System.out.println("stringBits(\"Hi\") --> \"" + stringBits("Hi") + "\"");
		System.out.println("stringBits(\"Heeololeo\") --> \"" + stringBits("Heeololeo") + "\"");
		System.out.println("stringBits(\"HiHiHi\") --> \"" + stringBits("HiHiHi") + "\"");
		System.out.println("stringBits(\"\") --> \"" + stringBits("") + "\"");
		System.out.println("stringBits(\"Greetings\") --> \"" + stringBits("Greetings") + "\"");
		System.out.println("stringBits(\"Chocolate\") --> \"" + stringBits("Chocolate") + "\"");
		System.out.println("stringBits(\"pi\") --> \"" + stringBits("pi") + "\"");
		System.out.println("stringBits(\"hxaxpxpxy\") --> \"" + stringBits("hxaxpxpxy") + "\"");
		printFunction("stringSplosion");
		System.out.println("stringSplosion(\"Code\") --> \"" + stringSplosion("Code") + "\"");
		System.out.println("stringSplosion(\"abc\") --> \"" + stringSplosion("abc") + "\"");
		System.out.println("stringSplosion(\"ab\") --> \"" + stringSplosion("ab") + "\"");
		System.out.println("stringSplosion(\"x\") --> \"" + stringSplosion("x") + "\"");
		System.out.println("stringSplosion(\"fade\") --> \"" + stringSplosion("fade") + "\"");
		System.out.println("stringSplosion(\"There\") --> \"" + stringSplosion("There") + "\"");
		System.out.println("stringSplosion(\"Kitten\") --> \"" + stringSplosion("Kitten") + "\"");
		System.out.println("stringSplosion(\"Bye\") --> \"" + stringSplosion("Bye") + "\"");
		System.out.println("stringSplosion(\"Good\") --> \"" + stringSplosion("Good") + "\"");
		System.out.println("stringSplosion(\"Bad\") --> \"" + stringSplosion("Bad") + "\"");
		printFunction("last2");
		System.out.println("last2(\"hixxhi\") --> " + last2("hixxhi"));
		System.out.println("last2(\"xaxxaxaxx\") --> " + last2("xaxxaxaxx"));
		System.out.println("last2(\"axxxaaxx\") --> " + last2("axxxaaxx"));
		System.out.println("last2(\"xxaxxaxxaxx\") --> " + last2("xxaxxaxxaxx"));
		System.out.println("last2(\"xaxaxaxx\") --> " + last2("xaxaxaxx"));
		System.out.println("last2(\"xxxx\") --> " + last2("xxxx"));
		System.out.println("last2(\"13121312\") --> " + last2("13121312"));
		System.out.println("last2(\"11212\") --> " + last2("11212"));
		System.out.println("last2(\"13121311\") --> " + last2("13121311"));
		System.out.println("last2(\"1717171\") --> " + last2("1717171"));
		System.out.println("last2(\"hi\") --> " + last2("hi"));
		System.out.println("last2(\"h\") --> " + last2("h"));
		System.out.println("last2(\"\") --> " + last2(""));
		printFunction("arrayCount9");
		System.out.println("arrayCount9([1, 2, 9]) --> " + arrayCount9(new int[] {1, 2, 9}));
		System.out.println("arrayCount9([1, 9, 9]) --> " + arrayCount9(new int[] {1, 9, 9}));
		System.out.println("arrayCount9([1, 9, 9, 3, 9]) --> " + arrayCount9(new int[] {1, 9, 9, 3, 9}));
		System.out.println("arrayCount9([1, 2, 3]) --> " + arrayCount9(new int[] {1, 2, 3}));
		System.out.println("arrayCount9([]) --> " + arrayCount9(new int[] {}));
		System.out.println("arrayCount9([4, 2, 4, 3, 1]) --> " + arrayCount9(new int[] {4, 2, 4, 3, 1}));
		System.out.println("arrayCount9([9, 2, 4, 3, 1]) --> " + arrayCount9(new int[] {9, 2, 4, 3, 1}));
	}
}
