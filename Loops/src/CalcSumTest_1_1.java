import static org.junit.Assert.*;

import org.junit.Test;

public class CalcSumTest_1_1 
{
	@Test
	public void testCalcSum()
	{
		int res = HW2.calcSum();	
		assertEquals(2450,res);
	}
}
