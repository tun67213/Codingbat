package src;

import java.util.Arrays;

/**
 * @author arvindhvelrajan
 */
public class Array_1 extends HelperMethods
{

	/**
	 * This method welcomes the user to this program.
	 */
	public void welcome()
	{
		System.out.println("\n\nArray-1 Methods\n");
	}

	/**
	 * Given an array of ints, return true if 6 appears as either the first or last element in the array. The array will be length 1 or more.
	 *
	 * firstLast6([1, 2, 6]) → true
	 * firstLast6([6, 1, 2, 3]) → true
	 * firstLast6([13, 6, 1, 2, 3]) → false
	 */
	public boolean firstLast6(int[] nums)
	{
		if(nums[0] == 6 || nums[nums.length - 1] == 6)
		{
			return true;
		}
		return false;
	}

	/**
	 * Given an array of ints, return true if the array is length 1 or more, and the first element and the last element are equal.
	 *
	 * sameFirstLast([1, 2, 3]) → false
	 * sameFirstLast([1, 2, 3, 1]) → true
	 * sameFirstLast([1, 2, 1]) → true
	 */
	public boolean sameFirstLast(int[] nums)
	{
		if(nums.length > 0 && nums[0] == nums[nums.length - 1])
		{
			return true;
		}
		return false;
	}

	/**
	 * Return an int array length 3 containing the first 3 digits of pi, {3, 1, 4}.
	 *
	 * makePi() → [3, 1, 4]
	 */
	public int[] makePi()
	{
		// The phrase new int[] or new String[] or whatever type you desire basically creates an immutable array that cannot be modified.
		// It can be done in one line like below.
		return new int[] {3, 1, 4};
	}

	/**
	 * Given 2 arrays of ints, a and b, return true if they have the same first element or they have the same last element. Both arrays will be length 1 or more.
	 *
	 * commonEnd([1, 2, 3], [7, 3]) → true
	 * commonEnd([1, 2, 3], [7, 3, 2]) → false
	 * commonEnd([1, 2, 3], [1, 3]) → true
	 */
	public boolean commonEnd(int[] a, int[] b)
	{
		if(a.length > 0 && b.length > 0 && (a[0] == b[0] || a[a.length - 1] == b[b.length - 1]))
		{
			return true;
		}
		return false;
	}

	/**
	 * Given an array of ints length 3, return the sum of all the elements.
	 *
	 * sum3([1, 2, 3]) → 6
	 * sum3([5, 11, 2]) → 18
	 * sum3([7, 0, 0]) → 7
	 */
	public int sum3(int[] nums)
	{
		int sum = 0;
		for(int i = 0; i < nums.length; i++)
		{
			sum += nums[i];
		}
		return sum;
	}
	// Below is an alternative implementation of the sum3() method above, but using a different type of for-loop.
	// Think about how the method below is the same as the method above.
	private int sum3_forEach(int[] nums)
	{
		int sum = 0;
		for(int num : nums)
		{
			sum += num;
		}
		return sum;
	}

	/**
	 * Given an array of ints length 3, return an array with the elements "rotated left" so {1, 2, 3} yields {2, 3, 1}.
	 *
	 * rotateLeft3([1, 2, 3]) → [2, 3, 1]
	 * rotateLeft3([5, 11, 9]) → [11, 9, 5]
	 * rotateLeft3([7, 0, 0]) → [0, 0, 7]
	 */
	public int[] rotateLeft3(int[] nums)
	{
		throw new UnsupportedOperationException("Not implemented yet");
	}

	/**
	 * Given an array of ints length 3, return a new array with the elements in reverse order, so {1, 2, 3} becomes {3, 2, 1}.
	 *
	 * reverse3([1, 2, 3]) → [3, 2, 1]
	 * reverse3([5, 11, 9]) → [9, 11, 5]
	 * reverse3([7, 0, 0]) → [0, 0, 7]
	 */
	public int[] reverse3(int[] nums)
	{
		throw new UnsupportedOperationException("Not implemented yet");
	}

	/**
	 * Given an array of ints length 3, figure out which is larger, the first or last element in the array, and set all the other elements to be that value. Return the changed array.
	 *
	 * maxEnd3([1, 2, 3]) → [3, 3, 3]
	 * maxEnd3([11, 5, 9]) → [11, 11, 11]
	 * maxEnd3([2, 11, 3]) → [3, 3, 3]
	 */
	public int[] maxEnd3(int[] nums)
	{
		throw new UnsupportedOperationException("Not implemented yet");
	}

	/**
	 * Given an array of ints, return the sum of the first 2 elements in the array. If the array length is less than 2, just sum up the elements that exist, returning 0 if the array is length 0.
	 *
	 * sum2([1, 2, 3]) → 3
	 * sum2([1, 1]) → 2
	 * sum2([1, 1, 1, 1]) → 2
	 */
	public int sum2(int[] nums)
	{
		throw new UnsupportedOperationException("Not implemented yet");
	}

