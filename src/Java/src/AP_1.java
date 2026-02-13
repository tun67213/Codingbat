package src;

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

/**
 * @author arvindhvelrajan
 */
public class AP_1 extends HelperMethods
{
	/**
	 * This method welcomes the user to this program.
	 */
	public void welcome()
	{
		System.out.println("\n\nAP-1 Methods\n");
	}

	/**
	 * Given an array of scores, return true if each score is equal or greater than the one before. The array will be length 2 or more.
	 *
	 * scoresIncreasing([1, 3, 4]) → true
	 * scoresIncreasing([1, 3, 2]) → false
	 * scoresIncreasing([1, 1, 4]) → true
	 */
	public boolean scoresIncreasing(int[] scores)
	{
		for(int i = 0; i < scores.length - 1; i++)
		{
			if(scores[i] > scores[i + 1])
			{
				return false;
			}
		}
		return true;
	}

	/**
	 * Given an array of scores, return true if there are scores of 100 next to each other in the array. The array length will be at least 2.
	 *
	 * scores100([1, 100, 100]) → true
	 * scores100([1, 100, 99, 100]) → false
	 * scores100([100, 1, 100, 100]) → true
	 */
	public boolean scores100(int[] scores)
	{
		if(scores.length < 2)
		{
			return false;
		}
		for(int i = 0; i < scores.length - 1; i++)
		{
			if(scores[i] == 100 && scores[i + 1] == 100)
			{
				return true;
			}
		}
		return false;
	}

	/**
	 * Given an array of scores sorted in increasing order, return true if the array contains 3 adjacent scores that differ from each other by at most 2, such as with {3, 4, 5} or {3, 5, 5}.
	 *
	 * scoresClump([3, 4, 5]) → true
	 * scoresClump([3, 4, 6]) → false
	 * scoresClump([1, 3, 5, 5]) → true
	 */
	public boolean scoresClump(int[] scores)
	{
		if(scores.length <= 2)
		{
			return false;
		}
		for(int i = 0; i < scores.length - 2; i++)
		{
			if((Math.abs(scores[i] - scores[i + 1]) <= 2) && (Math.abs(scores[i] - scores[i + 2]) <= 2) && (Math.abs(scores[i + 1] - scores[i + 2]) <= 2))
			{
				return true;
			}
		}
		return false;
	}

	/**
	 * Given an array of scores, compute the int average of the first half and the second half, and return whichever is larger. We'll say that the second half begins at index length/2. The array length will be at least 2. To practice decomposition, write a separate helper method
	 * int average(int[] scores, int start, int end) { which computes the average of the elements between indexes start..end. Call your helper method twice to implement scoresAverage(). Write your helper method after your scoresAverage() method in the JavaBat text area. Normally you would compute averages with doubles, but here we use ints so the expected results are exact.
	 *
	 * scoresAverage([2, 2, 4, 4]) → 4
	 * scoresAverage([4, 4, 4, 2, 2, 2]) → 4
	 * scoresAverage([3, 4, 5, 1, 2, 3]) → 4
	 */
	public int scoresAverage(int[] scores)
	{
		int firstHalf = average(scores, 0, scores.length / 2);
		int secondHalf = average(scores, scores.length / 2, scores.length);
		if(firstHalf > secondHalf)
		{
			return firstHalf;
		}
		return secondHalf;
	}
	/**
	 * The following method is a helper method for scoresAverage created as per the recommendation of the question.
	 */
	private int average(int[] scores, int start, int end)
	{
		int sum = 0;
		int length = end - start;
		for(int i = start; i < end; i++)
		{
			sum += scores[i];
		}
		if(length == 0)
		{
			return 0;
		}
		return sum / length;
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
		int wordsOfLength = 0;
		for(String word : words)
		{
			if(word.length() == len)
			{
				wordsOfLength++;
			}
		}
		return wordsOfLength;
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
		String[] newArray = new String[n];
		for(int i = 0; i < n; i++)
		{
			newArray[i] = words[i];
		}
		return newArray;
	}

	/**
	 * Given an array of strings, return a new List (e.g. an ArrayList) where all the strings of the given length are omitted. See wordsWithout() below which is more difficult because it uses arrays.
	 *
	 * wordsWithoutList(["a", "bb", "b", "ccc"], 1) → ["bb", "ccc"]
	 * wordsWithoutList(["a", "bb", "b", "ccc"], 3) → ["a", "bb", "b"]
	 * wordsWithoutList(["a", "bb", "b", "ccc"], 4) → ["a", "bb", "b", "ccc"]
	 */
	@SuppressWarnings("rawtypes")
	public List wordsWithoutList(String[] words, int len)
	{
		List<String> list = new ArrayList<>();
		for(String word : words)
		{
			if(word.length() != len)
			{
				list.add(word);
			}
		}
		return list;
	}

	/**
	 * Given a positive int n, return true if it contains a 1 digit. Note: use % to get the rightmost digit, and / to discard the rightmost digit.
	 *
	 * hasOne(10) → true
	 * hasOne(22) → false
	 * hasOne(220) → false
	 */
	public boolean hasOne(int n)
	{
		int currentValue = n;
		while(currentValue > 0)
		{
			if(currentValue % 10 == 1)
			{
				return true;
			}
			currentValue /= 10;
		}
		return false;
	}

	/**
	 * We'll say that a positive int divides itself if every digit in the number divides into the number evenly. So for example 128 divides itself since 1, 2, and 8 all divide into 128 evenly. We'll say that 0 does not divide into anything evenly, so no number with a 0 digit divides itself. Note: use % to get the rightmost digit, and / to discard the rightmost digit.
	 *
	 * dividesSelf(128) → true
	 * dividesSelf(12) → true
	 * dividesSelf(120) → false
	 */
	public boolean dividesSelf(int n)
	{
		int[] digitsInN = splitValue(n);
		for(int digit : digitsInN)
		{
			if(digit == 0 || n % digit != 0)
			{
				return false;
			}
		}
		return true;
	}
	/**
	 * The following is a helper method that will find the current length of an integer.
	 */
	private int length(int n)
	{
		if(n < 0)
		{
			n *= -1;
		}
		if(n < 10)
		{
			return 1;
		}
		int length = 1;
		while(n >= 10)
		{
			n /= 10;
			length++;
		}
		return length;
	}
	/**
	 * The following is a helper method that will split a number into its individual digits.
	 */
	private int[] splitValue(int n)
	{
		int len = length(n);
		int[] digits = new int[len];
		for(int i = 0; i < len; i++)
		{
			digits[len - i - 1] = n % 10;
			n /= 10;
		}
		return digits;
	}

	/**
	 * Given an array of positive ints, return a new array of length "count" containing the first even numbers from the original array. The original array will contain at least "count" even numbers.
	 *
	 * copyEvens([3, 2, 4, 5, 8], 2) → [2, 4]
	 * copyEvens([3, 2, 4, 5, 8], 3) → [2, 4, 8]
	 * copyEvens([6, 1, 2, 4, 5, 8], 3) → [6, 2, 4]
	 */
	public int[] copyEvens(int[] nums, int count)
	{
		int[] newArray = new int[count];
		int currentSize = 0;
		for(int num : nums)
		{
			if(num % 2 == 0)
			{
				newArray[currentSize++] = num;
			}
			if(currentSize == count)
			{
				break;
			}
		}
		return newArray;
	}

