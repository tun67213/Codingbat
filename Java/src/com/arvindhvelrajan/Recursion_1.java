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
	 * Given a string, compute recursively (no loops) the number of lowercase 'x' chars in the string.
	 *
	 * countX("xxhixx") → 4
	 * countX("xhixhix") → 3
	 * countX("hi") → 0
	 */
	public int countX(String str)
	{
		throw new UnsupportedOperationException("Not supported yet.");
	}

	/**
	 * Given a string, compute recursively (no loops) the number of times lowercase "hi" appears in the string.
	 *
	 * countHi("xxhixx") → 1
	 * countHi("xhixhix") → 2
	 * countHi("hi") → 1
	 */
	public int countHi(String str)
	{
		throw new UnsupportedOperationException("Not supported yet.");
	}

	/**
	 * Given a string, compute recursively (no loops) a new string where all the lowercase 'x' chars have been changed to 'y' chars.
	 *
	 * changeXY("codex") → "codey"
	 * changeXY("xxhixx") → "yyhiyy"
	 * changeXY("xhixhix") → "yhiyhiy"
	 */
	public String changeXY(String str)
	{
		throw new UnsupportedOperationException("Not supported yet.");
	}

	/**
	 * Given a string, compute recursively (no loops) a new string where all appearances of "pi" have been replaced by "3.14".
	 *
	 * changePi("xpix") → "x3.14x"
	 * changePi("pipi") → "3.143.14"
	 * changePi("pip") → "3.14p"
	 */
	public String changePi(String str)
	{
		throw new UnsupportedOperationException("Not supported yet.");
	}

	/**
	 * Given a string, compute recursively a new string where all the 'x' chars have been removed.
	 *
	 * noX("xaxb") → "ab"
	 * noX("abc") → "abc"
	 * noX("xx") → ""
	 */
	public String noX(String str)
	{
		throw new UnsupportedOperationException("Not supported yet.");
	}

	/**
	 * Given an array of ints, compute recursively if the array contains a 6. We'll use the convention of considering
	 * only the part of the array that begins at the given index.
	 * In this way, a recursive call can pass index+1 to move down the array. The initial call will pass in index as 0.
	 *
	 * array6([1, 6, 4], 0) → true
	 * array6([1, 4], 0) → false
	 * array6([6], 0) → true
	 */
	public boolean array6(int[] nums, int index)
	{
		throw new UnsupportedOperationException("Not supported yet.");
	}

	/**
	 * Given an array of ints, compute recursively the number of times that the value 11 appears in the array.
	 * We'll use the convention of considering only the part of the array that begins at the given index.
	 * In this way, a recursive call can pass index+1 to move down the array. The initial call will pass in index as 0.
	 *
	 * array11([1, 2, 11], 0) → 1
	 * array11([11, 11], 0) → 2
	 * array11([1, 2, 3, 4], 0) → 0
	 */
	public int array11(int[] nums, int index)
	{
		throw new UnsupportedOperationException("Not supported yet.");
	}

	/**
	 * Given an array of ints, compute recursively if the array contains somewhere a value followed in the array by that
	 * value times 10. We'll use the convention of considering only the part of the array that begins at the given index.
	 * In this way, a recursive call can pass index+1 to move down the array. The initial call will pass in index as 0.
	 *
	 * array220([1, 2, 20], 0) → true
	 * array220([3, 30], 0) → true
	 * array220([3], 0) → false
	 */
	public boolean array220(int[] nums, int index)
	{
		throw new UnsupportedOperationException("Not supported yet.");
	}

	/**
	 * Given a string, compute recursively a new string where all the adjacent chars are now separated by a "*".
	 *
	 * allStar("hello") → "h*e*l*l*o"
	 * allStar("abc") → "a*b*c"
	 * allStar("ab") → "a*b"
	 */
	public String allStar(String str)
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
		printFunction("powerN");
		System.out.println("powerN(3, 1) → " + powerN(3, 1));
		System.out.println("powerN(3, 2) → " + powerN(3, 2));
		System.out.println("powerN(3, 3) → " + powerN(3, 3));
		System.out.println("powerN(2, 1) → " + powerN(2, 1));
		System.out.println("powerN(2, 2) → " + powerN(2, 2));
		System.out.println("powerN(2, 3) → " + powerN(2, 3));
		System.out.println("powerN(2, 4) → " + powerN(2, 4));
		System.out.println("powerN(2, 5) → " + powerN(2, 5));
		System.out.println("powerN(10, 1) → " + powerN(10, 1));
		System.out.println("powerN(10, 2) → " + powerN(10, 2));
		System.out.println("powerN(10, 3) → " + powerN(10, 3));
		printFunction("countX");
		System.out.println("countX(\"xxhixx\") → " + countX("xxhixx"));
		System.out.println("countX(\"xhixhix\") → " + countX("xhixhix"));
		System.out.println("countX(\"hi\") → " + countX("hi"));
		System.out.println("countX(\"h\") → " + countX("h"));
		System.out.println("countX(\"x\") → " + countX("x"));
		System.out.println("countX(\"\") → " + countX(""));
		System.out.println("countX(\"hihi\") → " + countX("hihi"));
		System.out.println("countX(\"hiAAhi12hi\") → " + countX("hiAAhi12hi"));
		printFunction("countHi");
		System.out.println("countHi(\"xxhixx\") → " + countHi("xxhixx"));
		System.out.println("countHi(\"xhixhix\") → " + countHi("xhixhix"));
		System.out.println("countHi(\"hi\") → " + countHi("hi"));
		System.out.println("countHi(\"h\") → " + countHi("h"));
		System.out.println("countHi(\"\") → " + countHi(""));
		System.out.println("countHi(\"ihihihihih\") → " + countHi("ihihihihih"));
		System.out.println("countHi(\"ihihihihihi\") → " + countHi("ihihihihihi"));
		System.out.println("countHi(\"hiAAhi12hi\") → " + countHi("hiAAhi12hi"));
		System.out.println("countHi(\"xhixhxihihhhih\") → " + countHi("xhixhxihihhhih"));
		System.out.println("countHi(\"ship\") → " + countHi("ship"));
		printFunction("changeXY");
		System.out.println("changeXY(\"codex\") → \"" + changeXY("codex") + "\"");
		System.out.println("changeXY(\"xxhixx\") → \"" + changeXY("xxhixx") + "\"");
		System.out.println("changeXY(\"xhixhix\") → \"" + changeXY("xhixhix") + "\"");
		System.out.println("changeXY(\"hiy\") → \"" + changeXY("hiy") + "\"");
		System.out.println("changeXY(\"h\") → \"" + changeXY("h") + "\"");
		System.out.println("changeXY(\"x\") → \"" + changeXY("x") + "\"");
		System.out.println("changeXY(\"\") → \"" + changeXY("") + "\"");
		System.out.println("changeXY(\"xxx\") → \"" + changeXY("xxx") + "\"");
		System.out.println("changeXY(\"yyhxyi\") → \"" + changeXY("yyhxyi") + "\"");
		System.out.println("changeXY(\"hihi\") → \"" + changeXY("hihi") + "\"");
		printFunction("changePi");
		System.out.println("changePi(\"xpix\") → \"" + changePi("xpix") + "\"");
		System.out.println("changePi(\"pipi\") → \"" + changePi("pipi") + "\"");
		System.out.println("changePi(\"pip\") → \"" + changePi("pip") + "\"");
		System.out.println("changePi(\"pi\") → \"" + changePi("pi") + "\"");
		System.out.println("changePi(\"hip\") → \"" + changePi("hip") + "\"");
		System.out.println("changePi(\"p\") → \"" + changePi("p") + "\"");
		System.out.println("changePi(\"x\") → \"" + changePi("x") + "\"");
		System.out.println("changePi(\"\") → \"" + changePi("") + "\"");
		System.out.println("changePi(\"pixx\") → \"" + changePi("pixx") + "\"");
		System.out.println("changePi(\"xyzzy\") → \"" + changePi("xyzzy") + "\"");
		printFunction("noX");
		System.out.println("noX(\"xaxb\") → \"" + noX("xaxb") + "\"");
		System.out.println("noX(\"abc\") → \"" + noX("abc") + "\"");
		System.out.println("noX(\"xx\") → \"" + noX("xx") + "\"");
		System.out.println("noX(\"\") → \"" + noX("") + "\"");
		System.out.println("noX(\"axxbxx\") → \"" + noX("axxbxx") + "\"");
		System.out.println("noX(\"Hellox\") → \"" + noX("Hellox") + "\"");
		printFunction("array6");
		System.out.println("array6([1, 6, 4], 0) → " + array6(new int[] {1, 6, 4}, 0));
		System.out.println("array6([1, 4], 0) → " + array6(new int[] {1, 4}, 0));
		System.out.println("array6([6], 0) → " + array6(new int[] {6}, 0));
		System.out.println("array6([], 0) → " + array6(new int[] {}, 0));
		System.out.println("array6([6, 2, 2], 0) → " + array6(new int[] {6, 2, 2}, 0));
		System.out.println("array6([2, 5], 0) → " + array6(new int[] {2, 5}, 0));
		System.out.println("array6([1, 9, 4, 6, 6], 0) → " + array6(new int[] {1, 9, 4, 6, 6}, 0));
		System.out.println("array6([2, 5, 6], 0) → " + array6(new int[] {2, 5, 6}, 0));
		printFunction("array11");
		System.out.println("array11([1, 2, 11], 0) → " + array11(new int[] {1, 2, 11}, 0));
		System.out.println("array11([11, 11], 0) → " + array11(new int[] {11, 11}, 0));
		System.out.println("array11([1, 2, 3, 4], 0) → " + array11(new int[] {1, 2, 3, 4}, 0));
		System.out.println("array11([1, 11, 3, 11, 11], 0) → " + array11(new int[] {1, 11, 3, 11, 11}, 0));
		System.out.println("array11([11], 0) → " + array11(new int[] {11}, 0));
		System.out.println("array11([1], 0) → " + array11(new int[] {1}, 0));
		System.out.println("array11([], 0) → " + array11(new int[] {}, 0));
		System.out.println("array11([11, 2, 3, 4, 11, 5], 0) → " + array11(new int[] {11, 2, 3, 4, 11, 5}, 0));
		System.out.println("array11([11, 5, 11], 0) → " + array11(new int[] {11, 5, 11}, 0));
		printFunction("array220");
		System.out.println("array220([1, 2, 20], 0) → " + array220(new int[] {1, 2, 20}, 0));
		System.out.println("array220([3, 30], 0) → " + array220(new int[] {3, 30}, 0));
		System.out.println("array220([3], 0) → " + array220(new int[] {3}, 0));
		System.out.println("array220([], 0) → " + array220(new int[] {}, 0));
		System.out.println("array220([3, 3, 30, 4], 0) → " + array220(new int[] {3, 3, 30, 4}, 0));
		System.out.println("array220([2, 19, 4], 0) → " + array220(new int[] {2, 19, 4}, 0));
		System.out.println("array220([20, 2, 21], 0) → " + array220(new int[] {20, 2, 21}, 0));
		System.out.println("array220([20, 2, 21, 210], 0) → " + array220(new int[] {20, 2, 21, 210}, 0));
		System.out.println("array220([2, 200, 2000], 0) → " + array220(new int[] {2, 200, 2000}, 0));
		System.out.println("array220([0, 0], 0) → " + array220(new int[] {0, 0}, 0));
		System.out.println("array220([1, 2, 3, 4, 5, 6], 0) → " + array220(new int[] {1, 2, 3, 4, 5, 6}, 0));
		System.out.println("array220([1, 2, 3, 4, 5, 50, 6], 0) → " + array220(new int[] {1, 2, 3, 4, 5, 50, 6}, 0));
		System.out.println("array220([1, 2, 3, 4, 5, 51, 6], 0) → " + array220(new int[] {1, 2, 3, 4, 5, 51, 6}, 0));
		System.out.println("array220([1, 2, 3, 4, 4, 50, 500, 6], 0) → " + array220(new int[] {1, 2, 3, 4, 4, 50, 500, 6}, 0));
		printFunction("allStar");
		System.out.println("allStar(\"hello\") → \"" + allStar("hello") + "\"");
		System.out.println("allStar(\"abc\") → \"" + allStar("abc") + "\"");
		System.out.println("allStar(\"ab\") → \"" + allStar("ab") + "\"");
		System.out.println("allStar(\"a\") → \"" + allStar("a") + "\"");
		System.out.println("allStar(\"\") → \"" + allStar("") + "\"");
		System.out.println("allStar(\"3.14\") → \"" + allStar("3.14") + "\"");
		System.out.println("allStar(\"Chocolate\") → \"" + allStar("Chocolate") + "\"");
		System.out.println("allStar(\"1234\") → \"" + allStar("1234") + "\"");
	}
}
