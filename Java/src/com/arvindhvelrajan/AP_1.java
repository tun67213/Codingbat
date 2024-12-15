package com.arvindhvelrajan;

import static com.arvindhvelrajan.UI_Functions.*;
import java.util.List;
import java.util.Arrays;

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
	 * We'll say that a positive int n is "endy" if it is in the range 0..10 or 90..100 (inclusive).
	 * Given an array of positive ints, return a new array of length "count" containing the first endy numbers from the
	 * original array. Decompose out a separate isEndy(int n) method to test if a number is endy. The original array
	 * will contain at least "count" endy numbers.
	 *
	 * copyEndy([9, 11, 90, 22, 6], 2) → [9, 90]
	 * copyEndy([9, 11, 90, 22, 6], 3) → [9, 90, 6]
	 * copyEndy([12, 1, 1, 13, 0, 20], 2) → [1, 1]
	 */
	public int[] copyEndy(int[] nums, int count)
	{
		throw new UnsupportedOperationException("Not supported yet.");
	}

	/**
	 * Given 2 arrays that are the same length containing strings, compare the 1st string in one array to the 1st string
	 * in the other array, the 2nd to the 2nd and so on. Count the number of times that the 2 strings are non-empty and
	 * start with the same char. The strings may be any length, including 0.
	 *
	 * matchUp(["aa", "bb", "cc"], ["aaa", "xx", "bb"]) → 1
	 * matchUp(["aa", "bb", "cc"], ["aaa", "b", "bb"]) → 2
	 * matchUp(["aa", "bb", "cc"], ["", "", "ccc"]) → 1
	 */
	public int matchUp(String[] a, String[] b)
	{
		throw new UnsupportedOperationException("Not supported yet.");
	}

	/**
	 * The "key" array is an array containing the correct answers to an exam, like {"a", "a", "b", "b"}. the "answers"
	 * array contains a student's answers, with "?" representing a question left blank. The two arrays are not empty and
	 * are the same length. Return the score for this array of answers, giving +4 for each correct answer, -1 for each
	 * incorrect answer, and +0 for each blank answer.
	 *
	 * scoreUp(["a", "a", "b", "b"], ["a", "c", "b", "c"]) → 6
	 * scoreUp(["a", "a", "b", "b"], ["a", "a", "b", "c"]) → 11
	 * scoreUp(["a", "a", "b", "b"], ["a", "a", "b", "b"]) → 16
	 */
	public int scoreUp(String[] key, String[] answers)
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
		printFunction("copyEndy");
		System.out.println("copyEndy([9, 11, 90, 22, 6], 2) → " + Arrays.toString(copyEndy(new int[] {9, 11, 90, 22, 6}, 2)));
		System.out.println("copyEndy([9, 11, 90, 22, 6], 3) → " + Arrays.toString(copyEndy(new int[] {9, 11, 90, 22, 6}, 3)));
		System.out.println("copyEndy([12, 1, 1, 13, 0, 20], 2) → " + Arrays.toString(copyEndy(new int[] {12, 1, 1, 13, 0, 2}, 2)));
		System.out.println("copyEndy([12, 1, 1, 13, 0, 20], 3) → " + Arrays.toString(copyEndy(new int[] {12, 1, 1, 13, 0, 2}, 3)));
		System.out.println("copyEndy([0], 1) → " + Arrays.toString(copyEndy(new int[] {0}, 1)));
		System.out.println("copyEndy([10, 11, 90], 2) → " + Arrays.toString(copyEndy(new int[] {10, 11, 90}, 2)));
		System.out.println("copyEndy([90, 22, 100], 2) → " + Arrays.toString(copyEndy(new int[] {90, 22, 100}, 2)));
		System.out.println("copyEndy([12, 11, 10, 89, 101, 4], 1) → " + Arrays.toString(copyEndy(new int[] {12, 11, 10, 89, 101, 4}, 1)));
		System.out.println("copyEndy([13, 2, 2, 0], 2) → " + Arrays.toString(copyEndy(new int[] {13, 2, 2, 0}, 2)));
		System.out.println("copyEndy([13, 2, 2, 0], 3) → " + Arrays.toString(copyEndy(new int[] {13, 2, 2, 0}, 3)));
		System.out.println("copyEndy([13, 2, 13, 2, 0, 30], 2) → " + Arrays.toString(copyEndy(new int[] {13, 2, 13, 2, 0, 30}, 2)));
		System.out.println("copyEndy([13, 2, 13, 2, 0, 30], 3) → " + Arrays.toString(copyEndy(new int[] {13, 2, 13, 2, 0, 30}, 3)));
		printFunction("matchUp");
		System.out.println("matchUp([\"aa\", \"bb\", \"cc\"], [\"aaa\", \"xx\", \"bb\"]) → " + matchUp(new String[] {"aa", "bb", "cc"}, new String[] {"aaa", "xx", "bb"}));
		System.out.println("matchUp([\"aa\", \"bb\", \"cc\"], [\"aaa\", \"b\", \"bb\"]) → " + matchUp(new String[] {"aa", "bb", "cc"}, new String[] {"aaa", "b", "bb"}));
		System.out.println("matchUp([\"aa\", \"bb\", \"cc\"], [\"\", \"\", \"ccc\"]) → " + matchUp(new String[] {"aa", "bb", "cc"}, new String[] {"", "", "ccc"}));
		System.out.println("matchUp([\"\", \"\", \"ccc\"], [\"aa\", \"bb\", \"cc\"]) → " + matchUp(new String[] {"", "", "ccc"}, new String[] {"aa", "bb", "cc"}));
		System.out.println("matchUp([\"\", \"\", \"\"], [\"\", \"bb\", \"cc\"]) → " + matchUp(new String[] {"", "", ""}, new String[] {"", "bb", "cc"}));
		System.out.println("matchUp([\"aa\", \"bb\", \"cc\"], [\"\", \"\", \"\"]) → " + matchUp(new String[] {"aa", "bb", "cc"}, new String[] {"", "", ""}));
		System.out.println("matchUp([\"aa\", \"\", \"ccc\"], [\"\", \"bb\", \"cc\"]) → " + matchUp(new String[] {"aa", "bb", "cc"}, new String[] {"", "", ""}));
		System.out.println("matchUp([\"x\", \"y\", \"z\"], [\"y\", \"z\", \"x\"]) → " + matchUp(new String[] {"x", "y", "z"}, new String[] {"y", "z", "x"}));
		System.out.println("matchUp([\"\", \"y\", \"z\"], [\"\", \"y\", \"x\"]) → " + matchUp(new String[] {"", "y", "z"}, new String[] {"", "y", "x"}));
		System.out.println("matchUp([\"x\", \"y\", \"z\"], [\"xx\", \"yyy\", \"zzz\"]) → " + matchUp(new String[] {"x", "y", "z"}, new String[] {"xx", "yyy", "zzz"}));
		System.out.println("matchUp([\"x\", \"y\", \"z\"], [\"xx\", \"yyy\", \"\"]) → " + matchUp(new String[] {"x", "y", "z"}, new String[] {"xx", "yyy", ""}));
		System.out.println("matchUp([\"b\", \"x\", \"y\", \"z\"], [\"a\", \"xx\", \"yyy\", \"zzz\"]) → " + matchUp(new String[] {"b", "x", "y", "z"}, new String[] {"a", "xx", "yyy", "zzz"}));
		System.out.println("matchUp([\"aaa\", \"bb\", \"c\"], [\"aaa\", \"xx\", \"bb\"]) → " + matchUp(new String[] {"aaa", "bb", "c"}, new String[] {"aaa", "xx", "bb"}));
	}
}
