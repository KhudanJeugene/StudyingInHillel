package mainMethods;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class NumberToWordsBill
{
	public static String numberConvert(long num)
	{
		String res = "";
		return res;
	}
	private static long inputNum()
	{	
		long num = -1;
		try(Scanner in =new Scanner(JOptionPane.showInputDialog("Input number 0-999,999,999,999")))
		{
			num = in.nextInt();
		}
		return num;
	}
	public static void main(String[] args)
	{
		long in = inputNum();
		String res = numberConvert(in);
		System.out.println(res);
		

	}

}
