package com.arvindhvelrajan;

import static com.arvindhvelrajan.UI_Functions.*;

/**
 * @author arvindhvelrajan
 * @code This class is to demonstrate the implementation for all functions in String-2 from codingbat.com
 */
public class String_2
{
	/**
	 * This function introduces the user to the class that is being demonstrated.
	 */
	private void welcome()
	{
		System.out.println("\n\nString-2 Functions\n");
	}

	/**
	 * Given a string, return a string where for every char in the original, there are two chars.
	 *
	 * doubleChar("The") → "TThhee"
	 * doubleChar("AAbb") → "AAAAbbbb"
	 * doubleChar("Hi-There") → "HHii--TThheerree"
	 */
	public String doubleChar(String str)
	{
		throw new UnsupportedOperationException("Not supported yet.");
	}

	/**
	 * Return the number of times that the string "hi" appears anywhere in the given string.
	 *
	 * countHi("abc hi ho") → 1
	 * countHi("ABChi hi") → 2
	 * countHi("hihi") → 2
	 */
	public int countHi(String str)
	{
		throw new UnsupportedOperationException("Not supported yet.");
	}

	/**
	 * Return true if the string "cat" and "dog" appear the same number of times in the given string.
	 *
	 * catDog("catdog") → true
	 * catDog("catcat") → false
	 * catDog("1cat1cadodog") → true
	 */
	public boolean catDog(String str)
	{
		throw new UnsupportedOperationException("Not supported yet.");
	}

	/**
	 * Return the number of times that the string "code" appears anywhere in the given string,
	 * except we'll accept any letter for the 'd', so "cope" and "cooe" count.
	 *
	 * countCode("aaacodebbb") → 1
	 * countCode("codexxcode") → 2
	 * countCode("cozexxcope") → 2
	 */
	public int countCode(String str)
	{
		throw new UnsupportedOperationException("Not supported yet.");
	}

	/**
	 * Given two strings, return true if either of the strings appears at the very end of the other string,
	 * ignoring upper/lower case differences (in other words, the computation should not be "case sensitive").
	 * Note: str.toLowerCase() returns the lowercase version of a string.
	 *
	 * endOther("Hiabc", "abc") → true
	 * endOther("AbC", "HiaBc") → true
	 * endOther("abc", "abXabc") → true
	 */
	public boolean endOther(String a, String b)
	{
		throw new UnsupportedOperationException("Not supported yet.");
	}

	/**
	 * Return true if the given string contains an appearance of "xyz" where the xyz is not directly preceeded by a period (.). So "xxyz" counts but "x.xyz" does not.
	 *
	 * xyzThere("abcxyz") → true
	 * xyzThere("abc.xyz") → false
	 * xyzThere("xyz.abc") → true
	 */
	public boolean xyzThere(String str)
	{
		throw new UnsupportedOperationException("Not supported yet.");
	}

	/**
	 * Return true if the given string contains a "bob" string, but where the middle 'o' char can be any char.
	 *
	 * bobThere("abcbob") → true
	 * bobThere("b9b") → true
	 * bobThere("bac") → false
	 */
	public boolean bobThere(String str)
	{
		throw new UnsupportedOperationException("Not supported yet.");
	}

	/**
	 * We'll say that a String is xy-balanced if for all the 'x' chars in the string,
	 * there exists a 'y' char somewhere later in the string. So "xxy" is balanced, but "xyx" is not.
	 * One 'y' can balance multiple 'x's. Return true if the given string is xy-balanced.
	 *
	 * xyBalance("aaxbby") → true
	 * xyBalance("aaxbb") → false
	 * xyBalance("yaaxbb") → false
	 */
	public boolean xyBalance(String str)
	{
		throw new UnsupportedOperationException("Not supported yet.");
	}

	/**
	 * Given two strings, a and b, create a bigger string made of the first char of a,
	 * the first char of b, the second char of a, the second char of b, and so on.
	 * Any leftover chars go at the end of the result.
	 *
	 * mixString("abc", "xyz") → "axbycz"
	 * mixString("Hi", "There") → "HTihere"
	 * mixString("xxxx", "There") → "xTxhxexre"
	 */
	public String mixString(String a, String b)
	{
		throw new UnsupportedOperationException("Not supported yet.");
	}

