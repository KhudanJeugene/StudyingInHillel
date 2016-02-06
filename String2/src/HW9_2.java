public class HW9_2
{
	public static String intToString(int i)
	{
		String res = String.valueOf(i);
		return res;
	}

	public static String doubleToString(double d)
	{
		String res = String.valueOf(d);
		return res;	
	}

	public static int stringToInt(String s)
	{
		int res = 0;
		try
		{
			res = Integer.parseInt(s);
		}
		catch(NumberFormatException e)
		{
		}
		return res;
	}

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
}
