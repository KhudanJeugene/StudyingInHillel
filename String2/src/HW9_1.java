public class HW9_1 {
	public static void outAlphabet()
	{
		for (char a='A'; a<='Z'; a++)
			System.out.print(a + " ");
	}

	public static void outz_a()
	{
		for( char i='z'; i>='a'; i--)
			System.out.print(i + " ");
	}

	public static void russAlph()
	{
		for(char i='à'; i<='ÿ'; i++)
			System.out.print(i + " ");
	}

	public static void outNumbers()
	{
		for(char i='0'; i<='9'; i++)
			System.out.print(i + " ");
	}

	public static void outASCII()
	{
		for (byte i=32; i<=126; i++)
			System.out.print(Character.toChars(i));
	}
}
