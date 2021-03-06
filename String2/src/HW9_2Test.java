import static org.junit.Assert.*;

import org.junit.Test;

public class HW9_2Test
{
	//====================
	//intToString
	//====================
	
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

	//====================
	//doubleToString
	//====================
	
	@Test
	public void testDoubleToString()
	{
		double n = 3.53;
		String res = HW9_2.doubleToString(n);
		assertEquals(res,"3.53");
	}
	
	//====================
	//stringToInt
	//====================
	
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
	
	//====================
	//stringToDouble
	//====================
	
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
