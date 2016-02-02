package mainMethods;
//отсортировать массив пузырьком
public class SortBubble_9
{	
	public static void main(String[] args)
	{			
		int []arr={3,1,6,-2,8,5};
		try
		{
			arr = sortBubble(arr);	
			outArr(arr);
		}
		catch(IllegalArgumentException e)
		{
			System.out.println(e.getMessage());
		}
	}
	public static int[]sortBubble(int[]arr)
	{
		if (arr==null || arr.length==0)
		{
			throw new IllegalArgumentException();
		}
		for (int i=0;i<arr.length-1;i++)
		{
			for (int j=0;j<arr.length-i-1;j++)
			{
				if(arr[j]>arr[j+1])
				{
					int t = arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=t;
				}
			}
		}
		return arr;
	}
	public static void outArr(int[]arr)
	{
		System.out.println("The array after sorting");
		for (int a:arr) System.out.print(a + " ");
	}
}