	/**
	 * We'll say that a positive int n is "endy" if it is in the range 0..10 or 90..100 (inclusive). Given an array of positive ints, return a new array of length "count" containing the first endy numbers from the original array. Decompose out a separate isEndy(int n) method to test if a number is endy. The original array will contain at least "count" endy numbers.
	 *
	 * copyEndy([9, 11, 90, 22, 6], 2) → [9, 90]
	 * copyEndy([9, 11, 90, 22, 6], 3) → [9, 90, 6]
	 * copyEndy([12, 1, 1, 13, 0, 20], 2) → [1, 1]
	 */
	public int[] copyEndy(int[] nums, int count)
	{
		int[] newArray = new int[count];
		int currentSize = 0;
		int currentIndex = 0;
		while(currentIndex < nums.length && currentSize < count)
		{
			if(isEndy(nums[currentIndex]))
			{
				newArray[currentSize++] = nums[currentIndex];
			}
			currentIndex++;
		}
		return newArray;
	}
	/**
	 * The following is a helper method for copyEndy that will distinguish if each individual value is classified as 'endy'.
	 */
	private boolean isEndy(int n)
	{
		return (n >= 0 && n <= 10) || (n >= 90 && n <= 100);
	}

	/**
	 * Given 2 arrays that are the same length containing strings, compare the 1st string in one array to the 1st string in the other array, the 2nd to the 2nd and so on. Count the number of times that the 2 strings are non-empty and start with the same char. The strings may be any length, including 0.
	 *
	 * matchUp(["aa", "bb", "cc"], ["aaa", "xx", "bb"]) → 1
	 * matchUp(["aa", "bb", "cc"], ["aaa", "b", "bb"]) → 2
	 * matchUp(["aa", "bb", "cc"], ["", "", "ccc"]) → 1
	 */
	public int matchUp(String[] a, String[] b)
	{
		int count = 0;
		for(int i = 0; i < a.length; i++)
		{
			String aString = a[i], bString = b[i];
			if(aString.length() > 0 && bString.length() > 0 && aString.substring(0, 1).equals(bString.substring(0, 1)))
			{
				count++;
			}
		}
		return count;
	}

	/**
	 * The "key" array is an array containing the correct answers to an exam, like {"a", "a", "b", "b"}. the "answers" array contains a student's answers, with "?" representing a question left blank. The two arrays are not empty and are the same length. Return the score for this array of answers, giving +4 for each correct answer, -1 for each incorrect answer, and +0 for each blank answer.
	 *
	 * scoreUp(["a", "a", "b", "b"], ["a", "c", "b", "c"]) → 6
	 * scoreUp(["a", "a", "b", "b"], ["a", "a", "b", "c"]) → 11
	 * scoreUp(["a", "a", "b", "b"], ["a", "a", "b", "b"]) → 16
	 */
	public int scoreUp(String[] key, String[] answer)
	{
		int score = 0;
		for(int i = 0; i < key.length; i++)
		{
			String correctAnswer = key[i];
			String studentAnswer = answer[i];
			if(studentAnswer.equals(correctAnswer))
			{
				score += 4;
			}
			else if(!(studentAnswer.equals("?")))
			{
				score -= 1;
			}
		}
		return score;
	}

	/**
	 * Given an array of strings, return a new array without the strings that are equal to the target string. One approach is to count the occurrences of the target string, make a new array of the correct length, and then copy over the correct strings.
	 *
	 * wordsWithout(["a", "b", "c", "a"], "a") → ["b", "c"]
	 * wordsWithout(["a", "b", "c", "a"], "b") → ["a", "c", "a"]
	 * wordsWithout(["a", "b", "c", "a"], "c") → ["a", "b", "a"]
	 */
	public String[] wordsWithout(String[] words, String target)
	{
		int count = 0;
		for(String word : words)
		{
			if(word.equals(target))
			{
				count++;
			}
		}
		String[] result = new String[words.length - count];
		int index = 0;
		for(String word : words)
		{
			if(!word.equals(target))
			{
				result[index++] = word;
			}
		}
		return result;
	}

	/**
	 * Given two arrays, A and B, of non-negative int scores. A "special" score is one which is a multiple of 10, such as 40 or 90. Return the sum of largest special score in A and the largest special score in B. To practice decomposition, write a separate helper method which finds the largest special score in an array. Write your helper method after your scoresSpecial() method in the JavaBat text area.
	 *
	 * scoresSpecial([12, 10, 4], [2, 20, 30]) → 40
	 * scoresSpecial([20, 10, 4], [2, 20, 10]) → 40
	 * scoresSpecial([12, 11, 4], [2, 20, 31]) → 20
	 */
	public int scoresSpecial(int[] a, int[] b)
	{
		return findSpecial(a) + findSpecial(b);
	}
	/**
	 * As a support above, this method will find the special value in a given array.
	 */
	private int findSpecial(int[] a)
	{
		int specialNumber = 0;
		for(int num : a)
		{
			if(num % 10 == 0 && num > specialNumber)
			{
				specialNumber = num;
			}
		}
		return specialNumber;
	}

	/**
	 * We have an array of heights, representing the altitude along a walking trail. Given start/end indexes into the array, return the sum of the changes for a walk beginning at the start index and ending at the end index. For example, with the heights {5, 3, 6, 7, 2} and start=2, end=4 yields a sum of 1 + 5 = 6. The start end end index will both be valid indexes into the array with start <= end.
	 *
	 * sumHeights([5, 3, 6, 7, 2], 2, 4) → 6
	 * sumHeights([5, 3, 6, 7, 2], 0, 1) → 2
	 * sumHeights([5, 3, 6, 7, 2], 0, 4) → 11
	 */
	public int sumHeights(int[] heights, int start, int end)
	{
		int sum = 0;
		for(int i = start; i < end; i++)
		{
			sum += Math.abs(heights[i] - heights[i + 1]);
		}
		return sum;
	}

	/**
	 * (A variation on the sumHeights problem.) We have an array of heights, representing the altitude along a walking trail. Given start/end indexes into the array, return the sum of the changes for a walk beginning at the start index and ending at the end index, however increases in height count double. For example, with the heights {5, 3, 6, 7, 2} and start=2, end=4 yields a sum of 1*2 + 5 = 7. The start end end index will both be valid indexes into the array with start <= end.
	 *
	 * sumHeights2([5, 3, 6, 7, 2], 2, 4) → 7
	 * sumHeights2([5, 3, 6, 7, 2], 0, 1) → 2
	 * sumHeights2([5, 3, 6, 7, 2], 0, 4) → 15
	 */
	public int sumHeights2(int[] heights, int start, int end)
	{
		throw new UnsupportedOperationException("Not implemented yet");
	}

