package conditionals;

public class QuarterCoordinate_2
{

	public static void main(String[] args)
	{
		int x=-1;
		int y=2;
		System.out.println("  4 | 1  ");
		System.out.println("----|----");
		System.out.println("  3 | 2  ");
		
		if(x>0 & y>0) System.out.println("The point is in 1 quarter of coordinate system");
		else if(x>0 & y<0) System.out.println("The point is in 2 quarter of coordinate system");
		else if(x<0 & y<0) System.out.println("The point is in 3 quarter of coordinate system");
		else if(x<0 & y>0) System.out.println("The point is in 4 quarter of coordinate system");
		else System.out.println("The point is to coordinate line");

	}

}
