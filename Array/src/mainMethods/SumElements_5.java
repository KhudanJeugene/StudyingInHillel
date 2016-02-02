package mainMethods;
//Посчитать сумму элементов массива с нечетными индексами
public class SumElements_5
{
	public static void main(String[] args)
	{
		int [] arr = {7,4,6,8};
		try
		{
			int sum = sumOddEl(arr);
			System.out.println("sum equals " + sum);
		}
		catch(IllegalArgumentException e)
		{
			System.out.println(e.getMessage());
		}
	}
	public static int sumOddEl(int [] arr)
	{	
		if(arr==null || arr.length==0)
		{
			new IllegalArgumentException();
		}
		int sum = 0;
		for (int i=0; i<arr.length; i++)
		{
			if (i%2!=0) 
			{
				sum += arr[i];
			}
		}
		return sum;
	}
}
