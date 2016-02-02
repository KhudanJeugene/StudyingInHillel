import static org.junit.Assert.*;

import org.junit.Test;

public class SumOddEl_5
{
	@Test
	public void testSumOddEl_many()
	{	
		int []n = {1,2,3};
		int res = HW3.sumOddEl(n);
		assertEquals(2,res);
	}
	@Test
	public void testSumOddEl_two()
	{	
		int []n = {-1,2};
		int res = HW3.sumOddEl(n);
		assertEquals(2,res);
	}
	@Test
	public void testSumOddEl_one()
	{	
		int []n = {2};
		int res = HW3.sumOddEl(n);
		assertEquals(0,res);
	}
	@Test (expected = IllegalArgumentException.class)
	public void testSumOddEl_0()
	{	
		int []n = {};
		HW3.sumOddEl(n);
	}
	@Test (expected = IllegalArgumentException.class)
	public void testSumOddEl_null()
	{	
		int []n=null;
		HW3.sumOddEl(n);		
	}
}
