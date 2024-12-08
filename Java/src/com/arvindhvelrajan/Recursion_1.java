package com.arvindhvelrajan;

/**
 * @author arvindhvelrajan
 * @code This class is to demonstrate the implementation for all functions in Recursion_1 from codingbat.com
 */
public class Recursion_1
{
	private void welcome()
	{
		System.out.println("\n\nRecursion-1 Functions\n");
	}

	/**
	 * Given n of 1 or more, return the factorial of n, which is n * (n-1) * (n-2) ... 1.
	 * Compute the result recursively (without loops).
	 *
	 * factorial(1) → 1
	 * factorial(2) → 2
	 * factorial(3) → 6
	 */
	public int factorial(int n)
	{
		throw new UnsupportedOperationException("Not supported yet.");
	}

	/**
	 * @param args commandline arguments
	 */
	public void main(String[] args)
	{
		welcome();
		printFunction("factorial");
		System.out.println("factorial(1) → " + factorial(1));
		System.out.println("factorial(2) → " + factorial(2));
		System.out.println("factorial(3) → " + factorial(3));
		System.out.println("factorial(4) → " + factorial(4));
		System.out.println("factorial(5) → " + factorial(5));
		System.out.println("factorial(6) → " + factorial(6));
		System.out.println("factorial(7) → " + factorial(7));
		System.out.println("factorial(8) → " + factorial(8));
		System.out.println("factorial(12) → " + factorial(12));
	}
}
