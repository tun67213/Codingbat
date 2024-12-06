package com.arvindhvelrajan;

/**
 * @author arvindhvelrajan
 * @code This class is to run all the functions provided in this module
 */
public class Main
{
	public static void welcome()
	{
		System.out.println("Welcome to Codingbat.com Java Function Demonstration!\n");
	}

	/**
	 * @param args commandline arguments
	 */
	public static void main(String[] args)
	{
		welcome();
		Warmup_1 warmup1 = new Warmup_1();
		warmup1.main(args);
		Warmup_2 warmup2 = new Warmup_2();
		warmup2.main(args);
		String_1 string1 = new String_1();
		string1.main(args);
		Array_1 array1 = new Array_1();
		array1.main(args);
		Logic_1 logic1 = new Logic_1();
		logic1.main(args);
		Logic_2 logic2 = new Logic_2();
		logic2.main(args);
		String_2 string2 = new String_2();
		string2.main(args);
		String_3 string3 = new String_3();
		string3.main(args);
		Array_2 array2 = new Array_2();
		array2.main(args);
		Array_3 array3 = new Array_3();
		array3.main(args);
		AP_1 ap1 = new AP_1();
		ap1.main(args);
		Recursion_1 recursion1 = new Recursion_1();
		recursion1.main(args);
		Recursion_2 recursion2 = new Recursion_2();
		recursion2.main(args);
		Map_1 map1 = new Map_1();
		map1.main(args);
		Map_2 map2 = new Map_2();
		map2.main(args);
		Functional_1 functional1 = new Functional_1();
		functional1.main(args);
		Functional_2 functional2 = new Functional_2();
		functional2.main(args);
	}
}
