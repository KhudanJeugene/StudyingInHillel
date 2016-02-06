package withMain;

public class StringToDouble
{
	public static double stringToDouble(String s)
	{
		double res= 0;
		try
		{
		res = Double.parseDouble(s);
		}
		catch(NumberFormatException e)
		{		
		}
		return res;
	}
	public static void main(String[] args)
	{
		double res = stringToDouble("5");
		System.out.println(res);

	}

}
