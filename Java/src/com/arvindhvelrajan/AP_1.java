package com.arvindhvelrajan;

import static com.arvindhvelrajan.UI_Functions.*;
import java.util.List;

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
	 * Given an array of strings, return a new array containing the first N strings. N will be in the range 1..length.
	 *
	 * wordsFront(["a", "b", "c", "d"], 1) → ["a"]
	 * wordsFront(["a", "b", "c", "d"], 2) → ["a", "b"]
	 * wordsFront(["a", "b", "c", "d"], 3) → ["a", "b", "c"]
	 */
	public String[] wordsFront(String[] words, int n)
	{
		throw new UnsupportedOperationException("Not supported yet.");
	}
	private String toString(String[] words)
	{
		throw new UnsupportedOperationException("Not supported yet.");
	}

	/**
	 * Given an array of strings, return a new List (e.g. an ArrayList) where all the strings of the given length are
	 * omitted. See wordsWithout() below which is more difficult because it uses arrays.
	 *
	 * wordsWithoutList(["a", "bb", "b", "ccc"], 1) → ["bb", "ccc"]
	 * wordsWithoutList(["a", "bb", "b", "ccc"], 3) → ["a", "bb", "b"]
	 * wordsWithoutList(["a", "bb", "b", "ccc"], 4) → ["a", "bb", "b", "ccc"]
	 */
	public List wordsWithoutList(String[] words, int len)
	{
		throw new UnsupportedOperationException("Not supported yet.");
	}

	/**
	 * Given a positive int n, return true if it contains a 1 digit. Note: use % to get the rightmost digit, and / to
	 * discard the rightmost digit.
	 *
	 * hasOne(10) → true
	 * hasOne(22) → false
	 * hasOne(220) → false
	 */
	public boolean hasOne(int n)
	{
		throw new UnsupportedOperationException("Not supported yet.");
	}

	/**
	 * We'll say that a positive int divides itself if every digit in the number divides into the number evenly.
	 * So for example 128 divides itself since 1, 2, and 8 all divide into 128 evenly.
	 * We'll say that 0 does not divide into anything evenly, so no number with a 0 digit divides itself.
	 * Note: use % to get the rightmost digit, and / to discard the rightmost digit.
	 *
	 * dividesSelf(128) → true
	 * dividesSelf(12) → true
	 * dividesSelf(120) → false
	 */
	public boolean dividesSelf(int n)
	{
		throw new UnsupportedOperationException("Not supported yet.");
	}

	/**
	 * Given an array of positive ints, return a new array of length "count" containing the first even numbers from the
	 * original array. The original array will contain at least "count" even numbers.
	 *
	 * copyEvens([3, 2, 4, 5, 8], 2) → [2, 4]
	 * copyEvens([3, 2, 4, 5, 8], 3) → [2, 4, 8]
	 * copyEvens([6, 1, 2, 4, 5, 8], 3) → [6, 2, 4]
	 */
	public int[] copyEvens(int[] nums, int count)
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
		printFunction("wordsFront");
		System.out.println("wordsFront([\"a\", \"b\", \"c\", \"d\"], 1) → " + toString(wordsFront(new String[] {"a", "b", "c", "d"}, 1)));
		System.out.println("wordsFront([\"a\", \"b\", \"c\", \"d\"], 2) → " + toString(wordsFront(new String[] {"a", "b", "c", "d"}, 2)));
		System.out.println("wordsFront([\"a\", \"b\", \"c\", \"d\"], 3) → " + toString(wordsFront(new String[] {"a", "b", "c", "d"}, 3)));
		System.out.println("wordsFront([\"a\", \"b\", \"c\", \"d\"], 4) → " + toString(wordsFront(new String[] {"a", "b", "c", "d"}, 4)));
		System.out.println("wordsFront([\"Hi\", \"There\"], 1) → " + toString(wordsFront(new String[] {"Hi", "There"}, 1)));
		System.out.println("wordsFront([\"Hi\", \"There\"], 2) → " + toString(wordsFront(new String[] {"Hi", "There"}, 2)));
		printFunction("wordsWithoutList");
		System.out.println("wordsWithoutList([\"a\", \"bb\", \"b\", \"ccc\"], 1) → " + wordsWithoutList(new String[] {"a", "bb", "b", "ccc"}, 1));
		System.out.println("wordsWithoutList([\"a\", \"bb\", \"b\", \"ccc\"], 3) → " + wordsWithoutList(new String[]{"a", "bb", "b", "ccc"}, 3));
		System.out.println("wordsWithoutList([\"a\", \"bb\", \"b\", \"ccc\"], 4) → " + wordsWithoutList(new String[]{"a", "bb", "b", "ccc"}, 4));
		System.out.println("wordsWithoutList([\"xx\", \"yyy\", \"x\", \"yy\", \"z\"], 1) → " + wordsWithoutList(new String[]{"xx", "yyy", "x", "yy", "z"}, 1));
		System.out.println("wordsWithoutList([\"xx\", \"yyy\", \"x\", \"yy\", \"z\"], 2) → " + wordsWithoutList(new String[]{"xx", "yyy", "x", "yy", "z"}, 2));
		printFunction("hasOne");
		System.out.println("hasOne(10) → " + hasOne(10));
		System.out.println("hasOne(22) → " + hasOne(22));
		System.out.println("hasOne(220) → " + hasOne(220));
		System.out.println("hasOne(212) → " + hasOne(212));
		System.out.println("hasOne(1) → " + hasOne(1));
		System.out.println("hasOne(9) → " + hasOne(9));
		System.out.println("hasOne(211112) → " + hasOne(211112));
		System.out.println("hasOne(121121) → " + hasOne(121121));
		System.out.println("hasOne(222222) → " + hasOne(222222));
		System.out.println("hasOne(56156) → " + hasOne(56156));
		System.out.println("hasOne(56556) → " + hasOne(56556));
		printFunction("dividesSelf");
		System.out.println("dividesSelf(128) → " + dividesSelf(128));
		System.out.println("dividesSelf(12) → " + dividesSelf(12));
		System.out.println("dividesSelf(120) → " + dividesSelf(120));
		System.out.println("dividesSelf(122) → " + dividesSelf(122));
		System.out.println("dividesSelf(13) → " + dividesSelf(13));
		System.out.println("dividesSelf(32) → " + dividesSelf(32));
		System.out.println("dividesSelf(22) → " + dividesSelf(22));
		System.out.println("dividesSelf(42) → " + dividesSelf(42));
		System.out.println("dividesSelf(212) → " + dividesSelf(212));
		System.out.println("dividesSelf(213) → " + dividesSelf(213));
		System.out.println("dividesSelf(162) → " + dividesSelf(162));
		printFunction("copyEvens");
		System.out.println("copyEvens([3, 2, 4, 5, 8], 2) → " + Arrays.toString(copyEvens(new int[] {3, 2, 4, 5, 8}, 2)));
		System.out.println("copyEvens([3, 2, 4, 5, 8], 3) → " + Arrays.toString(copyEvens(new int[] {3, 2, 4, 5, 8}, 3)));
		System.out.println("copyEvens([6, 1, 2, 4, 5, 8], 3) → " + Arrays.toString(copyEvens(new int[] {6, 1, 2, 4, 5, 8}, 3)));
		System.out.println("copyEvens([6, 1, 2, 4, 5, 8], 4) → " + Arrays.toString(copyEvens(new int[] {6, 1, 2, 4, 5, 8}, 4)));
		System.out.println("copyEvens([3, 1, 4, 1, 5], 1) → " + Arrays.toString(copyEvens(new int[] {3, 1, 4, 1, 5}, 1)));
		System.out.println("copyEvens([2], 1) → " + Arrays.toString(copyEvens(new int[] {2}, 1)));
		System.out.println("copyEvens([6, 2, 4, 8], 2) → " + Arrays.toString(copyEvens(new int[] {6, 2, 4, 8}, 2)));
		System.out.println("copyEvens([6, 2, 4, 8], 3) → " + Arrays.toString(copyEvens(new int[] {6, 2, 4, 8}, 3)));
		System.out.println("copyEvens([6, 2, 4, 8], 4) → " + Arrays.toString(copyEvens(new int[] {6, 2, 4, 8}, 4)));
		System.out.println("copyEvens([1, 8, 4], 1) → " + Arrays.toString(copyEvens(new int[] {1, 8, 4}, 1)));
		System.out.println("copyEvens([1, 8, 4], 2) → " + Arrays.toString(copyEvens(new int[] {1, 8, 4}, 2)));
		System.out.println("copyEvens([2, 8, 4], 2) → " + Arrays.toString(copyEvens(new int[] {2, 8, 4}, 2)));
	}
}
