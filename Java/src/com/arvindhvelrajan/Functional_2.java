package com.arvindhvelrajan;

import static com.arvindhvelrajan.UI_Functions.*;
import java.util.List;
import java.util.ArrayList;

/**
 * @author arvindhvelrajan
 * @code This class is to demonstrate the implementation for all functions in Functional_2 from codingbat.com
 */
public class Functional_2
{
	private void welcome()
	{
		System.out.println("\n\nFunctional-2 Functions\n");
	}

	/**
	 * Given a list of integers, return a list of the integers, omitting any that are less than 0.
	 *
	 * noNeg([1, -2]) → [1]
	 * noNeg([-3, -3, 3, 3]) → [3, 3]
	 * noNeg([-1, -1, -1]) → []
	 */
	public List<Integer> noNeg(List<Integer> nums)
	{
		nums.removeIf(num -> num < 0);
		return nums;
	}

	/**
	 * Given a list of non-negative integers, return a list of those numbers except omitting any that end with 9.
	 * (Note: % by 10)
	 *
	 * no9([1, 2, 19]) → [1, 2]
	 * no9([9, 19, 29, 3]) → [3]
	 * no9([1, 2, 3]) → [1, 2, 3]
	 */
	public List<Integer> no9(List<Integer> nums)
	{
		nums.removeIf(num -> num % 10 == 9);
		return nums;
	}

	/**
	 * Given a list of integers, return a list of those numbers, omitting any that are between 13 and 19 inclusive.
	 *
	 * noTeen([12, 13, 19, 20]) → [12, 20]
	 * noTeen([1, 14, 1]) → [1, 1]
	 * noTeen([15]) → []
	 */
	public List<Integer> noTeen(List<Integer> nums)
	{
		nums.removeIf(num -> num >= 13 && num <= 19);
		return nums;
	}

	/**
	 * Given a list of strings, return a list of the strings, omitting any string that contains a "z". (Note: the str.contains(x) method returns a boolean)
	 *
	 * noZ(["aaa", "bbb", "aza"]) → ["aaa", "bbb"]
	 * noZ(["hziz", "hzello", "hi"]) → ["hi"]
	 * noZ(["hello", "howz", "are", "youz"]) → ["hello", "are"]
	 */
	public List<String> noZ(List<String> strings)
	{
		strings.removeIf(str -> str.contains("z"));
		return strings;
	}

	/**
	 * Given a list of strings, return a list of the strings, omitting any string length 4 or more.
	 *
	 * noLong(["this", "not", "too", "long"]) → ["not", "too"]
	 * noLong(["a", "bbb", "cccc"]) → ["a", "bbb"]
	 * noLong(["cccc", "cccc", "cccc"]) → []
	 */
	public List<String> noLong(List<String> strings)
	{
		strings.removeIf(str -> str.length() >= 4);
		return strings;
	}

	/**
	 * Given a list of strings, return a list of the strings, omitting any string length 3 or 4.
	 *
	 * no34(["a", "bb", "ccc"]) → ["a", "bb"]
	 * no34(["a", "bb", "ccc", "dddd"]) → ["a", "bb"]
	 * no34(["ccc", "dddd", "apple"]) → ["apple"]
	 */
	public List<String> no34(List<String> strings)
	{
		strings.removeIf(str -> str.length() == 3 || str.length() == 4);
		return strings;
	}

	/**
	 * Given a list of strings, return a list where each string has "y" added at its end, omitting any resulting
	 * strings that contain "yy" as a substring anywhere.
	 *
	 * noYY(["a", "b", "c"]) → ["ay", "by", "cy"]
	 * noYY(["a", "b", "cy"]) → ["ay", "by"]
	 * noYY(["xx", "ya", "zz"]) → ["xxy", "yay", "zzy"]
	 */
	public List<String> noYY(List<String> strings)
	{
		strings.replaceAll(str -> str + "y");
		strings.removeIf(str -> str.contains("yy"));
		return strings;
	}

