package mainMethods;
//1. Если а – четное посчитать а*б, иначе а+б
public class MultiplyOrAdd_1
{
	public static void main(String[] args)
	{
		int a=1;
		int b=6;
		int res = doOperation(a,b);
		System.out.println(res);
	}
	public static int doOperation(int a,int b)
	{
		int res = 0;
		if (a%2==0) 
		{
			res=a*b;
		}
		else 
		{
			res = a+b;	
		}
		return res;

	}
}
