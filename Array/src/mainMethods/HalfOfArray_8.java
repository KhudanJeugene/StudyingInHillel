package mainMethods;
//ѕомен€ть местами первую и вторую половину 
//массива, например, дл€ массива 1 2 3  4, результат 3 4 1 2
public class HalfOfArray_8
{
	public static void main(String[] args)
	{
		int []arr = {1,3,5,7,9,11,13};
		try
		{
			arr=reverseArr(arr);
			outArr(arr);
		}
		catch(IllegalArgumentException e)
		{
			System.out.println(e.getMessage());
		}
	}
	public static int[] reverseArr(int[] arr)
	{
		if(arr==null || arr.length==0)
		{
			throw new IllegalArgumentException();
		}
		int [] tempArr = new int[arr.length];
		int c =0;
		for (int i=arr.length/2;i<arr.length;i++)
		{
			tempArr[c]=arr[i];
			c++;
		}
		for (int i=0;i<arr.length/2;i++)
		{
			tempArr[c]=arr[i];
			c++;
		}
		arr = tempArr;
		return arr;
	}
	public static void outArr(int[]arr)
	{
		for(int i:arr){
			System.out.print(i + " ");
		}
	}
}