	/**
	 * Given 2 int arrays, a and b, each length 3, return a new array length 2 containing their middle elements.
	 *
	 * middleWay([1, 2, 3], [4, 5, 6]) → [2, 5]
	 * middleWay([7, 7, 7], [3, 8, 0]) → [7, 8]
	 * middleWay([5, 2, 9], [1, 4, 5]) → [2, 4]
	 */
	public int[] middleWay(int[] a, int[] b)
	{
		throw new UnsupportedOperationException("Not implemented yet");
	}

	/**
	 * Given an array of ints, return a new array length 2 containing the first and last elements from the original array. The original array will be length 1 or more.
	 *
	 * makeEnds([1, 2, 3]) → [1, 3]
	 * makeEnds([1, 2, 3, 4]) → [1, 4]
	 * makeEnds([7, 4, 6, 2]) → [7, 2]
	 */
	public int[] makeEnds(int[] nums)
	{
		throw new UnsupportedOperationException("Not implemented yet");
	}

	/**
	 * Given an int array length 2, return true if it contains a 2 or a 3.
	 *
	 * has23([2, 5]) → true
	 * has23([4, 3]) → true
	 * has23([4, 5]) → false
	 */
	public boolean has23(int[] nums)
	{
		throw new UnsupportedOperationException("Not implemented yet");
	}

	/**
	 * Given an int array length 2, return true if it does not contain a 2 or 3.
	 *
	 * no23([4, 5]) → true
	 * no23([4, 2]) → false
	 * no23([3, 5]) → false
	 */
	public boolean no23(int[] nums)
	{
		throw new UnsupportedOperationException("Not implemented yet");
	}

	/**
	 * Given an int array, return a new array with double the length where its last element is the same as the original array, and all the other elements are 0. The original array will be length 1 or more. Note: by default, a new int array contains all 0's.
	 *
	 * makeLast([4, 5, 6]) → [0, 0, 0, 0, 0, 6]
	 * makeLast([1, 2]) → [0, 0, 0, 2]
	 * makeLast([3]) → [0, 3]
	 */
	public int[] makeLast(int[] nums)
	{
		throw new UnsupportedOperationException("Not implemented yet");
	}

	/**
	 * Given an int array, return true if the array contains 2 twice, or 3 twice. The array will be length 0, 1, or 2.
	 *
	 * double23([2, 2]) → true
	 * double23([3, 3]) → true
	 * double23([2, 3]) → false
	 */
	public boolean double23(int[] nums)
	{
		throw new UnsupportedOperationException("Not implemented yet");
	}

	/**
	 * Given an int array length 3, if there is a 2 in the array immediately followed by a 3, set the 3 element to 0. Return the changed array.
	 *
	 * fix23([1, 2, 3]) → [1, 2, 0]
	 * fix23([2, 3, 5]) → [2, 0, 5]
	 * fix23([1, 2, 1]) → [1, 2, 1]
	 */
	public int[] fix23(int[] nums)
	{
		throw new UnsupportedOperationException("Not implemented yet");
	}

	/**
	 * Start with 2 int arrays, a and b, of any length. Return how many of the arrays have 1 as their first element.
	 *
	 * start1([1, 2, 3], [1, 3]) → 2
	 * start1([7, 2, 3], [1]) → 1
	 * start1([1, 2], []) → 1
	 */
	public int start1(int[] a, int[] b)
	{
		throw new UnsupportedOperationException("Not implemented yet");
	}

	/**
	 * Start with 2 int arrays, a and b, each length 2. Consider the sum of the values in each array. Return the array which has the largest sum. In event of a tie, return a.
	 *
	 * biggerTwo([1, 2], [3, 4]) → [3, 4]
	 * biggerTwo([3, 4], [1, 2]) → [3, 4]
	 * biggerTwo([1, 1], [1, 2]) → [1, 2]
	 */
	public int[] biggerTwo(int[] a, int[] b)
	{
		throw new UnsupportedOperationException("Not implemented yet");
	}

	/**
	 * Given an array of ints of even length, return a new array length 2 containing the middle two elements from the original array. The original array will be length 2 or more.
	 *
	 * makeMiddle([1, 2, 3, 4]) → [2, 3]
	 * makeMiddle([7, 1, 2, 3, 4, 9]) → [2, 3]
	 * makeMiddle([1, 2]) → [1, 2]
	 */
	public int[] makeMiddle(int[] nums)
	{
		throw new UnsupportedOperationException("Not implemented yet");
	}

	/**
	 * Given 2 int arrays, each length 2, return a new array length 4 containing all their elements.
	 *
	 * plusTwo([1, 2], [3, 4]) → [1, 2, 3, 4]
	 * plusTwo([4, 4], [2, 2]) → [4, 4, 2, 2]
	 * plusTwo([9, 2], [3, 4]) → [9, 2, 3, 4]
	 */
	public int[] plusTwo(int[] a, int[] b)
	{
		throw new UnsupportedOperationException("Not implemented yet");
	}

	/**
	 * Given an array of ints, swap the first and last elements in the array. Return the modified array. The array length will be at least 1.
	 *
	 * swapEnds([1, 2, 3, 4]) → [4, 2, 3, 1]
	 * swapEnds([1, 2, 3]) → [3, 2, 1]
	 * swapEnds([8, 6, 7, 9, 5]) → [5, 6, 7, 9, 8]
	 */
	public int[] swapEnds(int[] nums)
	{
		throw new UnsupportedOperationException("Not implemented yet");
	}

