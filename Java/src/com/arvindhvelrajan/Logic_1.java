package com.arvindhvelrajan;

import static com.arvindhvelrajan.UI_Functions.*;

/**
 * @author arvindhvelrajan
 * @code This class is to demonstrate the implementation for all functions in Logic_1 from codingbat.com
 */
public class Logic_1
{
	/**
	 * This function introduces the user to the class that is being demonstrated.
	 */
	private void welcome()
	{
		System.out.println("\n\nLogic-1 Functions\n");
	}

	/**
	 * When squirrels get together for a party, they like to have cigars.
	 * A squirrel party is successful when the number of cigars is between 40 and 60, inclusive.
	 * Unless it is the weekend, in which case there is no upper bound on the number of cigars.
	 * Return true if the party with the given values is successful, or false otherwise.
	 *
	 * cigarParty(30, false) → false
	 * cigarParty(50, false) → true
	 * cigarParty(70, true) → true
	 */
	public boolean cigarParty(int cigars, boolean isWeekend)
	{
		throw new UnsupportedOperationException("Not supported yet.");
	}

	/**
	 * You and your date are trying to get a table at a restaurant.
	 * The parameter "you" is the stylishness of your clothes, in the range 0..10,
	 * and "date" is the stylishness of your date's clothes.
	 * The result getting the table is encoded as an int value with 0=no, 1=maybe, 2=yes.
	 * If either of you is very stylish, 8 or more, then the result is 2 (yes).
	 * With the exception that if either of you has style of 2 or less, then the result is 0 (no).
	 * Otherwise the result is 1 (maybe).
	 *
	 * dateFashion(5, 10) → 2
	 * dateFashion(5, 2) → 0
	 * dateFashion(5, 5) → 1
	 */
	public int dateFashion(int you, int date)
	{
		throw new UnsupportedOperationException("Not supported yet.");
	}

	/**
	 * The squirrels in Palo Alto spend most of the day playing.
	 * In particular, they play if the temperature is between 60 and 90 (inclusive).
	 * Unless it is summer, then the upper limit is 100 instead of 90.
	 * Given an int temperature and a boolean isSummer, return true if the squirrels play and false otherwise.
	 *
	 * squirrelPlay(70, false) → true
	 * squirrelPlay(95, false) → false
	 * squirrelPlay(95, true) → true
	 */
	public boolean squirrelPlay(int temp, boolean isSummer)
	{
		throw new UnsupportedOperationException("Not supported yet.");
	}

	/**
	 * You are driving a little too fast, and a police officer stops you.
	 * Write code to compute the result, encoded as an int value:
	 * 0=no ticket, 1=small ticket, 2=big ticket.
	 * If speed is 60 or less, the result is 0.
	 * If speed is between 61 and 80 inclusive, the result is 1.
	 * If speed is 81 or more, the result is 2.
	 * Unless it is your birthday -- on that day, your speed can be 5 higher in all cases.
	 *
	 * caughtSpeeding(60, false) → 0
	 * caughtSpeeding(65, false) → 1
	 * caughtSpeeding(65, true) → 0
	 */
	public int caughtSpeeding(int speed, boolean isBirthday)
	{
		throw new UnsupportedOperationException("Not supported yet.");
	}

	/**
	 * Given 2 ints, a and b, return their sum. However, sums in the range 10..19 inclusive, are forbidden,
	 * so in that case just return 20.
	 *
	 * sortaSum(3, 4) → 7
	 * sortaSum(9, 4) → 20
	 * sortaSum(10, 11) → 21
	 */
	public int sortaSum(int a, int b)
	{
		throw new UnsupportedOperationException("Not supported yet.");
	}

