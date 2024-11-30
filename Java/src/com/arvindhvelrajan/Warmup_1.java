package com.arvindhvelrajan;

import static com.arvindhvelrajan.UI_Functions.*;

/**
 * @author arvindhvelrajan
 * @code This class is to demonstrate the implementation for all functions in Warmup-1 from codingbat.com
 */
public class Warmup_1
{
	private void welcome()
	{
		System.out.println("Warmup-1 Functions\n");
	}

	/**
	 * The parameter weekday is true if it is a weekday, and the parameter vacation is
	 * true if we are on vacation. We sleep in if it is not a weekday or we're on vacation.
	 * Return true if we sleep in.
	 *
	 * sleepIn(false, false) → true
	 * sleepIn(true, false) → false
	 * sleepIn(false, true) → true
	 */
	public boolean sleepIn(boolean weekday, boolean vacation)
	{
		throw new UnsupportedOperationException("Not supported yet.");
	}

	/**
	 * We have two monkeys, a and b, and the parameters aSmile and bSmile indicate if each is smiling.
	 * We are in trouble if they are both smiling or if neither of them is smiling.
	 * Return true if we are in trouble.
	 *
	 * monkeyTrouble(true, true) → true
	 * monkeyTrouble(false, false) → true
	 * monkeyTrouble(true, false) → false
	 */
	public boolean monkeyTrouble(boolean aSmile, boolean bSmile)
	{
		throw new UnsupportedOperationException("Not supported yet.");
	}

	/**
	 * Given two int values, return their sum. Unless the two values are the same,
	 * then return double their sum.
	 *
	 * sumDouble(1, 2) → 3
	 * sumDouble(3, 2) → 5
	 * sumDouble(2, 2) → 8
	 */
	public int sumDouble(int a, int b)
	{
		throw new UnsupportedOperationException("Not supported yet.");
	}

	/**
	 * Given an int n, return the absolute difference between n and 21,
	 * except return double the absolute difference if n is over 21.
	 *
	 * diff21(19) → 2
	 * diff21(10) → 11
	 * diff21(21) → 0
	 */
	public int diff21(int n)
	{
		throw new UnsupportedOperationException("Not supported yet.");
	}

	/**
	 * We have a loud talking parrot. The "hour" parameter is the current hour time in the range 0..23.
	 * We are in trouble if the parrot is talking and the hour is before 7 or after 20.
	 * Return true if we are in trouble.
	 *
	 * parrotTrouble(true, 6) → true
	 * parrotTrouble(true, 7) → false
	 * parrotTrouble(false, 6) → false
	 */
	public boolean parrotTrouble(boolean talking, int hour)
	{
		throw new UnsupportedOperationException("Not supported yet.");
	}

	/**
	 * Given 2 ints, a and b, return true if one if them is 10 or if their sum is 10.
	 *
	 * makes10(9, 10) → true
	 * makes10(9, 9) → false
	 * makes10(1, 9) → true
	 */
	public boolean makes10(int a, int b)
	{
		throw new UnsupportedOperationException("Not supported yet.");
	}

	/**
	 * Given an int n, return true if it is within 10 of 100 or 200.
	 * Note: Math.abs(num) computes the absolute value of a number.
	 *
	 * nearHundred(93) → true
	 * nearHundred(90) → true
	 * nearHundred(89) → false
	 */
	public boolean nearHundred(int n)
	{
		throw new UnsupportedOperationException("Not supported yet.");
	}

	/**
	 * Given 2 int values, return true if one is negative and one is positive.
	 * Except if the parameter "negative" is true, then return true only if both are negative.
	 *
	 * posNeg(1, -1, false) → true
	 * posNeg(-1, 1, false) → true
	 * posNeg(-4, -5, true) → true
	 */
	public boolean posNeg(int a, int b, boolean negative)
	{
		throw new UnsupportedOperationException("Not supported yet.");
	}

	/**
	 * Given a string, return a new string where "not " has been added to the front.
	 * However, if the string already begins with "not", return the string unchanged.
	 * Note: use .equals() to compare 2 strings.
	 *
	 * notString("candy") → "not candy"
	 * notString("x") → "not x"
	 * notString("not bad") → "not bad"
	 */
	public String notString(String str)
	{
		throw new UnsupportedOperationException("Not supported yet.");
	}

