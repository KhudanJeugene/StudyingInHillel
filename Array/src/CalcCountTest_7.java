import static org.junit.Assert.*;

import org.junit.Test;

public class CalcCountTest_7
{

	@Test
	public void testCalcCount_many()
	{
		int[]n = {1,3,5,7};
		int res = HW3.calcCount(n);
		assertEquals(4, res);
	}
	@Test
	public void testCalcCount_two()
	{
		int[]n = {1,2};
		int res = HW3.calcCount(n);
		assertEquals(1, res);
	}
	@Test
	public void testCalcCount_one()
	{
		int[]n = {0};
		int res = HW3.calcCount(n);
		assertEquals(0, res);
	}
	@Test (expected = IllegalArgumentException.class)
	public void testCalcCount_0()
	{
		int[]n = {};
		HW3.calcCount(n);
	}
	@Test (expected = IllegalArgumentException.class)
	public void testCalcCount_null()
	{
		int[]n = null;
		HW3.calcCount(n);
	}

}
