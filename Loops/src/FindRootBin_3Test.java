import static org.junit.Assert.*;

import org.junit.Test;

public class FindRootBin_3Test
{

	@Test
	public void testFindRoot_1()
	{
		int res = HW2.findRootBin(17);
		assertEquals(4,res);
	}
	@Test
	public void testFindRoot_2()
	{
		int res = HW2.findRootBin(16);
		assertEquals(4,res);
	}
	@Test
	public void testFindRoot_3()
	{
		int res = HW2.findRootBin(0);
		assertEquals(0,res);
	}
	@Test (expected = IllegalArgumentException.class)
	public void testFindRoot_4()
	{		
		HW2.findRootBin(-1);

	}
}
