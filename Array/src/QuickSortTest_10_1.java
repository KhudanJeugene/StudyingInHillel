import static org.junit.Assert.*;

import org.junit.Test;

public class QuickSortTest_10_1
{
	@Test
	public void testQuickSort_many()
	{
		int[] n = {5,4,3,2,1};
		HW3.quickSort(n);
		int[] res = {1,2,3,4,5};
		assertArrayEquals(res, n);
	}
	@Test
	public void testQuickSort_two()
	{
		int[] n = {3,2};
		HW3.quickSort(n);
		int[] res = {2,3};
		assertArrayEquals(res, n);
	}
	@Test
	public void testQuickSort_one()
	{
		int[] n = {1};
		HW3.quickSort(n);
		int[] res = {1};
		assertArrayEquals(res, n);
	}
	@Test (expected = IllegalArgumentException.class)
	public void testQuickSort_0()
	{
		int[] n ={};
		HW3.quickSort(n);
	}
	@Test (expected = IllegalArgumentException.class)
	public void testQuickSort_null()
	{
		int[] n =null;
		HW3.quickSort(n);
	}
}
