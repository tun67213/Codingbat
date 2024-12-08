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
	 * Given an array of non-empty strings, create and return a Map<String, String> as follows:
	 * for each string add its first character as a key with its last character as the value.
	 *
	 * pairs(["code", "bug"]) → {"b": "g", "c": "e"}
	 * pairs(["man", "moon", "main"]) → {"m": "n"}
	 * pairs(["man", "moon", "good", "night"]) → {"g": "d", "m": "n", "n": "t"}
	 */
	public Map<String, String> pairs(String[] strings)
	{
		throw new UnsupportedOperationException("Not supported yet.");
	}

	/**
	 * The classic word-count algorithm: given an array of strings, return a Map<String, Integer> with a key for each
	 * different string, with the value the number of times that string appears in the array.
	 *
	 * wordCount(["a", "b", "a", "c", "b"]) → {"a": 2, "b": 2, "c": 1}
	 * wordCount(["c", "b", "a"]) → {"a": 1, "b": 1, "c": 1}
	 * wordCount(["c", "c", "c", "c"]) → {"c": 4}
	 */
	public Map<String, Integer> wordCount(String[] strings)
	{
		throw new UnsupportedOperationException("Not supported yet.");
	}

	/**
	 * Given an array of non-empty strings, return a Map<String, String> with a key for every different first character
	 * seen, with the value of all the strings starting with that character appended together in the order they appear in the array.
	 *
	 * firstChar(["salt", "tea", "soda", "toast"]) → {"s": "saltsoda", "t": "teatoast"}
	 * firstChar(["aa", "bb", "cc", "aAA", "cCC", "d"]) → {"a": "aaaAA", "b": "bb", "c": "cccCC", "d": "d"}
	 * firstChar([]) → {}
	 */
	public Map<String, String> firstChar(String[] strings)
	{
		throw new UnsupportedOperationException("Not supported yet.");
	}

	/**
	 * Loop over the given array of strings to build a result string like this: when a string appears the 2nd, 4th, 6th,
	 * etc. time in the array, append the string to the result. Return the empty string if no string appears a 2nd time.
	 *
	 * wordAppend(["a", "b", "a"]) → "a"
	 * wordAppend(["a", "b", "a", "c", "a", "d", "a"]) → "aa"
	 * wordAppend(["a", "", "a"]) → "a"
	 */
	public String wordAppend(String[] strings)
	{
		throw new UnsupportedOperationException("Not supported yet.");
	}

	/**
	 * Given an array of strings, return a Map<String, Boolean> where each different string is a key and its value is
	 * true if that string appears 2 or more times in the array.
	 *
	 * wordMultiple(["a", "b", "a", "c", "b"]) → {"a": true, "b": true, "c": false}
	 * wordMultiple(["c", "b", "a"]) → {"a": false, "b": false, "c": false}
	 * wordMultiple(["c", "c", "c", "c"]) → {"c": true}
	 */
	public Map<String, Boolean> wordMultiple(String[] strings)
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
	public String toString(Map<String, Boolean> map)
	{
		StringBuilder buff = new StringBuilder();
		buff.append("{");
		for(Map.Entry<String, Boolean> entry : map.entrySet())
		{
			buff.append("\"").append(entry.getKey()).append("\": ").append(entry.getValue());
			buff.append(", ");
		}
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
		printFunction("wordLen");
		System.out.println("wordLen([\"a\", \"bb\", \"a\", \"bb\"]) → " + toString(wordLen(new String[] {"a", "bb", "a", "bb"})));
		System.out.println("wordLen([\"this\", \"and\", \"that\", \"and\"]) → " + toString(wordLen(new String[] {"this", "and", "that", "and"})));
		System.out.println("wordLen([\"code\", \"code\", \"code\", \"bug\"]) → " + toString(wordLen(new String[] {"code", "code", "code", "bug"})));
		System.out.println("wordLen([]) → " + toString(wordLen(new String[] {})));
		System.out.println("wordLen([\"z\"]) → " + toString(wordLen(new String[] {"z"})));
		printFunction("pairs");
		System.out.println("pairs[\"code\", \"bug\"]) → " + map1.toString(pairs(new String[] {"code", "bug"})));
		System.out.println("pairs[\"man\", \"moon\", \"main\"]) → " + map1.toString(pairs(new String[] {"man", "moon", "main"})));
		System.out.println("pairs[\"man\", \"moon\", \"good\", \"night\"]) → " + map1.toString(pairs(new String[] {"man", "moon", "good", "night"})));
		System.out.println("pairs[]) → " + map1.toString(pairs(new String[] {})));
		System.out.println("pairs[\"a\", \"b\"]) → " + map1.toString(pairs(new String[] {"a", "b"})));
		System.out.println("pairs[\"are\", \"codes\", \"and\", \"cods\"]) → " + map1.toString(pairs(new String[] {"are", "codes", "and", "cods"})));
		System.out.println("pairs[\"apple\", \"banana\", \"tea\", \"coffee\"]) → " + map1.toString(pairs(new String[] {"apple", "banana", "tea", "coffee"})));
		printFunction("wordCount");
		System.out.println("wordCount([\"a\", \"b\", \"a\", \"c\", \"b\"]) → " + toString(wordCount(new String[] {"a", "b", "a", "c", "b"})));
		System.out.println("wordCount([\"c\", \"b\", \"a\"]) → " + toString(wordCount(new String[] {"c", "b", "a"})));
		System.out.println("wordCount([\"c\", \"c\", \"c\", \"c\"]) → " + toString(wordCount(new String[] {"c", "c", "c", "c"})));
		System.out.println("wordCount([]) → " + toString(wordCount(new String[] {})));
		System.out.println("wordCount([\"this\", \"and\", \"this\", \"\"]) → " + toString(wordCount(new String[] {"this", "and", "this", ""})));
		System.out.println("wordCount([\"x\", \"y\", \"x\", \"Y\", \"X\"]) → " + toString(wordCount(new String[] {"x", "y", "x", "Y", "X"})));
		System.out.println("wordCount([\"123\", \"0\", \"123\", \"1\"]) → " + toString(wordCount(new String[] {"123", "0", "123", "1"})));
		System.out.println("wordCount([\"d\", \"a\", \"e\", \"d\", \"a\", \"d\", \"b\", \"b\", \"z\", \"a\", \"a\", \"b\", \"z\", \"x\", \"b\", \"f\", \"x\", \"two\", \"b\", \"one\", \"two\"]) → " + toString(wordCount(new String[] {"d", "a", "e", "d", "a", "d", "b", "b", "z", "a", "a", "b", "z", "x", "b", "f", "x", "two", "b", "one", "two"})));
		System.out.println("wordCount([\"apple\", \"banana\", \"apple\", \"apple\", \"tea\", \"coffee\", \"banana\"]) → " + toString(wordCount(new String[] {"apple", "banana", "apple", "apple", "tea", "coffee", "banana"})));
		printFunction("firstChar");
		System.out.println("firstChar([\"salt\", \"tea\", \"soda\", \"toast\"]) → " + map1.toString(firstChar(new String[] {"salt", "tea", "soda", "toast"})));
		System.out.println("firstChar([\"aa\", \"bb\", \"cc\", \"aAA\", \"cCC\", \"d\"]) → " + map1.toString(firstChar(new String[] {"aa", "bb", "cc", "aAA", "cCC", "d"})));
		System.out.println("firstChar([]) → " + map1.toString(firstChar(new String[] {})));
		System.out.println("firstChar([\"apple\", \"bells\", \"salt\", \"aardvark\", \"bells\", \"sun\", \"zen\", \"bells\"]) → " + map1.toString(firstChar(new String[] {"apple", "bells", "salt", "aardvark", "bells", "sun", "zen", "bells"})));
		printFunction("wordAppend");
		System.out.println("wordAppend([\"a\", \"b\", \"a\"]) → \"" + wordAppend(new String[] {"a", "b", "a"}) + "\"");
		System.out.println("wordAppend([\"a\", \"b\", \"a\", \"c\", \"a\", \"d\", \"a\"]) → \"" + wordAppend(new String[] {"a", "b", "a", "c", "a", "d", "a"}) + "\"");
		System.out.println("wordAppend([\"a\", \"\", \"a\"]) → \"" + wordAppend(new String[] {"a", "", "a"}) + "\"");
		System.out.println("wordAppend([]) → \"" + wordAppend(new String[] {}) + "\"");
		System.out.println("wordAppend([\"a\", \"b\", \"b\", \"a\", \"a\"]) → \"" + wordAppend(new String[] {"a", "b", "b", "a", "a"}) + "\"");
		System.out.println("wordAppend([\"a\", \"b\", \"b\", \"b\", \"a\", \"c\", \"a\", \"a\"]) → \"" + wordAppend(new String[] {"a", "b", "b", "b", "a", "c", "a", "a"}) + "\"");
		System.out.println("wordAppend([\"a\", \"b\", \"b\", \"b\", \"a\", \"c\", \"a\", \"a\", \"a\", \"b\", \"a\"]) → \"" + wordAppend(new String[] {"a", "b", "b", "b", "a", "c", "a", "a", "a", "b", "a"}) + "\"");
		System.out.println("wordAppend([\"not\", \"and\", \"or\", \"and\", \"this\", \"and\", \"or\", \"that\", \"not\"]) → \"" + wordAppend(new String[] {"not", "and", "or", "and", "this", "and", "or", "that", "not"}) + "\"");
		System.out.println("wordAppend([\"a\", \"b\", \"c\"]) → \"" + wordAppend(new String[] {"a", "b", "c"}) + "\"");
		System.out.println("wordAppend([\"this\", \"or\", \"that\", \"and\", \"this\", \"and\", \"that\"]) → \"" + wordAppend(new String[] {"this", "or", "that", "and", "this", "and", "that"}) + "\"");
		System.out.println("wordAppend([\"xx\", \"xx\", \"yy\", \"xx\", \"zz\", \"yy\", \"zz\", \"xx\"]) → \"" + wordAppend(new String[] {"xx", "xx", "yy", "xx", "zz", "yy", "zz", "xx"}) + "\"");
	}
}
