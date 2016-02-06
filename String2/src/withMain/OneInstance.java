package withMain;

public class OneInstance
{
	public static String oneInstance(String str)
	{
		if(str==null)
			throw new IllegalArgumentException();

		StringBuilder result = new StringBuilder();
		while(!str.isEmpty())
		{
			char ch = str.charAt(0);
			result.append(ch);
			str = str.replaceAll(ch + "+", "");
		}
		return str = result.toString();
	}
	public static void main(String[] args)
	{
		String str = "а море боли";
		str = oneInstance(str);
		System.out.println(str);

	}

}
