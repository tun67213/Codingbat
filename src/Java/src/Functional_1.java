package src;

import java.util.*;

/**
 * @author arvindhvelrajan
 */
public class Functional_1 extends HelperMethods
{
	/**
	 * This method welcomes the user to this program.
	 */
	public void welcome()
	{
		System.out.println("\n\nFunctional-1 Methods\n");
	}

	/**
	 * Given a list of integers, return a list where each integer is multiplied by 2.
	 *
	 * doubling([1, 2, 3]) → [2, 4, 6]
	 * doubling([6, 8, 6, 8, -1]) → [12, 16, 12, 16, -2]
	 * doubling([]) → []
	 */
	public List<Integer> doubling(List<Integer> nums)
	{
		nums.replaceAll(num -> num * 2);
		return nums;
	}

	/**
	 * Given a list of integers, return a list where each integer is multiplied with itself.
	 *
	 * square([1, 2, 3]) → [1, 4, 9]
	 * square([6, 8, -6, -8, 1]) → [36, 64, 36, 64, 1]
	 * square([]) → []
	 */
	public List<Integer> square(List<Integer> nums)
	{
		nums.replaceAll(num -> num * num);
		return nums;
	}

	/**
	 * Given a list of strings, return a list where each string has "*" added at its end.
	 *
	 * addStar(["a", "bb", "ccc"]) → ["a*", "bb*", "ccc*"]
	 * addStar(["hello", "there"]) → ["hello*", "there*"]
	 * addStar(["*"]) → ["**"]
	 */
	public List<String> addStar(List<String> strings)
	{
		strings.replaceAll(str -> str + "*");
		return strings;
	}

	/**
	 * Given a list of strings, return a list where each string is replaced by 3 copies of the string concatenated together.
	 *
	 * copies3(["a", "bb", "ccc"]) → ["aaa", "bbbbbb", "ccccccccc"]
	 * copies3(["24", "a", ""]) → ["242424", "aaa", ""]
	 * copies3(["hello", "there"]) → ["hellohellohello", "theretherethere"]
	 */
	public List<String> copies3(List<String> strings)
	{
		strings.replaceAll(str -> str + str + str);
		return strings;
	}

	/**
	 * Given a list of strings, return a list where each string has "y" added at its start and end.
	 *
	 * moreY(["a", "b", "c"]) → ["yay", "yby", "ycy"]
	 * moreY(["hello", "there"]) → ["yhelloy", "ytherey"]
	 * moreY(["yay"]) → ["yyayy"]
	 */
	public List<String> moreY(List<String> strings)
	{
		strings.replaceAll(str -> "y" + str + "y");
		return strings;
	}

	/**
	 * Given a list of integers, return a list where each integer is added to 1 and the result is multiplied by 10.
	 *
	 * math1([1, 2, 3]) → [20, 30, 40]
	 * math1([6, 8, 6, 8, 1]) → [70, 90, 70, 90, 20]
	 * math1([10]) → [110]
	 */
	public List<Integer> math1(List<Integer> nums)
	{
		throw new UnsupportedOperationException("Not supported yet.");
	}

	/**
	 * Given a list of non-negative integers, return an integer list of the rightmost digits. (Note: use %)
	 *
	 * rightDigit([1, 22, 93]) → [1, 2, 3]
	 * rightDigit([16, 8, 886, 8, 1]) → [6, 8, 6, 8, 1]
	 * rightDigit([10, 0]) → [0, 0]
	 */
	public List<Integer> rightDigit(List<Integer> nums)
	{
		throw new UnsupportedOperationException("Not supported yet.");
	}

	/**
	 * Given a list of strings, return a list where each string is converted to lower case (Note: String toLowerCase() method).
	 *
	 * lower(["Hello", "Hi"]) → ["hello", "hi"]
	 * lower(["AAA", "BBB", "ccc"]) → ["aaa", "bbb", "ccc"]
	 * lower(["KitteN", "ChocolaTE"]) → ["kitten", "chocolate"]
	 */
	public List<String> lower(List<String> strings)
	{
		throw new UnsupportedOperationException("Not supported yet.");
	}

