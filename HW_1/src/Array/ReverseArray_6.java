package Array;

public class ReverseArray_6
{

	public static void main(String[] args)
	{
		int[] arr = {1,2,3,4};
		int[] brr = new int[arr.length];
		int a = 0;
		for (int i=arr.length-1;i>=0;i--)
		{
			brr[a++]=arr[i];
		}
		arr=brr;
		for (int i:arr)
		{
			System.out.print(i + " ");
		}
	}

}
