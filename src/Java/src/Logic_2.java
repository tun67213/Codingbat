package src;

/**
 * @author arvindhvelrajan
 */
public class Logic_2 extends HelperMethods
{
	/**
	 * This method welcomes the user to this program.
	 */
	public void welcome()
	{
		System.out.println("\n\nLogic-2 Methods\n");
	}

	/**
	 * We want to make a row of bricks that is goal inches long. We have a number of small bricks (1 inch each) and big bricks (5 inches each). Return true if it is possible to make the goal by choosing from the given bricks. This is a little harder than it looks and can be done without any loops. See also: Introduction to MakeBricks
	 *
	 * makeBricks(3, 1, 8) → true
	 * makeBricks(3, 1, 9) → false
	 * makeBricks(3, 2, 10) → true
	 */
	public boolean makeBricks(int small, int big, int goal)
	{
		int useBig;
		if(goal / 5 < big)
		{
			useBig = goal / 5;
		}
		else
		{
			useBig = big;
		}
		int remaining = goal - useBig * 5;
		return remaining <= small;
	}

	/**
	 * Given 3 int values, a b c, return their sum. However, if one of the values is the same as another of the values, it does not count towards the sum.
	 *
	 * loneSum(1, 2, 3) → 6
	 * loneSum(3, 2, 3) → 2
	 * loneSum(3, 3, 3) → 0
	 */
	public int loneSum(int a, int b, int c)
	{
		int sum = 0;
		if(a != b && a != c)
		{
			sum += a;
		}
		if(b != a && b != c)
		{
			sum += b;
		}
		if(c != a && c != b)
		{
			sum += c;
		}
		return sum;
	}

	/**
	 * Given 3 int values, a b c, return their sum. However, if one of the values is 13 then it does not count towards the sum and values to its right do not count. So for example, if b is 13, then both b and c do not count.
	 *
	 * luckySum(1, 2, 3) → 6
	 * luckySum(1, 2, 13) → 3
	 * luckySum(1, 13, 3) → 1
	 */
	public int luckySum(int a, int b, int c)
	{
		throw new UnsupportedOperationException("Not implemented yet");
	}

	/**
	 * Given 3 int values, a b c, return their sum. However, if any of the values is a teen -- in the range 13..19 inclusive -- then that value counts as 0, except 15 and 16 do not count as a teens. Write a separate helper "public int fixTeen(int n) {"that takes in an int value and returns that value fixed for the teen rule. In this way, you avoid repeating the teen code 3 times (i.e. "decomposition"). Define the helper below and at the same indent level as the main noTeenSum().
	 *
	 * noTeenSum(1, 2, 3) → 6
	 * noTeenSum(2, 13, 1) → 3
	 * noTeenSum(2, 1, 14) → 3
	 */
	public int noTeenSum(int a, int b, int c)
	{
		throw new UnsupportedOperationException("Not implemented yet");
	}

	/**
	 * For this problem, we'll round an int value up to the next multiple of 10 if its rightmost digit is 5 or more, so 15 rounds up to 20. Alternately, round down to the previous multiple of 10 if its rightmost digit is less than 5, so 12 rounds down to 10. Given 3 ints, a b c, return the sum of their rounded values. To avoid code repetition, write a separate helper "public int round10(int num) {" and call it 3 times. Write the helper entirely below and at the same indent level as roundSum().
	 *
	 * roundSum(16, 17, 18) → 60
	 * roundSum(12, 13, 14) → 30
	 * roundSum(6, 4, 4) → 10
	 */
	public int roundSum(int a, int b, int c)
	{
		throw new UnsupportedOperationException("Not implemented yet");
	}

	/**
	 * Given three ints, a b c, return true if one of b or c is "close" (differing from a by at most 1), while the other is "far", differing from both other values by 2 or more. Note: Math.abs(num) computes the absolute value of a number.
	 *
	 * closeFar(1, 2, 10) → true
	 * closeFar(1, 2, 3) → false
	 * closeFar(4, 1, 3) → true
	 */
	public boolean closeFar(int a, int b, int c)
	{
		throw new UnsupportedOperationException("Not implemented yet");
	}

