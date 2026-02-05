package src;

/**
 * @author arvindhvelrajan
 */
public class Logic_1 extends HelperMethods
{
	/**
	 * This method welcomes the user to this program.
	 */
	public void welcome()
	{
		System.out.println("\n\nLogic-1 Methods\n");
	}

	/**
	 * When squirrels get together for a party, they like to have cigars. A squirrel party is successful when the number of cigars is between 40 and 60, inclusive. Unless it is the weekend, in which case there is no upper bound on the number of cigars. Return true if the party with the given values is successful, or false otherwise.
	 *
	 * cigarParty(30, false) → false
	 * cigarParty(50, false) → true
	 * cigarParty(70, true) → true
	 */
	public boolean cigarParty(int cigars, boolean isWeekend)
	{
		if(isWeekend)
		{
			return cigars >= 40;
		}
		return cigars >= 40 && cigars <= 60;
	}

	/**
	 * You and your date are trying to get a table at a restaurant. The parameter "you" is the stylishness of your clothes, in the range 0..10, and "date" is the stylishness of your date's clothes. The result getting the table is encoded as an int value with 0=no, 1=maybe, 2=yes. If either of you is very stylish, 8 or more, then the result is 2 (yes). With the exception that if either of you has style of 2 or less, then the result is 0 (no). Otherwise the result is 1 (maybe).
	 *
	 * dateFashion(5, 10) → 2
	 * dateFashion(5, 2) → 0
	 * dateFashion(5, 5) → 1
	 */
	public int dateFashion(int you, int date)
	{
		if(you <= 2 || date <= 2)
		{
			return 0;
		}
		if(you >= 8 || date >= 8)
		{
			return 2;
		}
		return 1;
	}

	/**
	 * The squirrels in Palo Alto spend most of the day playing. In particular, they play if the temperature is between 60 and 90 (inclusive). Unless it is summer, then the upper limit is 100 instead of 90. Given an int temperature and a boolean isSummer, return true if the squirrels play and false otherwise.
	 *
	 * squirrelPlay(70, false) → true
	 * squirrelPlay(95, false) → false
	 * squirrelPlay(95, true) → true
	 */
	public boolean squirrelPlay(int temp, boolean isSummer)
	{
		if(temp < 60)
		{
			return false;
		}
		if(isSummer)
		{
			return temp <= 100;
		}
		return temp <= 90;
	}

	/**
	 * You are driving a little too fast, and a police officer stops you. Write code to compute the result, encoded as an int value: 0=no ticket, 1=small ticket, 2=big ticket. If speed is 60 or less, the result is 0. If speed is between 61 and 80 inclusive, the result is 1. If speed is 81 or more, the result is 2. Unless it is your birthday -- on that day, your speed can be 5 higher in all cases.
	 *
	 * caughtSpeeding(60, false) → 0
	 * caughtSpeeding(65, false) → 1
	 * caughtSpeeding(65, true) → 0
	 */
	public int caughtSpeeding(int speed, boolean isBirthday)
	{
		if(isBirthday)
		{
			if(speed <= 65)
			{
				return 0;
			}
			if(speed > 85)
			{
				return 2;
			}
			return 1;
		}
		if(speed <= 60)
		{
			return 0;
		}
		if(speed > 80)
		{
			return 2;
		}
		return 1;
	}

	/**
	 * Given 2 ints, a and b, return their sum. However, sums in the range 10..19 inclusive, are forbidden, so in that case just return 20.
	 *
	 * sortaSum(3, 4) → 7
	 * sortaSum(9, 4) → 20
	 * sortaSum(10, 11) → 21
	 */
	public int sortaSum(int a, int b)
	{
		int sum = a + b;
		if(sum >= 10 && sum <= 19)
		{
			return 20;
		}
		return sum;
	}

	/**
	 * Given a day of the week encoded as 0=Sun, 1=Mon, 2=Tue, ...6=Sat, and a boolean indicating if we are on vacation, return a string of the form "7:00" indicating when the alarm clock should ring. Weekdays, the alarm should be "7:00" and on the weekend it should be "10:00". Unless we are on vacation -- then on weekdays it should be "10:00" and weekends it should be "off".
	 *
	 * alarmClock(1, false) → "7:00"
	 * alarmClock(5, false) → "7:00"
	 * alarmClock(0, false) → "10:00"
	 */
	public String alarmClock(int day, boolean vacation)
	{
		if(vacation)
		{
			if((day == 0) || (day == 6))
			{
				return "off";
			}
			return "10:00";
		}
		if((day == 0) || (day == 6))
		{
			return "10:00";
		}
		return "7:00";
	}

	/**
	 * The number 6 is a truly great number. Given two int values, a and b, return true if either one is 6. Or if their sum or difference is 6. Note: the function Math.abs(num) computes the absolute value of a number.
	 *
	 * love6(6, 4) → true
	 * love6(4, 5) → false
	 * love6(1, 5) → true
	 */
	public boolean love6(int a, int b)
	{
		if(a == 6 || b == 6 || a + b == 6 || Math.abs(a - b) == 6)
		{
			return true;
		}
		return false;
	}

	/**
	 * Given a number n, return true if n is in the range 1..10, inclusive. Unless outsideMode is true, in which case return true if the number is less or equal to 1, or greater or equal to 10.
	 *
	 * in1To10(5, false) → true
	 * in1To10(11, false) → false
	 * in1To10(11, true) → true
	 */
	public boolean in1To10(int n, boolean outsideMode)
	{
		if(outsideMode)
		{
			if(n <= 1 || n >= 10)
			{
				return true;
			}
			return false;
		}
		if(n >= 1 && n <= 10)
		{
			return true;
		}
		return false;
	}

	/**
	 * We'll say a number is special if it is a multiple of 11 or if it is one more than a multiple of 11. Return true if the given non-negative number is special. Use the % "mod" operator -- see Introduction to Mod
	 *
	 * specialEleven(22) → true
	 * specialEleven(23) → true
	 * specialEleven(24) → false
	 */
	public boolean specialEleven(int n)
	{
		if(n % 11 <= 1)
		{
			return true;
		}
		return false;
	}

	/**
	 * Return true if the given non-negative number is 1 or 2 more than a multiple of 20. See also: Introduction to Mod
	 *
	 * more20(20) → false
	 * more20(21) → true
	 * more20(22) → true
	 */
	public boolean more20(int n)
	{
		return (n % 20 == 1) || (n % 20 == 2);
	}