	/**
	 * (A variation on the sumHeights problem.) We have an array of heights, representing the altitude along a walking trail. Given start/end indexes into the array, return the number of "big" steps for a walk starting at the start index and ending at the end index. We'll say that step is big if it is 5 or more up or down. The start end end index will both be valid indexes into the array with start <= end.
	 *
	 * bigHeights([5, 3, 6, 7, 2], 2, 4) → 1
	 * bigHeights([5, 3, 6, 7, 2], 0, 1) → 0
	 * bigHeights([5, 3, 6, 7, 2], 0, 4) → 1
	 */
	public int bigHeights(int[] heights, int start, int end)
	{
		throw new UnsupportedOperationException("Not implemented yet");
	}

	/**
	 * We have data for two users, A and B, each with a String name and an int id. The goal is to order the users such as for sorting. Return -1 if A comes before B, 1 if A comes after B, and 0 if they are the same. Order first by the string names, and then by the id numbers if the names are the same. Note: with Strings str1.compareTo(str2) returns an int value which is negative/0/positive to indicate how str1 is ordered to str2 (the value is not limited to -1/0/1). (On the AP, there would be two User objects, but here the code simply takes the two strings and two ints directly. The code logic is the same.)
	 *
	 * userCompare("bb", 1, "zz", 2) → -1
	 * userCompare("bb", 1, "aa", 2) → 1
	 * userCompare("bb", 1, "bb", 1) → 0
	 */
	public int userCompare(String aName, int aId, String bName, int bId)
	{
		throw new UnsupportedOperationException("Not implemented yet");
	}

	/**
	 * Start with two arrays of strings, A and B, each with its elements in alphabetical order and without duplicates. Return a new array containing the first N elements from the two arrays. The result array should be in alphabetical order and without duplicates. A and B will both have a length which is N or more. The best "linear" solution makes a single pass over A and B, taking advantage of the fact that they are in alphabetical order, copying elements directly to the new array.
	 *
	 * mergeTwo(["a", "c", "z"], ["b", "f", "z"], 3) → ["a", "b", "c"]
	 * mergeTwo(["a", "c", "z"], ["c", "f", "z"], 3) → ["a", "c", "f"]
	 * mergeTwo(["f", "g", "z"], ["c", "f", "g"], 3) → ["c", "f", "g"]
	 */
	public String[] mergeTwo(String[] a, String[] b, int n)
	{
		throw new UnsupportedOperationException("Not implemented yet");
	}

	/**
	 * Start with two arrays of strings, a and b, each in alphabetical order, possibly with duplicates. Return the count of the number of strings which appear in both arrays. The best "linear" solution makes a single pass over both arrays, taking advantage of the fact that they are in alphabetical order.
	 *
	 * commonTwo(["a", "c", "x"], ["b", "c", "d", "x"]) → 2
	 * commonTwo(["a", "c", "x"], ["a", "b", "c", "x", "z"]) → 3
	 * commonTwo(["a", "b", "c"], ["a", "b", "c"]) → 3
	 */
	public int commonTwo(String[] a, String[] b)
	{
		throw new UnsupportedOperationException("Not implemented yet");
	}

