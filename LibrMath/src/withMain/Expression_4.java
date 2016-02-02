package withMain;

public class Expression_4
{
	public static double calcExpression(double x)
	{
		double res = 0;
		double a = 6*Math.log(Math.sqrt(Math.pow(Math.E, x+1)+2*Math.pow(Math.E, x)*Math.cos(x)));
		double b = Math.log(x-Math.pow(Math.E, x+1)*Math.sin(x));
		double c = Math.abs(Math.cos(x)/Math.pow(Math.E, Math.sin(x)));
		res = a/b+c;
		return res;
	}
	public static void main(String[] args)
	{
		double x = 100;
		double res = calcExpression(x);
		System.out.println(res);

	}

}
