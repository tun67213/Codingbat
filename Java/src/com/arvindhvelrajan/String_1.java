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
	}
}
