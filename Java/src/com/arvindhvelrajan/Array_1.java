package com.arvindhvelrajan;

import java.util.Arrays;

import static com.arvindhvelrajan.UI_Functions.*;

/**
 * @author arvindhvelrajan
 * @code This class is to demonstrate the implementation for all functions in Array-1 from codingbat.com
 */
public class Array_1
{
	/**
	 * This function introduces the user to the class that is being demonstrated.
	 */
	private void welcome()
	{
		System.out.println("\n\nArray-1 Functions\n");
	}

	/**
	 * Given an array of ints, return true if 6 appears as either the first or last element in the array.
	 * The array will be length 1 or more.
	 *
	 * firstLast6([1, 2, 6]) → true
	 * firstLast6([6, 1, 2, 3]) → true
	 * firstLast6([13, 6, 1, 2, 3]) → false
	 */
	public boolean firstLast6(int[] nums)
	{
		throw new UnsupportedOperationException("Not supported yet.");
	}

	/**
	 * Given an array of ints, return true if the array is length 1 or more,
	 * and the first element and the last element are equal.
	 *
	 * sameFirstLast([1, 2, 3]) → false
	 * sameFirstLast([1, 2, 3, 1]) → true
	 * sameFirstLast([1, 2, 1]) → true
	 */
	public boolean sameFirstLast(int[] nums)
	{
		throw new UnsupportedOperationException("Not supported yet.");
	}

	/**
	 * Return an int array length 3 containing the first 3 digits of pi, {3, 1, 4}.
	 *
	 * makePi() → [3, 1, 4]
	 */
	public int[] makePi()
	{
		throw new UnsupportedOperationException("Not supported yet.");
	}

	/**
	 * Given 2 arrays of ints, a and b, return true if they have the same first element
	 * or they have the same last element. Both arrays will be length 1 or more.
	 *
	 * commonEnd([1, 2, 3], [7, 3]) → true
	 * commonEnd([1, 2, 3], [7, 3, 2]) → false
	 * commonEnd([1, 2, 3], [1, 3]) → true
	 */
	public boolean commonEnd(int[] a, int[] b)
	{
		throw new UnsupportedOperationException("Not supported yet.");
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
		throw new UnsupportedOperationException("Not supported yet.");
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
		throw new UnsupportedOperationException("Not supported yet.");
	}

	/**
	 * Given an array of ints length 3, return a new array with the elements in reverse order,
	 * so {1, 2, 3} becomes {3, 2, 1}.
	 *
	 * reverse3([1, 2, 3]) → [3, 2, 1]
	 * reverse3([5, 11, 9]) → [9, 11, 5]
	 * reverse3([7, 0, 0]) → [0, 0, 7]
	 */
	public int[] reverse3(int[] nums)
	{
		throw new UnsupportedOperationException("Not supported yet.");
	}

	/**
	 * Given an array of ints length 3, figure out which is larger, the first or last element in the array,
	 * and set all the other elements to be that value. Return the changed array.
	 *
	 * maxEnd3([1, 2, 3]) → [3, 3, 3]
	 * maxEnd3([11, 5, 9]) → [11, 11, 11]
	 * maxEnd3([2, 11, 3]) → [3, 3, 3]
	 */
	public int[] maxEnd3(int[] nums)
	{
		throw new UnsupportedOperationException("Not supported yet.");
	}

	/**
	 * Given an array of ints, return the sum of the first 2 elements in the array.
	 * If the array length is less than 2, just sum up the elements that exist, returning 0 if the array is length 0.
	 *
	 * sum2([1, 2, 3]) → 3
	 * sum2([1, 1]) → 2
	 * sum2([1, 1, 1, 1]) → 2
	 */
	public int sum2(int[] nums)
	{
		throw new UnsupportedOperationException("Not supported yet.");
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
		throw new UnsupportedOperationException("Not supported yet.");
	}

