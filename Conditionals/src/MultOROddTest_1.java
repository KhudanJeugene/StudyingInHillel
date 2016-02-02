import static org.junit.Assert.*;

import org.junit.Test;

public class MultOROddTest_1
{

	@Test
	public void MultOrAdd_Even()
	{
		int res = HW1.MultOrAdd(2, 4);
		assertEquals(8, res);
	}
	@Test
	public void MultOrAdd_Odd()
	{
		int res = HW1.MultOrAdd(1, 4);
		assertEquals(5, res);
	}
	@Test
	public void MultOrAdd_0()
	{
		int res = HW1.MultOrAdd(0, 4);
		assertEquals(0, res);
	}
	@Test
	public void MultOrAdd_Negative()
	{
		int res = HW1.MultOrAdd(-1, 0);
		assertEquals(-1, res);
	}
}
