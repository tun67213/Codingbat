package com.arvindhvelrajan;

import static com.arvindhvelrajan.UI_Functions.*;

/**
 * @author arvindhvelrajan
 * @code This class is to demonstrate the implementation for all functions in AP-1 from codingbat.com
 */
public class AP_1
{
	private void welcome()
	{
		System.out.println("\n\nAP-1 Functions\n");
	}

	/**
	 * Given an array of scores, return true if each score is equal or greater than the one before.
	 * The array will be length 2 or more.
	 *
	 * scoresIncreasing([1, 3, 4]) → true
	 * scoresIncreasing([1, 3, 2]) → false
	 * scoresIncreasing([1, 1, 4]) → true
	 */
	public boolean scoresIncreasing(int[] scores)
	{
		throw new UnsupportedOperationException("Not supported yet.");
	}

	/**
	 * Given an array of scores, return true if there are scores of 100 next to each other in the array.
	 * The array length will be at least 2.
	 *
	 * scores100([1, 100, 100]) → true
	 * scores100([1, 100, 99, 100]) → false
	 * scores100([100, 1, 100, 100]) → true
	 */
	public boolean scores100(int[] scores)
	{
		throw new UnsupportedOperationException("Not supported yet.");
	}

	/**
	 * Given an array of scores sorted in increasing order, return true if the array contains 3 adjacent scores that
	 * differ from each other by at most 2, such as with {3, 4, 5} or {3, 5, 5}.
	 *
	 * scoresClump([3, 4, 5]) → true
	 * scoresClump([3, 4, 6]) → false
	 * scoresClump([1, 3, 5, 5]) → true
	 */
	public boolean scoresClump(int[] scores)
	{
		throw new UnsupportedOperationException("Not supported yet.");
	}

	/**
	 * @param args commandline arguments
	 */
	public void main(String[] args)
	{
		welcome();
		printFunction("scoresIncreasing");
		System.out.println("scoresIncreasing([1, 3, 4]) → " + scoresIncreasing(new int[] {1, 3, 4}));
		System.out.println("scoresIncreasing([1, 3, 2]) → " + scoresIncreasing(new int[] {1, 3, 2}));
		System.out.println("scoresIncreasing([1, 1, 4]) → " + scoresIncreasing(new int[] {1, 1, 4}));
		System.out.println("scoresIncreasing([1, 1, 2, 4, 4, 7]) → " + scoresIncreasing(new int[] {1, 1, 2, 4, 4, 7}));
		System.out.println("scoresIncreasing([1, 1, 2, 4, 3, 7]) → " + scoresIncreasing(new int[] {1, 1, 2, 4, 3, 7}));
		System.out.println("scoresIncreasing([-5, 4, 11]) → " + scoresIncreasing(new int[] {-5, 4, 11}));
		printFunction("scores100");
		System.out.println("scores100([1, 100, 100]) → " + scores100(new int[] {1, 100, 100}));
		System.out.println("scores100([1, 100, 99, 100]) → " + scores100(new int[] {1, 100, 99, 100}));
		System.out.println("scores100([100, 1, 100, 100]) → " + scores100(new int[] {100, 1, 100, 100}));
		System.out.println("scores100([100, 1, 100, 1]) → " + scores100(new int[] {100, 1, 100, 1}));
		System.out.println("scores100([1, 2, 3, 4, 5]) → " + scores100(new int[] {1, 2, 3, 4, 5}));
		System.out.println("scores100([1, 2, 100, 4, 5]) → " + scores100(new int[] {1, 2, 100, 4, 5}));
		printFunction("scoresClump");
		System.out.println("scoresClump([3, 4, 5]) → " + scoresClump(new int[] {3, 4, 5}));
		System.out.println("scoresClump([3, 4, 6]) → " + scoresClump(new int[] {3, 4, 6}));
		System.out.println("scoresClump([1, 3, 5, 5]) → " + scoresClump(new int[] {1, 3, 5, 5}));
		System.out.println("scoresClump([2, 4, 5, 6]) → " + scoresClump(new int[] {2, 4, 5, 6}));
		System.out.println("scoresClump([2, 4, 5, 7]) → " + scoresClump(new int[] {2, 4, 5, 7}));
		System.out.println("scoresClump([2, 4, 4, 7]) → " + scoresClump(new int[] {2, 4, 4, 7}));
		System.out.println("scoresClump([3, 3, 6, 7, 9]) → " + scoresClump(new int[] {3, 3, 6, 7, 9}));
		System.out.println("scoresClump([3, 3, 7, 7, 9]) → " + scoresClump(new int[] {3, 3, 7, 7, 9}));
		System.out.println("scoresClump([4, 5, 8]) → " + scoresClump(new int[] {4, 5, 8}));
	}
}
