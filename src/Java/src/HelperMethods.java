
/**
 * @author arvindhvelrajan
 */
public class HelperMethods
{
	protected static int callTimes = 0;

	public static void printMethod(String methodName)
	{
		if(callTimes > 0)
		{
			System.out.println("\nMethod Name: " + methodName + "()\n");
		}
		else
		{
			System.out.println("Method Name: " + methodName + "()\n");
		}
		callTimes++;
	}
}
