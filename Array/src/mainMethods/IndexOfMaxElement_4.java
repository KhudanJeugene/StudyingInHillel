package mainMethods;
//найти индекс максимального элемента массива
public class IndexOfMaxElement_4
{
	public static void main(String[] args)
	{
		int [] arr = {5,4,7,2,6};
		try
		{
			int ind = maxInd(arr);
			System.out.println("Index of MAX element of array is " +ind);
		}
		catch(IllegalArgumentException e)
		{
			System.out.println(e.getMessage());
		}
	}
	public static int maxInd(int []arr)
	{
		if (arr==null || arr.length==0) 
		{
			throw new IllegalArgumentException();
		}
		int ind = 0;

		for (int i=0; i<arr.length; i++)
		{
			if (arr[ind]<arr[i])
			{
				ind = i;
			}
		}
		return ind;
	}
}
