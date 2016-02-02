package withMain;

public class PointIn_3
{
	public static boolean checkPoint(double x, double y)
	{
		boolean answer = false;
		double a;
		double b;
		double c;
		if( x>=0 )
		{
			a = (0-x)*(-1);
			b = (0-x)*3-(2)*(-1-y);
			c = (2-x)*(-2)-(-2)*(2-y);
		}
		else
		{
			a = (0-x)*(-1);
			b = (0-x)*3-(-2)*(-1-y);
			c = (-2-x)*(-2)-(2)*(2-y);
		}
		if (a >=0 && b>=0 && c>=0)
			answer = true;
		
		if (a<=0 && b<=0 && c<=0)
			answer = true;
		return answer;
	}
	public static void main(String[] args)
	{
		double x = 0;
		double y = -1;
		boolean b = checkPoint(x,y);
		System.out.println(b);

	}

}
