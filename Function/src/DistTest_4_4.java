import static org.junit.Assert.*;

import org.junit.Test;

public class DistTest_4_4
{
	@Test
	public void testDist_dist5()
	{
		int x1=4, y1=0, x2 =0, y2 =3;
		double res = 5.0;
		assertEquals(res, HW4.dist(x1, y1, x2, y2),res);
	}
	@Test
	public void testDist_0()
	{
		int x1=0, y1=0, x2 =0, y2 =0;
		double res = 0.0;
		assertEquals(res, HW4.dist(x1, y1, x2, y2),res);
	}@Test
	public void testDist_1()
	{
		int x1=1, y1=1, x2 =1, y2 =1;
		double res = 0.0;
		assertEquals(res, HW4.dist(x1, y1, x2, y2),res);
	}
	@Test
	public void testDist_Neg1()
	{
		int x1=-1, y1=-1, x2 =-1, y2 =-1;
		double res = 0.0;
		assertEquals(res, HW4.dist(x1, y1, x2, y2),res);
	}
}
