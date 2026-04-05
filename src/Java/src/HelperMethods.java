package src;

import java.util.List;
import java.util.Map;

/**
 * @author arvindhvelrajan
 */
public class HelperMethods
{
	private static int callTimes = 0;

	public static void resetCallTimes()
	{
		callTimes = 0;
	}

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

	public static String formatStringArray(String[] array)
	{
		StringBuilder buff = new StringBuilder();
		buff.append("[");
		for(int i = 0; i < array.length; i++)
		{
			buff.append("\"").append(array[i]).append("\"");
			if(i != array.length - 1)
			{
				buff.append(", ");
			}
		}
		buff.append("]");
		return buff.toString();
	}

	public static String formatList(List list)
	{
		if (list.isEmpty()) {
			return "[]";
		}

		StringBuilder buff = new StringBuilder();
		buff.append("[");

		boolean isString = list.get(0) instanceof String;
		boolean isCharacter = list.get(0) instanceof Character;

		for (int i = 0; i < list.size(); i++)
		{
			if (isString)
			{
				buff.append("\"").append(list.get(i)).append("\"");
			}
			else if (isCharacter)
			{
				buff.append("'").append(list.get(i)).append("'");
			}
			else
			{
				buff.append(list.get(i));
			}

			if (i != list.size() - 1)
			{
				buff.append(", ");
			}
		}

		buff.append("]");
		return buff.toString();
	}

	public static <V> String mapToString(Map<String, V> map)
	{
		StringBuilder buff = new StringBuilder();
		buff.append("{");
		boolean first = true;
		for(Map.Entry<String, V> entry : map.entrySet())
		{
			if(!first)
			{
				buff.append(", ");
			}
			first = false;

			buff.append("\"").append(entry.getKey()).append("\": \"")
				.append(entry.getValue()).append("\"");
		}
		buff.append("}");
		return buff.toString();
	}
}