	/**
	 * Given 2 int values greater than 0, return whichever value is nearest to 21 without going over. Return 0 if they both go over.
	 *
	 * blackjack(19, 21) → 21
	 * blackjack(21, 19) → 21
	 * blackjack(19, 22) → 19
	 */
	public int blackjack(int a, int b)
	{
		throw new UnsupportedOperationException("Not implemented yet");
	}

	/**
	 * Given three ints, a b c, one of them is small, one is medium and one is large. Return true if the three values are evenly spaced, so the difference between small and medium is the same as the difference between medium and large.
	 *
	 * evenlySpaced(2, 4, 6) → true
	 * evenlySpaced(4, 6, 2) → true
	 * evenlySpaced(4, 6, 3) → false
	 */
	public boolean evenlySpaced(int a, int b, int c)
	{
		throw new UnsupportedOperationException("Not implemented yet");
	}

	/**
	 * We want make a package of goal kilos of chocolate. We have small bars (1 kilo each) and big bars (5 kilos each). Return the number of small bars to use, assuming we always use big bars before small bars. Return -1 if it can't be done.
	 *
	 * makeChocolate(4, 1, 9) → 4
	 * makeChocolate(4, 1, 10) → -1
	 * makeChocolate(4, 1, 7) → 2
	 */
	public int makeChocolate(int small, int big, int goal)
	{
		throw new UnsupportedOperationException("Not implemented yet");
	}

