package withMain;

public class Stars_2
{
	public static void outStars_2()
	{
		for (int i=0; i<7; i++)
		{
			for (int j=0; j<7; j++)
			{  
				if (i==0 || i==6 || j==0 || j==6)				
					System.out.print("*");

				else 
					System.out.print(" ");
			}
			System.out.println();
		}
	}
	public static void main(String[] args)
	{
		outStars_2();
	}
}
