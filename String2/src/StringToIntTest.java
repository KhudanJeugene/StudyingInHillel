import static org.junit.Assert.*;

import org.junit.Test;

public class StringToIntTest
{

	@Test
	public void testStringToInt_5()
	{
		String str = "5";
		int res = HW9_2.stringToInt(str);
		assertEquals(res,5);
	}
	@Test
	public void testStringToInt_0()
	{
		String str = "0";
		int res = HW9_2.stringToInt(str);
		assertEquals(res,0);
	}
	@Test 
	public void testStringToInt()
	{
		String str = "f";
		int res = HW9_2.stringToInt(str);
		assertEquals(res,0);
	}
}
