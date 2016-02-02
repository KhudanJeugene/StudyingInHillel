package withMain;
//Вывести на консоль 10 случайных чисел
import java.util.Random;
public class Task_2 {
	public static void rand_2()
	{
		Random random = new Random();
		for(int i=0; i<10; i++)
		{
			System.out.print(random.nextInt() + " ");
		}
	}
	public static void main(String[] args) 
	{
		rand_2();
	}

}
