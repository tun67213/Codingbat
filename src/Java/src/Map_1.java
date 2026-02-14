package src;

import java.util.HashMap;
import java.util.Map;

/**
 * @author arvindhvelrajan
 */
public class Map_1 extends HelperMethods
{
	/**
	 * This method welcomes the user to this program.
	 */
	public void welcome()
	{
		System.out.println("\n\nMap-1 Methods\n");
	}

	/**
	 * Modify and return the given map as follows: if the key "a" has a value, set the key "b" to have that value, and set the key "a" to have the value "". Basically "b" is a bully, taking the value and replacing it with the empty string.
	 *
	 * mapBully({"a": "candy", "b": "dirt"}) → {"a": "", "b": "candy"}
	 * mapBully({"a": "candy"}) → {"a": "", "b": "candy"}
	 * mapBully({"a": "candy", "b": "carrot", "c": "meh"}) → {"a": "", "b": "candy", "c": "meh"}
	 */
	public Map<String, String> mapBully(Map<String, String> map)
	{
		if(map.containsKey("a"))
		{
			String temporary = map.get("a");
			map.put("a", "");
			map.put("b", temporary);
		}
		return map;
	}

	/**
	 * Modify and return the given map as follows: if the key "a" has a value, set the key "b" to have that same value. In all cases remove the key "c", leaving the rest of the map unchanged.
	 *
	 * mapShare({"a": "aaa", "b": "bbb", "c": "ccc"}) → {"a": "aaa", "b": "aaa"}
	 * mapShare({"b": "xyz", "c": "ccc"}) → {"b": "xyz"}
	 * mapShare({"a": "aaa", "c": "meh", "d": "hi"}) → {"a": "aaa", "b": "aaa", "d": "hi"}
	 */
	public Map<String, String> mapShare(Map<String, String> map)
	{
		if(map.containsKey("a"))
		{
			String temporary = map.get("a");
			map.put("b", temporary);
		}
		map.remove("c");
		return map;
	}

	/**
	 * Modify and return the given map as follows: for this problem the map may or may not contain the "a" and "b" keys. If both keys are present, append their 2 string values together and store the result under the key "ab".
	 *
	 * mapAB({"a": "Hi", "b": "There"}) → {"a": "Hi", "ab": "HiThere", "b": "There"}
	 * mapAB({"a": "Hi"}) → {"a": "Hi"}
	 * mapAB({"b": "There"}) → {"b": "There"}
	 */
	public Map<String, String> mapAB(Map<String, String> map)
	{
		if(map.containsKey("a") && map.containsKey("b"))
		{
			String temporary = map.get("a") + map.get("b");
			map.put("ab", temporary);
		}
		return map;
	}

	/**
	 * Given a map of food keys and topping values, modify and return the map as follows: if the key "ice cream" is present, set its value to "cherry". In all cases, set the key "bread" to have the value "butter".
	 *
	 * topping1({"ice cream": "peanuts"}) → {"bread": "butter", "ice cream": "cherry"}
	 * topping1({}) → {"bread": "butter"}
	 * topping1({"pancake": "syrup"}) → {"bread": "butter", "pancake": "syrup"}
	 */
	public Map<String, String> topping1(Map<String, String> map)
	{
		if(map.containsKey("ice cream"))
		{
			map.put("ice cream", "cherry");
		}
		map.put("bread", "butter");
		return map;
	}

	/**
	 * Given a map of food keys and their topping values, modify and return the map as follows: if the key "ice cream" has a value, set that as the value for the key "yogurt" also. If the key "spinach" has a value, change that value to "nuts".
	 *
	 * topping2({"ice cream": "cherry"}) → {"yogurt": "cherry", "ice cream": "cherry"}
	 * topping2({"spinach": "dirt", "ice cream": "cherry"}) → {"yogurt": "cherry", "spinach": "nuts", "ice cream": "cherry"}
	 * topping2({"yogurt": "salt"}) → {"yogurt": "salt"}
	 */
	public Map<String, String> topping2(Map<String, String> map)
	{
		if(map.containsKey("ice cream"))
		{
			map.put("yogurt", map.get("ice cream"));
		}
		if(map.containsKey("spinach"))
		{
			map.put("spinach", "nuts");
		}
		return map;
	}

