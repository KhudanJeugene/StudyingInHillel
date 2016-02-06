import static org.junit.Assert.*;

import org.junit.Test;

public class ReverseStringTest
{
	@Test (expected = IllegalArgumentException.class)
	public void testReverseString_null()
	{
		String str = null;
		HW9_3.reverseString(str);
	}
	@Test 
	public void testReverseString_0()
	{
		String str = "";
		String res = HW9_3.reverseString(str);
		assertEquals(res,"");
	}
	@Test
	public void testReverseString_1()
	{
		String str = "many";
		String res = HW9_3.reverseString(str);
		assertEquals(res,"ynam");
	}
	@Test
	public void testReverseString_2()
	{
		String str = "many symb";
		String res = HW9_3.reverseString(str);
		assertEquals(res,"bmys ynam");
	}
	@Test
	public void testReverseString_many()
	{
		String str = "many symb very";
		String res = HW9_3.reverseString(str);
		assertEquals(res,"yrev bmys ynam");
	}

}