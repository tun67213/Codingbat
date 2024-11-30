package com.arvindhvelrajan;

import static com.arvindhvelrajan.UI_Functions.*;

/**
 * @author arvindhvelrajan
 * @code This class is to demonstrate the implementation for all functions in String-1 from codingbat.com
 */
public class String_1
{
	/**
	 * This function introduces the user to the class that is being demonstrated.
	 */
	private void welcome()
	{
		System.out.println("\n\nString-1 Functions\n");
	}

	/**
	 * Given a string name, e.g. "Bob", return a greeting of the form "Hello Bob!".
	 *
	 * helloName("Bob") → "Hello Bob!"
	 * helloName("Alice") → "Hello Alice!"
	 * helloName("X") → "Hello X!"
	 */
	public String helloName(String name)
	{
		throw new UnsupportedOperationException("Not supported yet.");
	}

	/**
	 * Given two strings, a and b, return the result of putting them together in the order abba, e.g. "Hi" and "Bye"
	 * returns "HiByeByeHi".
	 *
	 * makeAbba("Hi", "Bye") → "HiByeByeHi"
	 * makeAbba("Yo", "Alice") → "YoAliceAliceYo"
	 * makeAbba("What", "Up") → "WhatUpUpWhat"
	 */
	public String makeAbba(String a, String b)
	{
		throw new UnsupportedOperationException("Not supported yet.");
	}

	/**
	 * The web is built with HTML strings like "<i>Yay</i>" which draws Yay as italic text.
	 * In this example, the "i" tag makes <i> and </i> which surround the word "Yay".
	 * Given tag and word strings, create the HTML string with tags around the word, e.g. "<i>Yay</i>".
	 *
	 * makeTags("i", "Yay") → "<i>Yay</i>"
	 * makeTags("i", "Hello") → "<i>Hello</i>"
	 * makeTags("cite", "Yay") → "<cite>Yay</cite>"
	 */
	public String makeTags(String tag, String word)
	{
		throw new UnsupportedOperationException("Not supported yet.");
	}

	/**
	 * Given an "out" string length 4, such as "<<>>", and a word, return a new string where the word is in the
	 * middle of the out string, e.g. "<<word>>".
	 * Note: use str.substring(i, j) to extract the String starting at index i and going up to but not including
	 * index j.
	 *
	 * makeOutWord("<<>>", "Yay") → "<<Yay>>"
	 * makeOutWord("<<>>", "WooHoo") → "<<WooHoo>>"
	 * makeOutWord("[[]]", "word") → "[[word]]"
	 */
	public String makeOutWord(String out, String word)
	{
		throw new UnsupportedOperationException("Not supported yet.");
	}

	/**
	 * Given a string, return a new string made of 3 copies of the last 2 chars of the original string.
	 * The string length will be at least 2.
	 *
	 * extraEnd("Hello") → "lololo"
	 * extraEnd("ab") → "ababab"
	 * extraEnd("Hi") → "HiHiHi"
	 */
	public String extraEnd(String str)
	{
		throw new UnsupportedOperationException("Not supported yet.");
	}

	/**
	 * Given a string, return the string made of its first two chars, so the String "Hello" yields "He".
	 * If the string is shorter than length 2, return whatever there is, so "X" yields "X",
	 * and the empty string "" yields the empty string "".
	 * Note that str.length() returns the length of a string.
	 *
	 * firstTwo("Hello") → "He"
	 * firstTwo("abcdefg") → "ab"
	 * firstTwo("ab") → "ab"
	 */
	public String firstTwo(String str)
	{
		throw new UnsupportedOperationException("Not supported yet.");
	}

	/**
	 * Given a string of even length, return the first half. So the string "WooHoo" yields "Woo".
	 *
	 * firstHalf("WooHoo") → "Woo"
	 * firstHalf("HelloThere") → "Hello"
	 * firstHalf("abcdef") → "abc"
	 */
	public String firstHalf(String str)
	{
		throw new UnsupportedOperationException("Not supported yet.");
	}

