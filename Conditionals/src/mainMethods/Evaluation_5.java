package mainMethods;
//Написать программу определения оценки студента по его рейтингу
public class Evaluation_5
{
	public static void main(String[] args)
	{
		int rat = 5;
		char eval= '0';		
		try
		{
			eval = calcEval(rat);
			System.out.println("Students raking: " + eval);
		}
		catch (Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
	public static char calcEval(int rat)
	{
		char eval = 0;
		if (rat>=1 && rat<=19)
		{
			eval = 'F';
		}
		else if (rat>=20 && rat<=39) 
		{
			eval = 'E';
		}
		else if (rat>= 0 && rat<=59) 
		{
			eval = 'D';		
		}
		else if (rat>=60 && rat<=74)
		{
			eval = 'C';
		}
		else if (rat>=75 &&rat <=89) 
		{
			eval = 'B';
		}
		else if (rat>=90 && rat<=100) 
		{
			eval = 'A';
		}
		else 
			throw new IllegalArgumentException();
		return eval;
	}
}	
