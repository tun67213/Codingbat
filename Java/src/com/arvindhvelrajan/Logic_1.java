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
	}
}
