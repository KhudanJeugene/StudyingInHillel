import static org.junit.Assert.*;

import org.junit.Test;

public class Reverse_6
{
	@Test
	public void testReverse_many()
	{	
		int []n = {1,2,3,4};
		HW3.reverse(n);
		int []res = {4,3,2,1};
		assertArrayEquals(res,n);
	}
	@Test
	public void testReverse_Odd()
	{	
		int []n = {1,2,3,4,5};
		HW3.reverse(n);
		int []res = {5,4,3,2,1};
		assertArrayEquals(res,n);
		
	}
	@Test
	public void testReverse_3()
	{	
		int []n = {-1,2};
		HW3.reverse(n);
		int [] res = {2,-1};
		assertArrayEquals(res,n);
	}
	@Test
	public void testReverse_4()
	{	
		int []n = {2};
		HW3.reverse(n);
		int []res = {2};
		assertArrayEquals(res, n);
	}
	@Test (expected = IllegalArgumentException.class)
	public void testReverse_5()
	{	
		int []n = {};
		HW3.reverse(n);
	}
	@Test (expected = IllegalArgumentException.class)
	public void testReverse_6()
	{	
		int []n=null;
		HW3.reverse(n);		
	}
}
