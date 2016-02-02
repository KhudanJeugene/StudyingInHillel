import static org.junit.Assert.*;

import org.junit.Test;

public class MirrorTest_6
{

	@Test
	public void testMirror_Neg152()
	{
		int res = HW2.mirror(-152);
		assertEquals(-251,res);
	}
	@Test
	public void testMirror_152()
	{
		int res = HW2.mirror(152);
		assertEquals(251,res);
	}
	@Test
	public void testMirror_23()
	{
		int res = HW2.mirror(23);
		assertEquals(32,res);
	}
	@Test
	public void testMirror_1()
	{
		int res = HW2.mirror(1);
		assertEquals(1,res);
	}
	@Test
	public void testMirror_0()
	{
		int res = HW2.mirror(0);
		assertEquals(0,res);
	}
}
