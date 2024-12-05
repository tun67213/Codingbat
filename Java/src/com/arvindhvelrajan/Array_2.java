package com.arvindhvelrajan;

import static com.arvindhvelrajan.UI_Functions.*;

/**
 * @author arvindhvelrajan
 * @code This class is to demonstrate the implementation for all functions in Array-2 from codingbat.com
 */
public class Array_2
{
	/**
	 * This function introduces the user to the class that is being demonstrated.
	 */
	private void welcome()
	{
		System.out.println("\n\nArray-2 Functions\n");
	}

	/**
	 * Return the number of even ints in the given array.
	 * Note: the % "mod" operator computes the remainder, e.g. 5 % 2 is 1.
	 *
	 * countEvens([2, 1, 2, 3, 4]) → 3
	 * countEvens([2, 2, 0]) → 3
	 * countEvens([1, 3, 5]) → 0
	 */
	public int countEvens(int[] nums)
	{
		throw new UnsupportedOperationException("Not supported yet.");
	}

	/**
	 * Given an array length 1 or more of ints, return the difference between the largest and smallest values in the array.
	 * Note: the built-in Math.min(v1, v2) and Math.max(v1, v2) methods return the smaller or larger of two values.
	 *
	 * bigDiff([10, 3, 5, 6]) → 7
	 * bigDiff([7, 2, 10, 9]) → 8
	 * bigDiff([2, 10, 7, 2]) → 8
	 */
	public int bigDiff(int[] nums)
	{
		throw new UnsupportedOperationException("Not supported yet.");
	}

	/**
	 * Return the "centered" average of an array of ints, which we'll say is the mean average of the values, except
	 * ignoring the largest and smallest values in the array. If there are multiple copies of the smallest value, ignore
	 * just one copy, and likewise for the largest value. Use int division to produce the final average.
	 * You may assume that the array is length 3 or more.
	 *
	 * centeredAverage([1, 2, 3, 4, 100]) → 3
	 * centeredAverage([1, 1, 5, 5, 10, 8, 7]) → 5
	 * centeredAverage([-10, -4, -2, -4, -2, 0]) → -3
	 */
	public int centeredAverage(int[] nums)
	{
		throw new UnsupportedOperationException("Not supported yet.");
	}

	/**
	 * @param args commandline arguments
	 */
	public void main(String[] args)
	{
		welcome();
		printFunction("countEvens");
		System.out.println("countEvens([2, 1, 2, 3, 4]) → " + countEvens(new int[] {2, 1, 2 ,3, 4}));
		System.out.println("countEvens([2, 2, 0]) → " + countEvens(new int[] {2, 2, 0}));
		System.out.println("countEvens([1, 3, 5]) → " + countEvens(new int[] {1, 3, 5}));
		System.out.println("countEvens([]) → " + countEvens(new int[] {}));
		System.out.println("countEvens([11, 9, 0, 1]) → " + countEvens(new int[] {11, 9, 0, 1}));
		System.out.println("countEvens([2, 11, 9, 0]) → " + countEvens(new int[] {2, 11, 9, 0}));
		System.out.println("countEvens([2]) → " + countEvens(new int[] {2}));
		System.out.println("countEvens([2, 5, 12]) → " + countEvens(new int[] {2, 5, 12}));
		printFunction("bigDiff");
		System.out.println("bigDiff([10, 3, 5, 6]) → " + bigDiff(new int[] {10, 3, 5, 6}));
		System.out.println("bigDiff([7, 2, 10, 9]) → " + bigDiff(new int[] {7, 2, 10, 9}));
		System.out.println("bigDiff([2, 10, 7, 2]) → " + bigDiff(new int[] {2, 10, 7, 2}));
		System.out.println("bigDiff([bigDiff([2, 10]) → " + bigDiff(new int[] {2, 10}));
		System.out.println("bigDiff([10, 2]) → " + bigDiff(new int[] {10, 2}));
		System.out.println("bigDiff([10, 0]) → " + bigDiff(new int[] {10, 0}));
		System.out.println("bigDiff([2, 3]) → " + bigDiff(new int[] {2, 3}));
		System.out.println("bigDiff([2, 2]) → " + bigDiff(new int[] {2, 2}));
		System.out.println("bigDiff([2]) → " + bigDiff(new int[] {2}));
		System.out.println("bigDiff([5, 1, 6, 1, 9, 9]) → " + bigDiff(new int[] {5, 1, 6, 1, 9, 9}));
		System.out.println("bigDiff([7, 6, 8, 5]) → " + bigDiff(new int[] {7, 6, 8, 5}));
		System.out.println("bigDiff([7, 7, 6, 8, 5, 5, 6]) → " + bigDiff(new int[] {7, 7, 6, 8, 5, 5, 6}));
	}
}
