package com.arvindhvelrajan;

import static com.arvindhvelrajan.UI_Functions.*;

/**
 * @author arvindhvelrajan
 * @code This class is to demonstrate the implementation for all functions in Warmup-2 from codingbat.com
 */
public class Warmup_2
{
	/**
	 * This function introduces the user to the class that is being demonstrated.
	 */
	private void welcome()
	{
		System.out.print("\n\nWarmup-2 Functions");
	}

	/**
	 * Given a string and a non-negative int n, return a larger string that is n copies
	 * of the original string.
	 *
	 * stringTimes("Hi", 2) → "HiHi"
	 * stringTimes("Hi", 3) → "HiHiHi"
	 * stringTimes("Hi", 1) → "Hi"
	 */
	public String stringTimes(String str, int n)
	{
		String sub = "";
		for(int i = 0; i < n; i++)
		{
			sub += str;
		}
		return sub;
	}
	/**
	 * The following is a recursive algorithm for stringTimes().
	 */
	private String stringTimesRecursive(String str, int n)
	{
		if(n == 0)
		{
			return "";
		}
		return str + stringTimesRecursive(str, n - 1);
	}

	/**
	 * Given a string and a non-negative int n, we'll say that the front of the string is the first 3 chars, or whatever is there if the string is less than length 3. Return n copies of the front;
	 *
	 * frontTimes("Chocolate", 2) → "ChoCho"
	 * frontTimes("Chocolate", 3) → "ChoChoCho"
	 * frontTimes("Abc", 3) → "AbcAbcAbc"
	 */
	public String frontTimes(String str, int n)
	{
		if(str.length() > 3)
		{
			str = str.substring(0, 3);
		}
		String sub = "";
		for(int i = 0; i < n; i++)
		{
			sub += str;
		}
		return sub;
	}
	private String frontTimesRecursive(String str, int n)
	{
		if(n == 0)
		{
			return "";
		}
		if(str.length() > 3)
		{
			return frontTimesRecursive(str.substring(0, str.length() - 1), n);
		}
		return str + frontTimesRecursive(str, n - 1);
	}

	/**
	 * Count the number of "xx" in the given string. We'll say that overlapping is allowed,
	 * so "xxx" contains 2 "xx".
	 *
	 * countXX("abcxx") → 1
	 * countXX("xxx") → 2
	 * countXX("xxxx") → 3
	 */
	public int countXX(String str)
	{
		if(str.length() < 2)
		{
			return 0;
		}
		int count = 0;
		for(int i = 0; i < str.length() - 1; i++)
		{
			if(str.substring(i, i + 2).equals("xx"))
			{
				count++;
			}
		}
		return count;
	}
	private int countXXRecursive(String str)
	{
		if(str.length() < 2)
		{
			return 0;
		}
		if(str.startsWith("xx"))
		{
			return 1 + countXXRecursive(str.substring(1));
		}
		return countXXRecursive(str.substring(1));
	}

	/**
	 * Given a string, return true if the first instance of "x" in the string is immediately followed
	 * by another "x".
	 *
	 * doubleX("axxbb") → true
	 * doubleX("axaxax") → false
	 * doubleX("xxxxx") → true
	 */
	public boolean doubleX(String str)
	{
		if(str.isEmpty())
		{
			return true;
		}
		if(str.length() == 1)
		{
			return !(str.equals("x"));
		}
		if(str.charAt(0) == 'x' && !(str.charAt(1) == 'x'))
		{
			return false;
		}
		for(int i = 1; i < str.length() - 1; i++)
		{
			if(str.charAt(i) == 'x')
			{
				return (str.charAt(i + 1) == 'x') || (str.charAt(i - 1) == 'x');
			}
		}
		if(str.charAt(str.length() - 1) == 'x')
		{
			return str.charAt(str.length() - 2) == 'x';
		}
		return true;
	}
	/**
	 * The following is a recursive algorithm for solving doubleX().
	 */
	private boolean doubleXRecursive(String str)
	{
		if(str.isEmpty())
		{
			return true;
		}
		if(str.length() == 1)
		{
			return !(str.equals("x"));
		}
		if(str.charAt(0) == 'x')
		{
			return str.charAt(1) == 'x';
		}
		return doubleX(str.substring(1));
	}

