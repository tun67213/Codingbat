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
		throw new UnsupportedOperationException("Not supported yet.");
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
		throw new UnsupportedOperationException("Not supported yet.");
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
		throw new UnsupportedOperationException("Not supported yet.");
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
		throw new UnsupportedOperationException("Not supported yet.");
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
		throw new UnsupportedOperationException("Not supported yet.");
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
		welcome();
		printFunction("doubling");
		System.out.println("doubling([1, 2, 3]) → " + doubling(new ArrayList<>(List.of(1, 2, 3))));
		System.out.println("doubling([6, 8, 6, 8, -1]) → " + doubling(new ArrayList<>(List.of(6, 8, 6, 8, -1))));
		System.out.println("doubling([]) → " + doubling(new ArrayList<>(List.of())));
		System.out.println("doubling([5]) → " + doubling(new ArrayList<>(List.of(5))));
		System.out.println("doubling([5, 10]) → " + doubling(new ArrayList<>(List.of(5, 10))));
		System.out.println("doubling([8, -5, 7, 3, 109]) → " + doubling(new ArrayList<>(List.of(8, -5, 7, 3, 109))));
		System.out.println("doubling([6, -3, 12, 23, 4, 1, 19, 11, 2, 3, 2]) → " + doubling(new ArrayList<>(List.of(6, -3, 12, 23, 4, 1, 19, 11, 2, 3, 2))));
		System.out.println("doubling([3, 1, 4, 1, 5, 9]) → " + doubling(new ArrayList<>(List.of(3, 1, 4, 1, 5, 9))));
		printFunction("square");
		System.out.println("square([1, 2, 3]) → " + square(new ArrayList<>(List.of(1, 2, 3))));
		System.out.println("square([6, 8, -6, -8, 1]) → " + square(new ArrayList<>(List.of(6, 8, 6, 8, -1))));
		System.out.println("square([]) → " + square(new ArrayList<>(List.of())));
		System.out.println("square([12]) → " + square(new ArrayList<>(List.of(12))));
		System.out.println("square([5, 10]) → " + square(new ArrayList<>(List.of(5, 10))));
		System.out.println("square([6, -3, 12, 23, 4, 1, 19, 11, 2, 3, 2]) → " + square(new ArrayList<>(List.of(6, -3, 12, 23, 4, 1, 19, 11, 2, 3, 2))));
		printFunction("addStar");
		System.out.println("addStar([\"a\", \"bb\", \"ccc\"]) → " + toStringStringList(addStar(List.of("a", "bb", "ccc"))));
		System.out.println("addStar([\"hello\", \"there\"]) → " + toStringStringList(addStar(List.of("hello", "there"))));
		System.out.println("addStar([\"*\"]) → " + toStringStringList(addStar(List.of("*"))));
		System.out.println("addStar([]) → " + toStringStringList(addStar(List.of())));
		System.out.println("addStar([\"kittens\", \"and\", \"chocolate\", \"and\"]) → " + toStringStringList(addStar(List.of("kittens", "and", "chocolate", "and"))));
		System.out.println("addStar([\"empty\", \"string\", \"\"]) → " + toStringStringList(addStar(List.of("empty", "string", ""))));
		printFunction("copies3");
		System.out.println("copies3([\"a\", \"bb\", \"ccc\"]) → " + toStringStringList(copies3(List.of("a", "bb", "ccc"))));
		System.out.println("copies3([\"24\", \"a\", \"\"]) → " + toStringStringList(copies3(List.of("24", "a", ""))));
		System.out.println("copies3([\"hello\", \"there\"]) → " + toStringStringList(copies3(List.of("hello", "there"))));
		System.out.println("copies3([\"no\"]) → " + toStringStringList(copies3(List.of("no"))));
		System.out.println("copies3([]) → " + toStringStringList(copies3(List.of())));
		System.out.println("copies3([\"this\", \"and\", \"that\", \"and\"]) → " + toStringStringList(copies3(List.of("this", "and", "that", "and"))));
		printFunction("moreY");
		System.out.println("moreY([\"a\", \"b\", \"c\"]) → " + toStringStringList(moreY(List.of("a", "b", "c"))));
		System.out.println("moreY([\"hello\", \"there\"]) → " + toStringStringList(moreY(List.of("hello", "there"))));
		System.out.println("moreY([\"yay\"]) → " + toStringStringList(moreY(List.of("yay"))));
		System.out.println("moreY([\"\", \"a\", \"xx\"]) → " + toStringStringList(moreY(List.of("", "a", "xx"))));
		System.out.println("moreY([]) → " + toStringStringList(moreY(List.of())));
		System.out.println("moreY([\"xx\", \"yy\", \"zz\"]) → " + toStringStringList(moreY(List.of("xx", "yy", "zz"))));
	}
}
