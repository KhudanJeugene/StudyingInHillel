import static org.junit.Assert.*;

import org.junit.Test;

public class FindRootTest_3
{

	@Test
	public void testFindRoot_17()
	{
		int res = HW2.findRoot(17);
		assertEquals(4,res);
	}
	@Test
	public void testFindRoot_16()
	{
		int res = HW2.findRoot(16);
		assertEquals(4,res);
	}
	@Test
	public void testFindRoot_0()
	{
		int res = HW2.findRoot(0);
		assertEquals(0,res);
	}
	@Test (expected = IllegalArgumentException.class)
	public void testFindRoot_NegNumb()
	{
		HW2.findRoot(-1);
	}

}