	/**
	 * Given a string, return a new string made of every other char starting with the first,
	 * so "Hello" yields "Hlo".
	 *
	 * stringBits("Hello") → "Hlo"
	 * stringBits("Hi") → "H"
	 * stringBits("Heeololeo") → "Hello"
	 */
	public String stringBits(String str)
	{
		String sub = "";
		for(int i = 0; i < str.length(); i += 2)
		{
			sub += str.substring(i, i + 1);
		}
		return sub;
	}

	/**
	 * The following is a recursive algorithm for solving stringBits().
	 */
	private String stringBitsRecursive(String str)
	{
		if(str.length() <= 1)
		{
			return str;
		}
		if(str.length() == 2)
		{
			return str.substring(0, 1);
		}
		return str.charAt(0) + stringBitsRecursive(str.substring(2));
	}

	/**
	 * Given a non-empty string like "Code" return a string like "CCoCodCode".
	 *
	 * stringSplosion("Code") → "CCoCodCode"
	 * stringSplosion("abc") → "aababc"
	 * stringSplosion("ab") → "aab"
	 */
	public String stringSplosion(String str)
	{
		String sub = "";
		for(int i = 1; i < str.length() + 1; i++)
		{
			sub += str.substring(0, i);
		}
		return sub;
	}

	/**
	 * The following is a recursive algorithm for solving stringBits().
	 */
	private String stringSplosionRecursive(String str)
	{
		if(str.length() <= 1)
		{
			return str;
		}
		return stringSplosionRecursive(str.substring(0, str.length() - 1)) + str;
	}

	/**
	 * Given a string, return the count of the number of times that a substring length 2
	 * appears in the string and also as the last 2 chars of the string,
	 * so "hixxxhi" yields 1 (we won't count the end substring).
	 *
	 * last2("hixxhi") → 1
	 * last2("xaxxaxaxx") → 1
	 * last2("axxxaaxx") → 2
	 */
	public int last2(String str)
	{
		if(str.length() <= 2)
		{
			return 0;
		}
		int count = 0;
		String sub = str.substring(str.length() - 2);
		for(int i = 0; i < str.length() - 2; i++)
		{
			if(str.substring(i, i + 2).equals(sub))
			{
				count++;
			}
		}
		return count;
	}

	/**
	 * Given an array of ints, return the number of 9's in the array.
	 *
	 * arrayCount9([1, 2, 9]) → 1
	 * arrayCount9([1, 9, 9]) → 2
	 * arrayCount9([1, 9, 9, 3, 9]) → 3
	 */
	public int arrayCount9(int[] nums)
	{
		int count = 0;
		for(int num : nums)
		{
			if(num == 9)
			{
				count++;
			}
		}
		return count;
		// This is how you would call the recursive method in this function
	//	return arrayCount9Recursive(nums, 0);
	}
	/**
	 * The following is a recursive implementation for arrayCount9()
	 */
	private int arrayCount9Recursive(int[] nums, int index)
	{
		if(nums.length == 0 || index < 0 || index >= nums.length)
		{
			return 0;
		}
		if(nums[index] == 9)
		{
			return 1 + arrayCount9Recursive(nums, index + 1);
		}
		return arrayCount9Recursive(nums, index + 1);
	}

	/**
	 * Given an array of ints, return true if one of the first 4 elements in the array is a 9. The array length may be less than 4.
	 *
	 * arrayFront9([1, 2, 9, 3, 4]) → true
	 * arrayFront9([1, 2, 3, 4, 9]) → false
	 * arrayFront9([1, 2, 3, 4, 5]) → false
	 */
	public boolean arrayFront9(int[] nums)
	{
		int length = nums.length;
		if(length > 4)
		{
			length = 4;
		}
		for(int i = 0; i < length; i++)
		{
			if(nums[i] == 9)
			{
				return true;
			}
		}
		return false;
//		This is how you would call the recursive algorithm if added here:
//		return arrayFront9Recursive(nums, 0);
	}
	/**
	 * The following is a recursive implementation for arrayFront9()
	 */
	private boolean arrayFront9Recursive(int[] nums, int index)
	{
		if(nums.length == 0 || index < 0 || index >= 4 || index >= nums.length)
		{
			return false;
		}
		if(nums[index] == 9)
		{
			return true;
		}
		return arrayFront9Recursive(nums, index + 1);
	}

