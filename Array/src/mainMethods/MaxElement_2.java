package mainMethods;
//найти максимальный элемент массива
public class MaxElement_2
{
	public static void main(String[] args)
	{
		int []arr= {6, 8, 15, -15, 30};
		int max=findMax(arr);
			System.out.println("MAX element of array is " +max);
	}
	public static int findMax(int[]arr)
	{
		int max=arr[0];
		for (int i=0; i<arr.length; i++)
		{
			if (max<arr[i])
			{
				max=arr[i];
			}
		}
		return max;	
	}
}
