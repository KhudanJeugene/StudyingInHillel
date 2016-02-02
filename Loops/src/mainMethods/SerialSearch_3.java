package mainMethods;
//Ќайти корень натурального числа с точностью до целого(последовательный подбор)
public class SerialSearch_3
{
	public static void main(String[] args)
	{
		int a = 17;
		int root=0;
		try {
			root = findRoot(a);
			System.out.println(root);
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	public static int findRoot(int n)
	{
		int i=0;
		if (n>=0)
		{
			for(i=0; i*i<=n; i++);
		}
		if (i*i>n)
		{
			i--;
		}
		else 
			throw new IllegalArgumentException();
		return i;
	}
}
