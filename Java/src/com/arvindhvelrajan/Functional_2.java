package com.arvindhvelrajan;

import static com.arvindhvelrajan.UI_Functions.*;
import java.util.List;

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
	 * @param args commandline arguments
	 */
	public void main(String[] args)
	{
		welcome();
		printFunction("noNeg");
		System.out.println("noNeg([1, -2]) → " + noNeg(List.of(1, -2)));
		System.out.println("noNeg([-3, -3, 3, 3]) → " + noNeg(List.of(-3, -3, 3, 3)));
		System.out.println("noNeg([-1, -1, -1]) → " + noNeg(List.of(-1, -1, -1)));
		System.out.println("noNeg([]) → " + noNeg(List.of()));
		System.out.println("noNeg([0, 1, 2]) → " + noNeg(List.of(0, 1, 2)));
		System.out.println("noNeg([3, -10, 1, -1, 4, -400]) → " + noNeg(List.of(3, -10, 1, -1, 4, -400)));
		System.out.println("noNeg([-1, 3, 1, -1, -10, -100, -111, 5]) → " + noNeg(List.of(-1, 3, 1, -1, -10, -100, -111, 5)));
	}
}
