package src;

/**
 * @author arvindhvelrajan
 */
public class String_1 extends HelperMethods
{
	/**
	 * This method welcomes the user to this program.
	 */
	public void welcome()
	{
		System.out.println("\n\nString-1 Methods\n");
	}

	/**
	 * Given a string name, e.g. "Bob", return a greeting of the form "Hello Bob!".
	 *
	 * helloName("Bob") → "Hello Bob!"
	 * helloName("Alice") → "Hello Alice!"
	 * helloName("X") → "Hello X!"
	 */
	public String helloName(String str)
	{
		throw new UnsupportedOperationException("Not implemented yet");
	}

	/**
	 * Given two strings, a and b, return the result of putting them together in the order abba, e.g. "Hi" and "Bye" returns "HiByeByeHi".
	 *
	 * makeAbba("Hi", "Bye") → "HiByeByeHi"
	 * makeAbba("Yo", "Alice") → "YoAliceAliceYo"
	 * makeAbba("What", "Up") → "WhatUpUpWhat"
	 */
	public String makeAbba(String a, String b)
	{
		throw new UnsupportedOperationException("Not implemented yet");
	}

	/**
	 * The web is built with HTML strings like "<i>Yay</i>" which draws Yay as italic text. In this example, the "i" tag makes <i> and </i> which surround the word "Yay". Given tag and word strings, create the HTML string with tags around the word, e.g. "<i>Yay</i>".
	 *
	 * makeTags("i", "Yay") → "<i>Yay</i>"
	 * makeTags("i", "Hello") → "<i>Hello</i>"
	 * makeTags("cite", "Yay") → "<cite>Yay</cite>"
	 */
	public String makeTags(String tag, String word)
	{
		throw new UnsupportedOperationException("Not implemented yet");
	}

	/**
	 * Given an "out" string length 4, such as "<<>>", and a word, return a new string where the word is in the middle of the out string, e.g. "<<word>>". Note: use str.substring(i, j) to extract the String starting at index i and going up to but not including index j.
	 *
	 * makeOutWord("<<>>", "Yay") → "<<Yay>>"
	 * makeOutWord("<<>>", "WooHoo") → "<<WooHoo>>"
	 * makeOutWord("[[]]", "word") → "[[word]]"
	 */
	public String makeOutWord(String out, String word)
	{
		throw new UnsupportedOperationException("Not implemented yet");
	}

	/**
	 * Given a string, return a new string made of 3 copies of the last 2 chars of the original string. The string length will be at least 2.
	 *
	 * extraEnd("Hello") → "lololo"
	 * extraEnd("ab") → "ababab"
	 * extraEnd("Hi") → "HiHiHi"
	 */
	public String extraEnd(String str)
	{
		throw new UnsupportedOperationException("Not implemented yet");
	}

	/**
	 * Given a string, return the string made of its first two chars, so the String "Hello" yields "He". If the string is shorter than length 2, return whatever there is, so "X" yields "X", and the empty string "" yields the empty string "". Note that str.length() returns the length of a string.
	 *
	 * firstTwo("Hello") → "He"
	 * firstTwo("abcdefg") → "ab"
	 * firstTwo("ab") → "ab"
	 */
	public String firstTwo(String str)
	{
		throw new UnsupportedOperationException("Not implemented yet");
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
		throw new UnsupportedOperationException("Not implemented yet");
	}

	/**
	 * Given a string, return a version without the first and last char, so "Hello" yields "ell". The string length will be at least 2.
	 *
	 * withoutEnd("Hello") → "ell"
	 * withoutEnd("java") → "av"
	 * withoutEnd("coding") → "odin"
	 */
	public String withoutEnd(String str)
	{
		throw new UnsupportedOperationException("Not implemented yet");
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
		throw new UnsupportedOperationException("Not implemented yet");
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
		throw new UnsupportedOperationException("Not implemented yet");
	}

	/**
	 * Given a string, return a "rotated left 2" version where the first 2 chars are moved to the end. The string length will be at least 2.
	 *
	 * left2("Hello") → "lloHe"
	 * left2("java") → "vaja"
	 * left2("Hi") → "Hi"
	 */
	public String left2(String str)
	{
		throw new UnsupportedOperationException("Not implemented yet");
	}

	/**
	 * Given a string, return a "rotated right 2" version where the last 2 chars are moved to the start. The string length will be at least 2.
	 *
	 * right2("Hello") → "loHel"
	 * right2("java") → "vaja"
	 * right2("Hi") → "Hi"
	 */
	public String right2(String str)
	{
		throw new UnsupportedOperationException("Not implemented yet");
	}

	/**
	 * Given a string, return a string length 1 from its front, unless front is false, in which case return a string length 1 from its back. The string will be non-empty.
	 *
	 * theEnd("Hello", true) → "H"
	 * theEnd("Hello", false) → "o"
	 * theEnd("oh", true) → "o"
	 */
	public String theEnd(String str, boolean front)
	{
		throw new UnsupportedOperationException("Not implemented yet");
	}

	/**
	 * Given a string, return a version without both the first and last char of the string. The string may be any length, including 0.
	 *
	 * withouEnd2("Hello") → "ell"
	 * withouEnd2("abc") → "b"
	 * withouEnd2("ab") → ""
	 */
	public String withouEnd2(String str)
	{
		throw new UnsupportedOperationException("Not implemented yet");
	}

