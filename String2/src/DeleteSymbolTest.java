import static org.junit.Assert.*;

import org.junit.Test;

public class DeleteSymbolTest
{

	@Test (expected = IllegalArgumentException.class)
	public void testDeleteSymbol_null()
	{
		String str = null;
		HW9_3.deleteSymbol(1, 1, str);
	}
	@Test (expected = IllegalArgumentException.class)
	public void testDeleteSymbol_0()
	{
		String str = "";
		HW9_3.deleteSymbol(0, 0, str);
	}
	@Test
	public void testDeleteSymbol_1()
	{
		String str = "many";
		String res = HW9_3.deleteSymbol(1, 2, str);
		assertEquals(res,"my");
	}
	@Test
	public void testDeleteSymbol_2()
	{
		String str = "many symb";
		String res = HW9_3.deleteSymbol(1, 4, str);
		assertEquals(res,"msymb");
	}
	@Test
	public void testDeleteSymbol_many()
	{
		String str = "many symb very";
		String res = HW9_3.deleteSymbol(1, 4, str);
		assertEquals(res,"msymb very");
	}
}
