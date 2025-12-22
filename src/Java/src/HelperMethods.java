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
		if(methodName == null)
		{
			throw new NullPointerException("You MUST provide a method name. methodName cannot be null.");
		}
		if(!method.endsWith("()"))
		{
			method += "()";
		}
		if(callTimes > 0)
		{
			System.out.println("\n\nMethod Name: " + method + "\n");
		}
		else
		{
			System.out.println("Method Name: " + method + "\n");
		}
		callTimes++;
	}
}
