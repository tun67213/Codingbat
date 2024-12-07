package com.arvindhvelrajan;

import static com.arvindhvelrajan.UI_Functions.*;

/**
 * @author arvindhvelrajan
 * @code This class is to demonstrate the implementation for all functions in Array-3 from codingbat.com
 */
public class Array_3
{
	private void welcome()
	{
		System.out.println("\n\nArray-3 Functions\n");
	}

	/**
	 * Consider the leftmost and righmost appearances of some value in an array. We'll say that the "span"
	 * is the number of elements between the two inclusive. A single value has a span of 1.
	 * Returns the largest span found in the given array. (Efficiency is not a priority.)
	 *
	 * maxSpan([1, 2, 1, 1, 3]) → 4
	 * maxSpan([1, 4, 2, 1, 4, 1, 4]) → 6
	 * maxSpan([1, 4, 2, 1, 4, 4, 4]) → 6
	 */
	public int maxSpan(int[] nums)
	{
		throw new UnsupportedOperationException("Not supported yet.");
	}

	/**
	 * Return an array that contains exactly the same numbers as the given array, but rearranged so that every 3
	 * is immediately followed by a 4. Do not move the 3's, but every other number may move. The array contains the
	 * same number of 3's and 4's, every 3 has a number after it that is not a 3, and a 3 appears in the array before any 4.
	 *
	 * fix34([1, 3, 1, 4]) → [1, 3, 4, 1]
	 * fix34([1, 3, 1, 4, 4, 3, 1]) → [1, 3, 4, 1, 1, 3, 4]
	 * fix34([3, 2, 2, 4]) → [3, 4, 2, 2]
	 */
	public int[] fix34(int[] nums)
	{
		throw new UnsupportedOperationException("Not supported yet.");
	}

	/**
	 * @param args commandline arguments
	 */
	public void main(String[] args)
	{
		welcome();
		printFunction("maxSpan");
		System.out.println("maxSpan([1, 2, 1, 1, 3]) → " + maxSpan(new int[] {1, 2, 1, 1, 3}));
		System.out.println("maxSpan([1, 4, 2, 1, 4, 1, 4]) → " + maxSpan(new int[] {1, 4, 2, 1, 4, 1, 4}));
		System.out.println("maxSpan([1, 4, 2, 1, 4, 4, 4]) → " + maxSpan(new int[] {1, 4, 2, 1, 4, 4, 4}));
		System.out.println("maxSpan([3, 3, 3]) → " + maxSpan(new int[] {3, 3, 3}));
		System.out.println("maxSpan([3, 9, 3]) → " + maxSpan(new int[] {3, 9, 3}));
		System.out.println("maxSpan([3, 9, 9]) → " + maxSpan(new int[] {3, 9, 9}));
		System.out.println("maxSpan([3, 9]) → " + maxSpan(new int[] {3, 9}));
		System.out.println("maxSpan([3, 3]) → " + maxSpan(new int[] {3, 3}));
		System.out.println("maxSpan([]) → " + maxSpan(new int[] {}));
		System.out.println("maxSpan([1]) → " + maxSpan(new int[] {1}));
		printFunction("fix34");
		System.out.println("fix34([1, 3, 1, 4]) → " + Arrays.toString(fix34(new int[] {1, 3, 1, 4})));
		System.out.println("fix34([1, 3, 1, 4, 4, 3, 1]) → " + Arrays.toString(fix34(new int[] {1, 3, 1, 4, 4, 3, 1})));
		System.out.println("fix34([3, 2, 2, 4]) → " + Arrays.toString(fix34(new int[] {3, 2, 2, 4})));
		System.out.println("fix34([3, 2, 3, 2, 4, 4]) → " + Arrays.toString(fix34(new int[] {3, 2, 3, 2, 4, 4})));
		System.out.println("fix34([2, 3, 2, 3, 2, 4, 4]) → " + Arrays.toString(fix34(new int[] {2, 3, 2, 3, 2, 4, 4})));
		System.out.println("fix34([5, 3, 5, 4, 5, 4, 5, 4, 3, 5, 3, 5]) → " + Arrays.toString(fix34(new int[] {5, 3, 5, 4, 5, 4, 5, 4, 3, 5, 3, 5})));
		System.out.println("fix34([3, 1, 4]) → " + Arrays.toString(fix34(new int[] {3, 1, 4})));
		System.out.println("fix34([3, 4, 1]) → " + Arrays.toString(fix34(new int[] {3, 4, 1})));
		System.out.println("fix34([1, 1, 1]) → " + Arrays.toString(fix34(new int[] {1, 1, 1})));
		System.out.println("fix34([1]) → " + Arrays.toString(fix34(new int[] {1})));
		System.out.println("fix34([]) → " + Arrays.toString(fix34(new int[] {})));
		System.out.println("fix34([7, 3, 7, 7, 4]) → " + Arrays.toString(fix34(new int[] {7, 3, 7, 7, 4})));
		System.out.println("fix34([3, 1, 4, 3, 1, 4]) → " + Arrays.toString(fix34(new int[] {3, 1, 4, 3, 1, 4})));
		System.out.println("fix34([3, 1, 1, 3, 4, 4]) → " + Arrays.toString(fix34(new int[] {3, 1, 1, 3, 4, 4})));
	}
}
