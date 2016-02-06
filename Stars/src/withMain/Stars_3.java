package withMain;

public class Stars_3
{
	public static void outStars_3()
	{
		for (int i = 0; i <= 6; i++)
		{
			for (int j = 0; j <= 6; j++)
			{
				if (j==i || j==6-i)
					System.out.print("*");

				else 
					System.out.print(" ");
			}
			System.out.println();
		}
	}
	public static void main(String[] args)
	{
		outStars_3();
	}
}
