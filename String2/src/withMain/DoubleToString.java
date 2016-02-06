package withMain;

public class DoubleToString
{
	public static String doubleToString(double d)
	{
		String res = String.valueOf(d);
		return res;	
	}
	public static void main(String[] args)
	{
		String res = doubleToString(555);
		System.out.println(res);

	}

}
