package conditionals;

public class AddPositiveNumbers_3
{

	public static void main(String[] args)
	{
	int a =0;
	int b=1;
	int c=-1;
	int sum = 0;
	if (a<0) sum=b+c;
	else if (b<0) sum =a+c;
	else if (c<0) sum =a+b;
	else sum = a+b+c;
	System.out.println("Sum of positive numbers is: " + sum);

	}

}
