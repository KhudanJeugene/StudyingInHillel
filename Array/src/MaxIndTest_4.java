import static org.junit.Assert.*;

import org.junit.Test;

public class MaxIndTest_4
{
	@Test
	public void testMaxInd_many()
	{	
		int []n = {1,2,3};
		int res = HW3.maxInd(n);
		assertEquals(2,res);
	}
	@Test
	public void testMaxInd_two()
	{	
		int []n = {-1,2};
		int res = HW3.maxInd(n);
		assertEquals(1,res);
	}
	@Test
	public void testMaxInd_one()
	{	
		int []n = {2};
		int res = HW3.maxInd(n);
		assertEquals(0,res);
	}
	@Test (expected = IllegalArgumentException.class)
	public void testMaxInd_0()
	{	
		int []n = {};
		HW3.maxInd(n);
	}
	@Test (expected = IllegalArgumentException.class)
	public void testMaxInd_null()
	{	
		int []n=null;
		HW3.maxInd(n);		
	}
}