	/**
	 * Given a map of food keys and topping values, modify and return the map as follows: if the key "potato" has a value, set that as the value for the key "fries". If the key "salad" has a value, set that as the value for the key "spinach".
	 *
	 * topping3({"potato": "ketchup"}) → {"potato": "ketchup", "fries": "ketchup"}
	 * topping3({"potato": "butter"}) → {"potato": "butter", "fries": "butter"}
	 * topping3({"salad": "oil", "potato": "ketchup"}) → {"spinach": "oil", "salad": "oil", "potato": "ketchup", "fries": "ketchup"}
	 */
	public Map<String, String> topping3(Map<String, String> map)
	{
		if(map.containsKey("potato"))
		{
			map.put("fries", map.get("potato"));
		}
		if(map.containsKey("salad"))
		{
			map.put("spinach", map.get("salad"));
		}
		return map;
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
		if(map.containsKey("a") && map.containsKey("b"))
		{
			if(map.get("a").equals(map.get("b")))
			{
				map.remove("a");
				map.remove("b");
			}
		}
		return map;
	}

	/**
	 * Modify and return the given map as follows: if exactly one of the keys "a" or "b" has a value in the map (but not both), set the other to have that same value in the map.
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
	 * Modify and return the given map as follows: if the keys "a" and "b" have values that have different lengths, then set "c" to have the longer value. If the values exist and have the same length, change them both to the empty string in the map.
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
	 * @param args command line arguments
	 */
	public void main(String[] args)
	{
		HelperMethods.resetCallTimes();
		welcome();
		printMethod("mapBully");
		System.out.println("mapBully({\"a\": \"candy\", \"b\": \"dirt\"}) -> " + HelperMethods.mapToString(mapBully(new HashMap<>(Map.of("a", "candy", "b", "dirt")))));
		System.out.println("mapBully({\"a\": \"candy\"}) -> " + HelperMethods.mapToString(mapBully(new HashMap<>(Map.of("a", "candy")))));
		System.out.println("mapBully({\"a\": \"candy\", \"b\": \"carrot\", \"c\": \"meh\"}) -> " + HelperMethods.mapToString(mapBully(new HashMap<>(Map.of("a", "candy", "b", "carrot", "c", "meh")))));
		System.out.println("mapBully({\"b\": \"carrot\"}) -> " + HelperMethods.mapToString(mapBully(new HashMap<>(Map.of("b", "carrot")))));
		System.out.println("mapBully({\"c\": \"meh\"}) -> " + HelperMethods.mapToString(mapBully(new HashMap<>(Map.of("c", "meh")))));
		System.out.println("mapBully({\"a\": \"sparkle\", \"c\": \"meh\"}) -> " + HelperMethods.mapToString(mapBully(new HashMap<>(Map.of("a", "sparkle", "c", "meh")))));
		printMethod("mapShare");
		System.out.println("mapShare({\"a\": \"aaa\", \"b\": \"bbb\", \"c\": \"ccc\"}) -> " + HelperMethods.mapToString(mapShare(new HashMap<>(Map.of("a", "aaa", "b", "bbb", "c", "ccc")))));
		System.out.println("mapShare({\"b\": \"xyz\", \"c\": \"ccc\"}) -> " + HelperMethods.mapToString(mapShare(new HashMap<>(Map.of("b", "xyz", "c", "ccc")))));
		System.out.println("mapShare({\"a\": \"aaa\", \"c\": \"meh\", \"d\": \"hi\"}) -> " + HelperMethods.mapToString(mapShare(new HashMap<>(Map.of("a", "aaa", "c", "meh", "d", "hi")))));
		System.out.println("mapShare({\"a\": \"xyz\", \"b\": \"1234\", \"c\": \"yo\", \"z\": \"zzz\"}) -> " + HelperMethods.mapToString(mapShare(new HashMap<>(Map.of("a", "xyz", "b", "1234", "c", "yo", "z", "zzz")))));
		System.out.println("mapShare({\"a\": \"xyz\", \"b\": \"1234\", \"c\": \"yo\", \"d\": \"ddd\", \"e\": \"everything\"}) -> "  + HelperMethods.mapToString(mapShare(new HashMap<>(Map.of("a", "xyz", "b", "1234", "c", "yo", "d", "ddd", "e", "everything")))));
		printMethod("mapAB");
		System.out.println("mapAB({\"a\": \"Hi\", \"b\": \"There\"}) -> " + HelperMethods.mapToString(mapAB(new HashMap<>(Map.of("a", "Hi", "b", "There")))));
		System.out.println("mapAB({\"a\": \"Hi\"}) -> " + HelperMethods.mapToString(mapAB(new HashMap<>(Map.of("a", "Hi")))));
		System.out.println("mapAB({\"b\": \"There\"}) -> " + HelperMethods.mapToString(mapAB(new HashMap<>(Map.of("b", "There")))));
		System.out.println("mapAB({\"c\": \"meh\"}) -> " + HelperMethods.mapToString(mapAB(new HashMap<>(Map.of("c", "meh")))));
		System.out.println("mapAB({\"a\": \"aaa\", \"ab\": \"nope\", \"b\": \"bbb\", \"c\": \"ccc\"}) -> " + HelperMethods.mapToString(mapAB(new HashMap<>(Map.of("a", "aaa", "ab", "nope", "b", "bbb", "c", "ccc")))));
		System.out.println("mapAB({\"ab\": \"nope\", \"b\": \"bbb\", \"c\": \"ccc\"}) -> " + HelperMethods.mapToString(mapAB(new HashMap<>(Map.of("ab", "nope", "b", "bbb", "c", "ccc")))));
		printMethod("topping1");
		System.out.println("topping1({\"ice cream\": \"peanuts\"}) -> " + HelperMethods.mapToString(topping1(new HashMap<>(Map.of("ice cream", "peanuts")))));
		System.out.println("topping1({}) -> " + HelperMethods.mapToString(topping1(new HashMap<>(Map.of()))));
		System.out.println("topping1({\"pancake\": \"syrup\"}) -> " + HelperMethods.mapToString(topping1(new HashMap<>(Map.of("pancake", "syrup")))));
		System.out.println("topping1({\"bread\": \"dirt\", \"ice cream\": \"strawberries\"}) -> " + HelperMethods.mapToString(topping1(new HashMap<>(Map.of("bread", "dirt", "ice cream", "strawberries")))));
		System.out.println("topping1({\"bread\": \"jam\", \"ice cream\": \"strawberries\", \"salad\": \"oil\"}) -> " + HelperMethods.mapToString(topping1(new HashMap<>(Map.of("bread", "jam", "ice cream", "strawberries", "salad", "oil")))));
		printMethod("topping2");
		System.out.println("topping2({\"ice cream\": \"cherry\"}) -> " + HelperMethods.mapToString(topping2(new HashMap<>(Map.of("ice cream", "cherry")))));
		System.out.println("topping2({\"spinach\": \"dirt\", \"ice cream\": \"cherry\"}) -> " + HelperMethods.mapToString(topping2(new HashMap<>(Map.of("spinach", "dirt", "ice cream", "cherry")))));
		System.out.println("topping2({\"yogurt\": \"salt\"}) -> " + HelperMethods.mapToString(topping2(new HashMap<>(Map.of("yogurt", "salt")))));
		System.out.println("topping2({\"yogurt\": \"salt\", \"bread\": \"butter\"}) -> " + HelperMethods.mapToString(topping2(new HashMap<>(Map.of("yogurt", "salt", "bread", "butter")))));
		System.out.println("topping2({}) -> " + HelperMethods.mapToString(topping2(new HashMap<>(Map.of()))));
		System.out.println("topping2({\"ice cream\": \"air\", \"salad\": \"oil\"}) -> " + HelperMethods.mapToString(topping2(new HashMap<>(Map.of("ice cream", "air", "salad", "oil")))));
		printMethod("topping3");
		System.out.println("topping3({\"potato\": \"ketchup\"}) -> " + HelperMethods.mapToString(topping3(new HashMap<>(Map.of("potato", "ketchup")))));
		System.out.println("topping3({\"potato\": \"butter\"}) -> " + HelperMethods.mapToString(topping3(new HashMap<>(Map.of("potato", "butter")))));
		System.out.println("topping3({\"salad\": \"oil\", \"potato\": \"ketchup\"}) -> " + HelperMethods.mapToString(topping3(new HashMap<>(Map.of("salad", "oil", "potato", "ketchup")))));
		System.out.println("topping3({\"toast\": \"butter\", \"salad\": \"oil\", \"potato\": \"ketchup\"}) -> " + HelperMethods.mapToString(topping3(new HashMap<>(Map.of("toast", "butter", "salad", "oil", "potato", "ketchup")))));
		System.out.println("topping3({}) -> " + HelperMethods.mapToString(topping3(new HashMap<>(Map.of()))));
		System.out.println("topping3({\"salad\": \"pepper\", \"fries\": \"salt\"}) -> " + HelperMethods.mapToString(topping3(new HashMap<>(Map.of("salad", "pepper", "fries", "salt")))));
		printMethod("mapAB2");
		System.out.println("mapAB2({\"a\": \"aaa\", \"b\": \"aaa\", \"c\": \"cake\"}) -> " + HelperMethods.mapToString(mapAB2(new HashMap<>(Map.of("a", "aaa", "b", "aaa", "c", "cake")))));
		System.out.println("mapAB2({\"a\": \"aaa\", \"b\": \"bbb\"}) -> " + HelperMethods.mapToString(mapAB2(new HashMap<>(Map.of("a", "aaa", "b", "bbb")))));
		System.out.println("mapAB2({\"a\": \"aaa\", \"b\": \"bbb\", \"c\": \"aaa\"}) -> " + HelperMethods.mapToString(mapAB2(new HashMap<>(Map.of("a", "aaa", "b", "bbb", "c", "aaa")))));
		System.out.println("mapAB2({\"a\": \"aaa\"}) -> " + HelperMethods.mapToString(mapAB2(new HashMap<>(Map.of("a", "aaa")))));
		System.out.println("mapAB2({\"b\": \"bbb\"}) -> " + HelperMethods.mapToString(mapAB2(new HashMap<>(Map.of("b", "bbb")))));
		System.out.println("mapAB2({\"a\": \"\", \"b\": \"\", \"c\": \"ccc\"}) -> " + HelperMethods.mapToString(mapAB2(new HashMap<>(Map.of("a", "", "b", "", "c", "ccc")))));
		System.out.println("mapAB2({}) -> " + HelperMethods.mapToString(mapAB2(new HashMap<>(Map.of()))));
		System.out.println("mapAB2({\"a\": \"a\", \"b\": \"b\", \"z\": \"zebra\"}) -> " + HelperMethods.mapToString(mapAB2(new HashMap<>(Map.of("a", "a", "b", "b", "z", "zebra")))));
		printMethod("mapAB3");
		System.out.println("mapAB3({\"a\": \"aaa\", \"c\": \"ccc\"}) -> " + HelperMethods.mapToString(mapAB3(new HashMap<>(Map.of("a", "aaa", "c", "cake")))));
		System.out.println("mapAB3({\"b\": \"bbb\", \"c\": \"cake\"}) -> " + HelperMethods.mapToString(mapAB3(new HashMap<>(Map.of("b", "bbb", "c", "cake")))));
		System.out.println("mapAB3({\"a\": \"aaa\", \"b\": \"bbb\", \"c\": \"cake\"}) -> " + HelperMethods.mapToString(mapAB3(new HashMap<>(Map.of("a", "aaa", "b", "bbb", "c", "cake")))));
		System.out.println("mapAB3({\"ccc\": \"ccc\"}) -> " + HelperMethods.mapToString(mapAB3(new HashMap<>(Map.of("ccc", "ccc")))));
		System.out.println("mapAB3({\"c\": \"a\", \"d\": \"b\"}) -> " + HelperMethods.mapToString(mapAB3(new HashMap<>(Map.of("c", "a", "d", "b")))));
		System.out.println("mapAB3({}) -> " + HelperMethods.mapToString(mapAB3(new HashMap<>(Map.of()))));
		System.out.println("mapAB3({\"a\": \"\"}) -> " + HelperMethods.mapToString(mapAB3(new HashMap<>(Map.of("a", "")))));
		System.out.println("mapAB3({\"b\": \"\"}) -> " + HelperMethods.mapToString(mapAB3(new HashMap<>(Map.of("b", "")))));
		System.out.println("mapAB3({\"a\": \"\", \"b\": \"\"}) -> " + HelperMethods.mapToString(mapAB3(new HashMap<>(Map.of("a", "", "b", "")))));
		System.out.println("mapAB3({\"aa\": \"aa\", \"a\": \"apple\", \"z\": \"zzz\"}) -> " + HelperMethods.mapToString(mapAB3(new HashMap<>(Map.of("aa", "aa", "a", "apple", "z", "zzz")))));
		printMethod("mapAB4");
		System.out.println("mapAB4({\"a\": \"aaa\", \"b\": \"bb\", \"c\": \"cake\"}) -> " + HelperMethods.mapToString(mapAB4(new HashMap<>(Map.of("a", "aaa", "b", "bb", "c", "cake")))));
		System.out.println("mapAB4({\"a\": \"aa\", \"b\": \"bbb\", \"c\": \"cake\"}) -> " + HelperMethods.mapToString(mapAB4(new HashMap<>(Map.of("a", "aa", "b", "bbb", "c", "cake")))));
		System.out.println("mapAB4({\"a\": \"aa\", \"b\": \"bbb\"}) -> " + HelperMethods.mapToString(mapAB4(new HashMap<>(Map.of("a", "aa", "b", "bbb")))));
		System.out.println("mapAB4({\"a\": \"aaa\"}) -> " + HelperMethods.mapToString(mapAB4(new HashMap<>(Map.of("a", "aaa")))));
		System.out.println("mapAB4({\"b\": \"bbb\"}) -> " + HelperMethods.mapToString(mapAB4(new HashMap<>(Map.of("b", "bbb")))));
		System.out.println("mapAB4({\"a\": \"aaa\", \"b\": \"bbb\", \"c\": \"cake\"}) -> " + HelperMethods.mapToString(mapAB4(new HashMap<>(Map.of("a", "aaa", "b", "bbb", "c", "cake")))));
		System.out.println("mapAB4({\"a\": \"a\", \"b\": \"b\", \"c\": \"cake\"}) -> " + HelperMethods.mapToString(mapAB4(new HashMap<>(Map.of("a", "a", "b", "b", "c", "cake")))));
		System.out.println("mapAB4({\"a\": \"\", \"b\": \"b\", \"c\": \"cake\"}) -> " + HelperMethods.mapToString(mapAB4(new HashMap<>(Map.of("a", "", "b", "b", "c", "cake")))));
		System.out.println("mapAB4({\"a\": \"a\", \"b\": \"\", \"c\": \"cake\"}) -> " + HelperMethods.mapToString(mapAB4(new HashMap<>(Map.of("a", "a", "b", "", "c", "cake")))));
		System.out.println("mapAB4({\"c\": \"cat\", \"d\": \"dog\"}) -> " + HelperMethods.mapToString(mapAB4(new HashMap<>(Map.of("c", "cat", "d", "dog")))));
		System.out.println("mapAB4({\"ccc\": \"ccc\"}) -> " + HelperMethods.mapToString(mapAB4(new HashMap<>(Map.of("ccc", "ccc")))));
		System.out.println("mapAB4({\"c\": \"a\", \"d\": \"b\"}) -> " + HelperMethods.mapToString(mapAB4(new HashMap<>(Map.of("c", "a", "d", "b")))));
		System.out.println("mapAB4({}) -> " + HelperMethods.mapToString(mapAB4(new HashMap<>(Map.of()))));
		System.out.println("mapAB4({\"a\": \"\", \"z\": \"z\"}) -> " + HelperMethods.mapToString(mapAB4(new HashMap<>(Map.of("a", "", "z", "z")))));
		System.out.println("mapAB4({\"b\": \"\", \"z\": \"z\"}) -> " + HelperMethods.mapToString(mapAB4(new HashMap<>(Map.of("b", "", "z", "z")))));
	}
}
