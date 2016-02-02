package mainMethods;
//Отсортировать массив Quick
public class QuickSort
{
	public static void main(String[] args)
	{
		int []arr={1,8,7,6,5,4,3,2,0};	
		try
		{
			arr =startSort(arr);
			outArr(arr);	
		}
		catch(IllegalArgumentException e)
		{
			System.out.println(e.getMessage());
		}
	}
	public static int[] startSort(int[]arr)
	{
		if (arr==null || arr.length==0)
		{
			throw new IllegalArgumentException();
		}
		int start = 0;
		int end = arr.length-1;
		doSort(start,end,arr);	
		return arr;
	}
	public static void doSort(int start,int end,int []arr)
	{
		int i=start,j=end; 
		if (i>j) return;
		int mid = arr[(start+end)/2];
		while(i<j)
		{
			while(arr[i]<mid)i++;
			while(arr[j]>mid)j--;
			if (i<=j)
			{
				int temp = arr[j];
				arr[j]=arr[i];
				arr[i]=temp;
				i++;j--;
			}
		}
		if(start<j) doSort(start,j,arr);
		if(i<end) doSort(i,end,arr);
	}
	public static void outArr(int[]arr)
	{
		for(int a:arr) System.out.print(a +" ");	
	}
}