	/**
	 * Given a string, return a version without the first and last char, so "Hello" yields "ell".
	 * The string length will be at least 2.
	 *
	 * withoutEnd("Hello") → "ell"
	 * withoutEnd("java") → "av"
	 * withoutEnd("coding") → "odin"
	 */
	public String withoutEnd(String str)
	{
		throw new UnsupportedOperationException("Not supported yet.");
	}

	/**
	 * Given 2 strings, a and b, return a string of the form short+long+short, with the shorter string on the outside and the longer string on the inside. The strings will not be the same length, but they may be empty (length 0).
	 *
	 * comboString("Hello", "hi") → "hiHellohi"
	 * comboString("hi", "Hello") → "hiHellohi"
	 * comboString("aaa", "b") → "baaab"
	 */
	public String comboString(String a, String b)
	{
		throw new UnsupportedOperationException("Not supported yet.");
	}

	/**
	 * Given 2 strings, return their concatenation, except omit the first char of each. The strings will be at least length 1.
	 *
	 * nonStart("Hello", "There") → "ellohere"
	 * nonStart("java", "code") → "avaode"
	 * nonStart("shotl", "java") → "hotlava"
	 */
	public String nonStart(String a, String b)
	{
		throw new UnsupportedOperationException("Not supported yet.");
	}

	/**
	 * Given a string, return a "rotated left 2" version where the first 2 chars are moved to the end.
	 * The string length will be at least 2.
	 *
	 * left2("Hello") → "lloHe"
	 * left2("java") → "vaja"
	 * left2("Hi") → "Hi"
	 */
	public String left2(String str)
	{
		throw new UnsupportedOperationException("Not supported yet.");
	}

	/**
	 * Given a string, return a "rotated right 2" version where the last 2 chars are moved to the start.
	 * The string length will be at least 2.
	 *
	 * right2("Hello") → "loHel"
	 * right2("java") → "vaja"
	 * right2("Hi") → "Hi"
	 */
	public String right2(String str)
	{
		throw new UnsupportedOperationException("Not supported yet.");
	}

	/**
	 * Given a string, return a string length 1 from its front, unless front is false, in which case return a
	 * string length 1 from its back. The string will be non-empty.
	 *
	 * theEnd("Hello", true) → "H"
	 * theEnd("Hello", false) → "o"
	 * theEnd("oh", true) → "o"
	 */
	public String theEnd(String str, boolean front)
	{
		throw new UnsupportedOperationException("Not supported yet.");
	}

	/**
	 * Given a string, return a version without both the first and last char of the string.
	 * The string may be any length, including 0.
	 *
	 * withouEnd2("Hello") → "ell"
	 * withouEnd2("abc") → "b"
	 * withouEnd2("ab") → ""
	 */
	public String withouEnd2(String str)
	{
		throw new UnsupportedOperationException("Not supported yet.");
	}

	/**
	 * Given a string of even length, return a string made of the middle two chars, so the
	 * string "string" yields "ri". The string length will be at least 2.
	 *
	 * middleTwo("string") → "ri"
	 * middleTwo("code") → "od"
	 * middleTwo("Practice") → "ct"
	 */
	public String middleTwo(String str)
	{
		throw new UnsupportedOperationException("Not supported yet.");
	}

	/**
	 * Given a string, return true if it ends in "ly".
	 *
	 * endsLy("oddly") → true
	 * endsLy("y") → false
	 * endsLy("oddy") → false
	 */
	public boolean endsLy(String str)
	{
		throw new UnsupportedOperationException("Not supported yet.");
	}

