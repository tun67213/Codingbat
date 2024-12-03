package com.arvindhvelrajan;

import static com.arvindhvelrajan.UI_Functions.*;

/**
 * @author arvindhvelrajan
 * @code This class is to demonstrate the implementation for all functions in String-2 from codingbat.com
 */
public class String_2
{
	/**
	 * This function introduces the user to the class that is being demonstrated.
	 */
	private void welcome()
	{
		System.out.println("\n\nString-2 Functions\n");
	}

	/**
	 * Given a string, return a string where for every char in the original, there are two chars.
	 *
	 * doubleChar("The") → "TThhee"
	 * doubleChar("AAbb") → "AAAAbbbb"
	 * doubleChar("Hi-There") → "HHii--TThheerree"
	 */
	public String doubleChar(String str)
	{
		throw new UnsupportedOperationException("Not supported yet.");
	}

	/**
	 * @param args commandline arguments
	 */
	public void main(String[] args)
	{
		welcome();
		printFunction("doubleChar");
		System.out.println("doubleChar(\"The\") --> \"" + doubleChar("The") + "\"");
		System.out.println("doubleChar(\"AAbb\") --> \"" + doubleChar("AAbb") + "\"");
		System.out.println("doubleChar(\"Hi-There\") --> \"" + doubleChar("Hi-There") + "\"");
		System.out.println("doubleChar(\"Word!\") --> \"" + doubleChar("Word!") + "\"");
		System.out.println("doubleChar(\"!!\") --> \"" + doubleChar("!!") + "\"");
		System.out.println("doubleChar(\"\") --> \"" + doubleChar("") + "\"");
		System.out.println("doubleChar(\"a\") --> \"" + doubleChar("a") + "\"");
		System.out.println("doubleChar(\".\") --> \"" + doubleChar(".") + "\"");
		System.out.println("doubleChar(\"aa\") --> \"" + doubleChar("aa") + "\"");
	}
}
