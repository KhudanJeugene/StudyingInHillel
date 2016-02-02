import static org.junit.Assert.*;

import org.junit.Test;

public class SumDigTest_5
{
	@Test
	public void testsumDig_1()
	{
		int res = HW2.sumDig(0);
		assertEquals(0,res);
	}
	@Test
	public void testsumDig_2()
	{
		int res = HW2.sumDig(1);
		assertEquals(1,res);
	}
	@Test
	public void testsumDig_3()
	{
		int res = HW2.sumDig(123);
		assertEquals(6,res);
	}
	@Test
	public void testsumDig_4()
	{
		int res = HW2.sumDig(-123);
		assertEquals(6,res);
	}
}
