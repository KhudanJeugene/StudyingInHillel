import static org.junit.Assert.*;

import org.junit.Test;

public class IntToStringTest
{
	@Test
	public void testIntToString_1()
	{
		int n = 1;
		String res = HW9_2.intToString(n);
		assertEquals(res,"1");
	}
	@Test
	public void testIntToString_0()
	{
		int n = 0;
		String res = HW9_2.intToString(n);
		assertEquals(res,"0");
	}
	@Test
	public void testIntToString()
	{
		int n = -1;
		String res = HW9_2.intToString(n);
		assertEquals(res,"-1");
	}
}
