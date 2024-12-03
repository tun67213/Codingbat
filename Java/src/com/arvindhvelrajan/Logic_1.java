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
	 * Given a day of the week encoded as 0=Sun, 1=Mon, 2=Tue, ...6=Sat, and a boolean indicating if we
	 * are on vacation, return a string of the form "7:00" indicating when the alarm clock should ring.
	 * Weekdays, the alarm should be "7:00" and on the weekend it should be "10:00".
	 * Unless we are on vacation -- then on weekdays it should be "10:00" and weekends it should be "off".
	 *
	 * alarmClock(1, false) → "7:00"
	 * alarmClock(5, false) → "7:00"
	 * alarmClock(0, false) → "10:00"
	 */
	public String alarmClock(int day, boolean vacation)
	{
		throw new UnsupportedOperationException("Not supported yet.");
	}

	/**
	 * The number 6 is a truly great number. Given two int values, a and b, return true if either one is 6.
	 * Or if their sum or difference is 6.
	 * Note: the function Math.abs(num) computes the absolute value of a number.
	 *
	 * love6(6, 4) → true
	 * love6(4, 5) → false
	 * love6(1, 5) → true
	 */
	public boolean love6(int a, int b)
	{
		throw new UnsupportedOperationException("Not supported yet.");
	}

	/**
	 * Given a number n, return true if n is in the range 1..10, inclusive.
	 * Unless outsideMode is true, in which case return true if the number is less or equal to 1,
	 * or greater or equal to 10.
	 *
	 * in1To10(5, false) → true
	 * in1To10(11, false) → false
	 * in1To10(11, true) → true
	 */
	public boolean in1To10(int n, boolean outsideMode)
	{
		throw new UnsupportedOperationException("Not supported yet.");
	}

	/**
	 * We'll say a number is special if it is a multiple of 11 or if it is one more than a multiple of 11.
	 * Return true if the given non-negative number is special.
	 * Use the % "mod" operator -- see Introduction to Mod
	 *
	 * specialEleven(22) → true
	 * specialEleven(23) → true
	 * specialEleven(24) → false
	 */
	public boolean specialEleven(int n)
	{
		throw new UnsupportedOperationException("Not supported yet.");
	}

	/**
	 * Return true if the given non-negative number is 1 or 2 more than a multiple of 20.
	 * See also: Introduction to Mod
	 *
	 * more20(20) → false
	 * more20(21) → true
	 * more20(22) → true
	 */
	public boolean more20(int n)
	{
		throw new UnsupportedOperationException("Not supported yet.");
	}

	/**
	 * Return true if the given non-negative number is a multiple of 3 or 5, but not both.
	 * Use the % "mod" operator -- see Introduction to Mod
	 *
	 * old35(3) → true
	 * old35(10) → true
	 * old35(15) → false
	 */
	public boolean old35(int n)
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
		printFunction("alarmClock");
		System.out.println("alarmClock(1, false) --> \"" + alarmClock(1, false) + "\"");
		System.out.println("alarmClock(5, false) --> \"" + alarmClock(5, false) + "\"");
		System.out.println("alarmClock(0, false) --> \"" + alarmClock(0, false) + "\"");
		System.out.println("alarmClock(6, false) --> \"" + alarmClock(6, false) + "\"");
		System.out.println("alarmClock(0, true) --> \"" + alarmClock(0, true) + "\"");
		System.out.println("alarmClock(6, true) --> \"" + alarmClock(6, true) + "\"");
		System.out.println("alarmClock(1, true) --> \"" + alarmClock(1, true) + "\"");
		System.out.println("alarmClock(3, true) --> \"" + alarmClock(3, true) + "\"");
		System.out.println("alarmClock(5, true) --> \"" + alarmClock(5, true) + "\"");
		printFunction("love6");
		System.out.println("love6(6, 4) --> " + love6(6, 4));
		System.out.println("love6(4, 5) --> " + love6(4, 5));
		System.out.println("love6(1, 5) --> " + love6(1, 5));
		System.out.println("love6(1, 6) --> " + love6(1, 6));
		System.out.println("love6(1, 8) --> " + love6(1, 8));
		System.out.println("love6(1, 7) --> " + love6(1, 7));
		System.out.println("love6(7, 5) --> " + love6(7, 5));
		System.out.println("love6(8, 2) --> " + love6(8, 2));
		System.out.println("love6(6, 6) --> " + love6(6, 6));
		System.out.println("love6(-6, 2) --> " + love6(-6, 2));
		System.out.println("love6(-4, -10) --> " + love6(-4, -10));
		System.out.println("love6(-7, 1) --> " + love6(-7, 1));
		System.out.println("love6(7, -1) --> " + love6(7, -1));
		System.out.println("love6(-6, 12) --> " + love6(-6, 12));
		System.out.println("love6(-2, -4) --> " + love6(-2, -4));
		System.out.println("love6(7, 1) --> " + love6(7, 1));
		System.out.println("love6(0, 9) --> " + love6(0, 9));
		System.out.println("love6(8, 3) --> " + love6(8, 3));
		System.out.println("love6(3, 3) --> " + love6(3, 3));
		System.out.println("love6(3, 4) --> " + love6(3, 4));
		printFunction("in1To10");
		System.out.println("in1To10(5, false) --> " + in1To10(5, false));
		System.out.println("in1To10(11, false) --> " + in1To10(11, false));
		System.out.println("in1To10(11, true) --> " + in1To10(11, true));
		System.out.println("in1To10(10, false) --> " + in1To10(10, false));
		System.out.println("in1To10(10, true) --> " + in1To10(10, true));
		System.out.println("in1To10(9, false) --> " + in1To10(9, false));
		System.out.println("in1To10(9, true) --> " + in1To10(9, true));
		System.out.println("in1To10(1, false) --> " + in1To10(1, false));
		System.out.println("in1To10(1, true) --> " + in1To10(1, true));
		System.out.println("in1To10(0, false) --> " + in1To10(0, false));
		System.out.println("in1To10(0, true) --> " + in1To10(0, true));
		System.out.println("in1To10(-1, false) --> " + in1To10(-1, false));
		System.out.println("in1To10(-1, true) --> " + in1To10(-1, true));
		System.out.println("in1To10(99, false) --> " + in1To10(99, false));
		System.out.println("in1To10(99, true) --> " + in1To10(99, true));
		printFunction("specialEleven");
		System.out.println("specialEleven(22) --> " + specialEleven(22));
		System.out.println("specialEleven(23) --> " + specialEleven(23));
		System.out.println("specialEleven(24) --> " + specialEleven(24));
		System.out.println("specialEleven(21) --> " + specialEleven(21));
		System.out.println("specialEleven(11) --> " + specialEleven(11));
		System.out.println("specialEleven(12) --> " + specialEleven(12));
		System.out.println("specialEleven(10) --> " + specialEleven(10));
		System.out.println("specialEleven(9) --> " + specialEleven(9));
		System.out.println("specialEleven(8) --> " + specialEleven(8));
		System.out.println("specialEleven(0) --> " + specialEleven(0));
		System.out.println("specialEleven(1) --> " + specialEleven(1));
		System.out.println("specialEleven(2) --> " + specialEleven(2));
		System.out.println("specialEleven(121) --> " + specialEleven(121));
		System.out.println("specialEleven(122) --> " + specialEleven(122));
		System.out.println("specialEleven(123) --> " + specialEleven(123));
		System.out.println("specialEleven(46) --> " + specialEleven(46));
		System.out.println("specialEleven(49) --> " + specialEleven(49));
		System.out.println("specialEleven(52) --> " + specialEleven(52));
		System.out.println("specialEleven(54) --> " + specialEleven(54));
		System.out.println("specialEleven(55) --> " + specialEleven(55));
		printFunction("more20");
		System.out.println("more20(20) --> " + more20(20));
		System.out.println("more20(21) --> " + more20(21));
		System.out.println("more20(22) --> " + more20(22));
		System.out.println("more20(23) --> " + more20(23));
		System.out.println("more20(25) --> " + more20(25));
		System.out.println("more20(30) --> " + more20(30));
		System.out.println("more20(31) --> " + more20(31));
		System.out.println("more20(59) --> " + more20(59));
		System.out.println("more20(60) --> " + more20(60));
		System.out.println("more20(61) --> " + more20(61));
		System.out.println("more20(62) --> " + more20(62));
		System.out.println("more20(1020) --> " + more20(1020));
		System.out.println("more20(1021) --> " + more20(1021));
		System.out.println("more20(1000) --> " + more20(1000));
		System.out.println("more20(1001) --> " + more20(1001));
		System.out.println("more20(50) --> " + more20(50));
		System.out.println("more20(55) --> " + more20(55));
		System.out.println("more20(40) --> " + more20(40));
		System.out.println("more20(41) --> " + more20(41));
		System.out.println("more20(39) --> " + more20(39));
		System.out.println("more20(42) --> " + more20(42));
	}
}
