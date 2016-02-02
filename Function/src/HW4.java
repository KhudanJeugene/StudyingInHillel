public class HW4
{
	public static String dayOfWeek(int day)
	{	
		if (day<1 || day>7)
		{
			throw new IllegalArgumentException();
		}

		String []week = {"","Mondey","Tuesday","Wednesday","Wednesday","Thursday","Friday","Saturday","Sunday"};

		return week[day];
	}

	public static String numberToWords(int n)
	{	
		String word="";
		if (n<0 || n>999) 
		{
			throw new IllegalArgumentException();
		}	
		if (n>=100 && n<1000) 
		{
			word =hundreds(n);
		}
		if (n>=20 &&n<=99)
		{
			word=decade(n);
		}
		if (n>=0 && n<=19)
		{
			word = one(n);
		}
		return word;
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

	public static int findInt(String number)
	{	
		int num=0;
		boolean flag = false; 
		if (number==null || number=="")
		{
			throw new IllegalArgumentException();
		}

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
				if (a.equalsIgnoreCase(numHandr[i]))
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
				if (a.equalsIgnoreCase(numDec[i]))
				{
					temp = i*10;
					flag = true;
					break;
				}
			}
		}
		if (true)
		{
			num += temp;
			temp = 0;
			flag = false;
		}

		for(String a:masNumber)
		{
			for (int i=0;i<numOne.length;i++)
			{
				if (a.equalsIgnoreCase(numOne[i]))
				{
					temp = i;
					flag = true;
				}
			}
		}
		if (flag) 
		{
			num += temp;	
		}

		return num;
	}

	public static double dist(int ax, int ay, int bx, int by)
	{
		double res = 0;
		res = Math.sqrt(Math.pow((bx-ax),2)+Math.pow((by-ay),2));
		return res;
	}
}