	/**
	 * Given a non-empty string and an int n, return a new string where the char at index n has been removed.
	 * The value of n will be a valid index of a char in the original string (i.e. n will be in the
	 * range 0..str.length()-1 inclusive).
	 *
	 * missingChar("kitten", 1) → "ktten"
	 * missingChar("kitten", 0) → "itten"
	 * missingChar("kitten", 4) → "kittn"
	 */
	public String missingChar(String str, int n)
	{
		throw new UnsupportedOperationException("Not supported yet.");
	}

	/**
	 * Given a string, return a new string where the first and last chars have been exchanged.
	 *
	 * frontBack("code") → "eodc"
	 * frontBack("a") → "a"
	 * frontBack("ab") → "ba"
	 */
	public String frontBack(String str)
	{
		throw new UnsupportedOperationException("Not supported yet.");
	}

	/**
	 * Given a string, we'll say that the front is the first 3 chars of the string.
	 * If the string length is less than 3, the front is whatever is there.
	 * Return a new string which is 3 copies of the front.
	 *
	 * front3("Java") → "JavJavJav"
	 * front3("Chocolate") → "ChoChoCho"
	 * front3("abc") → "abcabcabc"
	 */
	public String front3(String str)
	{
		throw new UnsupportedOperationException("Not supported yet.");
	}

	/**
	 * Given a string, take the last char and return a new string with the last char added at the front and back,
	 * so "cat" yields "tcatt". The original string will be length 1 or more.
	 *
	 * backAround("cat") → "tcatt"
	 * backAround("Hello") → "oHelloo"
	 * backAround("a") → "aaa"
	 */
	public String backAround(String str)
	{
		throw new UnsupportedOperationException("Not supported yet.");
	}

	/**
	 * Return true if the given non-negative number is a multiple of 3 or a multiple of 5.
	 * Use the % "mod" operator -- see Introduction to Mod
	 *
	 * or35(3) → true
	 * or35(10) → true
	 * or35(8) → false
	 */
	public boolean or35(int n)
	{
		throw new UnsupportedOperationException("Not supported yet.");
	}

	/**
	 * Given a string, take the first 2 chars and return the string with the 2 chars added at both
	 * the front and back, so "kitten" yields"kikittenki".
	 * If the string length is less than 2, use whatever chars are there.
	 *
	 * front22("kitten") → "kikittenki"
	 * front22("Ha") → "HaHaHa"
	 * front22("abc") → "ababcab"
	 */
	public String front22(String str)
	{
		throw new UnsupportedOperationException("Not supported yet.");
	}

	/**
	 * Given a string, return true if the string starts with "hi" and false otherwise.
	 *
	 * startHi("hi there") → true
	 * startHi("hi") → true
	 * startHi("hello hi") → false
	 */
	public boolean startHi(String str)
	{
		throw new UnsupportedOperationException("Not supported yet.");
	}

	/**
	 * Given two temperatures, return true if one is less than 0 and the other is greater than 100.
	 *
	 * icyHot(120, -1) → true
	 * icyHot(-1, 120) → true
	 * icyHot(2, 120) → false
	 */
	public boolean icyHot(int temp1, int temp2)
	{
		throw new UnsupportedOperationException("Not supported yet.");
	}

	/**
	 * Given 2 int values, return true if either of them is in the range 10..20 inclusive.
	 *
	 * in1020(12, 99) → true
	 * in1020(21, 12) → true
	 * in1020(8, 99) → false
	 */
	public boolean in1020(int a, int b)
	{
		throw new UnsupportedOperationException("Not supported yet.");
	}

	/**
	 * We'll say that a number is "teen" if it is in the range 13..19 inclusive.
	 * Given 3 int values, return true if 1 or more of them are teen.
	 *
	 * hasTeen(13, 20, 10) → true
	 * hasTeen(20, 19, 10) → true
	 * hasTeen(20, 10, 13) → true
	 */
	public boolean hasTeen(int a, int b, int c)
	{
		throw new UnsupportedOperationException("Not supported yet.");
	}

