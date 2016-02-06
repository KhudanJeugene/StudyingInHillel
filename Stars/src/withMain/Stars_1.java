package withMain;

public class Stars_1 
{
	public static void outStars_1()
	{
		for (int i=0; i<7; i++)
		{
			for(int j=0; j<7; j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) 
	{
		outStars_1();
	}
}
