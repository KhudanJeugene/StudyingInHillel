package mainMethods;
//сортировать массив методом минимального индекса элемента
public class SortSelect_9
{
	public static void main(String[] args)
	{
		int []arr = {20,-20,30,5};
		try
		{
		arr=sortSelect(arr);
		outArr(arr);
		}
		catch(IllegalArgumentException e)
		{
			System.out.println(e.getMessage());
		}
	}
	public static int[]sortSelect(int[]arr)
	{
		if (arr==null || arr.length==0)
		{
			throw new IllegalArgumentException();
		}
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
		System.out.println("The array after sorting");
		for(int i:arr) System.out.print(i +" ");
	}
}
