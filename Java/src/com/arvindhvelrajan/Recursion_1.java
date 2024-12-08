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
	 * Given a non-negative int n, return the count of the occurrences of 7 as a digit, so for example 717 yields 2.
	 * (no loops). Note that mod (%) by 10 yields the rightmost digit (126 % 10 is 6),
	 * while divide (/) by 10 removes the rightmost digit (126 / 10 is 12).
	 *
	 * count7(717) → 2
	 * count7(7) → 1
	 * count7(123) → 0
	 */
	public int count7(int n)
	{
		throw new UnsupportedOperationException("Not supported yet.");
	}

	/**
	 * Given a non-negative int n, compute recursively (no loops) the count of the occurrences of 8 as a digit,
	 * except that an 8 with another 8 immediately to its left counts double, so 8818 yields 4.
	 * Note that mod (%) by 10 yields the rightmost digit (126 % 10 is 6), while divide (/) by 10 removes the rightmost
	 * digit (126 / 10 is 12).
	 *
	 * count8(8) → 1
	 * count8(818) → 2
	 * count8(8818) → 4
	 */
	public int count8(int n)
	{
		throw new UnsupportedOperationException("Not supported yet.");
	}

	/**
	 * Given base and n that are both 1 or more, compute recursively (no loops) the value of base to the n power,
	 * so powerN(3, 2) is 9 (3 squared).
	 *
	 * powerN(3, 1) → 3
	 * powerN(3, 2) → 9
	 * powerN(3, 3) → 27
	 */
	public int powerN(int base, int n)
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
		printFunction("count7");
		System.out.println("count7(717) → " + count7(717));
		System.out.println("count7(7) → " + count7(7));
		System.out.println("count7(123) → " + count7(123));
		System.out.println("count7(77) → " + count7(77));
		System.out.println("count7(7123) → " + count7(7123));
		System.out.println("count7(771237) → " + count7(771237));
		System.out.println("count7(771737) → " + count7(771737));
		System.out.println("count7(47571) → " + count7(47571));
		System.out.println("count7(777777) → " + count7(777777));
		System.out.println("count7(70701277) → " + count7(70701277));
		System.out.println("count7(777576197) → " + count7(777576197));
		System.out.println("count7(99999) → " + count7(99999));
		System.out.println("count7(99799) → " + count7(99799));
		printFunction("count8");
		System.out.println("count8(8) → " + count8(8));
		System.out.println("count8(818) → " + count8(818));
		System.out.println("count8(8818) → " + count8(8818));
		System.out.println("count8(8088) → " + count8(8088));
		System.out.println("count8(123) → " + count8(123));
		System.out.println("count8(81238) → " + count8(81238));
		System.out.println("count8(88788) → " + count8(88788));
		System.out.println("count8(8234) → " + count8(8234));
		System.out.println("count8(2348) → " + count8(2348));
		System.out.println("count8(23884) → " + count8(23884));
		System.out.println("count8(0) → " + count8(0));
		System.out.println("count8(1818188) → " + count8(1818188));
		System.out.println("count8(8818181) → " + count8(8818181));
		System.out.println("count8(188) → " + count8(188));
		System.out.println("count8(88888) → " + count8(88888));
		System.out.println("count8(9898) → " + count8(9898));
		System.out.println("count8(78) → " + count8(78));
	}
}
