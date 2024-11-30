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
	 * Given a string and a non-negative int n, return a larger string that is n copies of the original string.
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
	}
}
