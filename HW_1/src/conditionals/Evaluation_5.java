package conditionals;


public class Evaluation_5
{

	public static void main(String[] args)
	{
		int rat = 5;
		char eval= '0';
		
		if (rat>=0 && rat <20) eval = 'F';
		else if (rat >=20 && rat <40) eval = 'E';
		else if (rat >=40 && rat <60) eval = 'D';
		else if (rat >=60 && rat <75) eval = 'C';
		else if (rat >=75 && rat <90) eval = 'B';
		else if (rat >=90 && rat <=100) eval = 'A';
		else System.out.println("An invalid value");
		System.out.println("Students raking: " + eval);

	}

}
