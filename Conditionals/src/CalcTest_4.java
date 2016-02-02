import static org.junit.Assert.*;

import org.junit.Test;

public class CalcTest_4
{

	@Test
	public void testCalc_equals()
	{
		int res= HW1.Calc(1, 2, 3);
		assertEquals(9, res);
	}
	@Test
	public void testCalc_MultMore()
	{
		int res= HW1.Calc(1, 2, 4);
		assertEquals(11, res);
	}
	@Test
	public void testCalc_SumMore()
	{
		int res= HW1.Calc(-1, 2, 3);
		assertEquals(7, res);
	}
	@Test
	public void testCalc_All0()
	{
		int res= HW1.Calc(0, 0, 0);
		assertEquals(3, res);
	}

}
