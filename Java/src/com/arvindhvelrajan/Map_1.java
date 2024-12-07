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
	 * @param args commandline arguments
	 */
	public void main(String[] args)
	{
		welcome();
		printFunction("mapBully");
		System.out.println("mapBully({\"a\": \"candy\", \"b\": \"dirt\"}) → " + mapBully(new HashMap<String, String>(Map.of("a", "candy", "b", "dirt"))).toString());
		System.out.println("mapBully({\"a\": \"candy\"}) → " + mapBully(new HashMap<String, String>(Map.of("a", "candy"))).toString());
		System.out.println("mapBully({\"a\": \"candy\", \"b\": \"carrot\", \"c\", \"meh\"}) → " + mapBully(new HashMap<String, String>(Map.of("a", "candy", "b", "carrot", "c", "meh"))).toString());
		System.out.println("mapBully({\"b\": \"carrot\"}) → " + mapBully(new HashMap<String, String>(Map.of("b", "carrot"))).toString());
		System.out.println("mapBully({\"c\": \"meh\"}) → " + mapBully(new HashMap<String, String>(Map.of("c", "meh"))).toString());
		System.out.println("mapBully({\"a\": \"sparkle\", \"c\": \"meh\"}) → " + mapBully(new HashMap<String, String>(Map.of("a", "sparkle", "c", "meh"))).toString());
	}
}
