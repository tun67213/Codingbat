package src;

import java.util.*;

/**
 * @author arvindhvelrajan
 */
public class Functional_2 extends HelperMethods
{
	/**
	 * This method welcomes the user to this program.
	 */
	public void welcome()
	{
		System.out.println("\n\nFunctional-2 Methods\n");
	}

	/**
	 * Given a list of integers, return a list of the integers, omitting any that are less than 0.
	 *
	 * noNeg([1, -2]) → [1]
	 * noNeg([-3, -3, 3, 3]) → [3, 3]
	 * noNeg([-1, -1, -1]) → []
	 */
	public List<Integer> noNeg(List<Integer> nums)
	{
		nums.removeIf(num -> num < 0);
		return nums;
	}

	/**
	 * Given a list of non-negative integers, return a list of those numbers except omitting any that end with 9. (Note: % by 10)
	 *
	 * no9([1, 2, 19]) → [1, 2]
	 * no9([9, 19, 29, 3]) → [3]
	 * no9([1, 2, 3]) → [1, 2, 3]
	 */
	public List<Integer> no9(List<Integer> nums)
	{
		nums.removeIf(num -> num % 10 == 9);
		return nums;
	}

	/**
	 * Given a list of integers, return a list of those numbers, omitting any that are between 13 and 19 inclusive.
	 *
	 * noTeen([12, 13, 19, 20]) → [12, 20]
	 * noTeen([1, 14, 1]) → [1, 1]
	 * noTeen([15]) → []
	 */
	public List<Integer> noTeen(List<Integer> nums)
	{
		nums.removeIf(num -> num >= 13 && num <= 19);
		return nums;
	}

	/**
	 * Given a list of strings, return a list of the strings, omitting any string that contains a "z". (Note: the str.contains(x) method returns a boolean)
	 *
	 * noZ(["aaa", "bbb", "aza"]) → ["aaa", "bbb"]
	 * noZ(["hziz", "hzello", "hi"]) → ["hi"]
	 * noZ(["hello", "howz", "are", "youz"]) → ["hello", "are"]
	 */
	public List<String> noZ(List<String> strings)
	{
		strings.removeIf(str -> str.contains("z"));
		return strings;
	}

	/**
	 * Given a list of strings, return a list of the strings, omitting any string length 4 or more.
	 *
	 * noLong(["this", "not", "too", "long"]) → ["not", "too"]
	 * noLong(["a", "bbb", "cccc"]) → ["a", "bbb"]
	 * noLong(["cccc", "cccc", "cccc"]) → []
	 */
	public List<String> noLong(List<String> strings)
	{
		strings.removeIf(str -> str.length() >= 4);
		return strings;
	}

	/**
	 * Given a list of strings, return a list of the strings, omitting any string length 3 or 4.
	 *
	 * no34(["a", "bb", "ccc"]) → ["a", "bb"]
	 * no34(["a", "bb", "ccc", "dddd"]) → ["a", "bb"]
	 * no34(["ccc", "dddd", "apple"]) → ["apple"]
	 */
	public List<String> no34(List<String> strings)
	{
		throw new UnsupportedOperationException("Not supported yet.");
	}

	/**
	 * Given a list of strings, return a list where each string has "y" added at its end, omitting any resulting strings that contain "yy" as a substring anywhere.
	 *
	 * noYY(["a", "b", "c"]) → ["ay", "by", "cy"]
	 * noYY(["a", "b", "cy"]) → ["ay", "by"]
	 * noYY(["xx", "ya", "zz"]) → ["xxy", "yay", "zzy"]
	 */
	public List<String> noYY(List<String> strings)
	{
		throw new UnsupportedOperationException("Not supported yet.");
	}

	/**
	 * Given a list of non-negative integers, return a list of those numbers multiplied by 2, omitting any of the resulting numbers that end in 2.
	 *
	 * two2([1, 2, 3]) → [4, 6]
	 * two2([2, 6, 11]) → [4]
	 * two2([0]) → [0]
	 */
	public List<Integer> two2(List<Integer> nums)
	{
		throw new UnsupportedOperationException("Not supported yet.");
	}

