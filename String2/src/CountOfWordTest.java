import static org.junit.Assert.*;
import org.junit.Test;

public class CountOfWordTest
{
	@Test (expected = IllegalArgumentException.class)
	public void testCountOfWord_null()
	{
		String str = null;
		HW9_3.countOfWord(str);
	}
	@Test
	public void testCountOfWord_0()
	{
		String str = "";
		int count = HW9_3.countOfWord(str);
		assertEquals(count,0);
	}
	@Test
	public void testCountOfWord_1()
	{
		String str = "One";
		int count = HW9_3.countOfWord(str);
		assertEquals(count,1);
	}
	@Test
	public void testCountOfWord_2()
	{
		String str = "One two";
		int count = HW9_3.countOfWord(str);
		assertEquals(count,2);
	}
	@Test
	public void testCountOfWord_many()
	{
		String str = "One two three";
		int count = HW9_3.countOfWord(str);
		assertEquals(count,3);
	}
}
