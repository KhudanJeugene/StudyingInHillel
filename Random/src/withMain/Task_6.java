package withMain;
//Вывести на консоль случайное количество (в диапазоне от 3 до 15) 
//случайных чисел, каждое в диапазоне от -10 до 35
import java.util.Random;
public class Task_6
{
	public static void rand_6()
	{
		Random random = new Random();
		for(int i=0; i<3 + random.nextInt(16-3); i++)
		{
			System.out.print(random.nextInt(46-10)-10+ " ");
		}
	}
	public static void main(String[] args)
	{
		rand_6();
	}
}
