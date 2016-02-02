public class HW1
{
	public static int MultOrAdd(int a,int b)
	{
		int res = 0;
		if (a%2==0) 
		{
			res = a*b;
		}
		else 
		{
			res = a+b;	
		}
		return res;
	}

	public static int quater(int x, int y)
	{	
		int quater = 0;
		if (x==0 || y==0) 
		{
			throw new IllegalArgumentException();
		}
		if(x>0 && y>0) 
			quater = 1;

		else if(x<0 && y>0)
			quater = 2;

		else if(x<0 && y<0) 
			quater = 3;

		else if(x>0 && y<0) 
			quater = 4;

		return quater;
	}

	public static int doSum(int a, int b, int c)
	{	
		int sum = 0;
		if(a>0)			
			sum = sum + a;

		if(b>0)
			sum = sum +b;

		if (c>0)
			sum = sum +c;

		return sum;
	}
	public static int Calc(int a, int b, int c)
	{	
		int res = 0;
		int mult = a*b*c;
		int sum = a+b+c;

		if (mult > sum)
			res = mult+3;

		else 	
			res = sum+3;	
		return res;
	}

	public static char calcEval(int rat)
	{
		char eval = 0;
		if (rat<=0 || rat>=101)
		{
			throw new IllegalArgumentException();
		}

		if (rat>=1 && rat<=19)
		{
			eval = 'F';
		}
		else if (rat>=20 && rat<=39) 
		{
			eval = 'E';
		}
		else if (rat>= 0 && rat<=59) 
		{
			eval = 'D';		
		}
		else if (rat>=60 && rat<=74)
		{
			eval = 'C';
		}
		else if (rat>=75 &&rat <=89) 
		{
			eval = 'B';
		}
		else if (rat>=90 && rat<=100) 
		{
			eval = 'A';
		}	
		return eval;
	}
}
