package mainMethods;
//проверить простое ли число
public class PrimeNumber_2
{
	public static void main(String[] args)
	{
		int n = 17;
		boolean flag = true;		
		try
		{
			flag=findPrime(n);
			outRes(flag,n);
		} catch (Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
	public static boolean findPrime(int n)
	{	
		boolean flag=true;
		if (n>0)
		{	
			for (int i =2; i<n && i>=1; i++)
			{
				if (n%i==0)	
				{	
					flag = false;
					break;
				}		
			}
		}
		else if (n<=0)
		{
			throw new IllegalArgumentException();
		}
		return flag;
	}
	public static void outRes(boolean flag,int n)
	{
		if (flag) 
		{
			System.out.println("The number " + n + " is simple");
		}
		else 
		{
			System.out.println("The number " + n + " is not simple");
		}
	}
}
