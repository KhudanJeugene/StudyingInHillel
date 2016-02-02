import java.util.Random;

public class HW_5
{
	public static void rand_1()
	{
		Random random = new Random();
		System.out.println(random.nextInt());
	}

	public static void rand_2()
	{
		Random random = new Random();
		for(int i=0; i<10; i++)
		{
			System.out.print(random.nextInt() + " ");
		}
	}

	public static void rand_3()
	{
		Random random = new Random();
		for (int i=0; i<10; i++)
		{
			System.out.print(random.nextInt(11)+ " ");
		}
	}

	public static void rand_4()
	{
		Random random = new Random();
		for(int i =0; i<10; i++)
		{
			System.out.print(20 + random.nextInt(51-20) + " ");
		}
	}

	public static void rand_5()
	{
		Random random = new Random();
		for (int i=0; i<10; i++)
		{
			System.out.print(random.nextInt(21)-10 + " ");
		}
	}
	public static void rand_6()
	{
		Random random = new Random();
		for(int i=0; i<3 + random.nextInt(16-3); i++)
		{
			System.out.print(random.nextInt(46-10)-10+ " ");
		}
	}
}
