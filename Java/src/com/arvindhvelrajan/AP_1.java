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
	 * Given an array of scores, compute the int average of the first half and the second half, and return whichever is
	 * larger. We'll say that the second half begins at index length/2. The array length will be at least 2.
	 * To practice decomposition, write a separate helper method int average(int[] scores, int start, int end) { which
	 * computes the average of the elements between indexes start..end. Call your helper method twice to implement
	 * scoresAverage(). Write your helper method after your scoresAverage() method in the JavaBat text area.
	 * Normally you would compute averages with doubles, but here we use ints so the expected results are exact.
	 *
	 * scoresAverage([2, 2, 4, 4]) → 4
	 * scoresAverage([4, 4, 4, 2, 2, 2]) → 4
	 * scoresAverage([3, 4, 5, 1, 2, 3]) → 4
	 */
	public int scoresAverage(int[] scores)
	{
		throw new UnsupportedOperationException("Not supported yet.");
	}

	/**
	 * Given an array of strings, return the count of the number of strings with the given length.
	 *
	 * wordsCount(["a", "bb", "b", "ccc"], 1) → 2
	 * wordsCount(["a", "bb", "b", "ccc"], 3) → 1
	 * wordsCount(["a", "bb", "b", "ccc"], 4) → 0
	 */
	public int wordsCount(String[] words, int len)
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
		printFunction("scoresAverage");
		System.out.println("scoresAverage([2, 2, 4, 4]) → " + scoresAverage(new int[] {2, 2, 4, 4}));
		System.out.println("scoresAverage([4, 4, 4, 2, 2, 2]) → " + scoresAverage(new int[] {4, 4, 4, 2, 2, 2}));
		System.out.println("scoresAverage([3, 4, 5, 1, 2, 3]) → " + scoresAverage(new int[] {3, 4, 5, 1, 2, 3}));
		System.out.println("scoresAverage([5, 6]) → " + scoresAverage(new int[] {5, 6}));
		System.out.println("scoresAverage([5, 4]) → " + scoresAverage(new int[] {5, 4}));
		System.out.println("scoresAverage([5, 4, 5, 6, 2, 1, 2, 3]) → " + scoresAverage(new int[] {5, 4, 5, 6, 2, 1, 2, 3}));
		printFunction("wordsCount");
		System.out.println("wordsCount([\"a\", \"bb\", \"b\", \"ccc\"], 1) → " + wordsCount(new String[] {"a", "bb", "b", "ccc"}, 1));
		System.out.println("wordsCount([\"a\", \"bb\", \"b\", \"ccc\"], 3) → " + wordsCount(new String[] {"a", "bb", "b", "ccc"}, 3));
		System.out.println("wordsCount([\"a\", \"bb\", \"b\", \"ccc\"], 4) → " + wordsCount(new String[] {"a", "bb", "b", "ccc"}, 4));
		System.out.println("wordsCount([\"xx\", \"yyy\", \"x\", \"yy\", \"z\"], 1) → " + wordsCount(new String[] {"xx", "yyy", "x", "yy", "z"}, 1));
		System.out.println("wordsCount([\"xx\", \"yyy\", \"x\", \"yy\", \"z\"], 2) → " + wordsCount(new String[] {"xx", "yyy", "x", "yy", "z"}, 2));
		System.out.println("wordsCount([\"xx\", \"yyy\", \"x\", \"yy\", \"z\"], 3) → " + wordsCount(new String[] {"xx", "yyy", "x", "yy", "z"}, 3));
	}
}
