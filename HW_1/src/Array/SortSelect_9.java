package Array;

public class SortSelect_9
{
	public static void main(String[] args)
	{
		int []arr = {20,-20,30,5};
		arr=sortSelect(arr);
		outArr(arr);
	}
	public static int[]sortSelect(int[]arr)
	{
		for (int i=0;i<arr.length-1;i++)
		{
			int min =i;
			for(int j=i+1;j<arr.length;j++)
			{
				if (arr[j]<arr[min]) min=j;
			}
			int temp = arr[i];
			arr[i]=arr[min];
			arr[min]=temp;
		}
		return arr;
	}
	public static void outArr(int[]arr)
	{
		System.out.println("\nThe array after sorting");
		for(int i:arr) System.out.print(i +" ");
	}
}
