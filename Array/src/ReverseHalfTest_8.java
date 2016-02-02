import static org.junit.Assert.*;

import org.junit.Test;

public class ReverseHalfTest_8
{
	@Test
	public void testReverseArr_oddMany()
	{
		int[] n = {1,2,3,4,5};
		HW3.reverseHalf(n);
		int[] res = {4,5,3,1,2};
		assertArrayEquals(res, n);
	}
	@Test
	public void testReverseArr_evenMany()
	{
		int[] n = {1,2,3,4};
		HW3.reverseHalf(n);
		int[] res = {3,4,1,2};
		assertArrayEquals(res, n);
	}
	@Test
	public void testReverseArr_two()
	{
		int[] n = {1,2};
		HW3.reverseHalf(n);
		int[] res = {2,1};
		assertArrayEquals(res, n);
	}
	@Test
	public void testReverseArr_one()
	{
		int[] n = {1};
		HW3.reverseHalf(n);
		int[] res = {1};
		assertArrayEquals(res, n);
	}
	@Test (expected = IllegalArgumentException.class)
	public void testReverseArr_5()
	{
		int[] n = {};
		HW3.reverseHalf(n);
	}
	@Test (expected = IllegalArgumentException.class)
	public void testReverseArr_6()
	{
		int[] n = null;
		HW3.reverseHalf(n);
	}

}
