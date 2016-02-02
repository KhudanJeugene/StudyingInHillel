package Loops;

public class Factorial_4
{

	public static void main(String[] args)
	{
		int n=3;
		int fact=1;
		for (int i=n; i>0; i--)
		{
			fact*=i;
		}
		System.out.println("The factorial of the number " + n +" equals " +fact);
	}

}
