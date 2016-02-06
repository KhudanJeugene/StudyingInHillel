import static org.junit.Assert.*;

import org.junit.Test;

public class OneInstanceTest
{
	@Test (expected = IllegalArgumentException.class)
	public void testOneInstance_null()
	{
		String str = null;
		HW9_3.oneInstance(str);
	}
	@Test
	public void testOneInstance_0()
	{
		String str = "";		
		String res = HW9_3.oneInstance(str);	
		assertEquals(res,str);
	}
	@Test
	public void testOneInstance_1()
	{
		String str = "Many.";		
		String res = HW9_3.oneInstance(str);
		assertEquals(res,str);
	}
	@Test
	public void testOneInstance_2()
	{
		String str = "Many,, symb";		
		String res = HW9_3.oneInstance(str);	
		assertEquals(res,"Many, smb");
	}
	@Test
	public void testOneInstance_many()
	{
		String str = "Many, symb,and";		
		String res = HW9_3.oneInstance(str);
		assertEquals(res,"Many, smbd");
	}

}