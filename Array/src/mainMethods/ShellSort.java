package mainMethods;

public class ShellSort
{
	public static void sortShell(int[] ar)
	{
		int step = ar.length;
		while(step>0)
		{
			for (int i = 0; i < (ar.length - step); i++)
			{
				int j = i;
				while (j >= 0 && ar[j] > ar[j + step])
				{
					int temp = ar[j];
					ar[j] = ar[j + step];
					ar[j + step] = temp;
					j--; 
				}
			}
			step = step / 2;
		}
	}

	public static void main(String[] args)
	{
		int[] ar = {22,33,4,14,5};
		sortShell(ar);
		for(int i: ar)
		{
			System.out.print(i + " ");
		}

	}

}
