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
	}
}
