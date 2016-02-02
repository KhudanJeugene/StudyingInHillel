package withMain;

public class Car_2
{
	public static double calcDistance(double s, double t, double v1, double v2)
	{
		double res = 0;
		res = s + v1*t + v2*t;
		return res;
	}
	public static void main(String[] args)
	{
		double s = 10;
		double t = 1;
		double v1 = 100;
		double v2 = 100;
		double res = calcDistance(s, t, v1, v2);
		System.out.println(res);

	}

}
