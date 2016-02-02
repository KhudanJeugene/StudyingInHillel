package Loops;

public class MirrorOfNumber
{

	public static void main(String[] args)
	{
		int n = 1532;
		int i =0;
		if (n==0) System.out.println(n);
		while (n!=0)
		{
			i+=n%10;
			n/=10;
			if (n!=0) i*=10;
		}
			System.out.println(i);
	}

}
