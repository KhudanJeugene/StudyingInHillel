package withMain;

public class DeleteSymbol
{
	public static String deleteSymbol(int n1, int n2, String str)
	{
		if(str==null || n1>=str.length() || n1+n2>=str.length())
			throw new IllegalArgumentException();
		
		StringBuilder result = new StringBuilder(str);
		result.delete(n1, n1+n2);
		return result.toString();
	}
	public static void main(String[] args)
	{
		String str = "Привет я ваша мама";
		System.out.println(str);
		int n1 = 2;
		int n2 = 4;
		str = deleteSymbol(n1,n2,str);
		System.out.println(str);

	}

}