	/**
	 * @param args command line arguments
	 */
	public void main(String[] args)
	{
		HelperMethods.resetCallTimes();
		welcome();
		printMethod("makeBricks");
		System.out.println("makeBricks(3, 1, 8) -> " + makeBricks(3, 1, 8));
		System.out.println("makeBricks(3, 1, 9) -> " + makeBricks(3, 1, 9));
		System.out.println("makeBricks(3, 2, 10) -> " + makeBricks(3, 2, 10));
		System.out.println("makeBricks(3, 2, 8) -> " + makeBricks(3, 2, 8));
		System.out.println("makeBricks(3, 2, 9) -> " + makeBricks(3, 2, 9));
		System.out.println("makeBricks(6, 1, 11) -> " + makeBricks(6, 1, 11));
		System.out.println("makeBricks(6, 0, 11) -> " + makeBricks(6, 0, 11));
		System.out.println("makeBricks(1, 4, 11) -> " + makeBricks(1, 4, 11));
		System.out.println("makeBricks(0, 3, 10) -> " + makeBricks(0, 3, 10));
		System.out.println("makeBricks(1, 4, 12) -> " + makeBricks(1, 4, 12));
		System.out.println("makeBricks(3, 1, 7) -> " + makeBricks(3, 1, 7));
		System.out.println("makeBricks(1, 1, 7) -> " + makeBricks(1, 1, 7));
		System.out.println("makeBricks(2, 1, 7) -> " + makeBricks(2, 1, 7));
		System.out.println("makeBricks(7, 1, 11) -> " + makeBricks(7, 1, 11));
		System.out.println("makeBricks(7, 1, 8) -> " + makeBricks(7, 1, 8));
		System.out.println("makeBricks(7, 1, 13) -> " + makeBricks(7, 1, 13));
		System.out.println("makeBricks(43, 1, 46) -> " + makeBricks(43, 1, 46));
		System.out.println("makeBricks(40, 1, 46) -> " + makeBricks(40, 1, 46));
		System.out.println("makeBricks(40, 2, 47) -> " + makeBricks(40, 2, 47));
		System.out.println("makeBricks(40, 2, 50) -> " + makeBricks(40, 2, 50));
		System.out.println("makeBricks(40, 2, 52) -> " + makeBricks(40, 2, 52));
		System.out.println("makeBricks(22, 2, 33) -> " + makeBricks(22, 2, 33));
		System.out.println("makeBricks(0, 2, 10) -> " + makeBricks(0, 2, 10));
		System.out.println("makeBricks(1000000, 1000, 1000100) -> " + makeBricks(1000000, 1000, 1000100));
		System.out.println("makeBricks(2, 1000000, 100003) -> " + makeBricks(2, 1000000, 100003));
		System.out.println("makeBricks(20, 0, 19) -> " + makeBricks(20, 0, 19));
		System.out.println("makeBricks(20, 0, 21) -> " + makeBricks(20, 0, 21));
		System.out.println("makeBricks(20, 4, 51) -> " + makeBricks(20, 4, 51));
		System.out.println("makeBricks(20, 4, 39) -> " + makeBricks(20, 4, 39));
		printMethod("loneSum");
		System.out.println("loneSum");
		System.out.println("loneSum(1, 2, 3) -> " + loneSum(1, 2, 3));
		System.out.println("loneSum(3, 2, 3) -> " + loneSum(3, 2, 3));
		System.out.println("loneSum(3, 3, 3) -> " + loneSum(3, 3, 3));
		System.out.println("loneSum(9, 2, 2) -> " + loneSum(9, 2, 2));
		System.out.println("loneSum(2, 2, 9) -> " + loneSum(2, 2, 9));
		System.out.println("loneSum(2, 9, 2) -> " + loneSum(2, 9, 2));
		System.out.println("loneSum(2, 9, 3) -> " + loneSum(2, 9, 3));
		System.out.println("loneSum(4, 2, 3) -> " + loneSum(4, 2, 3));
		System.out.println("loneSum(1, 3, 1) -> " + loneSum(1, 3, 1));
		printMethod("luckySum");
		System.out.println("luckySum(1, 2, 3) -> " + luckySum(1, 2, 3));
		System.out.println("luckySum(1, 2, 13) -> " + luckySum(1, 2, 13));
		System.out.println("luckySum(1, 13, 3) -> " + luckySum(1, 13, 3));
		System.out.println("luckySum(1, 13, 13) -> " + luckySum(1, 13, 13));
		System.out.println("luckySum(6, 5, 2) -> " + luckySum(6, 5, 2));
		System.out.println("luckySum(13, 2, 3) -> " + luckySum(13, 2, 3));
		System.out.println("luckySum(13, 2, 13) -> " + luckySum(13, 2, 13));
		System.out.println("luckySum(13, 13, 2) -> " + luckySum(13, 13, 2));
		System.out.println("luckySum(9, 4, 13) -> " + luckySum(9, 4, 13));
		System.out.println("luckySum(8, 13, 2) -> " + luckySum(8, 13, 2));
		System.out.println("luckySum(7, 2, 1) -> " + luckySum(7, 2, 1));
		System.out.println("luckySum(3, 3, 13) -> " + luckySum(3, 3, 13));
		printMethod("noTeenSum");
		System.out.println("noTeenSum(1, 2, 3) -> " + noTeenSum(1, 2, 3));
		System.out.println("noTeenSum(2, 13, 1) -> " + noTeenSum(2, 13, 1));
		System.out.println("noTeenSum(2, 1, 14) -> " + noTeenSum(2, 1, 14));
		System.out.println("noTeenSum(2, 1, 15) -> " + noTeenSum(2, 1, 15));
		System.out.println("noTeenSum(2, 1, 16) -> " + noTeenSum(2, 1, 16));
		System.out.println("noTeenSum(2, 1, 17) -> " + noTeenSum(2, 1, 17));
		System.out.println("noTeenSum(17, 1, 2) -> " + noTeenSum(17, 1, 2));
		System.out.println("noTeenSum(2, 15, 2) -> " + noTeenSum(2, 15, 2));
		System.out.println("noTeenSum(16, 17, 18) -> " + noTeenSum(16, 17, 18));
		System.out.println("noTeenSum(17, 18, 19) -> " + noTeenSum(17, 18, 19));
		System.out.println("noTeenSum(15, 16, 1) -> " + noTeenSum(15, 16, 1));
		System.out.println("noTeenSum(15, 15, 19) -> " + noTeenSum(15, 15, 19));
		System.out.println("noTeenSum(15, 19, 16) -> " + noTeenSum(15, 19, 16));
		System.out.println("noTeenSum(5, 17, 18) -> " + noTeenSum(5, 17, 18));
		System.out.println("noTeenSum(17, 18, 16) -> " + noTeenSum(17, 18, 16));
		System.out.println("noTeenSum(17, 19, 18) -> " + noTeenSum(17, 19, 18));
		printMethod("roundSum");
		System.out.println("roundSum(16, 17, 18) -> " + roundSum(16, 17, 18));
		System.out.println("roundSum(12, 13, 14) -> " + roundSum(12, 13, 14));
		System.out.println("roundSum(6, 4, 4) -> " + roundSum(6, 4, 4));
		System.out.println("roundSum(4, 6, 5) -> " + roundSum(4, 6, 5));
		System.out.println("roundSUm(4, 4, 6) -> " + roundSum(4, 4, 6));
		System.out.println("roundSum(9, 4, 4) -> " + roundSum(9, 4, 4));
		System.out.println("roundSum(0, 0, 1) -> " + roundSum(0, 0, 1));
		System.out.println("roundSum(0, 9, 0) -> " + roundSum(0, 9, 0));
		System.out.println("roundSum(10, 10, 19) -> " + roundSum(10, 10, 19));
		System.out.println("roundSum(20, 30, 40) -> " + roundSum(20, 30, 40));
		System.out.println("roundSum(45, 21, 30) -> " + roundSum(45, 21, 30));
		System.out.println("roundSum(23, 11, 26) -> " + roundSum(23, 11, 26));
		System.out.println("roundSum(23, 24, 25) -> " + roundSum(23, 24, 25));
		System.out.println("roundSum(25, 24, 25) -> " + roundSum(25, 24, 25));
		System.out.println("roundSum(23, 24, 29) -> " + roundSum(23, 24, 29));
		System.out.println("roundSum(11, 24, 36) -> " + roundSum(11, 24, 36));
		System.out.println("roundSum(24, 36, 32) -> " + roundSum(24, 36, 32));
		System.out.println("roundSum(14, 12, 26) -> " + roundSum(14, 13, 26));
		System.out.println("roundSum(12, 10, 24) -> " + roundSum(12, 10, 24));
		printMethod("closeFar");
		System.out.println("closeFar(1, 2, 10) -> " + closeFar(1, 2, 10));
		System.out.println("closeFar(1, 2, 3) -> " + closeFar(1, 2, 3));
		System.out.println("closeFar(4, 1, 3) -> " + closeFar(4, 1, 3));
		System.out.println("closeFar(4, 5, 3) -> " + closeFar(4, 5, 3));
		System.out.println("closeFar(4, 3, 5) -> " + closeFar(4, 3, 5));
		System.out.println("closeFar(-1, 10, 0) -> " + closeFar(-1, 10, 0));
		System.out.println("closeFar(0, -1, 10) -> " + closeFar(0, -1, 10));
		System.out.println("closeFar(10, 10, 8) -> " + closeFar(10, 10, 8));
		System.out.println("closeFar(10, 8, 9) -> " + closeFar(10, 8, 9));
		System.out.println("closeFar(8, 9, 10) -> " + closeFar(8, 9, 10));
		System.out.println("closeFar(8, 9, 7) -> " + closeFar(8, 9, 7));
		System.out.println("closeFar(8, 6, 9) -> " + closeFar(8, 6, 9));
		printMethod("blackjack");
		System.out.println("blackjack(19, 21) -> " + blackjack(19, 21));
		System.out.println("blackjack(21, 19) -> " + blackjack(21, 19));
		System.out.println("blackjack(19, 22) -> " + blackjack(19, 22));
		System.out.println("blackjack(22, 19) -> " + blackjack(22, 19));
		System.out.println("blackjack(22, 50) -> " + blackjack(22, 50));
		System.out.println("blackjack(22, 22) -> " + blackjack(22, 22));
		System.out.println("blackjack(33, 1) -> " + blackjack(33, 1));
		System.out.println("blackjack(1, 2) -> " + blackjack(1, 2));
		System.out.println("blackjack(34, 33) -> " + blackjack(34, 33));
		System.out.println("blackjack(17, 19) -> " + blackjack(17, 19));
		System.out.println("blackjack(18, 17) -> " + blackjack(18, 17));
		System.out.println("blackjack(16, 23) -> " + blackjack(16, 23));
		System.out.println("blackjack(3, 4) -> " + blackjack(3, 4));
		System.out.println("blackjack(3, 2) -> " + blackjack(3, 2));
		System.out.println("blackjack(21, 20) -> " + blackjack(21, 20));
		printMethod("evenlySpaced");
		System.out.println("evenlySpaced(2, 4, 6) -> " + evenlySpaced(2, 4, 6));
		System.out.println("evenlySpaced(4, 6, 2) -> " + evenlySpaced(4, 6, 2));
		System.out.println("evenlySpaced(4, 6, 3) -> " + evenlySpaced(4, 6, 3));
		System.out.println("evenlySpaced(6, 2, 4) -> " + evenlySpaced(6, 2, 4));
		System.out.println("evenlySpaced(6, 2, 8) -> " + evenlySpaced(6, 2, 8));
		System.out.println("evenlySpaced(2, 2, 2) -> " + evenlySpaced(2, 2, 2));
		System.out.println("evenlySpaced(2, 2, 3) -> " + evenlySpaced(2, 2, 3));
		System.out.println("evenlySpaced(9, 10, 11) -> " + evenlySpaced(9, 10, 11));
		System.out.println("evenlySpaced(10, 9, 11) -> " + evenlySpaced(10, 9, 11));
		System.out.println("evenlySpaced(10, 9, 9) -> " + evenlySpaced(10, 9, 9));
		System.out.println("evenlySpaced(2, 4, 4) -> " + evenlySpaced(2, 4, 4));
		System.out.println("evenlySpaced(2, 2, 4) -> " + evenlySpaced(2, 2, 4));
		System.out.println("evenlySpaced(3, 6, 12) -> " + evenlySpaced(3, 6, 12));
		System.out.println("evenlySpaced(12, 3, 6) -> " + evenlySpaced(12, 3, 6));
		printMethod("makeChocolate");
		System.out.println("makeChocolate(4, 1, 9) -> " + makeChocolate(4, 1, 9));
		System.out.println("makeChocolate(4, 1, 10) -> " + makeChocolate(4, 1, 10));
		System.out.println("makeChocolate(4, 1, 7) -> " + makeChocolate(4, 1, 7));
		System.out.println("makeChocolate(6, 2, 7) -> " + makeChocolate(6, 2, 7));
		System.out.println("makeChocolate(4, 1, 5) -> " + makeChocolate(4, 1, 5));
		System.out.println("makeChocolate(4, 1, 4) -> " + makeChocolate(4, 1, 4));
		System.out.println("makeChocolate(5, 4, 9) -> " + makeChocolate(5, 4, 9));
		System.out.println("makeChocolate(9, 3, 18) -> " + makeChocolate(9, 3, 18));
		System.out.println("makeChocolate(3, 1, 9) -> " + makeChocolate(3, 1, 9));
		System.out.println("makeChocolate(1, 2, 7) -> " + makeChocolate(1, 2, 7));
		System.out.println("makeChocolate(1, 2, 6) -> " + makeChocolate(1, 2, 6));
		System.out.println("makeChocolate(1, 2, 5) -> " + makeChocolate(1, 2, 5));
		System.out.println("makeChocolate(6, 1, 10) -> " + makeChocolate(6, 1, 10));
		System.out.println("makeChocolate(6, 1, 11) -> " + makeChocolate(6, 1, 11));
		System.out.println("makeChocolate(6, 1, 12) -> " + makeChocolate(6, 1, 12));
		System.out.println("makeChocolate(6, 1, 13) -> " + makeChocolate(6, 1, 13));
		System.out.println("makeChocolate(6, 2, 10) -> " + makeChocolate(6, 2, 10));
		System.out.println("makeChocolate(6, 2, 11) -> " + makeChocolate(6, 2, 11));
		System.out.println("makeChocolate(6, 2, 12) -> " + makeChocolate(6, 2, 12));
		System.out.println("makeChocolate(60, 100, 550) -> " + makeChocolate(60, 100, 550));
		System.out.println("makeChocolate(1000, 1000000, 5000006) -> " + makeChocolate(1000, 1000000, 5000006));
		System.out.println("makeChocolate(7, 1, 12) -> " + makeChocolate(7, 1, 12));
		System.out.println("makeChocolate(7, 1, 13) -> " + makeChocolate(7, 1, 13));
		System.out.println("makeChocolate(7, 2, 13) -> " + makeChocolate(7, 2, 13));
	}
}