	/**
	 * Given a string of even length, return a string made of the middle two chars, so the string "string" yields "ri". The string length will be at least 2.
	 *
	 * middleTwo("string") → "ri"
	 * middleTwo("code") → "od"
	 * middleTwo("Practice") → "ct"
	 */
	public String middleTwo(String str)
	{
		throw new UnsupportedOperationException("Not implemented yet");
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
		throw new UnsupportedOperationException("Not implemented yet");
	}

	/**
	 * Given a string and an int n, return a string made of the first and last n chars from the string. The string length will be at least n.
	 *
	 * nTwice("Hello", 2) → "Helo"
	 * nTwice("Chocolate", 3) → "Choate"
	 * nTwice("Chocolate", 1) → "Ce"
	 */
	public String nTwice(String str, int n)
	{
		throw new UnsupportedOperationException("Not implemented yet");
	}

	/**
	 * Given a string and an index, return a string length 2 starting at the given index. If the index is too big or too small to define a string length 2, use the first 2 chars. The string length will be at least 2.
	 *
	 * twoChar("java", 0) → "ja"
	 * twoChar("java", 2) → "va"
	 * twoChar("java", 3) → "ja"
	 */
	public String twoChar(String str, int index)
	{
		throw new UnsupportedOperationException("Not implemented yet");
	}

	/**
	 * Given a string of odd length, return the string length 3 from its middle, so "Candy" yields "and". The string length will be at least 3.
	 *
	 * middleThree("Candy") → "and"
	 * middleThree("and") → "and"
	 * middleThree("solving") → "lvi"
	 */
	public String middleThree(String str)
	{
		throw new UnsupportedOperationException("Not implemented yet");
	}

	/**
	 * Given a string, return true if "bad" appears starting at index 0 or 1 in the string, such as with "badxxx" or "xbadxx" but not "xxbadxx". The string may be any length, including 0. Note: use .equals() to compare 2 strings.
	 *
	 * hasBad("badxx") → true
	 * hasBad("xbadxx") → true
	 * hasBad("xxbadxx") → false
	 */
	public boolean hasBad(String str)
	{
		throw new UnsupportedOperationException("Not implemented yet");
	}

	/**
	 * Given a string, return a string length 2 made of its first 2 chars. If the string length is less than 2, use '@' for the missing chars.
	 *
	 * atFirst("hello") → "he"
	 * atFirst("hi") → "hi"
	 * atFirst("h") → "h@"
	 */
	public String atFirst(String str)
	{
		throw new UnsupportedOperationException("Not implemented yet");
	}

	/**
	 * Given 2 strings, a and b, return a new string made of the first char of a and the last char of b, so "yo" and "java" yields "ya". If either string is length 0, use '@' for its missing char.
	 *
	 * lastChars("last", "chars") → "ls"
	 * lastChars("yo", "java") → "ya"
	 * lastChars("hi", "") → "h@"
	 */
	public String lastChars(String a, String b)
	{
		throw new UnsupportedOperationException("Not implemented yet");
	}

	/**
	 * Given two strings, append them together (known as "concatenation") and return the result. However, if the concatenation creates a double-char, then omit one of the chars, so "abc" and "cat" yields "abcat".
	 *
	 * conCat("abc", "cat") → "abcat"
	 * conCat("dog", "cat") → "dogcat"
	 * conCat("abc", "") → "abc"
	 */
	public String conCat(String a, String b)
	{
		throw new UnsupportedOperationException("Not implemented yet");
	}

	/**
	 * Given a string of any length, return a new string where the last 2 chars, if present, are swapped, so "coding" yields "codign".
	 *
	 * lastTwo("coding") → "codign"
	 * lastTwo("cat") → "cta"
	 * lastTwo("ab") → "ba"
	 */
	public String lastTwo(String str)
	{
		throw new UnsupportedOperationException("Not implemented yet");
	}

	/**
	 * Given a string, if the string begins with "red" or "blue" return that color string, otherwise return the empty string.
	 *
	 * seeColor("redxx") → "red"
	 * seeColor("xxred") → ""
	 * seeColor("blueTimes") → "blue"
	 */
	public String seeColor(String str)
	{
		throw new UnsupportedOperationException("Not implemented yet");
	}

	/**
	 * Given a string, return true if the first 2 chars in the string also appear at the end of the string, such as with "edited".
	 *
	 * frontAgain("edited") → true
	 * frontAgain("edit") → false
	 * frontAgain("ed") → true
	 */
	public boolean frontAgain(String str)
	{
		throw new UnsupportedOperationException("Not implemented yet");
	}

	/**
	 * Given two strings, append them together (known as "concatenation") and return the result. However, if the strings are different lengths, omit chars from the longer string so it is the same length as the shorter string. So "Hello" and "Hi" yield "loHi". The strings may be any length.
	 *
	 * minCat("Hello", "Hi") → "loHi"
	 * minCat("Hello", "java") → "ellojava"
	 * minCat("java", "Hello") → "javaello"
	 */
	public String minCat(String a, String b)
	{
		throw new UnsupportedOperationException("Not implemented yet");
	}

	/**
	 * Given a string, return a new string made of 3 copies of the first 2 chars of the original string. The string may be any length. If there are fewer than 2 chars, use whatever is there.
	 *
	 * extraFront("Hello") → "HeHeHe"
	 * extraFront("ab") → "ababab"
	 * extraFront("H") → "HHH"
	 */
	public String extraFront(String str)
	{
		throw new UnsupportedOperationException("Not implemented yet");
	}

