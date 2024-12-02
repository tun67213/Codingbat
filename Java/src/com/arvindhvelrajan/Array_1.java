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
	}
}
