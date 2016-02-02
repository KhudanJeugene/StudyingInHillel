package mainMethods;
//Определить какой четверти принадлежит точка с координатами (х,у)

public class QuarterCoordinate_2
{

	public static void main(String[] args) throws Exception
	{
		int x=1;
		int y=2;

		System.out.println("  2 | 1  ");
		System.out.println("----|----");
		System.out.println("  3 | 4  ");
		try
		{
			int quater = coordEquals(x,y);
			System.out.println("Quater of the coordinate is: " +quater);
		}
		catch(IllegalArgumentException e){
			System.out.println(e);
		};

	}
	public static int coordEquals(int x, int y) throws Exception
	{	
		int quater =0;
		if(x>0 && y>0) 
		{
			quater=1;
		}
		else if(x<0 && y>0)
		{
			quater =2;
		}
		else if(x<0 && y<0) 
		{
			quater =3;
		}
		else if(x>0 && y<0) 
		{
			quater = 4;
		}
		if (x==0 || y==0) 
			throw new IllegalArgumentException("The lie in the line of the coordinate");
		return quater;
	}

}
