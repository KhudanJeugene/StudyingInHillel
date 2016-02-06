package withMain;

public class CountWord
{
	public static int countOfWord(String str)
	{
		int count = 0;
		if (str==null)
			throw new IllegalArgumentException();

		if (str.length()>0)
		{
			String[] arrStr;
			arrStr = str.split("\\s|\\,\\s|\\,");
			count = arrStr.length;
		}
		return count;
	}
	public static void main(String[] args)
	{
		String str = "������ � ���� ��� �����";
		int n = countOfWord(str);
		System.out.println(n);

	}

}
