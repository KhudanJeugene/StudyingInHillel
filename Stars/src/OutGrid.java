public class OutGrid
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

	public static void outStars_7()
	{
		for (int i = 0; i <=6; i++)
		{
			for (int j = 0; j <= 6; j++)
			{
				if(i==0 || j==6 || j==i)
					System.out.print("*");

				else 
					System.out.print(" ");
			}
			System.out.println();
		}
	}

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

	public static void outStars_10()
	{
		for (int i = 0; i <= 6; i++)
		{
			for (int j = 0; j <=6; j++)
			{
				if(j>=3 && (j==6 || j==i || j==6-i))
					System.out.print("*");

				else 
					System.out.print(" ");
			}
			System.out.println();
		}
	}

	public static void outStars_11()
	{
		for (int i = 0; i <= 6; i++)
		{
			for (int j = 0; j <=6; j++)
			{
				if(i>=3 && (i==6 || j==i || j==6-i))
					System.out.print("*");

				else 
					System.out.print(" ");
			}
			System.out.println();
		}
	}

	public static void outNumbers_1()
	{
		for (int i = 0; i <= 6; i++)
		{
			for (int j = 0; j <=6; j++)
			{
				System.out.print(i+1);
			}
			System.out.println();
		}
	}

	public static void outNumbers_2()
	{
		for (int i = 0; i <= 6; i++)
		{
			for (int j = 0; j <=6; j++)
			{
				System.out.print(7-i);
			}
			System.out.println();
		}
	}

	public static void outNumbers_3()
	{
		for (int i = 0; i <= 6; i++)
		{
			for (int j = 0; j <=6; j++)
			{
				System.out.print(j+1);
			}
			System.out.println();
		}
	}

	public static void outNumbers_4()
	{
		for (int i = 0; i <= 6; i++)
		{
			for (int j = 0; j <=6; j++)
			{
				System.out.print(7-j);
			}
			System.out.println();
		}
	}
}
