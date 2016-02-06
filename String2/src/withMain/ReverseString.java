package withMain;

public class ReverseString
{
	public static String reverseString(String str)
	{
		if (str==null)
			throw new IllegalArgumentException();

		StringBuilder result = new StringBuilder(str);
		result.reverse();
		return str = result.toString();
	}
	public static void main(String[] args)
	{
		String str = "אבגדהוזח";
		System.out.println(str);
		str = reverseString(str);
		System.out.println(str);

	}

}
