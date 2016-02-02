package Array;

public class MaxElement_2
{

	public static void main(String[] args)
	{
		int []arr= {6, 8, 15, -15, 30};
		int max=arr[0];
		for (int a :arr)
		{
			max= max<a?a:max;
		}
			System.out.println("MAX element of array is " +max);
	}

}
