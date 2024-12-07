package com.arvindhvelrajan;

import static com.arvindhvelrajan.UI_Functions.*;
import java.util.Map;

/**
 * @author arvindhvelrajan
 * @code This class is to demonstrate the implementation for all functions in Map-2 from codingbat.com
 */
public class Map_2
{
	private void welcome()
	{
		System.out.println("\n\nMap-2 Functions\n");
	}

	/**
	 * Given an array of strings, return a Map<String, Integer> containing a key for every different string in the
	 * array, always with the value 0. For example the string "hello" makes the pair "hello":0. We'll do more
	 * complicated counting later, but for this problem the value is simply 0.
	 *
	 * word0(["a", "b", "a", "b"]) → {"a": 0, "b": 0}
	 * word0(["a", "b", "a", "c", "b"]) → {"a": 0, "b": 0, "c": 0}
	 * word0(["c", "b", "a"]) → {"a": 0, "b": 0, "c": 0}
	 */
	public Map<String, Integer> word0(String[] strings)
	{
		throw new UnsupportedOperationException("Not supported yet.");
	}

	/**
	 * @param args commandline arguments
	 */
	public void main(String[] args)
	{
		welcome();
		printFunction("word0");
		System.out.println("word0([\"a\", \"b\", \"a\", \"b\"]) → " + word0(new String[] {"a", "b", "a", "b"}).toString());
		System.out.println("word0([\"a\", \"b\", \"a\", \"c\", \"b\"]) → " + word0(new String[] {"a", "b", "a", "c", "b"}).toString());
		System.out.println("word0([\"c\", \"b\", \"a\"]) → " + word0(new String[] {"c", "b", "a"}).toString());
		System.out.println("word0([\"c\", \"c\", \"c\", \"c\"]) → " + word0(new String[] {"c", "c", "c", "c"}).toString());
		System.out.println("word0([]) → " + word0(new String[] {}).toString());
	}
}
