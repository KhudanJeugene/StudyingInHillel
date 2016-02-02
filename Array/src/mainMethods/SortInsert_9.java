package mainMethods;
//сортировать массив вставками
public class SortInsert_9
{
	public static void main(String[] args)
	{
		int []arr = {-5,-10,20,10,5};	
		try
		{
		arr=sortIns(arr);
		outArr(arr);
		}
		catch(IllegalArgumentException e)
		{
			System.out.println(e.getMessage());
		}
	}
	public static int[]sortIns(int[]arr)
	{
		if (arr==null || arr.length==0)
		{
			throw new IllegalArgumentException();
		}
		for(int i=1;i<arr.length;i++)
		{
			int prev=i-1;
			int curEl=arr[i];
			while(prev>=0&&arr[prev]>curEl)
			{
				arr[prev+1]=arr[prev];
				arr[prev]=curEl;
				prev--;				
			}
		}
		return arr;
	}
	public static void outArr(int[]arr)
	{
		System.out.println("The array after sorting");
		for(int i:arr)System.out.print(i + " ");
	}
}