	/**
	 * Return true if the given non-negative number is a multiple of 3 or 5, but not both. Use the % "mod" operator -- see Introduction to Mod
	 *
	 * old35(3) → true
	 * old35(10) → true
	 * old35(15) → false
	 */
	public boolean old35(int n)
	{
		return (n % 3 == 0) ^ (n % 5 == 0);
	}

	/**
	 * Return true if the given non-negative number is 1 or 2 less than a multiple of 20. So for example 38 and 39 return true, but 40 returns false. See also: Introduction to Mod
	 *
	 * less20(18) → true
	 * less20(19) → true
	 * less20(20) → false
	 */
	public boolean less20(int n)
	{
		return n % 20 >= 18;
	}

	/**
	 * Given a non-negative number "num", return true if num is within 2 of a multiple of 10. Note: (a % b) is the remainder of dividing a by b, so (7 % 5) is 2. See also: Introduction to Mod
	 *
	 * nearTen(12) → true
	 * nearTen(17) → false
	 * nearTen(19) → true
	 */
	public boolean nearTen(int n)
	{
		return (n % 10 >= 8) || (n % 10 <= 2);
	}

	/**
	 * Given 2 ints, a and b, return their sum. However, "teen" values in the range 13..19 inclusive, are extra lucky. So if either value is a teen, just return 19.
	 *
	 * teenSum(3, 4) → 7
	 * teenSum(10, 13) → 19
	 * teenSum(13, 2) → 19
	 */
	public int teenSum(int a, int b)
	{
		if(isTeen(a) || isTeen(b))
		{
			return 20;
		}
		return a + b;
	}
	/**
	 * The following is a helper method for solving teenSum().
	 */
	private boolean isTeen(int a)
	{
		return a >= 13 && a <= 19;
	}

	/**
	 * Your cell phone rings. Return true if you should answer it. Normally you answer, except in the morning you only answer if it is your mom calling. In all cases, if you are asleep, you do not answer.
	 *
	 * answerCell(false, false, false) → true
	 * answerCell(false, false, true) → false
	 * answerCell(true, false, false) → false
	 */
	public boolean answerCell(boolean isMorning, boolean isMom, boolean isAsleep)
	{
		if(isAsleep)
		{
			return false;
		}
		if(isMorning)
		{
			return isMom;
		}
		return true;
	}

	/**
	 * We are having a party with amounts of tea and candy. Return the int outcome of the party encoded as 0=bad, 1=good, or 2=great. A party is good (1) if both tea and candy are at least 5. However, if either tea or candy is at least double the amount of the other one, the party is great (2). However, in all cases, if either tea or candy is less than 5, the party is always bad (0).
	 *
	 * teaParty(6, 8) → 1
	 * teaParty(3, 8) → 0
	 * teaParty(20, 6) → 2
	 */
	public int teaParty(int tea, int candy)
	{
		if((tea < 5) || (candy < 5))
		{
			return 0;
		}
		if((tea >= 2 * candy) || (candy >= 2 * tea))
		{
			return 2;
		}
		return 1;
	}

	/**
	 * Given a string str, if the string starts with "f" return "Fizz". If the string ends with "b" return "Buzz". If both the "f" and "b" conditions are true, return "FizzBuzz". In all other cases, return the string unchanged. (See also: FizzBuzz Code)
	 *
	 * fizzString("fig") → "Fizz"
	 * fizzString("dib") → "Buzz"
	 * fizzString("fib") → "FizzBuzz"
	 */
	public String fizzString(String str)
	{
		boolean startsWithF = (str.length() > 0 && str.substring(0, 1).equals("f"));
		boolean endsWithB = (str.length() > 0 && str.substring(str.length() - 1).equals("b"));

		if(startsWithF && endsWithB)
		{
			return "FizzBuzz";
		}
		if(startsWithF)
		{
			return "Fizz";
		}
		if(endsWithB)
		{
			return "Buzz";
		}
		return str;
	}

	/**
	 * Given an int n, return the string form of the number followed by "!". So the int 6 yields "6!". Except if the number is divisible by 3 use "Fizz" instead of the number, and if the number is divisible by 5 use "Buzz", and if divisible by both 3 and 5, use "FizzBuzz". Note: the % "mod" operator computes the remainder after division, so 23 % 10 yields 3. What will the remainder be when one number divides evenly into another? (See also: FizzBuzz Code and Introduction to Mod)
	 *
	 * fizzString2(1) → "1!"
	 * fizzString2(2) → "2!"
	 * fizzString2(3) → "Fizz!"
	 */
	public String fizzString2(int n)
	{
		if(n % 15 == 0)
		{
			return "FizzBuzz!";
		}
		if(n % 3 == 0)
		{
			return "Fizz!";
		}
		if(n % 5 == 0)
		{
			return "Buzz!";
		}
		return n + "!";
	}

	/**
	 * Given three ints, a b c, return true if it is possible to add two of the ints to get the third.
	 *
	 * twoAsOne(1, 2, 3) → true
	 * twoAsOne(3, 1, 2) → true
	 * twoAsOne(3, 2, 2) → false
	 */
	public boolean twoAsOne(int a, int b, int c)
	{
		throw new UnsupportedOperationException("Not implemented yet");
	}

	/**
	 * Given three ints, a b c, return true if b is greater than a, and c is greater than b. However, with the exception that if "bOk" is true, b does not need to be greater than a.
	 *
	 * inOrder(1, 2, 4, false) → true
	 * inOrder(1, 2, 1, false) → false
	 * inOrder(1, 1, 2, true) → true
	 */
	public boolean inOrder(int a, int b, int c, boolean bOk)
	{
		throw new UnsupportedOperationException("Not implemented yet");
	}

	/**
	 * Given three ints, a b c, return true if they are in strict increasing order, such as 2 5 11, or 5 6 7, but not 6 5 7 or 5 5 7. However, with the exception that if "equalOk" is true, equality is allowed, such as 5 5 7 or 5 5 5.
	 *
	 * inOrderEqual(2, 5, 11, false) → true
	 * inOrderEqual(5, 7, 6, false) → false
	 * inOrderEqual(5, 5, 7, true) → true
	 */
	public boolean inOrderEqual(int a, int b, int c, boolean equalOk)
	{
		throw new UnsupportedOperationException("Not implemented yet");
	}

	/**
	 * Given three ints, a b c, return true if two or more of them have the same rightmost digit. The ints are non-negative. Note: the % "mod" operator computes the remainder, e.g. 17 % 10 is 7.
	 *
	 * lastDigit(23, 19, 13) → true
	 * lastDigit(23, 19, 12) → false
	 * lastDigit(23, 19, 3) → true
	 */
	public boolean lastDigit(int a, int b, int c)
	{
		throw new UnsupportedOperationException("Not implemented yet");
	}

