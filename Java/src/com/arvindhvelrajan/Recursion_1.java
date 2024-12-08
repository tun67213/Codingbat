package com.arvindhvelrajan;

import static com.arvindhvelrajan.UI_Functions.*;

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
	 * We have a number of bunnies and each bunny has two big floppy ears.
	 * We want to compute the total number of ears across all the bunnies recursively (without loops or multiplication).
	 *
	 * bunnyEars(0) → 0
	 * bunnyEars(1) → 2
	 * bunnyEars(2) → 4
	 */
	public int bunnyEars(int bunnies)
	{
		throw new UnsupportedOperationException("Not supported yet.");
	}

	/**
	 * The fibonacci sequence is a famous bit of mathematics, and it happens to have a recursive definition.
	 * The first two values in the sequence are 0 and 1 (essentially 2 base cases). Each subsequent value is the sum of
	 * the previous two values, so the whole sequence is: 0, 1, 1, 2, 3, 5, 8, 13, 21 and so on.
	 * Define a recursive fibonacci(n) method that returns the nth fibonacci number, with n=0 representing the start of the sequence.
	 *
	 * fibonacci(0) → 0
	 * fibonacci(1) → 1
	 * fibonacci(2) → 1
	 */
	public int fibonacci(int n)
	{
		throw new UnsupportedOperationException("Not supported yet.");
	}

	/**
	 * We have bunnies standing in a line, numbered 1, 2, ... The odd bunnies (1, 3, ..) have the normal 2 ears.
	 * The even bunnies (2, 4, ..) we'll say have 3 ears, because they each have a raised foot.
	 * Recursively return the number of "ears" in the bunny line 1, 2, ... n (without loops or multiplication).
	 *
	 * bunnyEars2(0) → 0
	 * bunnyEars2(1) → 2
	 * bunnyEars2(2) → 5
	 */
	public int bunnyEars2(int bunnies)
	{
		throw new UnsupportedOperationException("Not supported yet.");
	}

	/**
	 * We have triangle made of blocks. The topmost row has 1 block, the next row down has 2 blocks, the next row has
	 * 3 blocks, and so on. Compute recursively (no loops or multiplication) the total number of blocks in such a
	 * triangle with the given number of rows.
	 *
	 * triangle(0) → 0
	 * triangle(1) → 1
	 * triangle(2) → 3
	 */
	public int triangle(int rows)
	{
		throw new UnsupportedOperationException("Not supported yet.");
	}

	/**
	 * Given a non-negative int n, return the sum of its digits recursively (no loops). Note that mod (%) by 10 yields
	 * the rightmost digit (126 % 10 is 6), while divide (/) by 10 removes the rightmost digit (126 / 10 is 12).
	 *
	 * sumDigits(126) → 9
	 * sumDigits(49) → 13
	 * sumDigits(12) → 3
	 */
	public int sumDigits(int n)
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
		printFunction("bunnyEars");
		System.out.println("bunnyEars(0) → " + bunnyEars(0));
		System.out.println("bunnyEars(1) → " + bunnyEars(1));
		System.out.println("bunnyEars(2) → " + bunnyEars(2));
		System.out.println("bunnyEars(3) → " + bunnyEars(3));
		System.out.println("bunnyEars(4) → " + bunnyEars(4));
		System.out.println("bunnyEars(5) → " + bunnyEars(5));
		System.out.println("bunnyEars(12) → " + bunnyEars(12));
		System.out.println("bunnyEars(50) → " + bunnyEars(50));
		System.out.println("bunnyEars(234) → " + bunnyEars(234));
		printFunction("fibonacci");
		System.out.println("fibonacci(0) → " + fibonacci(0));
		System.out.println("fibonacci(1) → " + fibonacci(1));
		System.out.println("fibonacci(2) → " + fibonacci(2));
		System.out.println("fibonacci(3) → " + fibonacci(3));
		System.out.println("fibonacci(4) → " + fibonacci(4));
		System.out.println("fibonacci(5) → " + fibonacci(5));
		System.out.println("fibonacci(6) → " + fibonacci(6));
		System.out.println("fibonacci(7) → " + fibonacci(7));
		printFunction("bunnyEars2");
		System.out.println("bunnyEars2(0) → " + bunnyEars2(0));
		System.out.println("bunnyEars2(1) → " + bunnyEars2(1));
		System.out.println("bunnyEars2(2) → " + bunnyEars2(2));
		System.out.println("bunnyEars2(3) → " + bunnyEars2(3));
		System.out.println("bunnyEars2(4) → " + bunnyEars2(4));
		System.out.println("bunnyEars2(5) → " + bunnyEars2(5));
		System.out.println("bunnyEars2(6) → " + bunnyEars2(6));
		System.out.println("bunnyEars2(10) → " + bunnyEars2(10));
		printFunction("triangle");
		System.out.println("triangle(0) → " + triangle(0));
		System.out.println("triangle(1) → " + triangle(1));
		System.out.println("triangle(2) → " + triangle(2));
		System.out.println("triangle(3) → " + triangle(3));
		System.out.println("triangle(4) → " + triangle(4));
		System.out.println("triangle(5) → " + triangle(5));
		System.out.println("triangle(6) → " + triangle(6));
		System.out.println("triangle(7) → " + triangle(7));
		printFunction("sumDigits");
		System.out.println("sumDigits(126) → " + sumDigits(126));
		System.out.println("sumDigits(49) → " + sumDigits(49));
		System.out.println("sumDigits(12) → " + sumDigits(12));
		System.out.println("sumDigits(10) → " + sumDigits(10));
		System.out.println("sumDigits(1) → " + sumDigits(1));
		System.out.println("sumDigits(0) → " + sumDigits(0));
		System.out.println("sumDigits(730) → " + sumDigits(730));
		System.out.println("sumDigits(1111) → " + sumDigits(1111));
		System.out.println("sumDigits(11111) → " + sumDigits(11111));
		System.out.println("sumDigits(10110) → " + sumDigits(10110));
		System.out.println("sumDigits(235) → " + sumDigits(235));
	}
}
