package com.arvindhvelrajan;

import static com.arvindhvelrajan.UI_Functions.*;

/**
 * @author arvindhvelrajan
 * @code This class is to demonstrate the implementation for all functions in Recursion_2 from codingbat.com
 */
public class Recursion_2
{
	private void welcome()
	{
		System.out.println("\n\nRecursion-2 Functions\n");
	}

	/**
	 * Given an array of ints, is it possible to choose a group of some of the ints, such that the group sums to the
	 * given target? This is a classic backtracking recursion problem. Once you understand the recursive backtracking
	 * strategy in this problem, you can use the same pattern for many problems to search a space of choices.
	 * Rather than looking at the whole array, our convention is to consider the part of the array starting at index
	 * start and continuing to the end of the array. The caller can specify the whole array simply by passing start as 0.
	 * No loops are needed -- the recursive calls progress down the array.
	 *
	 * groupSum(0, [2, 4, 8], 10) → true
	 * groupSum(0, [2, 4, 8], 14) → true
	 * groupSum(0, [2, 4, 8], 9) → false
	 */
	public boolean groupSum(int start, int[] nums, int target)
	{
		throw new UnsupportedOperationException("Not supported yet.");
	}

	/**
	 * Given an array of ints, is it possible to choose a group of some of the ints, beginning at the start index, such
	 * that the group sums to the given target? However, with the additional constraint that all 6's must be chosen.
	 * (No loops needed.)
	 *
	 * groupSum6(0, [5, 6, 2], 8) → true
	 * groupSum6(0, [5, 6, 2], 9) → false
	 * groupSum6(0, [5, 6, 2], 7) → false
	 */
	public boolean groupSum6(int start, int[] nums, int target)
	{
		throw new UnsupportedOperationException("Not supported yet.");
	}

	/**
	 * @param args commandline arguments
	 */
	public void main(String[] args)
	{
		welcome();
		printFunction("groupSum");
		System.out.println("groupSum(0, [2, 4, 8], 10) → " + groupSum(0, new int[] {2, 4, 8}, 10));
		System.out.println("groupSum(0, [2, 4, 8], 14) → " + groupSum(0, new int[] {2, 4, 8}, 14));
		System.out.println("groupSum(0, [2, 4, 8], 9) → " + groupSum(0, new int[] {2, 4, 8}, 9));
		System.out.println("groupSum(0, [2, 4, 8], 8) → " + groupSum(0, new int[] {2, 4, 8}, 8));
		System.out.println("groupSum(1, [2, 4, 8], 8) → " + groupSum(1, new int[] {2, 4, 8}, 8));
		System.out.println("groupSum(1, [2, 4, 8], 2) → " + groupSum(1, new int[] {2, 4, 8}, 2));
		System.out.println("groupSum(0, [1], 1) → " + groupSum(0, new int[] {1}, 1));
		System.out.println("groupSum(0, [9], 1) → " + groupSum(0, new int[] {9}, 1));
		System.out.println("groupSum(1, [9], 0) → " + groupSum(1, new int[] {9}, 0));
		System.out.println("groupSum(0, [], 0) → " + groupSum(0, new int[] {0}, 0));
		System.out.println("groupSum(0, [10, 2, 2, 5], 17) → " + groupSum(0, new int[] {10, 2, 2, 5}, 17));
		System.out.println("groupSum(0, [10, 2, 2, 5], 15) → " + groupSum(0, new int[] {10, 2, 2, 5}, 15));
		System.out.println("groupSum(0, [10, 2, 2, 5], 9) → " + groupSum(0, new int[] {10, 2, 2, 5}, 9));
	}
}
