package mainMethods;
import java.io.IOException;
import java.util.Scanner;
import javax.swing.JOptionPane;
//Получить строковое название дня недели по номеру дня. 
public class DayOfWeek_1 {
	private static int inputDay() throws IOException
	{
		int nDay =0;
		try(Scanner n = new Scanner(JOptionPane.showInputDialog("Input number")))
		{
			nDay = n.nextInt();
		}
		return nDay;

	}
	public static String dayOfWeek(int day)
	{	
		String dayW = null;
		if (day<1 || day>7)
		{
			throw new IllegalArgumentException();
		}
		else
		{
			String []week = new String[7];
			week[0]="Mondey";
			week[1]="Tuesday";
			week[2]="Wednesday";	
			week[3]="Thursday";	
			week[4]="Friday";
			week[5]="Saturday";
			week[6]="Sunday";

			switch (day)
			{
				case 1: 
				{
					dayW = week[0];
					break;
				}
				case 2: 
				{
					dayW = week[1];
					break;
				}
				case 3: 
				{
					dayW = week[2];
					break;
				}
				case 4: 
				{
					dayW = week[3];
					break;
				}
				case 5: 
				{
					dayW = week[4];
					break;
				}
				case 6: 
				{
					dayW = week[5];
					break;
				}
				case 7: 
				{
					dayW = week[6];
					break;
				}
			}
		}
		return dayW;
	}
	private static void outDay(String d)
	{
		System.out.println("Day of week: " + d);
	}
	public static void main(String[] args) 
	{	
		int nDay = 0;
		try
		{
			nDay = inputDay();	
		}
		catch(IOException e)
		{
			System.out.println(e.getMessage());
		}
		String dayW = ""; 
		try
		{
			dayW = dayOfWeek(nDay);
		}
		catch (Exception e)
		{
			System.out.println(e.getMessage());
		}
		outDay(dayW);
	}	
}
