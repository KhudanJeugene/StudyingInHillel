package Array;

public class MinElement_1
{
	
	public static void main(String [] args)
	{
		int[] arr = {5,7,2,3,8};
		int min=arr[0];
	
		for (int a:arr)
			{
				min = a>min?min:a;
			}
		System.out.println("Min element of the array is " +min);
	}
	
}
