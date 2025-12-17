package src;

/**
 * @author arvindhvelrajan
 */
public class Main
{
	/**
	 * @code This method welcomes the user to this program.
	 */
	public static void welcome()
	{
		System.out.println();
		System.out.println("Welcome to the Java Implementation for Codingbat methods!\n");
	}

	/**
	 * @param args command line arguments
	 */
	public static void main(String[] args)
	{
		Warmup_1 warmup1 = new Warmup_1();
		Warmup_2 warmup2 = new Warmup_2();
		String_1 string1 = new String_1();
		Array_1 array1 = new Array_1();
		Logic_1 logic1 = new Logic_1();
		Logic_2 logic2 = new Logic_2();
		String_2 string2 = new String_2();
		String_3 string3 = new String_3();
		Array_2 array2 = new Array_2();
		Array_3 array3 = new Array_3();
		AP_1 ap1 = new AP_1();
		Recursion_1 recursion1 = new Recursion_1();
		Recursion_2 recursion2 = new Recursion_2();
		welcome();
		warmup1.main(args);
		warmup2.main(args);
		string1.main(args);
		array1.main(args);
		logic1.main(args);
	}
}