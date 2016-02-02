import static org.junit.Assert.*;

import org.junit.Test;

public class MinElemTest_1
{
	@Test
	public void testMinElem_many()
	{	
		int []n = {1,2,3};
		int res = HW3.minElem(n);
		assertEquals(1,res);
	}
	@Test
	public void testMinElem_two()
	{	
		int []n = {-1,2};
		int res = HW3.minElem(n);
		assertEquals(-1,res);
	}
	@Test
	public void testMinElem_one()
	{	
		int []n = {2};
		int res = HW3.minElem(n);
		assertEquals(2,res);
	}
	@Test (expected = IllegalArgumentException.class)
	public void testMinElem_0()
	{	
		int []n = {};
		HW3.minElem(n);
	}
	@Test (expected = IllegalArgumentException.class)
	public void testMinElem_null()
	{	
		int []n=null;
		HW3.minElem(n);		
	}
}
