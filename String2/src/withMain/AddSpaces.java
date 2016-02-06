package withMain;

public class AddSpaces
{
	public static String addSpaces(String str)
	{
		if (str==null)
			throw new IllegalArgumentException();
		
		String mark = ".,?!:;";
		StringBuilder result = new StringBuilder();
		boolean flag = false;
		for(int i=0; i<str.length(); i++)
		{
			char ch = str.charAt(i);
			if (mark.indexOf(ch)!=-1)
			{
				flag = true;
			}
			else 
			{
				if(ch!=' ' && flag)
				{
					result.append(' ');			
				}
				flag = false;
			}
			result.append(ch);
		}
		return str = result.toString();
	}
	public static void main(String[] args)
	{
		String str ="Исходная..строка, куда нужно,добавить пробелы!";
		System.out.println(str);
		str = addSpaces(str);
		System.out.println(str);
	}

}