	/**
	 * Given an array of ints, return true if the sequence of numbers 1, 2, 3 appears in the array somewhere.
	 *
	 * array123([1, 1, 2, 3, 1]) → true
	 * array123([1, 1, 2, 4, 1]) → false
	 * array123([1, 1, 2, 1, 2, 3]) → true
	 */
	public boolean array123(int[] nums)
	{
		for(int i = 0; i < nums.length - 2; i++)
		{
			if(nums[i] == 1 && nums[i + 1] == 2 && nums[i + 2] == 3)
			{
				return true;
			}
		}
		return false;
	}

	/**
	 * Given 2 strings, a and b, return the number of the positions where they contain the same length 2 substring.
	 * So "xxcaazz" and "xxbaaz" yields 3, since the "xx", "aa", and "az" substrings appear in the same place in
	 * both strings.
	 *
	 * stringMatch("xxcaazz", "xxbaaz") → 3
	 * stringMatch("abc", "abc") → 2
	 * stringMatch("abc", "axc") → 0
	 */
	public int stringMatch(String a, String b)
	{
		String minString = (a.length() < b.length()) ? a : b;
		int count = 0;
		for(int i = 0; i < minString.length() - 1; i++)
		{
			if(a.substring(i, i + 2).equals(b.substring(i, i + 2)))
			{
				count++;
			}
		}
		return count;
		// If done recursively, the following would be the call;
		// stringMatchRecursive(a, b);
	}
	/**
	 * The following is a RECURSIVE implementation for stringMatch().
	 */
	private int stringMatchRecursive(String a, String b)
	{
		if(a.length() < 2 || b.length() < 2)
		{
			return 0;
		}
		if(a.substring(0, 2).equals(b.substring(0, 2)))
		{
			return 1 + stringMatchRecursive(a.substring(1), b.substring(1));
		}
		return stringMatchRecursive(a.substring(1), b.substring(1));
	}

	/**
	 * Given a string, return a version where all the "x" have been removed.
	 * Except an "x" at the very start or end should not be removed.
	 *
	 * stringX("xxHxix") → "xHix"
	 * stringX("abxxxcd") → "abcd"
	 * stringX("xabxxxcdx") → "xabcdx"
	 */
	public String stringX(String str)
	{
		if(str.length() <= 2)
		{
			return str;
		}
		String sub = "";
		sub += str.substring(0, 1);
		for(int i = 1; i < str.length() - 1; i++)
		{
			sub += ((str.charAt(i) == 'x') ? "" : str.substring(i, i + 1));
		}
		sub += str.substring(str.length() - 1);
		return sub;
	}

	/**
	 * Given a string, return a string made of the chars at indexes 0,1, 4,5, 8,9 ... so "kittens" yields "kien".
	 *
	 * altPairs("kitten") → "kien"
	 * altPairs("Chocolate") → "Chole"
	 * altPairs("CodingHorror") → "Congrr"
	 */
	public String altPairs(String str)
	{
		if(str.length() <= 2)
		{
			return str;
		}
		String sub = "";
		for(int i = 0; i < str.length() - 1; i += 4)
		{
			sub += str.substring(i, i + 2);
		}
		return sub;
	}
	/**
	 * The following is a recursive approach for the altPairs() function above
	 */
	private String altPairsRecursive(String str)
	{
		if(str.length() <= 2)
		{
			return str;
		}
		if(str.length() <= 4)
		{
			return str.substring(0, 2);
		}
		return str.substring(0, 2) + altPairsRecursive(str.substring(4));
	}

	/**
	 * Suppose the string "yak" is unlucky. Given a string, return a version where all the "yak" are removed,
	 * but the "a" can be any char. The "yak" strings will not overlap.
	 *
	 * stringYak("yakpak") → "pak"
	 * stringYak("pakyak") → "pak"
	 * stringYak("yak123ya") → "123ya"
	 */
	public String stringYak(String str)
	{
		String sub = "";
		int i = 0;
		for(i = 0; i < str.length() - 2; i++)
		{
			if(str.charAt(i) == 'y' && str.charAt(i + 2) == 'k')
			{
				i += 2;
			}
			else
			{
				sub += str.substring(i, i + 1);
			}
		}
		return sub;
	}
	/**
	 * The following is a recursive algorithm for stringYak()
	 */
	private String stringYakRecursive(String str)
	{
		if(str.length() <= 2)
		{
			return str;
		}
		if(str.charAt(0) == 'y' && str.charAt(2) == 'k')
		{
			return stringYakRecursive(str.substring(3));
		}
		return str.charAt(0) + stringYakRecursive(str.substring(1));
	}

