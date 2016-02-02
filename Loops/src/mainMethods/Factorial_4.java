package mainMethods;
//Вычислить факториал числа n. n! = 1*2*…*n-1*n;!
public class Factorial_4
{
	public static void main(String[] args)
	{
		int n=6;
		int fact=0;
		try{
			fact = factorial(n);
			System.out.println(fact);
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
	public static int factorial(int n)
	{
		int fact=1;
		if (n>0)
		{
			for (int i=n; i>0; i--)
			{
				fact*=i;
			}
		}
		else
		{
			throw new IllegalArgumentException();
		}
		return fact;
	}
}
