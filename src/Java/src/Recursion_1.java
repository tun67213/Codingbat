package src;

/**
 * @author arvindhvelrajan
 */
public class Recursion_1 extends HelperMethods
{
	/**
	 * This method welcomes the user to this program.
	 */
	public void welcome()
	{
		System.out.println("\n\nRecursion-1 Methods\n");
	}

	/**
	 * Given n of 1 or more, return the factorial of n, which is n * (n-1) * (n-2) ... 1. Compute the result recursively (without loops).
	 *
	 * factorial(1) → 1
	 * factorial(2) → 2
	 * factorial(3) → 6
	 */
	public int factorial(int n)
	{
		if(n == 0)
		{
			return 1;
		}
		return n * factorial(n - 1);
	}

	/**
	 * We have a number of bunnies and each bunny has two big floppy ears. We want to compute the total number of ears across all the bunnies recursively (without loops or multiplication).
	 *
	 * bunnyEars(0) → 0
	 * bunnyEars(1) → 2
	 * bunnyEars(2) → 4
	 */
	public int bunnyEars(int bunnies)
	{
		if(bunnies == 0)
		{
			return 0;
		}
		return 2 + bunnyEars(bunnies - 1);
	}

	/**
	 * The fibonacci sequence is a famous bit of mathematics, and it happens to have a recursive definition. The first two values in the sequence are 0 and 1 (essentially 2 base cases). Each subsequent value is the sum of the previous two values, so the whole sequence is: 0, 1, 1, 2, 3, 5, 8, 13, 21 and so on. Define a recursive fibonacci(n) method that returns the nth fibonacci number, with n=0 representing the start of the sequence.
	 *
	 * fibonacci(0) → 0
	 * fibonacci(1) → 1
	 * fibonacci(2) → 1
	 */
	public int fibonacci(int n)
	{
		if(n <= 1)
		{
			return n;
		}
		return fibonacci(n - 1) + fibonacci(n - 2);
	}

	/**
	 * We have bunnies standing in a line, numbered 1, 2, ... The odd bunnies (1, 3, ..) have the normal 2 ears. The even bunnies (2, 4, ..) we'll say have 3 ears, because they each have a raised foot. Recursively return the number of "ears" in the bunny line 1, 2, ... n (without loops or multiplication).
	 *
	 * bunnyEars2(0) → 0
	 * bunnyEars2(1) → 2
	 * bunnyEars2(2) → 5
	 */
	public int bunnyEars2(int bunnies)
	{
		if(bunnies == 0)
		{
			return 0;
		}
		if(bunnies % 2 == 0)
		{
			return 3 + bunnyEars2(bunnies - 1);
		}
		return 2 + bunnyEars2(bunnies - 1);
	}

	/**
	 * We have triangle made of blocks. The topmost row has 1 block, the next row down has 2 blocks, the next row has 3 blocks, and so on. Compute recursively (no loops or multiplication) the total number of blocks in such a triangle with the given number of rows.
	 *
	 * triangle(0) → 0
	 * triangle(1) → 1
	 * triangle(2) → 3
	 */
	public int triangle(int rows)
	{
		if(rows == 0)
		{
			return 0;
		}
		return rows + triangle(rows - 1);
	}

	/**
	 * Given a non-negative int n, return the sum of its digits recursively (no loops). Note that mod (%) by 10 yields the rightmost digit (126 % 10 is 6), while divide (/) by 10 removes the rightmost digit (126 / 10 is 12).
	 *
	 * sumDigits(126) → 9
	 * sumDigits(49) → 13
	 * sumDigits(12) → 3
	 */
	public int sumDigits(int n)
	{
		if(n <= 9)
		{
			return n;
		}
		return n % 10 + sumDigits(n / 10);
	}

	/**
	 * Given a non-negative int n, return the count of the occurrences of 7 as a digit, so for example 717 yields 2. (no loops). Note that mod (%) by 10 yields the rightmost digit (126 % 10 is 6), while divide (/) by 10 removes the rightmost digit (126 / 10 is 12).
	 *
	 * count7(717) → 2
	 * count7(7) → 1
	 * count7(123) → 0
	 */
	public int count7(int n)
	{
		if(n == 0)
		{
			return 0;
		}
		if(n % 10 == 7)
		{
			return 1 + count7(n / 10);
		}
		return count7(n / 10);
	}

	/**
	 * Given a non-negative int n, compute recursively (no loops) the count of the occurrences of 8 as a digit, except that an 8 with another 8 immediately to its left counts double, so 8818 yields 4. Note that mod (%) by 10 yields the rightmost digit (126 % 10 is 6), while divide (/) by 10 removes the rightmost digit (126 / 10 is 12).
	 *
	 * count8(8) → 1
	 * count8(818) → 2
	 * count8(8818) → 4
	 */
	public int count8(int n)
	{
		if(n == 0)
		{
			return 0;
		}
		if(n % 100 == 88)
		{
			return 2 + count8(n / 10);
		}
		if(n % 10 == 8)
		{
			return 1 + count8(n / 10);
		}
		return count8(n / 10);
	}

