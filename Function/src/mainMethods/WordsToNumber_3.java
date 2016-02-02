package mainMethods;
//Вводим строку, которая содержит число, 
//написанное прописью (0-999). Получить само число
import java.util.Scanner;
import java.io.IOException;
import javax.swing.JOptionPane;
public class WordsToNumber_3
{
	private static String insertNumber() throws Exception
	{
		String input = null;
		try(Scanner in = new Scanner(JOptionPane.showInputDialog("Введите число прописью без ошибок")))
		{
			input = in.nextLine();
		}
		return input;
	}
	public static int findInt(String number)
	{	
		int num=0;
		boolean flag = false; 
		if (number==null)
		{
			throw new IllegalArgumentException();
		}
		else
		{
			String [] masNumber = number.trim().split("\\s+");
			int temp = 0;
			String []numHandr = new String[10];
			numHandr[1]="сто";
			numHandr[2]="двести";
			numHandr[3]="триста";
			numHandr[4]="четыреста";
			numHandr[5]="пятьсот";
			numHandr[6]="шестьсот";
			numHandr[7]="семьсот";
			numHandr[8] = "восемьсот";
			numHandr[9]= "девятьсот";
			String []numDec = new String[100];
			numDec[2] = "двадцать";
			numDec[3]= "тридцать";
			numDec[4]= "сорок";
			numDec[5]="пятьдесят";
			numDec[6]="шестьдесят";
			numDec[7]="семьдесят";
			numDec[8]="восемьдесят";
			numDec[9]="девяносто";
			String [] numOne = new String[20];
			numOne[0] ="ноль";
			numOne[1] ="один";
			numOne[2] ="два";
			numOne[3] ="три";
			numOne[4] ="четыре";
			numOne[5]="пять";
			numOne[6]="шесть";
			numOne[7]="семь";
			numOne[8]="восемь";
			numOne[9]="девять";
			numOne[10]="десять";
			numOne[11]="одиннадцать";
			numOne[12]="двенадцать";
			numOne[13]="тринадцать";
			numOne[14]="четырнадцать";
			numOne[15]="пятнадцать";
			numOne[16]="шестнадцать";
			numOne[17]="семнадцать";
			numOne[18]="восемнадцать";
			numOne[19]="девятнадцать";
			for (String a:masNumber){
				for (int i=0;i<numHandr.length;i++)
				{
					if (a.equals(numHandr[i]))
					{
						temp = i*100;
						flag = true;
						break;
					}
				}
			}
			if (true) 
			{
				num +=temp;	
				temp =0;
				flag = false;
			}
			for(String a:masNumber)
			{
				for (int i=0;i<numDec.length;i++)
				{
					if (a.equals(numDec[i]))
					{
						temp = i*10;
						flag = true;
						break;
					}
				}
			}
			if (true)
			{
				num+=temp;
				temp =0;
				flag = false;
			}

			for(String a:masNumber)
			{
				for (int i=0;i<numOne.length;i++)
				{
					if (a.equals(numOne[i]))
					{
						temp = i;
						flag = true;
					}
				}
			}
			if (flag) 
			{
				num+=temp;	
			}
		}	
		return num;
	}
	public static void main(String[] args)
	{	
		String text = null;
		int num =0;
		try
		{
			text = insertNumber();
		} 
		catch(IOException e1)
		{
			System.out.println(e1.getMessage());
		}
		catch (Exception e)
		{
			System.out.println(e.getMessage());
		}
		try
		{
			num = findInt(text);
		}
		catch(IllegalArgumentException e2)
		{
			System.out.println(e2.getMessage());
		}
		System.out.println(num);
	}

}
