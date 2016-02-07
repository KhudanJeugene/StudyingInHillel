import static org.junit.Assert.*;

import org.junit.Test;

public class HW3Test
{

	//======================
	//minElem
	//======================

	@Test
	public void testMinElem_many()
	{	
		int []n = {1,2,3};
		int res = HW3.minElem(n);
		assertEquals(1,res);
	}
	@Test
	public void testMinElem_two()
	{	
		int []n = {-1,2};
		int res = HW3.minElem(n);
		assertEquals(-1,res);
	}
	@Test
	public void testMinElem_one()
	{	
		int []n = {2};
		int res = HW3.minElem(n);
		assertEquals(2,res);
	}
	@Test (expected = IllegalArgumentException.class)
	public void testMinElem_0()
	{	
		int []n = {};
		HW3.minElem(n);
	}
	@Test (expected = IllegalArgumentException.class)
	public void testMinElem_null()
	{	
		int []n=null;
		HW3.minElem(n);		
	}

	//======================
	//maxElem
	//======================

	@Test
	public void testMaxElem_many()
	{	
		int []n = {1,2,3};
		int res = HW3.maxElem(n);
		assertEquals(3,res);
	}
	@Test
	public void testMaxElem_two()
	{	
		int []n = {-1,2};
		int res = HW3.maxElem(n);
		assertEquals(2,res);
	}
	@Test
	public void testMaxElem_one()
	{	
		int []n = {2};
		int res = HW3.maxElem(n);
		assertEquals(2,res);
	}
	@Test (expected = IllegalArgumentException.class)
	public void testMaxElem_0()
	{	
		int []n = {};
		HW3.maxElem(n);
	}
	@Test (expected = IllegalArgumentException.class)
	public void testMaxElem_null()
	{	
		int []n=null;
		HW3.maxElem(n);		
	}

	//======================
	//minInd
	//======================

	@Test
	public void testMinInd_many()
	{	
		int []n = {1,2,3};
		int res = HW3.minInd(n);
		assertEquals(0,res);
	}
	@Test
	public void testMinInd_two()
	{	
		int []n = {-1,2};
		int res = HW3.minInd(n);
		assertEquals(0,res);
	}
	@Test
	public void testMinInd_one()
	{	
		int []n = {2};
		int res = HW3.minInd(n);
		assertEquals(0,res);
	}
	@Test (expected = IllegalArgumentException.class)
	public void testMinInd_0()
	{	
		int []n = {};
		HW3.minInd(n);
	}
	@Test (expected = IllegalArgumentException.class)
	public void testMinInd_null()
	{	
		int []n=null;
		HW3.minInd(n);		
	}

	//======================
	//maxInd
	//======================

	@Test
	public void testMaxInd_many()
	{	
		int []n = {1,2,3};
		int res = HW3.maxInd(n);
		assertEquals(2,res);
	}
	@Test
	public void testMaxInd_two()
	{	
		int []n = {-1,2};
		int res = HW3.maxInd(n);
		assertEquals(1,res);
	}
	@Test
	public void testMaxInd_one()
	{	
		int []n = {2};
		int res = HW3.maxInd(n);
		assertEquals(0,res);
	}
	@Test (expected = IllegalArgumentException.class)
	public void testMaxInd_0()
	{	
		int []n = {};
		HW3.maxInd(n);
	}
	@Test (expected = IllegalArgumentException.class)
	public void testMaxInd_null()
	{	
		int []n=null;
		HW3.maxInd(n);		
	}

	//======================
	//sumOddEl
	//======================

	@Test
	public void testSumOddEl_many()
	{	
		int []n = {1,2,3};
		int res = HW3.sumOddEl(n);
		assertEquals(2,res);
	}
	@Test
	public void testSumOddEl_two()
	{	
		int []n = {-1,2};
		int res = HW3.sumOddEl(n);
		assertEquals(2,res);
	}
	@Test
	public void testSumOddEl_one()
	{	
		int []n = {2};
		int res = HW3.sumOddEl(n);
		assertEquals(0,res);
	}
	@Test (expected = IllegalArgumentException.class)
	public void testSumOddEl_0()
	{	
		int []n = {};
		HW3.sumOddEl(n);
	}
	@Test (expected = IllegalArgumentException.class)
	public void testSumOddEl_null()
	{	
		int []n=null;
		HW3.sumOddEl(n);		
	}

	//======================
	//reverse
	//======================

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

	//======================
	//calcCount
	//======================
	
	@Test
	public void testCalcCount_many()
	{
		int[]n = {1,3,5,7};
		int res = HW3.calcCount(n);
		assertEquals(4, res);
	}
	@Test
	public void testCalcCount_two()
	{
		int[]n = {1,2};
		int res = HW3.calcCount(n);
		assertEquals(1, res);
	}
	@Test
	public void testCalcCount_one()
	{
		int[]n = {0};
		int res = HW3.calcCount(n);
		assertEquals(0, res);
	}
	@Test (expected = IllegalArgumentException.class)
	public void testCalcCount_0()
	{
		int[]n = {};
		HW3.calcCount(n);
	}
	@Test (expected = IllegalArgumentException.class)
	public void testCalcCount_null()
	{
		int[]n = null;
		HW3.calcCount(n);
	}
	
	//======================
	//reverseHalf
	//======================
	
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

	//======================
	//sortBubble
	//======================
	
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

	//======================
	//sortIns
	//======================
	
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

	//======================
	//sortSelect
	//======================
	
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
	
	//======================
	//quickSort
	//======================
	
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
