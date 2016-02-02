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
		num[1]="���";
		num[2]="������";
		num[3]="������";
		num[4]="���������";
		num[5]="�������";
		num[6]="��������";
		num[7]="�������";
		num[8] = "���������";
		num[9]= "���������";
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
		num[2] = "��������";
		num[3]= "��������";
		num[4]= "�����";
		num[5]="���������";
		num[6]="����������";
		num[7]="���������";
		num[8]="�����������";
		num[9]="���������";
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
		num[0] ="����";
		num[1] ="����";
		num[2] ="���";
		num[3] ="���";
		num[4] ="������";
		num[5]="����";
		num[6]="�����";
		num[7]="����";
		num[8]="������";
		num[9]="������";
		num[10]="������";
		num[11]="�����������";
		num[12]="����������";
		num[13]="����������";
		num[14]="������������";
		num[15]="����������";
		num[16]="�����������";
		num[17]="����������";
		num[18]="������������";
		num[19]="������������";
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
		numHandr[1]="���";
		numHandr[2]="������";
		numHandr[3]="������";
		numHandr[4]="���������";
		numHandr[5]="�������";
		numHandr[6]="��������";
		numHandr[7]="�������";
		numHandr[8] = "���������";
		numHandr[9]= "���������";
		String []numDec = new String[100];
		numDec[2] = "��������";
		numDec[3]= "��������";
		numDec[4]= "�����";
		numDec[5]="���������";
		numDec[6]="����������";
		numDec[7]="���������";
		numDec[8]="�����������";
		numDec[9]="���������";
		String [] numOne = new String[20];
		numOne[0] ="����";
		numOne[1] ="����";
		numOne[2] ="���";
		numOne[3] ="���";
		numOne[4] ="������";
		numOne[5]="����";
		numOne[6]="�����";
		numOne[7]="����";
		numOne[8]="������";
		numOne[9]="������";
		numOne[10]="������";
		numOne[11]="�����������";
		numOne[12]="����������";
		numOne[13]="����������";
		numOne[14]="������������";
		numOne[15]="����������";
		numOne[16]="�����������";
		numOne[17]="����������";
		numOne[18]="������������";
		numOne[19]="������������";
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
