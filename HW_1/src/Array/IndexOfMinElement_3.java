package Array;

public class IndexOfMinElement_3
{

	public static void main(String[] args)
	{
		int[] arr = {5,7,2,3,8};
		int min=arr[0];
		int ind=0;
		for (int a=0;a<arr.length;a++)
			{
				if (min>arr[a])
				{
					min=arr[a];
					ind = a;
				}
			}
		System.out.println("Index of MIN element of the array is " +ind);

	}

}