	/**
	 * Given a list of non-negative integers, return a list of those numbers multiplied by 2, omitting any of the
	 * resulting numbers that end in 2.
	 *
	 * two2([1, 2, 3]) → [4, 6]
	 * two2([2, 6, 11]) → [4]
	 * two2([0]) → [0]
	 */
	public List<Integer> two2(List<Integer> nums)
	{
		nums.replaceAll(num -> num * 2);
		nums.removeIf(num -> num % 10 == 2);
		return nums;
	}

	/**
	 * Given a list of integers, return a list of those numbers squared and the product added to 10, omitting any of
	 * the resulting numbers that end in 5 or 6.
	 *
	 * square56([3, 1, 4]) → [19, 11]
	 * square56([1]) → [11]
	 * square56([2]) → [14]
	 */
	public List<Integer> square56(List<Integer> nums)
	{
		throw new UnsupportedOperationException("Not supported yet.");
	}

	/**
	 * This is a helper function that adds quotations to strings in a list
	 */
	public String toStringStringList(List<String> list)
	{
		StringBuilder buff = new StringBuilder();
		buff.append("[");
		for(int i = 0; i < list.size(); i++)
		{
			buff.append("\"");
			buff.append(list.get(i));
			buff.append("\"");
			if(i != list.size() - 1)
			{
				buff.append(",");
			}
		}
		buff.append("]");
		return buff.toString();
	}

