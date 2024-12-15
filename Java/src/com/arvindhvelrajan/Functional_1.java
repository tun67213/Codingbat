package com.arvindhvelrajan;

import static com.arvindhvelrajan.UI_Functions.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author arvindhvelrajan
 * @code This class is to demonstrate the implementation for all functions in Functional_1 from codingbat.com
 */
public class Functional_1
{
	private void welcome()
	{
		System.out.println("\n\nFunctional-1 Functions\n");
	}

	/**
	 * Given a list of integers, return a list where each integer is multiplied by 2.
	 *
	 * doubling([1, 2, 3]) → [2, 4, 6]
	 * doubling([6, 8, 6, 8, -1]) → [12, 16, 12, 16, -2]
	 * doubling([]) → []
	 */
	public List<Integer> doubling(List<Integer> nums)
	{
		nums.replaceAll(num -> num * 2);
		return nums;
	}

	/**
	 * Given a list of integers, return a list where each integer is multiplied with itself.
	 *
	 * square([1, 2, 3]) → [1, 4, 9]
	 * square([6, 8, -6, -8, 1]) → [36, 64, 36, 64, 1]
	 * square([]) → []
	 */
	public List<Integer> square(List<Integer> nums)
	{
		nums.replaceAll(num -> num * num);
		return nums;
	}

	/**
	 * Given a list of strings, return a list where each string has "*" added at its end.
	 *
	 * addStar(["a", "bb", "ccc"]) → ["a*", "bb*", "ccc*"]
	 * addStar(["hello", "there"]) → ["hello*", "there*"]
	 * addStar(["*"]) → ["**"]
	 */
	public List<String> addStar(List<String> strings)
	{
		strings.replaceAll(str -> str + "*");
		return strings;
	}

	/**
	 * Given a list of strings, return a list where each string is replaced by 3 copies of the string concatenated together.
	 *
	 * copies3(["a", "bb", "ccc"]) → ["aaa", "bbbbbb", "ccccccccc"]
	 * copies3(["24", "a", ""]) → ["242424", "aaa", ""]
	 * copies3(["hello", "there"]) → ["hellohellohello", "theretherethere"]
	 */
	public List<String> copies3(List<String> strings)
	{
		strings.replaceAll(str -> str + str + str);
		return strings;
	}

	/**
	 * Given a list of strings, return a list where each string has "y" added at its start and end.
	 *
	 * moreY(["a", "b", "c"]) → ["yay", "yby", "ycy"]
	 * moreY(["hello", "there"]) → ["yhelloy", "ytherey"]
	 * moreY(["yay"]) → ["yyayy"]
	 */
	public List<String> moreY(List<String> strings)
	{
		strings.replaceAll(str -> "y" + str + "y");
		return strings;
	}

	/**
	 * Given a list of integers, return a list where each integer is added to 1 and the result is multiplied by 10.
	 *
	 * math1([1, 2, 3]) → [20, 30, 40]
	 * math1([6, 8, 6, 8, 1]) → [70, 90, 70, 90, 20]
	 * math1([10]) → [110]
	 */
	public List<Integer> math1(List<Integer> nums)
	{
		nums.replaceAll(num -> (num + 1) * 10);
		return nums;
	}

	/**
	 * Given a list of non-negative integers, return an integer list of the rightmost digits. (Note: use %)
	 *
	 * rightDigit([1, 22, 93]) → [1, 2, 3]
	 * rightDigit([16, 8, 886, 8, 1]) → [6, 8, 6, 8, 1]
	 * rightDigit([10, 0]) → [0, 0]
	 */
	public List<Integer> rightDigit(List<Integer> nums)
	{
		nums.replaceAll(num -> num % 10);
		return nums;
	}

	/**
	 * Given a list of strings, return a list where each string is converted to lower case
	 * (Note: String toLowerCase() method).
	 *
	 * lower(["Hello", "Hi"]) → ["hello", "hi"]
	 * lower(["AAA", "BBB", "ccc"]) → ["aaa", "bbb", "ccc"]
	 * lower(["KitteN", "ChocolaTE"]) → ["kitten", "chocolate"]
	 */
	public List<String> lower(List<String> strings)
	{
		strings.replaceAll(str -> str.toLowerCase());
		return strings;
	}

