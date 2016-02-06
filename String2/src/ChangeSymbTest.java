import static org.junit.Assert.*;

import org.junit.Test;

public class ChangeSymbTest
{

	@Test (expected = IllegalArgumentException.class)
	public void testChangeSymb_null()
	{
		String []str = null;
		int l = 4;
		HW9_3.changeSymb(str,l);
	}
	@Test
	public void testFindShor_0()
	{
		String []str = {};		
		int l = 4;
		HW9_3.changeSymb(str,l);
		String[]res = {};
		assertArrayEquals(res,str);
	}
	@Test
	public void testFindShor_1()
	{
		String []str = {"Many"};		
		int l = 4;
		HW9_3.changeSymb(str,l);
		String[]res = {"M$"};
		assertArrayEquals(res,str);
	}
	@Test
	public void testFindShor_2()
	{
		String []str = {"Many", "symb"};		
		int l = 4;
		HW9_3.changeSymb(str,l);
		String[]res = {"M$", "s$"};
		assertArrayEquals(res,str);
	}
	@Test
	public void testFindShor_many()
	{
		String []str = {"Many", "symb", "and"};		
		int l = 4;
		HW9_3.changeSymb(str,l);
		String[]res = {"M$", "s$", "and"};
		assertArrayEquals(res,str);
	}
}