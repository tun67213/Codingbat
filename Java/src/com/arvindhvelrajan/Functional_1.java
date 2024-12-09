package com.arvindhvelrajan;

import static com.arvindhvelrajan.UI_Functions.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author arvindhvelrajan
 * @code This class is to demonstrate the implementation for all functions in Functional_1 from codingbat.com
 */
public class Functional_1
{
	private void welcome()
	{
		System.out.println("\n\nFunctional-1 Functions\n");
	}

	/**
	 * Given a list of integers, return a list where each integer is multiplied by 2.
	 *
	 * doubling([1, 2, 3]) → [2, 4, 6]
	 * doubling([6, 8, 6, 8, -1]) → [12, 16, 12, 16, -2]
	 * doubling([]) → []
	 */
	public List<Integer> doubling(List<Integer> nums)
	{
		throw new UnsupportedOperationException("Not supported yet.");
	}

	/**
	 * Given a list of integers, return a list where each integer is multiplied with itself.
	 *
	 * square([1, 2, 3]) → [1, 4, 9]
	 * square([6, 8, -6, -8, 1]) → [36, 64, 36, 64, 1]
	 * square([]) → []
	 */
	public List<Integer> square(List<Integer> nums)
	{
		throw new UnsupportedOperationException("Not supported yet.");
	}

	/**
	 * @param args commandline arguments
	 */
	public void main(String[] args)
	{
		welcome();
		printFunction("doubling");
		System.out.println("doubling([1, 2, 3]) → " + doubling(new ArrayList<>(List.of(1, 2, 3))));
		System.out.println("doubling([6, 8, 6, 8, -1]) → " + doubling(new ArrayList<>(List.of(6, 8, 6, 8, -1))));
		System.out.println("doubling([]) → " + doubling(new ArrayList<>(List.of())));
		System.out.println("doubling([5]) → " + doubling(new ArrayList<>(List.of(5))));
		System.out.println("doubling([5, 10]) → " + doubling(new ArrayList<>(List.of(5, 10))));
		System.out.println("doubling([8, -5, 7, 3, 109]) → " + doubling(new ArrayList<>(List.of(8, -5, 7, 3, 109))));
		System.out.println("doubling([6, -3, 12, 23, 4, 1, 19, 11, 2, 3, 2]) → " + doubling(new ArrayList<>(List.of(6, -3, 12, 23, 4, 1, 19, 11, 2, 3, 2))));
		System.out.println("doubling([3, 1, 4, 1, 5, 9]) → " + doubling(new ArrayList<>(List.of(3, 1, 4, 1, 5, 9))));
	}
}
