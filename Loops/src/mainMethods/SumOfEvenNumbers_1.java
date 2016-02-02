package mainMethods;
//Найти сумму четных чисел и их количество в диапазоне от 1 до 99
public class SumOfEvenNumbers_1
{
	public static void main(String[] args) throws Exception
	{		
		int sum = calcSum();
		System.out.println("Sum: " + sum);
		int count = calcCount();
		System.out.println("Count: " + count);
	}
	public static int calcSum()
	{	
		int sum =0; 		
		for (int i = 1; i<=99; i++)
		{
			if (i%2==0)
			{
				sum +=i;
			}		
		}
		return sum;
	}
	public static int calcCount()
	{		
		int count=0;
		for (int i = 1; i<=99; i++)
		{
			if (i%2==0)
			{
				count++;
			}		
		}
		return count;
	}
}
