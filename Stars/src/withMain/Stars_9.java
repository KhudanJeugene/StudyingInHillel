package withMain;

public class Stars_9
{
	public static void outStars_9()
	{
		for (int i = 0; i <= 6; i++)
		{
			for (int j = 0; j <=6; j++)
			{
				if(j<=3 && (j==0 || j==i || j==6-i))
					System.out.print("*");

				else 
					System.out.print(" ");
			}
			System.out.println();
		}
	}
	public static void main(String[] args)
	{
		outStars_9();
	}
}