	/**
	 * @param args commandline arguments
	 */
	public void main(String[] args)
	{
		welcome();
		printFunction("cigarParty");
		System.out.println("cigarParty(30, false) --> " + cigarParty(30, false));
		System.out.println("cigarParty(50, false) --> " + cigarParty(50, false));
		System.out.println("cigarParty(70, true) --> " + cigarParty(70, true));
		System.out.println("cigarParty(30, true) --> " + cigarParty(30, true));
		System.out.println("cigarParty(50, true) --> " + cigarParty(50, true));
		System.out.println("cigarParty(60, false) --> " + cigarParty(60, false));
		System.out.println("cigarParty(61, false) --> " + cigarParty(61, false));
		System.out.println("cigarParty(40, false) --> " + cigarParty(40, false));
		System.out.println("cigarParty(39, false) --> " + cigarParty(39, false));
		System.out.println("cigarParty(40, true) --> " + cigarParty(40, true));
		System.out.println("cigarParty(39, true) --> " + cigarParty(39, true));
		printFunction("dateFashion");
		System.out.println("dateFashion(5, 10) --> " + dateFashion(5, 10));
		System.out.println("dateFashion(5, 2) --> " + dateFashion(5, 2));
		System.out.println("dateFashion(5, 5) --> " + dateFashion(5, 5));
		System.out.println("dateFashion(3, 3) --> " + dateFashion(3, 3));
		System.out.println("dateFashion(10, 2) --> " + dateFashion(10, 2));
		System.out.println("dateFashion(2, 9) --> " + dateFashion(2, 9));
		System.out.println("dateFashion(9, 9) --> " + dateFashion(9, 9));
		System.out.println("dateFashion(10, 5) --> " + dateFashion(10, 5));
		System.out.println("dateFashion(2, 2) --> " + dateFashion(2, 2));
		System.out.println("dateFashion(3, 7) --> " + dateFashion(3, 7));
		System.out.println("dateFashion(2, 7) --> " + dateFashion(2, 7));
		System.out.println("dateFashion(6, 2) --> " + dateFashion(6, 2));
		printFunction("squirrelPlay");
		System.out.println("squirrelPlay(70, false) --> " + squirrelPlay(70, false));
		System.out.println("squirrelPlay(95, false) --> " + squirrelPlay(95, false));
		System.out.println("squirrelPlay(95, true) --> " + squirrelPlay(95, true));
		System.out.println("squirrelPlay(90, false) --> " + squirrelPlay(90, false));
		System.out.println("squirrelPlay(90, true) --> " + squirrelPlay(90, true));
		System.out.println("squirrelPlay(50, false) --> " + squirrelPlay(50, false));
		System.out.println("squirrelPlay(50, true) --> " + squirrelPlay(50, true));
		System.out.println("squirrelPlay(100, false) --> " + squirrelPlay(100, false));
		System.out.println("squirrelPlay(100, true) --> " + squirrelPlay(100, true));
		System.out.println("squirrelPlay(105, true) --> " + squirrelPlay(105, true));
		System.out.println("squirrelPlay(59, false) --> " + squirrelPlay(59, false));
		System.out.println("squirrelPlay(59, true) --> " + squirrelPlay(59, true));
		System.out.println("squirrelPlay(60, false) --> " + squirrelPlay(60, false));
		printFunction("caughtSpeeding");
		System.out.println("caughtSpeeding(60, false) --> " + caughtSpeeding(60, false));
		System.out.println("caughtSpeeding(65, false) --> " + caughtSpeeding(65, false));
		System.out.println("caughtSpeeding(65, true) --> " + caughtSpeeding(65, true));
		System.out.println("caughtSpeeding(80, false) --> " + caughtSpeeding(80, false));
		System.out.println("caughtSpeeding(85, false) --> " + caughtSpeeding(85, false));
		System.out.println("caughtSpeeding(70, false) --> " + caughtSpeeding(70, false));
		System.out.println("caughtSpeeding(75, false) --> " + caughtSpeeding(75, false));
		System.out.println("caughtSpeeding(75, true) --> " + caughtSpeeding(75, true));
		System.out.println("caughtSpeeding(40, false) --> " + caughtSpeeding(40, false));
		System.out.println("caughtSpeeding(40, true) --> " + caughtSpeeding(40, true));
		System.out.println("caughtSpeeding(90, false) --> " + caughtSpeeding(90, false));
		printFunction("sortaSum");
		System.out.println("sortaSum(3, 4) --> " + sortaSum(3, 4));
		System.out.println("sortaSum(9, 4) --> " + sortaSum(9, 4));
		System.out.println("sortaSum(10, 11) --> " + sortaSum(10, 11));
		System.out.println("sortaSum(12, -3) --> " + sortaSum(12, -3));
		System.out.println("sortaSum(-3, 12) --> " + sortaSum(-3, 12));
		System.out.println("sortaSum(4, 5) --> " + sortaSum(4, 5));
		System.out.println("sortaSum(4, 6) --> " + sortaSum(4, 6));
		System.out.println("sortaSum(14, 7) --> " + sortaSum(14, 7));
		System.out.println("sortaSum(14, 6) --> " + sortaSum(14, 6));
	}
}