	/**
	 * Given a list of strings, return a list where each string has all its "x" removed.
	 *
	 * noX(["ax", "bb", "cx"]) → ["a", "bb", "c"]
	 * noX(["xxax", "xbxbx", "xxcx"]) → ["a", "bb", "c"]
	 * noX(["x"]) → [""]
	 */
	public List<String> noX(List<String> strings)
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
				buff.append(", ");
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
		printFunction("doubling");
		System.out.println("doubling([1, 2, 3]) → " + doubling(new ArrayList<>(Arrays.asList(1, 2, 3))));
		System.out.println("doubling([6, 8, 6, 8, -1]) → " + doubling(new ArrayList<>(Arrays.asList(6, 8, 6, 8, -1))));
		System.out.println("doubling([]) → " + doubling(new ArrayList<>(Arrays.asList())));
		System.out.println("doubling([5]) → " + doubling(new ArrayList<>(Arrays.asList(5))));
		System.out.println("doubling([5, 10]) → " + doubling(new ArrayList<>(Arrays.asList(5, 10))));
		System.out.println("doubling([8, -5, 7, 3, 109]) → " + doubling(new ArrayList<>(Arrays.asList(8, -5, 7, 3, 109))));
		System.out.println("doubling([6, -3, 12, 23, 4, 1, 19, 11, 2, 3, 2]) → " + doubling(new ArrayList<>(Arrays.asList(6, -3, 12, 23, 4, 1, 19, 11, 2, 3, 2))));
		System.out.println("doubling([3, 1, 4, 1, 5, 9]) → " + doubling(new ArrayList<>(Arrays.asList(3, 1, 4, 1, 5, 9))));
		printFunction("square");
		System.out.println("square([1, 2, 3]) → " + square(new ArrayList<>(Arrays.asList(1, 2, 3))));
		System.out.println("square([6, 8, -6, -8, 1]) → " + square(new ArrayList<>(Arrays.asList(6, 8, 6, 8, -1))));
		System.out.println("square([]) → " + square(new ArrayList<>(Arrays.asList())));
		System.out.println("square([12]) → " + square(new ArrayList<>(Arrays.asList(12))));
		System.out.println("square([5, 10]) → " + square(new ArrayList<>(Arrays.asList(5, 10))));
		System.out.println("square([6, -3, 12, 23, 4, 1, 19, 11, 2, 3, 2]) → " + square(new ArrayList<>(Arrays.asList(6, -3, 12, 23, 4, 1, 19, 11, 2, 3, 2))));
		printFunction("addStar");
		System.out.println("addStar([\"a\", \"bb\", \"ccc\"]) → " + toStringStringList(addStar(new ArrayList<>(Arrays.asList("a", "bb", "ccc")))));
		System.out.println("addStar([\"hello\", \"there\"]) → " + toStringStringList(addStar(new ArrayList<>(Arrays.asList("hello", "there")))));
		System.out.println("addStar([\"*\"]) → " + toStringStringList(addStar(new ArrayList<>(Arrays.asList("*")))));
		System.out.println("addStar([]) → " + toStringStringList(addStar(new ArrayList<>())));
		System.out.println("addStar([\"kittens\", \"and\", \"chocolate\", \"and\"]) → " + toStringStringList(addStar(new ArrayList<>(Arrays.asList("kittens", "and", "chocolate", "and")))));
		System.out.println("addStar([\"empty\", \"string\", \"\"]) → " + toStringStringList(addStar(new ArrayList<>(Arrays.asList("empty", "string", "")))));
		printFunction("copies3");
		System.out.println("copies3([\"a\", \"bb\", \"ccc\"]) → " + toStringStringList(copies3(Arrays.asList("a", "bb", "ccc"))));
		System.out.println("copies3([\"24\", \"a\", \"\"]) → " + toStringStringList(copies3(Arrays.asList("24", "a", ""))));
		System.out.println("copies3([\"hello\", \"there\"]) → " + toStringStringList(copies3(Arrays.asList("hello", "there"))));
		System.out.println("copies3([\"no\"]) → " + toStringStringList(copies3(Arrays.asList("no"))));
		System.out.println("copies3([]) → " + toStringStringList(copies3(Arrays.asList())));
		System.out.println("copies3([\"this\", \"and\", \"that\", \"and\"]) → " + toStringStringList(copies3(Arrays.asList("this", "and", "that", "and"))));
		printFunction("moreY");
		System.out.println("moreY([\"a\", \"b\", \"c\"]) → " + toStringStringList(moreY(Arrays.asList("a", "b", "c"))));
		System.out.println("moreY([\"hello\", \"there\"]) → " + toStringStringList(moreY(Arrays.asList("hello", "there"))));
		System.out.println("moreY([\"yay\"]) → " + toStringStringList(moreY(Arrays.asList("yay"))));
		System.out.println("moreY([\"\", \"a\", \"xx\"]) → " + toStringStringList(moreY(Arrays.asList("", "a", "xx"))));
		System.out.println("moreY([]) → " + toStringStringList(moreY(Arrays.asList())));
		System.out.println("moreY([\"xx\", \"yy\", \"zz\"]) → " + toStringStringList(moreY(Arrays.asList("xx", "yy", "zz"))));
		printFunction("math1");
		System.out.println("math1([1, 2, 3]) → " + math1(Arrays.asList(1, 2, 3)));
		System.out.println("math1[6, 8, 6, 8, 1]) → " + math1(Arrays.asList(6, 8, 6, 8, 1)));
		System.out.println("math1([10]) → " + math1(Arrays.asList(10)));
		System.out.println("math1([]) → " + math1(Arrays.asList()));
		System.out.println("math1([5, 10]) → " + math1(Arrays.asList(5, 10)));
		System.out.println("math1([-1, -2, -3, -2, -1]) → " + math1(Arrays.asList(-1, -2, -3, -2, -1)));
		System.out.println("math1([6, -3, 12, 23, 4, 1, 19, 11, 2, 3, 2]) → " + math1(Arrays.asList(6, -3, 12, 23, 4, 1, 19, 11, 2, 3, 2)));
		printFunction("rightDigit");
		System.out.println("rightDigit([1, 22, 93]) → " + rightDigit(Arrays.asList(1, 22, 93)));
		System.out.println("rightDigit([16, 8, 886, 8, 1]) → " + rightDigit(Arrays.asList(16, 8, 886, 8, 1)));
		System.out.println("rightDigit([10, 0]) → " + rightDigit(Arrays.asList(10, 0)));
		System.out.println("rightDigit([]) → " + rightDigit(Arrays.asList()));
		System.out.println("rightDigit([5, 10]) → " + rightDigit(Arrays.asList(5, 10)));
		System.out.println("rightDigit([5, 50, 500, 5000, 5000]) → " + rightDigit(Arrays.asList(5, 50, 500, 5000, 5000)));
		System.out.println("rightDigit([6, 23, 12, 23, 4, 1, 19, 1119, 2, 3, 2]) → " + rightDigit(Arrays.asList(6, 23, 12, 23, 4, 1, 19, 1119, 2, 3, 2)));
		printFunction("lower");
		System.out.println("lower([\"Hello\", \"Hi\"]) → " + toStringStringList(lower(Arrays.asList("Hello", "Hi"))));
		System.out.println("lower([\"AAA\", \"BBB\", \"ccc\"]) → " + toStringStringList(lower(Arrays.asList("AAA", "BBB", "ccc"))));
		System.out.println("lower([\"KitteN\", \"ChocolaTE\"]) → " + toStringStringList(lower(Arrays.asList("KitteN", "ChocolaTE"))));
		System.out.println("lower([]) → " + toStringStringList(lower(Arrays.asList())));
		System.out.println("lower([\"EMPTY\", \"\"]) → " + toStringStringList(lower(Arrays.asList("EMPTY", ""))));
		System.out.println("lower([\"aaX\", \"bYb\", \"Ycc\", \"ZZZ\"]) → " +  toStringStringList(lower(Arrays.asList("aaX", "bYb", "Ycc", "ZZZ"))));
		printFunction("noX");
		System.out.println("noX([\"ax\", \"bb\", \"cx\"]) → " + toStringStringList(noX(Arrays.asList("ax", "bb", "cx"))));
		System.out.println("noX([\"xxax\", \"xbxbx\", \"xxcx\"]) → " + toStringStringList(noX(Arrays.asList("xxax", "xbxbx", "xxcx"))));
		System.out.println("noX([\"x\"]) → " + toStringStringList(noX(Arrays.asList("x"))));
		System.out.println("noX([\"\"]) → " + toStringStringList(noX(Arrays.asList(""))));
		System.out.println("noX([]) → " + toStringStringList(noX(Arrays.asList())));
		System.out.println("noX([\"the\", \"taxi\"]) → " + toStringStringList(noX(Arrays.asList("the", "taxi"))));
		System.out.println("noX([\"the\", \"xxtxaxixxx\"]) → " + toStringStringList(noX(Arrays.asList("the", "xxtxaxixxx"))));
		System.out.println("noX([\"this\", \"is\", \"the\", \"x\"]) → " + toStringStringList(noX(Arrays.asList("this", "is", "the", "x"))));
	}
}
