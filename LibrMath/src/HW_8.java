public class HW_8
{
	public static double distanceGrad(double speed, double angle )
	{	
		if( speed<0 || angle<0)
			throw new IllegalArgumentException();

		speed = speed*60/1000;
		double distance = 0;
		distance = (Math.pow (speed,2) * Math.sin(Math.toRadians(2*angle))/ 9.8);
		return distance;
	}
	public static double distanceRad(double speed, double rad )
	{	
		if(speed<0 || rad<0)
			throw new IllegalArgumentException();

		speed = speed*60/1000;
		double distance = 0;
		distance = (Math.pow (speed,2) * Math.sin(2*rad)/ 9.8);
		return distance;
	}

	public static double calcDistance(double s, double t, double v1, double v2)
	{	
		if(s<0 || t<0 || v1<0 || v2<0)
			throw new IllegalArgumentException();

		double res = 0;
		res = s + v1*t + v2*t;
		return res;
	}

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

	public static double calcExpression(double x)
	{
		double res = 0;
		double a = 6*Math.log(Math.sqrt(Math.pow(Math.E, x+1)+2*Math.pow(Math.E, x)*Math.cos(x)));
		double b = Math.log(x-Math.pow(Math.E, x+1)*Math.sin(x));
		double c = Math.abs(Math.cos(x)/Math.pow(Math.E, Math.sin(x)));
		res = a/b+c;
		return res;
	}
}