	/**
	 * @param args command line arguments
	 */
	public void main(String[] args)
	{
		HelperMethods.resetCallTimes();
		welcome();
		printMethod("scoresIncreasing");
		System.out.println("scoresIncreasing([1, 3, 4]) -> " + scoresIncreasing(new int[] {1, 3, 4}));
		System.out.println("scoresIncreasing([1, 3, 2]) -> " + scoresIncreasing(new int[] {1, 3, 2}));
		System.out.println("scoresIncreasing([1, 1, 4]) -> " + scoresIncreasing(new int[] {1, 1, 4}));
		System.out.println("scoresIncreasing([1, 1, 2, 4, 4, 7]) -> " + scoresIncreasing(new int[] {1, 1, 2, 4, 4, 7}));
		System.out.println("scoresIncreasing([1, 1, 2, 4, 3, 7]) -> " + scoresIncreasing(new int[] {1, 1, 2, 4, 3, 7}));
		System.out.println("scoresIncreasing([-5, 4, 11]) -> " + scoresIncreasing(new int[] {-5, 4, 11}));
		printMethod("scores100");
		System.out.println("scores100([1, 100, 100]) -> " + scores100(new int[] {1, 100, 100}));
		System.out.println("scores100([1, 100, 99, 100]) -> " + scores100(new int[] {1, 100, 99, 100}));
		System.out.println("scores100([100, 1, 100, 100]) -> " + scores100(new int[] {100, 1, 100, 100}));
		System.out.println("scores100([100, 1, 100, 1]) -> " + scores100(new int[] {100, 1, 100, 1}));
		System.out.println("scores100([1, 2, 3, 4, 5]) -> " + scores100(new int[] {1, 2, 3, 4, 5}));
		System.out.println("scores100([1, 2, 100, 4, 5]) -> " + scores100(new int[] {1, 2, 100, 4, 5}));
		printMethod("scoresClump");
		System.out.println("scoresClump([3, 4, 5]) -> " + scoresClump(new int[] {3, 4, 5}));
		System.out.println("scoresClump([3, 4, 6]) -> " + scoresClump(new int[] {3, 4, 6}));
		System.out.println("scoresClump([1, 3, 5, 5]) -> " + scoresClump(new int[] {1, 3, 5, 5}));
		System.out.println("scoresClump([2, 4, 5, 6]) -> " + scoresClump(new int[] {2, 4, 5, 6}));
		System.out.println("scoresClump([2, 4, 5, 7]) -> " + scoresClump(new int[] {2, 4, 5, 7}));
		System.out.println("scoresClump([2, 4, 4, 7]) -> " + scoresClump(new int[] {2, 4, 4, 7}));
		System.out.println("scoresClump([3, 3, 6, 7, 9]) -> " + scoresClump(new int[] {3, 3, 6, 7, 9}));
		System.out.println("scoresClump([3, 3, 7, 7, 9]) -> " + scoresClump(new int[] {3, 3, 7, 7, 9}));
		System.out.println("scoresClump([4, 5, 8]) -> " +  scoresClump(new int[] {4, 5, 8}));
		printMethod("scoresAverage");
		System.out.println("scoresAverage([2, 2, 4, 4]) -> " + scoresAverage(new int[] {2, 2, 4, 4}));
		System.out.println("scoresAverage([4, 4, 4, 2, 2, 2]) -> " + scoresAverage(new int[] {4, 4, 4, 2, 2, 2}));
		System.out.println("scoresAverage([3, 4, 5, 1, 2, 3]) -> " + scoresAverage(new int[] {3, 4, 5, 1, 2, 3}));
		System.out.println("scoresAverage([5, 6]) -> " + scoresAverage(new int[] {5, 6}));
		System.out.println("scoresAverage([5, 4]) -> " + scoresAverage(new int[] {5, 4}));
		System.out.println("scoresAverage([5, 4, 5, 6, 2, 1, 2, 3]) -> " + scoresAverage(new int[] {5, 4, 5, 6, 2, 1, 2, 3}));
		printMethod("wordsCount");
		System.out.println("wordsCount([\"a\", \"bb\", \"b\", \"ccc\"], 1) -> " + wordsCount(new String[] {"a", "bb", "b", "ccc"}, 1));
		System.out.println("wordsCount([\"a\", \"bb\", \"b\", \"ccc\"], 3) -> " + wordsCount(new String[] {"a", "bb", "b", "ccc"}, 3));
		System.out.println("wordsCount([\"a\", \"bb\", \"b\", \"ccc\"], 4) -> " + wordsCount(new String[] {"a", "bb", "b", "ccc"}, 4));
		System.out.println("wordsCount([\"xx\", \"yyy\", \"x\", \"yy\", \"z\"], 1) -> " + wordsCount(new String[] {"xx", "yyy", "x", "yy", "z"}, 1));
		System.out.println("wordsCount([\"xx\", \"yyy\", \"x\", \"yy\", \"z\"], 2) -> " + wordsCount(new String[] {"xx", "yyy", "x", "yy", "z"}, 2));
		System.out.println("wordsCount([\"xx\", \"yyy\", \"x\", \"yy\", \"z\"], 3) -> " + wordsCount(new String[] {"xx", "yyy", "x", "yy", "z"}, 3));
		printMethod("wordsFront");
		System.out.println("wordsFront([\"a\", \"b\", \"c\", \"d\"], 1) -> " + formatStringArray(wordsFront(new String[] {"a", "b", "c", "d"}, 1)));
		System.out.println("wordsFront([\"a\", \"b\", \"c\", \"d\"], 2) -> " + formatStringArray(wordsFront(new String[] {"a", "b", "c", "d"}, 2)));
		System.out.println("wordsFront([\"a\", \"b\", \"c\", \"d\"], 3) -> " + formatStringArray(wordsFront(new String[] {"a", "b", "c", "d"}, 3)));
		System.out.println("wordsFront([\"a\", \"b\", \"c\", \"d\"], 4) -> " + formatStringArray(wordsFront(new String[] {"a", "b", "c", "d"}, 4)));
		System.out.println("wordsFront([\"Hi\", \"There\"], 1) -> " + formatStringArray(wordsFront(new String[] {"Hi", "There"}, 1)));
		System.out.println("wordsFront([\"Hi\", \"There\"], 2) -> " + formatStringArray(wordsFront(new String[] {"Hi", "There"}, 2)));
		printMethod("wordsWithoutList");
		System.out.println("wordsWithoutList([\"a\", \"bb\", \"b\", \"ccc\"], 1) -> " + formatList(wordsWithoutList(new String[] {"a", "bb", "b", "ccc"}, 1)));
		System.out.println("wordsWithoutList([\"a\", \"bb\", \"b\", \"ccc\"], 3) -> " + formatList(wordsWithoutList(new String[] {"a", "bb", "b", "ccc"}, 3)));
		System.out.println("wordsWithoutList([\"a\", \"bb\", \"b\", \"ccc\"], 4) -> " + formatList(wordsWithoutList(new String[] {"a", "bb", "b", "ccc"}, 4)));
		System.out.println("wordsWithoutList([\"xx\", \"yyy\", \"x\", \"yy\", \"z\"], 1) -> " + formatList(wordsWithoutList(new String[] {"xx", "yyy", "x", "yy", "z"}, 1)));
		System.out.println("wordsWithoutList([\"xx\", \"yyy\", \"x\", \"yy\", \"z\"], 2) -> " + formatList(wordsWithoutList(new String[] {"xx", "yyy", "x", "yy", "z"}, 2)));
		printMethod("hasOne");
		System.out.println("hasOne(10) -> " + hasOne(10));
		System.out.println("hasOne(22) -> " + hasOne(22));
		System.out.println("hasOne(220) -> " + hasOne(220));
		System.out.println("hasOne(212) -> " + hasOne(212));
		System.out.println("hasOne(1) -> " + hasOne(1));
		System.out.println("hasOne(9) -> " + hasOne(9));
		System.out.println("hasOne(211112) -> " + hasOne(211112));
		System.out.println("hasOne(121121) -> " + hasOne(121121));
		System.out.println("hasOne(222222) -> " + hasOne(222222));
		System.out.println("hasOne(56156) -> " + hasOne(56156));
		System.out.println("hasOne(56556) -> " + hasOne(56556));
		printMethod("dividesSelf");
		System.out.println("dividesSelf(128) -> " + dividesSelf(128));
		System.out.println("dividesSelf(12) -> " + dividesSelf(12));
		System.out.println("dividesSelf(120) -> " + dividesSelf(120));
		System.out.println("dividesSelf(122) -> " + dividesSelf(122));
		System.out.println("dividesSelf(13) -> " + dividesSelf(13));
		System.out.println("dividesSelf(32) -> " + dividesSelf(32));
		System.out.println("dividesSelf(22) -> " + dividesSelf(22));
		System.out.println("dividesSelf(42) -> " + dividesSelf(42));
		System.out.println("dividesSelf(212) -> " + dividesSelf(212));
		System.out.println("dividesSelf(213) -> " + dividesSelf(213));
		System.out.println("dividesSelf(162) -> " + dividesSelf(162));
		printMethod("copyEvens");
		System.out.println("copyEvens([3, 2, 4, 5, 8], 2) -> " + Arrays.toString(copyEvens(new int[] {3, 2, 4, 5, 8}, 2)));
		System.out.println("copyEvens([3, 2, 4, 5, 8], 3) -> " + Arrays.toString(copyEvens(new int[] {3, 2, 4, 5, 8}, 3)));
		System.out.println("copyEvens([6, 1, 2, 4, 5, 8], 3) -> " + Arrays.toString(copyEvens(new int[] {6, 1, 2, 4, 5, 8}, 3)));
		System.out.println("copyEvens([6, 1, 2, 4, 5, 8], 4) -> " + Arrays.toString(copyEvens(new int[] {6, 1, 2, 4, 5, 8}, 4)));
		System.out.println("copyEvens([3, 1, 4, 1, 5], 1) -> " + Arrays.toString(copyEvens(new int[] {3, 1, 4, 1, 5}, 1)));
		System.out.println("copyEvens([2], 1) -> " + Arrays.toString(copyEvens(new int[] {2}, 1)));
		System.out.println("copyEvens([6, 2, 4, 8], 2) -> " + Arrays.toString(copyEvens(new int[] {6, 2, 4, 8}, 2)));
		System.out.println("copyEvens([6, 2, 4, 8], 3) -> " + Arrays.toString(copyEvens(new int[] {6, 2, 4, 8}, 3)));
		System.out.println("copyEvens([1, 8, 4], 1) -> " + Arrays.toString(copyEvens(new int[] {1, 8, 4}, 1)));
		System.out.println("copyEvens([1, 8, 4], 2) -> " + Arrays.toString(copyEvens(new int[] {1, 8, 4}, 2)));
		System.out.println("copyEvens([2, 8, 4], 2) -> " + Arrays.toString(copyEvens(new int[] {2, 8, 4}, 2)));
		printMethod("copyEndy");
		System.out.println("copyEndy([9, 11, 90, 22, 6], 2) -> " + Arrays.toString(copyEndy(new int[] {9, 11, 90, 22, 6}, 2)));
		System.out.println("copyEndy([9, 11, 90, 22, 6], 3) -> " + Arrays.toString(copyEndy(new int[] {9, 11, 90, 22, 6}, 3)));
		System.out.println("copyEndy([12, 1, 1, 13, 0, 20], 2) -> " + Arrays.toString(copyEndy(new int[] {12, 1, 1, 13, 0, 20}, 2)));
		System.out.println("copyEndy([12, 1, 1, 13, 0, 20], 3) -> " + Arrays.toString(copyEndy(new int[] {12, 1, 1, 13, 0, 20}, 3)));
		System.out.println("copyEndy([0], 1) -> " + Arrays.toString(copyEndy(new int[] {0}, 1)));
		System.out.println("copyEndy([10, 11, 90], 2) -> " + Arrays.toString(copyEndy(new int[] {10, 11, 90}, 2)));
		System.out.println("copyEndy([90, 22, 100], 2) -> " + Arrays.toString(copyEndy(new int[] {90, 22, 100}, 2)));
		System.out.println("copyEndy([12, 11, 10, 89, 101, 4], 1) -> " + Arrays.toString(copyEndy(new int[] {12, 11, 10, 89, 101, 4}, 1)));
		System.out.println("copyEndy([13, 2, 2, 0], 2) -> " + Arrays.toString(copyEndy(new int[] {13, 2, 2, 0}, 2)));
		System.out.println("copyEndy([13, 2, 13, 2, 0, 30], 2) -> " + Arrays.toString(copyEndy(new int[] {13, 2, 13, 2, 0, 30}, 2)));
		System.out.println("copyEndy([13, 2, 13, 2, 0, 30], 3) -> " + Arrays.toString(copyEndy(new int[] {13, 2, 13, 2, 0, 30}, 3)));
		printMethod("matchUp");
		System.out.println("matchUp([\"aa\", \"bb\", \"cc\"], [\"aaa\", \"xx\", \"bb\"]) -> " + matchUp(new String[] {"aa", "bb", "cc"}, new String[] {"aaa", "xx", "bb"}));
		System.out.println("matchUp([\"aa\", \"bb\", \"cc\"], [\"aaa\", \"b\", \"bb\"]) -> " + matchUp(new String[] {"aa", "bb", "cc"}, new String[] {"aaa", "b", "bb"}));
		System.out.println("matchUp([\"aa\", \"bb\", \"cc\"], [\"\", \"\", \"ccc\"]) -> " + matchUp(new String[] {"aa", "bb", "cc"}, new String[] {"", "", "ccc"}));
		System.out.println("matchUp([\"\", \"\", \"ccc\"], [\"aa\", \"bb\", \"cc\"]) -> " + matchUp(new String[] {"", "", "ccc"}, new String[] {"aa", "bb", "cc"}));
		System.out.println("matchUp([\"\", \"\", \"\"], [\"\", \"bb\", \"cc\"]) -> " + matchUp(new String[] {"", "", ""}, new String[] {"", "bb", "cc"}));
		System.out.println("matchUp([\"aa\", \"bb\", \"cc\"], [\"\", \"\", \"\"]) -> " + matchUp(new String[] {"aa", "bb", "cc"}, new String[] {"", "", ""}));
		System.out.println("matchUp([\"aa\", \"\", \"ccc\"], [\"\", \"bb\", \"cc\"]) -> " + matchUp(new String[] {"aa", "", "ccc"}, new String[] {"", "bb", "ccc"}));
		System.out.println("matchUp([\"x\", \"y\", \"z\"], [\"y\", \"z\", \"x\"]) -> " + matchUp(new String[] {"x", "y", "z"}, new String[] {"y", "z", "x"}));
		System.out.println("matchUp([\"\", \"y\", \"z\"], [\"\", \"y\", \"x\"]) -> " + matchUp(new String[] {"", "y", "z"}, new String[] {"", "y", "x"}));
		System.out.println("matchUp([\"x\", \"y\", \"z\"], [\"xx\", \"yyy\", \"zzz\"]) -> " + matchUp(new String[] {"x", "y", "z"}, new String[] {"xx", "yyy", "zzz"}));
		System.out.println("matchUp([\"x\", \"y\", \"z\"], [\"xx\", \"yyy\", \"\"]) -> " + matchUp(new String[] {"x", "y", "z"}, new String[] {"xx", "yyy", ""}));
		System.out.println("matchUp([\"b\", \"x\", \"y\", \"z\"], [\"a\", \"xx\", \"yyy\", \"zzz\"]) -> " + matchUp(new String[] {"b", "x", "y", "z"}, new String[] {"a", "xx", "yyy", "zzz"}));
		System.out.println("matchUp([\"aaa\", \"bb\", \"c\"], [\"aaa\", \"xx\", \"bb\"]) -> " + matchUp(new String[] {"aaa", "bb", "c"}, new String[] {"aaa", "xx", "bb"}));
		printMethod("scoreUp");
		System.out.println("scoreUp([\"a\", \"a\", \"b\", \"b\"], [\"a\", \"c\", \"b\", \"c\"]) -> " + scoreUp(new String[] {"a", "a", "b", "b"}, new String[] {"a", "c", "b", "c"}));
		System.out.println("scoreUp([\"a\", \"a\", \"b\", \"b\"], [\"a\", \"a\", \"b\", \"c\"]) -> " + scoreUp(new String[] {"a", "a", "b", "b"}, new String[] {"a", "a", "b", "c"}));
		System.out.println("scoreUp([\"a\", \"a\", \"b\", \"b\"], [\"a\", \"a\", \"b\", \"b\"]) -> " + scoreUp(new String[] {"a", "a", "b", "b"}, new String[] {"a", "a", "b", "b"}));
		System.out.println("scoreUp([\"a\", \"a\", \"b\", \"b\"], [\"?\", \"c\", \"b\", \"?\"]) -> " + scoreUp(new String[] {"a", "a", "b", "b"}, new String[] {"?", "c", "b", "?"}));
		System.out.println("scoreUp([\"a\", \"a\", \"b\", \"b\"], [\"?\", \"c\", \"?\", \"?\"]) -> " + scoreUp(new String[] {"a", "a", "b", "b"}, new String[] {"?", "c", "?", "?"}));
		System.out.println("scoreUp([\"a\", \"a\", \"b\", \"b\"], [\"c\", \"?\", \"b\", \"b\"]) -> " + scoreUp(new String[] {"a", "a", "b", "b"}, new String[] {"c", "?", "b", "b"}));
		System.out.println("scoreUp([\"a\", \"a\", \"b\", \"b\"], [\"c\", \"?\", \"b\", \"?\"]) -> " + scoreUp(new String[] {"a", "a", "b", "b"}, new String[] {"c", "?", "b", "?"}));
		System.out.println("scoreUp([\"a\", \"b\", \"c\"], [\"a\", \"c\", \"b\"]) -> " + scoreUp(new String[] {"a", "b", "c"}, new String[] {"a", "c", "b"}));
		System.out.println("scoreUp([\"a\", \"a\", \"b\", \"b\", \"c\", \"c\"], [\"a\", \"c\", \"a\", \"c\", \"a\", \"c\"]) -> " + scoreUp(new String[] {"a", "a", "b", "b", "c", "c"}, new String[] {"a", "c", "a", "c", "a", "c"}));
		System.out.println("scoreUp([\"a\", \"a\", \"b\", \"b\", \"c\", \"c\"], [\"a\", \"c\", \"?\", \"?\", \"a\", \"c\"]) -> " + scoreUp(new String[] {"a", "a", "b", "b", "c", "c"}, new String[] {"a", "c", "?", "?", "a", "c"}));
		System.out.println("scoreUp([\"a\", \"a\", \"b\", \"b\", \"c\", \"c\"], [\"a\", \"c\", \"?\", \"?\", \"c\", \"c\"]) -> " + scoreUp(new String[] {"a", "a", "b", "b", "c", "c"}, new String[] {"a", "c", "?", "?", "c", "c"}));
		System.out.println("scoreUp([\"a\", \"b\", \"c\"], [\"a\", \"b\", \"c\"]) -> " + scoreUp(new String[] {"a", "b", "c"}, new String[] {"a", "b", "c"}));
		printMethod("wordsWithout");
		System.out.println("wordsWithout([\"a\", \"b\", \"c\", \"a\"], \"a\") -> " + HelperMethods.formatStringArray(wordsWithout(new String[] {"a", "b", "c", "a"}, "a")));
		System.out.println("wordsWithout([\"a\", \"b\", \"c\", \"a\"], \"b\") -> " + HelperMethods.formatStringArray(wordsWithout(new String[] {"a", "b", "c", "a"}, "b")));
		System.out.println("wordsWithout([\"a\", \"b\", \"c\", \"a\"], \"c\") -> " + HelperMethods.formatStringArray(wordsWithout(new String[] {"a", "b", "c", "a"}, "c")));
		System.out.println("wordsWithout([\"b\", \"c\", \"a\", \"a\"], \"b\") -> " + HelperMethods.formatStringArray(wordsWithout(new String[] {"b", "c", "a", "a"}, "b")));
		System.out.println("wordsWithout([\"xx\", \"yyy\", \"x\", \"yy\", \"x\"], \"x\") -> " + HelperMethods.formatStringArray(wordsWithout(new String[] {"xx", "yyy", "x", "yy", "x"}, "x")));
		System.out.println("wordsWithout([\"xx\", \"yyy\", \"x\", \"yy\", \"x\"], \"yy\") -> " + HelperMethods.formatStringArray(wordsWithout(new String[] {"xx", "yyy", "x", "yy", "x"}, "yy")));
		System.out.println("wordsWithout([\"aa\", \"ab\", \"ac\", \"aa\"], \"aa\") -> " + HelperMethods.formatStringArray(wordsWithout(new String[] {"aa", "ab", "ac", "aa"}, "aa")));
		printMethod("scoresSpecial");
		System.out.println("scoresSpecial([12, 10, 4], [2, 20, 30]) -> " + scoresSpecial(new int[] {12, 10, 4}, new int[] {2, 20, 30}));
		System.out.println("scoresSpecial([20, 10, 4], [2, 20, 10]) -> " + scoresSpecial(new int[] {20, 10, 4}, new int[] {2, 20, 10}));
		System.out.println("scoresSpecial([12, 11, 4], [2, 20, 31]) -> " + scoresSpecial(new int[] {12, 11, 4}, new int[] {2, 20, 31}));
		System.out.println("scoresSpecial([1, 20, 2, 50], [3, 4, 5]) -> " + scoresSpecial(new int[] {1, 20, 2, 50}, new int[] {3, 4, 5}));
		System.out.println("scoresSpecial([3, 4, 5], [1, 50, 2, 20]) -> " + scoresSpecial(new int[] {3, 4, 5}, new int[] {1, 50, 2, 20}));
		System.out.println("scoresSpecial([10, 4, 20, 30], [20]) -> " + scoresSpecial(new int[] {10, 4, 20, 30}, new int[] {20}));
		System.out.println("scoresSpecial([10, 4, 20, 30], [3, 20, 99]) -> " + scoresSpecial(new int[] {10, 4, 20, 30}, new int[] {3, 20, 99}));
		System.out.println("scoresSpecial([10, 4, 20, 30], [30, 20, 99]) -> " + scoresSpecial(new int[] {10, 4, 20, 30}, new int[] {30, 20, 99}));
		System.out.println("scoresSpecial([], [2]) -> " + scoresSpecial(new int[] {}, new int[] {2}));
		System.out.println("scoresSpecial([], [20]) -> " + scoresSpecial(new int[] {}, new int[] {20}));
		System.out.println("scoresSpecial([14, 10, 4], [4, 20, 30]) -> " + scoresSpecial(new int[] {14, 10, 4}, new int[] {4, 20, 30}));
		printMethod("sumHeights");
		System.out.println("sumHeights([5, 3, 6, 7, 2], 2, 4) -> " + sumHeights(new int[] {5, 3, 6, 7, 2}, 2, 4));
		System.out.println("sumHeights([5, 3, 6, 7, 2], 0, 1) -> " + sumHeights(new int[] {5, 3, 6, 7, 2}, 0, 1));
		System.out.println("sumHeights([5, 3, 6, 7, 2], 0, 4) -> " + sumHeights(new int[] {5, 3, 6, 7, 2}, 0, 4));
		System.out.println("sumHeights([5, 3, 6, 7, 2], 1, 1) -> " + sumHeights(new int[] {5, 3, 6, 7, 2}, 1, 1));
		System.out.println("sumHeights([1, 2, 3, 4, 5, 4, 3, 2, 10], 0, 3) -> " + sumHeights(new int[] {1, 2, 3, 4, 5, 4, 3, 2, 10}, 0, 3));
		System.out.println("sumHeights([1, 2, 3, 4, 5, 4, 3, 2, 10], 4, 8) -> " + sumHeights(new int[] {1, 2, 3, 4, 5, 4, 3, 2, 10}, 4, 8));
		System.out.println("sumHeights([1, 2, 3, 4, 5, 4, 3, 2, 10], 7, 8) -> " + sumHeights(new int[] {1, 2, 3, 4, 5, 4, 3, 2, 10}, 7, 8));
		System.out.println("sumHeights([1, 2, 3, 4, 5, 4, 3, 2, 10], 8, 8) -> " + sumHeights(new int[] {1, 2, 3, 4, 5, 4, 3, 2, 10}, 8, 8));
		System.out.println("sumHeights([1, 2, 3, 4, 5, 4, 3, 2, 10], 2, 2) -> " + sumHeights(new int[] {1, 2, 3, 4, 5, 4, 3, 2, 10}, 2, 2));
		System.out.println("sumHeights([1, 2, 3, 4, 5, 4, 3, 2, 10], 3, 6) -> " + sumHeights(new int[] {1, 2, 3, 4, 5, 4, 3, 2, 10}, 3, 6));
		System.out.println("sumHeights([10, 8, 7, 7, 7, 6, 7], 1, 4) -> " + sumHeights(new int[] {10, 8, 7, 7, 7, 6, 7}, 1, 4));
		System.out.println("sumHeights([10, 8, 7, 7, 7, 6, 7], 1, 5) -> " + sumHeights(new int[] {10, 8, 7, 7, 7, 6, 7}, 1, 5));
		printMethod("sumHeights2");
		System.out.println("sumHeights2([5, 3, 6, 7, 2], 2, 4) -> " + sumHeights2(new int[] {5, 3, 6, 7, 2}, 2, 4));
		System.out.println("sumHeights2([5, 3, 6, 7, 2], 0, 1) -> " + sumHeights2(new int[] {5, 3, 6, 7, 2}, 0, 1));
		System.out.println("sumHeights2([5, 3, 6, 7, 2], 0, 4) -> " + sumHeights2(new int[] {5, 3, 6, 7, 2}, 0, 4));
		System.out.println("sumHeights2([5, 3, 6, 7, 2], 1, 1) -> " + sumHeights2(new int[] {5, 3, 6, 7, 2}, 1, 1));
		System.out.println("sumHeights2([1, 2, 3, 4, 5, 4, 3, 2, 10], 0, 3) -> " + sumHeights2(new int[] {1, 2, 3, 4, 5, 4, 3, 2, 10}, 0, 3));
		System.out.println("sumHeights2([1, 2, 3, 4, 5, 4, 3, 2, 10], 4, 8) -> " + sumHeights2(new int[] {1, 2, 3, 4, 5, 4, 3, 2, 10}, 4, 8));
		System.out.println("sumHeights2([1, 2, 3, 4, 5, 4, 3, 2, 10], 7, 8) -> " + sumHeights2(new int[] {1, 2, 3, 4, 5, 4, 3, 2, 10}, 7, 8));
		System.out.println("sumHeights2([1, 2, 3, 4, 5, 4, 3, 2, 10], 8, 8) -> " + sumHeights2(new int[] {1, 2, 3, 4, 5, 4, 3, 2, 10}, 8, 8));
		System.out.println("sumHeights2([1, 2, 3, 4, 5, 4, 3, 2, 10], 2, 2) -> " + sumHeights2(new int[] {1, 2, 3, 4, 5, 4, 3, 2, 10}, 2, 2));
		System.out.println("sumHeights2([1, 2, 3, 4, 5, 4, 3, 2, 10], 3, 6) -> " + sumHeights2(new int[] {1, 2, 3, 4, 5, 4, 3, 2, 10}, 3, 6));
		System.out.println("sumHeights2([10, 8, 7, 7, 7, 6, 7], 1, 4) -> " + sumHeights2(new int[] {10, 8, 7, 7, 7, 6, 7}, 1, 4));
		System.out.println("sumHeights2([10, 8, 7, 7, 7, 6, 7], 1, 5) -> " + sumHeights2(new int[] {10, 8, 7, 7, 7, 6, 7}, 1, 5));
		printMethod("bigHeights");
		System.out.println("bigHeights([5, 3, 6, 7, 2], 2, 4) -> " + bigHeights(new int[] {5, 3, 6, 7, 2}, 2, 4));
		System.out.println("bigHeights([5, 3, 6, 7, 2], 0, 1) -> " + bigHeights(new int[] {5, 3, 6, 7, 2}, 0, 1));
		System.out.println("bigHeights([5, 3, 6, 7, 2], 0, 4) -> " + bigHeights(new int[] {5, 3, 6, 7, 2}, 0, 4));
		System.out.println("bigHeights([5, 3, 6, 7, 3], 0, 4) -> " + bigHeights(new int[] {5, 3, 6, 7, 3}, 0, 4));
		System.out.println("bigHeights([5, 3, 6, 7, 2], 1, 1) -> " + bigHeights(new int[] {5, 3, 6, 7, 2}, 1, 1));
		System.out.println("bigHeights([5, 13, 6, 7, 2], 1, 2) -> " + bigHeights(new int[] {5, 13, 6, 7, 2}, 1, 2));
		System.out.println("bigHeights([5, 13, 6, 7, 2], 0, 2) -> " + bigHeights(new int[] {5, 13, 6, 7, 2}, 0, 2));
		System.out.println("bigHeights([5, 13, 6, 7, 2], 1, 4) -> " + bigHeights(new int[] {5, 13, 6, 7, 2}, 1, 4));
		System.out.println("bigHeights([5, 13, 6, 7, 2], 0, 4) -> " + bigHeights(new int[] {5, 13, 6, 7, 2}, 0, 4));
		System.out.println("bigHeights([5, 13, 6, 7, 2], 0, 3) -> " + bigHeights(new int[] {5, 13, 6, 7, 2}, 0, 3));
		System.out.println("bigHeights([1, 2, 3, 4, 5, 4, 3, 2, 10], 0, 3) -> " + bigHeights(new int[] {1, 2, 3, 4, 5, 4, 3, 2, 10}, 0, 3));
		System.out.println("bigHeights([1, 2, 3, 4, 5, 4, 3, 2, 10], 4, 8) -> " + bigHeights(new int[] {1, 2, 3, 4, 5, 4, 3, 2, 10}, 4, 8));
		System.out.println("bigHeights([1, 2, 3, 14, 5, 4, 3, 2, 10], 0, 3) -> " + bigHeights(new int[] {1, 2, 3, 14, 5, 4, 3, 2, 10}, 0, 3));
		System.out.println("bigHeights([1, 2, 3, 14, 5, 4, 3, 2, 10], 7, 8) -> " + bigHeights(new int[] {1, 2, 3, 14, 5, 4, 3, 2, 10}, 7, 8));
		System.out.println("bigHeights([1, 2, 3, 14, 5, 4, 3, 2, 10], 3, 8) -> " + bigHeights(new int[] {1, 2, 3, 14, 5, 4, 3, 2, 10}, 3, 8));
		System.out.println("bigHeights([1, 2, 3, 14, 5, 4, 3, 2, 10], 2, 8) -> " + bigHeights(new int[] {1, 2, 3, 14, 5, 4, 3, 2, 10}, 2, 8));
		printMethod("userCompare");
		System.out.println("userCompare(\"bb\", 1, \"zz\", 2) -> " + userCompare("bb", 1, "zz", 2));
		System.out.println("userCompare(\"bb\", 1, \"aa\", 2) -> " + userCompare("bb", 1, "aa", 2));
		System.out.println("userCompare(\"bb\", 1, \"bb\", 1) -> " + userCompare("bb", 1, "bb", 1));
		System.out.println("userCompare(\"bb\", 5, \"bb\", 1) -> " + userCompare("bb", 5, "bb", 1));
		System.out.println("userCompare(\"bb\", 5, \"bb\", 10) -> " + userCompare("bb", 5, "bb", 10));
		System.out.println("userCompare(\"adam\", 1, \"bob\", 2) -> " + userCompare("adam", 1, "bob", 2));
		System.out.println("userCompare(\"bob\", 1, \"bob\", 2) -> " + userCompare("bob", 1, "bob", 2));
		System.out.println("userCompare(\"bzb\", 1, \"bob\", 2) -> " + userCompare("bzb", 1, "bob", 2));
		printMethod("mergeTwo");
		System.out.println("mergeTwo([\"a\", \"c\", \"z\"], [\"b\", \"f\", \"z\"], 3) -> " + HelperMethods.formatStringArray(mergeTwo(new String[] {"a", "c", "z"}, new String[] {"b", "f", "z"}, 3)));
		System.out.println("mergeTwo([\"a\", \"c\", \"z\"], [\"c\", \"f\", \"z\"], 3) -> " + HelperMethods.formatStringArray(mergeTwo(new String[] {"a", "c", "z"}, new String[] {"c", "f", "z"}, 3)));
		System.out.println("mergeTwo([\"f\", \"g\", \"z\"], [\"c\", \"f\", \"g\"], 3) -> " + HelperMethods.formatStringArray(mergeTwo(new String[] {"f", "g", "z"}, new String[] {"c", "f", "g"}, 3)));
		System.out.println("mergeTwo([\"a\", \"c\", \"z\"], [\"a\", \"c\", \"z\"], 3) -> " + HelperMethods.formatStringArray(mergeTwo(new String[] {"a", "c", "z"}, new String[] {"a", "c", "z"}, 3)));
		System.out.println("mergeTwo([\"a\", \"b\", \"c\", \"z\"], [\"a\", \"c\", \"z\"], 3) -> " + HelperMethods.formatStringArray(mergeTwo(new String[] {"a", "b", "c", "z"}, new String[] {"a", "c", "z"}, 3)));
		System.out.println("mergeTwo([\"a\", \"c\", \"z\"], [\"a\", \"b\", \"c\", \"z\"], 3) -> " + HelperMethods.formatStringArray(mergeTwo(new String[] {"a", "c", "z"}, new String[] {"a", "b", "c", "z"}, 3)));
		System.out.println("mergeTwo([\"a\", \"c\", \"z\"], [\"a\", \"c\", \"z\"], 2) -> " + HelperMethods.formatStringArray(mergeTwo(new String[] {"a", "c", "z"}, new String[] {"a", "c", "z"}, 2)));
		System.out.println("mergeTwo([\"a\", \"c\", \"z\"], [\"a\", \"c\", \"y\", \"z\"], 3) -> " + HelperMethods.formatStringArray(mergeTwo(new String[] {"a", "c", "z"}, new String[] {"a", "c", "y", "z"}, 3)));
		System.out.println("mergeTwo([\"x\", \"y\", \"z\"], [\"a\", \"b\", \"z\"], 3) -> " + HelperMethods.formatStringArray(mergeTwo(new String[] {"x", "y", "z"}, new String[] {"a", "b", "z"}, 3)));
		printMethod("commonTwo");
		System.out.println("commonTwo([\"a\", \"c\", \"x\"], [\"b\", \"c\", \"d\", \"x\"]) -> " + commonTwo(new String[] {"a", "c", "x"}, new String[] {"b", "c", "d", "x"}));
		System.out.println("commonTwo([\"a\", \"c\", \"x\"], [\"a\", \"b\", \"c\", \"x\", \"z\"]) -> " + commonTwo(new String[] {"a", "c", "x"}, new String[] {"a", "b", "c", "x", "z"}));
		System.out.println("commonTwo([\"a\", \"b\", \"c\"], [\"a\", \"b\", \"c\"]) -> " + commonTwo(new String[] {"a", "b", "c"}, new String[] {"a", "b", "c"}));
		System.out.println("commonTwo([\"a\", \"a\", \"b\", \"b\", \"c\"], [\"a\", \"b\", \"c\"]) -> " + commonTwo(new String[] {"a", "a", "b", "b", "c"}, new String[] {"a", "b", "c"}));
		System.out.println("commonTwo([\"a\", \"a\", \"b\", \"b\", \"c\"], [\"a\", \"b\", \"b\", \"b\", \"c\"]) -> " + commonTwo(new String[] {"a", "a", "b", "b", "c"}, new String[] {"a", "b", "b", "b", "c"}));
		System.out.println("commonTwo([\"a\", \"a\", \"b\", \"b\", \"c\"], [\"a\", \"b\", \"b\", \"c\", \"c\"]) -> " + commonTwo(new String[] {"a", "a", "b", "b", "c"}, new String[] {"a", "b", "b", "c", "c"}));
		System.out.println("commonTwo([\"b\", \"b\", \"b\", \"b\", \"c\"], [\"a\", \"b\", \"b\", \"b\", \"c\"]) -> " + commonTwo(new String[] {"b", "b", "b", "b", "c"}, new String[] {"a", "b", "b", "b", "c"}));
		System.out.println("commonTwo([\"a\", \"b\", \"c\", \"c\", \"d\"], [\"a\", \"b\", \"b\", \"c\", \"d\", \"d\"]) -> " + commonTwo(new String[] {"a", "b", "c", "c", "d"}, new String[] {"a", "b", "b", "c", "d", "d"}));
		System.out.println("commonTwo([\"a\", \"a\", \"b\", \"b\", \"c\"], [\"b\", \"b\", \"b\"]) -> " + commonTwo(new String[] {"a", "a", "b", "b", "c"}, new String[] {"b", "b", "b"}));
		System.out.println("commonTwo([\"a\", \"a\", \"b\", \"b\", \"c\"], [\"c\", \"c\"]) -> " + commonTwo(new String[] {"a", "a", "b", "b", "c"}, new String[] {"c", "c"}));
		System.out.println("commonTwo([\"a\", \"a\", \"b\", \"b\", \"c\"], [\"b\", \"b\", \"b\", \"x\"]) -> " + commonTwo(new String[] {"a", "a", "b", "b", "c"}, new String[] {"b", "b", "b", "x"}));
		System.out.println("commonTwo([\"a\", \"a\", \"b\", \"b\", \"c\"], [\"b\", \"b\"]) -> " + commonTwo(new String[] {"a", "a", "b", "b", "c"}, new String[] {"b", "b"}));
		System.out.println("commonTwo([\"a\"], [\"a\", \"b\"]) -> " + commonTwo(new String[] {"a"}, new String[] {"a", "b"}));
		System.out.println("commonTwo([\"a\"], [\"b\"]) -> " + commonTwo(new String[] {"a"}, new String[] {"b"}));
		System.out.println("commonTwo([\"a\", \"a\"], [\"b\", \"b\"]) -> " + commonTwo(new String[] {"a", "a"}, new String[] {"b", "b"}));
		System.out.println("commonTwo([\"a\", \"b\"], [\"a\", \"b\"]) -> " + commonTwo(new String[] {"a", "b"}, new String[] {"a", "b"}));
	}
}
