import static org.junit.Assert.*;

import org.junit.Test;

public class MaxElemTest_2
{
	@Test
	public void testMaxElem_many()
	{	
		int []n = {1,2,3};
		int res = HW3.maxElem(n);
		assertEquals(3,res);
	}
	@Test
	public void testMaxElem_two()
	{	
		int []n = {-1,2};
		int res = HW3.maxElem(n);
		assertEquals(2,res);
	}
	@Test
	public void testMaxElem_one()
	{	
		int []n = {2};
		int res = HW3.maxElem(n);
		assertEquals(2,res);
	}
	@Test (expected = IllegalArgumentException.class)
	public void testMaxElem_0()
	{	
		int []n = {};
		HW3.maxElem(n);
	}
	@Test (expected = IllegalArgumentException.class)
	public void testMaxElem_null()
	{	
		int []n=null;
		HW3.maxElem(n);		
	}
}