	/**
	 * Given an array of ints, return the number of times that two 6's are next to each other in the array.
	 * Also count instances where the second "6" is actually a 7.
	 *
	 * array667([6, 6, 2]) → 1
	 * array667([6, 6, 2, 6]) → 1
	 * array667([6, 7, 2, 6]) → 1
	 */
	public int array667(int[] nums)
	{
		int count = 0;
		for(int i = 0; i < nums.length - 1; i++)
		{
			if(nums[i] == 6 && (nums[i + 1] == 6 || nums[i + 1] == 7))
			{
				count++;
			}
		}
		return count;
	}

	/**
	 * Given an array of ints, we'll say that a triple is a value appearing 3 times in a row in the array.
	 * Return true if the array does not contain any triples.
	 *
	 * noTriples([1, 1, 2, 2, 1]) → true
	 * noTriples([1, 1, 2, 2, 2, 1]) → false
	 * noTriples([1, 1, 1, 2, 2, 2, 1]) → false
	 */
	public boolean noTriples(int[] nums)
	{
		if(nums.length < 3)
		{
			return true;
		}
		for(int i = 0; i < nums.length - 2; i++)
		{
			if(nums[i] == nums[i + 1] && nums[i] == nums[i + 2])
			{
				return false;
			}
		}
		return true;
	}

	/**
	 * Given an array of ints, return true if it contains a 2, 7, 1 pattern: a value, followed by the value plus 5, followed by the value minus 1. Additionally the 271 counts even if the "1" differs by 2 or less from the correct value.
	 *
	 * has271([1, 2, 7, 1]) → true
	 * has271([1, 2, 8, 1]) → false
	 * has271([2, 7, 1]) → true
	 */
	public boolean has271(int[] nums)
	{
		for(int i = 0; i < nums.length - 2; i++)
		{
			if(nums[i + 1] == nums[i] + 5 && Math.abs(nums[i + 2] - (nums[i] - 1)) <= 2)
			{
				return true;
			}
		}
		return false;
	}

