import static org.junit.Assert.*;

import org.junit.Test;

public class SortBubbleTest_9_1
{
	@Test
	public void testSortBubble_many()
	{
		int n[]={4,3,2,1};
		HW3.sortBubble(n);
		int resn[]={1,2,3,4};
		assertArrayEquals(resn, n);
	}
	@Test
	public void testSortBubble_two()
	{
		int n[]={2,1};
		HW3.sortBubble(n);
		int resn[]={1,2};
		assertArrayEquals(resn,n);
	}
	@Test
	public void testSortBubble_one()
	{
		int n[]={1};
		HW3.sortBubble(n);
		int resn[]={1};
		assertArrayEquals(resn, n);
	}
	@Test (expected = IllegalArgumentException.class)
	public void testSortBubble_0()
	{
		int n[]={};		
		HW3.sortBubble(n);
	}
	@Test (expected = IllegalArgumentException.class)
	public void testSortBubble_null()
	{
		int n[]=null;		
		HW3.sortBubble(n);
	}
}
