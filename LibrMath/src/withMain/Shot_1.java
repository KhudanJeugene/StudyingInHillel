package withMain;
public class Shot_1 {

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
	public static void main(String[] args)
	{
		double degree = 45;
		double rad = 0.785398;
		double begSpeed = 415.66;
		double res = distanceGrad(begSpeed,degree);
		System.out.println(res);
		res = distanceRad(begSpeed,rad);
		System.out.println(res);
	}	

}
