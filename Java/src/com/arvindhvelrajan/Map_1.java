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

	public String toString(Map<String, String> map)
	{
		StringBuilder buff = new StringBuilder();
		buff.append("{");
		for(Map.Entry<String, String> entry : map.entrySet())
		{
			buff.append("\"").append(entry.getKey()).append("\": \"").append(entry.getValue()).append("\", ");
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
	 * Given a map of food keys and topping values, modify and return the map as follows: if the key "ice cream" is
	 * present, set its value to "cherry". In all cases, set the key "bread" to have the value "butter".
	 *
	 * topping1({"ice cream": "peanuts"}) → {"bread": "butter", "ice cream": "cherry"}
	 * topping1({}) → {"bread": "butter"}
	 * topping1({"pancake": "syrup"}) → {"bread": "butter", "pancake": "syrup"}
	 */
	public Map<String, String> topping1(Map<String, String> map)
	{
		throw new UnsupportedOperationException("Not supported yet.");
	}

	/**
	 * Given a map of food keys and their topping values, modify and return the map as follows: if the key "ice cream"
	 * has a value, set that as the value for the key "yogurt" also.
	 * If the key "spinach" has a value, change that value to "nuts".
	 *
	 * topping2({"ice cream": "cherry"}) → {"yogurt": "cherry", "ice cream": "cherry"}
	 * topping2({"spinach": "dirt", "ice cream": "cherry"}) → {"yogurt": "cherry", "spinach": "nuts", "ice cream": "cherry"}
	 * topping2({"yogurt": "salt"}) → {"yogurt": "salt"}
	 */
	public Map<String, String> topping2(Map<String, String> map)
	{
		throw new UnsupportedOperationException("Not supported yet.");
	}

	/**
	 * Given a map of food keys and topping values, modify and return the map as follows: if the key "potato" has a
	 * value, set that as the value for the key "fries". If the key "salad" has a value, set that as the value for the
	 * key "spinach".
	 *
	 * topping3({"potato": "ketchup"}) → {"potato": "ketchup", "fries": "ketchup"}
	 * topping3({"potato": "butter"}) → {"potato": "butter", "fries": "butter"}
	 * topping3({"salad": "oil", "potato": "ketchup"}) → {"spinach": "oil", "salad": "oil", "potato": "ketchup", "fries": "ketchup"}
	 */
	public Map<String, String> topping3(Map<String, String> map)
	{
		throw new UnsupportedOperationException("Not supported yet.");
	}

	/**
	 * Modify and return the given map as follows: if the keys "a" and "b" are both in the map and have equal values, remove them both.
	 *
	 * mapAB2({"a": "aaa", "b": "aaa", "c": "cake"}) → {"c": "cake"}
	 * mapAB2({"a": "aaa", "b": "bbb"}) → {"a": "aaa", "b": "bbb"}
	 * mapAB2({"a": "aaa", "b": "bbb", "c": "aaa"}) → {"a": "aaa", "b": "bbb", "c": "aaa"}
	 */
	public Map<String, String> mapAB2(Map<String, String> map)
	{
		throw new UnsupportedOperationException("Not supported yet.");
	}

	/**
	 * Modify and return the given map as follows: if exactly one of the keys "a" or "b" has a value in the
	 * map (but not both), set the other to have that same value in the map.
	 *
	 * mapAB3({"a": "aaa", "c": "cake"}) → {"a": "aaa", "b": "aaa", "c": "cake"}
	 * mapAB3({"b": "bbb", "c": "cake"}) → {"a": "bbb", "b": "bbb", "c": "cake"}
	 * mapAB3({"a": "aaa", "b": "bbb", "c": "cake"}) → {"a": "aaa", "b": "bbb", "c": "cake"}
	 */
	public Map<String, String> mapAB3(Map<String, String> map)
	{
		throw new UnsupportedOperationException("Not supported yet.");
	}

	/**
	 * Modify and return the given map as follows: if the keys "a" and "b" have values that have different lengths,
	 * then set "c" to have the longer value. If the values exist and have the same length, change them both to the
	 * empty string in the map.
	 *
	 * mapAB4({"a": "aaa", "b": "bb", "c": "cake"}) → {"a": "aaa", "b": "bb", "c": "aaa"}
	 * mapAB4({"a": "aa", "b": "bbb", "c": "cake"}) → {"a": "aa", "b": "bbb", "c": "bbb"}
	 * mapAB4({"a": "aa", "b": "bbb"}) → {"a": "aa", "b": "bbb", "c": "bbb"}
	 */
	public Map<String, String> mapAB4(Map<String, String> map)
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
		printFunction("mapAB");
		System.out.println("mapAB({\"a\": \"Hi\", \"b\": \"There\"}) → " + mapAB(new HashMap<>(Map.of("a", "Hi", "b", "There"))).toString());
		System.out.println("mapAB({\"a\": \"Hi\"}) → " + mapAB(new HashMap<>(Map.of("a", "Hi"))).toString());
		System.out.println("mapAB({\"b\": \"There\"}) → " + mapAB(new HashMap<>(Map.of("b", "There"))).toString());
		System.out.println("mapAB({\"c\": \"meh\"}) → " + mapAB(new HashMap<>(Map.of("c", "meh"))).toString());
		System.out.println("mapAB({\"a\": \"aaa\", \"ab\": \"nope\", \"b\": \"bbb\", \"c\": \"ccc\"}) → " + mapAB(new HashMap<>(Map.of("a", "aaa", "ab", "nope", "b", "bbb", "c", "ccc"))).toString());
		System.out.println("mapAB({\"ab\": \"nope\", \"b\": \"bbb\", \"c\": \"ccc\"}) → " + mapAB(new HashMap<>(Map.of("ab", "nope", "b", "bbb", "c", "ccc"))).toString());
		printFunction("topping1");
		System.out.println("topping1({\"ice cream\": \"peanuts\"}) → " + topping1(new HashMap<>(Map.of("ice cream", "peanuts"))).toString());
		System.out.println("topping1({}) → " + topping1(new HashMap<>(Map.of())).toString());
		System.out.println("topping1({\"pancake\": \"syrup\"}) → " + topping1(new HashMap<>(Map.of("pancake", "syrup"))).toString());
		System.out.println("topping1({\"bread\": \"dirt\"}, {\"ice cream\", \"strawberries\"}) → " + topping1(new HashMap<>(Map.of("bread", "dirt", "ice cream", "strawberries"))).toString());
		System.out.println("topping1({\"bread\": \"jam\"}, {\"ice cream\", \"strawberries\", \"salad\", \"oil\"}) → " + topping1(new HashMap<>(Map.of("bread", "jam", "ice cream", "strawberries", "salad", "oil"))).toString());
		printFunction("topping2");
		System.out.println("topping2({\"ice cream\": \"cherry\"}) → " + topping2(new HashMap<>(Map.of("ice cream", "cherry"))).toString());
		System.out.println("topping2({\"spinach\": \"dirt\", \"ice cream\": \"cherry\"}) → " + topping2(new HashMap<>(Map.of("spinach", "dirt", "ice cream", "cherry"))).toString());
		System.out.println("topping2({\"yogurt\": \"salt\"}) → " + topping2(new HashMap<>(Map.of("yogurt", "salt"))).toString());
		System.out.println("topping2({\"yogurt\": \"salt\", \"bread\": \"butter\"}) → " + topping2(new HashMap<>(Map.of("yogurt", "salt", "bread", "butter"))).toString());
		System.out.println("topping2({}) → " + topping2(new HashMap<>(Map.of())).toString());
		System.out.println("topping2({\"ice cream\": \"air\", \"salad\": \"oil\"}) → " + topping2(new HashMap<>(Map.of("ice cream", "air", "salad", "oil"))).toString());
		printFunction("topping3");
		System.out.println("topping3({\"potato\": \"ketchup\"}) → " + topping3(new HashMap<>(Map.of("potato", "ketchup"))).toString());
		System.out.println("topping3({\"potato\": \"butter\"}) → " + topping3(new HashMap<>(Map.of("potato", "butter"))).toString());
		System.out.println("topping3({\"salad\": \"oil\", \"potato\": \"ketchup\"}) → " + topping3(new HashMap<>(Map.of("salad", "oil", "potato", "ketchup"))).toString());
		System.out.println("topping3({\"toast\": \"butter\", \"salad\": \"oil\", \"potato\": \"ketchup\"}) → " + topping3(new HashMap<>(Map.of("toast", "butter", "salad", "oil", "potato", "ketchup"))).toString());
		System.out.println("topping3({}) → " + topping3(new HashMap<>(Map.of())).toString());
		System.out.println("topping3({\"salad\": \"pepper\", \"fries\": \"salt\"}) → " + topping3(new HashMap<>(Map.of("salad", "pepper", "fries", "salt"))).toString());
		printFunction("mapAB2");
		System.out.println("mapAB2({\"a\": \"aaa\", \"b\": \"aaa\", \"c\": \"cake\"}) → " + mapAB2(new HashMap<>(Map.of("a", "aaa", "b", "aaa", "c", "cake"))).toString());
		System.out.println("mapAB2({\"a\": \"aaa\", \"b\": \"bbb\"}) → " + mapAB2(new HashMap<>(Map.of("a", "aaa", "b", "bbb"))).toString());
		System.out.println("mapAB2({\"a\": \"aaa\", \"b\": \"bbb\", \"c\": \"aaa\"}) → " + mapAB2(new HashMap<>(Map.of("a", "aaa", "b", "bbb", "c", "aaa"))).toString());
		System.out.println("mapAB2({\"a\": \"aaa\"}) → " + mapAB2(new HashMap<>(Map.of("a", "aaa"))).toString());
		System.out.println("mapAB({\"b\": \"bbb\"}) → " + mapAB2(new HashMap<>(Map.of("b", "bbb"))).toString());
		System.out.println("mapAB2({\"a\": \"\", \"b\": \"\", \"c\": \"ccc\"}) → " + mapAB2(new HashMap<>(Map.of("a", "", "b", "", "c", "ccc"))).toString());
		System.out.println("mapAB2({}) → " + mapAB2(new HashMap<>(Map.of())));
		System.out.println("mapAB2({\"a\": \"a\", \"b\": \"b\", \"z\": \"zebra\"}) → " + mapAB2(new HashMap<>(Map.of("a", "a", "b", "b", "z", "zebra"))).toString());
		printFunction("mapAB3");
		System.out.println("mapAB3({\"a\": \"aaa\", \"c\": \"cake\"}) → " + mapAB3(new HashMap<>(Map.of("a", "aaa", "c", "cake"))).toString());
		System.out.println("mapAB3({\"b\": \"bbb\", \"c\": \"cake\"}) → " + mapAB3(new HashMap<>(Map.of("b", "bbb", "c", "cake"))).toString());
		System.out.println("mapAB3({\"a\": \"aaa\", \"b\": \"bbb\", \"c\": \"cake\"}) → " + mapAB3(new HashMap<>(Map.of("a", "aaa", "b", "bbb", "c", "cake"))).toString());
		System.out.println("mapAB3({\"ccc\": \"ccc\"}) → " + mapAB3(new HashMap<>(Map.of("ccc", "ccc"))).toString());
		System.out.println("mapAB3({\"c\": \"a\", \"d\": \"b\"}) → " + mapAB3(new HashMap<>(Map.of("c", "a", "d", "b"))).toString());
		System.out.println("mapAB3({}) → " + mapAB3(new HashMap<>(Map.of())));
		System.out.println("mapAB3({\"a\": \"\"}) → " + mapAB3(new HashMap<>(Map.of("a", ""))).toString());
		System.out.println("mapAB3({\"b\": \"\"}) → " + mapAB3(new HashMap<>(Map.of("b", ""))).toString());
		System.out.println("mapAB3({\"a\": \"\", \"b\", \"\"}) → " + mapAB3(new HashMap<>(Map.of("a", "", "b", ""))).toString());
		System.out.println("mapAB3({\"aa\": \"aa\", \"a\": \"apple\", \"z\": \"zzz\"}) → " + mapAB3(new HashMap<>(Map.of("aa", "aa", "a", "apple", "z", "zzz"))).toString());
		printFunction("mapAB4");
		System.out.println("mapAB4({\"a\": \"aaa\": \"b\": \"bb\", \"c\": \"cake\"}) → " + mapAB4(new HashMap<>(Map.of("a", "aaa", "b", "bb", "c", "cake"))).toString());
		System.out.println("mapAB4({\"a\": \"aa\", \"b\": \"bbb\", \"c\": \"cake\"}) → " + mapAB4(new HashMap<>(Map.of("a", "aa", "b", "bbb", "c", "cake"))).toString());
		System.out.println("mapAB4({\"a\": \"aa\", \"b\": \"bbb\"}) → " + mapAB4(new HashMap<>(Map.of("a", "aa", "b", "bbb"))).toString());
		System.out.println("mapAB4({\"a\": \"aaa\"}) → " + mapAB4(new HashMap<>(Map.of("a", "aaa"))).toString());
		System.out.println("mapAB4({\"b\": \"bbb\"}) → " + mapAB4(new HashMap<>(Map.of("b", "bbb"))).toString());
		System.out.println("mapAB4({\"a\": \"aaa\", \"b\": \"bbb\", \"c\": \"cake\"}) → " + mapAB4(new HashMap<>(Map.of("a", "aaa", "b", "bbb", "c", "cake"))).toString());
		System.out.println("mapAB4({\"a\": \"a\", \"b\": \"b\", \"c\": \"cake\"}) → " + mapAB4(new HashMap<>(Map.of("a", "a", "b", "b", "c", "cake"))).toString());
		System.out.println("mapAB4({\"a\": \"\", \"b\": \"b\", \"c\": \"cake\"}) → " + mapAB4(new HashMap<>(Map.of("a", "", "b", "b", "c", "cake"))).toString());
		System.out.println("mapAB4({\"a\": \"a\", \"b\": \"\", \"c\": \"cake\"}) → " + mapAB4(new HashMap<>(Map.of("a", "a", "b", "", "c", "cake"))).toString());
		System.out.println("mapAB4({\"c\": \"cat\", \"d\": \"dog\"}) → " + mapAB4(new HashMap<>(Map.of("c", "cat", "d", "dog"))).toString());
		System.out.println("mapAB4({\"ccc\": \"ccc\"}) → " + mapAB4(new HashMap<>(Map.of("ccc", "ccc"))).toString());
		System.out.println("mapAB4({\"c\": \"a\", \"d\": \"b\"}) → " + mapAB4(new HashMap<>(Map.of("c", "a", "d", "b"))).toString());
		System.out.println("mapAB4({}}) → " + mapAB4(new HashMap<>(Map.of())));
		System.out.println("mapAB4({\"a\": \"\", \"z\": \"z\"}) → " + mapAB4(new HashMap<>(Map.of("a", "", "z", "z"))).toString());
		System.out.println("mapAB4({\"b\": \"\", \"z\": \"z\"}) → " + mapAB4(new HashMap<>(Map.of("b", "", "z", "z"))).toString());
	}
}
