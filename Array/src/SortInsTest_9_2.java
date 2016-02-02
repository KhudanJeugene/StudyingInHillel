import static org.junit.Assert.*;

import org.junit.Test;

public class SortInsTest_9_2
{

	@Test
	public void testSortIns_many()
	{
		int n[]={4,3,2,1};
		HW3.sortIns(n);
		int resn[]={1,2,3,4};
		assertArrayEquals(resn, n);
	}
	@Test
	public void testSortIns_two()
	{
		int n[]={3,2};
		HW3.sortIns(n);
		int resn[]={2,3};
		assertArrayEquals(resn,n);
	}
	@Test
	public void testSortIns_one()
	{
		int n[]={1};
		HW3.sortIns(n);
		int resn[]={1};
		assertArrayEquals(resn, n);
	}
	@Test (expected = IllegalArgumentException.class)
	public void testSortIns_0()
	{
		int n[]={};
		HW3.sortIns(n);
	}
	@Test (expected = IllegalArgumentException.class)
	public void testSortIns_null()
	{
		int n[]=null;
		HW3.sortIns(n);
	}

}