	/**
	 * Given a string and an int n, return a string made of n repetitions of the last n characters
	 * of the string. You may assume that n is between 0 and the length of the string, inclusive.
	 *
	 * repeatEnd("Hello", 3) → "llollollo"
	 * repeatEnd("Hello", 2) → "lolo"
	 * repeatEnd("Hello", 1) → "o"
	 */
	public String repeatEnd(String str, int n)
	{
		throw new UnsupportedOperationException("Not supported yet.");
	}

	/**
	 * Given a string and an int n, return a string made of the first n characters of the string,
	 * followed by the first n-1 characters of the string, and so on. You may assume that n is
	 * between 0 and the length of the string, inclusive (i.e. n >= 0 and n <= str.length()).
	 *
	 * repeatFront("Chocolate", 4) → "ChocChoChC"
	 * repeatFront("Chocolate", 3) → "ChoChC"
	 * repeatFront("Ice Cream", 2) → "IcI"
	 */
	public String repeatFront(String str, int n)
	{
		throw new UnsupportedOperationException("Not supported yet.");
	}

	/**
	 * Given two strings, word and a separator sep, return a big string made of count occurrences of the word,
	 * separated by the separator string.
	 *
	 * repeatSeparator("Word", "X", 3) → "WordXWordXWord"
	 * repeatSeparator("This", "And", 2) → "ThisAndThis"
	 * repeatSeparator("This", "And", 1) → "This"
	 */
	public String repeatSeparator(String word, String sep, int count)
	{
		throw new UnsupportedOperationException("Not supported yet.");
	}

	/**
	 * Given a string, consider the prefix string made of the first N chars of the string.
	 * Does that prefix string appear somewhere else in the string?
	 * Assume that the string is not empty and that N is in the range 1..str.length().
	 *
	 * prefixAgain("abXYabc", 1) → true
	 * prefixAgain("abXYabc", 2) → true
	 * prefixAgain("abXYabc", 3) → false
	 */
	public boolean prefixAgain(String str, int n)
	{
		throw new UnsupportedOperationException("Not supported yet.");
	}

	/**
	 * Given a string, does "xyz" appear in the middle of the string?
	 * To define middle, we'll say that the number of chars to the left and right of the "xyz"
	 * must differ by at most one. This problem is harder than it looks.
	 *
	 * xyzMiddle("AAxyzBB") → true
	 * xyzMiddle("AxyzBB") → true
	 * xyzMiddle("AxyzBBB") → false
	 */
	public boolean xyzMiddle(String str)
	{
		throw new UnsupportedOperationException("Not supported yet.");
	}

	/**
	 * A sandwich is two pieces of bread with something in between.
	 * Return the string that is between the first and last appearance of "bread" in the given string,
	 * or return the empty string "" if there are not two pieces of bread.
	 *
	 * getSandwich("breadjambread") → "jam"
	 * getSandwich("xxbreadjambreadyy") → "jam"
	 * getSandwich("xxbreadyy") → ""
	 */
	public String getSandwich(String str)
	{
		throw new UnsupportedOperationException("Not supported yet.");
	}

	/**
	 * Returns true if for every '*' (star) in the string, if there are chars both immediately before and after
	 * the star, they are the same.
	 *
	 * sameStarChar("xy*yzz") → true
	 * sameStarChar("xy*zzz") → false
	 * sameStarChar("*xa*az") → true
	 */
	public boolean sameStarChar(String str)
	{
		throw new UnsupportedOperationException("Not supported yet.");
	}

	/**
	 * Given a string, compute a new string by moving the first char to come after the next two chars,
	 * so "abc" yields "bca". Repeat this process for each subsequent group of 3 chars, so "abcdef" yields "bcaefd".
	 * Ignore any group of fewer than 3 chars at the end.
	 *
	 * oneTwo("abc") → "bca"
	 * oneTwo("tca") → "cat"
	 * oneTwo("tcagdo") → "catdog"
	 */
	public String oneTwo(String str)
	{
		throw new UnsupportedOperationException("Not supported yet.");
	}