	/**
	 * @param args commandline arguments
	 */
	public void main(String[] args)
	{
		resetCallCount();
		welcome();
		printFunction("stringTimes");
		System.out.println("stringTimes(\"Hi\", 2) → \"" + stringTimes("Hi", 2) + "\"");
		System.out.println("stringTimes(\"Hi\", 3) → \"" + stringTimes("Hi", 3) + "\"");
		System.out.println("stringTimes(\"Hi\", 1) → \"" + stringTimes("Hi", 1) + "\"");
		System.out.println("stringTimes(\"Hi\", 0) → \"" + stringTimes("Hi", 0) + "\"");
		System.out.println("stringTimes(\"Oh Boy!\", 2) → \"" + stringTimes("Oh Boy!", 2) + "\"");
		System.out.println("stringTimes(\"x\", 4) → \"" + stringTimes("x", 4) + "\"");
		System.out.println("stringTimes(\"\", 4) → \"" + stringTimes("", 4) + "\"");
		System.out.println("stringTimes(\"code\", 2) → \"" + stringTimes("code", 2) + "\"");
		System.out.println("stringTimes(\"code\", 3) → \"" + stringTimes("code", 3) + "\"");
		printFunction("frontTimes");
		System.out.println("frontTimes(\"Chocolate\", 2) → \"" + frontTimes("Chocolate", 2) + "\"");
		System.out.println("frontTimes(\"Chocolate\", 3) → \"" + frontTimes("Chocolate", 3) + "\"");
		System.out.println("frontTimes(\"Abc\", 3) → \"" + frontTimes("Abc", 3) + "\"");
		System.out.println("frontTimes(\"Ab\", 4) → \"" + frontTimes("Ab", 4) + "\"");
		System.out.println("frontTimes(\"A\", 4) → \"" + frontTimes("A", 4) + "\"");
		System.out.println("frontTimes(\"\", 4) → \"" + frontTimes("", 4) + "\"");
		System.out.println("frontTimes(\"Abc\", 0) → \"" + frontTimes("Abc", 0) + "\"");
		printFunction("countXX");
		System.out.println("countXX(\"abcxx\") → " + countXX("abcxx"));
		System.out.println("countXX(\"xxx\") → " + countXX("xxx"));
		System.out.println("countXX(\"xxxx\") → " + countXX("xxxx"));
		System.out.println("countXX(\"abc\") → " + countXX("abc"));
		System.out.println("countXX(\"Hello there\") → " + countXX("Hello there"));
		System.out.println("countXX(\"Hexxo thxxe\") → " + countXX("Hexxo thxxe"));
		System.out.println("countXX(\"\") → " + countXX("\"\""));
		System.out.println("countXX(\"Kittens\") → " + countXX("Kittens"));
		System.out.println("countXX(\"Kittensxxx\") → " + countXX("Kittensxxx"));
		printFunction("doubleX");
		System.out.println("doubleX(\"axxbb\") → " + doubleX("axxbb"));
		System.out.println("doubleX(\"axaxax\") → " + doubleX("axaxax"));
		System.out.println("doubleX(\"xxxxx\") → " + doubleX("xxxxx"));
		System.out.println("doubleX(\"xaxxx\") → " + doubleX("xaxxx"));
		System.out.println("doubleX(\"aaaax\") → " + doubleX("aaaax"));
		System.out.println("doubleX(\"\") → " + doubleX(""));
		System.out.println("doubleX(\"abc\") → " + doubleX("abc"));
		System.out.println("doubleX(\"x\") → " + doubleX("x"));
		System.out.println("doubleX(\"xx\") → " + doubleX("xx"));
		System.out.println("doubleX(\"xax\") → " + doubleX("xax"));
		System.out.println("doubleX(\"xaxx\") → " + doubleX("xaxx"));
		printFunction("stringBits");
		System.out.println("stringBits(\"Hello\") → \"" + stringBits("Hello") + "\"");
		System.out.println("stringBits(\"Hi\") → \"" + stringBits("Hi") + "\"");
		System.out.println("stringBits(\"Heeololeo\") → \"" + stringBits("Heeololeo") + "\"");
		System.out.println("stringBits(\"HiHiHi\") → \"" + stringBits("HiHiHi") + "\"");
		System.out.println("stringBits(\"\") → \"" + stringBits("") + "\"");
		System.out.println("stringBits(\"Greetings\") → \"" + stringBits("Greetings") + "\"");
		System.out.println("stringBits(\"Chocolate\") → \"" + stringBits("Chocolate") + "\"");
		System.out.println("stringBits(\"pi\") → \"" + stringBits("pi") + "\"");
		System.out.println("stringBits(\"hxaxpxpxy\") → \"" + stringBits("hxaxpxpxy") + "\"");
		printFunction("stringSplosion");
		System.out.println("stringSplosion(\"Code\") → \"" + stringSplosion("Code") + "\"");
		System.out.println("stringSplosion(\"abc\") → \"" + stringSplosion("abc") + "\"");
		System.out.println("stringSplosion(\"ab\") → \"" + stringSplosion("ab") + "\"");
		System.out.println("stringSplosion(\"x\") → \"" + stringSplosion("x") + "\"");
		System.out.println("stringSplosion(\"fade\") → \"" + stringSplosion("fade") + "\"");
		System.out.println("stringSplosion(\"There\") → \"" + stringSplosion("There") + "\"");
		System.out.println("stringSplosion(\"Kitten\") → \"" + stringSplosion("Kitten") + "\"");
		System.out.println("stringSplosion(\"Bye\") → \"" + stringSplosion("Bye") + "\"");
		System.out.println("stringSplosion(\"Good\") → \"" + stringSplosion("Good") + "\"");
		System.out.println("stringSplosion(\"Bad\") → \"" + stringSplosion("Bad") + "\"");
		printFunction("last2");
		System.out.println("last2(\"hixxhi\") → " + last2("hixxhi"));
		System.out.println("last2(\"xaxxaxaxx\") → " + last2("xaxxaxaxx"));
		System.out.println("last2(\"axxxaaxx\") → " + last2("axxxaaxx"));
		System.out.println("last2(\"xxaxxaxxaxx\") → " + last2("xxaxxaxxaxx"));
		System.out.println("last2(\"xaxaxaxx\") → " + last2("xaxaxaxx"));
		System.out.println("last2(\"xxxx\") → " + last2("xxxx"));
		System.out.println("last2(\"13121312\") → " + last2("13121312"));
		System.out.println("last2(\"11212\") → " + last2("11212"));
		System.out.println("last2(\"13121311\") → " + last2("13121311"));
		System.out.println("last2(\"1717171\") → " + last2("1717171"));
		System.out.println("last2(\"hi\") → " + last2("hi"));
		System.out.println("last2(\"h\") → " + last2("h"));
		System.out.println("last2(\"\") → " + last2(""));
		printFunction("arrayCount9");
		System.out.println("arrayCount9([1, 2, 9]) → " + arrayCount9(new int[] {1, 2, 9}));
		System.out.println("arrayCount9([1, 9, 9]) → " + arrayCount9(new int[] {1, 9, 9}));
		System.out.println("arrayCount9([1, 9, 9, 3, 9]) → " + arrayCount9(new int[] {1, 9, 9, 3, 9}));
		System.out.println("arrayCount9([1, 2, 3]) → " + arrayCount9(new int[] {1, 2, 3}));
		System.out.println("arrayCount9([]) → " + arrayCount9(new int[] {}));
		System.out.println("arrayCount9([4, 2, 4, 3, 1]) → " + arrayCount9(new int[] {4, 2, 4, 3, 1}));
		System.out.println("arrayCount9([9, 2, 4, 3, 1]) → " + arrayCount9(new int[] {9, 2, 4, 3, 1}));
		printFunction("arrayFront9");
		System.out.println("arrayFront9([1, 2, 9, 3, 4]) → " + arrayFront9(new int[] {1, 2, 9, 3, 4}));
		System.out.println("arrayFront9([1, 2, 3, 4, 9]) → " + arrayFront9(new int[] {1, 2, 3, 4, 9}));
		System.out.println("arrayFront9([1, 2, 3, 4, 5]) → " + arrayFront9(new int[] {1, 2, 3, 4, 5}));
		System.out.println("arrayFront9([9, 2, 3]) → " + arrayFront9(new int[] {9, 2, 3}));
		System.out.println("arrayFront9([1, 9, 9]) → " + arrayFront9(new int[] {1, 9, 9}));
		System.out.println("arrayFront9([1, 2, 3]) → " + arrayFront9(new int[] {1, 2, 3}));
		System.out.println("arrayFront9([1, 9]) → " + arrayFront9(new int[] {1, 9}));
		System.out.println("arrayFront9([5, 5]) → " + arrayFront9(new int[] {5, 5}));
		System.out.println("arrayFront9([2]) → " + arrayFront9(new int[] {2}));
		System.out.println("arrayFront9([9]) → " + arrayFront9(new int[] {9}));
		System.out.println("arrayFront9([]) → " + arrayFront9(new int[] {}));
		System.out.println("arrayFront9([3, 9, 2, 3, 3]) → " + arrayFront9(new int[] {3, 9, 2, 3, 3}));
		printFunction("array123");
		System.out.println("array123([1, 1, 2, 3, 1]) → " + array123(new int[] {1, 1, 2, 3, 1}));
		System.out.println("array123([1, 1, 2, 4, 1]) → " + array123(new int[] {1, 1, 2, 4, 1}));
		System.out.println("array123([1, 1, 2, 1, 2, 3]) → " + array123(new int[] {1, 1, 2, 1, 2, 3}));
		System.out.println("array123([1, 2, 3, 1, 2, 3]) → " + array123(new int[] {1, 2, 3, 1, 2, 3}));
		System.out.println("array123([1, 2, 3]) → " + array123(new int[] {1, 2, 3}));
		System.out.println("array123([1, 1, 1]) → " + array123(new int[] {1, 1, 1}));
		System.out.println("array123([1, 2]) → " + array123(new int[]{1, 2}));
		System.out.println("array123([1]) → " + array123(new int[] {1}));
		System.out.println("array123([]) → " + array123(new int[] {}));
		printFunction("stringMatch");
		System.out.println("stringMatch(\"xxcaazz\", \"xxbaaz\") → " + stringMatch("xxcaazz", "xxbaaz"));
		System.out.println("stringMatch(\"abc\", \"abc\") → " + stringMatch("abc", "abc"));
		System.out.println("stringMatch(\"abc\", \"axc\") → " + stringMatch("abc", "axc"));
		System.out.println("stringMatch(\"hello\", \"he\") → " + stringMatch("hello", "he"));
		System.out.println("stringMatch(\"he\", \"hello\") → " + stringMatch("he", "hello"));
		System.out.println("stringMatch(\"h\", \"hello\") → " + stringMatch("h", "hello"));
		System.out.println("stringMatch(\"\", \"hello\") → " + stringMatch("", "hello"));
		System.out.println("stringMatch(\"aabbccdd\", \"abbbxxd\") → " + stringMatch("aabbccdd", "abbbxxd"));
		System.out.println("stringMatch(\"aaxxaaxx\", \"iaxxai\") → " + stringMatch("aaxxaaxx", "iaxxai"));
		System.out.println("stringMatch(\"iaxxai\", \"aaxxaaxx\") → " + stringMatch("iaxxai", "aaxxaaxx"));
		printFunction("stringX");
		System.out.println("stringX(\"xxHxix\") → \"" + stringX("xxHxix") + "\"");
		System.out.println("stringX(\"abxxxcd\") → \"" + stringX("abxxxcd") + "\"");
		System.out.println("stringX(\"xabxxxcdx\") → \"" + stringX("xabxxxcdx") + "\"");
		System.out.println("stringX(\"xKittenx\") → \"" + stringX("xKittenx") + "\"");
		System.out.println("stringX(\"Hello\") → \"" + stringX("Hello") + "\"");
		System.out.println("stringX(\"xx\") → \"" + stringX("xx") + "\"");
		System.out.println("stringX(\"x\") → \"" + stringX("x") + "\"");
		System.out.println("stringX(\"\") → \"" + stringX("") + "\"");
		printFunction("altPairs");
		System.out.println("altPairs(\"kitten\") → \"" + altPairs("kitten") + "\"");
//		System.out.println("altPairs(\"kitten\") → \"" + altPairsRecursive("kitten") + "\"");
		System.out.println("altPairs(\"Chocolate\") → \"" + altPairs("Chocolate") + "\"");
		System.out.println("altPairs(\"CodingHorror\") → \"" + altPairs("CodingHorror") + "\"");
		System.out.println("altPairs(\"yak\") → \"" + altPairs("yak") + "\"");
		System.out.println("altPairs(\"ya\") → \"" + altPairs("ya") + "\"");
		System.out.println("altPairs(\"y\") → \"" + altPairs("y") + "\"");
		System.out.println("altPairs(\"\") → \"" + altPairs("") + "\"");
		System.out.println("altPairs(\"ThisThatTheOther\") → \"" + altPairs("ThisThatTheOther") + "\"");
		printFunction("stringYak");
		System.out.println("stringYak(\"yakpak\") → \"" + stringYak("yakpak") + "\"");
		System.out.println("stringYak(\"pakyak\") → \"" + stringYak("pakyak") + "\"");
		System.out.println("stringYak(\"yak123ya\") → \"" + stringYak("yak123ya") + "\"");
		System.out.println("stringYak(\"yak\") → \"" + stringYak("yak") + "\"");
		System.out.println("stringYak(\"yakxxxyak\") → \"" + stringYak("yakxxxyak") + "\"");
		System.out.println("stringYak(\"HiyakHi\") → \"" + stringYak("HiyakHi") + "\"");
		System.out.println("stringYak(\"xxxyakyyyakzzz\") → \"" + stringYak("xxxyakyyyakzzz") + "\"");
		printFunction("array667");
		System.out.println("array667([6, 6, 2]) → " + array667(new int[] {6, 6, 2}));
		System.out.println("array667([6, 6, 2, 6]) → " + array667(new int[] {6, 6, 2, 6}));
		System.out.println("array667([6, 7, 2, 6]) → " + array667(new int[] {6, 7, 2, 6}));
		System.out.println("array667([6, 6, 2, 6, 7]) → " + array667(new int[] {6, 6, 2, 6, 7}));
		System.out.println("array667([1, 6, 3]) → " + array667(new int[] {1, 6, 3}));
		System.out.println("array667([6, 1]) → " + array667(new int[] {6, 1}));
		System.out.println("array667([]) → " + array667(new int[] {}));
		System.out.println("array667([3, 6, 7, 6]) → " + array667(new int[] {3, 6, 7, 6}));
		System.out.println("array667([3, 6, 6, 7]) → " + array667(new int[] {3, 6, 6, 7}));
		System.out.println("array667([6, 3, 6, 6]) → " + array667(new int[] {6, 3, 6, 6}));
		System.out.println("array667([6, 7, 6, 6]) → " + array667(new int[] {6, 7, 6, 6}));
		System.out.println("array667([1, 2, 3, 5, 6]) → " + array667(new int[] {1, 2, 3, 5, 6}));
		System.out.println("array667([1, 2, 3, 6, 6]) → " + array667(new int[] {1, 2, 3, 6, 6}));
		printFunction("noTriples");
		System.out.println("noTriples([1, 1, 2, 2, 1]) → " + noTriples(new int[] {1, 1, 2, 2, 1}));
		System.out.println("noTriples([1, 1, 2, 2, 2, 1]) → " + noTriples(new int[] {1, 1, 2, 2, 2, 1}));
		System.out.println("noTriples([1, 1, 1, 2, 2, 2, 1]) → " + noTriples(new int[] {1, 1, 1, 2, 2, 2, 1}));
		System.out.println("noTriples([1, 1, 2, 2, 1, 2, 1]) → " + noTriples(new int[] {1, 1, 2, 2, 1, 2, 1}));
		System.out.println("noTriples([1, 2, 1]) → " + noTriples(new int[] {1, 2, 1}));
		System.out.println("noTriples([1, 1, 1]) → " + noTriples(new int[] {1, 1, 1}));
		System.out.println("noTriples([1, 1]) → " + noTriples(new int[] {1, 1}));
		System.out.println("noTriples([1]) → " + noTriples(new int[] {1}));
		System.out.println("noTriples([]) → " + noTriples(new int[] {}));
		printFunction("has271");
		System.out.println("has271([1, 2, 7, 1]) → " + has271(new int[] {1, 2, 7, 1}));
		System.out.println("has271([1, 2, 8, 1]) → " + has271(new int[] {1, 2, 8, 1}));
		System.out.println("has271([2, 7, 1]) → " + has271(new int[] {2, 7, 1}));
		System.out.println("has271([3, 8, 2]) → " + has271(new int[] {3, 8, 2}));
		System.out.println("has271([2, 7, 3]) → " + has271(new int[] {2, 7, 3}));
		System.out.println("has271([2, 7, 4]) → " + has271(new int[] {2, 7, 4}));
		System.out.println("has271([2, 7, -1]) → " + has271(new int[] {2, 7, -1}));
		System.out.println("has271([2, 7, -2]) → " + has271(new int[] {2, 7, -2}));
		System.out.println("has271([4, 5, 3, 8, 0]) → " + has271(new int[] {4, 5, 3, 8, 0}));
		System.out.println("has271([2, 7, 5, 10, 4]) → " + has271(new int[] {2, 7, 5, 10, 4}));
		System.out.println("has271([2, 7, -2, 4, 9, 3]) → " + has271(new int[] {2, 7, -2, 4, 9, 3}));
		System.out.println("has271([2, 7, 5, 10, 1]) → " + has271(new int[] {2, 7, 5, 10, 1}));
		System.out.println("has271([2, 7, -2, 4, 10, 2]) → " + has271(new int[] {2, 7, -2, 4, 10, 2}));
		System.out.println("has271([1, 1, 4, 9, 0]) → " + has271(new int[] {1, 1, 4, 9, 0}));
		System.out.println("has271([1, 1, 4, 9, 4, 9, 2]) → " + has271(new int[] {1, 1, 4, 9, 4, 9, 2}));
	}
}
