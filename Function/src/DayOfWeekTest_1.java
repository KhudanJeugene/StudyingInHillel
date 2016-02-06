import static org.junit.Assert.*;
import org.junit.Test;

public class DayOfWeekTest_1
{

	@Test
	public void testDayOfWeek_1()
	{
		String res = HW4.dayOfWeek(1);
		assertEquals("Mondey",res);
	}
	@Test
	public void testDayOfWeek_2()
	{
		String res = HW4.dayOfWeek(2);
		assertEquals("Tuesday",res);
	}
	@Test
	public void testDayOfWeek_3()
	{
		String res = HW4.dayOfWeek(3);
		assertEquals("Wednesday",res);
	}
	@Test
	public void testDayOfWeek_4()
	{
		String res = HW4.dayOfWeek(4);
		assertEquals("Thursday",res);
	}
	@Test
	public void testDayOfWeek_5()
	{
		String res = HW4.dayOfWeek(5);
		assertEquals("Friday",res);
	}
	@Test
	public void testDayOfWeek6()
	{
		String res = HW4.dayOfWeek(6);
		assertEquals("Saturday",res);
	}
	@Test
	public void testDayOfWeek7()
	{
		String res = HW4.dayOfWeek(7);
		assertEquals("Sunday",res);
	}
	@Test (expected = IllegalArgumentException.class)
	public void testDayOfWeek_8()
	{
		HW4.dayOfWeek(0);
	}
	@Test (expected = IllegalArgumentException.class)
	public void testDayOfWeek_9()
	{
		HW4.dayOfWeek(8);
	}
}