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
		welcome();
		warmup1.main(args);
	}
}