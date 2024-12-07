package com.arvindhvelrajan;

import java.util.Map;
import java.util.HashMap;

import static com.arvindhvelrajan.UI_Functions.*;

/**
 * @author arvindhvelrajan
 * @code This class is to demonstrate the implementation for all functions in Map-1 from codingbat.com
 */
public class Map_1
{
	private void welcome()
	{
		System.out.println("\n\nMap-1 Functions\n");
	}

	/**
	 * Modify and return the given map as follows: if the key "a" has a value, set the key "b" to have that value,
	 * and set the key "a" to have the value "".
	 * Basically "b" is a bully, taking the value and replacing it with the empty string.
	 *
	 * mapBully({"a": "candy", "b": "dirt"}) → {"a": "", "b": "candy"}
	 * mapBully({"a": "candy"}) → {"a": "", "b": "candy"}
	 * mapBully({"a": "candy", "b": "carrot", "c": "meh"}) → {"a": "", "b": "candy", "c": "meh"}
	 */
	public Map<String, String> mapBully(Map<String, String> map)
	{
		throw new UnsupportedOperationException("Not supported yet.");
	}

	/**
	 * Modify and return the given map as follows: if the key "a" has a value, set the key "b" to have that same value.
	 * In all cases remove the key "c", leaving the rest of the map unchanged.
	 *
	 * mapShare({"a": "aaa", "b": "bbb", "c": "ccc"}) → {"a": "aaa", "b": "aaa"}
	 * mapShare({"b": "xyz", "c": "ccc"}) → {"b": "xyz"}
	 * mapShare({"a": "aaa", "c": "meh", "d": "hi"}) → {"a": "aaa", "b": "aaa", "d": "hi"}
	 */
	public Map<String, String> mapShare(Map<String, String> map)
	{
		throw new UnsupportedOperationException("Not supported yet.");
	}

	/**
	 * Modify and return the given map as follows: for this problem the map may or may not contain the "a" and "b" keys.
	 * If both keys are present, append their 2 string values together and store the result under the key "ab".
	 *
	 * mapAB({"a": "Hi", "b": "There"}) → {"a": "Hi", "ab": "HiThere", "b": "There"}
	 * mapAB({"a": "Hi"}) → {"a": "Hi"}
	 * mapAB({"b": "There"}) → {"b": "There"}
	 */
	public Map<String, String> mapAB(Map<String, String> map)
	{
		throw new UnsupportedOperationException("Not supported yet.");
	}

	/**
	 * @param args commandline arguments
	 */
	public void main(String[] args)
	{
		welcome();
		printFunction("mapBully");
		System.out.println("mapBully({\"a\": \"candy\", \"b\": \"dirt\"}) → " + mapBully(new HashMap<>(Map.of("a", "candy", "b", "dirt"))).toString());
		System.out.println("mapBully({\"a\": \"candy\"}) → " + mapBully(new HashMap<>(Map.of("a", "candy"))).toString());
		System.out.println("mapBully({\"a\": \"candy\", \"b\": \"carrot\", \"c\", \"meh\"}) → " + mapBully(new HashMap<>(Map.of("a", "candy", "b", "carrot", "c", "meh"))).toString());
		System.out.println("mapBully({\"b\": \"carrot\"}) → " + mapBully(new HashMap<>(Map.of("b", "carrot"))).toString());
		System.out.println("mapBully({\"c\": \"meh\"}) → " + mapBully(new HashMap<>(Map.of("c", "meh"))).toString());
		System.out.println("mapBully({\"a\": \"sparkle\", \"c\": \"meh\"}) → " + mapBully(new HashMap<>(Map.of("a", "sparkle", "c", "meh"))).toString());
		printFunction("mapShare");
		System.out.println("mapShare({\"a\": \"aaa\", \"b\": \"bbb\", \"c\": \"ccc\"}) → " + mapShare(new HashMap<>(Map.of("a", "aaa", "b", "bbb", "c", "ccc"))).toString());
		System.out.println("mapShare({\"b\": \"xyz\", \"c\": \"ccc\"}) → " + mapShare(new HashMap<>(Map.of("b", "xyz", "c", "ccc"))).toString());
		System.out.println("mapShare({\"a\": \"aaa\", \"c\": \"meh\", \"d\": \"hi\"}) → " + mapShare(new HashMap<>(Map.of("a", "aaa", "c", "meh", "d", "hi"))).toString());
		System.out.println("mapShare({\"a\": \"xyz\", \"b\": \"1234\", \"c\": \"yo\", \"z\": \"zzz\"}) → " + mapShare(new HashMap<>(Map.of("a", "xyz", "b", "1234", "c", "yo", "z", "zzz"))).toString());
		System.out.println("mapShare({\"a\": \"xyz\", \"b\": \"1234\", \"c\": \"yo\", \"d\": \"ddd\", \"e\": \"everything\"}) → " + mapShare(new HashMap<>(Map.of("a", "xyz", "b", "1234", "c", "yo", "d", "ddd", "e", "everything"))).toString());
	}
}
