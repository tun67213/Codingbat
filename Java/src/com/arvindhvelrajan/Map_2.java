package com.arvindhvelrajan;

import static com.arvindhvelrajan.UI_Functions.*;

import java.util.HashMap;
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
	 * Given an array of strings, return a Map<String, Integer> containing a key for every different string in the
	 * array, and the value is that string's length.
	 *
	 * wordLen(["a", "bb", "a", "bb"]) → {"bb": 2, "a": 1}
	 * wordLen(["this", "and", "that", "and"]) → {"that": 4, "and": 3, "this": 4}
	 * wordLen(["code", "code", "code", "bug"]) → {"code": 4, "bug": 3}
	 */
	public Map<String, Integer> wordLen(String[] strings)
	{
		throw new UnsupportedOperationException("Not supported yet.");
	}

	/**
	 * The following function enables a readable output for the reader
	 */
	public String toString(Map<String, Integer> map)
	{
		StringBuilder buff = new StringBuilder();
		buff.append("{");
		for(Map.Entry<String, Integer> entry : map.entrySet())
		{
			buff.append("\"").append(entry.getKey()).append("\": ").append(entry.getValue()).append(", ");
		}
		// Remove the trailing comma and space
		if(buff.length() > 1)
		{
			buff.setLength(buff.length() - 2);
		}
		buff.append("}");
		return buff.toString();
	}

	/**
	 * @param args commandline arguments
	 */
	public void main(String[] args)
	{
		Map_1 map1 = new Map_1();
		welcome();
		printFunction("word0");
		System.out.println("word0([\"a\", \"b\", \"a\", \"b\"]) → " + toString(word0(new String[] {"a", "b", "a", "b"})));
		System.out.println("word0([\"a\", \"b\", \"a\", \"c\", \"b\"]) → " + toString(word0(new String[] {"a", "b", "a", "c", "b"})));
		System.out.println("word0([\"c\", \"b\", \"a\"]) → " + toString(word0(new String[] {"c", "b", "a"})));
		System.out.println("word0([\"c\", \"c\", \"c\", \"c\"]) → " + toString(word0(new String[] {"c", "c", "c", "c"})));
		System.out.println("word0([]) → " + toString(word0(new String[] {})));
	}
}
