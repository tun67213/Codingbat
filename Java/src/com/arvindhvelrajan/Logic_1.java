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
	}
}
