package mainMethods;
//Найти минимальный элемент массива
public class MinElement_1
{
	public static void main(String [] args)
	{
		int[] arr = null;
		try
		{
			int min=findMin(arr);		
			System.out.println("Min element of the array is " +min);
		}
		catch(IllegalArgumentException e)
		{
			System.out.println(e.getMessage());
		}
	}
	public static int findMin(int[]arr)
	{	
		if (arr==null || arr.length==0)
		{
			throw new IllegalArgumentException();
		}

		int min=arr[0];
		for (int i=0; i<arr.length; i++)
		{
			if (min>arr[i])
			{
				min=arr[i];
			}
		}
		return min;

	}	
}
