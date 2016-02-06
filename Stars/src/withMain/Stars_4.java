package withMain;

public class Stars_4
{	
	public static void outStars_4()
	{
		for (int i = 0; i <= 6; i++)
		{
			for (int j = 0; j <= 6; j++)
			{
				if(i==0 || j==0 || j==6-i)
					System.out.print("*");
					
				else 
					System.out.print(" ");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args)
	{
		outStars_4();

	}

}
