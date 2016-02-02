import static org.junit.Assert.*;
import org.junit.Test;
public class Quater_2Test
{	
	@Test
	public void quaterTest_1()
	{
		int res=HW1.quater(1, 1);
		assertEquals(1, res);
	}
	@Test
	public void quaterTest_2()
	{
		int res=HW1.quater(-1, 1);
		assertEquals(2, res);
	}
	@Test
	public void quaterTest_3()
	{
		int res=HW1.quater(-1, -1);
		assertEquals(3, res);
	}
	@Test
	public void quaterTest_4()
	{
		int res=HW1.quater(1, -1);
		assertEquals(4, res);
	}
	@Test (expected = IllegalArgumentException.class)
	public void quaterTest_0()
	{
		HW1.quater(0, 0);
	}		

}