	/**
	 * Given an array of ints of odd length, return a new array length 3 containing the elements from the middle of the array. The array length will be at least 3.
	 *
	 * midThree([1, 2, 3, 4, 5]) → [2, 3, 4]
	 * midThree([8, 6, 7, 5, 3, 0, 9]) → [7, 5, 3]
	 * midThree([1, 2, 3]) → [1, 2, 3]
	 */
	public int[] midThree(int[] nums)
	{
		throw new UnsupportedOperationException("Not implemented yet");
	}

	/**
	 * Given an array of ints of odd length, look at the first, last, and middle values in the array and return the largest. The array length will be a least 1.
	 *
	 * maxTriple([1, 2, 3]) → 3
	 * maxTriple([1, 5, 3]) → 5
	 * maxTriple([5, 2, 3]) → 5
	 */
	public int maxTriple(int[] nums)
	{
		throw new UnsupportedOperationException("Not implemented yet");
	}

	/**
	 * Given an int array of any length, return a new array of its first 2 elements. If the array is smaller than length 2, use whatever elements are present.
	 *
	 * frontPiece([1, 2, 3]) → [1, 2]
	 * frontPiece([1, 2]) → [1, 2]
	 * frontPiece([1]) → [1]
	 */
	public int[] frontPiece(int[] nums)
	{
		throw new UnsupportedOperationException("Not implemented yet");
	}

	/**
	 * We'll say that a 1 immediately followed by a 3 in an array is an "unlucky" 1. Return true if the given array contains an unlucky 1 in the first 2 or last 2 positions in the array.
	 *
	 * unlucky1([1, 3, 4, 5]) → true
	 * unlucky1([2, 1, 3, 4, 5]) → true
	 * unlucky1([1, 1, 1]) → false
	 */
	public boolean unlucky1(int[] nums)
	{
		throw new UnsupportedOperationException("Not implemented yet");
	}

	/**
	 * Given 2 int arrays, a and b, return a new array length 2 containing, as much as will fit, the elements from a followed by the elements from b. The arrays may be any length, including 0, but there will be 2 or more elements available between the 2 arrays.
	 *
	 * make2([4, 5], [1, 2, 3]) → [4, 5]
	 * make2([4], [1, 2, 3]) → [4, 1]
	 * make2([], [1, 2]) → [1, 2]
	 */
	public int[] make2(int[] a, int[] b)
	{
		throw new UnsupportedOperationException("Not implemented yet");
	}

