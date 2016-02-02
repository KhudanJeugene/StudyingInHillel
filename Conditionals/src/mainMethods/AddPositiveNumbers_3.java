package mainMethods;
//Найти сумму только положительных из трех чисел
public class AddPositiveNumbers_3
{
	public static void main(String[] args)
	{
	int a =-2;
	int b=-2;
	int c=-2;
	int sum=0;
	try
	{
		sum = doSum(a,b,c);
		System.out.println("Sum of positive numbers is: " + sum);
	}
	catch(Exception e)
	{
		System.out.println(e.getMessage());
	}
	}
	public static int doSum(int a, int b, int c)
	{	
		int sum=0;
		if(a>0)
			sum = sum + a;
		else if(b>0)
			sum = sum +b;
		else if (c>0)
			sum = sum +c;
		else 
			throw new IllegalArgumentException();
		return sum;
	}
}
