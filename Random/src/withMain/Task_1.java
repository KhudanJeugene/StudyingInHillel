package withMain;
//Вывести на консоль случайное число
import java.util.Random;
public class Task_1 {
	public static void rand_1()
	{
		Random random = new Random();
		System.out.println(random.nextInt());
	}
	public static void main(String[] args) 
	{
		rand_1();
	}
}
