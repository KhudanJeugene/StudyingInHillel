import static org.junit.Assert.*;

import org.junit.Test;

public class FactorialTest_4
{

	@Test
	public void testFactorial_5()
	{
		int res = HW2.factorial(5);
		assertEquals(120,res);
	}
	@Test
	public void testFactorial_1()
	{
		int res = HW2.factorial(1);
		assertEquals(1,res);
	}
	@Test (expected = IllegalArgumentException.class)
	public void testFactorial_0()
	{	
		HW2.factorial(0);
	}
	@Test (expected = IllegalArgumentException.class)
	public void testFactorial_NegNumb()
	{	
		HW2.factorial(-1);
	}
}
