package withMain;

public class DeleteLastWord
{
	public static String deleteLastWord(String str)
	{
		if(str==null)
			throw new IllegalArgumentException();
		
		str = str.trim().replaceAll("\\s\\S*$", "");
		return str;
	}
	public static void main(String[] args)
	{
		String str = "Я пойду гулять";
		System.out.println(str);
		str = deleteLastWord(str);
		System.out.println(str);

	}

}
