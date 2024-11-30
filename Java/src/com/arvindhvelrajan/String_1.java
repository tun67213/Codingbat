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
	 * Given two strings, a and b, return the result of putting them together in the order abba, e.g. "Hi" and "Bye" returns "HiByeByeHi".
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
	 * The web is built with HTML strings like "<i>Yay</i>" which draws Yay as italic text. In this example, the "i" tag makes <i> and </i> which surround the word "Yay". Given tag and word strings, create the HTML string with tags around the word, e.g. "<i>Yay</i>".
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
	}
}
