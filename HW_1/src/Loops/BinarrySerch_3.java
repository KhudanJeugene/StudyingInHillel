package Loops;

public class BinarrySerch_3
{
	public static void main (String []args)
	{
		int n =10;
		int mid;
		int left = 0;
		int right = n;
		int root = 0;
		while (root*root<=n)
		{
			mid = left+(right -left)/2;
			if (mid*mid==n)
			{
				root = mid;
				break;
			}
			else if (mid*mid >n) right = mid;
			else left = mid;
			if (right - left ==1)
			{
				root =left;
				break;
			}
			}
		System.out.println("Root of the number: " + root);
	}
}
