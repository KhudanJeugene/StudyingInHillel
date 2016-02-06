package withMain;

public class Stars_8
{
	public static void outStars_8()
	{
		for (int i = 0; i <= 6; i++)
		{
			for (int j = 0; j <= 6; j++)
			{
				if (i<=3 && (i==j || j==6-i || i==0))
					System.out.print("*");

				else 
					System.out.print(" ");
			}
			System.out.println();
		}
	}
	public static void main(String[] args)
	{
		outStars_8();
	}
}