	/**
	 * Given three ints, a b c, return true if one of them is 10 or more less than one of the others.
	 *
	 * lessBy10(1, 7, 11) → true
	 * lessBy10(1, 7, 10) → false
	 * lessBy10(11, 1, 7) → true
	 */
	public boolean lessBy10(int a, int b, int c)
	{
		throw new UnsupportedOperationException("Not implemented yet");
	}

	/**
	 * Return the sum of two 6-sided dice rolls, each in the range 1..6. However, if noDoubles is true, if the two dice show the same value, increment one die to the next value, wrapping around to 1 if its value was 6.
	 *
	 * withoutDoubles(2, 3, true) → 5
	 * withoutDoubles(3, 3, true) → 7
	 * withoutDoubles(3, 3, false) → 6
	 */
	public int withoutDoubles(int die1, int die2, boolean noDoubles)
	{
		throw new UnsupportedOperationException("Not implemented yet");
	}

	/**
	 * Given two int values, return whichever value is larger. However if the two values have the same remainder when divided by 5, then the return the smaller value. However, in all cases, if the two values are the same, return 0. Note: the % "mod" operator computes the remainder, e.g. 7 % 5 is 2.
	 *
	 * maxMod5(2, 3) → 3
	 * maxMod5(6, 2) → 6
	 * maxMod5(3, 2) → 3
	 */
	public int maxMod5(int a, int b)
	{
		throw new UnsupportedOperationException("Not implemented yet");
	}

	/**
	 * You have a red lottery ticket showing ints a, b, and c, each of which is 0, 1, or 2. If they are all the value 2, the result is 10. Otherwise if they are all the same, the result is 5. Otherwise so long as both b and c are different from a, the result is 1. Otherwise the result is 0.
	 *
	 * redTicket(2, 2, 2) → 10
	 * redTicket(2, 2, 1) → 0
	 * redTicket(0, 0, 0) → 5
	 */
	public int redTicket(int a, int b, int c)
	{
		throw new UnsupportedOperationException("Not implemented yet");
	}

	/**
	 * You have a green lottery ticket, with ints a, b, and c on it. If the numbers are all different from each other, the result is 0. If all of the numbers are the same, the result is 20. If two of the numbers are the same, the result is 10.
	 *
	 * greenTicket(1, 2, 3) → 0
	 * greenTicket(2, 2, 2) → 20
	 * greenTicket(1, 1, 2) → 10
	 */
	public int greenTicket(int a, int b, int c)
	{
		throw new UnsupportedOperationException("Not implemented yet");
	}

	/**
	 * You have a blue lottery ticket, with ints a, b, and c on it. This makes three pairs, which we'll call ab, bc, and ac. Consider the sum of the numbers in each pair. If any pair sums to exactly 10, the result is 10. Otherwise if the ab sum is exactly 10 more than either bc or ac sums, the result is 5. Otherwise the result is 0.
	 *
	 * blueTicket(9, 1, 0) → 10
	 * blueTicket(9, 2, 0) → 0
	 * blueTicket(6, 1, 4) → 10
	 */
	public int blueTicket(int a, int b, int c)
	{
		throw new UnsupportedOperationException("Not implemented yet");
	}

	/**
	 * Given two ints, each in the range 10..99, return true if there is a digit that appears in both numbers, such as the 2 in 12 and 23. (Note: division, e.g. n/10, gives the left digit while the % "mod" n%10 gives the right digit.)
	 *
	 * shareDigit(12, 23) → true
	 * shareDigit(12, 43) → false
	 * shareDigit(12, 44) → false
	 */
	public boolean shareDigit(int a, int b)
	{
		throw new UnsupportedOperationException("Not implemented yet");
	}

