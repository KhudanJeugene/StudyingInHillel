import static org.junit.Assert.*;

import org.junit.Test;

public class FindShortTest
{
	@Test (expected = IllegalArgumentException.class)
	public void testFindShort_null()
	{
		String str = null;
		HW9_3.findShort(str);
	}
	@Test
	public void testFindShor_0()
	{
		String str = "";
		int res =HW9_3.findShort(str);
		assertEquals(res,0);
	}
	@Test
	public void testFindShor_1()
	{
		String str = "i";
		int res =HW9_3.findShort(str);
		assertEquals(res,1);
	}
	@Test
	public void testFindShor_2()
	{
		String str = "You look";
		int res =HW9_3.findShort(str);
		assertEquals(res,3);
	}
	@Test
	public void testFindShor_many()
	{
		String str = "Something like this";
		int res =HW9_3.findShort(str);
		assertEquals(res,4);
	}

}