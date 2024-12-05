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
	}
}
