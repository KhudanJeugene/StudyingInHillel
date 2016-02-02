package mainMethods;
//найти индекс минимального элемента массива
public class IndexOfMinElement_3
{
	public static void main(String[] args)
	{
		int[] arr = {5,7,2,3,8};
		try
		{
			int ind=minInd(arr);
			System.out.println("Index of MIN element of the array is " +ind);
		}
		catch(IllegalArgumentException e)
		{
			System.out.println(e.getMessage());
		}
	}
	public static int minInd(int []arr)
	{
		if (arr==null || arr.length==0) 
		{
			throw new IllegalArgumentException();
		}
		int ind=0;
		for (int a=0;a<arr.length;a++)
		{
			if (arr[ind]>arr[a])
			{
				ind = a;
			}
		}
		return ind;
	}
}
