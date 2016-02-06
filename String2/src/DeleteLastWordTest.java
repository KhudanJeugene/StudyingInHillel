import static org.junit.Assert.*;

import org.junit.Test;

public class DeleteLastWordTest
{
	@Test (expected = IllegalArgumentException.class)
	public void testDeleteLastWord_null()
	{
		String str = null;
		HW9_3.deleteLastWord(str);
	}
	@Test 
	public void testDeleteLastWord_0()
	{
		String str = "";
		String res = HW9_3.deleteLastWord(str);
		assertEquals(res,"");
	}
	@Test
	public void testDeleteLastWord_1()
	{
		String str = "many";
		String res = HW9_3.deleteLastWord(str);
		assertEquals(res,"many");
	}
	@Test
	public void testDeleteLastWord_2()
	{
		String str = "many symb";
		String res = HW9_3.deleteLastWord(str);
		assertEquals(res,"many");
	}
	@Test
	public void testDeleteLastWord_many()
	{
		String str = "many symb very";
		String res = HW9_3.deleteLastWord(str);
		assertEquals(res,"many symb");
	}

}
