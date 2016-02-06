package withMain;

public class ShortWord
{
	public static int findShort(String s)
	{
		if (s==null)
			throw new IllegalArgumentException();
		
		String [] arrs = s.split("[\\s.,?!�]+");
		int minword = arrs[0].length();
		for (String word: arrs)
		{
			if(minword>word.length())
				minword = word.length();
		}
		return minword;
	}
	public static void main(String[] args)
	{
		try
		{
		int res = findShort("������!! �! ���� ����");
		System.out.println(res);
		}
		catch(IllegalArgumentException e)
		{
			System.out.println(e.getMessage());
		}
	}
}