	/**
	 * Given 2 int arrays, a and b, of any length, return a new array with the first element of each array. If either array is length 0, ignore that array.
	 *
	 * front11([1, 2, 3], [7, 9, 8]) → [1, 7]
	 * front11([1], [2]) → [1, 2]
	 * front11([1, 7], []) → [1]
	 */
	public int[] front11(int[] a, int[] b)
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
		printMethod("firstLast6");
		System.out.println("firstLast6([1, 2, 6]) -> " + firstLast6(new int[] {1, 2, 6}));
		System.out.println("firstLast6([6, 1, 2, 3]) -> " + firstLast6(new int[] {6, 1, 2, 3}));
		System.out.println("firstLast6([13, 6, 1, 2, 3]) -> " + firstLast6(new int[] {13, 6, 1, 2, 3}));
		System.out.println("firstLast6([13, 6, 1, 2, 6]) -> " + firstLast6(new int[] {13, 6, 1, 2, 6}));
		System.out.println("firstLast6([3, 2, 1]) -> " + firstLast6(new int[] {3, 2, 1}));
		System.out.println("firstLast6([3, 6, 1]) -> " + firstLast6(new int[] {3, 6, 1}));
		System.out.println("firstLast6([3, 6]) -> " + firstLast6(new int[] {3, 6}));
		System.out.println("firstLast6([6]) -> " + firstLast6(new int[] {6}));
		System.out.println("firstLast6([3]) -> " + firstLast6(new int[] {3}));
		System.out.println("firstLast6([5, 6]) -> " + firstLast6(new int[] {5, 6}));
		System.out.println("firstLast6([5, 5]) -> " + firstLast6(new int[] {5, 5}));
		System.out.println("firstLast6([1, 2, 3, 4, 6]) -> " + firstLast6(new int[] {1, 2, 3, 4, 6}));
		System.out.println("firstLast6([1, 2, 3, 4]) -> " + firstLast6(new int[] {1, 2, 3, 4}));
		printMethod("sameFirstLast");
		System.out.println("sameFirstLast([1, 2, 3]) -> " + sameFirstLast(new int[] {1, 2, 3}));
		System.out.println("sameFirstLast([1, 2, 3, 1]) -> " + sameFirstLast(new int[] {1, 2, 3, 1}));
		System.out.println("sameFirstLast([1, 2, 1]) -> " + sameFirstLast(new int[] {1, 2, 1}));
		System.out.println("sameFirstLast([7]) -> " + sameFirstLast(new int[] {7}));
		System.out.println("sameFirstLast([]) -> " + sameFirstLast(new int[] {}));
		System.out.println("sameFirstLast([1, 2, 3, 4, 5, 1]) -> " + sameFirstLast(new int[] {1, 2, 3, 3, 4, 1}));
		System.out.println("sameFirstLast([1, 2, 3, 4, 5, 13]) -> " + sameFirstLast(new int[] {1, 2, 3, 4, 5, 13}));
		System.out.println("sameFirstLast([13, 2, 3, 4, 5, 13]) -> " + sameFirstLast(new int[] {13, 2, 3, 4, 5, 13}));
		System.out.println("sameFirstLast([7, 7]) -> " + sameFirstLast(new int[] {7, 7}));
		printMethod("makePi");
		System.out.println("makePi() -> " + Arrays.toString(makePi()));
		printMethod("commonEnd");
		System.out.println("commonEnd([1, 2, 3], [7, 3]) -> " + commonEnd(new int[] {1, 2, 3}, new int[] {7, 3}));
		System.out.println("commonEnd([1, 2, 3], [7, 3, 2]) -> " + commonEnd(new int[] {1, 2, 3}, new int[] {7, 3, 2}));
		System.out.println("commonEnd([1, 2, 3], [1, 3]) -> " + commonEnd(new int[] {1, 2, 3}, new int[] {1, 3}));
		System.out.println("commonEnd([1, 2, 3], [1]) -> " + commonEnd(new int[] {1, 2, 3}, new int[] {1}));
		System.out.println("commonEnd([1, 2, 3], [2]) -> " + commonEnd(new int[] {1, 2, 3}, new int[] {2}));
		printMethod("sum3");
		System.out.println("sum3([1, 2, 3]) -> " + sum3(new int[] {1, 2, 3}));
		System.out.println("sum3([5, 11, 2]) -> " + sum3(new int[] {5, 11, 2}));
		System.out.println("sum3([7, 0, 0]) -> " + sum3(new int[] {7, 0, 0}));
		System.out.println("sum3([1, 2, 1]) -> " + sum3(new int[] {1, 2, 1}));
		System.out.println("sum3([1, 1, 1]) -> " + sum3(new int[] {1, 1, 1}));
		System.out.println("sum3([2, 7, 2]) -> " + sum3(new int[] {2, 7, 2}));
		printMethod("rotateLeft3");
		System.out.println("rotateLeft3([1, 2, 3]) -> " + Arrays.toString(rotateLeft3(new int[] {1, 2, 3})));
		System.out.println("rotateLeft3([5, 11, 9]) -> " + Arrays.toString(rotateLeft3(new int[] {5, 11, 9})));
		System.out.println("rotateLeft3([7, 0, 0]) -> " + Arrays.toString(rotateLeft3(new int[] {7, 0, 0})));
		System.out.println("rotateLeft3([1, 2, 1]) -> " + Arrays.toString(rotateLeft3(new int[] {1, 2, 1})));
		System.out.println("rotateLeft3([0, 0, 1]) -> " + Arrays.toString(rotateLeft3(new int[] {0, 0, 1})));
		printMethod("reverse3");
		System.out.println("reverse3([1, 2, 3]) -> " + Arrays.toString(reverse3(new int[] {1, 2, 3})));
		System.out.println("reverse3([5, 11, 9]) -> " + Arrays.toString(reverse3(new int[] {5, 11, 9})));
		System.out.println("reverse3([7, 0, 0]) -> " + Arrays.toString(reverse3(new int[] {7, 0, 0})));
		System.out.println("reverse3([2, 1, 2]) -> " + Arrays.toString(reverse3(new int[] {2, 1, 2})));
		System.out.println("reverse3([1, 2, 1]) -> " + Arrays.toString(reverse3(new int[] {1, 2, 1})));
		System.out.println("reverse3([2, 11, 3]) -> " + Arrays.toString(reverse3(new int[] {2, 11, 3})));
		System.out.println("reverse3([0, 6, 5]) -> " + Arrays.toString(reverse3(new int[] {0, 6, 5})));
		System.out.println("reverse3([7, 2, 3]) -> " + Arrays.toString(reverse3(new int[] {7, 2, 3})));
		printMethod("maxEnd3");
		System.out.println("maxEnd3([1, 2, 3]) -> " + Arrays.toString(maxEnd3(new int[] {1, 2, 3})));
		System.out.println("maxEnd3([11, 5, 9]) -> " + Arrays.toString(maxEnd3(new int[] {11, 5, 9})));
		System.out.println("maxEnd3([2, 11, 3]) -> " + Arrays.toString(maxEnd3(new int[] {2, 11, 3})));
		System.out.println("maxEnd3([11, 3, 3]) -> " + Arrays.toString(maxEnd3(new int[] {11, 3, 3})));
		System.out.println("maxEnd3([3, 11, 11]) -> " + Arrays.toString(maxEnd3(new int[] {3, 11, 11})));
		System.out.println("maxEnd3([2, 2, 2]) -> " + Arrays.toString(maxEnd3(new int[] {2, 2, 2})));
		System.out.println("maxEnd3([2, 11, 2]) -> " + Arrays.toString(maxEnd3(new int[] {2, 11, 2})));
		System.out.println("maxEnd3([0, 0, 1]) -> " + Arrays.toString(maxEnd3(new int[] {0, 0, 1})));
		printMethod("sum2");
		System.out.println("sum2([1, 2, 3]) -> " + sum2(new int[] {1, 2, 3}));
		System.out.println("sum2([1, 1]) -> " + sum2(new int[] {1, 1}));
		System.out.println("sum2([1, 1, 1, 1]) -> " + sum2(new int[] {1, 1, 1, 1}));
		System.out.println("sum2([1, 2]) -> " + sum2(new int[] {1, 2}));
		System.out.println("sum2([1]) -> " + sum2(new int[] {1}));
		System.out.println("sum2([]) -> " + sum2(new int[] {}));
		System.out.println("sum2([4, 5, 6]) -> " + sum2(new int[] {4, 5, 6}));
		System.out.println("sum2([4]) -> " + sum2(new int[] {4}));
		printMethod("middleWay");
		System.out.println("middleWay([1, 2, 3], [4, 5, 6]) -> " + Arrays.toString(middleWay(new int[] {1, 2, 3}, new int[] {4, 5, 6})));
		System.out.println("middleWay([7, 7, 7], [3, 8, 0]) -> " + Arrays.toString(middleWay(new int[] {7, 7, 7}, new int[] {3, 8, 0})));
		System.out.println("middleWay([5, 2, 9], [1, 4, 5]) -> " + Arrays.toString(middleWay(new int[] {5, 2, 9}, new int[] {1, 4, 5})));
		System.out.println("middleWay([1, 9, 7], [4, 8, 8]) -> " + Arrays.toString(middleWay(new int[] {1, 9, 7}, new int[] {4, 8, 8})));
		System.out.println("middleWay([1, 2, 3], [3, 1, 4]) -> " + Arrays.toString(middleWay(new int[] {1, 2, 3}, new int[] {3, 1, 4})));
		System.out.println("middleWay([1, 2, 3], [4, 1, 1]) -> " + Arrays.toString(middleWay(new int[] {1, 2, 3}, new int[] {4, 1, 1})));
		printMethod("makeEnds");
		System.out.println("makeEnds([1, 2, 3]) -> " + Arrays.toString(makeEnds(new int[] {1, 2, 3})));
		System.out.println("makeEnds([1, 2, 3, 4]) -> " + Arrays.toString(makeEnds(new int[] {1, 2, 3, 4})));
		System.out.println("makeEnds([7, 4, 6, 2]) -> " + Arrays.toString(makeEnds(new int[] {7, 4, 6, 2})));
		System.out.println("makeEnds([1, 2, 2, 2, 2, 2, 2, 3]) -> " + Arrays.toString(makeEnds(new int[] {1, 2, 2, 2, 2, 2, 2, 3})));
		System.out.println("makeEnds([7, 4]) -> " + Arrays.toString(makeEnds(new int[] {7, 4})));
		System.out.println("makeEnds([7]) -> " + Arrays.toString(makeEnds(new int[] {7})));
		System.out.println("makeEnds([5, 2, 9]) -> " + Arrays.toString(makeEnds(new int[] {5, 2, 9})));
		System.out.println("makeEnds([2, 3, 4, 1]) -> " + Arrays.toString(makeEnds(new int[] {2, 3, 4, 1})));
		printMethod("has23");
		System.out.println("has23([2, 5]) -> " + has23(new int[] {2, 5}));
		System.out.println("has23([4, 3]) -> " + has23(new int[] {4, 3}));
		System.out.println("has23([4, 5]) -> " + has23(new int[] {4, 5}));
		System.out.println("has23([2, 2]) -> " + has23(new int[] {2, 2}));
		System.out.println("has23([3, 2]) -> " + has23(new int[] {3, 2}));
		System.out.println("has23([3, 3]) -> " + has23(new int[] {3, 3}));
		System.out.println("has23([7, 7]) -> " + has23(new int[] {7, 7}));
		System.out.println("has23([3, 9]) -> " + has23(new int[] {3, 9}));
		System.out.println("has23([9, 5]) -> " + has23(new int[] {9, 5}));
		printMethod("no23");
		System.out.println("no23([4, 5]) -> " + no23(new int[] {4, 5}));
		System.out.println("no23([4, 2]) -> " + no23(new int[] {4, 2}));
		System.out.println("no23([3, 5]) -> " + no23(new int[] {3, 5}));
		System.out.println("no23([1, 9]) -> " + no23(new int[] {1, 9}));
		System.out.println("no23([2, 9]) -> " + no23(new int[] {2, 9}));
		System.out.println("no23([1, 3]) -> " + no23(new int[] {1, 3}));
		System.out.println("no23([1, 1]) -> " + no23(new int[] {1, 1}));
		System.out.println("no23([2, 2]) -> " + no23(new int[] {2, 2}));
		System.out.println("no23([3, 3]) -> " + no23(new int[] {3, 3}));
		System.out.println("no23([7, 8]) -> " + no23(new int[] {7, 8}));
		System.out.println("no23([8, 7]) -> " + no23(new int[] {8, 7}));
		printMethod("makeLast");
		System.out.println("makeLast([4, 5, 6]) -> " + Arrays.toString(makeLast(new int[] {4, 5, 6})));
		System.out.println("makeLast([1, 2]) -> " + Arrays.toString(makeLast(new int[] {1, 2})));
		System.out.println("makeLast([3]) -> " + Arrays.toString(makeLast(new int[] {3})));
		System.out.println("makeLast([0]) -> " + Arrays.toString(makeLast(new int[] {0})));
		System.out.println("makeLast([7, 7, 7]) -> " + Arrays.toString(makeLast(new int[] {7, 7, 7})));
		System.out.println("makeLast([3, 1, 4]) -> " + Arrays.toString(makeLast(new int[] {3, 1, 4})));
		System.out.println("makeLast([1, 2, 3, 4]) -> " + Arrays.toString(makeLast(new int[] {1, 2, 3, 4})));
		System.out.println("makeLast([1, 2, 3, 0]) -> " + Arrays.toString(makeLast(new int[] {1, 2, 3, 0})));
		System.out.println("makeLast([2, 4]) -> " + Arrays.toString(makeLast(new int[] {2, 4})));
		printMethod("double23");
		System.out.println("double23([2, 2]) -> " + double23(new int[] {2, 2}));
		System.out.println("double23([3, 3]) -> " + double23(new int[] {3, 3}));
		System.out.println("double23([2, 3]) -> " + double23(new int[] {2, 3}));
		System.out.println("double23([3, 2]) -> " + double23(new int[] {3, 2}));
		System.out.println("double23([4, 5]) -> " + double23(new int[] {4, 5}));
		System.out.println("double23([2]) -> " + double23(new int[] {2}));
		System.out.println("double23([3]) -> " + double23(new int[] {3}));
		System.out.println("double23([]) -> " + double23(new int[] {}));
		System.out.println("double23([3, 4]) -> " + double23(new int[] {3, 4}));
		printMethod("fix23");
		System.out.println("fix23([1, 2, 3]) -> " + Arrays.toString(fix23(new int[] {1, 2, 3})));
		System.out.println("fix23([2, 3, 5]) -> " + Arrays.toString(fix23(new int[] {2, 3, 5})));
		System.out.println("fix23([1, 2, 1]) -> " + Arrays.toString(fix23(new int[] {1, 2, 1})));
		System.out.println("fix23([3, 2, 1]) -> " + Arrays.toString(fix23(new int[] {3, 2, 1})));
		System.out.println("fix23([2, 2, 3]) -> " + Arrays.toString(fix23(new int[] {2, 2, 3})));
		System.out.println("fix23([2, 3, 3]) -> " + Arrays.toString(fix23(new int[] {2, 3, 3})));
		printMethod("start1");
		System.out.println("start1([1, 2, 3], [1, 3]) -> " + start1(new int[] {1, 2, 3}, new int[] {1, 3}));
		System.out.println("start1([7, 2, 3], [1]) -> " + start1(new int[] {7, 2, 3}, new int[] {1}));
		System.out.println("start1([1, 2], []) -> " + start1(new int[] {1, 2}, new int[] {}));
		System.out.println("start1([], [1, 2]) -> " + start1(new int[] {}, new int[] {1, 2}));
		System.out.println("start1([7], []) -> " + start1(new int[] {7}, new int[] {}));
		System.out.println("start1([7], [1]) -> " + start1(new int[] {7}, new int[] {1}));
		System.out.println("start1([1], [1]) -> " + start1(new int[] {1}, new int[] {1}));
		System.out.println("start1([7], [8]) -> " + start1(new int[] {7}, new int[] {8}));
		System.out.println("start1([], []) -> " + start1(new int[] {}, new int[] {}));
		System.out.println("start1([1, 3], [1]) -> " + start1(new int[] {1, 3}, new int[] {1}));
		printMethod("biggerTwo");
		System.out.println("biggerTwo([1, 2], [3, 4]) -> " + Arrays.toString(biggerTwo(new int[] {1, 2}, new int[] {3, 4})));
		System.out.println("biggerTwo([3, 4], [1, 2]) -> " + Arrays.toString(biggerTwo(new int[] {3, 4}, new int[] {1, 2})));
		System.out.println("biggerTwo([1, 1], [1, 2]) -> " + Arrays.toString(biggerTwo(new int[] {1, 1}, new int[] {1, 2})));
		System.out.println("biggerTwo([2, 1], [1, 1]) -> " + Arrays.toString(biggerTwo(new int[] {2, 1}, new int[] {1, 1})));
		System.out.println("biggerTwo([2, 2], [1, 3]) -> " + Arrays.toString(biggerTwo(new int[] {2, 2}, new int[] {1, 3})));
		System.out.println("biggerTwo([1, 3], [2, 2]) -> " + Arrays.toString(biggerTwo(new int[] {1, 3}, new int[] {2, 2})));
		System.out.println("biggerTwo([6, 7], [3, 1]) -> " + Arrays.toString(biggerTwo(new int[] {6, 7}, new int[] {3, 1})));
		printMethod("makeMiddle");
		System.out.println("makeMiddle([1, 2, 3, 4]) -> " + Arrays.toString(makeMiddle(new int[] {1, 2, 3, 4})));
		System.out.println("makeMiddle([7, 1, 2, 3, 4, 9]) -> " + Arrays.toString(makeMiddle(new int[] {7, 1, 2, 3, 4, 9})));
		System.out.println("makeMiddle([1, 2]) -> " + Arrays.toString(makeMiddle(new int[] {1, 2})));
		System.out.println("makeMiddle([5, 2, 4, 7]) -> " + Arrays.toString(makeMiddle(new int[] {5, 2, 4, 7})));
		System.out.println("makeMiddle([9, 0, 4, 3, 9, 1]) -> " + Arrays.toString(makeMiddle(new int[] {9, 0, 4, 3, 9, 1})));
		printMethod("plusTwo");
		System.out.println("plusTwo([1, 2], [3, 4]) -> " + Arrays.toString(plusTwo(new int[] {1, 2}, new int[] {3, 4})));
		System.out.println("plusTwo([4, 4], [2, 2]) -> " + Arrays.toString(plusTwo(new int[] {4, 4}, new int[] {2, 2})));
		System.out.println("plusTwo([9, 2], [3, 4]) -> " + Arrays.toString(plusTwo(new int[] {9, 2}, new int[] {3, 4})));
		printMethod("swapEnds");
		System.out.println("swapEnds([1, 2, 3, 4]) -> " + Arrays.toString(swapEnds(new int[] {1, 2, 3, 4})));
		System.out.println("swapEnds([1, 2, 3]) -> " + Arrays.toString(swapEnds(new int[] {1, 2, 3})));
		System.out.println("swapEnds([8, 6, 7, 9, 5]) -> " + Arrays.toString(swapEnds(new int[] {8, 6, 7, 9, 5})));
		System.out.println("swapEnds([3, 1, 4, 1, 5, 9]) -> " + Arrays.toString(swapEnds(new int[] {3, 1, 4, 1, 5, 9})));
		System.out.println("swapEnds([1, 2]) -> " + Arrays.toString(swapEnds(new int[] {1, 2})));
		System.out.println("swapEnds([1]) -> " + Arrays.toString(swapEnds(new int[] {1})));
		printMethod("midThree");
		System.out.println("midThree([1, 2, 3, 4, 5]) -> " + Arrays.toString(midThree(new int[] {1, 2, 3, 4, 5})));
		System.out.println("midThree([8, 6, 7, 5, 3, 0, 9]) -> " + Arrays.toString(midThree(new int[] {8, 6, 7, 5, 3, 0, 9})));
		System.out.println("midThree([1, 2, 3]) -> " + Arrays.toString(midThree(new int[] {1, 2, 3})));
		printMethod("maxTriple");
		System.out.println("maxTriple([1, 2, 3]) -> " + maxTriple(new int[] {1, 2, 3}));
		System.out.println("maxTriple([1, 5, 3]) -> " + maxTriple(new int[] {1, 5, 3}));
		System.out.println("maxTriple([5, 2, 3]) -> " + maxTriple(new int[] {5, 2, 3}));
		System.out.println("maxTriple([1, 2, 3, 1, 1]) -> " + maxTriple(new int[] {1, 2, 3, 1, 1}));
		System.out.println("maxTriple([1, 7, 3, 1, 5]) -> " + maxTriple(new int[] {1, 7, 3, 1, 5}));
		System.out.println("maxTriple([5, 1, 3, 7, 1]) -> " + maxTriple(new int[] {5, 1, 3, 7, 1}));
		System.out.println("maxTriple([5, 1, 7, 3, 7, 8, 1]) -> " + maxTriple(new int[] {5, 1, 7, 3, 7, 8, 1}));
		System.out.println("maxTriple([5, 1, 7, 9, 7, 8, 1]) -> " + maxTriple(new int[] {5, 1, 7, 9, 7, 8, 1}));
		System.out.println("maxTriple([5, 1, 7, 3, 7, 8, 9]) -> " + maxTriple(new int[] {5, 1, 7, 3, 7, 8, 9}));
		System.out.println("maxTriple([2, 2, 5, 1, 1]) -> " + maxTriple(new int[] {2, 2, 5, 1, 1}));
		printMethod("frontPiece");
		System.out.println("frontPiece([1, 2, 3]) -> " + Arrays.toString(frontPiece(new int[] {1, 2, 3})));
		System.out.println("frontPiece([1, 2]) -> " + Arrays.toString(frontPiece(new int[] {1, 2})));
		System.out.println("frontPiece([1]) -> " + Arrays.toString(frontPiece(new int[] {1})));
		System.out.println("frontPiece([]) -> " + Arrays.toString(frontPiece(new int[] {})));
		System.out.println("frontPiece([6, 5, 0]) -> " + Arrays.toString(frontPiece(new int[] {6, 5, 0})));
		System.out.println("frontPiece([6, 5]) -> " + Arrays.toString(frontPiece(new int[] {6, 5})));
		System.out.println("frontPiece([3, 1, 4, 1, 5]) -> " + Arrays.toString(frontPiece(new int[] {3, 1, 4, 1, 5})));
		System.out.println("frontPiece([6]) -> " + Arrays.toString(frontPiece(new int[] {6})));
		printMethod("unlucky1");
		System.out.println("unlucky1([1, 3, 4, 5]) -> " + unlucky1(new int[] {1, 3, 4, 5}));
		System.out.println("unlucky1([2, 1, 3, 4, 5]) -> " + unlucky1(new int[] {2, 1, 3, 4, 5}));
		System.out.println("unlucky1([1, 1, 1]) -> " + unlucky1(new int[] {1, 1, 1}));
		System.out.println("unlucky1([1, 3, 1]) -> " + unlucky1(new int[] {1, 3, 1}));
		System.out.println("unlucky1([1, 1, 3]) -> " + unlucky1(new int[] {1, 1, 3}));
		System.out.println("unlucky1([1, 2, 3]) -> " + unlucky1(new int[] {1, 2, 3}));
		System.out.println("unlucky1([3, 3, 3]) -> " + unlucky1(new int[] {3, 3, 3}));
		System.out.println("unlucky1([1, 3]) -> " + unlucky1(new int[] {1, 3}));
		System.out.println("unlucky1([1, 4]) -> " + unlucky1(new int[] {1, 4}));
		System.out.println("unlucky1([1]) -> " + unlucky1(new int[] {1}));
		System.out.println("unlucky1([]) -> " + unlucky1(new int[] {}));
		System.out.println("unlucky1([1, 1, 1, 3, 1]) -> " + unlucky1(new int[] {1, 1, 1, 3, 1}));
		System.out.println("unlucky1([1, 1, 3, 1, 1]) -> " + unlucky1(new int[] {1, 1, 3, 1, 1}));
		System.out.println("unlucky1([1, 1, 1, 1, 3]) -> " + unlucky1(new int[] {1, 1, 1, 1, 3}));
		System.out.println("unlucky1([1, 4, 1, 5]) -> " + unlucky1(new int[] {1, 4, 1, 5}));
		System.out.println("unlucky1([1, 1, 2, 3]) -> " + unlucky1(new int[] {1, 1, 2, 3}));
		System.out.println("unlucky1([2, 3, 2, 1]) -> " + unlucky1(new int[] {2, 3, 2, 1}));
		System.out.println("unlucky1([2, 3, 1, 3]) -> " + unlucky1(new int[] {2, 3, 1, 3}));
		System.out.println("unlucky1([1, 2, 3, 4, 1, 3]) -> " + unlucky1(new int[] {1, 2, 3, 4, 1, 3}));
		printMethod("make2");
		System.out.println("make2([4, 5], [1, 2, 3]) -> " + Arrays.toString(make2(new int[] {4, 5}, new int[] {1, 2, 3})));
		System.out.println("make2([4], [1, 2, 3]) -> " + Arrays.toString(make2(new int[] {4}, new int[] {1, 2, 3})));
		System.out.println("make2([], [1, 2]) -> " + Arrays.toString(make2(new int[] {}, new int[] {1, 2})));
		System.out.println("make2([1, 2], []) -> " + Arrays.toString(make2(new int[] {1, 2}, new int[] {})));
		System.out.println("make2([3], [1, 2, 3]) -> " + Arrays.toString(make2(new int[] {3}, new int[] {1, 2, 3})));
		System.out.println("make2([3], [1]) -> " + Arrays.toString(make2(new int[] {3}, new int[] {1})));
		System.out.println("make2([3, 1, 4], []) -> " + Arrays.toString(make2(new int[] {3, 1, 4}, new int[] {})));
		System.out.println("make2([1], [1]) -> " + Arrays.toString(make2(new int[] {1}, new int[] {1})));
		System.out.println("make2([1, 2, 3], [7, 8]) -> " + Arrays.toString(make2(new int[] {1, 2, 3}, new int[] {7, 8})));
		System.out.println("make2([7, 8], [1, 2, 3]) -> " + Arrays.toString(make2(new int[] {7, 8}, new int[] {1, 2, 3})));
		System.out.println("make2([7], [1, 2, 3]) -> " + Arrays.toString(make2(new int[] {7}, new int[] {1, 2, 3})));
		System.out.println("make2([5, 4], [2, 3, 7]) -> " + Arrays.toString(make2(new int[] {5, 4}, new int[] {2, 3, 7})));
		printMethod("front11");
		System.out.println("front11([1, 2, 3], [7, 9, 8]) -> " + Arrays.toString(front11(new int[] {1, 2, 3}, new int[] {7, 9, 8})));
		System.out.println("front11([1], [2]) -> " + Arrays.toString(front11(new int[] {1}, new int[] {2})));
		System.out.println("front11([1, 7], []) -> " + Arrays.toString(front11(new int[] {1, 7}, new int[] {})));
		System.out.println("front11([], [2, 8]) -> " + Arrays.toString(front11(new int[] {}, new int[] {2, 8})));
		System.out.println("front11([], []) -> " + Arrays.toString(front11(new int[] {}, new int[] {})));
		System.out.println("front11([3], [1, 4, 1, 9]) -> " + Arrays.toString(front11(new int[] {3}, new int[] {1, 4, 1, 9})));
		System.out.println("front11([1, 4, 1, 9], []) -> " + Arrays.toString(front11(new int[] {1, 4, 1, 9}, new int[] {})));
	}
}
