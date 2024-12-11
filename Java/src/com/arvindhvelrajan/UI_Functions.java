package com.arvindhvelrajan;

/**
 * @author arvindhvelrajan
 * @code This class is meant to keep all functions necessary for smooth UI in the command line when running the created classes.
 */
public class UI_Functions
{
	private static int callCount = 0;

	public static void resetCallCount()
	{
		callCount = 0;
	}
	public static void printFunction(String functionName)
	{
		if(callCount != 0)
		{
			System.out.println();
			System.out.println();
		}
		System.out.println("Function Name: " + functionName + "()");
		System.out.println();
		callCount++;
	}
}
