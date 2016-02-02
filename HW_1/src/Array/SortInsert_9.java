package Array;

public class SortInsert_9
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
		System.out.println("\nThe array after sorting");
		for(int i:arr)System.out.print(i + " ");
	}

}
