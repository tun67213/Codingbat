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
	}
}
