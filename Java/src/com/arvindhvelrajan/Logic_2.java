package com.arvindhvelrajan;

import static com.arvindhvelrajan.UI_Functions.*;

/**
 * @author arvindhvelrajan
 * @code This class is to demonstrate the implementation for all functions in Logic_2 from codingbat.com
 */
public class Logic_2
{
	private void welcome()
	{
		System.out.println("\n\nLogic-2 Functions\n");
	}

	/**
	 * We want to make a row of bricks that is goal inches long. We have a number of small bricks (1 inch each) and
	 * big bricks (5 inches each). Return true if it is possible to make the goal by choosing from the given bricks.
	 * This is a little harder than it looks and can be done without any loops. See also: Introduction to MakeBricks
	 *
	 * makeBricks(3, 1, 8) → true
	 * makeBricks(3, 1, 9) → false
	 * makeBricks(3, 2, 10) → true
	 */
	public boolean makeBricks(int small, int big, int goal)
	{
		throw new UnsupportedOperationException("Not supported yet.");
	}

	/**
	 * Given 3 int values, a b c, return their sum. However, if one of the values is the same as another of the values,
	 * it does not count towards the sum.
	 *
	 * loneSum(1, 2, 3) → 6
	 * loneSum(3, 2, 3) → 2
	 * loneSum(3, 3, 3) → 0
	 */
	public int loneSum(int a, int b, int c)
	{
		throw new UnsupportedOperationException("Not supported yet.");
	}

	/**
	 * Given 3 int values, a b c, return their sum. However, if one of the values is 13 then it does not count towards
	 * the sum and values to its right do not count. So for example, if b is 13, then both b and c do not count.
	 *
	 * luckySum(1, 2, 3) → 6
	 * luckySum(1, 2, 13) → 3
	 * luckySum(1, 13, 3) → 1
	 */
	public int luckySum(int a, int b, int c)
	{
		throw new UnsupportedOperationException("Not supported yet.");
	}

	/**
	 * Given 3 int values, a b c, return their sum.
	 * However, if any of the values is a teen -- in the range 13..19 inclusive -- then that value counts as 0,
	 * except 15 and 16 do not count as a teens.
	 * Write a separate helper "public int fixTeen(int n) {"
	 * that takes in an int value and returns that value fixed for the teen rule.
	 * In this way, you avoid repeating the teen code 3 times (i.e. "decomposition").
	 * Define the helper below and at the same indent level as the main noTeenSum().
	 *
	 * noTeenSum(1, 2, 3) → 6
	 * noTeenSum(2, 13, 1) → 3
	 * noTeenSum(2, 1, 14) → 3
	 */
	public int noTeenSum(int a, int b, int c)
	{
		throw new UnsupportedOperationException("Not supported yet.");
	}

	/**
	 * For this problem, we'll round an int value up to the next multiple of 10 if its rightmost digit is
	 * 5 or more, so 15 rounds up to 20.
	 * Alternately, round down to the previous multiple of 10 if its rightmost digit is less than 5,
	 * so 12 rounds down to 10. Given 3 ints, a b c, return the sum of their rounded values.
	 * To avoid code repetition, write a separate helper "public int round10(int num) {" and call it 3 times.
	 * Write the helper entirely below and at the same indent level as roundSum().
	 *
	 * roundSum(16, 17, 18) → 60
	 * roundSum(12, 13, 14) → 30
	 * roundSum(6, 4, 4) → 10
	 */
	public int roundSum(int a, int b, int c)
	{
		throw new UnsupportedOperationException("Not supported yet.");
	}

	/**
	 * Given three ints, a b c, return true if one of b or c is "close" (differing from a by at most 1),
	 * while the other is "far", differing from both other values by 2 or more.
	 * Note: Math.abs(num) computes the absolute value of a number.
	 *
	 * closeFar(1, 2, 10) → true
	 * closeFar(1, 2, 3) → false
	 * closeFar(4, 1, 3) → true
	 */
	public boolean closeFar(int a, int b, int c)
	{
		throw new UnsupportedOperationException("Not supported yet.");
	}

