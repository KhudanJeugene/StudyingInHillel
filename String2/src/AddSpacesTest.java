import static org.junit.Assert.*;

import org.junit.Test;

public class AddSpacesTest
{

	@Test (expected = IllegalArgumentException.class)
	public void testAddSpaces_null()
	{
		String str = null;
		HW9_3.addSpaces(str);
	}
	@Test
	public void testAddSpaces_0()
	{
		String str = "";		
		String res = HW9_3.addSpaces(str);	
		assertEquals(res,str);
	}
	@Test
	public void testAddSpaces_1()
	{
		String str = "Many.";		
		String res = HW9_3.addSpaces(str);
		assertEquals(res,str);
	}
	@Test
	public void testAddSpaces_2()
	{
		String str = "Many,, symb";		
		String res = HW9_3.addSpaces(str);	
		assertEquals(res,str);
	}
	@Test
	public void testAddSpaces_many()
	{
		String str = "Many, symb,and";		
		String res = HW9_3.addSpaces(str);
		assertEquals(res,"Many, symb, and");
	}

}
