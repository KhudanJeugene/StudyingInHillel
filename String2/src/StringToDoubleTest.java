import static org.junit.Assert.*;

import org.junit.Test;

public class StringToDoubleTest
{
	@Test
	public void testStringToDouble_5()
	{
		String str = "5.5";
		double res = HW9_2.stringToDouble(str);
		assertEquals(res,5.5,0.001);
	}
	@Test
	public void testStringToDouble_0()
	{
		String str = "0";
		double res = HW9_2.stringToDouble(str);
		assertEquals(res,0,0.001);
	}
	@Test
	public void testStringToDouble_f()
	{
		String str = "f";
		double res = HW9_2.stringToDouble(str);
		assertEquals(res,0,0.001);
	}

}
