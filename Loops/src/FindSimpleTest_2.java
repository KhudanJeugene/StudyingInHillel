import static org.junit.Assert.*;

import org.junit.Test;

public class FindSimpleTest_2 {

	@Test
	public void testFindSimple_NoSimple()
	{
		boolean res = HW2.findSimple(16);
		assertEquals(false,res);
	}
	@Test
	public void testFindSimple_Simple() 
	{
		boolean res = HW2.findSimple(17);
		assertEquals(true,res);
	}
	@Test (expected = IllegalArgumentException.class)
	public void testFindSimple_Exc()
	{
		HW2.findSimple(0);
	}
}