	/**
	 * Given a string, if a length 2 substring appears at both its beginning and end, return a string without the substring at the beginning, so "HelloHe" yields "lloHe". The substring may overlap with itself, so "Hi" yields "". Otherwise, return the original string unchanged.
	 *
	 * without2("HelloHe") → "lloHe"
	 * without2("HelloHi") → "HelloHi"
	 * without2("Hi") → ""
	 */
	public String without2(String str)
	{
		throw new UnsupportedOperationException("Not implemented yet");
	}

	/**
	 * Given a string, return a version without the first 2 chars. Except keep the first char if it is 'a' and keep the second char if it is 'b'. The string may be any length. Harder than it looks.
	 *
	 * deFront("Hello") → "llo"
	 * deFront("java") → "va"
	 * deFront("away") → "aay"
	 */
	public String deFront(String str)
	{
		throw new UnsupportedOperationException("Not implemented yet");
	}

	/**
	 * Given a string and a second "word" string, we'll say that the word matches the string if it appears at the front of the string, except its first char does not need to match exactly. On a match, return the front of the string, or otherwise return the empty string. So, so with the string "hippo" the word "hi" returns "hi" and "xip" returns "hip". The word will be at least length 1.
	 *
	 * startWord("hippo", "hi") → "hi"
	 * startWord("hippo", "xip") → "hip"
	 * startWord("hippo", "i") → "h"
	 */
	public String startWord(String str, String word)
	{
		throw new UnsupportedOperationException("Not implemented yet");
	}

	/**
	 * Given a string, if the first or last chars are 'x', return the string without those 'x' chars, and otherwise return the string unchanged.
	 *
	 * withoutX("xHix") → "Hi"
	 * withoutX("xHi") → "Hi"
	 * withoutX("Hxix") → "Hxi"
	 */
	public String withoutX(String str)
	{
		throw new UnsupportedOperationException("Not implemented yet");
	}

	/**
	 * Given a string, if one or both of the first 2 chars is 'x', return the string without those 'x' chars, and otherwise return the string unchanged. This is a little harder than it looks.
	 *
	 * withoutX2("xHi") → "Hi"
	 * withoutX2("Hxi") → "Hi"
	 * withoutX2("Hi") → "Hi"
	 */
	public String withoutX2(String str)
	{
		throw new UnsupportedOperationException("Not implemented yet");
	}

