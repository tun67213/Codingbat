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
		throw new UnsupportedOperationException("Not supported yet.");
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
		throw new UnsupportedOperationException("Not supported yet.");
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
		throw new UnsupportedOperationException("Not supported yet.");
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
		throw new UnsupportedOperationException("Not supported yet.");
	}

	/**
	 * @param args commandline arguments
	 */
	public void main(String[] args)
	{
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
	}
}
