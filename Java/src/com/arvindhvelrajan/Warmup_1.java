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
	 * The parameter weekday is true if it is a weekday, and the parameter vacation is true if we are on vacation. We sleep in if it is not a weekday or we're on vacation. Return true if we sleep in.
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
	 * We have two monkeys, a and b, and the parameters aSmile and bSmile indicate if each is smiling. We are in trouble if they are both smiling or if neither of them is smiling. Return true if we are in trouble.
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
	 * Given two int values, return their sum. Unless the two values are the same, then return double their sum.
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
	 * Given an int n, return the absolute difference between n and 21, except return double the absolute difference if n is over 21.
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
	}
}
