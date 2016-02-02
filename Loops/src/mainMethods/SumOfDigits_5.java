package mainMethods;
//посчитать сумму цифр заданного числа
public class SumOfDigits_5
{
	public static void main(String[] args)
	{
		int i = -123;
		int sum = calc(i);		
		System.out.println(sum);
	}
	public static int calc(int i)
	{	
		if (i<0)
		{
			i = Math.abs(i);
		}
		int sum = 0;
		if (i==0) 
		{
			sum = i;
		}
		while(i!=0)
		{
			sum+= i%10;
			i/= 10;
		}
		return sum;
	}
}