	/**
	 * Given a list of integers, return a list of those numbers squared and the product added to 10, omitting any of the resulting numbers that end in 5 or 6.
	 *
	 * square56([3, 1, 4]) → [19, 11]
	 * square56([1]) → [11]
	 * square56([2]) → [14]
	 */
	public List<Integer> square56(List<Integer> nums)
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
		printMethod("noNeg");
		System.out.println("noNeg([1, -2]) -> " + formatList(noNeg(new ArrayList<>(List.of(1, -2)))));
		System.out.println("noNeg([-3, -3, 3, 3]) -> " + formatList(noNeg(new ArrayList<>(List.of(-3, -3, 3, 3)))));
		System.out.println("noNeg([-1, -1, -1]) -> " + formatList(noNeg(new ArrayList<>(List.of(-1, -1, -1)))));
		System.out.println("noNeg([]) -> " + formatList(noNeg(new ArrayList<>(List.of()))));
		System.out.println("noNeg([0, 1, 2]) -> " + formatList(noNeg(new ArrayList<>(List.of(0, 1, 2)))));
		System.out.println("noNeg([3, -10, 1, -1, 4, -400]) -> " + formatList(noNeg(new ArrayList<>(List.of(3, -10, 1, -1, 4, -400)))));
		System.out.println("noNeg([-1, 3, 1, -1, -10, -100, -111, 5]) -> " + formatList(noNeg(new ArrayList<>(List.of(-1, 3, 1, -1, -10, -111, 5)))));
		printMethod("no9");
		System.out.println("no9([1, 2, 19]) -> " + formatList(no9(new ArrayList<>(List.of(1, 2, 19)))));
		System.out.println("no9([9, 19, 29, 3]) -> " + formatList(no9(new ArrayList<>(List.of(9, 19, 29, 3)))));
		System.out.println("no9([1, 2, 3]) -> " + formatList(no9(new ArrayList<>(List.of(1, 2, 3)))));
		System.out.println("no9([45, 99, 90, 28, 13, 999, 0]) -> " + formatList(no9(new ArrayList<>(List.of(45, 99, 90, 28, 13, 999, 0)))));
		System.out.println("no9([]) -> " + formatList(no9(new ArrayList<>(List.of()))));
		System.out.println("no9([9]) -> " + formatList(no9(new ArrayList<>(List.of(9)))));
		System.out.println("no9([0, 9, 0]) -> " + formatList(no9(new ArrayList<>(List.of(0, 9, 0)))));
		printMethod("noTeen");
		System.out.println("noTeen([12, 13, 19, 20]) -> " + formatList(noTeen(new ArrayList<>(List.of(12, 13, 19, 20)))));
		System.out.println("noTeen([1, 14, 1]) -> " + formatList(noTeen(new ArrayList<>(List.of(1, 14, 1)))));
		System.out.println("noTeen([15]) -> " + formatList(noTeen(new ArrayList<>(List.of(15)))));
		System.out.println("noTeen([-15]) -> " + formatList(noTeen(new ArrayList<>(List.of(-15)))));
		System.out.println("noTeen([]) -> " + formatList(noTeen(new ArrayList<>(List.of()))));
		System.out.println("noTeen([0, 1, 2, -3]) -> " + formatList(noTeen(new ArrayList<>(List.of(0, 1, 2, -3)))));
		System.out.println("noTeen([15, 17, 19, 21, 19]) -> " + formatList(noTeen(new ArrayList<>(List.of(15, 17, 19, 21, 19)))));
		System.out.println("noTeen(-16, 2, 15, 3, 16, 25]) -> " + formatList(noTeen(new ArrayList<>(List.of(-16, 2, 15, 3, 16, 25)))));
		printMethod("noZ");
		System.out.println("noZ([\"aaa\", \"bbb\", \"aza\"]) -> " + formatList(noZ(new ArrayList<>(List.of("aaa", "bbb", "aza")))));
		System.out.println("noZ([\"hziz\", \"hzello\", \"hi\"]) -> " + formatList(noZ(new ArrayList<>(List.of("hziz", "hzello", "hi")))));
		System.out.println("noZ([\"hello\", \"howz\", \"are\", \"youz\"]) -> " + formatList(noZ(new ArrayList<>(List.of("hello", "howz", "are", "youz")))));
		System.out.println("noZ([]) -> " + formatList(noZ(new ArrayList<>(List.of()))));
		System.out.println("noZ([\"\"]) -> " + formatList(noZ(new ArrayList<>(List.of("")))));
		System.out.println("noZ([\"x\", \"y\", \"z\"]) -> " + formatList(noZ(new ArrayList<>(List.of("x", "y", "z")))));
		printMethod("noLong");
		System.out.println("noLong([\"this\", \"not\", \"too\", \"long\"]) -> " + formatList(noLong(new ArrayList<>(List.of("this", "not", "too", "long")))));
		System.out.println("noLong([\"a\", \"bbb\", \"cccc\"]) -> " + formatList(noLong(new ArrayList<>(List.of("a", "bbb", "cccc")))));
		System.out.println("noLong([\"cccc\", \"cccc\", \"cccc\"]) -> " + formatList(noLong(new ArrayList<>(List.of("cccc", "cccc", "cccc")))));
		System.out.println("noLong([]) -> " + formatList(noLong(new ArrayList<>(List.of()))));
		System.out.println("noLong([\"\"]) -> " + formatList(noLong(new ArrayList<>(List.of("")))));
		System.out.println("noLong[\"empty\", \"\", \"empty\"]) -> " + formatList(noLong(new ArrayList<>(List.of("empty", "", "empty")))));
		System.out.println("noLong([\"a\"]) -> " + formatList(noLong(new ArrayList<>(List.of("a")))));
		System.out.println("noLong([\"aaaa\", \"bbb\", \"***\", \"333\"]) -> " + formatList(noLong(new ArrayList<>(List.of("aaaa", "bbb", "***", "333")))));
		printMethod("no34");
		System.out.println("no34([\"a\", \"bb\", \"ccc\"]) -> " + formatList(no34(new ArrayList<>(List.of("a", "bb", "ccc")))));
		System.out.println("no34([\"a\", \"bb\", \"ccc\", \"dddd\"]) -> " + formatList(no34(new ArrayList<>(List.of("a", "bb", "ccc", "dddd")))));
		System.out.println("no34([\"ccc\", \"dddd\", \"apple\"]) -> " + formatList(no34(new ArrayList<>(List.of("ccc", "dddd", "apple")))));
		System.out.println("no34([\"this\", \"not\", \"too\", \"long\"]) -> " + formatList(no34(new ArrayList<>(List.of("this", "not", "too", "long")))));
		System.out.println("no34([\"a\", \"bbb\", \"cccc\", \"xx\"]) -> " + formatList(no34(new ArrayList<>(List.of("a", "bbb", "cccc", "xx")))));
		System.out.println("no34([\"dddd\", \"ddd\", \"xxxxxxx\"]) -> "  + formatList(no34(new ArrayList<>(List.of("dddd", "ddd", "xxxxxxx")))));
		System.out.println("no34([]) -> " + formatList(no34(new ArrayList<>(List.of()))));
		System.out.println("no34([\"\"]) -> " + formatList(no34(new ArrayList<>(List.of("")))));
		System.out.println("no34([\"empty\", \"\", \"empty\"]) -> " + formatList(no34(new ArrayList<>(List.of("empty", "", "empty")))));
		System.out.println("no34([\"a\"]) -> " + formatList(no34(new ArrayList<>(List.of("a")))));
		System.out.println("no34([\"aaaa\", \"bbb\", \"*****\", \"333\"]) -> " + formatList(no34(new ArrayList<>(List.of("aaaa", "bbb", "*****", "333")))));
		printMethod("noYY");
		System.out.println("noYY([\"a\", \"b\", \"c\"]) -> " + formatList(noYY(new ArrayList<>(List.of("a", "b", "c")))));
		System.out.println("noYY([\"a\", \"b\", \"cy\"]) -> " + formatList(noYY(new ArrayList<>(List.of("a", "b", "cy")))));
		System.out.println("noYY([\"xx\", \"ya\", \"zz\"]) -> " + formatList(noYY(new ArrayList<>(List.of("xx", "ya", "zz")))));
		System.out.println("noYY([\"xx\", \"yay\", \"zz\"]) -> " + formatList(noYY(new ArrayList<>(List.of("xx", "yay", "zz")))));
		System.out.println("noYY([\"yyx\", \"y\", \"zzz\"]) -> " + formatList(noYY(new ArrayList<>(List.of("yyx", "y", "zzz")))));
		System.out.println("noYY([\"hello\", \"there\"]) -> " + formatList(noYY(new ArrayList<>(List.of("hello", "there")))));
		System.out.println("noYY([\"ya\"]) -> " + formatList(noYY(new ArrayList<>(List.of("ya")))));
		System.out.println("noYY([]) -> " + formatList(noYY(new ArrayList<>(List.of()))));
		System.out.println("noYY([\"\"]) -> " + formatList(noYY(new ArrayList<>(List.of("")))));
		System.out.println("noYY([\"xx\", \"yy\", \"zz\"]) -> " + formatList(noYY(new ArrayList<>(List.of("xx", "yy", "zz")))));
		printMethod("two2");
		System.out.println("two2([1, 2, 3]) -> " + formatList(two2(new ArrayList<>(List.of(1, 2, 3)))));
		System.out.println("two2([2, 6, 11]) -> " + formatList(two2(new ArrayList<>(List.of(2, 6, 11)))));
		System.out.println("two2([0]) -> " + formatList(two2(new ArrayList<>(List.of(0)))));
		System.out.println("two2([]) -> " + formatList(two2(new ArrayList<>(List.of()))));
		System.out.println("two2([1, 11, 111, 16]) -> " + formatList(two2(new ArrayList<>(List.of(1, 11, 111, 16)))));
		System.out.println("two2([2, 3, 5, 7, 11]) -> " + formatList(two2(new ArrayList<>(List.of(2, 3, 5, 7, 11)))));
		System.out.println("two2([3, 1, 4, 1, 6, 99, 0]) -> " + formatList(two2(new ArrayList<>(List.of(3, 1, 4, 1, 6, 99, 0)))));
		printMethod("square56");
		System.out.println("square56([3, 1, 4]) -> " + formatList(square56(new ArrayList<>(List.of(3, 1, 4)))));
		System.out.println("square56([1]) -> " + formatList(square56(new ArrayList<>(List.of(1)))));
		System.out.println("square56([2]) -> " + formatList(square56(new ArrayList<>(List.of(2)))));
		System.out.println("square56([3]) -> " + formatList(square56(new ArrayList<>(List.of(3)))));
		System.out.println("square56([4]) -> " + formatList(square56(new ArrayList<>(List.of(4)))));
		System.out.println("square56([5]) -> " + formatList(square56(new ArrayList<>(List.of(5)))));
		System.out.println("square56([6]) -> " + formatList(square56(new ArrayList<>(List.of(6)))));
		System.out.println("square56([7]) -> " + formatList(square56(new ArrayList<>(List.of(7)))));
		System.out.println("square56([1, 2, 3, 4, 5, 6, 7]) -> " + formatList(square56(new ArrayList<>(List.of(1, 2, 3, 4, 5, 6, 7)))));
		System.out.println("square56([3, -1, -4, 1, 5, 9]) -> " + formatList(square56(new ArrayList<>(List.of(3, -1, -4, 1, 5, 9)))));
	}
}
