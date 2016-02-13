package mainMethods;
import java.io.IOException;
import java.util.Scanner;
import javax.swing.JOptionPane;
//Вводим число (0-999), получаем строку с прописью числа.
public class NumberToWords
{	
	private static int inputNum()
	{	
		int num = -1;
		try(Scanner in =new Scanner(JOptionPane.showInputDialog("Input number 0-999")))
		{
			num = in.nextInt();
		}
		return num;
	}
	public static String hundreds(int n)
	{
		String word = "";
		String []num = new String[10];
		num[1]="Сто";
		num[2]="Двести";
		num[3]="Триста";
		num[4]="Четыреста";
		num[5]="Пятьсот";
		num[6]="Шестьсот";
		num[7]="Семьсот";
		num[8] = "Восемьсот";
		num[9]= "Девятьсот";
		word = num[n/100];
		if (n%100<20 && n%100!=0)
		{
			word +=" " + one(n%100);
		}
		else if (n%100!=0)
		{
			word +=" " + decade(n%100);
		} 
		return word;
	}
	public static String decade(int n)
	{	
		String word="";
		String []num = new String[10];
		num[2] = "Двадцать";
		num[3]= "Тридцать";
		num[4]= "Сорок";
		num[5]="Пятьдесят";
		num[6]="Шестьдесят";
		num[7]="Семьдесят";
		num[8]="Восемьдесят";
		num[9]="Девяносто";
		word = num[n/10];
		if (n%10!=0)
		{
			word+=" " +one(n%10);
		}
		return word;
	}
	public static String one(int n)
	{	
		String word="";
		String [] num = new String[20];
		num[0] ="Ноль";
		num[1] ="Один";
		num[2] ="Два";
		num[3] ="Три";
		num[4] ="Четыре";
		num[5]="Пять";
		num[6]="Шесть";
		num[7]="Семь";
		num[8]="Восемь";
		num[9]="Девять";
		num[10]="Десять";
		num[11]="Одиннадцать";
		num[12]="Двенадцать";
		num[13]="Тринадцать";
		num[14]="Четырнадцать";
		num[15]="Пятнадцать";
		num[16]="Шестнадцать";
		num[17]="Семнадцать";
		num[18]="Восемнадцать";
		num[19]="Девятнадцать";
		word = num[n];
		return word;
	}
	public static String numberToWords(int n)
	{	
		String word="";	
		if (n>999) 
		{
			throw new IllegalArgumentException();
		}
		if (n<0) 
		{
			word ="минус ";
			n/=-1;
		}
		
		if (n>=100 && n<1000) 
		{
			word +=hundreds(n);
		}
		if (n >= 20 && n <= 99)
		{
			word += decade(n);
		}
		if (n >= 0 && n <= 19)
		{
			word += one(n);
		}

		return word;
	}
	public static void main(String[] args) throws IOException
	{	
		int num =-1;
		String word;
		num = inputNum();
		try
		{
			word = numberToWords(num);
			System.out.println(word);
		}
		catch(IllegalArgumentException e)
		{
			System.out.println(e.getMessage());
		}
	}

}
