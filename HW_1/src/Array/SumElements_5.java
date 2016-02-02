package Array;

public class SumElements_5
{

	public static void main(String[] args)
	{
		int [] arr = {7,4,6,8};
		int sum = 0;
		for (int i=0;i<arr.length;i++)
		{
			if (i%2!=0) sum+=arr[i];
		}
		System.out.println("sum equals " + sum);
	}

}
