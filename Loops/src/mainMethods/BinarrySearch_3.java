package mainMethods;
//Найти корень натурального числа с точностью до целого (бинарный поиск)
public class BinarrySearch_3
{
	public static void main (String []args)
	{
		int n =5;
		int root=0;
		try {
			root = findRootBin(n);
			System.out.println("Root of the number: " + root);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	public static int findRootBin(int n)
	{	
		int root=0;
		int mid;
		int left = 0;
		int right = n;
		if (n>=0)
		{
			while (root*root<=n)
			{
				mid = left+(right -left)/2;
				if (mid*mid==n)
				{
					root = mid;
					break;
				}
				else if (mid*mid >n) 
				{
					right = mid;
				}
				else 
				{
					left = mid;
				}
				if (right - left ==1)
				{
					root =left;
					break;
				}
			}
		}
		else 
			throw new IllegalArgumentException();
		return root;
	}
}
