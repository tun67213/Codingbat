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
		Warmup_2 warmup2 = new Warmup_2();
		warmup1.main(args);
		warmup2.main(args);
	}
}