	/**
	 * @param args commandline arguments
	 */
	public void main(String[] args)
	{
		welcome();
		printFunction("doubleChar");
		System.out.println("doubleChar(\"The\") → \"" + doubleChar("The") + "\"");
		System.out.println("doubleChar(\"AAbb\") → \"" + doubleChar("AAbb") + "\"");
		System.out.println("doubleChar(\"Hi-There\") → \"" + doubleChar("Hi-There") + "\"");
		System.out.println("doubleChar(\"Word!\") → \"" + doubleChar("Word!") + "\"");
		System.out.println("doubleChar(\"!!\") → \"" + doubleChar("!!") + "\"");
		System.out.println("doubleChar(\"\") → \"" + doubleChar("") + "\"");
		System.out.println("doubleChar(\"a\") → \"" + doubleChar("a") + "\"");
		System.out.println("doubleChar(\".\") → \"" + doubleChar(".") + "\"");
		System.out.println("doubleChar(\"aa\") → \"" + doubleChar("aa") + "\"");
		printFunction("countHi");
		System.out.println("countHi(\"abc hi ho\") → " + countHi("abc hi ho"));
		System.out.println("countHi(\"ABChi hi\") → " + countHi("ABChi hi"));
		System.out.println("countHi(\"hihi\") → " + countHi("hihi"));
		System.out.println("countHi(\"hiHIhi\") → " + countHi("hiHIhi"));
		System.out.println("countHi(\"\") → \"" + countHi("") + "\"");
		System.out.println("countHi(\"h\") → \"" + countHi("h") + "\"");
		System.out.println("countHi(\"hi\") → " + countHi("hi") + "\"");
		System.out.println("countHi(\"Hi is no HI on ahI\") → " + countHi("Hi is no HI on ahI"));
		System.out.println("countHi(\"hiho not HOHIhi\") → " + countHi("hiho not HOHIhi"));
		printFunction("catDog");
		System.out.println("catDog(\"catdog\") → " + catDog("catdog"));
		System.out.println("catDog(\"catcat\") → " + catDog("catcat"));
		System.out.println("catDog(\"1cat1cadodog\") → " + catDog("1cat1cadodog"));
		System.out.println("catDog(\"catxxdogxxxdog\") → " + catDog("catxxdogxxxdog"));
		System.out.println("catDog(\"catxdogxdogxcat\") → " + catDog("catxdogxdogxcat"));
		System.out.println("catDog(\"catxdogxdogxca\") → " + catDog("catxdogxdogxca"));
		System.out.println("catDog(\"dogdogcat\") → " + catDog("dogdogcat"));
		System.out.println("catDog(\"dogogcat\") → " + catDog("dogogcat"));
		System.out.println("catDog(\"dog\") → " + catDog("dog"));
		System.out.println("catDog(\"cat\") → " + catDog("cat"));
		System.out.println("catDog(\"ca\") → " + catDog("ca"));
		System.out.println("catDog(\"c\") → " + catDog("c"));
		System.out.println("catDog(\"\") → " + catDog(""));
		printFunction("countCode");
		System.out.println("countCode(\"aaacodebbb\") → " + countCode("aaacodebbb"));
		System.out.println("countCode(\"codexxcode\") → " + countCode("codexxcode"));
		System.out.println("countCode(\"cozexxcope\") → " + countCode("cozexxcope"));
		System.out.println("countCode(\"cozfxxcope\") → " + countCode("cozfxxcope"));
		System.out.println("countCode(\"xxcozeyycop\") → " + countCode("xxcozeyycop"));
		System.out.println("countCode(\"cozcop\") → " + countCode("cozcop"));
		System.out.println("countCode(\"abcxyz\") → " + countCode("abcxyz"));
		System.out.println("countCode(\"code\") → " + countCode("code"));
		System.out.println("countCode(\"ode\") → " + countCode("ode"));
		System.out.println("countCode(\"c\") → " + countCode("c"));
		System.out.println("countCode(\"\") → " + countCode(""));
		System.out.println("countCode(\"AAcodeBBcoleCCccoreDD\") → " + countCode("AAcodeBBcoleCCccoreDD"));
		System.out.println("countCode(\"AAcodeBBcoleCCccorfDD\") → " + countCode("AAcodeBBcoleCCccorfDD"));
		System.out.println("countCode(\"coAcodeBcoleccoreDD\") → " + countCode("coAcodeBcoleccoreDD"));
		printFunction("endOther");
		System.out.println("endOther(\"Hiabc\", \"abc\") → " + endOther("Hiabc", "abc"));
		System.out.println("endOther(\"AbC\", \"HiaBc\") → " + endOther("AbC", "HiaBc"));
		System.out.println("endOther(\"abc\", \"abXabc\") → " + endOther("abc", "abXabc"));
		System.out.println("endOther(\"Hiabc\", \"abcd\") → " + endOther("Hiabc", "abcd"));
		System.out.println("endOther(\"Hiabc\", \"bc\") → " + endOther("Hiabc", "bc"));
		System.out.println("endOther(\"Hiabcx\", \"bc\") → " + endOther("Hiabcx", "bc"));
		System.out.println("endOther(\"abc\", \"abc\") → " + endOther("abc", "abc"));
		System.out.println("endOther(\"xyz\", \"12xyz\") → " + endOther("xyz", "12xyz"));
		System.out.println("endOther(\"yz\", \"12xz\") → " + endOther("yz", "12xz"));
		System.out.println("endOther(\"Z\", \"12xz\") → " + endOther("Z", "12xz"));
		System.out.println("endOther(\"12\", \"12\") → " + endOther("12", "12"));
		System.out.println("endOther(\"abcXYZ\", \"abcDEF\") → " + endOther("abcXYZ", "abcDEF"));
		System.out.println("endOther(\"ab\", \"ab12\") → " + endOther("ab", "ab12"));
		System.out.println("endOther(\"ab\", \"12ab\") → " + endOther("ab", "12ab"));
		printFunction("xyzThere");
		System.out.println("xyzThere(\"abcxyz\") → " + xyzThere("abcxyz"));
		System.out.println("xyzThere(\"abc.xyz\") → " + xyzThere("abc.xyz"));
		System.out.println("xyzThere(\"xyz.abc\") → " + xyzThere("xyz.abc"));
		System.out.println("xyzThere(\"abcxy\") → " + xyzThere("abcxy"));
		System.out.println("xyzThere(\"xyz\") → " + xyzThere("xyz"));
		System.out.println("xyzThere(\"xy\") → " + xyzThere("xy"));
		System.out.println("xyzThere(\"x\") → " + xyzThere("x"));
		System.out.println("xyzThere(\"\") → " + xyzThere(""));
		System.out.println("xyzThere(\"abc.xyzxyz\") → " + xyzThere("abc.xyzxyz"));
		System.out.println("xyzThere(\"abc.xxyz\") → " + xyzThere("abc.xxyz"));
		System.out.println("xyzThere(\".xyz\") → " + xyzThere(".xyz"));
		System.out.println("xyzThere(\"12.xyz\") → " + xyzThere("12.xyz"));
		System.out.println("xyzThere(\"12xyz\") → " + xyzThere("12xyz"));
		System.out.println("xyzThere(\"1.xyz.xyz2.xyz\") → " + xyzThere("1.xyz.xyz2.xyz"));
		printFunction("bobThere");
		System.out.println("bobThere(\"abcbob\") → " + bobThere("abcbob"));
		System.out.println("bobThere(\"b9b\") → " + bobThere("b9b"));
		System.out.println("bobThere(\"bac\") → " + bobThere("bac"));
		System.out.println("bobThere(\"bbb\") → " + bobThere("bbb"));
		System.out.println("bobThere(\"abcdefb\") → " + bobThere("abcdefb"));
		System.out.println("bobThere(\"123abcbcdbabxyz\") → " + bobThere("123abcbcdbabxyz"));
		System.out.println("bobThere(\"b12\") → " + bobThere("b12"));
		System.out.println("bobThere(\"b1b\") → " + bobThere("b1b"));
		System.out.println("bobThere(\"b12b1b\") → " + bobThere("b12b1b"));
		System.out.println("bobThere(\"bbc\") → " + bobThere("bbc"));
		System.out.println("bobThere(\"bbb\")→ " + bobThere("bbb"));
		System.out.println("bobThere(\"bb\") → " + bobThere("bb"));
		System.out.println("bobThere(\"b\") → " + bobThere("b"));
		printFunction("xyBalance");
		System.out.println("xyBalance(\"aaxbby\") → " + xyBalance("aaxbby"));
		System.out.println("xyBalance(\"aaxbb\") → " + xyBalance("aaxbb"));
		System.out.println("xyBalance(\"yaaxbb\") → " + xyBalance("yaaxbb"));
		System.out.println("xyBalance(\"yaaxbby\") → " + xyBalance("yaaxbby"));
		System.out.println("xyBalance(\"xaxxbby\") → " + xyBalance("xaxxbby"));
		System.out.println("xyBalance(\"xaxxbbyx\") → " + xyBalance("xaxxbbyx"));
		System.out.println("xyBalance(\"xxbxy\") → " + xyBalance("xxbxy"));
		System.out.println("xyBalance(\"xxbx\") → " + xyBalance("xxbx"));
		System.out.println("xyBalance(\"bbb\") → " + xyBalance("bbb"));
		System.out.println("xyBalance(\"bxbb\") → " + xyBalance("bxbb"));
		System.out.println("xyBalance(\"bxyb\") → " + xyBalance("bxyb"));
		System.out.println("xyBalance(\"xy\") → " + xyBalance("xy"));
		System.out.println("xyBalance(\"y\") → " + xyBalance("y"));
		System.out.println("xyBalance(\"x\") → " + xyBalance("x"));
		System.out.println("xyBalance(\"\") → " + xyBalance(""));
		System.out.println("xyBalance(\"yxyxyxyx\") → " + xyBalance("yxyxyxyx"));
		System.out.println("xyBalance(\"yxyxyxyxy\") → " + xyBalance("yxyxyxyxy"));
		System.out.println("xyBalance(\"12xabxxydxyxyzz\") → " + xyBalance("12xabxxydxyxyzz"));
		printFunction("mixString");
		System.out.println("mixString(\"abc\", \"xyz\") → \"" + mixString("abc", "xyz") + "\"");
		System.out.println("mixString(\"Hi\", \"There\") → \"" + mixString("Hi", "There") + "\"");
		System.out.println("mixString(\"xxxx\", \"There\") → \"" + mixString("xxxx", "There") + "\"");
		System.out.println("mixString(\"xxx\", \"X\") → \"" + mixString("xxx", "X") + "\"");
		System.out.println("mixString(\"2/\", \"27 around\") → \"" + mixString("2/", "27 around") + "\"");
		System.out.println("mixString(\"\", \"Hello\") → \"" + mixString("", "Hello") + "\"");
		System.out.println("mixString(\"Abc\", \"\") → \"" + mixString("Abc", "") + "\"");
		System.out.println("mixString(\"\", \"\") → \"" + mixString("", "") + "\"");
		System.out.println("mixString(\"a\", \"b\") → \"" + mixString("a", "b") + "\"");
		System.out.println("mixString(\"ax\", \"b\") → \"" + mixString("ax", "b") + "\"");
		System.out.println("mixString(\"a\", \"bx\") → \"" + mixString("a", "bx") + "\"");
		System.out.println("mixString(\"So\", \"Long\") → \"" + mixString("So", "Long") + "\"");
		System.out.println("mixString(\"Long\", \"So\") → \"" + mixString("Long", "So") + "\"");
		printFunction("repeatEnd");
		System.out.println("repeatEnd(\"Hello\", 3) → \"" + repeatEnd("Hello", 3) + "\"");
		System.out.println("repeatEnd(\"Hello\", 2) → \"" + repeatEnd("Hello", 2) + "\"");
		System.out.println("repeatEnd(\"Hello\", 1) → \"" + repeatEnd("Hello", 1) + "\"");
		System.out.println("repeatEnd(\"Hello\", 0) → \"" + repeatEnd("Hello", 0) + "\"");
		System.out.println("repeatEnd(\"abc\", 3) → \"" + repeatEnd("abc", 3) + "\"");
		System.out.println("repeatEnd(\"1234\", 2) → \"" + repeatEnd("1234", 2) + "\"");
		System.out.println("repeatEnd(\"1234\", 3) → \"" + repeatEnd("1234", 3) + "\"");
		System.out.println("repeatEnd(\"\", 0) → \"" + repeatEnd("", 0) + "\"");
		printFunction("repeatFront");
		System.out.println("repeatFront(\"Chocolate\", 4) → \"" + repeatFront("Chocolate", 4) + "\"");
		System.out.println("repeatFront(\"Chocolate\", 3) → \"" + repeatFront("Chocolate", 3) + "\"");
		System.out.println("repeatFront(\"Ice Cream\", 2) → \"" + repeatFront("Ice Cream", 2) + "\"");
		System.out.println("repeatFront(\"Ice Cream\", 1) → \"" + repeatFront("Ice Cream", 1) + "\"");
		System.out.println("repeatFront(\"Ice Cream\", 0) → \"" + repeatFront("Ice Cream", 0) + "\"");
		System.out.println("repeatFront(\"xyz\", 3) → \"" + repeatFront("xyz", 3) + "\"");
		System.out.println("repeatFront(\"\", 0) → \"" + repeatFront("", 0) + "\"");
		System.out.println("repeatFront(\"Java\", 4) → \"" + repeatFront("Java", 4) + "\"");
		System.out.println("repeatFront(\"Java\", 1) → \"" + repeatFront("Java", 1) + "\"");
		printFunction("repeatSeparator");
		System.out.println("repeatSeparator(\"Word\", \"X\", 3) → \"" + repeatSeparator("Word", "X", 3) + "\"");
		System.out.println("repeatSeparator(\"This\", \"And\", 2) → \"" + repeatSeparator("This", "And", 2) + "\"");
		System.out.println("repeatSeparator(\"This\", \"And\", 1) → \"" + repeatSeparator("This", "And", 1) + "\"");
		System.out.println("repeatSeparator(\"Hi\", \"-n-\", 2) → \"" + repeatSeparator("Hi", "-n-", 2) + "\"");
		System.out.println("repeatSeparator(\"AAA\", \"\", 1) → \"" + repeatSeparator("AAA", "", 1) + "\"");
		System.out.println("repeatSeparator(\"AAA\", \"\", 0) → \"" + repeatSeparator("AAA", "", 0) + "\"");
		System.out.println("repeatSeparator(\"A\", \"B\", 5) → \"" + repeatSeparator("A", "B", 5) + "\"");
		System.out.println("repeatSeparator(\"abc\", \"XX\", 3) → \"" + repeatSeparator("abc", "XX", 3) + "\"");
		System.out.println("repeatSeparator(\"abc\", \"XX\", 2) → \"" + repeatSeparator("abc", "XX", 2) + "\"");
		System.out.println("repeatSeparator(\"abc\", \"XX\", 1) → \"" + repeatSeparator("abc", "XX", 1) + "\"");
		System.out.println("repeatSeparator(\"XYZ\", \"a\", 2) → \"" + repeatSeparator("XYZ", "a", 2) + "\"");
		printFunction("prefixAgain");
		System.out.println("prefixAgain(\"abXYabc\", 1) → " + prefixAgain("abXYabc", 1));
		System.out.println("prefixAgain(\"abXYabc\", 2) → " + prefixAgain("abXYabc", 2));
		System.out.println("prefixAgain(\"abXYabc\", 3) → " + prefixAgain("abXYabc", 3));
		System.out.println("prefixAgain(\"xyzxyxyxy\", 2) → " + prefixAgain("xyzxyxyxy", 2));
		System.out.println("prefixAgain(\"xyzxyxyxy\", 3) → " + prefixAgain("xyzxyxyxy", 3));
		System.out.println("prefixAgain(\"Hi12345Hi6789Hi10\", 1) → " + prefixAgain("Hi12345Hi6789Hi10", 1));
		System.out.println("prefixAgain(\"Hi12345Hi6789Hi10\", 2) → " + prefixAgain("Hi12345Hi6789Hi10", 2));
		System.out.println("prefixAgain(\"Hi12345Hi6789Hi10\", 3) → " + prefixAgain("Hi12345Hi6789Hi10", 3));
		System.out.println("prefixAgain(\"Hi12345Hi6789Hi10\", 4) → " + prefixAgain("Hi12345Hi6789Hi10", 4));
		System.out.println("prefixAgain(\"a\", 1) → " + prefixAgain("a", 1));
		System.out.println("prefixAgain(\"aa\", 1) → " + prefixAgain("aa", 1));
		System.out.println("prefixAgain(\"ab\", 1) → " + prefixAgain("ab", 1));
		printFunction("xyzMiddle");
		System.out.println("xyzMiddle(\"AAxyzBB\") → " + xyzMiddle("AAxyzBB"));
		System.out.println("xyzMiddle(\"AxyzBB\") → " + xyzMiddle("AxyzBB"));
		System.out.println("xyzMiddle(\"AxyzBBB\") → " + xyzMiddle("AxyzBBB"));
		System.out.println("xyzMiddle(\"AxyzBBBB\") → " + xyzMiddle("AxyzBBBB"));
		System.out.println("xyzMiddle(\"AAAxyzB\") → " + xyzMiddle("AAAxyzB"));
		System.out.println("xyzMiddle(\"AAAxyzBB\") → " + xyzMiddle("AAAxyzBB"));
		System.out.println("xyzMiddle(\"AAAAxyzBB\") → " + xyzMiddle("AAAAxyzBB"));
		System.out.println("xyzMiddle(\"AAAAAxyzBBB\") → " + xyzMiddle("AAAAAxyzBBB"));
		System.out.println("xyzMiddle(\"1x345xyz12x4\") → " + xyzMiddle("1x345xyz12x4"));
		System.out.println("xyzMiddle(\"xyzAxyzBBB\") → " + xyzMiddle("xyzAxyzBBB"));
		System.out.println("xyzMiddle(\"xyzAxyzBxyz\") → " + xyzMiddle("xyzAxyzBxyz"));
		System.out.println("xyzMiddle(\"xyzxyzAxyzBxyzxyz\") → " + xyzMiddle("xyzxyzAxyzBxyzxyzxyz"));
		System.out.println("xyzMiddle(\"xyzxyzxyzBxyzxyz\") → " + xyzMiddle("xyzxyzxyzBxyzxyzxyzxyz"));
		System.out.println("xyzMiddle(\"xyzxyzAxyzxyzxyz\") → " + xyzMiddle("xyzxyzAxyzxyzxyzxyzxyz"));
		System.out.println("xyzMiddle(\"xyzxyzAxyzxyzxy\") → " + xyzMiddle("xyzxyzAxyzxyzxyzxy"));
		System.out.println("xyzMiddle(\"AxyzxyzBB\") → " + xyzMiddle("AxyzxyzBB"));
		System.out.println("xyzMiddle(\"\") → " + xyzMiddle(""));
		System.out.println("xyzMiddle(\"x\") → " + xyzMiddle("x"));
		System.out.println("xyzMiddle(\"xy\") → " + xyzMiddle("xy"));
		System.out.println("xyzMiddle(\"xyz\") → " + xyzMiddle("xyz"));
		System.out.println("xyzMiddle(\"xyzz\") → " + xyzMiddle("xyzz"));
		printFunction("getSandwich");
		System.out.println("getSandwich(\"breadjambread\") → \"" + getSandwich("breadjambread") + "\"");
		System.out.println("getSandwich(\"xxbreadjambreadyy\") → \"" + getSandwich("xxbreadjambreadyy") + "\"");
		System.out.println("getSandwich(\"xxbreadyy\") → \"" + getSandwich("xxbreadyy") + "\"");
		System.out.println("getSandwich(\"xxbreadbreadjambreadyy\") → \"" + getSandwich("xxbreadbreadjambreadyy") + "\"");
		System.out.println("getSandwich(\"breadAbread\") → \"" + getSandwich("breadAbread") + "\"");
		System.out.println("getSandwich(\"breadbread\")  → \"" + getSandwich("breadbread") + "\"");
		System.out.println("getSandwich(\"abcbreaz\")  → \"" + getSandwich("abcbreaz") + "\"");
		System.out.println("getSandwich(\"xyz\") → \"" + getSandwich("xyz") + "\"");
		System.out.println("getSandwich(\"\") → \"" + getSandwich("") + "\"");
		System.out.println("getSandwich(\"breadbreaxbread\") → \"" + getSandwich("breadbreaxbread") + "\"");
		System.out.println("getSandwich(\"breaxbreadybread\") → \"" + getSandwich("breaxbreadybread") + "\"");
		System.out.println("getSandwich(\"breadbreadbreadbread\") → \"" + getSandwich("breadbreadbreadbread") + "\"");
		printFunction("sameStarChar");
		System.out.println("sameStarChar(\"xy*yzz\") → " + sameStarChar("xy*yzz"));
		System.out.println("sameStarChar(\"xy*zzz\") → " + sameStarChar("xy*zzz"));
		System.out.println("sameStarChar(\"*xa*az\") → " + sameStarChar("*xa*az"));
		System.out.println("sameStarChar(\"*xa*bz\") → " + sameStarChar("*xa*bz"));
		System.out.println("sameStarChar(\"*xa*a\") → " + sameStarChar("*xa*a"));
		System.out.println("sameStarChar(\"\") → " + sameStarChar(""));
		System.out.println("sameStarChar(\"*xa*a*a\") → " + sameStarChar("*xa*a*a"));
		System.out.println("sameStarChar(\"*xa*a*b\") → " + sameStarChar("*xa*a*b"));
		System.out.println("sameStarChar(\"*12*2*2\") → " + sameStarChar("*12*2*2"));
		System.out.println("sameStarChar(\"12*2*3*\") → " + sameStarChar("12*2*3*"));
		System.out.println("sameStarChar(\"*\") → " + sameStarChar("*"));
		System.out.println("sameStarChar(\"**\") → " + sameStarChar("**"));
		printFunction("oneTwo");
		System.out.println("oneTwo(\"abc\") → \"" + oneTwo("abc") + "\"");
		System.out.println("oneTwo(\"tca\") → \"" + oneTwo("tca") + "\"");
		System.out.println("oneTwo(\"tcagdo\") → \"" + oneTwo("tcagdo") + "\"");
		System.out.println("oneTwo(\"chocolate\") → \"" + oneTwo("chocolate") + "\"");
		System.out.println("oneTwo(\"1234567890\") → \"" + oneTwo("1234567890") + "\"");
		System.out.println("oneTwo(\"xabxabxabxabxabxabxab\") → \"" + oneTwo("xabxabxabxabxabxabxab"));
		System.out.println("oneTwo(\"abcdefx\") → \"" + oneTwo("abcdefx") + "\"");
		System.out.println("oneTwo(\"abcdefxy\") → \"" + oneTwo("abcdefxy") + "\"");
		System.out.println("oneTwo(\"abcdefxyz\") → \"" + oneTwo("abcdefxyz") + "\"");
		System.out.println("oneTwo(\"\") → \"" + oneTwo("") + "\"");
		System.out.println("oneTwo(\"x\") → \"" + oneTwo("x") + "\"");
		System.out.println("oneTwo(\"xy\") → \"" + oneTwo("xy") + "\"");
		System.out.println("oneTwo(\"xyz\") → \"" + oneTwo("xyz") + "\"");
		System.out.println("oneTwo(\"abcdefghijklkmnopqrstuvwxyz1234567890\") → \"" + oneTwo("abcdefghijklkmnopqrstuvwxyz1234567890") + "\"");
		System.out.println("oneTwo(\"abcdefghijklkmnopqrstuvwxyz123456789\") → \"" + oneTwo("abcdefghijklkmnopqrstuvwxyz123456789") + "\"");
		System.out.println("oneTwo(\"abcdefghijklkmnopqrstuvwxyz12345678\") → \"" + oneTwo("abcdefghijklkmnopqrstuvwxyz12345678") + "\"");
	}
}
