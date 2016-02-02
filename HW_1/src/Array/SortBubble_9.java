package Array;

public class SortBubble_9
{

	public static void main(String[] args)
	{
		int []arr = new int[10];		
		for (int i=9, k=0;i>=0;i--,k++)
		{
			arr[k]=i;
		}
		System.out.println("The source array");
		for(int a:arr) System.out.print(a+" ");
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
				System.out.println("\nThe array after sorting");
				for (int a:arr) System.out.print(a + " ");
			
	}

}