	/**
	 * @param args commandline arguments
	 */
	public void main(String[] args)
	{
		welcome();
		printFunction("helloName");
		System.out.println("helloName(\"Bob\") --> \"" + helloName("Bob") + "\"");
		System.out.println("helloName(\"Alice\") --> \"" + helloName("Alice") + "\"");
		System.out.println("helloName(\"X\") --> \"" + helloName("X") + "\"");
		System.out.println("helloName(\"Dolly\") --> \"" + helloName("Dolly") + "\"");
		System.out.println("helloName(\"Alpha\") --> \"" + helloName("Alpha") + "\"");
		System.out.println("helloName(\"Omega\") --> \"" + helloName("Omega") + "\"");
		System.out.println("helloName(\"Goodbye\") --> \"" + helloName("Goodbye") + "\"");
		System.out.println("helloName(\"ho ho ho\") --> \"" + helloName("ho ho ho") + "\"");
		System.out.println("helloName(\"xyz!\") --> \"" + helloName("xyz!") + "\"");
		System.out.println("helloName(\"Hello\") --> \"" + helloName("Hello") + "\"");
		printFunction("makeAbba");
		System.out.println("makeAbba(\"Hi\", \"Bye\") --> \"" + makeAbba("Hi", "Bye") + "\"");
		System.out.println("makeAbba(\"Yo\", \"Alice\") --> \"" + makeAbba("Yo", "Alice") + "\"");
		System.out.println("makeAbba(\"What\", \"Up\") --> \"" + makeAbba("What", "Up") + "\"");
		System.out.println("makeAbba(\"aaa\", \"bbb\") --> \"" + makeAbba("aaa", "bbb") + "\"");
		System.out.println("makeAbba(\"x\", \"y\") --> \"" + makeAbba("x", "y") + "\"");
		System.out.println("makeAbba(\"x\", \"\") --> \"" + makeAbba("x", "") + "\"");
		System.out.println("makeAbba(\"\", \"y\") --> \"" + makeAbba("", "y") + "\"");
		System.out.println("makeAbba(\"Bo\", \"Ya\") --> \"" + makeAbba("Bo", "Ya") + "\"");
		System.out.println("makeAbba(\"Ya\", \"Ya\") --> \"" + makeAbba("Ya", "Ya") + "\"");
		printFunction("makeTags");
		System.out.println("makeTags(\"i\", \"Yay\") --> \"" + makeTags("i", "Yay") + "\"");
		System.out.println("makeTags(\"i\", \"Hello\") --> \"" + makeTags("i", "Hello") + "\"");
		System.out.println("makeTags(\"cite\", \"Yay\") --> \"" + makeTags("cite", "Yay") + "\"");
		System.out.println("makeTags(\"address\", \"here\") --> \"" + makeTags("address", "here") + "\"");
		System.out.println("makeTags(\"body\", \"Heart\") --> \"" + makeTags("body", "Heart") + "\"");
		System.out.println("makeTags(\"i\", \"i\") --> \"" + makeTags("i", "i") + "\"");
		System.out.println("makeTags(\"i\", \"\") --> \"" + makeTags("i", "") + "\"");
		printFunction("makeOutWord");
		System.out.println("makeOutWord(\"<<>>\", \"Yay\") --> \"" + makeOutWord("<<>>", "Yay") + "\"");
		System.out.println("makeOutWord(\"<<>>\", \"WooHoo\") --> \"" + makeOutWord("<<>>", "WooHoo") + "\"");
		System.out.println("makeOutWord(\"[[]]\", \"word\") --> \"" + makeOutWord("[[]]", "word") + "\"");
		System.out.println("makeOutWord(\"HHoo\", \"Hello\") --> \"" + makeOutWord("HHoo", "Hello"));
		System.out.println("makeOutWord(\"abyz\", \"YAY\") --> \"" + makeOutWord("abyz", "YAY"));
		printFunction("extraEnd");
		System.out.println("extraEnd(\"Hello\") --> \"" + extraEnd("Hello") + "\"");
		System.out.println("extraEnd(\"ab\") --> \"" + extraEnd("ab") + "\"");
		System.out.println("extraEnd(\"Hi\") --> \"" + extraEnd("Hi") + "\"");
		System.out.println("extraEnd(\"Candy\") --> \"" + extraEnd("Candy") + "\"");
		System.out.println("extraEnd(\"Code\") --> \"" + extraEnd("Code") + "\"");
		printFunction("firstTwo");
		System.out.println("firstTwo(\"Hello\") --> \"" + firstTwo("Hello") + "\"");
		System.out.println("firstTwo(\"abcdefg\") --> \"" + firstTwo("abcdefg") + "\"");
		System.out.println("firstTwo(\"ab\") --> \"" + firstTwo("ab") + "\"");
		System.out.println("firstTwo(\"a\") --> \"" + firstTwo("a") + "\"");
		System.out.println("firstTwo(\"\") --> \"" + firstTwo("") + "\"");
		System.out.println("firstTwo(\"Kitten\") --> \"" + firstTwo("Kitten") + "\"");
		System.out.println("firstTwo(\"hi\") --> \"" + firstTwo("hi") + "\"");
		System.out.println("firstTwo(\"hiya\") --> \"" + firstTwo("hiya") + "\"");
		printFunction("firstHalf");
		System.out.println("firstHalf(\"WooHoo\") --> \"" + firstHalf("WooHoo") + "\"");
		System.out.println("firstHalf(\"HelloThere\") --> \"" + firstHalf("HelloThere") + "\"");
		System.out.println("firstHalf(\"abcdef\") --> \"" + firstHalf("abcdef") + "\"");
		System.out.println("firstHalf(\"ab\") --> \"" + firstHalf("ab") + "\"");
		System.out.println("firstHalf(\"\") --> \"" + firstHalf("") + "\"");
		System.out.println("firstHalf(\"0123456789\") --> \"" + firstHalf("0123456789") + "\"");
		System.out.println("firstHalf(\"kitten\") --> \"" + firstHalf("kitten") + "\"");
		printFunction("withoutEnd");
		System.out.println("withoutEnd(\"Hello\") --> \"" + withoutEnd("Hello") + "\"");
		System.out.println("withoutEnd(\"java\") --> \"" + withoutEnd("java") + "\"");
		System.out.println("withoutEnd(\"coding\") --> \"" + withoutEnd("coding") + "\"");
		System.out.println("withoutEnd(\"code\") --> \"" + withoutEnd("code") + "\"");
		System.out.println("withoutEnd(\"ab\") --> \"" + withoutEnd("ab") + "\"");
		System.out.println("withoutEnd(\"Chocolate!\") --> \"" + withoutEnd("Chocolate!") + "\"");
		System.out.println("withoutEnd(\"kitten\") --> \"" + withoutEnd("kitten") + "\"");
		System.out.println("withoutEnd(\"woohoo\") --> \"" + withoutEnd("woohoo") + "\"");
		printFunction("comboString");
		System.out.println("comboString(\"Hello\", \"hi\") --> \"" + comboString("Hello", "hi") + "\"");
		System.out.println("comboString(\"hi\", \"Hello\") --> \"" + comboString("hi", "Hello") + "\"");
		System.out.println("comboString(\"aaa\", \"b\") --> \"" + comboString("aaa", "b") + "\"");
		System.out.println("comboString(\"b\", \"aaa\") --> \"" + comboString("b", "aaa") + "\"");
		System.out.println("comboString(\"aaa\", \"\") --> \"" + comboString("aaa", "") + "\"");
		System.out.println("comboString(\"\", \"bb\") --> \"" + comboString("", "bb") + "\"");
		System.out.println("comboString(\"aaa\", \"1234\") --> \"" + comboString("aaa", "1234") + "\"");
		System.out.println("comboString(\"aaa\", \"bb\") --> \"" + comboString("aaa", "bb") + "\"");
		System.out.println("comboString(\"a\", \"bb\") --> \"" + comboString("a", "bb") + "\"");
		System.out.println("comboString(\"bb\", \"a\") --> \"" + comboString("bb", "a") + "\"");
		System.out.println("comboString(\"xyz\", \"ab\") --> \"" + comboString("xyz", "ab") + "\"");
		printFunction("nonStart");
		System.out.println("nonStart(\"Hello\", \"There\") --> \"" + nonStart("Hello", "There") + "\"");
		System.out.println("nonStart(\"java\", \"code\") --> \"" + nonStart("java", "code") + "\"");
		System.out.println("nonStart(\"shotl\", \"java\") --> \"" + nonStart("shotl", "java") + "\"");
		System.out.println("nonStart(\"ab\", \"xy\") --> \"" + nonStart("ab", "xy") + "\"");
		System.out.println("nonStart(\"ab\", \"x\") --> \"" + nonStart("ab", "x") + "\"");
		System.out.println("nonStart(\"x\", \"ac\") --> \"" + nonStart("x", "ac") + "\"");
		System.out.println("nonStart(\"a\", \"x\") --> \"" + nonStart("a", "x") + "\"");
		System.out.println("nonStart(\"kit\", \"kat\") --> \"" + nonStart("kit", "kat") + "\"");
		System.out.println("nonStart(\"mart\", \"dart\") --> \"" + nonStart("mart", "dart") + "\"");
		printFunction("left2");
		System.out.println("left2(\"Hello\") --> \"" + left2("Hello") + "\"");
		System.out.println("left2(\"java\") --> \"" + left2("java") + "\"");
		System.out.println("left2(\"Hi\") --> \"" + left2("Hi") + "\"");
		System.out.println("left2(\"code\") --> \"" + left2("code") + "\"");
		System.out.println("left2(\"cat\") --> \"" + left2("cat") + "\"");
		System.out.println("left2(\"12345\") --> \"" + left2("12345") + "\"");
		System.out.println("left2(\"Chocolate\") --> \"" + left2("Chocolate") + "\"");
		System.out.println("left2(\"bricks\") --> \"" + left2("bricks") + "\"");
		printFunction("right2");
		System.out.println("right2(\"Hello\") --> \"" + right2("Hello") + "\"");
		System.out.println("right2(\"java\") --> \"" + right2("java") + "\"");
		System.out.println("right2(\"Hi\") --> \"" + right2("Hi") + "\"");
		System.out.println("right2(\"code\") --> \"" + right2("code") + "\"");
		System.out.println("right2(\"cat\") --> \"" + right2("cat") + "\"");
		System.out.println("right2(\"12345\") --> \"" + right2("12345") + "\"");
		printFunction("theEnd");
		System.out.println("theEnd(\"Hello\", true) --> \"" + theEnd("Hello", true) + "\"");
		System.out.println("theEnd(\"Hello\", false) --> \"" + theEnd("Hello", false) + "\"");
		System.out.println("theEnd(\"oh\", true) --> \"" + theEnd("oh", true) + "\"");
		System.out.println("theEnd(\"oh\", false) --> \"" + theEnd("oh", false) + "\"");
		System.out.println("theEnd(\"x\", true) --> \"" + theEnd("x", true) + "\"");
		System.out.println("theEnd(\"x\", false) --> \"" + theEnd("x", false) + "\"");
		System.out.println("theEnd(\"java\", true) --> \"" + theEnd("java", true) + "\"");
		System.out.println("theEnd(\"chocolate\", false) --> \"" + theEnd("chocolate", false) + "\"");
		System.out.println("theEnd(\"1234\", true) --> \"" + theEnd("1234", true) + "\"");
		System.out.println("theEnd(\"code\", false) --> \"" + theEnd("code", false) + "\"");
		printFunction("withouEnd2");
		System.out.println("withouEnd2(\"Hello\") --> \"" + withouEnd2("Hello") + "\"");
		System.out.println("withouEnd2(\"abc\") --> \"" + withouEnd2("abc") + "\"");
		System.out.println("withouEnd2(\"ab\") --> \"" + withouEnd2("ab") + "\"");
		System.out.println("withouEnd2(\"a\") --> \"" + withouEnd2("a") + "\"");
		System.out.println("withouEnd2(\"\") --> \"" + withouEnd2("") + "\"");
		System.out.println("withouEnd2(\"coldy\") --> \"" + withouEnd2("coldy") + "\"");
		System.out.println("withouEnd2(\"java code\") --> \"" + withouEnd2("java code") + "\"");
		printFunction("middleTwo");
		System.out.println("middleTwo(\"string\") --> \"" + middleTwo("string") + "\"");
		System.out.println("middleTwo(\"code\") --> \"" + middleTwo("code") + "\"");
		System.out.println("middleTwo(\"Practice\") --> \"" + middleTwo("Practice") + "\"");
		System.out.println("middleTwo(\"ab\") --> \"" + middleTwo("ab") + "\"");
		System.out.println("middleTwo(\"0123456789\") --> \"" + middleTwo("0123456789") + "\"");
	}
}
