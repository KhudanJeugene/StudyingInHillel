package withMain;

public class ASCIIToOut 
{
	public static void outASCII()
	{
		for (byte i=0; i<=126; i++)
			System.out.print(Character.toChars(i));
	}
	public static void main(String[] args) {
		outASCII();

	}

}
