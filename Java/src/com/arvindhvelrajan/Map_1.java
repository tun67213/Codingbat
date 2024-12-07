package com.arvindhvelrajan;

import java.util.Map;

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
	}
}
