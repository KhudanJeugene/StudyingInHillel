package withMain;
//������� �� ������� 10 ��������� �����, ������ � ��������� �� 20 �� 50
import java.util.Random;
public class Task_4
{
	public static void rand_4()
	{
		Random random = new Random();
		for(int i =0; i<10; i++)
		{
			System.out.print(20 + random.nextInt(51-20) + " ");
		}
	}
	public static void main(String[] args)
	{
		rand_4();
	}
}