	/**
	 * Given a list of strings, return a list where each string has all its "x" removed.
	 *
	 * noX(["ax", "bb", "cx"]) → ["a", "bb", "c"]
	 * noX(["xxax", "xbxbx", "xxcx"]) → ["a", "bb", "c"]
	 * noX(["x"]) → [""]
	 */
	public List<String> noX(List<String> strings)
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
		printMethod("doubling");
		System.out.println("doubling([1, 2, 3]) -> " + formatList(doubling(new ArrayList<>(List.of(1, 2, 3)))));
		System.out.println("doubling([6, 8, 6, 8, -1]) -> " + formatList(doubling(new ArrayList<>(List.of(6, 8, 6, 8, -1)))));
		System.out.println("doubling([]) -> " + formatList(doubling(new ArrayList<>(List.of()))));
		System.out.println("doubling([5]) -> " + formatList(doubling(new ArrayList<>(List.of(5)))));
		System.out.println("doubling([5, 10]) -> " + formatList(doubling(new ArrayList<>(List.of(5, 10)))));
		System.out.println("doubling([8, -5, 7, 3, 109]) -> " + formatList(doubling(new ArrayList<>(List.of(8, -5, 7, 3, 109)))));
		System.out.println("doubling([6, -3, 12, 23, 4, 1, 19, 11, 2, 3, 2]) -> " + formatList(doubling(new ArrayList<>(List.of(6, -3, 12, 23, 4, 1, 19, 11, 2, 3, 2)))));
		System.out.println("doubling([3, 1, 4, 1, 5, 9]) -> " + formatList(doubling(new ArrayList<>(List.of(3, 1, 4, 1, 5, 9)))));
		printMethod("square");
		System.out.println("square([1, 2, 3]) -> " + formatList(square(new ArrayList<>(List.of(1, 2, 3)))));
		System.out.println("square([6, 8, -6, -8, 1]) -> " + formatList(square(new ArrayList<>(List.of(6, 8, -6, -8, 1)))));
		System.out.println("square([]) -> " + formatList(square(new ArrayList<>(List.of()))));
		System.out.println("square([12]) -> " + formatList(square(new ArrayList<>(List.of(12)))));
		System.out.println("square([5, 10]) -> " + formatList(square(new ArrayList<>(List.of(5, 10)))));
		System.out.println("square([6, -3, 12, 23, 4, 1, 19, 11, 2, 3, 2]) -> " + formatList(square(new ArrayList<>(List.of(6, -3, 12, 23, 4, 1, 19, 11, 2, 3, 2)))));
		printMethod("addStar");
		System.out.println("addStar([\"a\", \"bb\", \"ccc\"]) -> " + formatList(addStar(new ArrayList<>(List.of("a", "bb", "ccc")))));
		System.out.println("addStar([\"hello\", \"there\"]) -> " + formatList(addStar(new ArrayList<>(List.of("hello", "there")))));
		System.out.println("addStar([\"*\"]) -> " + formatList(addStar(new ArrayList<>(List.of("*")))));
		System.out.println("addStar([]) -> " + formatList(addStar(new ArrayList<>(List.of()))));
		System.out.println("addStar([\"kittens\", \"and\", \"chocolate\", \"and\"]) -> " + formatList(addStar(new ArrayList<>(List.of("kittens", "and", "chocolate", "and")))));
		System.out.println("addStar([\"empty\", \"string\", \"\"]) -> " + formatList(addStar(new ArrayList<>(List.of("empty", "string", "")))));
		printMethod("copies3");
		System.out.println("copies3([\"a\", \"bb\", \"ccc\"]) -> " + formatList(copies3(new ArrayList<>(List.of("a", "bb", "ccc")))));
		System.out.println("copies3([\"24\", \"a\", \"\"]) -> " + formatList(copies3(new ArrayList<>(List.of("24", "a", "")))));
		System.out.println("copies3([\"hello\", \"there\"]) -> " + formatList(copies3(new ArrayList<>(List.of("hello", "there")))));
		System.out.println("copies3([\"no\"]) -> " + formatList(copies3(new ArrayList<>(List.of("no")))));
		System.out.println("copies3([]) -> " + formatList(copies3(new ArrayList<>(List.of()))));
		System.out.println("copies3([\"this\", \"and\", \"that\", \"and\"]) -> " + formatList(copies3(new ArrayList<>(List.of("this", "and", "that", "and")))));
		printMethod("moreY");
		System.out.println("moreY([\"a\", \"b\", \"c\"]) -> " + formatList(moreY(new ArrayList<>(List.of("a", "b", "c")))));
		System.out.println("moreY([\"hello\", \"there\"]) -> " + formatList(moreY(new ArrayList<>(List.of("hello", "there")))));
		System.out.println("moreY([\"yay\"]) -> " + formatList(moreY(new ArrayList<>(List.of("yay")))));
		System.out.println("moreY([\"\", \"a\", \"xx\"]) -> " + formatList(moreY(new ArrayList<>(List.of("", "a", "xx")))));
		System.out.println("moreY([]) -> " + formatList(moreY(new ArrayList<>(List.of()))));
		System.out.println("moreY([\"xx\", \"yy\", \"zz\"]) -> " + formatList(moreY(new ArrayList<>(List.of("xx", "yy", "zz")))));
		printMethod("math1");
		System.out.println("math1([1, 2, 3]) -> " + formatList(math1(new ArrayList<>(List.of(1, 2, 3)))));
		System.out.println("math1([6, 8, 6, 8, 1]) -> " + formatList(math1(new ArrayList<>(List.of(6, 8, 6, 8, 1)))));
		System.out.println("math1([10]) -> " + formatList(math1(new ArrayList<>(List.of(10)))));
		System.out.println("math1([]) -> " + formatList(math1(new ArrayList<>(List.of()))));
		System.out.println("math1([5, 10]) -> " + formatList(math1(new ArrayList<>(List.of(5, 10)))));
		System.out.println("math1([-1, -2, -3, -2, -1]) -> " + formatList(math1(new ArrayList<>(List.of(-1, -2, -3, -2, -1)))));
		System.out.println("math1([6, -3, 12, 23, 4, 1, 19, 11, 2, 3, 2]) -> " + formatList(math1(new ArrayList<>(List.of(6, -3, 12, 23, 4, 1, 19, 11, 2, 3, 2)))));
		printMethod("rightDigit");
		System.out.println("rightDigit([1, 22, 93]) -> " + formatList(rightDigit(new ArrayList<>(List.of(1, 22, 93)))));
		System.out.println("rightDigit([16, 8, 886, 8, 1]) -> " + formatList(rightDigit(new ArrayList<>(List.of(16, 8, 886, 8, 1)))));
		System.out.println("rightDigit([10, 0]) -> " + formatList(rightDigit(new ArrayList<>(List.of(10, 0)))));
		System.out.println("rightDigit([]) -> " + formatList(rightDigit(new ArrayList<>(List.of()))));
		System.out.println("rightDigit([5, 10]) -> " + formatList(rightDigit(new ArrayList<>(List.of(5, 10)))));
		System.out.println("rightDigit([5, 50, 500, 5000, 5000]) -> " + formatList(rightDigit(new ArrayList<>(List.of(5, 50, 500, 5000, 5000)))));
		System.out.println("rightDigit([6, 23, 12, 23, 4, 1, 19, 1119, 2, 3, 2]) -> " + formatList(rightDigit(new ArrayList<>(List.of(6, 23, 12, 23, 4, 1, 19, 1119, 2, 3, 2)))));
		printMethod("lower");
		System.out.println("lower([\"Hello\", \"Hi\"]) -> " + formatList(lower(new ArrayList<>(List.of("Hello", "Hi")))));
		System.out.println("lower([\"AAA\", \"BBB\", \"ccc\"]) -> " + formatList(lower(new ArrayList<>(List.of("AAA", "BBB", "ccc")))));
		System.out.println("lower([\"KitteN\", \"ChocolaTE\"]) -> " + formatList(lower(new ArrayList<>(List.of("KitteN", "ChocolaTE")))));
		System.out.println("lower([]) -> " + formatList(lower(new ArrayList<>(List.of()))));
		System.out.println("lower([\"EMPTY\", \"\"]) -> " + formatList(lower(new ArrayList<>(List.of("EMPTY", "")))));
		System.out.println("lower([\"aaX\", \"bYb\", \"Ycc\", \"ZZZ\"]) -> " + formatList(lower(new ArrayList<>(List.of("aaX", "bYb", "Ycc", "ZZZ")))));
		printMethod("noX");
		System.out.println("noX([\"ax\", \"bb\", \"cx\"]) -> " + formatList(noX(new ArrayList<>(List.of("ax", "bb", "cx")))));
		System.out.println("noX([\"xxax\", \"xbxbx\", \"xxcx\"]) -> " + formatList(noX(new ArrayList<>(List.of("xxax", "xbxbx", "xxcx")))));
		System.out.println("noX([\"x\"]) -> " + formatList(noX(new ArrayList<>(List.of("x")))));
		System.out.println("noX([\"\"]) -> " + formatList(noX(new ArrayList<>(List.of("")))));
		System.out.println("noX([]) -> " + formatList(noX(new ArrayList<>(List.of()))));
		System.out.println("noX([\"the\", \"taxi\"]) -> " + formatList(noX(new ArrayList<>(List.of("the", "taxi")))));
		System.out.println("noX([\"the\", \"xxtxaxixxx\"]) -> " + formatList(noX(new ArrayList<>(List.of("the", "xxtxaxixxx")))));
		System.out.println("noX([\"this\", \"is\", \"the\", \"x\"]) -> " + formatList(noX(new ArrayList<>(List.of("this", "is", "the", "x")))));
	}
}