	/**
	 * @param args commandline arguments
	 */
	public void main(String[] args)
	{
		welcome();
		printFunction("makeBricks");
		System.out.println("makeBricks(3, 1, 8) --> " + makeBricks(3, 1, 8));
		System.out.println("makeBricks(3, 1, 9) --> " + makeBricks(3, 1, 9));
		System.out.println("makeBricks(3, 2, 10) --> " + makeBricks(3, 2, 10));
		System.out.println("makeBricks(3, 2, 8) --> " + makeBricks(3, 2, 8));
		System.out.println("makeBricks(3, 2, 9) --> " + makeBricks(3, 2, 9));
		System.out.println("makeBricks(6, 1, 11) --> " + makeBricks(6, 1, 11));
		System.out.println("makeBricks(6, 0, 11) --> " + makeBricks(6, 0, 11));
		System.out.println("makeBricks(1, 4, 11) --> " + makeBricks(1, 4, 11));
		System.out.println("makeBricks(0, 3, 10) --> " + makeBricks(0, 3, 10));
		System.out.println("makeBricks(1, 4, 12) --> " + makeBricks(1, 4, 12));
		System.out.println("makeBricks(3, 1, 7) --> " + makeBricks(3, 1, 7));
		System.out.println("makeBricks(1, 1, 7) --> " + makeBricks(1, 1, 7));
		System.out.println("makeBricks(2, 1, 7) --> " + makeBricks(2, 1, 7));
		System.out.println("makeBricks(7, 1, 11) --> " + makeBricks(7, 1, 11));
		System.out.println("makeBricks(7, 1, 8) --> " + makeBricks(7, 1, 8));
		System.out.println("makeBricks(7, 1, 13) --> " + makeBricks(7, 1, 13));
		System.out.println("makeBricks(43, 1, 46) --> " + makeBricks(43, 1, 46));
		System.out.println("makeBricks(40, 1, 46) --> " + makeBricks(40, 1, 46));
		System.out.println("makeBricks(40, 2, 47) --> " + makeBricks(40, 2, 47));
		System.out.println("makeBricks(40, 2, 50) --> " + makeBricks(40, 2, 50));
		System.out.println("makeBricks(40, 2, 52) --> " + makeBricks(40, 2, 52));
		System.out.println("makeBricks(22, 2, 33) --> " + makeBricks(22, 2, 33));
		System.out.println("makeBricks(0, 2, 10) --> " + makeBricks(0, 2, 10));
		System.out.println("makeBricks(1000000, 1000, 1000100) --> " + makeBricks(1000000, 1000, 1000100));
		System.out.println("makeBricks(2, 1000000, 100003) --> " + makeBricks(2, 1000000, 100003));
		System.out.println("makeBricks(20, 0, 19) --> " + makeBricks(20, 0, 19));
		System.out.println("makeBricks(20, 0, 21) --> " + makeBricks(20, 0, 21));
		System.out.println("makeBricks(20, 4, 51) --> " + makeBricks(20, 4, 51));
		System.out.println("makeBricks(20, 4, 39) --> " + makeBricks(20, 4, 39));
		printFunction("loneSum");
		System.out.println("loneSum(1, 2, 3) --> " + loneSum(1, 2 ,3));
		System.out.println("loneSum(3, 2, 3) --> " + loneSum(3, 2, 3));
		System.out.println("loneSum(3, 3, 3) --> " + loneSum(3, 3, 3));
		System.out.println("loneSum(9, 2, 2) --> " + loneSum(9, 2, 2));
		System.out.println("loneSum(2, 2, 9) --> " + loneSum(2, 2, 9));
		System.out.println("loneSum(2, 9, 2) --> " + loneSum(2, 9, 2));
		System.out.println("loneSum(2, 9, 3) --> " + loneSum(2, 9, 3));
		System.out.println("loneSum(4, 2, 3) --> " + loneSum(4, 2, 3));
		System.out.println("loneSum(1, 3, 1) --> " + loneSum(1, 3, 1));
		printFunction("luckySum");
		System.out.println("luckySum(1, 2, 3) --> " + luckySum(1, 2, 3));
		System.out.println("luckySum(1, 2, 13) --> " + luckySum(1, 2, 13));
		System.out.println("luckySum(1, 13, 3) --> " + luckySum(1, 13, 3));
		System.out.println("luckySum(1, 13, 13) --> " + luckySum(1, 13, 13));
		System.out.println("luckySum(6, 5, 2) --> " + luckySum(6, 5, 2));
		System.out.println("luckySum(13, 2, 3) --> " + luckySum(13, 2, 3));
		System.out.println("luckySum(13, 13, 2) --> " + luckySum(13, 13, 2));
		System.out.println("luckySum(9, 4, 13) --> " + luckySum(9, 4, 13));
		System.out.println("luckySum(8, 13, 2) --> " + luckySum(8, 13, 2));
		System.out.println("luckySum(7, 2, 1) --> " + luckySum(7, 2, 1));
		System.out.println("luckySum(3, 3, 13) --> " + luckySum(3, 3, 13));
		printFunction("noTeenSum");
		System.out.println("noTeenSum(1, 2, 3) --> " + noTeenSum(1, 2, 3));
		System.out.println("noTeenSum(2, 13, 1) --> " + noTeenSum(2, 13, 1));
		System.out.println("noTeenSum(2, 1, 14) --> " + noTeenSum(2, 1, 14));
		System.out.println("noTeenSum(2, 1, 15) --> " + noTeenSum(2, 1, 15));
		System.out.println("noTeenSum(2, 1, 16) --> " + noTeenSum(2, 1, 16));
		System.out.println("noTeenSum(2, 1, 17) --> " + noTeenSum(2, 1, 17));
		System.out.println("noTeenSum(17, 1, 2) --> " + noTeenSum(17, 1, 2));
		System.out.println("noTeenSum(2, 15, 2) --> " + noTeenSum(2, 15, 2));
		System.out.println("noTeenSum(16, 17, 18) --> " + noTeenSum(16, 17, 18));
		System.out.println("noTeenSum(17, 18, 19) --> " + noTeenSum(17, 18, 19));
		System.out.println("noTeenSum(15, 16, 1) --> " + noTeenSum(15, 16, 1));
		System.out.println("noTeenSum(15, 15, 19) --> " + noTeenSum(15, 15, 19));
		System.out.println("noTeenSum(15, 19, 16) --> " + noTeenSum(15, 19, 16));
		System.out.println("noTeenSum(5, 17, 18) --> " + noTeenSum(5, 17, 18));
		System.out.println("noTeenSum(17, 18, 16) --> " + noTeenSum(17, 18, 16));
		System.out.println("noTeenSum(17, 19, 18) --> " + noTeenSum(17, 19, 18));
		printFunction("roundSum");
		System.out.println("roundSum(16, 17, 18) --> " + roundSum(16, 17, 18));
		System.out.println("roundSum(12, 13, 14) --> " + roundSum(12, 13, 14));
		System.out.println("roundSum(6, 4, 4) --> " + roundSum(6, 4, 4));
		System.out.println("roundSum(4, 6, 5) --> " + roundSum(4, 6, 5));
		System.out.println("roundSum(4, 4, 6) --> " + roundSum(4, 4, 6));
		System.out.println("roundSum(9, 4, 4) --> " + roundSum(9, 4, 4));
		System.out.println("roundSum(0, 0, 1) --> " + roundSum(0, 0, 1));
		System.out.println("roundSum(0, 9, 0) --> " + roundSum(0, 9, 0));
		System.out.println("roundSum(10, 10, 19) --> " + roundSum(10, 10, 19));
		System.out.println("roundSum(20, 30, 40) --> " + roundSum(20, 30, 40));
		System.out.println("roundSum(45, 21, 30) --> " + roundSum(45, 21, 30));
		System.out.println("roundSum(23, 11, 26) --> " + roundSum(23, 11, 26));
		System.out.println("roundSum(23, 24, 25) --> " + roundSum(23, 24, 25));
		System.out.println("roundSum(25, 24, 25) --> " + roundSum(25, 24, 25));
		System.out.println("roundSum(23, 24, 29) --> " + roundSum(23, 24, 29));
		System.out.println("roundSum(11, 24, 36) --> " + roundSum(11, 24, 36));
		System.out.println("roundSum(24, 36, 32) --> " + roundSum(24, 36, 32));
		System.out.println("roundSum(14, 12, 26) --> " + roundSum(14, 12, 26));
		System.out.println("roundSum(12, 10, 24) --> " + roundSum(12, 10, 24));
	}
}
