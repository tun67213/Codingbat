package com.arvindhvelrajan;

import static com.arvindhvelrajan.UI_Functions.*;
import java.util.List;
import java.util.ArrayList;

/**
 * @author arvindhvelrajan
 * @code This class is to demonstrate the implementation for all functions in Functional_2 from codingbat.com
 */
public class Functional_2
{
	private void welcome()
	{
		System.out.println("\n\nFunctional-2 Functions\n");
	}

	/**
	 * Given a list of integers, return a list of the integers, omitting any that are less than 0.
	 *
	 * noNeg([1, -2]) → [1]
	 * noNeg([-3, -3, 3, 3]) → [3, 3]
	 * noNeg([-1, -1, -1]) → []
	 */
	public List<Integer> noNeg(List<Integer> nums)
	{
		throw new UnsupportedOperationException("Not supported yet.");
	}

	/**
	 * Given a list of non-negative integers, return a list of those numbers except omitting any that end with 9.
	 * (Note: % by 10)
	 *
	 * no9([1, 2, 19]) → [1, 2]
	 * no9([9, 19, 29, 3]) → [3]
	 * no9([1, 2, 3]) → [1, 2, 3]
	 */
	public List<Integer> no9(List<Integer> nums)
	{
		throw new UnsupportedOperationException("Not supported yet.");
	}

	/**
	 * @param args commandline arguments
	 */
	public void main(String[] args)
	{
		welcome();
		printFunction("noNeg");
		System.out.println("noNeg([1, -2]) → " + noNeg(new ArrayList<>(List.of(1, -2))));
		System.out.println("noNeg([-3, -3, 3, 3]) → " + noNeg(new ArrayList<>(List.of(-3, -3, 3, 3))));
		System.out.println("noNeg([-1, -1, -1]) → " + noNeg(new ArrayList<>(List.of(-1, -1, -1))));
		System.out.println("noNeg([]) → " + noNeg(new ArrayList<>(List.of())));
		System.out.println("noNeg([0, 1, 2]) → " + noNeg(new ArrayList<>(List.of(0, 1, 2))));
		System.out.println("noNeg([3, -10, 1, -1, 4, -400]) → " + noNeg(new ArrayList<>(List.of(3, -10, 1, -1, 4, -400))));
		System.out.println("noNeg([-1, 3, 1, -1, -10, -100, -111, 5]) → " + noNeg(new ArrayList<>(List.of(-1, 3, 1, -1, -10, -100, -111, 5))));
	}
}