	/**
	 * @param args commandline arguments
	 */
	public void main(String[] args)
	{
		resetCallCount();
		welcome();
		printFunction("noNeg");
		System.out.println("noNeg([1, -2]) → " + noNeg(new ArrayList<>(List.of(1, -2))));
		System.out.println("noNeg([-3, -3, 3, 3]) → " + noNeg(new ArrayList<>(List.of(-3, -3, 3, 3))));
		System.out.println("noNeg([-1, -1, -1]) → " + noNeg(new ArrayList<>(List.of(-1, -1, -1))));
		System.out.println("noNeg([]) → " + noNeg(new ArrayList<>(List.of())));
		System.out.println("noNeg([0, 1, 2]) → " + noNeg(new ArrayList<>(List.of(0, 1, 2))));
		System.out.println("noNeg([3, -10, 1, -1, 4, -400]) → " + noNeg(new ArrayList<>(List.of(3, -10, 1, -1, 4, -400))));
		System.out.println("noNeg([-1, 3, 1, -1, -10, -100, -111, 5]) → " + noNeg(new ArrayList<>(List.of(-1, 3, 1, -1, -10, -100, -111, 5))));
		printFunction("no9");
		System.out.println("no9([1, 2, 19]) → " + no9(new ArrayList<>(List.of(1, 2, 19))));
		System.out.println("no9([9, 19, 29, 3]) → " + no9(new ArrayList<>(List.of(9, 19, 29, 3))));
		System.out.println("no9([1, 2, 3]) → " + no9(new ArrayList<>(List.of(1, 2, 3))));
		System.out.println("no9([45, 99, 90, 28, 13, 999, 0]) → " + no9(new ArrayList<>(List.of(45, 99, 90, 28, 13, 999, 0))));
		System.out.println("no9([1, 2, 3]) → " + no9(new ArrayList<>(List.of(1, 2, 3))));
		System.out.println("no9([45, 99, 90, 28, 13, 999, 0]) → " + no9(new ArrayList<>(List.of(45, 99, 90, 28, 13, 999, 0))));
		System.out.println("no9([]) → " + no9(new ArrayList<>(List.of())));
		System.out.println("no9([9]) → " + no9(new ArrayList<>(List.of(9))));
		System.out.println("no9([0, 9, 0]) → " + no9(new ArrayList<>(List.of(0, 9, 0))));
		printFunction("noTeen");
		System.out.println("noTeen([12, 13, 19, 20]) → " + noTeen(new ArrayList<>(List.of(12, 13, 19, 20))));
		System.out.println("noTeen([1, 14, 1]) → " + noTeen(new ArrayList<>(List.of(1, 14, 1))));
		System.out.println("noTeen([15]) → " + noTeen(new ArrayList<>(List.of(15))));
		System.out.println("noTeen([-15]) → " + noTeen(new ArrayList<>(List.of(-15))));
		System.out.println("noTeen([]) → " + noTeen(new ArrayList<>(List.of())));
		System.out.println("noTeen([0, 1, 2, -3]) → " + noTeen(new ArrayList<>(List.of(0, 1, 2, -3))));
		System.out.println("noTeen([15, 17, 19, 21, 19]) → " + noTeen(new ArrayList<>(List.of(15, 17, 19, 21, 19))));
		System.out.println("noTeen([-16, 2, 15, 3, 16, 25]) → " + noTeen(new ArrayList<>(List.of(-16, 2, 15, 3, 16, 25))));
		printFunction("noZ");
		System.out.println("noZ([\"aaa\", \"bbb\", \"aza\"]) → " + toStringStringList(noZ(new ArrayList<>(List.of("aaa", "bbb", "aza")))));
		System.out.println("noZ([\"hziz\", \"hzello\", \"hi\"]) → " + toStringStringList(noZ(new ArrayList<>(List.of("hziz", "hello", "hi")))));
		System.out.println("noZ([\"hello\", \"howz\", \"are\", \"youz\"]) → " + toStringStringList(noZ(new ArrayList<>(List.of("hello", "are", "youz")))));
		System.out.println("noZ([]) → " + toStringStringList(noZ(new ArrayList<>(List.of()))));
		System.out.println("noZ([\"\"]) → " + toStringStringList(noZ(new ArrayList<>(List.of("")))));
		System.out.println("noZ([\"x\", \"y\", \"z\"]) → " + toStringStringList(noZ(new ArrayList<>(List.of("x", "y", "z")))));
		printFunction("noLong");
		System.out.println("noLong([\"this\", \"not\", \"too\", \"long\"]) → " + toStringStringList(noLong(new ArrayList<>(List.of("this", "not", "too", "long")))));
		System.out.println("noLong([\"a\", \"bbb\", \"cccc\"]) → " + toStringStringList(noLong(new ArrayList<>(List.of("a", "bbb", "cccc")))));
		System.out.println("noLong([\"cccc\", \"cccc\", \"cccc\"]) → " + toStringStringList(noLong(new ArrayList<>(List.of("cccc", "cccc", "cccc")))));
		System.out.println("noLong([]) → " + toStringStringList(noLong(new ArrayList<>(List.of()))));
		System.out.println("noLong([\"\"]) → " + toStringStringList(noLong(new ArrayList<>(List.of("")))));
		System.out.println("noLong([\"empty\", \"\", \"empty\"]) → " + toStringStringList(noLong(new ArrayList<>(List.of("empty", "", "empty")))));
		System.out.println("noLong([\"a\"]) → " + toStringStringList(noLong(new ArrayList<>(List.of("a")))));
		System.out.println("noLong([\"aaaa\", \"bbb\", \"***\", \"333\"]) → " + toStringStringList(noLong(new ArrayList<>(List.of("aaaa", "bbb", "***", "333")))));
		printFunction("no34");
		System.out.println("no34([\"a\", \"bb\", \"ccc\"]) → " + toStringStringList(no34(new ArrayList<>(List.of("a", "bb", "ccc")))));
		System.out.println("no34([\"a\", \"bb\", \"ccc\", \"dddd\"]) → " + toStringStringList(no34(new ArrayList<>(List.of("a", "bb", "ccc", "dddd")))));
		System.out.println("no34([\"ccc\", \"dddd\", \"apple\"]) → " + toStringStringList(no34(new ArrayList<>(List.of("ccc", "dddd", "apple")))));
		System.out.println("no34([\"this\", \"not\", \"too\", \"long\"]) → " + toStringStringList(no34(new ArrayList<>(List.of("this", "not", "too", "long")))));
		System.out.println("no34([\"a\", \"bbb\", \"cccc\", \"xx\"]) → " + toStringStringList(no34(new ArrayList<>(List.of("a", "bbb", "cccc", "xx")))));
		System.out.println("no34([\"dddd\", \"ddd\", \"xxxxxxx\"]) → " + toStringStringList(no34(new ArrayList<>(List.of("dddd", "ddd", "xxxxxxx")))));
		System.out.println("no34([]) → " + toStringStringList(no34(new ArrayList<>(List.of()))));
		System.out.println("no34([\"\"]) → " + toStringStringList(no34(new ArrayList<>(List.of("")))));
		System.out.println("no34([\"empty\", \"\", \"empty\"]) → " + toStringStringList(no34(new ArrayList<>(List.of("empty", "", "empty")))));
		System.out.println("no34([\"a\"]) → " + no34(new ArrayList<>(List.of("a"))));
		System.out.println("no34([\"aaaa\", \"bbb\", \"*****\", \"333\"]) → " + no34(new ArrayList<>(List.of("aaaa", "bbb", "*****", "333"))));
		printFunction("noYY");
		System.out.println("noYY([\"a\", \"b\", \"c\"]) → " + toStringStringList(noYY(new ArrayList<>(List.of("a", "b", "c")))));
		System.out.println("noYY([\"a\", \"b\", \"cy\"]) → " + toStringStringList(noYY(new ArrayList<>(List.of("a", "b", "cy")))));
		System.out.println("noYY([\"xx\", \"ya\", \"zz\"]) → " + toStringStringList(noYY(new ArrayList<>(List.of("xx", "ya", "zz")))));
		System.out.println("noYY([\"xx\", \"yay\", \"zz\"]) → " + toStringStringList(noYY(new ArrayList<>(List.of("xx", "yay", "zz")))));
		System.out.println("noYY([\"yyx\", \"y\", \"zzz\"]) → " + toStringStringList(noYY(new ArrayList<>(List.of("yyx", "y", "zzz")))));
		System.out.println("noYY([\"hello\", \"there\"]) → " + toStringStringList(noYY(new ArrayList<>(List.of("hello", "there")))));
		System.out.println("noYY([\"ya\"]) → " + toStringStringList(noYY(new ArrayList<>(List.of("ya")))));
		System.out.println("noYY([]) → " + toStringStringList(noYY(new ArrayList<>(List.of()))));
		System.out.println("noYY([\"\"]) → " + toStringStringList(noYY(new ArrayList<>(List.of("")))));
		System.out.println("noYY([\"xx\", \"yy\", \"zz\"]) → " + toStringStringList(noYY(new ArrayList<>(List.of("xx", "yy", "zz")))));
		printFunction("two2");
		System.out.println("two2([1, 2, 3]) → " + two2(new ArrayList<>(List.of(1, 2, 3))));
		System.out.println("two2([2, 6, 11]) → " + two2(new ArrayList<>(List.of(2, 6, 11))));
		System.out.println("two2([0]) → " + two2(new ArrayList<>(List.of(0))));
		System.out.println("two2([]) → " + two2(new ArrayList<>(List.of())));
		System.out.println("two2([1, 11, 111, 16]) → " + two2(new ArrayList<>(List.of(1, 11, 111, 16))));
		System.out.println("two2([2, 3, 5, 7, 11]) → " + two2(new ArrayList<>(List.of(2, 3, 5, 7, 11))));
		System.out.println("two2([3, 1, 4, 1, 6, 99, 0]) → " + two2(new ArrayList<>(List.of(3, 1, 4, 1, 6, 99, 0))));
		printFunction("square56");
		System.out.println("square56([3, 1, 4]) → " + square56(new ArrayList<>(List.of(3, 1, 4))));
		System.out.println("square56([1]) → " + square56(new ArrayList<>(List.of(1))));
		System.out.println("square56([2]) → " + square56(new ArrayList<>(List.of(2))));
		System.out.println("square56([3]) → " + square56(new ArrayList<>(List.of(3))));
		System.out.println("square56([4]) → " + square56(new ArrayList<>(List.of(4))));
		System.out.println("square56([5]) → " + square56(new ArrayList<>(List.of(5))));
		System.out.println("square56([6]) → " + square56(new ArrayList<>(List.of(6))));
		System.out.println("square56([7]) → " + square56(new ArrayList<>(List.of(7))));
		System.out.println("square56([1, 2, 3, 4, 5, 6, 7]) → " + square56(new ArrayList<>(List.of(1, 2, 3, 4, 5, 6, 7))));
		System.out.println("square56([3, -1, -4, 1, 5, 9]) → " + square56(new ArrayList<>(List.of(3, -1, -4, 1, 5, 9))));
	}
}
