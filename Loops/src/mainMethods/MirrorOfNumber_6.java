package mainMethods;
//¬ывести число, которое €вл€етс€ зеркальным отображением 
//последовательности цифр заданного числа, например, задано число 123, вывести 321.
public class MirrorOfNumber_6
{
	public static void main(String[] args)
	{
		int n = -1532;
		int res =mirror(n);
		System.out.println(res);
	}
	public static int mirror(int n)
	{	
		boolean flag = false;
		if (n<0)
		{
			n=Math.abs(n);
			flag = true;
		}
		int res=0;
		if (n==0) 
		{
			res=n;
		}
		while (n!=0)
		{
			res+=n%10;
			n/=10;
			if (n!=0) 
			{
				res*=10;
			}
		}
		if (flag)
		{
			res = -res;
		}
		return res;	
	}
}
