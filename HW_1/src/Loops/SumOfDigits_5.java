package Loops;

public class SumOfDigits_5
{

	public static void main(String[] args)
	{
		int i = 123;
		int sum = 0;
		while(i!=0)
		{
			sum+=i%10;
			i/=10;
		}
			System.out.println(sum);
	}

}
