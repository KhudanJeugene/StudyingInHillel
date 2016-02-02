import static org.junit.Assert.*;

import org.junit.Test;

public class SortSelectTest_9_3
{

	@Test
	public void testSortSelect_many()
	{
		int n[]={4,3,2,1};
		HW3.sortSelect(n);
		int resn[]={1,2,3,4};
		assertArrayEquals(resn, n);
	}
	@Test
	public void testSortSelect_two()
	{
		int n[]={3,2};
		HW3.sortSelect(n);
		int resn[]={2,3};
		assertArrayEquals(resn,n);
	}
	@Test
	public void testSortSelect_one()
	{
		int n[]={1};
		HW3.sortSelect(n);
		int resn[]={1};
		assertArrayEquals(resn, n);
	}
	@Test (expected = IllegalArgumentException.class)
	public void testSortSelect_0()
	{
		int n[]={};
		HW3.sortSelect(n);
	}
	@Test (expected = IllegalArgumentException.class)
	public void testSortSelect_null()
	{
		int n[]=null;
		HW3.sortSelect(n);
	}

}
