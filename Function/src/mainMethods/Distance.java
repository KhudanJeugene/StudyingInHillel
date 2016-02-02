package mainMethods;
//Найти расстояние между двумя точками в двумерном декартовом пространстве.
public class Distance
{
	public static double dist(int ax, int ay, int bx, int by)
	{
		double res = 0;
		res = Math.sqrt(Math.pow((bx-ax),2)+Math.pow((by-ay),2));
		return res;

	}
	public static void main(String[] args)
	{
		int x1=3;
		int y1=0;
		int x2=0;
		int y2=4;
		double res = dist(x1,y1,x2,y2);
		System.out.println(res);
	}
}
