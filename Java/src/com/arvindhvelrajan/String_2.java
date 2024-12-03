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
	 * Return the number of times that the string "hi" appears anywhere in the given string.
	 *
	 * countHi("abc hi ho") → 1
	 * countHi("ABChi hi") → 2
	 * countHi("hihi") → 2
	 */
	public int countHi(String str)
	{
		throw new UnsupportedOperationException("Not supported yet.");
	}

	/**
	 * Return true if the string "cat" and "dog" appear the same number of times in the given string.
	 *
	 * catDog("catdog") → true
	 * catDog("catcat") → false
	 * catDog("1cat1cadodog") → true
	 */
	public boolean catDog(String str)
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
		printFunction("countHi");
		System.out.println("countHi(\"abc hi ho\") --> " + countHi("abc hi ho"));
		System.out.println("countHi(\"ABChi hi\") --> " + countHi("ABChi hi"));
		System.out.println("countHi(\"hihi\") --> " + countHi("hihi"));
		System.out.println("countHi(\"hiHIhi\") --> " + countHi("hiHIhi"));
		System.out.println("countHi(\"\") --> \"" + countHi("") + "\"");
		System.out.println("countHi(\"h\") --> \"" + countHi("h") + "\"");
		System.out.println("countHi(\"hi\") --> " + countHi("hi") + "\"");
		System.out.println("countHi(\"Hi is no HI on ahI\") --> " + countHi("Hi is no HI on ahI"));
		System.out.println("countHi(\"hiho not HOHIhi\") --> " + countHi("hiho not HOHIhi"));
	}
}
