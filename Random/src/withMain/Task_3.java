package withMain;
//������� �� ������� 10 ��������� �����, ������ � ��������� �� 0 �� 10
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