	/**
	 * We'll say that a number is "teen" if it is in the range 13..19 inclusive.
	 * Given 2 int values, return true if one or the other is teen, but not both.
	 *
	 * loneTeen(13, 99) → true
	 * loneTeen(21, 19) → true
	 * loneTeen(13, 13) → false
	 */
	public boolean loneTeen(int a, int b)
	{
		throw new UnsupportedOperationException("Not supported yet.");
	}

	/**
	 * Given a string, if the string "del" appears starting at index 1,
	 * return a string where that "del" has been deleted. Otherwise, return the string unchanged.
	 *
	 * delDel("adelbc") → "abc"
	 * delDel("adelHello") → "aHello"
	 * delDel("adedbc") → "adedbc"
	 */
	public String delDel(String str)
	{
		throw new UnsupportedOperationException("Not supported yet.");
	}

	/**
	 * Return true if the given string begins with "mix", except the 'm' can be anything,
	 * so "pix", "9ix" .. all count.
	 *
	 * mixStart("mix snacks") → true
	 * mixStart("pix snacks") → true
	 * mixStart("piz snacks") → false
	 */
	public boolean mixStart(String str)
	{
		throw new UnsupportedOperationException("Not supported yet.");
	}

	/**
	 * Given a string, return a string made of the first 2 chars (if present), however include first char only if it is 'o' and include the second only if it is 'z', so "ozymandias" yields "oz".
	 *
	 * startOz("ozymandias") → "oz"
	 * startOz("bzoo") → "z"
	 * startOz("oxx") → "o"
	 */
	public String startOz(String str)
	{
		throw new UnsupportedOperationException("Not supported yet.");
	}

