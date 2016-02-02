package Array;

public class IndexOfMaxElement_4
{

	public static void main(String[] args)
	{
		int [] arr = {5,4,7,2,6};
		int max = arr[0];
		int ind=0;
		
		for (int i=0;i<arr.length;i++)
		{
			if (max<arr[i])
			{
				max=arr[i];
				ind = i;
			}
		}
		System.out.println("Index of MAX element of array is " +ind);
	}

}
