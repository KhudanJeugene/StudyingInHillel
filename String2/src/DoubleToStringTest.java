import static org.junit.Assert.*;

import org.junit.Test;

public class DoubleToStringTest
{

	@Test
	public void testDoubleToString()
	{
		double n = 3.53;
		String res = HW9_2.doubleToString(n);
		assertEquals(res,"3.53");
	}

}