	/**
	 * @param args commandline arguments
	 */
	public void main(String[] args)
	{
		welcome();
		printFunction("sleepIn");
		System.out.println("sleepIn(false, false) --> " + sleepIn(false, false));
		System.out.println("sleepIn(true, false) --> " + sleepIn(true, false));
		System.out.println("sleepIn(false, true) --> " + sleepIn(false, true));
		System.out.println("sleepIn(true, true) --> " + sleepIn(true, true));
		printFunction("monkeyTrouble");
		System.out.println("monkeyTrouble(true, true) --> " + monkeyTrouble(true, true));
		System.out.println("monkeyTrouble(false, false) --> " + monkeyTrouble(false, false));
		System.out.println("monkeyTrouble(true, false) --> " + monkeyTrouble(true, false));
		System.out.println("monkeyTrouble(false, true) --> " + monkeyTrouble(false, true));
		printFunction("sumDouble");
		System.out.println("sumDouble(1, 2) --> " + sumDouble(1, 2));
		System.out.println("sumDouble(3, 2) --> " + sumDouble(3, 2));
		System.out.println("sumDouble(2, 2) --> " + sumDouble(2, 2));
		System.out.println("sumDouble(-1, 0) --> " + sumDouble(-1, 0));
		System.out.println("sumDouble(3, 3) --> " + sumDouble(3, 3));
		System.out.println("sumDouble(0, 0) --> " + sumDouble(0, 0));
		System.out.println("sumDouble(0, 1) --> " + sumDouble(0, 1));
		System.out.println("sumDouble(3, 4) --> " + sumDouble(3, 4));
		printFunction("diff21");
		System.out.println("diff21(19) --> " + diff21(19));
		System.out.println("diff21(10) --> " + diff21(10));
		System.out.println("diff21(21) --> " + diff21(21));
		System.out.println("diff21(22) --> " + diff21(22));
		System.out.println("diff21(25) --> " + diff21(25));
		System.out.println("diff21(30) --> " + diff21(30));
		System.out.println("diff21(0) --> " + diff21(0));
		System.out.println("diff21(1) --> " + diff21(1));
		System.out.println("diff21(2) --> " + diff21(2));
		System.out.println("diff21(-1) --> " + diff21(-1));
		System.out.println("diff21(-2) --> " + diff21(-2));
		System.out.println("diff21(50) --> " + diff21(50));
		printFunction("parrotTrouble");
		System.out.println("parrotTrouble(true, 6) --> " + parrotTrouble(true, 6));
		System.out.println("parrotTrouble(true, 7) --> " + parrotTrouble(true, 7));
		System.out.println("parrotTrouble(false, 6) --> " + parrotTrouble(false, 6));
		System.out.println("parrotTrouble(true, 21) --> " + parrotTrouble(true, 21));
		System.out.println("parrotTrouble(false, 21) --> " + parrotTrouble(false, 21));
		System.out.println("parrotTrouble(false, 20) --> " + parrotTrouble(false, 20));
		System.out.println("parrotTrouble(true, 23) --> " + parrotTrouble(true, 23));
		System.out.println("parrotTrouble(false, 23) --> " + parrotTrouble(false, 23));
		System.out.println("parrotTrouble(true, 20) --> " + parrotTrouble(true, 20));
		System.out.println("parrotTrouble(false, 12) --> " + parrotTrouble(false, 12));
		printFunction("makes10");
		System.out.println("makes10(9, 10) --> " + makes10(9, 10));
		System.out.println("makes10(9, 9) --> " + makes10(9, 9));
		System.out.println("makes10(1, 9) --> " + makes10(1, 9));
		System.out.println("makes10(10, 1) --> " + makes10(10, 1));
		System.out.println("makes10(10, 10) --> " + makes10(10, 10));
		System.out.println("makes10(8, 2) --> " + makes10(8, 2));
		System.out.println("makes10(8, 3) --> " + makes10(8, 3));
		System.out.println("makes10(10, 42) --> " + makes10(10, 42));
		System.out.println("makes10(12, -2) --> " + makes10(12, -2));
		printFunction("nearHundred");
		System.out.println("nearHundred(93) --> " + nearHundred(93));
		System.out.println("nearHundred(90) --> " + nearHundred(90));
		System.out.println("nearHundred(89) --> " + nearHundred(89));
		System.out.println("nearHundred(110) --> " + nearHundred(110));
		System.out.println("nearHundred(111) --> " + nearHundred(111));
		System.out.println("nearHundred(121) --> " + nearHundred(121));
		System.out.println("nearHundred(-101) --> " + nearHundred(-101));
		System.out.println("nearHundred(-209) --> " + nearHundred(-209));
		System.out.println("nearHundred(190) --> " + nearHundred(190));
		System.out.println("nearHundred(209) --> " + nearHundred(209));
		System.out.println("nearHundred(0) --> " + nearHundred(0));
		System.out.println("nearHundred(5) --> " + nearHundred(5));
		System.out.println("nearHundred(-50) --> " + nearHundred(-50));
		System.out.println("nearHundred(191) --> " + nearHundred(191));
		System.out.println("nearHundred(189) --> " + nearHundred(189));
		System.out.println("nearHundred(200) --> " + nearHundred(200));
		System.out.println("nearHundred(210) --> " + nearHundred(210));
		System.out.println("nearHundred(211) --> " + nearHundred(211));
		System.out.println("nearHundred(290) --> " + nearHundred(290));
		printFunction("posNeg");
		System.out.println("posNeg(1, -1, false) --> " + posNeg(1, -1, false));
		System.out.println("posNeg(-1, 1, false) --> " + posNeg(-1, 1, false));
		System.out.println("posNeg(-4, -5, true) --> " + posNeg(-4, -5, true));
		System.out.println("posNeg(-4, 5, false) --> " + posNeg(-4, 5, true));
		System.out.println("posNeg(-4, 5, true) --> " + posNeg(-4, 5, true));
		System.out.println("posNeg(1, 1, false) --> " + posNeg(1, 1, false));
		System.out.println("posNeg(-1, -1, false) --> " + posNeg(-1, -1, false));
		System.out.println("posNeg(1, -1, true) --> " + posNeg(1, -1, true));
		System.out.println("posNeg(-1, 1, true) --> " + posNeg(-1, 1, true));
		System.out.println("posNeg(1, 1, true) --> " + posNeg(1, 1, true));
		System.out.println("posNeg(-1, -1, true) --> " + posNeg(-1, -1, true));
		System.out.println("posNeg(5, -5, false) --> " + posNeg(5, -5, false));
		System.out.println("posNeg(-6, 6, false) --> " + posNeg(-6, 6, false));
		System.out.println("posNeg(-5, -6, false) --> " + posNeg(-5, -6, false));
		System.out.println("posNeg(-2, -1, false) --> " + posNeg(-2, -1, false));
		System.out.println("posNeg(1, 2, false) --> " + posNeg(1, 2, false));
		System.out.println("posNeg(-5, 6, true) --> " + posNeg(-5, 6, true));
		System.out.println("posNeg(-5, -5, true) --> " + posNeg(-5, -5, true));
		printFunction("notString");
		System.out.println("notString(\"candy\") --> \"" + notString("candy") + "\"");
		System.out.println("notString(\"x\") --> \"" + notString("x") + "\"");
		System.out.println("notString(\"not bad\") --> \"" + notString("not bad") + "\"");
		System.out.println("notString(\"not\") --> \"" + notString("not") + "\"");
		System.out.println("notString(\"is not\") --> \"" + notString("is not") + "\"");;
		System.out.println("notString(\"no\") --> \"" + notString("no") + "\"");
		printFunction("missingChar");
		System.out.println("missingChar(\"kitten\", 1) --> \"" + missingChar("kitten", 1) + "\"");
		System.out.println("missingChar(\"kitten\", 0) --> \"" + missingChar("kitten", 0) + "\"");
		System.out.println("missingChar(\"kitten\", 4) --> \"" + missingChar("kitten", 4) + "\"");
		System.out.println("missingChar(\"Hi\", 0) --> \"" + missingChar("Hi", 0) + "\"");
		System.out.println("missingChar(\"Hi\", 1) --> \"" + missingChar("Hi", 1) + "\"");
		System.out.println("missingChar(\"code\", 0) --> \"" + missingChar("code", 0) + "\"");
		System.out.println("missingChar(\"code\", 1) --> \"" + missingChar("code", 1) + "\"");
		System.out.println("missingChar(\"code\", 2) --> \"" + missingChar("code", 2) + "\"");
		System.out.println("missingChar(\"code\", 3) --> \"" + missingChar("code", 3) + "\"");
		System.out.println("missingChar(\"chocolate\", 8) --> \"" + missingChar("chocolate", 8) + "\"");
		printFunction("frontBack");
		System.out.println("frontBack(\"code\") --> \"" + frontBack("code") + "\"");
		System.out.println("frontBack(\"a\") --> \"" + frontBack("a") + "\"");
		System.out.println("frontBack(\"ab\") --> \"" + frontBack("ab") + "\"");
		System.out.println("frontBack(\"abc\") --> \"" + frontBack("abc") + "\"");
		System.out.println("frontBack(\"\") --> \"" + frontBack("") + "\"");
		System.out.println("frontBack(\"Chocolate\") --> \"" + frontBack("Chocolate") + "\"");
		System.out.println("frontBack(\"aavJ\") --> \"" + frontBack("aavJ") + "\"");
		System.out.println("frontBack(\"hello\") --> \"" + frontBack("hello") + "\"");
		printFunction("front3");
		System.out.println("front3(\"Java\") --> \"" + front3("Java") + "\"");
		System.out.println("front3(\"Chocolate\") --> \"" + front3("Chocolate") + "\"");
		System.out.println("front3(\"abc\") --> \"" + front3("abc") + "\"");
		System.out.println("front3(\"abcXYZ\") --> \"" + front3("abcXYZ") + "\"");
		System.out.println("front3(\"ab\") --> \"" + front3("ab") + "\"");
		System.out.println("front3(\"a\") --> \"" + front3("a") + "\"");
		System.out.println("front3(\"\") --> \"" + front3("") + "\"");
		printFunction("backAround");
		System.out.println("backAround(\"cat\") --> \"" + backAround("cat") + "\"");
		System.out.println("backAround(\"Hello\") --> \"" + backAround("Hello") + "\"");
		System.out.println("backAround(\"a\") --> \"" + backAround("a") + "\"");
		System.out.println("backAround(\"abc\") --> \"" + backAround("abc") + "\"");
		System.out.println("backAround(\"read\") --> \"" + backAround("read") + "\"");
		System.out.println("backAround(\"boo\") --> \"" + backAround("boo") + "\"");
		printFunction("or35");
		System.out.println("or35(3) --> " + or35(3));
		System.out.println("or35(10) --> " + or35(10));
		System.out.println("or35(8) --> " + or35(8));
		System.out.println("or35(15) --> " + or35(15));
		System.out.println("or35(5) --> " + or35(5));
		System.out.println("or35(9) --> " + or35(9));
		System.out.println("or35(4) --> " + or35(4));
		System.out.println("or35(7) --> " + or35(7));
		System.out.println("or35(6) --> " + or35(6));
		System.out.println("or35(17) --> " + or35(17));
		System.out.println("or35(18) --> " + or35(18));
		System.out.println("or35(29) --> " + or35(29));
		System.out.println("or35(20) --> " + or35(20));
		System.out.println("or35(21) --> " + or35(21));
		System.out.println("or35(22) --> " + or35(22));
		System.out.println("or35(45) --> " + or35(45));
		System.out.println("or35(99) --> " + or35(99));
		System.out.println("or35(100) --> " + or35(100));
		System.out.println("or35(101) --> " + or35(101));
		System.out.println("or35(121) --> " + or35(121));
		System.out.println("or35(122) --> " + or35(122));
		System.out.println("or35(123) --> " + or35(123));
		printFunction("front22");
		System.out.println("front22(\"kitten\") --> \"" + front22("kitten") + "\"");
		System.out.println("front22(\"Ha\") --> \"" + front22("Ha") + "\"");
		System.out.println("front22(\"abc\") --> \"" + front22("abc") + "\"");
		System.out.println("front22(\"ab\") --> \"" + front22("ab") + "\"");
		System.out.println("front22(\"a\") --> \"" + front22("a") + "\"");
		System.out.println("front22(\"\") --> \"" + front22("") + "\"");
		System.out.println("front22(\"Logic\") --> \"" + front22("Logic") + "\"");
		printFunction("startHi");
		System.out.println("startHi(\"hi there\") --> " + startHi("hi there"));
		System.out.println("startHi(\"hi\") --> " + startHi("hi"));
		System.out.println("startHi(\"hello hi\") --> " + startHi("hello hi"));
		System.out.println("startHi(\"he\") --> " + startHi("he"));
		System.out.println("startHi(\"h\") --> " + startHi("h"));
		System.out.println("startHi(\"\") --> " + startHi(""));
		System.out.println("startHi(\"ho hi\") --> " + startHi("ho hi"));
		System.out.println("startHi(\"hi ho\") --> " + startHi("hi ho"));
		printFunction("icyHot");
		System.out.println("icyHot(120, -1) --> " + icyHot(120, -1));
		System.out.println("icyHot(-1, 120) --> " + icyHot(-1, 120));
		System.out.println("icyHot(2, 120) --> " + icyHot(2, 120));
		System.out.println("icyHot(-1, 100) --> " + icyHot(-1, 100));
		System.out.println("icyHot(-2, -2) --> " + icyHot(-2, -2));
		System.out.println("icyHot(120, 120) --> " + icyHot(120, 120));
		printFunction("in1020");
		System.out.println("in1020(12, 99) --> " + in1020(12, 99));
		System.out.println("in1020(21, 12) --> " + in1020(21, 12));
		System.out.println("in1020(8, 99) --> " + in1020(8, 99));
		System.out.println("in1020(99, 10) --> " + in1020(99, 10));
		System.out.println("in1020(20, 20) --> " + in1020(20, 20));
		System.out.println("in1020(21, 21) --> " + in1020(21, 21));
		System.out.println("in1020(9, 9) --> " + in1020(9, 9));
		printFunction("hasTeen");
		System.out.println("hasTeen(13, 20, 10) --> " + hasTeen(13, 20, 10));
		System.out.println("hasTeen(20, 19, 10) --> " + hasTeen(20, 19, 10));
		System.out.println("hasTeen(20, 10, 13) --> " + hasTeen(20, 10, 13));
		System.out.println("hasTeen(1, 20, 12) --> " + hasTeen(1, 20, 12));
		System.out.println("hasTeen(19, 20, 12) --> " + hasTeen(19, 20, 12));
		System.out.println("hasTeen(12, 20, 19) --> " + hasTeen(12, 20, 19));
		System.out.println("hasTeen(12, 9, 20) --> " + hasTeen(12, 9, 20));
		System.out.println("hasTeen(12, 18, 20) --> " + hasTeen(12, 18, 20));
		System.out.println("hasTeen(14, 2, 20) --> " + hasTeen(14, 2, 20));
		System.out.println("hasTeen(4, 2, 20) --> " + hasTeen(4, 2, 20));
		System.out.println("hasTeen(11, 22, 22) --> " + hasTeen(11, 22, 22));
		printFunction("loneTeen");
		System.out.println("loneTeen(13, 99) --> " + loneTeen(13, 99));
		System.out.println("loneTeen(21, 19) --> " + loneTeen(21, 19));
		System.out.println("loneTeen(13, 13) --> " + loneTeen(13, 13));
		System.out.println("loneTeen(14, 20) --> " + loneTeen(14, 20));
		System.out.println("loneTeen(20, 15) --> " + loneTeen(20, 15));
		System.out.println("loneTeen(16, 17) --> " + loneTeen(16, 17));
		System.out.println("loneTeen(16, 9) --> " + loneTeen(16, 9));
		System.out.println("loneTeen(16, 18) --> " + loneTeen(16, 18));
		System.out.println("loneTeen(13, 19) --> " + loneTeen(13, 19));
		System.out.println("loneTeen(13, 20) --> " + loneTeen(13, 20));
		System.out.println("loneTeen(6, 18) --> " + loneTeen(6, 18));
		System.out.println("loneTeen(99, 13) --> " + loneTeen(99, 13));
		System.out.println("loneTeen(99, 99) --> " + loneTeen(99, 99));
		printFunction("delDel");
		System.out.println("delDel(\"adelbc\") --> \"" + delDel("adelbc") + "\"");
		System.out.println("delDel(\"adelHello\") --> \"" + delDel("adelHello") + "\"");
		System.out.println("delDel(\"adedbc\") --> \"" + delDel("adedbc") + "\"");
		System.out.println("delDel(\"abcdel\") --> \"" + delDel("abcdel") + "\"");
		System.out.println("delDel(\"add\") --> \"" + delDel("add") + "\"");
		System.out.println("delDel(\"ad\") --> \"" + delDel("ad") + "\"");
		System.out.println("delDel(\"a\") --> \"" + delDel("a") + "\"");
		System.out.println("delDel(\"\") --> \"" + delDel("") + "\"");
		System.out.println("delDel(\"del\") --> \"" + delDel("del") + "\"");
		System.out.println("delDel(\"adel\") --> \"" + delDel("adel") + "\"");
		System.out.println("delDel(\"aadelbb\") --> \"" + delDel("aadelbb") + "\"");
		printFunction("mixStart");
		System.out.println("mixStart(\"mix snacks\") --> " + mixStart("mix snacks"));
		System.out.println("mixStart(\"pix snacks\") --> " + mixStart("pix snacks"));
		System.out.println("mixStart(\"piz snacks\") --> " + mixStart("piz snacks"));
		System.out.println("mixStart(\"nix\") --> \"" + mixStart("nix") + "\"");
		System.out.println("mixStart(\"ni\") --> \"" + mixStart("ni") + "\"");
		System.out.println("mixStart(\"n\") --> \"" + mixStart("n") + "\"");
		System.out.println("mixStart(\"\") --> \"" + mixStart("") + "\"");
		printFunction("startOz");
		System.out.println("startOz(\"ozymandias\") --> \"" + startOz("ozymandias") + "\"");
		System.out.println("startOz(\"bzoo\") --> \"" + startOz("bzoo") + "\"");
		System.out.println("startOz(\"oxx\") --> \"" + startOz("oxx") + "\"");
		System.out.println("startOz(\"oz\") --> \"" + startOz("oz") + "\"");
		System.out.println("startOz(\"ounce\") --> \"" + startOz("ounce") + "\"");
		System.out.println("startOz(\"o\") --> \"" + startOz("o") + "\"");
		System.out.println("startOz(\"abc\") --> \"" + startOz("abc") + "\"");
		System.out.println("startOz(\"\") --> \"" + startOz("") + "\"");
		System.out.println("startOz(\"zoo\") --> \"" + startOz("zoo") + "\"");
		System.out.println("startOz(\"aztec\") --> \"" + startOz("aztec") + "\"");
		System.out.println("startOz(\"zzzz\") --> \""  + startOz("zzzz") + "\"");
		System.out.println("startOz(\"oznic\") --> \"" + startOz("oznic") + "\"");
	}
}
