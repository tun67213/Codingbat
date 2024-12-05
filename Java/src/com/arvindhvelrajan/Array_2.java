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
	 * Return the sum of the numbers in the array, returning 0 for an empty array. Except the number 13 is very unlucky,
	 * so it does not count and numbers that come immediately after a 13 also do not count.
	 *
	 * sum13([1, 2, 2, 1]) → 6
	 * sum13([1, 1]) → 2
	 * sum13([1, 2, 2, 1, 13]) → 6
	 */
	public int sum13(int[] nums)
	{
		throw new UnsupportedOperationException("Not supported yet.");
	}

	/**
	 * Return the sum of the numbers in the array, except ignore sections of numbers starting with a 6 and extending to
	 * the next 7 (every 6 will be followed by at least one 7). Return 0 for no numbers.
	 *
	 * sum67([1, 2, 2]) → 5
	 * sum67([1, 2, 2, 6, 99, 99, 7]) → 5
	 * sum67([1, 1, 6, 7, 2]) → 4
	 */
	public int sum67(int[] nums)
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
		printFunction("centeredAverage");
		System.out.println("centeredAverage([1, 2, 3, 4, 100]) → " + centeredAverage(new int[] {1, 2, 3, 4, 100}));
		System.out.println("centeredAverage([1, 1, 5, 5, 10, 8, 7]) → " + centeredAverage(new int[] {1, 1, 5, 5, 10, 8, 7}));
		System.out.println("centeredAverage([-10, -4, -2, -4, -2, 0]) → " + centeredAverage(new int[] {-10, -4, -2, -4, -2, 0}));
		System.out.println("centeredAverage([5, 3, 4, 6, 2]) → " + centeredAverage(new int[] {5, 3, 4, 6, 2}));
		System.out.println("centeredAverage([5, 3, 4, 0, 100]) → " + centeredAverage(new int[] {5, 3, 4, 0, 100}));
		System.out.println("centeredAverage([100, 0, 5, 3, 4]) → " + centeredAverage(new int[] {100, 0, 5, 3, 4}));
		System.out.println("centeredAverage([4, 0, 100]) → " + centeredAverage(new int[] {4, 0, 100}));
		System.out.println("centeredAverage([0, 2, 3, 4, 100]) → " + centeredAverage(new int[] {0, 2, 3, 4, 100}));
		System.out.println("centeredAverage([1, 1, 100]) → " + centeredAverage(new int[] {1, 1, 100}));
		System.out.println("centeredAverage([7, 7, 7]) → " + centeredAverage(new int[] {7, 7, 7}));
		System.out.println("centeredAverage([1, 7, 8]) → " + centeredAverage(new int[] {1, 7, 8}));
		System.out.println("centeredAverage([1, 1, 99, 99]) → " + centeredAverage(new int[] {1, 1, 99, 99}));
		System.out.println("centeredAverage([1000, 0, 1, 99]) → " + centeredAverage(new int[] {1000, 0, 1, 99}));
		System.out.println("centeredAverage([4, 4, 4, 4, 5]) → " + centeredAverage(new int[] {4, 4, 4, 4, 5}));
		System.out.println("centeredAverage([4, 4, 4, 1, 5]) → " + centeredAverage(new int[] {4, 4, 4, 1, 5}));
		System.out.println("centeredAverage([6, 4, 8, 12, 3]) → " + centeredAverage(new int[] {6, 4, 8, 12, 3}));
		printFunction("sum13");
		System.out.println("sum13([1, 2, 2, 1]) → " + sum13(new int[] {1, 2, 2, 1}));
		System.out.println("sum13([1, 1]) → " + sum13(new int[] {1, 1}));
		System.out.println("sum13([1, 2, 2, 1, 13]) → " + sum13(new int[] {1, 2, 2, 1, 13}));
		System.out.println("sum13([1, 2, 13, 2, 1, 13]) → " + sum13(new int[] {1, 2, 13, 2, 1, 13}));
		System.out.println("sum13([13, 1, 2, 13, 2, 1, 13]) → " + sum13(new int[] {13, 1, 2, 13, 2, 1, 13}));
		System.out.println("sum13([]) → " + sum13(new int[] {}));
		System.out.println("sum13([13]) → " + sum13(new int[] {13}));
		System.out.println("sum13([13, 13]) → " + sum13(new int[] {13, 13}));
		System.out.println("sum13([13, 0, 13]) → " + sum13(new int[] {13, 0, 13}));
		System.out.println("sum13([13, 1, 13]) → " + sum13(new int[] {13, 1, 13}));
		System.out.println("sum13([5, 7, 2]) → " + sum13(new int[] {5, 7, 2}));
		System.out.println("sum13([5, 13, 2]) → " + sum13(new int[] {5, 13, 2}));
		System.out.println("sum13([0]) → " + sum13(new int[] {0}));
		System.out.println("sum13([13, 0]) → " + sum13(new int[] {13, 0}));
		printFunction("sum67");
		System.out.println("sum67([1, 2, 2]) → " + sum67(new int[] {1, 2, 2}));
		System.out.println("sum67([1, 2, 2, 6, 99, 99, 7]) → " + sum67(new int[] {1, 2, 2, 6, 99, 99, 7}));
		System.out.println("sum67([1, 1, 6, 7, 2]) → " + sum67(new int[] {1, 1, 6, 7, 2}));
		System.out.println("sum67([1, 6, 2, 2, 7, 1, 6, 99, 99, 7]) → " + sum67(new int[] {1, 6, 2, 2, 7, 1, 6, 99, 99, 7}));
		System.out.println("sum67([1, 6, 2, 6, 2, 7, 1, 6, 99, 99, 7]) → " + sum67(new int[] {1, 6, 2, 6, 2, 7, 1, 6, 99, 99, 7}));
		System.out.println("sum67([2, 7, 6, 2, 6, 7, 2, 7]) → " + sum67(new int[] {2, 7, 6, 2, 6, 7, 2, 7}));
		System.out.println("sum67([2, 7, 6, 2, 6, 2, 7]) → " + sum67(new int[] {2, 7, 6, 2, 6, 2, 7}));
		System.out.println("sum67([1, 6, 7, 7]) → " + sum67(new int[] {1, 6, 7, 7}));
		System.out.println("sum67([6, 7, 1, 6, 7, 7]) → " + sum67(new int[] {6, 7, 1, 6, 7, 7}));
		System.out.println("sum67([6, 8, 1, 6, 7]) → " + sum67(new int[] {6, 8, 1, 6, 7}));
		System.out.println("sum67([]) → " + sum67(new int[] {}));
		System.out.println("sum67([6, 7, 11]) → " + sum67(new int[] {6, 7, 11}));
		System.out.println("sum67([11, 6, 7, 11]) → " + sum67(new int[] {11, 6, 7, 11}));
		System.out.println("sum67([2, 2, 6, 7, 7]) → " + sum67(new int[] {2, 2, 6, 7, 7}));
	}
}
