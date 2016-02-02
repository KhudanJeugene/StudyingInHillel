package mainMethods;
//Сделать реверс массива (массив в обратном направлении)
public class ReverseArray_6
{
	public static void main(String[] args)
	{
		int[] arr = {1,2,3,4};
		try
		{
			arr=reverse(arr);
			outArr(arr);
		}
		catch(IllegalArgumentException e)
		{
			System.out.println(e.getMessage());
		}
	}
	public static int[] reverse(int[]arr)
	{	
		if(arr==null || arr.length==0)
		{
			throw new IllegalArgumentException();
		}
		int[] brr = new int[arr.length];
		int a = 0;
		for (int i=arr.length-1 ;i>=0; i--)
		{
			brr[a++] = arr[i];
		}
		arr = brr;
		return arr;
	}
	private static void outArr(int[]arr)
	{
		for (int i:arr)
		{
			System.out.print(i + " ");
		}
	}
}
