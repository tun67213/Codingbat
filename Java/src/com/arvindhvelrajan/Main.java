package com.arvindhvelrajan;

/**
 * @author arvindhvelrajan
 * @code This is the main function to test all non-static classes in this Project
 */
public class Main
{
	public static void welcome()
	{
		System.out.println("Welcome to Codingbat.com Java Function Implementation!\n");
	}
	public static void main(String[] args)
	{
		welcome();
		Warmup_1 warmup1 = new Warmup_1();
		warmup1.main(args);
	}
}
