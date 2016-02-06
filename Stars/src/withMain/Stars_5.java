package withMain;

public class Stars_5
{
	public static void outStars_5()
	{
		for (int i = 0; i <= 6; i++)
		{
			for (int j = 0; j <= 6; j++)
			{
				if(j==0 || i==6 || j==i)
					System.out.print("*");

				else 
					System.out.print(" ");
			}
			System.out.println();
		}
	}
	public static void main(String[] args)
	{
		outStars_5();
	}
}
