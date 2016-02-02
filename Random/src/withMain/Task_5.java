package withMain;
//Вывести на консоль 10 случайных чисел, каждое в диапазоне от -10 до 10
import java.util.Random;
public class Task_5
{
	public static void rand_5()
	{
		Random random = new Random();
		for (int i=0; i<10; i++)
		{
			System.out.print(random.nextInt(21)-10 + " ");
		}
	}
	public static void main(String[] args)
	{
		rand_5();	
	}
}