	/**
	 * Given base and n that are both 1 or more, compute recursively (no loops) the value of base to the n power, so powerN(3, 2) is 9 (3 squared).
	 *
	 * powerN(3, 1) → 3
	 * powerN(3, 2) → 9
	 * powerN(3, 3) → 27
	 */
	public int powerN(int base, int n)
	{
		if(n == 0)
		{
			return 1;
		}
		return base * powerN(base, n - 1);
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
	 * Given an array of ints, compute recursively if the array contains a 6. We'll use the convention of considering only the part of the array that begins at the given index. In this way, a recursive call can pass index+1 to move down the array. The initial call will pass in index as 0.
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
	 * Given an array of ints, compute recursively the number of times that the value 11 appears in the array. We'll use the convention of considering only the part of the array that begins at the given index. In this way, a recursive call can pass index+1 to move down the array. The initial call will pass in index as 0.
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
	 * Given an array of ints, compute recursively if the array contains somewhere a value followed in the array by that value times 10. We'll use the convention of considering only the part of the array that begins at the given index. In this way, a recursive call can pass index+1 to move down the array. The initial call will pass in index as 0.
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
	 * Given a string, compute recursively a new string where identical chars that are adjacent in the original string are separated from each other by a "*".
	 *
	 * pairStar("hello") → "hel*lo"
	 * pairStar("xxyy") → "x*xy*y"
	 * pairStar("aaaa") → "a*a*a*a"
	 */
	public String pairStar(String str)
	{
		throw new UnsupportedOperationException("Not supported yet.");
	}

	/**
	 * Given a string, compute recursively a new string where all the lowercase 'x' chars have been moved to the end of the string.
	 *
	 * endX("xxre") → "rexx"
	 * endX("xxhixx") → "hixxxx"
	 * endX("xhixhix") → "hihixxx"
	 */
	public String endX(String str)
	{
		throw new UnsupportedOperationException("Not supported yet.");
	}

	/**
	 * We'll say that a "pair" in a string is two instances of a char separated by a char. So "AxA" the A's make a pair. Pair's can overlap, so "AxAxA" contains 3 pairs -- 2 for A and 1 for x. Recursively compute the number of pairs in the given string.
	 *
	 * countPairs("axa") → 1
	 * countPairs("axax") → 2
	 * countPairs("axbx") → 1
	 */
	public int countPairs(String str)
	{
		throw new UnsupportedOperationException("Not supported yet.");
	}

	/**
	 * Count recursively the total number of "abc" and "aba" substrings that appear in the given string.
	 *
	 * countAbc("abc") → 1
	 * countAbc("abcxxabc") → 2
	 * countAbc("abaxxaba") → 2
	 */
	public int countAbc(String str)
	{
		throw new UnsupportedOperationException("Not supported yet.");
	}

	/**
	 * Given a string, compute recursively (no loops) the number of "11" substrings in the string. The "11" substrings should not overlap.
	 *
	 * count11("11abc11") → 2
	 * count11("abc11x11x11") → 3
	 * count11("111") → 1
	 */
	public int count11(String str)
	{
		throw new UnsupportedOperationException("Not supported yet.");
	}

	/**
	 * Given a string, return recursively a "cleaned" string where adjacent chars that are the same have been reduced to a single char. So "yyzzza" yields "yza".
	 *
	 * stringClean("yyzzza") → "yza"
	 * stringClean("abbbcdd") → "abcd"
	 * stringClean("Hello") → "Helo"
	 */
	public String stringClean(String str)
	{
		throw new UnsupportedOperationException("Not supported yet.");
	}

	/**
	 * Given a string, compute recursively the number of times lowercase "hi" appears in the string, however do not count "hi" that have an 'x' immedately before them.
	 *
	 * countHi2("ahixhi") → 1
	 * countHi2("ahibhi") → 2
	 * countHi2("xhixhi") → 0
	 */
	public int countHi2(String str)
	{
		throw new UnsupportedOperationException("Not supported yet.");
	}

	/**
	 * Given a string that contains a single pair of parenthesis, compute recursively a new string made of only of the parenthesis and their contents, so "xyz(abc)123" yields "(abc)".
	 *
	 * parenBit("xyz(abc)123") → "(abc)"
	 * parenBit("x(hello)") → "(hello)"
	 * parenBit("(xy)1") → "(xy)"
	 */
	public String parenBit(String str)
	{
		throw new UnsupportedOperationException("Not supported yet.");
	}

	/**
	 * Given a string, return true if it is a nesting of zero or more pairs of parenthesis, like "(())" or "((()))". Suggestion: check the first and last chars, and then recur on what's inside them.
	 *
	 * nestParen("(())") → true
	 * nestParen("((()))") → true
	 * nestParen("(((x))") → false
	 */
	public String nestParen(String str)
	{
		throw new UnsupportedOperationException("Not supported yet.");
	}

	/**
	 * Given a string and a non-empty substring sub, compute recursively the number of times that sub appears in the string, without the sub strings overlapping.
	 *
	 * strCount("catcowcat", "cat") → 2
	 * strCount("catcowcat", "cow") → 1
	 * strCount("catcowcat", "dog") → 0
	 */
	public int strCount(String str, String sub)
	{
		throw new UnsupportedOperationException("Not supported yet.");
	}

	/**
	 * Given a string and a non-empty substring sub, compute recursively if at least n copies of sub appear in the string somewhere, possibly with overlapping. N will be non-negative.
	 *
	 * strCopies("catcowcat", "cat", 2) → true
	 * strCopies("catcowcat", "cow", 2) → false
	 * strCopies("catcowcat", "cow", 1) → true
	 */
	public boolean strCopies(String str, String sub, int n)
	{
		throw new UnsupportedOperationException("Not supported yet.");
	}

	/**
	 * Given a string and a non-empty substring sub, compute recursively the largest substring which starts and ends with sub and return its length.
	 *
	 * strDist("catcowcat", "cat") → 9
	 * strDist("catcowcat", "cow") → 3
	 * strDist("cccatcowcatxx", "cat") → 9
	 */
	public int strDist(String str, String sub)
	{
		throw new UnsupportedOperationException("Not supported yet.");
	}

	/**
	 * @param args command line arguments
	 */
	public void main(String[] args)
	{
		HelperMethods.resetCallTimes();
		welcome();
		printMethod("factorial");
		System.out.println("factorial(1) -> " + factorial(1));
		System.out.println("factorial(2) -> " + factorial(2));
		System.out.println("factorial(3) -> " + factorial(3));
		System.out.println("factorial(4) -> " + factorial(4));
		System.out.println("factorial(5) -> " + factorial(5));
		System.out.println("factorial(6) -> " + factorial(6));
		System.out.println("factorial(7) -> " + factorial(7));
		System.out.println("factorial(8) -> " + factorial(8));
		System.out.println("factorial(12) -> " + factorial(12));
		printMethod("bunnyEars");
		System.out.println("bunnyEars(0) -> " + bunnyEars(0));
		System.out.println("bunnyEars(1) -> " + bunnyEars(1));
		System.out.println("bunnyEars(2) -> " + bunnyEars(2));
		System.out.println("bunnyEars(3) -> " + bunnyEars(3));
		System.out.println("bunnyEars(4) -> " + bunnyEars(4));
		System.out.println("bunnyEars(5) -> " + bunnyEars(5));
		System.out.println("bunnyEars(12) -> " + bunnyEars(12));
		System.out.println("bunnyEars(50) -> " + bunnyEars(50));
		System.out.println("bunnyEars(234) -> " + bunnyEars(234));
		printMethod("fibonacci");
		System.out.println("fibonacci(0) -> " + fibonacci(0));
		System.out.println("fibonacci(1) -> " + fibonacci(1));
		System.out.println("fibonacci(2) -> " + fibonacci(2));
		System.out.println("fibonacci(3) -> " + fibonacci(3));
		System.out.println("fibonacci(4) -> " + fibonacci(4));
		System.out.println("fibonacci(5) -> " + fibonacci(5));
		System.out.println("fibonacci(6) -> " + fibonacci(6));
		System.out.println("fibonacci(7) -> " + fibonacci(7));
		printMethod("bunnyEars2");
		System.out.println("bunnyEars2(0) -> " + bunnyEars2(0));
		System.out.println("bunnyEars2(1) -> " + bunnyEars2(1));
		System.out.println("bunnyEars2(2) -> " + bunnyEars2(2));
		System.out.println("bunnyEars2(3) -> " + bunnyEars2(3));
		System.out.println("bunnyEars2(4) -> " + bunnyEars2(4));
		System.out.println("bunnyEars2(5) -> " + bunnyEars2(5));
		System.out.println("bunnyEars2(6) -> " + bunnyEars2(6));
		System.out.println("bunnyEars2(10) -> " + bunnyEars2(10));
		printMethod("triangle");
		System.out.println("triangle(0) -> " + triangle(0));
		System.out.println("triangle(1) -> " + triangle(1));
		System.out.println("triangle(2) -> " + triangle(2));
		System.out.println("triangle(3) -> " + triangle(3));
		System.out.println("triangle(4) -> " + triangle(4));
		System.out.println("triangle(5) -> " + triangle(5));
		System.out.println("triangle(6) -> " + triangle(6));
		System.out.println("triangle(7) -> " + triangle(7));
		printMethod("sumDigits");
		System.out.println("sumDigits(126) -> " + sumDigits(126));
		System.out.println("sumDigits(49) -> " + sumDigits(49));
		System.out.println("sumDigits(12) -> " + sumDigits(12));
		System.out.println("sumDigits(10) -> " + sumDigits(10));
		System.out.println("sumDigits(1) -> " + sumDigits(1));
		System.out.println("sumDigits(0) -> " + sumDigits(0));
		System.out.println("sumDigits(730) -> " + sumDigits(730));
		System.out.println("sumDigits(1111) -> " + sumDigits(1111));
		System.out.println("sumDigits(11111) -> " + sumDigits(11111));
		System.out.println("sumDigits(10110) -> " + sumDigits(10110));
		System.out.println("sumDigits(235) -> " + sumDigits(235));
		printMethod("count7");
		System.out.println("count7(717) -> " + count7(717));
		System.out.println("count7(7) -> " + count7(7));
		System.out.println("count7(123) -> " + count7(123));
		System.out.println("count7(77) -> " + count7(77));
		System.out.println("count7(7123) -> " + count7(7123));
		System.out.println("count7(771237) -> " + count7(771237));
		System.out.println("count7(771737) -> " + count7(771737));
		System.out.println("count7(47571) -> " +  count7(47571));
		System.out.println("count7(777777) -> " + count7(777777));
		System.out.println("count7(70701277) -> " + count7(70701277));
		System.out.println("count7(777576197) -> " + count7(777576197));
		System.out.println("count7(99999) -> " + count7(99999));
		System.out.println("count7(99799) -> " + count7(99799));
		printMethod("count8");
		System.out.println("count8(8) -> " + count8(8));
		System.out.println("count8(818) -> " + count8(818));
		System.out.println("count8(8818) -> " + count8(8818));
		System.out.println("count8(8088) -> " + count8(8088));
		System.out.println("count8(123) -> " + count8(123));
		System.out.println("count8(81238) -> " + count8(81238));
		System.out.println("count8(88788) -> " + count8(88788));
		System.out.println("count8(8234) -> " + count8(8234));
		System.out.println("count8(2348) -> " + count8(2348));
		System.out.println("count8(23884) -> " + count8(23884));
		System.out.println("count8(0) -> " + count8(0));
		System.out.println("count8(1818188) -> " + count8(1818188));
		System.out.println("count8(8818181) -> " + count8(8818181));
		System.out.println("count8(1080) -> " + count8(1080));
		System.out.println("count8(188) -> " + count8(188));
		System.out.println("count8(88888) -> " + count8(88888));
		System.out.println("count8(9898) -> " + count8(9898));
		System.out.println("count8(78) -> " + count8(78));
		printMethod("powerN");
		System.out.println("powerN(3, 1) -> " + powerN(3, 1));
		System.out.println("powerN(3, 2) -> " + powerN(3, 2));
		System.out.println("powerN(3, 3) -> " + powerN(3, 3));
		System.out.println("powerN(2, 1) -> " + powerN(2, 1));
		System.out.println("powerN(2, 2) -> " + powerN(2, 2));
		System.out.println("powerN(2, 3) -> " + powerN(2, 3));
		System.out.println("powerN(2, 4) -> " + powerN(2, 4));
		System.out.println("powerN(2, 5) -> " + powerN(2, 5));
		System.out.println("powerN(10, 1) -> " + powerN(10, 1));
		System.out.println("powerN(10, 2) -> " + powerN(10, 2));
		System.out.println("powerN(10, 3) -> " + powerN(10, 3));
		printMethod("countX");
		System.out.println("countX(\"xxhixx\") -> " + countX("xxhixx"));
		System.out.println("countX(\"xhixhix\") -> " + countX("xhixhix"));
		System.out.println("countX(\"hi\") -> " + countX("hi"));
		System.out.println("countX(\"h\") -> " + countX("h"));
		System.out.println("countX(\"x\") -> " + countX("x"));
		System.out.println("countX(\"\") -> " + countX(""));
		System.out.println("countX(\"hihi\") -> " + countX("hihi"));
		System.out.println("countX(\"hiAAhi12hi\") -> " + countX("hiAAhi12hi"));
		printMethod("countHi");
		System.out.println("countHi(\"xxhixx\") -> " + countHi("xxhixx"));
		System.out.println("countHi(\"xhixhix\") -> " + countHi("xhixhix"));
		System.out.println("countHi(\"hi\") -> " + countHi("hi"));
		System.out.println("countHi(\"hihih\") -> " + countHi("hihih"));
		System.out.println("countHi(\"h\") -> " + countHi("h"));
		System.out.println("countHi(\"\") -> " + countHi(""));
		System.out.println("countHi(\"ihihihihih\") -> " + countHi("ihihihihih"));
		System.out.println("countHi(\"ihihihihihi\") -> " + countHi("ihihihihihi"));
		System.out.println("countHi(\"hiAAhi12hi\") -> " + countHi("hiAAhi12hi"));
		System.out.println("countHi(\"xhixhxihihhhih\") -> " + countHi("xhixhxihihhhih"));
		System.out.println("countHi(\"ship\") -> " + countHi("ship"));
		printMethod("changeXY");
		System.out.println("changeXY(\"codex\") -> \"" + changeXY("codex") + "\"");
		System.out.println("changeXY(\"xxhixx\") -> \"" + changeXY("xxhixx") + "\"");
		System.out.println("changeXY(\"xhixhix\") -> \"" + changeXY("xhixhix") + "\"");
		System.out.println("changeXY(\"hiy\") -> \"" + changeXY("hiy") + "\"");
		System.out.println("changeXY(\"h\") -> \"" + changeXY("h") + "\"");
		System.out.println("changeXY(\"x\") -> \"" + changeXY("x") + "\"");
		System.out.println("changeXY(\"\") -> \"" + changeXY("") + "\"");
		System.out.println("changeXY(\"xxx\") -> \"" + changeXY("xxx") + "\"");
		System.out.println("changeXY(\"yyhxyi\") -> \"" + changeXY("yyhxyi") + "\"");
		System.out.println("changeXY(\"hihi\") -> \"" + changeXY("hihi") + "\"");
		printMethod("changePi");
		System.out.println("changePi(\"xpix\") -> \"" + changePi("xpix") + "\"");
		System.out.println("changePi(\"pipi\") -> \"" + changePi("pipi") + "\"");
		System.out.println("changePi(\"pip\") -> \"" + changePi("pip") + "\"");
		System.out.println("changePi(\"pi\") -> \"" + changePi("pi") + "\"");
		System.out.println("changePi(\"hip\") -> \"" + changePi("hip") + "\"");
		System.out.println("changePi(\"p\") -> \"" + changePi("p") + "\"");
		System.out.println("changePi(\"x\") -> \"" + changePi("x") + "\"");
		System.out.println("changePi(\"\") -> \"" + changePi("") + "\"");
		System.out.println("changePi(\"pixx\") -> \"" + changePi("pixx") + "\"");
		System.out.println("changePi(\"xyzzy\") -> \"" + changePi("xyzzy") + "\"");
		printMethod("noX");
		System.out.println("noX(\"xaxb\") -> \"" + noX("xaxb") + "\"");
		System.out.println("noX(\"abc\") -> \"" + noX("abc") + "\"");
		System.out.println("noX(\"xx\") -> \"" + noX("xx") + "\"");
		System.out.println("noX(\"\") -> \"" + noX("") + "\"");
		System.out.println("noX(\"axxbxx\") -> \"" + noX("axxbxx") + "\"");
		System.out.println("noX(\"Hellox\") -> \"" + noX("Hellox") + "\"");
		printMethod("array6");
		System.out.println("array6([1, 6, 4], 0) -> " + array6(new int[] {1, 6, 4}, 0));
		System.out.println("array6([1, 4], 0) -> " +  array6(new int[] {1, 4}, 0));
		System.out.println("array6([6], 0) -> " + array6(new int[] {6}, 0));
		System.out.println("array6([], 0) -> " + array6(new int[] {}, 0));
		System.out.println("array6([6, 2, 2], 0) -> " + array6(new int[] {6, 2, 2}, 0));
		System.out.println("array6([2, 5], 0) -> " + array6(new int[] {2, 5}, 0));
		System.out.println("array6([1, 9, 4, 6, 6], 0) -> " +  array6(new int[] {1, 9, 4, 6, 6}, 0));
		System.out.println("array6([2, 5, 6], 0) -> " + array6(new int[] {2, 5, 6}, 0));
		printMethod("array11");
		System.out.println("array11([1, 2, 11], 0) -> " + array11(new int[] {1, 2, 11}, 0));
		System.out.println("array11([11, 11], 0) -> " + array11(new int[] {11, 11}, 0));
		System.out.println("array11([1, 2, 3, 4], 0) -> " + array11(new int[] {1, 2, 3, 4}, 0));
		System.out.println("array11([1, 11, 3, 11, 11], 0) -> " + array11(new int[] {1, 11, 3, 11, 11}, 0));
		System.out.println("array11([11], 0) -> " + array11(new int[] {11}, 0));
		System.out.println("array11([1], 0) -> " + array11(new int[] {1}, 0));
		System.out.println("array11([], 0) -> " + array11(new int[] {}, 0));
		System.out.println("array11([11, 2, 3, 4, 11, 5]) -> " + array11(new int[] {11, 2, 3, 4, 11, 5}, 0));
		System.out.println("array11([11, 5, 11], 0) -> " + array11(new int[] {11, 5, 11}, 0));
		printMethod("array220");
		System.out.println("array220([1, 2, 20], 0) -> " + array220(new int[] {1, 2, 20}, 0));
		System.out.println("array220([3, 30], 0) -> " + array220(new int[] {3, 30}, 0));
		System.out.println("array220([3], 0) -> " + array220(new int[] {3}, 0));
		System.out.println("array220([], 0) -> " + array220(new int[] {}, 0));
		System.out.println("array220([3, 3, 30, 4], 0) -> " + array220(new int[] {3, 3, 3, 4}, 0));
		System.out.println("array220([2, 19, 4], 0) -> " + array220(new int[] {2, 19, 4}, 0));
		System.out.println("array220([20, 2, 21], 0) -> " + array220(new int[] {20, 2, 21}, 0));
		System.out.println("array220([20, 2, 21, 210], 0) -> " + array220(new int[] {20, 2, 21, 210}, 0));
		System.out.println("array220([2, 200, 2000], 0) -> " + array220(new int[] {2, 200, 2000}, 0));
		System.out.println("array220([0, 0], 0) -> " + array220(new int[] {0, 0}, 0));
		System.out.println("array220([1, 2, 3, 4, 5, 6], 0) -> " + array220(new int[] {1, 2, 3, 4, 5, 6}, 0));
		System.out.println("array220([1, 2, 3, 4, 5, 50, 6], 0) -> " + array220(new int[] {1, 2, 3, 4, 5, 50, 6}, 0));
		System.out.println("array220([1, 2, 3, 4, 5, 51, 6], 0) -> " + array220(new int[] {1, 2, 3, 4, 5, 51, 6}, 0));
		System.out.println("array220([1, 2, 3, 4, 4, 50, 500, 6], 0) -> " + array220(new int[] {1, 2, 3, 4, 4, 50, 500, 6}, 0));
		printMethod("allStar");
		System.out.println("allStar(\"hello\") -> \"" + allStar("hello") + "\"");
		System.out.println("allStar(\"abc\") -> \"" + allStar("abc") + "\"");
		System.out.println("allStar(\"ab\") -> \"" + allStar("ab") + "\"");
		System.out.println("allStar(\"a\") -> \"" + allStar("a") + "\"");
		System.out.println("allStar(\"\") -> \"" + allStar("") + "\"");
		System.out.println("allStar(\"3.14\") -> \"" + allStar("3.14") + "\"");
		System.out.println("allStar(\"Chocolate\") -> \"" + allStar("Chocolate") + "\"");
		System.out.println("allStar(\"1234\") -> \"" + allStar("1234") + "\"");
		printMethod("pairStar");
		System.out.println("pairStar(\"hello\") -> \"" + pairStar("hello") + "\"");
		System.out.println("pairStar(\"xxyy\") -> \"" + pairStar("xxyy") + "\"");
		System.out.println("pairStar(\"aaaa\") -> \"" +  pairStar("aaaa") + "\"");
		System.out.println("pairStar(\"aaab\") -> \"" +  pairStar("aaab") + "\"");
		System.out.println("pairStar(\"aa\") -> \"" + pairStar("aa") + "\"");
		System.out.println("pairStar(\"a\") -> \"" + pairStar("a") + "\"");
		System.out.println("pairStar(\"noadjacent\") -> \"" +  pairStar("noadjacent") + "\"");
		System.out.println("pairStar(\"abba\") -> \"" + pairStar("abba") + "\"");
		System.out.println("pairStar(\"abbba\") -> \"" + pairStar("abbba") + "\"");
		printMethod("endX");
		System.out.println("endX(\"xxre\") -> \"" + endX("xxre") + "\"");
		System.out.println("endX(\"xxhixx\") -> \"" + endX("xxhixx") + "\"");
		System.out.println("endX(\"xhixhix\") -> \"" + endX("xhixhix") + "\"");
		System.out.println("endX(\"hiy\") -> \"" + endX("hiy") + "\"");
		System.out.println("endX(\"h\") -> \"" + endX("h") + "\"");
		System.out.println("endX(\"x\") -> \"" + endX("x") + "\"");
		System.out.println("endX(\"xx\") -> \"" + endX("xx") + "\"");
		System.out.println("endX(\"\") -> \"" + endX("") + "\"");
		System.out.println("endX(\"bxx\") -> \"" + endX("bxx") + "\"");
		System.out.println("endX(\"bxax\") -> \"" + endX("bxax") + "\"");
		System.out.println("endX(\"axaxax\") -> \"" + endX("axaxax") + "\"");
		System.out.println("endX(\"xxhxi\") -> \"" + endX("xxhxi") + "\"");
		printMethod("countPairs");
		System.out.println("countPairs(\"axa\") -> " + countPairs("axa"));
		System.out.println("countPairs(\"axax\") -> " + countPairs("axax"));
		System.out.println("countPairs(\"hi\") -> " + countPairs("hi"));
		System.out.println("countPairs(\"hihih\") -> " + countPairs("hihih"));
		System.out.println("countPairs(\"ihihhh\") -> " + countPairs("ihihhh"));
		System.out.println("countPairs(\"ihjxhh\") -> " + countPairs("ihjxhh"));
		System.out.println("countPairs(\"\") -> " + countPairs(""));
		System.out.println("countPairs(\"a\") -> " + countPairs("a"));
		System.out.println("countPairs(\"aa\") -> " + countPairs("aa"));
		System.out.println("countPairs(\"aaa\") -> " + countPairs("aaa"));
		printMethod("countAbc");
		System.out.println("countAbc(\"abc\") -> " + countAbc("abc"));
		System.out.println("countAbc(\"abcxxabc\") -> " + countAbc("abcxxabc"));
		System.out.println("countAbc(\"abaxxaba\") -> " + countAbc("abaxxaba"));
		System.out.println("countAbc(\"ababc\") -> " + countAbc("ababc"));
		System.out.println("countAbc(\"abxbc\") -> " + countAbc("abxbc"));
		System.out.println("countAbc(\"aaabc\") -> " + countAbc("aaabc"));
		System.out.println("countAbc(\"hello\") -> " + countAbc("hello"));
		System.out.println("countAbc(\"\") -> " + countAbc(""));
		System.out.println("countAbc(\"ab\") -> " + countAbc("ab"));
		System.out.println("countAbc(\"aba\"9 -> " + countAbc("aba"));
		System.out.println("countAbc(\"aca\") -> " + countAbc("aca"));
		System.out.println("countAbc(\"aaa\") -> " + countAbc("aaa"));
		printMethod("count11");
		System.out.println("count11(\"11abc11\") -> " + count11("11abc11"));
		System.out.println("count11(\"abc11x11x11\") -> " + count11("abc11x11x11"));
		System.out.println("count11(\"111\") -> " + count11("111"));
		System.out.println("count11(\"1111\") -> " + count11("1111"));
		System.out.println("count11(\"1\") -> " + count11("1"));
		System.out.println("count11(\"\") -> " + count11(""));
		System.out.println("count11(\"hi\") -> " + count11("hi"));
		System.out.println("count11(\"11x111x1111\") -> " + count11("11x111x1111"));
		System.out.println("count11(\"1x111\") -> " + count11("1x111"));
		System.out.println("count11(\"1Hello1\") -> " + count11("1Hello1"));
		System.out.println("count11(\"Hello\") -> " + count11("Hello"));
		printMethod("stringClean");
		System.out.println("stringClean(\"yyzzza\") -> \"" + stringClean("yyzzza") + "\"");
		System.out.println("stringClean(\"abbbcdd\") -> \"" + stringClean("abbbcdd") + "\"");
		System.out.println("stringClean(\"Hello\") -> \"" + stringClean("Hello") + "\"");
		System.out.println("stringClean(\"XXabcYY\") -> \"" + stringClean("XXabcYY") + "\"");
		System.out.println("stringClean(\"112ab445\") -> \"" + stringClean("112ab445") + "\"");
		System.out.println("stringClean(\"Hello Bookkeeper\") -> \"" + stringClean("Hello Bookkeeper") + "\"");
		printMethod("countHi2");
		System.out.println("countHi2(\"ahixhi\") -> " + countHi2("ahixhi"));
		System.out.println("countHi2(\"ahibhi\") -> " + countHi2("ahibhi"));
		System.out.println("countHi2(\"xhixhi\") -> " + countHi2("xhixhi"));
		System.out.println("countHi2(\"hixhi\") -> " + countHi2("hixhix"));
		System.out.println("countHi2(\"hixhhi\") -> " + countHi2("hixhhi"));
		System.out.println("countHi2(\"hihihi\") -> " + countHi2("hihihi"));
		System.out.println("countHi2(\"hihihix\") -> " + countHi2("hihihix"));
		System.out.println("countHi2(\"xhihihix\") -> " + countHi2("xhihihix"));
		System.out.println("countHi2(\"xxhi\") -> " + countHi2("xxhi"));
		System.out.println("countHi2(\"hixxhi\") -> " + countHi2("hixxhi"));
		System.out.println("countHi2(\"hi\") -> " + countHi2("hi"));
		System.out.println("countHi2(\"xxxx\") -> " + countHi2("xxxx"));
		System.out.println("countHi2(\"h\") -> " + countHi2("h"));
		System.out.println("countHi2(\"x\") -> " + countHi2("x"));
		System.out.println("countHi2(\"\") -> " + countHi2("Hellohi"));
		printMethod("parenBit");
		System.out.println("parenBit(\"xyz(abc)123\") -> \"" + parenBit("xyz(abc)123") + "\"");
		System.out.println("parenBit(\"x(hello)\") -> \"" + parenBit("x(hello") + "\"");
		System.out.println("parenBit(\"(xy)1\") -> \"" + parenBit("(xy)1") + "\"");
		System.out.println("parenBit(\"not really (possible)\") -> \"" + parenBit("not really (possible)") + "\"");
		System.out.println("parenBit(\"(abc)\") -> \"" + parenBit("(abc)") + "\"");
		System.out.println("parenBit(\"(abc)xyz\") -> \"" + parenBit("(abc)xyz") + "\"");
		System.out.println("parenBit(\"(abc)x\") -> \"" + parenBit("(abc)x") + "\"");
		System.out.println("parenBit(\"(x)\") -> \"" + parenBit("(x)") + "\"");
		System.out.println("parenBit(\"()\") -> \"" + parenBit("()") + "\"");
		System.out.println("parenBit(\"res (ipsa) loquitor\") -> \"" + parenBit("res (ipsa) loquitor") + "\"");
		System.out.println("parenBit(\"hello(not really)there\") -> \"" + parenBit("hello(not really)there") + "\"");
		System.out.println("parenBit(\"ab(ab)ab\") -> \"" + parenBit("ab(ab)ab") + "\"");
		printMethod("nestParen");
		System.out.println("nestParen(\"(())\") -> " + nestParen("(())"));
		System.out.println("nestParen(\"((()))\") -> " + nestParen("((()))"));
		System.out.println("nestParen(\"(((x))\") -> " + nestParen("(((x))"));
		System.out.println("nestParen(\"((())\") -> " + nestParen("((())"));
		System.out.println("nestParen(\"((()()\") -> " + nestParen("((()()"));
		System.out.println("nestParen(\"()\") -> " + nestParen("()"));
		System.out.println("nestParen(\"\") -> " + nestParen(""));
		System.out.println("nestParen(\"(yy)\") -> " + nestParen("(yy)"));
		System.out.println("nestParen(\"(())\") -> " + nestParen("(())"));
		System.out.println("nestParen(\"(((y))\") -> " + nestParen("(((y))"));
		System.out.println("nestParen(\"((y)))\") -> " + nestParen("((y)))"));
		System.out.println("nestParen(\"((()))\") -> " + nestParen("((()))"));
		System.out.println("nestParen(\"(())))\") -> " + nestParen("(())))"));
		System.out.println("nestParen(\"((yy())))\") -> " + nestParen("((yy())))"));
		System.out.println("nestParen(\"(((())))\") -> " + nestParen("(((())))"));
		printMethod("strCount");
		System.out.println("strCount(\"catcowcat\", \"cat\") -> " + strCount("catcowcat", "cat"));
		System.out.println("strCount(\"catcowcat\", \"cow\") -> " + strCount("catcowcat", "cow"));
		System.out.println("strCount(\"catcowcat\", \"dog\") -> " + strCount("catcowcat", "dog"));
		System.out.println("strCount(\"xyx\", \"x\") -> " + strCount("xyx", "x"));
		System.out.println("strCount(\"iiiijj\", \"i\") -> " + strCount("iiiijj", "i"));
		System.out.println("strCount(\"iiiijj\", \"ii\") -> " + strCount("iiiijj", "ii"));
		System.out.println("strCount(\"iiiijj\", \"iii\") -> " + strCount("iiiijj", "iii"));
		System.out.println("strCount(\"iiiijj\", \"j\") -> " + strCount("iiiijj", "j"));
		System.out.println("strCount(\"iiiijj\", \"jj\") -> " + strCount("iiiijj", "jj"));
		System.out.println("strCount(\"aaabababab\", \"ab\") -> " + strCount("aaabababab", "ab"));
		System.out.println("strCount(\"aaabababab\", \"aa\") -> " + strCount("aaabababab", "aa"));
		System.out.println("strCount(\"aaabababab\", \"a\") -> " + strCount("aaabababab", "a"));
		System.out.println("strCount(\"aaabababab\", \"b\") -> " + strCount("aaabababab", "b"));
		printMethod("strCopies");
		System.out.println("strCopies(\"catcowcat\", \"cat\", 2) -> " + strCopies("catcowcat", "cat", 2));
		System.out.println("strCopies(\"catcowcat\", \"cow\", 2) -> " + strCopies("catcowcat", "cow", 2));
		System.out.println("strCopies(\"catcowcat\", \"cow\", 1) -> " + strCopies("catcowcat", "cow", 1));
		System.out.println("strCopies(\"iiijjj\", \"i\", 3) -> " + strCopies("iiijjj", "i", 3));
		System.out.println("strCopies(\"iiijjj\", \"i\", 4) -> " + strCopies("iiijjj", "i", 4));
		System.out.println("strCopies(\"iiijjj\", \"ii\", 2) -> " + strCopies("iiijjj", "ii", 2));
		System.out.println("strCopies(\"iiijjj\", \"ii\", 3) -> " + strCopies("iiijjj", "ii", 3));
		System.out.println("strCopies(\"iiijjj\", \"x\", 3) -> " + strCopies("iiijjj", "x", 3));
		System.out.println("strCopies(\"iiijjj\", \"x\", 0) -> " + strCopies("iiijjj", "x", 0));
		System.out.println("strCopies(\"iiiiij\", \"iii\", 3) -> " + strCopies("iiiiij", "iii", 3));
		System.out.println("strCopies(\"iiiiij\", \"iii\", 4) -> " + strCopies("iiiiij", "iii", 4));
		System.out.println("strCopies(\"ijiiiiij\", \"iiii\", 2) -> " + strCopies("ijiiiiij", "iiii", 2));
		System.out.println("strCopies(\"ijiiiiij\", \"iiii\", 3) -> " + strCopies("ijiiiiij", "iiii", 3));
		System.out.println("strCopies(\"dogcatdogcat\", \"dog\", 2) -> " + strCopies("dogcatdogcat", "dog", 2));
		printMethod("strDist");
		System.out.println("strDist(\"catcowcat\", \"cat\") -> " + strDist("catcowcat", "cat"));
		System.out.println("strDist(\"catcowcat\", \"cow\") -> " + strDist("catcowcat", "cow"));
		System.out.println("strDist(\"cccatcowcatxx\", \"cat\") -> " + strDist("cccatcowcatxx", "cat"));
		System.out.println("strDist(\"abccatcowcatcatxyz\", \"cat\") -> " + strDist("abccatcowcatcatxyz", "cat"));
		System.out.println("strDist(\"xyx\", \"x\") -> " + strDist("xyz", "x"));
		System.out.println("strDist(\"xyx\", \"y\") -> " + strDist("xyx", "y"));
		System.out.println("strDist(\"xyx\", \"z\") -> " + strDist("xyx", "z"));
		System.out.println("strDist(\"z\", \"z\") -> " + strDist("z", "z"));
		System.out.println("strDist(\"x\", \"z\") -> " + strDist("x", "z"));
		System.out.println("strDist(\"\", \"z\") -> " + strDist("", "z"));
		System.out.println("strDist(\"hiHellohihihi\", \"hi\") -> " + strDist("hiHellohihihi", "hi"));
		System.out.println("strDist(\"hiHellohihihi\", \"hih\") -> " + strDist("hiHellohihihi", "hih"));
		System.out.println("strDist(\"hiHellohihihi\", \"o\") -> " + strDist("hiHellohihihi", "o"));
		System.out.println("strDist(\"hiHellohihihi\", \"ll\") -> " + strDist("hiHellohihihi", "ll"));
	}
}