	/**
	 * Given an array of ints, return a new array length 2 containing the first and last elements from the original array.
	 * The original array will be length 1 or more.
	 *
	 * makeEnds([1, 2, 3]) → [1, 3]
	 * makeEnds([1, 2, 3, 4]) → [1, 4]
	 * makeEnds([7, 4, 6, 2]) → [7, 2]
	 */
	public int[] makeEnds(int[] nums)
	{
		throw new UnsupportedOperationException("Not supported yet.");
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
		throw new UnsupportedOperationException("Not supported yet.");
	}

	/**
	 * @param args commandline arguments
	 */
	public void main(String[] args)
	{
		welcome();
		printFunction("firstLast6");
		System.out.println("firstLast6([1, 2, 6]) --> " + firstLast6(new int[] {1, 2, 6}));
		System.out.println("firstLast6([6, 1, 2, 3]) --> " + firstLast6(new int[] {6, 1, 2, 3}));
		System.out.println("firstLast6([13, 6, 1, 2, 3]) --> " + firstLast6(new int[] {13, 6, 1, 2, 3}));
		System.out.println("firstLast6([3, 2, 1]) --> " + firstLast6(new int[] {3, 2, 1}));
		System.out.println("firstLast6([3, 6, 1]) --> " + firstLast6(new int[] {3, 6, 1}));
		System.out.println("firstLast6([3, 6]) --> " + firstLast6(new int[] {3, 6}));
		System.out.println("firstLast6([6]) --> " + firstLast6(new int[] {6}));
		System.out.println("firstLast6([3]) --> " + firstLast6(new int[] {3}));
		System.out.println("firstLast6([5, 6]) --> " + firstLast6(new int[] {5, 6}));
		System.out.println("firstLast6([5, 5]) --> " + firstLast6(new int[] {5, 5}));
		System.out.println("firstLast6([1, 2, 3, 4, 6]) --> " + firstLast6(new int[] {1, 2, 3, 4, 6}));
		System.out.println("firstLast6([1, 2, 3, 4]) --> " + firstLast6(new int[] {1, 2, 3, 4}));
		printFunction("sameFirstLast");
		System.out.println("sameFirstLast([1, 2, 3]) --> " + sameFirstLast(new int[] {1, 2, 3}));
		System.out.println("sameFirstLast([1, 2, 3, 1]) --> " + sameFirstLast(new int[] {1, 2, 3, 1}));
		System.out.println("sameFirstLast([1, 2, 1]) --> " + sameFirstLast(new int[] {1, 2, 1}));
		System.out.println("sameFirstLast([7]) --> " + sameFirstLast(new int[] {7}));
		System.out.println("sameFirstLast([]) --> " + sameFirstLast(new int[] {}));
		System.out.println("sameFirstLast([1, 2, 3, 4, 5, 1]) --> " + sameFirstLast(new int[] {1, 2, 3, 4, 5, 1}));
		System.out.println("sameFirstLast([1, 2, 3, 4, 5, 13]) --> " + sameFirstLast(new int[] {1, 2, 3, 4, 5, 13}));
		System.out.println("sameFirstLast([13, 2, 3, 4, 5, 13]) --> " + sameFirstLast(new int[] {13, 2, 3, 4, 5, 13}));
		System.out.println("sameFirstLast([7, 7]) --> " + sameFirstLast(new int[] {7, 7}));
		printFunction("makePi");
		System.out.println("makePi() --> " + Arrays.toString(makePi()));
		printFunction("commonEnd");
		System.out.println("commonEnd([1, 2, 3], [7, 3]) --> " + commonEnd(new int[] {1, 2, 3}, new int[] {7, 3}));
		System.out.println("commonEnd([1, 2, 3], [7, 3, 2]) --> " + commonEnd(new int[] {1, 2, 3}, new int[] {7, 3, 2}));
		System.out.println("commonEnd([1, 2, 3], [1, 3]) --> " + commonEnd(new int[] {1, 2, 3}, new int[] {1, 3}));
		System.out.println("commonEnd([1, 2, 3], [1]) --> " + commonEnd(new int[] {1, 2, 3}, new int[] {1}));
		System.out.println("commonEnd([1, 2, 3], [2]) --> " + commonEnd(new int[] {1, 2, 3}, new int[] {2}));
		printFunction("sum3");
		System.out.println("sum3([1, 2, 3]) --> " + sum3(new int[] {1, 2, 3}));
		System.out.println("sum3([5, 11, 2]) --> " + sum3(new int[] {5, 11, 2}));
		System.out.println("sum3([7, 0, 0]) --> " + sum3(new int[] {7, 0, 0}));
		System.out.println("sum3([1, 2, 1]) --> " + sum3(new int[] {1, 2, 1}));
		System.out.println("sum3([1, 1, 1]) --> " + sum3(new int[] {1, 1, 1}));
		System.out.println("sum3([2, 7, 2]) --> " + sum3(new int[] {2, 7, 2}));
		printFunction("rotateLeft3");
		System.out.println("rotateLeft3([1, 2, 3]) --> " + Arrays.toString(rotateLeft3(new int[] {1, 2, 3})));
		System.out.println("rotateLeft3([5, 11, 9]) --> " + Arrays.toString(rotateLeft3(new int[] {5, 11, 9})));
		System.out.println("rotateLeft3([7, 0, 0]) --> " + Arrays.toString(rotateLeft3(new int[] {7, 0, 0})));
		System.out.println("rotateLeft3([1, 2, 1]) --> " + Arrays.toString(rotateLeft3(new int[] {1, 2, 1})));
		System.out.println("rotateLeft3([0, 0, 1]) --> " + Arrays.toString(rotateLeft3(new int[] {0, 0, 1})));
		printFunction("reverse3");
		System.out.println("reverse3([1, 2, 3]) --> " + Arrays.toString(reverse3(new int[] {1, 2, 3})));
		System.out.println("reverse3([5, 11, 9]) --> " + Arrays.toString(reverse3(new int[] {5, 11, 9})));
		System.out.println("reverse3([7, 0, 0]) --> " + Arrays.toString(reverse3(new int[] {7, 0, 0})));
		System.out.println("reverse3([2, 1, 2]) --> " + Arrays.toString(reverse3(new int[] {2, 1, 2})));
		System.out.println("reverse3([1, 2, 1]) --> " + Arrays.toString(reverse3(new int[] {1, 2, 1})));
		System.out.println("reverse3([2, 11, 3]) --> " + Arrays.toString(reverse3(new int[] {2, 11, 3})));
		System.out.println("reverse3([0, 6, 5]) --> " + Arrays.toString(reverse3(new int[] {0, 6, 5})));
		System.out.println("reverse3([7, 2, 3]) --> " + Arrays.toString(reverse3(new int[] {7, 2, 3})));
		printFunction("maxEnd3");
		System.out.println("maxEnd3([1, 2, 3]) --> " + Arrays.toString(maxEnd3(new int[] {1, 2, 3})));
		System.out.println("maxEnd3([11, 5, 9]) --> " + Arrays.toString(maxEnd3(new int[] {11, 5, 9})));
		System.out.println("maxEnd3([2, 11, 3]) --> " + Arrays.toString(maxEnd3(new int[] {2, 11, 3})));
		System.out.println("maxEnd3([11, 3, 3]) --> " + Arrays.toString(maxEnd3(new int[] {11, 3, 3})));
		System.out.println("maxEnd3([3, 11, 11]) --> " + Arrays.toString(maxEnd3(new int[] {3, 11, 11})));
		System.out.println("maxEnd3([2, 2, 2]) --> " + Arrays.toString(maxEnd3(new int[] {2, 2, 2})));
		System.out.println("maxEnd3([2, 11, 2]) --> " + Arrays.toString(maxEnd3(new int[] {2, 11, 2})));
		System.out.println("maxEnd3([0, 0, 1]) --> " + Arrays.toString(maxEnd3(new int[] {0, 0, 1})));
		printFunction("sum2");
		System.out.println("sum2([1, 2, 3]) --> " + sum2(new int[] {1, 2, 3}));
		System.out.println("sum2([1, 1]) --> " + sum2(new int[] {1, 1}));
		System.out.println("sum2([1, 1, 1, 1]) --> " + sum2(new int[] {1, 1, 1, 1}));
		System.out.println("sum2([1, 2]) --> " + sum2(new int[] {1, 2}));
		System.out.println("sum2([1]) --> " + sum2(new int[] {1}));
		System.out.println("sum2([]) --> " + sum2(new int[] {}));
		System.out.println("sum2([4, 5, 6]) --> " + sum2(new int[] {4, 5, 6}));
		System.out.println("sum2([4]) --> " + sum2(new int[] {4}));
		printFunction("middleWay");
		System.out.println("middleWay([1, 2, 3], [4, 5, 6]) --> " + Arrays.toString(middleWay(new int[] {1, 2, 3}, new int[] {4, 5, 6})));
		System.out.println("middleWay([7, 7, 7], [3, 8, 0]) --> " + Arrays.toString(middleWay(new int[] {7, 7, 7}, new int[] {3, 8, 0})));
		System.out.println("middleWay([5, 2, 9], [1, 4, 5]) --> " + Arrays.toString(middleWay(new int[] {5, 2, 9}, new int[] {1, 4, 5})));
		System.out.println("middleWay([1, 9, 7], [4, 8, 8]) --> " + Arrays.toString(middleWay(new int[] {1, 9, 7}, new int[] {4, 8, 8})));
		System.out.println("middleWay([1, 2, 3], [3, 1, 4]) --> " + Arrays.toString(middleWay(new int[] {1, 2, 3}, new int[] {3, 1, 4})));
		System.out.println("middleWay([1, 2, 3], [4, 1, 1]) --> " + Arrays.toString(middleWay(new int[] {1, 2, 3}, new int[] {4, 1, 1})));
		printFunction("makeEnds");
		System.out.println("makeEnds([1, 2, 3]) --> " + Arrays.toString(makeEnds(new int[] {1, 2, 3})));
		System.out.println("makeEnds([1, 2, 3, 4]) --> " + Arrays.toString(makeEnds(new int[] {1, 2, 3, 4})));
		System.out.println("makeEnds([7, 4, 6, 2]) --> " + Arrays.toString(makeEnds(new int[] {7, 4, 6, 2})));
		System.out.println("makeEnds([1, 2, 2, 2, 2, 2, 2, 3]) --> " + Arrays.toString(makeEnds(new int[] {1, 2, 2, 2, 2})));
		System.out.println("makeEnds([7, 4]) --> " + Arrays.toString(makeEnds(new int[] {7, 4})));
		System.out.println("makeEnds([7]) --> " + Arrays.toString(makeEnds(new int[] {7})));
		System.out.println("makeEnds([5, 2, 9]) --> " + Arrays.toString(makeEnds(new int[] {5, 2, 9})));
		System.out.println("makeEnds([2, 3, 4, 1]) --> " + Arrays.toString(makeEnds(new int[] {2, 3, 4, 1})));
		printFunction("has23");
		System.out.println("has23([2, 5]) --> " + has23(new int[] {2, 5}));
		System.out.println("has23([4, 3]) --> " + has23(new int[] {4, 3}));
		System.out.println("has23([4, 5]) --> " + has23(new int[] {4, 5}));
		System.out.println("has23([2, 2]) --> " + has23(new int[] {2, 2}));
		System.out.println("has23([3, 2]) --> " + has23(new int[] {3, 2}));
		System.out.println("has23([3, 3]) --> " + has23(new int[] {3, 3}));
		System.out.println("has23([7, 7]) --> " + has23(new int[] {7, 7}));
		System.out.println("has23([3, 9]) --> " + has23(new int[] {3, 9}));
		System.out.println("has23([9, 5]) --> " + has23(new int[] {9, 5}));
	}
}
