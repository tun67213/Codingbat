package com.arvindhvelrajan;

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
	}
}
