package withMain;

public class Change3Symb
{
	public static void changeSymb(String[] s, int l)
	{
		if (s==null)
			throw new IllegalArgumentException();
		
		for (int i=0; i<s.length; i++)
		{			
			if (s[i].length()==l)
			{
				s[i] = s[i].substring(0, s[i].length()-3)+"$";
			}
		}
	}
	public static void main(String[] args)
	{
		int lenght = 4;
		String[] s ={ "����", "��", "��", "�����", "��", "������", "����"};
		changeSymb(s,lenght);
		for(String word :s)
		{
			System.out.print(word + " ");
		}
	}

}
