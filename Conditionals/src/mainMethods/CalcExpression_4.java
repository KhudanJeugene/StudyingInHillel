package mainMethods;
//Посчитать выражение макс(а*б*с, а+б+с)+3
public class CalcExpression_4
{
	public static void main(String[] args)
	{
		int a=0;
		int b =2;
		int c =3;
		int res=Calc(a,b,c);
		System.out.println("Sum of positive numbers is: " +res);
	}
	public static int Calc(int a, int b, int c)
	{	
		int res=0;
		if (a*b*c>a+b+c)
		{
			res = a*b*c;
		}
		else 
		{
			res=a+b+c;
		}		
		return res+3;
	}
}
