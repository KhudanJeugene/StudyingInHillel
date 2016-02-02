package Array;


public class CountOfOddNumber_7
{

	public static void main(String[] args)
	{
		int []arr = {1,3,5,7,9,11, 8};
		int count = 0;
		for (int i:arr)
		{
			if (i%2!=0) count++;
		}
		System.out.println("Count of odd elements: " + count);
	}

}
