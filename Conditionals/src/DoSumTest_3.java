import static org.junit.Assert.*;
import org.junit.Test;

public class DoSumTest_3
{
	@Test
	public void testDoSum_AllPos() 
	{
		int res = HW1.doSum(1, 1, 1);
		assertEquals(3, res);
	}
	@Test
	public void testDoSum_APos() 
	{
		int res = HW1.doSum(-1, 1, 1);
		assertEquals(2, res);
	}
	@Test
	public void testDoSum_BPos() 
	{
		int res = HW1.doSum(1, -1, 1);
		assertEquals(2, res);
	}
	@Test
	public void testDoSum_CPos() 
	{
		int res = HW1.doSum(1, 1, -1);
		assertEquals(2, res);
	}
	@Test
	public void testDoSum_ABPos() 
	{
		int res = HW1.doSum(-1, -1, 1);
		assertEquals(1, res);
	}

	@Test
	public void testDoSumBCPos() 
	{
		int res = HW1.doSum(1, -1, -1);
		assertEquals(1, res);
	}
	@Test
	public void testDoSumACPos() 
	{
		int res = HW1.doSum(-1, 1, -1);
		assertEquals(1, res);
	}

	public void testDoSumAll0() 
	{
		int res = HW1.doSum(0, 0, 0);
		assertEquals(0, res);
	}
	@Test 
	public void testDoSumAllNeg() 
	{
		int res = HW1.doSum(-1, -1, -1);
		assertEquals(0,res);
	}
}
