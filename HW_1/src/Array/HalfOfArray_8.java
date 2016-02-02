package Array;

public class HalfOfArray_8
{

	public static void main(String[] args)
	{
		int []arr = {1,3,5,7,9,11,13};
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
		for(int i:arr){
			System.out.print(i + " ");
		}
	}

}
