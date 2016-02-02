package withMain;
//Вывести на консоль 10 случайных чисел, каждое в диапазоне от 0 до 10
import java.util.Random;
public class Task_3
{
	public static void rand_3()
	{
		Random random = new Random();
		for (int i=0; i<10; i++)
		{
			System.out.print(random.nextInt(11)+ " ");
		}
	}

	public static void main(String[] args)
	{
		rand_3();
	}
}
