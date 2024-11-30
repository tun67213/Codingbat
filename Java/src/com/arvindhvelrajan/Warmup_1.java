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
	 * Given an int n, return true if it is within 10 of 100 or 200. Note: Math.abs(num) computes the absolute value of a number.
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
	 * Given 2 int values, return true if one is negative and one is positive. Except if the parameter "negative" is true, then return true only if both are negative.
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
	 * Given a string, return a new string where "not " has been added to the front. However, if the string already begins with "not", return the string unchanged. Note: use .equals() to compare 2 strings.
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
	}
}