	/**
	 * Given 2 non-negative ints, a and b, return their sum, so long as the sum has the same number of digits as a. If the sum has more digits than a, just return a without b. (Note: one way to compute the number of digits of a non-negative int n is to convert it to a string with String.valueOf(n) and then check the length of the string.)
	 *
	 * sumLimit(2, 3) → 5
	 * sumLimit(8, 3) → 8
	 * sumLimit(8, 1) → 9
	 */
	public int sumLimit(int a, int b)
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
		printMethod("cigarParty");
		System.out.println("cigarParty(30, false) -> " + cigarParty(30, false));
		System.out.println("cigarParty(50, false) -> " + cigarParty(50, false));
		System.out.println("cigarParty(70, true) -> " + cigarParty(70, true));
		System.out.println("cigarParty(30, true) -> " + cigarParty(30, true));
		System.out.println("cigarParty(50, true) -> " + cigarParty(50, true));
		System.out.println("cigarParty(60, false) -> " + cigarParty(60, false));
		System.out.println("cigarParty(61, false) -> " + cigarParty(61, false));
		System.out.println("cigarParty(40, false) -> " + cigarParty(40, false));
		System.out.println("cigarParty(39, false) -> " + cigarParty(39, false));
		System.out.println("cigarParty(40, true) -> " + cigarParty(40, true));
		System.out.println("cigarParty(39, true) -> " + cigarParty(39, true));
		printMethod("dateFashion");
		System.out.println("dateFashion(5, 10) -> " + dateFashion(5, 10));
		System.out.println("dateFashion(5, 2) -> " + dateFashion(5, 2));
		System.out.println("dateFashion(5, 5) -> " + dateFashion(5, 5));
		System.out.println("dateFashion(3, 3) -> " + dateFashion(3, 3));
		System.out.println("dateFashion(10, 2) -> " + dateFashion(10, 2));
		System.out.println("dateFashion(2, 9) -> " + dateFashion(2, 9));
		System.out.println("dateFashion(9, 9) -> " + dateFashion(9, 9));
		System.out.println("dateFashion(10, 5) -> " + dateFashion(10, 5));
		System.out.println("dateFashion(2, 2) -> " + dateFashion(2, 2));
		System.out.println("dateFashion(3, 7) -> " + dateFashion(3, 7));
		System.out.println("dateFashion(2, 7) -> " + dateFashion(2, 7));
		System.out.println("dateFashion(6, 2) -> " + dateFashion(6, 2));
		printMethod("squirrelPlay");
		System.out.println("squirrelPlay(70, false) -> " + squirrelPlay(70, false));
		System.out.println("squirrelPlay(95, false) -> " + squirrelPlay(95, false));
		System.out.println("squirrelPlay(95, true) -> " + squirrelPlay(95, true));
		System.out.println("squirrelPlay(90, false) -> " + squirrelPlay(90, false));
		System.out.println("squirrelPlay(90, true) -> " + squirrelPlay(90, true));
		System.out.println("squirrelPlay(50, false) -> " + squirrelPlay(50, false));
		System.out.println("squirrelPlay(50, true) -> " + squirrelPlay(50, true));
		System.out.println("squirrelPlay(100, false) -> " + squirrelPlay(100, false));
		System.out.println("squirrelPlay(100, true) -> " + squirrelPlay(100, true));
		System.out.println("squirrelPlay(105, true) -> " + squirrelPlay(105, true));
		System.out.println("squirrelPlay(59, false) -> " + squirrelPlay(59, false));
		System.out.println("squirrelPlay(59, true) -> " + squirrelPlay(59, true));
		System.out.println("squirrelPlay(60, false) -> " + squirrelPlay(60, false));
		printMethod("caughtSpeeding");
		System.out.println("caughtSpeeding(60, false) -> " + caughtSpeeding(60, false));
		System.out.println("caughtSpeeding(65, false) -> " + caughtSpeeding(65, false));
		System.out.println("caughtSpeeding(65, true) -> " + caughtSpeeding(65, true));
		System.out.println("caughtSpeeding(80, false) -> " + caughtSpeeding(80, false));
		System.out.println("caughtSpeeding(85, false) -> " + caughtSpeeding(85, false));
		System.out.println("caughtSpeeding(85, true) -> " + caughtSpeeding(85, true));
		System.out.println("caughtSpeeding(70, false) -> " + caughtSpeeding(70, false));
		System.out.println("caughtSpeeding(75, false) -> " + caughtSpeeding(75, false));
		System.out.println("caughtSpeeding(75, true) -> " + caughtSpeeding(75, true));
		System.out.println("caughtSpeeding(40, false) -> " + caughtSpeeding(40, false));
		System.out.println("caughtSpeeding(40, true) -> " + caughtSpeeding(40, true));
		System.out.println("caughtSpeeding(90, false) -> " + caughtSpeeding(90, false));
		printMethod("sortaSum");
		System.out.println("sortaSum(3, 4) -> " + sortaSum(3, 4));
		System.out.println("sortaSum(9, 4) -> " + sortaSum(9, 4));
		System.out.println("sortaSum(10, 11) -> " + sortaSum(10, 11));
		System.out.println("sortaSum(12, -3) -> " + sortaSum(12, -3));
		System.out.println("sortaSum(-3, 12) -> " + sortaSum(-3, 12));
		System.out.println("sortaSum(4, 5) -> " + sortaSum(4, 5));
		System.out.println("sortaSum(4, 6) -> " + sortaSum(4, 6));
		System.out.println("sortaSum(14, 7) -> " + sortaSum(14, 7));
		System.out.println("sortaSum(14, 6) -> " + sortaSum(14, 6));
		printMethod("alarmClock");
		System.out.println("alarmClock(1, false) -> \"" + alarmClock(1, false) + "\"");
		System.out.println("alarmClock(5, false) -> \"" + alarmClock(5, false) + "\"");
		System.out.println("alarmClock(0, false) -> \"" + alarmClock(0, false) + "\"");
		System.out.println("alarmClock(6, false) -> \"" + alarmClock(6, false) + "\"");
		System.out.println("alarmClock(0, true) -> \"" + alarmClock(0, true) + "\"");
		System.out.println("alarmClock(6, true) -> \"" + alarmClock(6, true) + "\"");
		System.out.println("alarmClock(1, true) -> \"" + alarmClock(1, true) + "\"");
		System.out.println("alarmClock(3, true) -> \"" + alarmClock(3, true) + "\"");
		System.out.println("alarmClock(5, true) -> \"" + alarmClock(5, true) + "\"");
		printMethod("love6");
		System.out.println("love6(6, 4) -> " + love6(6, 4));
		System.out.println("love6(4, 5) -> " + love6(4, 5));
		System.out.println("love6(1, 5) -> " + love6(1, 5));
		System.out.println("love6(1, 6) -> " + love6(1, 6));
		System.out.println("love6(1, 8) -> " + love6(1, 8));
		System.out.println("love6(1, 7) -> " + love6(1, 7));
		System.out.println("love6(7, 5) -> " + love6(7, 5));
		System.out.println("love6(8, 2) -> " + love6(8, 2));
		System.out.println("love6(6, 6) -> " + love6(6, 6));
		System.out.println("love6(-6, 2) -> " + love6(-6, 2));
		System.out.println("love6(-4, -10) -> " + love6(-4, -10));
		System.out.println("love6(-7, 1) -> " + love6(-7, 1));
		System.out.println("love6(7, -1) -> " + love6(7, -1));
		System.out.println("love6(-6, 12) -> " + love6(-6, 12));
		System.out.println("love6(-2, -4) -> " + love6(-2, -4));
		System.out.println("love6(7, 1) -> " + love6(7, 1));
		System.out.println("love6(0, 9) -> " + love6(0, 9));
		System.out.println("love6(8, 3) -> " + love6(8, 3));
		System.out.println("love6(3, 3) -> " + love6(3, 3));
		System.out.println("love6(3, 4) -> " + love6(3, 4));
		printMethod("in1To10");
		System.out.println("in1To10(5, false) -> " + in1To10(5, false));
		System.out.println("in1To10(11, false) -> " + in1To10(11, false));
		System.out.println("in1To10(11, true) -> " + in1To10(11, true));
		System.out.println("in1To10(10, false) -> " + in1To10(10, false));
		System.out.println("in1To10(10, true) -> " + in1To10(10, true));
		System.out.println("In1To10(9, false) -> " + in1To10(9, false));
		System.out.println("in1To10(9, true) -> " + in1To10(9, true));
		System.out.println("in1To10(1, false) -> " + in1To10(1, false));
		System.out.println("in1To10(1, true) -> " + in1To10(1, true));
		System.out.println("in1To10(0, false) -> " + in1To10(0, false));
		System.out.println("in1To10(0, true) -> " + in1To10(0, true));
		System.out.println("in1To10(-1, false) -> " + in1To10(-1, false));
		System.out.println("in1To10(-1, true) -> " + in1To10(-1, true));
		System.out.println("in1To10(99, false) -> " + in1To10(99, false));
		System.out.println("in1To10(-99, true) -> " + in1To10(-99, true));
		printMethod("specialEleven");
		System.out.println("specialEleven(22) -> " + specialEleven(22));
		System.out.println("specialEleven(23) -> " + specialEleven(23));
		System.out.println("specialEleven(24) -> " + specialEleven(24));
		System.out.println("specialEleven(21) -> " + specialEleven(21));
		System.out.println("specialEleven(11) -> " + specialEleven(11));
		System.out.println("specialEleven(12) -> " + specialEleven(12));
		System.out.println("specialEleven(10) -> " + specialEleven(10));
		System.out.println("specialEleven(9) -> " + specialEleven(9));
		System.out.println("specialEleven(8) -> " + specialEleven(8));
		System.out.println("specialEleven(0) -> " + specialEleven(0));
		System.out.println("specialEleven(1) -> " + specialEleven(1));
		System.out.println("specialEleven(2) -> " + specialEleven(2));
		System.out.println("specialEleven(121) -> " + specialEleven(121));
		System.out.println("specialEleven(122) -> " + specialEleven(122));
		System.out.println("specialEleven(123) -> " + specialEleven(123));
		System.out.println("specialEleven(46) -> " + specialEleven(46));
		System.out.println("specialEleven(49) -> " + specialEleven(49));
		System.out.println("specialEleven(52) -> " + specialEleven(52));
		System.out.println("specialEleven(54) -> " + specialEleven(54));
		System.out.println("specialEleven(55) -> " + specialEleven(55));
		printMethod("more20");
		System.out.println("more20(20) -> " + more20(20));
		System.out.println("more20(21) -> " + more20(21));
		System.out.println("more20(22) -> " + more20(22));
		System.out.println("more20(23) -> " + more20(23));
		System.out.println("more20(25) -> " + more20(25));
		System.out.println("more20(30) -> " + more20(30));
		System.out.println("more20(31) -> " + more20(31));
		System.out.println("more20(59) -> " + more20(59));
		System.out.println("more20(60) -> " + more20(60));
		System.out.println("more20(61) -> " + more20(61));
		System.out.println("more20(62) -> " + more20(62));
		System.out.println("more20(1020) -> " + more20(1020));
		System.out.println("more20(1021) -> " + more20(1021));
		System.out.println("more20(1000) -> " + more20(1000));
		System.out.println("more20(1001) -> " + more20(1001));
		System.out.println("more20(50) -> " + more20(50));
		System.out.println("more20(55) -> " + more20(55));
		System.out.println("more20(40) -> " + more20(40));
		System.out.println("more20(41) -> " + more20(41));
		System.out.println("more20(39) -> " + more20(39));
		System.out.println("more20(42) -> " + more20(42));
		printMethod("old35");
		System.out.println("old35(3) -> " + old35(3));
		System.out.println("old35(10) -> " + old35(10));
		System.out.println("old35(15) -> " + old35(15));
		System.out.println("old35(5) -> " + old35(5));
		System.out.println("old35(9) -> " + old35(9));
		System.out.println("old35(8) -> " + old35(8));
		System.out.println("old35(7) -> " + old35(7));
		System.out.println("Old35(6) -> " + old35(6));
		System.out.println("old35(17) -> " + old35(17));
		System.out.println("old35(18) -> " + old35(18));
		System.out.println("old35(29) -> " + old35(29));
		System.out.println("old35(20) -> " + old35(20));
		System.out.println("old35(21) -> " + old35(21));
		System.out.println("old35(22) -> " + old35(22));
		System.out.println("old35(45) -> " + old35(45));
		System.out.println("old35(99) -> " + old35(99));
		printMethod("less20");
		System.out.println("less20(18) -> " + less20(18));
		System.out.println("less20(19) -> " + less20(19));
		System.out.println("Less20(20) -> " + less20(20));
		System.out.println("less20(8) -> " + less20(8));
		System.out.println("less20(17) -> " + less20(17));
		System.out.println("less20(23) -> " + less20(23));
		System.out.println("less20(25) -> " + less20(25));
		System.out.println("less20(30) -> " + less20(30));
		System.out.println("less20(31) -> " + less20(31));
		System.out.println("less20(58) -> " + less20(58));
		System.out.println("less20(59) -> " + less20(59));
		System.out.println("less20(60) -> " + less20(60));
		System.out.println("less20(61) -> " + less20(61));
		System.out.println("less20(62) -> " + less20(62));
		System.out.println("less20(1017) -> " + less20(1017));
		System.out.println("less20(1018) -> " + less20(1018));
		System.out.println("less20(1019) -> " + less20(1019));
		System.out.println("less20(1020) -> " + less20(1020));
		System.out.println("less20(1021) -> " + less20(1021));
		System.out.println("less20(1022) -> " + less20(1022));
		System.out.println("less20(1023) -> " + less20(1023));
		System.out.println("less20(37) -> " + less20(37));
		printMethod("nearTen");
		System.out.println("nearTen(12) -> " + nearTen(12));
		System.out.println("nearTen(17) -> " + nearTen(17));
		System.out.println("nearTen(19) -> " + nearTen(19));
		System.out.println("nearTen(31) -> " + nearTen(31));
		System.out.println("nearTen(6) -> " + nearTen(6));
		System.out.println("nearTen(10) -> " + nearTen(10));
		System.out.println("nearTen(11) -> " + nearTen(11));
		System.out.println("nearTen(21) -> " + nearTen(21));
		System.out.println("nearTen(22) -> " + nearTen(22));
		System.out.println("nearTen(23) -> " + nearTen(23));
		System.out.println("nearTen(54) -> " + nearTen(54));
		System.out.println("nearTen(155) -> " + nearTen(155));
		System.out.println("nearTen(158) -> " + nearTen(158));
		System.out.println("nearTen(3) -> " + nearTen(3));
		System.out.println("nearTen(1) -> " + nearTen(1));
		printMethod("teenSum");
		System.out.println("teenSum(3, 4) -> " + teenSum(3, 4));
		System.out.println("teenSum(10, 13) -> " + teenSum(10, 13));
		System.out.println("teenSum(13, 2) -> " + teenSum(13, 2));
		System.out.println("teenSum(3, 19) -> " + teenSum(3, 19));
		System.out.println("teenSum(13, 13) -> " + teenSum(13, 13));
		System.out.println("teenSum(10, 10) -> " + teenSum(10, 10));
		System.out.println("teenSum(6, 14) -> " + teenSum(6, 14));
		System.out.println("teenSum(15, 2) -> " + teenSum(15, 2));
		System.out.println("teenSum(19, 19) -> " + teenSum(19, 19));
		System.out.println("teenSum(19, 20) -> " + teenSum(19, 20));
		System.out.println("teenSum(2, 18) -> " + teenSum(2, 18));
		System.out.println("teenSum(12, 4) -> " + teenSum(12, 4));
		System.out.println("teenSum(2, 20) -> " + teenSum(2, 20));
		System.out.println("teenSum(2, 17) -> " + teenSum(2, 17));
		System.out.println("teenSum(2, 16) -> " + teenSum(2, 16));
		System.out.println("teenSum(6, 7) -> " + teenSum(6, 7));
		printMethod("answerCell");
		System.out.println("answerCell(false, false, false) -> " + answerCell(false, false, false));
		System.out.println("answerCell(false, false, true) -> " + answerCell(false, false, true));
		System.out.println("answerCell(true, false, false) -> " + answerCell(true, false, false));
		System.out.println("answerCell(true, true, false) -> " + answerCell(true, true, false));
		System.out.println("answerCell(false, true, false) -> " + answerCell(false, true, false));
		System.out.println("answerCell(true, true, true) -> " + answerCell(true, true, true));
		printMethod("teaParty");
		System.out.println("teaParty(6, 8) -> " + teaParty(6, 8));
		System.out.println("teaParty(3, 8) -> " + teaParty(3, 8));
		System.out.println("teaParty(20, 6) -> " + teaParty(20, 6));
		System.out.println("teaParty(12, 6) -> " + teaParty(12, 6));
		System.out.println("teaParty(11, 6) -> " + teaParty(11, 6));
		System.out.println("teaParty(11, 4) -> " + teaParty(11, 4));
		System.out.println("teaParty(4, 5) -> " + teaParty(4, 5));
		System.out.println("teaParty(5, 5) -> " + teaParty(5, 5));
		System.out.println("teaParty(6, 6) -> " + teaParty(6, 6));
		System.out.println("teaParty(5, 10) -> " + teaParty(5, 10));
		System.out.println("teaParty(5, 9) -> " + teaParty(5, 9));
		System.out.println("teaParty(10, 4) -> " + teaParty(10, 4));
		System.out.println("teaParty(10, 20) -> " + teaParty(10, 20));
		printMethod("fizzString");
		System.out.println("fizzString(\"fig\") -> \"" + fizzString("fig") + "\"");
		System.out.println("fizzString(\"dib\") -> \"" + fizzString("dib") + "\"");
		System.out.println("fizzString(\"fib\") -> \"" + fizzString("fib") + "\"");
		System.out.println("fizzString(\"abc\") -> \"" + fizzString("abc") + "\"");
		System.out.println("fizzString(\"fooo\") -> \"" + fizzString("fooo") + "\"");
		System.out.println("fizzString(\"booo\") -> \"" + fizzString("booo") + "\"");
		System.out.println("fizzString(\"ooob\") -> \"" + fizzString("ooob") + "\"");
		System.out.println("fizzString(\"fooob\") -> \"" + fizzString("fooob") + "\"");
		System.out.println("fizzString(\"f\") -> \"" + fizzString("f") + "\"");
		System.out.println("fizzString(\"b\") -> \"" + fizzString("b") + "\"");
		System.out.println("fizzString(\"abcb\") -> \"" + fizzString("abcb") + "\"");
		System.out.println("fizzString(\"Hello\") -> \"" + fizzString("Hello") + "\"");
		System.out.println("fizzString(\"Hellob\") -> \"" + fizzString("Hellob") + "\"");
		System.out.println("fizzString(\"af\") -> \"" + fizzString("af") + "\"");
		System.out.println("fizzString(\"bf\") -> \"" + fizzString("bf") + "\"");
		System.out.println("fizzString(\"fb\") -> \"" + fizzString("fb") + "\"");
		printMethod("fizzString2");
		System.out.println("fizzString2(1) -> \"" + fizzString2(1) + "\"");
		System.out.println("fizzString2(2) -> \"" + fizzString2(2) + "\"");
		System.out.println("fizzString2(3) -> \"" + fizzString2(3) + "\"");
		System.out.println("fizzString2(4) -> \"" + fizzString2(4) + "\"");
		System.out.println("fizzString2(5) -> \"" + fizzString2(5) + "\"");
		System.out.println("fizzString2(6) -> \"" + fizzString2(6) + "\"");
		System.out.println("fizzString2(7) -> \"" + fizzString2(7) + "\"");
		System.out.println("fizzString2(8) -> \"" + fizzString2(8) + "\"");
		System.out.println("fizzString2(9) -> \"" + fizzString2(9) + "\"");
		System.out.println("fizzString2(15) -> \"" + fizzString2(15) + "\"");
		System.out.println("fizzString2(16) -> \"" + fizzString2(16) + "\"");
		System.out.println("fizzString2(18) -> \"" + fizzString2(18) + "\"");
		System.out.println("fizzString2(19) -> \"" + fizzString2(19) + "\"");
		System.out.println("fizzString2(21) -> \"" + fizzString2(21) + "\"");
		System.out.println("fizzString2(44) -> \"" + fizzString2(44) + "\"");
		System.out.println("fizzString2(45) -> \"" + fizzString2(45) + "\"");
		System.out.println("fizzString2(100) -> \"" + fizzString2(100) + "\"");
		printMethod("twoAsOne");
		System.out.println("twoAsOne(1, 2, 3) -> " + twoAsOne(1, 2, 3));
		System.out.println("twoAsOne(3, 1, 2) -> " + twoAsOne(3, 1, 2));
		System.out.println("twoAsOne(3, 2, 2) -> " + twoAsOne(3, 2, 2));
		System.out.println("twoAsOne(2, 3, 1) -> " + twoAsOne(2, 3, 1));
		System.out.println("twoAsOne(5, 3, -2) -> " + twoAsOne(5, 3, -2));
		System.out.println("twoAsOne(5, 3, -3) -> " + twoAsOne(5, 3, -3));
		System.out.println("twoAsOne(2, 5, 3) -> " + twoAsOne(2, 5, 3));
		System.out.println("twoAsOne(9, 5, 5) -> " + twoAsOne(9, 5, 5));
		System.out.println("twoAsOne(9, 4, 5) -> " + twoAsOne(9, 4, 5));
		System.out.println("twoAsOne(5, 4, 9) -> " + twoAsOne(5, 4, 9));
		System.out.println("twoAsOne(3, 3, 0) -> " + twoAsOne(3, 3, 0));
		System.out.println("twoAsOne(3, 3, 2) -> " + twoAsOne(3, 3, 2));
		printMethod("inOrder");
		System.out.println("inOrder(1, 2, 4, false) -> " + inOrder(1, 2, 4, false));
		System.out.println("inOrder(1, 2, 1, false) -> " + inOrder(1, 2, 1, false));
		System.out.println("inOrder(1, 1, 2, true) -> " + inOrder(1, 1, 2, true));
		System.out.println("inOrder(3, 2, 4, false) -> " + inOrder(3, 2, 4, false));
		System.out.println("inOrder(2, 3, 4, false) -> " + inOrder(2, 3, 4, false));
		System.out.println("inOrder(3, 2, 4, true) -> " + inOrder(3, 2, 4, true));
		System.out.println("inOrder(4, 2, 2, true) -> " + inOrder(4, 2, 2, true));
		System.out.println("inOrder(4, 5, 2, true) -> " + inOrder(4, 5, 2, true));
		System.out.println("inOrder(2, 4, 6, true) -> " + inOrder(2, 4, 6, true));
		System.out.println("inOrder(7, 9, 10, false) -> " + inOrder(7, 9, 10, false));
		System.out.println("inOrder(7, 5, 6, true) -> " + inOrder(7, 5, 6, true));
		System.out.println("inOrder(7, 5, 4, true) -> " + inOrder(7, 5, 4, true));
		printMethod("inOrderEqual");
		System.out.println("inOrderEqual(2, 5, 11, false) -> " + inOrderEqual(2, 5, 11, false));
		System.out.println("inOrderEqual(5, 7, 6, false) -> " + inOrderEqual(5, 7, 6, false));
		System.out.println("inOrderEqual(5, 5, 7, true) -> " + inOrderEqual(5, 5, 7, true));
		System.out.println("inOrderEqual(5, 5, 7, false) -> " + inOrderEqual(5, 5, 7, false));
		System.out.println("inOrderEqual(2, 5, 4, false) -> " + inOrderEqual(2, 5, 4, false));
		System.out.println("inOrderEqual(3, 4, 3, false) -> " + inOrderEqual(3, 4, 3, false));
		System.out.println("inOrderEqual(3, 4, 4, false) -> " + inOrderEqual(3, 4, 4, false));
		System.out.println("inOrderEqual(3, 4, 3, true) -> " + inOrderEqual(3, 4, 3, true));
		System.out.println("inOrderEqual(3, 4, 4, true) -> " + inOrderEqual(3, 4, 4, true));
		System.out.println("inOrderEqual(1, 5, 5, true) -> " + inOrderEqual(1, 5, 5, true));
		System.out.println("inOrderEqual(5, 5, 5, true) -> " + inOrderEqual(5, 5, 5, true));
		System.out.println("inOrderEqual(2, 2, 1, true) -> " + inOrderEqual(2, 2, 1, true));
		System.out.println("inOrderEqual(9, 2, 2, true) -> " + inOrderEqual(9, 2, 2, true));
		System.out.println("inOrderEqual(0, 1, 0, true) -> " + inOrderEqual(0, 1, 0, true));
		printMethod("lastDigit");
		System.out.println("lastDigit(23, 19, 13) -> " + lastDigit(23, 19, 13));
		System.out.println("lastDigit(23, 19, 12) -> " + lastDigit(23, 19, 12));
		System.out.println("lastDigit(23, 19, 3) -> " + lastDigit(23, 19, 3));
		System.out.println("lastDigit(23, 19, 39) -> " + lastDigit(23, 19, 39));
		System.out.println("lastDigit(1, 2, 3) -> " + lastDigit(1, 2, 3));
		System.out.println("lastDigit(1, 1, 2) -> " + lastDigit(1, 1, 2));
		System.out.println("lastDigit(1, 2, 2) -> " + lastDigit(1, 2, 2));
		System.out.println("lastDigit(14, 25, 43) -> " + lastDigit(14, 25, 43));
		System.out.println("lastDigit(14, 25, 45) -> " + lastDigit(14, 25, 45));
		System.out.println("lastDigit(248, 106, 1002) -> " + lastDigit(248, 106, 1002));
		System.out.println("lastDigit(248, 106, 1008) -> " + lastDigit(248, 106, 1008));
		System.out.println("lastDigit(10, 11, 20) -> " + lastDigit(10, 11, 20));
		System.out.println("lastDigit(0, 11, 0) -> " + lastDigit(0, 11, 0));
		printMethod("lessBy10");
		System.out.println("lessBy10(1, 7, 11) -> " + lessBy10(1, 7, 11));
		System.out.println("lessBy10(1, 7, 10) -> " + lessBy10(1, 7, 10));
		System.out.println("lessBy10(11, 1, 7) -> " + lessBy10(11, 1, 7));
		System.out.println("lessBy10(10, 7, 1) -> " + lessBy10(10, 7, 1));
		System.out.println("lessBy10(-10, 2, 2) -> " + lessBy10(-10, 2, 2));
		System.out.println("lessBy10(2, 11, 11) -> " + lessBy10(2, 11, 11));
		System.out.println("lessBy10(3, 3, 30) -> " + lessBy10(3, 3, 10));
		System.out.println("lessBy10(3, 3, 3) -> " + lessBy10(3, 3, 3));
		System.out.println("lessBy10(10, 1, 11) -> " + lessBy10(10, 1, 11));
		System.out.println("lessBy10(10, 11, 1) -> " + lessBy10(10, 11, 1));
		System.out.println("lessBy10(10, 11, 2) -> " + lessBy10(10, 11, 2));
		System.out.println("lessBy10(3, 30, 3) -> " + lessBy10(3, 30, 3));
		System.out.println("lessBy10(2, 2, -8) -> " + lessBy10(2, 2, -8));
		System.out.println("lessBy10(2, 8, 12) -> " + lessBy10(2, 8, 12));
		printMethod("withoutDoubles");
		System.out.println("withoutDoubles(2, 3, true) -> " + withoutDoubles(2, 3, true));
		System.out.println("withoutDoubles(3, 3, true) -> " + withoutDoubles(3, 3, true));
		System.out.println("withoutDoubles(3, 3, false) -> " + withoutDoubles(3, 3, false));
		System.out.println("withoutDoubles(2, 3, false) -> " + withoutDoubles(2, 3, false));
		System.out.println("withoutDoubles(5, 4, true) -> " + withoutDoubles(5, 4, true));
		System.out.println("withoutDoubles(5, 4, false) -> " + withoutDoubles(5, 4, false));
		System.out.println("withoutDoubles(5, 5, true) -> " + withoutDoubles(5, 5, true));
		System.out.println("withoutDoubles(5, 5, false) -> " + withoutDoubles(5, 5, false));
		System.out.println("withoutDoubles(6, 6, true) -> " + withoutDoubles(6, 6, true));
		System.out.println("withoutDoubles(6, 6, false) -> " + withoutDoubles(6, 6, false));
		System.out.println("withoutDoubles(1, 6, true) -> " + withoutDoubles(1, 6, true));
		System.out.println("withoutDoubles(6, 1, false) -> " + withoutDoubles(6, 1, false));
		printMethod("maxMod5");
		System.out.println("maxMod5(2, 3) -> " + maxMod5(2, 3));
		System.out.println("maxMod5(6, 2) -> " + maxMod5(6, 2));
		System.out.println("maxMod5(3, 2) -> " + maxMod5(3, 2));
		System.out.println("maxMod5(8, 12) -> " + maxMod5(8, 12));
		System.out.println("maxMod5(7, 12) -> " + maxMod5(7, 12));
		System.out.println("maxMod5(11, 6) -> " + maxMod5(11, 6));
		System.out.println("maxMod5(2, 7) -> " + maxMod5(2, 7));
		System.out.println("maxMod5(7, 7) -> " + maxMod5(7, 7));
		System.out.println("maxMod5(9, 1) -> " + maxMod5(9, 1));
		System.out.println("maxMod5(9, 14) -> " + maxMod5(9, 14));
		System.out.println("maxMod5(1, 2) -> " + maxMod5(1, 2));
		printMethod("redTicket");
		System.out.println("redTicket(2, 2, 2) -> " + redTicket(2, 2, 2));
		System.out.println("redTicket(2, 2, 1) -> " + redTicket(2, 2, 1));
		System.out.println("redTicket(0, 0, 0) -> " + redTicket(0, 0, 0));
		System.out.println("redTicket(2, 0, 0) -> " + redTicket(2, 0, 0));
		System.out.println("redTicket(1, 1, 1) -> " + redTicket(1, 1, 1));
		System.out.println("redTicket(1, 2, 1) -> " + redTicket(1, 2, 1));
		System.out.println("redTicket(1, 2, 0) -> " + redTicket(1, 2, 0));
		System.out.println("redTicket(0, 2, 2) -> " + redTicket(0, 2, 2));
		System.out.println("redTicket(1, 2, 2) -> " + redTicket(1, 2, 2));
		System.out.println("redTicket(0, 2, 0) -> " + redTicket(0, 2, 0));
		System.out.println("redTicket(1, 1, 2) -> " + redTicket(1, 1, 2));
		printMethod("greenTicket");
		System.out.println("greenTicket(1, 2, 3) -> " + greenTicket(1, 2, 3));
		System.out.println("greenTicket(2, 2, 2) -> " + greenTicket(2, 2, 2));
		System.out.println("greenTicket(1, 1, 2) -> " + greenTicket(1, 1, 2));
		System.out.println("greenTicket(2, 1, 1) -> " + greenTicket(2, 1, 1));
		System.out.println("greenTicket(1, 2, 1) -> " + greenTicket(1, 2, 1));
		System.out.println("greenTicket(3, 2, 1) -> " + greenTicket(3, 2, 1));
		System.out.println("greenTicket(0, 0, 0) -> " + greenTicket(0, 0, 0));
		System.out.println("greenTicket(2, 0, 0) -> " + greenTicket(2, 0, 0));
		System.out.println("greenTicket(0, 9, 10) -> " + greenTicket(0, 9, 10));
		System.out.println("greenTicket(0, 10, 0) -> " + greenTicket(0, 10, 0));
		System.out.println("greenTicket(9, 9, 9) -> " + greenTicket(9, 9, 9));
		System.out.println("greenTicket(9, 0, 9) -> " + greenTicket(9, 0, 9));
		printMethod("blueTicket");
		System.out.println("blueTicket(9, 1, 0) -> " + blueTicket(9, 1, 0));
		System.out.println("blueTicket(9, 2, 0) -> " + blueTicket(9, 2, 0));
		System.out.println("blueTicket(6, 1, 4) -> " + blueTicket(6, 1, 4));
		System.out.println("blueTicket(6, 1, 5) -> " + blueTicket(6, 1, 5));
		System.out.println("blueTicket(10, 0, 0) -> " + blueTicket(10, 0, 0));
		System.out.println("blueTicket(15, 0, 5) -> " + blueTicket(15, 0, 5));
		System.out.println("blueTicket(5, 15, 5) -> " + blueTicket(5, 15, 5));
		System.out.println("blueTicket(4, 11, 1) -> " + blueTicket(4, 11, 1));
		System.out.println("blueTicket(13, 2, 3) -> " + blueTicket(13, 2, 3));
		System.out.println("blueTicket(8, 4, 3) -> " + blueTicket(8, 4, 3));
		System.out.println("blueTicket(8, 4, 2) -> " + blueTicket(8, 4, 2));
		System.out.println("blueTicket(8, 4, 1) -> " + blueTicket(8, 4, 1));
		printMethod("shareDigit");
		System.out.println("shareDigit(12, 23) -> " + shareDigit(12, 23));
		System.out.println("shareDigit(12, 43) -> " + shareDigit(12, 43));
		System.out.println("shareDigit(12, 44) -> " + shareDigit(12, 44));
		System.out.println("shareDigit(23, 12) -> " + shareDigit(23, 12));
		System.out.println("shareDigit(23, 39) -> " + shareDigit(23, 39));
		System.out.println("shareDigit(23, 19) -> " + shareDigit(23, 19));
		System.out.println("shareDigit(30, 90) -> " + shareDigit(30, 90));
		System.out.println("shareDigit(30, 91) -> " + shareDigit(30, 91));
		System.out.println("shareDigit(55, 55) -> " + shareDigit(55, 55));
		System.out.println("shareDigit(55, 44) -> " + shareDigit(55, 44));
		printMethod("sumLimit");
		System.out.println("sumLimit(2, 3) -> " + sumLimit(2, 3));
		System.out.println("sumLimit(8, 3) -> " + sumLimit(8, 3));
		System.out.println("sumLimit(8, 1) -> " + sumLimit(8, 1));
		System.out.println("sumLimit(11, 39) -> " + sumLimit(11, 39));
		System.out.println("sumLimit(11, 99) -> " + sumLimit(11, 99));
		System.out.println("sumLimit(0, 0) -> " + sumLimit(0, 0));
		System.out.println("sumLimit(99, 0) -> " + sumLimit(99, 0));
		System.out.println("sumLimit(99, 1) -> " + sumLimit(99, 1));
		System.out.println("sumLimit(123, 1) -> " + sumLimit(123, 1));
		System.out.println("sumLimit(1, 123) -> " + sumLimit(1, 123));
		System.out.println("sumLimit(23, 60) -> " + sumLimit(23, 60));
		System.out.println("sumLimit(23, 80) -> " + sumLimit(23, 80));
		System.out.println("sumLimit(9000, 1) -> " + sumLimit(9000, 1));
		System.out.println("sumLimit(90000000, 1) -> " + sumLimit(90000000, 1));
		System.out.println("sumLimit(9000, 1000) -> " + sumLimit(9000, 1000));
	}
}
