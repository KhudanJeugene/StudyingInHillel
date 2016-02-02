package mainMethods;
//������ ������, ������� �������� �����, 
//���������� �������� (0-999). �������� ���� �����
import java.util.Scanner;
import java.io.IOException;
import javax.swing.JOptionPane;
public class WordsToNumber_3
{
	private static String insertNumber() throws Exception
	{
		String input = null;
		try(Scanner in = new Scanner(JOptionPane.showInputDialog("������� ����� �������� ��� ������")))
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