	/**
	 * @param args command line arguments
	 */
	public void main(String[] args)
	{
		callTimes = 0;
		welcome();
		printMethod("helloName");
		System.out.println("helloName(\"Bob\") -> \"" + helloName("Bob") + "\"");
		System.out.println("helloName(\"Alice\") -> \"" + helloName("Alice") + "\"");
		System.out.println("helloName(\"X\") -> \"" + helloName("X") + "\"");
		System.out.println("helloName(\"Dolly\") -> \"" + helloName("Dolly") + "\"");
		System.out.println("helloName(\"Alpha\") -> \"" + helloName("Alpha") + "\"");
		System.out.println("helloName(\"Omega\") -> \"" + helloName("Omega") + "\"");
		System.out.println("helloName(\"Goodbye\") -> \"" + helloName("Goodbye") + "\"");
		System.out.println("helloName(\"ho ho ho\") -> \"" + helloName("ho ho ho") + "\"");
		System.out.println("helloName(\"xyz!\") -> \"" + helloName("xyz!") + "\"");
		System.out.println("helloName(\"Hello\") -> \"" + helloName("Hello") + "\"");
		printMethod("makeAbba");
		System.out.println("makeAbba(\"Hi\", \"Bye\") -> \"" + makeAbba("Hi", "Bye") + "\"");
		System.out.println("makeAbba(\"Yo\", \"Alice\") -> \"" + makeAbba("Yo", "Alice") + "\"");
		System.out.println("makeAbba(\"What\", \"Up\") -> \"" + makeAbba("What", "Up") + "\"");
		System.out.println("makeAbba(\"aaa\", \"bbb\") -> \"" + makeAbba("aaa", "bbb") + "\"");
		System.out.println("makeAbba(\"x\", \"y\") -> \"" + makeAbba("x", "y") + "\"");
		System.out.println("makeAbba(\"x\", \"\") -> \"" + makeAbba("x", "") + "\"");
		System.out.println("makeAbba(\"\", \"y\") -> \"" + makeAbba("", "y") + "\"");
		System.out.println("makeAbba(\"Bo\", \"Ya\") -> \"" + makeAbba("Bo", "Ya") + "\"");
		System.out.println("makeAbba(\"Ya\", \"Ya\") -> \"" + makeAbba("Ya", "Ya") + "\"");
		printMethod("makeTags");
		System.out.println("makeTags(\"i\", \"Yay\") -> \"" + makeTags("i", "Yay") + "\"");
		System.out.println("makeTags(\"i\", \"Hello\") -> \"" + makeTags("i", "Hello") + "\"");
		System.out.println("makeTags(\"cite\", \"Yay\") -> \"" + makeTags("cite", "Yay") + "\"");
		System.out.println("makeTags(\"address\", \"here\") -> \"" + makeTags("address", "here") + "\"");
		System.out.println("makeTags(\"body\", \"Heart\") -> \"" + makeTags("body", "Heart") + "\"");
		System.out.println("makeTags(\"i\", \"i\") -> \"" + makeTags("i", "i") + "\"");
		System.out.println("makeTags(\"i\", \"\") -> \"" + makeTags("i", "") + "\"");
		printMethod("makeOutWord");
		System.out.println("makeOutWord(\"<<>>\", \"Yay\") -> \"" + makeOutWord("<<>>", "Yay") + "\"");
		System.out.println("makeOutWord(\"<<>>\", \"WooHoo\") -> \"" + makeOutWord("<<>>", "WooHoo") + "\"");
		System.out.println("makeOutWord(\"[[]]\", \"word\") -> \"" + makeOutWord("[[]]", "word") + "\"");
		System.out.println("makeOutWord(\"HHoo\", \"Hello\") -> \"" + makeOutWord("HHoo", "Hello") + "\"");
		System.out.println("makeOutWord(\"abyz\", \"YAY\") -> \"" + makeOutWord("abyz", "YAY") + "\"");
		printMethod("extraEnd");
		System.out.println("extraEnd(\"Hello\") -> \"" + extraEnd("Hello") + "\"");
		System.out.println("extraEnd(\"ab\") -> \"" + extraEnd("ab") + "\"");
		System.out.println("extraEnd(\"Hi\") -> \"" + extraEnd("Hi") + "\"");
		System.out.println("extraEnd(\"Candy\") -> \"" + extraEnd("Candy") + "\"");
		System.out.println("extraEnd(\"Code\") -> \"" + extraEnd("Code") + "\"");
		printMethod("firstTwo");
		System.out.println("firstTwo(\"Hello\") -> \"" + firstTwo("Hello") + "\"");
		System.out.println("firstTwo(\"abcdefg\") -> \"" + firstTwo("abcdefg") + "\"");
		System.out.println("firstTwo(\"ab\") -> \"" + firstTwo("ab") + "\"");
		System.out.println("firstTwo(\"a\") -> \"" + firstTwo("a") + "\"");
		System.out.println("firstTwo(\"\") -> \"" + firstTwo("") + "\"");
		System.out.println("firstTwo(\"Kitten\") -> \"" + firstTwo("Kitten") + "\"");
		System.out.println("firstTwo(\"hi\") -> \"" + firstTwo("hi") + "\"");
		System.out.println("firstTwo(\"hiya\") -> \"" + firstTwo("hiya") + "\"");
		printMethod("firstHalf");
		System.out.println("firstHalf(\"WooHoo\") -> \"" + firstHalf("WooHoo") + "\"");
		System.out.println("firstHalf(\"HelloThere\") -> \"" + firstHalf("HelloThere") + "\"");
		System.out.println("firstHalf(\"abcdef\") -> \"" + firstHalf("abcdef") + "\"");
		System.out.println("firstHalf(\"ab\") -> \"" + firstHalf("ab") + "\"");
		System.out.println("firstHalf(\"\") -> \"" + firstHalf("") + "\"");
		System.out.println("firstHalf(\"0123456789\") -> \"" + firstHalf("0123456789") + "\"");
		System.out.println("firstHalf(\"kitten\") -> \"" + firstHalf("kitten") + "\"");
		printMethod("withoutEnd");
		System.out.println("withoutEnd(\"Hello\") -> \"" + withoutEnd("Hello") + "\"");
		System.out.println("withoutEnd(\"java\") -> \"" + withoutEnd("java") + "\"");
		System.out.println("withoutEnd(\"coding\") -> \"" + withoutEnd("coding") + "\"");
		System.out.println("withoutEnd(\"code\") -> \"" + withoutEnd("code") + "\"");
		System.out.println("withoutEnd(\"ab\") -> \"" + withoutEnd("ab") + "\"");
		System.out.println("withoutEnd(\"Chocolate!\") -> \"" + withoutEnd("Chocolate!") + "\"");
		System.out.println("withoutEnd(\"kitten\") -> \"" + withoutEnd("kitten") + "\"");
		System.out.println("withoutEnd(\"woohoo\") -> \"" + withoutEnd("woohoo") + "\"");
		printMethod("comboString");
		System.out.println("comboString(\"Hello\", \"hi\") -> \"" + comboString("Hello", "hi") + "\"");
		System.out.println("comboString(\"hi\", \"Hello\") -> \"" + comboString("hi", "Hello") + "\"");
		System.out.println("comboString(\"aaa\", \"b\") -> \"" + comboString("aaa", "b") + "\"");
		System.out.println("comboString(\"b\", \"aaa\") -> \"" + comboString("b", "aaa") + "\"");
		System.out.println("comboString(\"aaa\", \"\") -> \"" + comboString("aaa", "") + "\"");
		System.out.println("comboString(\"\", \"bb\") -> \"" + comboString("", "bb") + "\"");
		System.out.println("comboString(\"aaa\", \"1234\") -> \"" + comboString("aaa", "1234") + "\"");
		System.out.println("comboString(\"aaa\", \"bb\") -> \"" + comboString("aaa", "bb") + "\"");
		System.out.println("comboString(\"a\", \"bb\") -> \"" + comboString("a", "bb") + "\"");
		System.out.println("comboString(\"bb\", \"a\") -> \"" + comboString("bb", "a") + "\"");
		System.out.println("comboString(\"xyz\", \"ab\") -> \"" + comboString("xyz", "ab") + "\"");
		printMethod("nonStart");
		System.out.println("nonStart(\"Hello\", \"There\") -> \"" + nonStart("Hello", "There") + "\"");
		System.out.println("nonStart(\"java\", \"code\") -> \"" + nonStart("java", "code") + "\"");
		System.out.println("nonStart(\"shotl\", \"java\") -> \"" + nonStart("shotl", "java") + "\"");
		System.out.println("nonStart(\"ab\", \"xy\") -> \"" + nonStart("ab", "xy") + "\"");
		System.out.println("nonStart(\"ab\", \"x\") -> \"" + nonStart("ab", "x") + "\"");
		System.out.println("nonStart(\"x\", \"ac\") -> \"" + nonStart("x", "ac") + "\"");
		System.out.println("nonStart(\"a\", \"x\") -> \"" + nonStart("a", "x") + "\"");
		System.out.println("nonStart(\"kit\", \"kat\") -> \"" + nonStart("kit", "kat") + "\"");
		System.out.println("nonStart(\"mart\", \"dart\") -> \"" + nonStart("mart", "dart") + "\"");
		printMethod("left2");
		System.out.println("left2(\"Hello\") -> \"" + left2("Hello") + "\"");
		System.out.println("left2(\"java\") -> \"" + left2("java") + "\"");
		System.out.println("left2(\"Hi\") -> \"" + left2("Hi") + "\"");
		System.out.println("left2(\"code\") -> \"" + left2("code") + "\"");
		System.out.println("left2(\"cat\") -> \"" + left2("cat") + "\"");
		System.out.println("left2(\"12345\") -> \"" + left2("12345") + "\"");
		System.out.println("left2(\"Chocolate\") -> \"" + left2("Chocolate") + "\"");
		System.out.println("Left2(\"bricks\") -> \"" + left2("bricks") + "\"");
		printMethod("right2");
		System.out.println("right2(\"Hello\") -> \"" + right2("Hello") + "\"");
		System.out.println("right2(\"java\") -> \"" + right2("java") + "\"");
		System.out.println("right2(\"Hi\") -> \"" + right2("Hi") + "\"");
		System.out.println("right2(\"code\") -> \"" + right2("code") + "\"");
		System.out.println("right2(\"cat\") -> \"" + right2("cat") + "\"");
		System.out.println("right2(\"12345\") -> \"" + right2("12345") + "\"");
		printMethod("theEnd");
		System.out.println("theEnd(\"Hello\", true) -> \"" + theEnd("Hello", true) + "\"");
		System.out.println("theEnd(\"Hello\", false) -> \"" + theEnd("Hello", false) + "\"");
		System.out.println("theEnd(\"oh\", true) -> \"" + theEnd("oh", true) + "\"");
		System.out.println("theEnd(\"x\", true) -> \"" + theEnd("x", true) + "\"");
		System.out.println("theEnd(\"x\", false) -> \"" + theEnd("x", false) + "\"");
		System.out.println("theEnd(\"java\", true) -> \"" + theEnd("java", true) + "\"");
		System.out.println("theEnd(\"chocolate\", false) -> \"" + theEnd("chocolate", false) + "\"");
		System.out.println("theEnd(\"1234\", true) -> \"" + theEnd("1234", true) + "\"");
		System.out.println("theEnd(\"code\", false) -> \"" + theEnd("code", false) + "\"");
		printMethod("withouEnd2");
		System.out.println("withouEnd2(\"Hello\") -> \"" + withouEnd2("Hello") + "\"");
		System.out.println("withouEnd2(\"abc\") -> \"" + withouEnd2("abc") + "\"");
		System.out.println("withouEnd2(\"ab\") -> \"" + withouEnd2("ab") + "\"");
		System.out.println("withouEnd2(\"a\") -> \"" + withouEnd2("a") + "\"");
		System.out.println("withouEnd2(\"\") -> \"" + withouEnd2("") + "\"");
		System.out.println("withouEnd2(\"coldy\") -> \"" + withouEnd2("coldy") + "\"");
		System.out.println("withouEnd2(\"java code\") -> \"" + withouEnd2("java code") + "\"");
		printMethod("middleTwo");
		System.out.println("middleTwo(\"string\") -> \"" + middleTwo("string") + "\"");
		System.out.println("middleTwo(\"code\") -> \"" + middleTwo("code") + "\"");
		System.out.println("middleTwo(\"Practice\") -> \"" + middleTwo("Practice") + "\"");
		System.out.println("middleTwo(\"ab\") -> \"" + middleTwo("ab") + "\"");
		System.out.println("middleTwo(\"0123456789\") -> \"" + middleTwo("0123456789") + "\"");
		printMethod("endsLy");
		System.out.println("endsLy(\"oddly\") -> " + endsLy("oddly"));
		System.out.println("endsLy(\"y\") -> " + endsLy("y"));
		System.out.println("endsLy(\"oddy\") -> " + endsLy("oddy"));
		System.out.println("endsLy(\"oddl\") -> " + endsLy("oddl"));
		System.out.println("endsLy(\"olydd\") -> " + endsLy("olydd"));
		System.out.println("endsLy(\"ly\") -> " + endsLy("ly"));
		System.out.println("endsLy(\"\") -> " + endsLy(""));
		System.out.println("endsLy(\"falsey\") -> " + endsLy("falsey"));
		System.out.println("endsLy(\"evenly\") -> " + endsLy("evenly"));
		printMethod("nTwice");
		System.out.println("nTwice(\"Hello\", 2) -> \"" + nTwice("Hello", 2) + "\"");
		System.out.println("nTwice(\"Chocolate\", 3) -> \"" + nTwice("Chocolate", 3) + "\"");
		System.out.println("nTwice(\"Chocolate\", 1) -> \"" + nTwice("Chocolate", 1) + "\"");
		System.out.println("nTwice(\"Chocolate\", 0) -> \"" + nTwice("Chocolate", 0) + "\"");
		System.out.println("nTwice(\"Hello\", 4) -> \"" + nTwice("Hello", 4) + "\"");
		System.out.println("nTwice(\"Code\", 4) -> \"" + nTwice("Code", 4) + "\"");
		System.out.println("nTwice(\"Code\", 2) -> \"" + nTwice("Code", 2) + "\"");
		printMethod("twoChar");
		System.out.println("twoChar(\"java\", 0) -> \"" + twoChar("java", 0) + "\"");
		System.out.println("twoChar(\"java\", 2) -> \"" + twoChar("java", 2) + "\"");
		System.out.println("twoChar(\"java\", 3) -> \"" + twoChar("java", 3) + "\"");
		System.out.println("twoChar(\"java\", 4) -> \"" + twoChar("java", 4) + "\"");
		System.out.println("twoChar(\"java\", -1) -> \"" + twoChar("java", -1) + "\"");
		System.out.println("twoChar(\"Hello\", 0) -> \"" + twoChar("Hello", 0) + "\"");
		System.out.println("twoChar(\"Hello\", 1) -> \"" + twoChar("Hello", 1) + "\"");
		System.out.println("twoChar(\"Hello\", 99) -> \"" + twoChar("Hello", 99) + "\"");
		System.out.println("twoChar(\"Hello\", 3) -> \"" + twoChar("Hello", 3) + "\"");
		System.out.println("twoChar(\"Hello\", 4) -> \"" + twoChar("Hello", 4) + "\"");
		System.out.println("twoChar(\"Hello\", 5) -> \"" + twoChar("Hello", 5) + "\"");
		System.out.println("twoChar(\"Hello\", -7) -> \"" + twoChar("Hello", -7) + "\"");
		System.out.println("twoChar(\"Hello\", 6) -> \"" + twoChar("Hello", 6) + "\"");
		System.out.println("twoChar(\"Hello\", -1) -> \"" + twoChar("Hello", -1) + "\"");
		System.out.println("twoChar(\"yay\", 0) -> \"" + twoChar("yay", 0) + "\"");
		printMethod("middleThree");
		System.out.println("middleThree(\"Candy\") -> \"" + middleThree("Candy") + "\"");
		System.out.println("middleThree(\"and\") -> \"" + middleThree("and") + "\"");
		System.out.println("middleThree(\"solving\") -> \"" + middleThree("solving") + "\"");
		System.out.println("middleThree(\"Hi yet Hi\") -> \"" + middleThree("Hi yet Hi") + "\"");
		System.out.println("middleThree(\"java yet java\") -> \"" + middleThree("java yet java") + "\"");
		System.out.println("middleThree(\"Chocolate\") -> \"" + middleThree("Chocolate") + "\"");
		System.out.println("middleThree(\"XabcxyzabcX\") -> \"" + middleThree("XabcxyzabcX") + "\"");
		printMethod("hasBad");
		System.out.println("hasBad(\"badxx\") -> " + hasBad("badxx"));
		System.out.println("hasBad(\"xbadxx\") -> " + hasBad("xbadxx"));
		System.out.println("hasBad(\"xxbadxx\") -> " + hasBad("xxbadxx"));
		System.out.println("hasBad(\"code\") -> " + hasBad("code"));
		System.out.println("hasBad(\"bad\") -> " + hasBad("bad"));
		System.out.println("hasBad(\"ba\") -> " + hasBad("ba"));
		System.out.println("hasBad(\"xba\") -> " + hasBad("xba"));
		System.out.println("hasBad(\"xbad\") -> " + hasBad("xbad"));
		System.out.println("hasBad(\"\") -> " + hasBad(""));
		System.out.println("hasBad(\"badyy\") -> " + hasBad("badyy"));
		printMethod("atFirst");
		System.out.println("atFirst(\"hello\") -> \"" + atFirst("hello") + "\"");
		System.out.println("atFirst(\"hi\") -> \"" + atFirst("hi") + "\"");
		System.out.println("atFirst(\"h\") -> \"" + atFirst("h") + "\"");
		System.out.println("atFirst(\"\") -> \"" + atFirst("") + "\"");
		System.out.println("atFirst(\"kitten\") -> \"" + atFirst("kitten") + "\"");
		System.out.println("atFirst(\"java\") -> \"" + atFirst("java") + "\"");
		System.out.println("atFirst(\"j\") -> \"" + atFirst("j") + "\"");
		printMethod("lastChars");
		System.out.println("lastChars(\"last\", \"chars\") -> \"" + lastChars("last", "chars") + "\"");
		System.out.println("lastChars(\"yo\", \"java\") -> \"" + lastChars("yo", "java") + "\"");
		System.out.println("lastChars(\"hi\", \"\") -> \"" + lastChars("hi", "") + "\"");
		System.out.println("lastChars(\"\", \"hello\") -> \"" + lastChars("", "hello") + "\"");
		System.out.println("lastChars(\"\", \"\") -> \"" + lastChars("", "") + "\"");
		System.out.println("lastChars(\"kitten\", \"hi\") -> \"" + lastChars("kitten", "hi") + "\"");
		System.out.println("lastChars(\"k\", \"zip\") -> \"" + lastChars("k", "zip") + "\"");
		System.out.println("lastChars(\"kitten\", \"\") -> \"" + lastChars("kitten", "") + "\"");
		System.out.println("lastChars(\"kitten\", \"zip\") -> \"" + lastChars("kitten", "zip") + "\"");
		printMethod("conCat");
		System.out.println("conCat(\"abc\", \"cat\") -> \"" + conCat("abc", "cat") + "\"");
		System.out.println("conCat(\"dog\", \"cat\") -> \"" + conCat("dog", "cat") + "\"");
		System.out.println("conCat(\"abc\", \"\") -> \"" + conCat("abc", "") + "\"");
		System.out.println("conCat(\"\", \"cat\") -> \"" + conCat("", "cat") + "\"");
		System.out.println("conCat(\"pig\", \"g\") -> \"" + conCat("pig", "g") + "\"");
		System.out.println("conCat(\"pig\", \"doggy\") -> \"" + conCat("pig", "doggy") + "\"");
		printMethod("lastTwo");
		System.out.println("lastTwo(\"coding\") -> \"" + lastTwo("coding") + "\"");
		System.out.println("lastTwo(\"cat\") -> \"" + lastTwo("cat") + "\"");
		System.out.println("lastTwo(\"ab\") -> \"" + lastTwo("ab") + "\"");
		System.out.println("lastTwo(\"a\") -> \"" + lastTwo("a") + "\"");
		System.out.println("lastTwo(\"\") -> \"" + lastTwo("") + "\"");
		printMethod("seeColor");
		System.out.println("seeColor(\"redxx\") -> \"" + seeColor("redxx") + "\"");
		System.out.println("seeColor(\"xxred\") -> \"" + seeColor("xxred") + "\"");
		System.out.println("seeColor(\"blueTimes\") -> \"" + seeColor("blueTimes") + "\"");
		System.out.println("seeColor(\"NoColor\") -> \"" + seeColor("NoColor") + "\"");
		System.out.println("seeColor(\"red\") -> \"" + seeColor("red") + "\"");
		System.out.println("seeColor(\"re\") -> \"" + seeColor("re") + "\"");
		System.out.println("seeColor(\"blu\") -> \"" + seeColor("blu") + "\"");
		System.out.println("seeColor(\"blue\") -> \"" + seeColor("blue") + "\"");
		System.out.println("seeColor(\"a\") -> \"" + seeColor("a") + "\"");
		System.out.println("seeColor(\"\") -> \"" + seeColor("") + "\"");
		System.out.println("seeColor(\"xyzred\") -> \"" + seeColor("xyzred") + "\"");
		printMethod("frontAgain");
		System.out.println("frontAgain(\"edited\") -> " + frontAgain("edited"));
		System.out.println("frontAgain(\"edit\") -> " + frontAgain("edit"));
		System.out.println("frontAgain(\"ed\") -> " + frontAgain("ed"));
		System.out.println("frontAgain(\"jj\") -> " + frontAgain("jj"));
		System.out.println("frontAgain(\"jjj\") -> " + frontAgain("jjj"));
		System.out.println("frontAgain(\"jjjj\") -> " + frontAgain("jjjj"));
		System.out.println("frontAgain(\"jjjk\") -> " + frontAgain("jjjk"));
		System.out.println("frontAgain(\"x\") -> " + frontAgain("x"));
		System.out.println("frontAgain(\"\") -> " + frontAgain(""));
		System.out.println("frontAgain(\"java\") -> " + frontAgain("java"));
		System.out.println("frontAgain(\"javaja\") -> " + frontAgain("javaja"));
		printMethod("minCat");
		System.out.println("minCat(\"Hello\", \"Hi\") -> \"" + minCat("Hello", "Hi") + "\"");
		System.out.println("minCat(\"Hello\", \"java\") -> \"" + minCat("Hello", "java") + "\"");
		System.out.println("minCat(\"java\", \"Hello\") -> \"" + minCat("java", "Hello") + "\"");
		System.out.println("minCat(\"abc\", \"x\") -> \"" + minCat("abc", "x") + "\"");
		System.out.println("minCat(\"x\", \"abc\") -> \"" + minCat("x", "abc") + "\"");
		System.out.println("minCat(\"abc\", \"\") -> \"" + minCat("abc", "") + "\"");
		printMethod("extraFront");
		System.out.println("extraFront(\"Hello\") -> \"" + extraFront("Hello") + "\"");
		System.out.println("extraFront(\"ab\") -> \"" + extraFront("ab") + "\"");
		System.out.println("extraFront(\"H\") -> \"" + extraFront("H") + "\"");
		System.out.println("extraFront(\"\") -> \"" + extraFront("") + "\"");
		System.out.println("extraFront(\"Candy\") -> \"" + extraFront("Candy") + "\"");
		System.out.println("extraFront(\"Code\") -> \"" + extraFront("Code") + "\"");
		printMethod("without2");
		System.out.println("without2(\"HelloHe\") -> \"" + without2("HelloHe") + "\"");
		System.out.println("without2(\"HelloHi\") -> \"" + without2("HelloHi") + "\"");
		System.out.println("without2(\"Hi\") -> \"" + without2("Hi") + "\"");
		System.out.println("without2(\"Chocolate\") -> \"" + without2("Chocolate") + "\"");
		System.out.println("without2(\"xxx\") -> \"" + without2("xxx") + "\"");
		System.out.println("without2(\"xx\") -> \"" + without2("xx") + "\"");
		System.out.println("without2(\"x\") -> \"" + without2("x") + "\"");
		System.out.println("without2(\"\") -> \"" + without2("") + "\"");
		System.out.println("without2(\"Fruits\") -> \"" + without2("Fruits") + "\"");
		printMethod("deFront");
		System.out.println("deFront(\"Hello\") -> \"" + deFront("Hello") + "\"");
		System.out.println("deFront(\"java\") -> \"" + deFront("java") + "\"");
		System.out.println("deFront(\"away\") -> \"" + deFront("away") + "\"");
		System.out.println("deFront(\"axy\") -> \"" + deFront("axy") + "\"");
		System.out.println("deFront(\"abc\") -> \"" + deFront("abc") + "\"");
		System.out.println("deFront(\"xby\") -> \"" + deFront("xby") + "\"");
		System.out.println("deFront(\"ab\") -> \"" + deFront("ab") + "\"");
		System.out.println("deFront(\"ax\") -> \"" + deFront("ax") + "\"");
		System.out.println("deFront(\"axb\") -> \"" + deFront("axb") + "\"");
		System.out.println("deFront(\"aaa\") -> \"" + deFront("aaa") + "\"");
		System.out.println("deFront(\"xbc\") -> \"" + deFront("xbc") + "\"");
		System.out.println("deFront(\"bbb\") -> \"" + deFront("bbb") + "\"");
		System.out.println("deFront(\"bazz\") -> \"" + deFront("bazz") + "\"");
		System.out.println("deFront(\"ba\") -> \"" + deFront("ba") + "\"");
		System.out.println("deFront(\"abxyz\") -> \"" + deFront("abxyz") + "\"");
		System.out.println("deFront(\"hi\") -> \"" + deFront("hi") + "\"");
		System.out.println("deFront(\"his\") -> \"" + deFront("his") + "\"");
		System.out.println("deFront(\"xz\") -> \"" + deFront("xz") + "\"");
		System.out.println("deFront(\"zzz\") -> \"" + deFront("zzz") + "\"");
		printMethod("startWord");
		System.out.println("startWord(\"hippo\", \"hi\") -> \"" + startWord("hippo", "hi") + "\"");
		System.out.println("startWord(\"hippo\", \"xip\") -> \"" + startWord("hippo", "xip") + "\"");
		System.out.println("startWord(\"hippo\", \"i\") -> \"" + startWord("hippo", "i") + "\"");
		System.out.println("startWord(\"hippo\", \"ix\") -> \"" + startWord("hippo", "ix") + "\"");
		System.out.println("startWord(\"h\", \"ix\") -> \"" + startWord("h", "ix") + "\"");
		System.out.println("startWord(\"\", \"i\") -> \"" + startWord("", "i") + "\"");
		System.out.println("startWord(\"hip\", \"zi\") -> \"" + startWord("hip", "zi") + "\"");
		System.out.println("startWord(\"hip\", \"zip\") -> \"" + startWord("hip", "zip") + "\"");
		System.out.println("startWord(\"hip\", \"zig\") -> \"" + startWord("hip", "zig") + "\"");
		System.out.println("startWord(\"h\", \"z\") -> \"" + startWord("h", "z") + "\"");
		System.out.println("startWord(\"hippo\", \"xippo\") -> \"" + startWord("hippo", "xippo") + "\"");
		System.out.println("startWord(\"hippo\", \"xyz\") -> \"" + startWord("hippo", "xyz") + "\"");
		System.out.println("startWord(\"hippo\", \"hip\") -> \"" + startWord("hippo", "hip") + "\"");
		System.out.println("startWord(\"kitten\", \"cit\") -> \"" + startWord("kitten", "cit") + "\"");
		System.out.println("startWord(\"kit\", \"cit\") -> \"" + startWord("kit", "cit") + "\"");
		printMethod("withoutX");
		System.out.println("withoutX(\"xHix\") -> \"" + withoutX("xHix") + "\"");
		System.out.println("withoutX(\"xHi\") -> \"" + withoutX("xHi") + "\"");
		System.out.println("withoutX(\"Hxix\") -> \"" + withoutX("Hxix") + "\"");
		System.out.println("withoutX(\"Hi\") -> \"" + withoutX("Hi") + "\"");
		System.out.println("withoutX(\"xxHi\") -> \"" + withoutX("xxHi") + "\"");
		System.out.println("withoutX(\"Hix\") -> \"" + withoutX("Hix") + "\"");
		System.out.println("withoutX(\"xaxbx\") -> \"" + withoutX("xaxbx") + "\"");
		System.out.println("withoutX(\"xx\") -> \"" + withoutX("xx") + "\"");
		System.out.println("withoutX(\"x\") -> \"" + withoutX("x") + "\"");
		System.out.println("withoutX(\"\") -> \"" + withoutX("") + "\"");
		System.out.println("withoutX(\"Hello\") -> \"" + withoutX("Hello") + "\"");
		System.out.println("withoutX(\"Hexllo\") -> \"" + withoutX("Hexllo") + "\"");
		printMethod("withoutX2");
		System.out.println("withoutX2(\"xHi\") -> \"" + withoutX2("xHi") + "\"");
		System.out.println("withoutX2(\"Hxi\") -> \"" + withoutX2("Hxi") + "\"");
		System.out.println("withoutX2(\"Hi\") -> \"" + withoutX2("Hi") + "\"");
		System.out.println("withoutX2(\"xxHi\") -> \"" + withoutX2("xxHi") + "\"");
		System.out.println("withoutX2(\"Hix\") -> \"" + withoutX2("Hix") + "\"");
		System.out.println("withoutX2(\"xaxb\") -> \"" + withoutX2("xaxb") + "\"");
		System.out.println("withoutX2(\"xx\") -> \"" + withoutX2("xx") + "\"");
		System.out.println("withoutX2(\"x\") -> \"" + withoutX2("x") + "\"");
		System.out.println("withoutX2(\"\") -> \"" + withoutX2("") + "\"");
		System.out.println("withoutX2(\"Hello\") -> \""  + withoutX2("Hello") + "\"");
		System.out.println("withoutX2(\"Hexllo\") -> \"" + withoutX2("Hexllo") + "\"");
		System.out.println("withoutX2(\"xHxllo\") -> \"" + withoutX2("xHxllo") + "\"");
	}
}
