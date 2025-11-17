package src;

/**
 * @author arvindhvelrajan
 */
public class HelperMethods
{
	public static int callTimes = 0;

	public static void printMethod(String methodName)
	{
		String method = methodName;
		if(callTimes > 0)
		{
			if(method.contains("()"))
			{
				System.out.println("\nMethod Name: " + methodName + "\n");
			}
			else
			{
				System.out.println("\nMethod Name: " + methodName + "()\n");
			}
		}
		else
		{
			if(method.contains("()"))
			{
				System.out.println("\nMethod Name: " + methodName + "\n");
			}
			else
			{
				System.out.println("\nMethod Name: " + methodName + "()\n");
			}
		}
		callTimes++;
	}
}
