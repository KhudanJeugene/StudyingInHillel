package withMain;

public class IntToString 
{
	public static String intToString(int i)
	{
		String res = "";
		try
		{
		res = String.valueOf(i);
		}
		catch(NumberFormatException e)
		{
			System.out.println(e.getStackTrace());
		}
		return res;
	}
	public static void main(String[] args) 
	{
		String res = intToString(-1);	
		System.out.println(res);
	}
}
