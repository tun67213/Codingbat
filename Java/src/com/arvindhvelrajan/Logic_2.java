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
	}
}
