package withMain;

public class Stars_6
{
	public static void outStars_6()
	{
		for (int i = 0; i <= 6; i++)
		{
			for (int j = 0; j <= 6; j++)
			{
				if(j==6 || i==6 || j==6-i)
					System.out.print("*");

				else 
					System.out.print(" ");
			}
			System.out.println();
		}
	}
	public static void main(String[] args)
	{
		outStars_6();
	}
}
