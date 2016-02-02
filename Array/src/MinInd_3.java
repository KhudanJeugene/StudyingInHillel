import static org.junit.Assert.*;

import org.junit.Test;

public class MinInd_3
{
	@Test
	public void testMinInd_many()
	{	
		int []n = {1,2,3};
		int res = HW3.minInd(n);
		assertEquals(0,res);
	}
	@Test
	public void testMinInd_two()
	{	
		int []n = {-1,2};
		int res = HW3.minInd(n);
		assertEquals(0,res);
	}
	@Test
	public void testMinInd_one()
	{	
		int []n = {2};
		int res = HW3.minInd(n);
		assertEquals(0,res);
	}
	@Test (expected = IllegalArgumentException.class)
	public void testMinInd_0()
	{	
		int []n = {};
		HW3.minInd(n);
	}
	@Test (expected = IllegalArgumentException.class)
	public void testMinInd_null()
	{	
		int []n=null;
		HW3.minInd(n);		
	}
}
