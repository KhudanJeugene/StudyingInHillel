package mainMethods;
//Посчитать количество нечетных элементов массива
public class CountOfOddNumber_7
{
	public static void main(String[] args)
	{
		int []arr = {1,3,5,7,9,11,8};
		try
		{
		int count = calcCount(arr);
		System.out.println("Count of odd elements: " + count);
		}
		catch(IllegalArgumentException e)
		{
			System.out.println(e.getMessage());
		}
	}
	public static int calcCount(int[]arr)
		{	
		if (arr==null || arr.length==0)
		{
			throw new IllegalArgumentException();
		}
		int	count=0;
			for (int i:arr)
			{
				if (i%2!=0) count++;
			}
			return count;
			}		
}
