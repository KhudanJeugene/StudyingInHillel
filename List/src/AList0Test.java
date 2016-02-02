import static org.junit.Assert.*;

import org.junit.Test;

public class AList0Test 
{
	/*----------------
	 Test function Init
	------------------ */

	@Test
	public void testInit_many() 
	{
		int []ar = {10,20,30,88,41,65};	
		AList0 rr = new AList0(ar);
		assertArrayEquals(ar,rr.toArray());
	}
	@Test
	public void testInit_two() 
	{
		int []ar = {10,20};	
		AList0 rr = new AList0(ar);
		assertArrayEquals(ar,rr.toArray());
	}
	@Test
	public void testInit_one() 
	{
		int []ar = {10};	
		AList0 rr = new AList0(ar);
		assertArrayEquals(ar,rr.toArray());
	}
	@Test
	public void testInit_0() 
	{
		int []ar = {};	
		AList0 rr = new AList0(ar);
		assertArrayEquals(ar,rr.toArray());
	}
	@Test (expected = IllegalArgumentException.class)
	public void testInit_null() 
	{
		int []ar = null;	
		AList0 rr = new AList0(ar);
		rr.init(ar);
	}



	/*-------------------
	 Test function print
	------------------- */

	@Test 
	public void testPrint_many()
	{
		int []ar = {10,20,30,88,41,65};
		AList0 rr = new AList0(ar);
		rr.print();
	}
	@Test
	public void testPrint_two()
	{
		int []ar = {10,20};
		AList0 rr = new AList0(ar);
		rr.print();
	}
	@Test
	public void testPrint_one()
	{
		int []ar = {10};
		AList0 rr = new AList0(ar);
		rr.print();
	}
	@Test ()
	public void testPrint_0()
	{
		int []ar = {};
		AList0 rr = new AList0(ar);
		rr.print();
	}
	@Test (expected = IllegalArgumentException.class)
	public void testPrint_null()
	{
		int []ar = null;
		AList0 rr = new AList0(ar);
		rr.print();
	}

	/*-----------------
	 Test function Size
	 -----------------*/

	@Test
	public void testSize_many() 
	{
		int []ar = {10,20,30,88,41,65};
		AList0 rr = new AList0(ar);
		int s = rr.size();
		assertEquals(6, s);
	}
	@Test
	public void testSize_two() 
	{
		int []ar = {10,20};
		AList0 rr = new AList0(ar);
		int s = rr.size();
		assertEquals(2, s);
	}
	@Test
	public void testSize_one() 
	{
		int []ar = {10};
		AList0 rr = new AList0(ar);
		int s = rr.size();
		assertEquals(1, s);
	}
	@Test 
	public void testSize_0()
	{
		int [] ar = {};
		AList0 rr = new AList0(ar);
		int s = rr.size();
		assertEquals(0,s);
	}
	@Test (expected = IllegalArgumentException.class)
	public void testSize_null()
	{
		int []ar = null;
		AList0 rr = new AList0(ar);
		rr.size();
	}

	/*-----------------
	 Test function clear
	 -----------------*/

	@Test 
	public void testClear_many()
	{
		int []ar = {10,20,30,88,41,65};
		AList0 rr = new AList0(ar);
		rr.clear();
		int []res= {};
		assertArrayEquals(res,rr.toArray());
	}
	@Test
	public void testClear_two()
	{
		int []ar = {10,20};
		AList0 rr = new AList0(ar);
		rr.clear();
		int []res= {};
		assertArrayEquals(res,rr.toArray());
	}
	@Test
	public void testClear_one()
	{
		int []ar = {10};
		AList0 rr = new AList0(ar);
		rr.clear();
		int []res= {};
		assertArrayEquals(res,rr.toArray());
	}
	@Test
	public void testClear_0()
	{
		int []ar = {};
		AList0 rr = new AList0(ar);
		rr.clear();
		int []res= {};
		assertArrayEquals(res,rr.toArray());
	}
	@Test (expected = IllegalArgumentException.class)
	public void testClear_null()
	{
		int []ar = null;
		AList0 rr = new AList0(ar);
		rr.clear();
	}

	/*--------------------
	 Test function toArray
	 -------------------*/

	@Test
	public void testToArray_many()
	{
		int []ar = {10,20,30,88,41,65};
		AList0 rr = new AList0(ar);
		int []res = rr.toArray();
		assertArrayEquals(res,ar);
	}
	@Test
	public void testToArray_two()
	{
		int []ar = {10,20};
		AList0 rr = new AList0(ar);
		int []res = rr.toArray();
		assertArrayEquals(res,ar);
	}
	@Test
	public void testToArray_one()
	{
		int []ar = {10};
		AList0 rr = new AList0(ar);
		int []res = rr.toArray();
		assertArrayEquals(res,ar);
	}
	@Test 
	public void testToArray_0()
	{
		int []ar = {};
		AList0 rr = new AList0(ar);
		int []res = rr.toArray();
		assertArrayEquals(res,ar);
	}
	@Test (expected = IllegalArgumentException.class)
	public void testToArray_null()
	{
		int []ar = null;
		AList0 rr = new AList0(ar);
		rr.toArray();
	}

	/*---------------------
	 Test function toString
	 --------------------*/

	@Test
	public void testToString_many() 
	{
		int []ar = {10,20,30,88,41,65};
		AList0 rr = new AList0(ar);
		String str = "10 20 30 88 41 65 ";
		String res = rr.toString();
		assertEquals(res,str);
	}
	@Test
	public void testToString_two() 
	{
		int []ar = {10,20};
		AList0 rr = new AList0(ar);
		String str = "10 20 ";
		String res = rr.toString();
		assertEquals(res,str);
	}
	@Test
	public void testToString_one() 
	{
		int []ar = {10};
		AList0 rr = new AList0(ar);
		String str = "10 ";
		String res = rr.toString();
		assertEquals(res,str);
	}
	@Test
	public void testToString_0() 
	{
		int []ar = {};
		AList0 rr = new AList0(ar);
		String str = "";
		String res = rr.toString();
		assertEquals(res,str);
	}
	@Test (expected = IllegalArgumentException.class)
	public void testToString_null()
	{
		int []ar = null;
		AList0 rr = new AList0(ar);
		rr.toString();
	}

	/*---------------------
	 Test function addStart
	 --------------------*/

	@Test
	public void testAddStart_many() 
	{
		int []ar = {10,20,30,88,41,65};
		AList0 rr = new AList0(ar);
		int add = 55;	
		rr.addStart(add);
		int []res = {55,10,20,30,88,41,65};
		assertArrayEquals(res,rr.toArray());
	}
	@Test
	public void testAddStart_two() 
	{
		int []ar = {10,20};
		AList0 rr = new AList0(ar);
		int add = 55;	
		rr.addStart(add);
		int []res = {55,10,20};
		assertArrayEquals(res,rr.toArray());
	}
	@Test
	public void testAddStart_one() 
	{
		int []ar = {10};
		AList0 rr = new AList0(ar);
		int add = 55;	
		rr.addStart(add);
		int []res = {55,10};
		assertArrayEquals(res,rr.toArray());
	}
	@Test
	public void testAddStart_0() 
	{
		int []ar = {};
		AList0 rr = new AList0(ar);
		int add = 55;	
		rr.addStart(add);
		int []res = {55};
		assertArrayEquals(res,rr.toArray());
	}
	@Test (expected = IllegalArgumentException.class)
	public void testAddStart_null()
	{
		int []ar = null;
		AList0 rr = new AList0(ar);
		int add = 55;
		rr.addStart(add);
	}

	/*-------------------
	 Test function addEnd
	 ------------------*/

	@Test
	public void testAddEnd_many() 
	{
		int []ar = {10,20,30,88,41,65};
		AList0 rr = new AList0(ar);
		int add = 55;	
		rr.addEnd(add);
		int []res = {10,20,30,88,41,65,55};
		assertArrayEquals(res,rr.toArray());
	}
	@Test
	public void testAddEnd_two() 
	{
		int []ar = {10,20};
		AList0 rr = new AList0(ar);
		int add = 55;	
		rr.addEnd(add);
		int []res = {10,20,55};
		assertArrayEquals(res,rr.toArray());
	}
	@Test
	public void testAddEnd_one() 
	{
		int []ar = {10};
		AList0 rr = new AList0(ar);
		int add = 55;	
		rr.addEnd(add);
		int []res = {10,55};
		assertArrayEquals(res,rr.toArray());
	}
	@Test
	public void testAddEnd_0() 
	{
		int []ar = {};
		AList0 rr = new AList0(ar);
		int add = 55;	
		rr.addEnd(add);
		int []res = {55};
		assertArrayEquals(res,rr.toArray());
	}
	@Test (expected = IllegalArgumentException.class)
	public void testAddEnd_null() 
	{
		int []ar = null;
		AList0 rr = new AList0(ar);
		int add = 55;	
		rr.addEnd(add);
	}

	/*-------------------
	 Test function addPos
	 ------------------*/

	@Test
	public void testAddPos_many()
	{
		int []ar = {10,20,30,88,41,65};
		AList0 rr = new AList0(ar);
		int pos = 2;
		int val = 55;		
		rr.addPos(pos, val);
		int []res= {10,20,55,30,88,41,65};
		assertArrayEquals(res,rr.toArray());
	}
	@Test
	public void testAddPos_two()
	{
		int []ar = {10,20};
		AList0 rr = new AList0(ar);
		int pos = 2;
		int val = 55;		
		rr.addPos(pos, val);
		int []res= {10,20,55};
		assertArrayEquals(res,rr.toArray());
	}
	@Test
	public void testAddPos_one()
	{
		int []ar = {10};
		AList0 rr = new AList0(ar);
		int pos = 1;
		int val = 55;		
		rr.addPos(pos, val);
		int []res= {10,55};
		assertArrayEquals(res,rr.toArray());
	}
	@Test (expected = ArrayIndexOutOfBoundsException.class)
	public void testAddPos_one1()
	{
		int []ar = {10};
		AList0 rr = new AList0(ar);
		int pos = 2;
		int val = 55;		
		rr.addPos(pos, val);
	}
	@Test 
	public void testAddPos_0()
	{
		int []ar = {};
		AList0 rr = new AList0(ar);
		int pos = 0;
		int val = 55;		
		rr.addPos(pos, val);
		int []res = {55};
		assertArrayEquals(res,rr.toArray());
	}
	@Test (expected = ArrayIndexOutOfBoundsException.class)
	public void testAddPos_0exc()
	{
		int []ar = {};
		AList0 rr = new AList0(ar);
		int pos = 2;
		int val = 55;		
		rr.addPos(pos, val);
	}
	@Test (expected = IllegalArgumentException.class)
	public void testAddPos_null()
	{
		int []ar = null;
		AList0 rr = new AList0(ar);
		int pos = 2;
		int val = 55;
		rr.addPos(pos,val);
	}

	/*---------------------
	 Test function delStart
	 ---------------------*/

	@Test
	public void testDelStart_many() 
	{
		int []ar = {10,20,30,88,41,65};
		AList0 rr = new AList0(ar);
		int resVal = rr.delStart();
		int []res = {20,30,88,41,65};
		assertArrayEquals(res,rr.toArray());
		assertEquals(10,resVal);
	}
	@Test
	public void testDelStart_two() 
	{
		int []ar = {10,20};
		AList0 rr = new AList0(ar);
		int resVal = rr.delStart();
		int []res = {20};
		assertArrayEquals(res,rr.toArray());
		assertEquals(10,resVal);
	}
	@Test
	public void testDelStart_one() 
	{
		int []ar = {10};
		AList0 rr = new AList0(ar);
		int resVal = rr.delStart();
		int []res = {};
		assertArrayEquals(res,rr.toArray());
		assertEquals(10,resVal);
	}
	@Test (expected = NegativeArraySizeException.class)
	public void testDelStart_0() 
	{
		int []ar = {};
		AList0 rr = new AList0(ar);
		rr.delStart();
	}
	@Test (expected = IllegalArgumentException.class)
	public void testDelStart_null()
	{
		int []ar = null;
		AList0 rr = new AList0(ar);
		rr.delStart();
	}

	/*-------------------
	 Test function delEnd
	 ------------------*/

	@Test
	public void testDelEnd_many() 
	{
		int []ar = {10,20,30,88,41,65};
		AList0 rr = new AList0(ar);
		int resVal = rr.delEnd();
		int []res = {10,20,30,88,41};
		assertArrayEquals(res,rr.toArray());
		assertEquals(65,resVal);
	}
	@Test
	public void testDelEnd_two() 
	{
		int []ar = {10,20};
		AList0 rr = new AList0(ar);
		int resVal = rr.delEnd();
		int []res = {10};
		assertEquals(20,resVal);
		assertArrayEquals(res,rr.toArray());
	}
	@Test
	public void testDelEnd_one() 
	{
		int []ar = {10};
		AList0 rr = new AList0(ar);
		int resVal = rr.delEnd();
		int []res = {};
		assertArrayEquals(res,rr.toArray());
		assertEquals(10,resVal);
	}
	@Test (expected = NegativeArraySizeException.class)
	public void testDelEnd_0() 
	{
		int []ar = {};
		AList0 rr = new AList0(ar);
		rr.delEnd();
	}
	@Test (expected = IllegalArgumentException.class)
	public void testDelEnd_null()
	{
		int []ar = null;
		AList0 rr = new AList0(ar);
		rr.delEnd();
	}

	/*-----------------------
	 Test function testDelPos
	 ----------------------*/

	@Test
	public void testDelPos_many() 
	{
		int []ar = {10,20,30,88,41,65};
		AList0 rr = new AList0(ar);
		int pos = 2;
		int resVal = rr.delPos(pos);
		int []res = {10,20,88,41,65};
		assertArrayEquals(res,rr.toArray());
		assertEquals(30,resVal);
	}
	@Test(expected = ArrayIndexOutOfBoundsException.class)
	public void testDelPos_manyExc()
	{
		int []ar = {10,20,30,88,41,65};
		AList0 rr = new AList0(ar);
		int pos = 7;
		rr.delPos(pos);
	}
	@Test
	public void testDelPos_two() 
	{
		int []ar = {10,20};
		AList0 rr = new AList0(ar);
		int pos = 1;
		int resVal = rr.delPos(pos);
		int []res = {10};
		assertArrayEquals(res,rr.toArray());
		assertEquals(20,resVal);
	}
	@Test
	public void testDelPos_one() 
	{
		int []ar = {10};
		AList0 rr = new AList0(ar);
		int pos = 0;
		int resVal = rr.delPos(pos);
		int []res = {};
		assertArrayEquals(res,rr.toArray());
		assertEquals(10,resVal);
	}
	@Test (expected = NegativeArraySizeException.class)
	public void testDelPos_0() 
	{
		int []ar = {};
		AList0 rr = new AList0(ar);
		int pos = 0;
		rr.delPos(pos);
	}
	@Test (expected = IllegalArgumentException.class)
	public void testDelPos_null() 
	{
		int []ar = null;
		AList0 rr = new AList0(ar);
		int pos = 0;
		rr.delPos(pos);
	}

	/*-------------------
	Test function testSet 
	-------------------*/

	@Test
	public void testSet_many() 
	{
		int []ar = {10,20,30,88,41,65};
		AList0 rr = new AList0(ar);
		int pos = 2;
		int val = 3;
		rr.set(pos, val);
		int []res = {10,20,3,88,41,65};
		assertArrayEquals(res,rr.toArray());
	}
	@Test (expected = ArrayIndexOutOfBoundsException.class)
	public void testSet_manyExc() 
	{
		int []ar = {10,20,30,88,41,65};
		AList0 rr = new AList0(ar);
		int pos = 7;
		int val = 3;
		rr.set(pos, val);
	}
	@Test
	public void testSet_two() 
	{
		int []ar = {10,20};
		AList0 rr = new AList0(ar);
		int pos = 1;
		int val = 3;
		rr.set(pos, val);
		int []res = {10,3};
		assertArrayEquals(res,rr.toArray());
	}
	@Test
	public void testSet_one() 
	{
		int []ar = {10};
		AList0 rr = new AList0(ar);
		int pos = 0;
		int val = 3;
		rr.set(pos, val);
		int []res = {3};
		assertArrayEquals(res,rr.toArray());
	}
	@Test (expected = ArrayIndexOutOfBoundsException.class)
	public void testSet_0() 
	{
		int []ar = {};
		AList0 rr = new AList0(ar);
		int pos = 0;
		int val = 3;		
		rr.set(pos, val);
	}
	@Test (expected = IllegalArgumentException.class)
	public void testSet_null()
	{
		int []ar = null;
		AList0 rr = new AList0(ar);
		int pos = 3;
		int val = 3;
		rr.set(pos, val);
	}

	/*----------------
	 Test function get
	 ---------------*/

	@Test
	public void testGet_many() 
	{
		int []ar = {10,20,30,88,41,65};
		AList0 rr = new AList0(ar);
		int pos = 3;
		int res = rr.get(pos);
		assertEquals(88,res);
	}
	@Test (expected = ArrayIndexOutOfBoundsException.class)
	public void testGet_manyExc() 
	{
		int []ar = {10,20,30,88,41,65};
		AList0 rr = new AList0(ar);
		int pos = 7;
		rr.get(pos);;
	}
	@Test
	public void testGet_two() 
	{
		int []ar = {10,20};
		AList0 rr = new AList0(ar);
		int pos = 1;
		int res = rr.get(pos);
		assertEquals(20,res);
	}
	@Test
	public void testGet_one() 
	{
		int []ar = {10};
		AList0 rr = new AList0(ar);
		int pos = 0;
		int res = rr.get(pos);
		assertEquals(10,res);
	}
	@Test (expected = ArrayIndexOutOfBoundsException.class)
	public void testGet_0() 
	{
		int []ar = {};
		AList0 rr = new AList0(ar);
		int pos = 0;
		rr.get(pos);
	}
	@Test (expected = IllegalArgumentException.class)
	public void testGet_null() 
	{
		int []ar = null;
		AList0 rr = new AList0(ar);
		int pos = 0;
		rr.get(pos);
	}

	/*--------------------
	 Test function minElem
	------------------- */

	@Test
	public void testMinElem_many() 
	{
		int []ar = {10,20,30,88,41,65};
		AList0 rr = new AList0(ar);
		int min = rr.minElem();
		assertEquals(10,min);
	}
	@Test
	public void testMinElem_two() 
	{
		int []ar = {10,20};
		AList0 rr = new AList0(ar);
		int min = rr.minElem();
		assertEquals(10,min);
	}
	@Test
	public void testMinElem_one() 
	{
		int []ar = {10};
		AList0 rr = new AList0(ar);
		int min = rr.minElem();
		assertEquals(10,min);
	}
	@Test (expected = IllegalArgumentException.class)
	public void testMinElem_0() 
	{
		int []ar = {};
		AList0 rr = new AList0(ar);
		rr.minElem();
	}
	@Test (expected = IllegalArgumentException.class)
	public void testMinElem_null() 
	{
		int []ar = null;
		AList0 rr = new AList0(ar);
		rr.minElem();
	}

	/*--------------------
	 Test function maxElem
	 -------------------*/

	@Test
	public void testMaxElem_many() 
	{
		int []ar = {10,20,30,88,41,65};
		AList0 rr = new AList0(ar);
		int max = rr.maxElem();
		assertEquals(88,max);
	}
	@Test
	public void testMaxElem_two() 
	{
		int []ar = {10,20};
		AList0 rr = new AList0(ar);
		int max = rr.maxElem();
		assertEquals(20,max);
	}
	@Test
	public void testMaxElem_one() 
	{
		int []ar = {20};
		AList0 rr = new AList0(ar);
		int max = rr.maxElem();
		assertEquals(20,max);
	}
	@Test (expected = IllegalArgumentException.class)
	public void testMaxElem_0() 
	{
		int []ar = {};
		AList0 rr = new AList0(ar);
		rr.maxElem();	
	}
	@Test (expected = IllegalArgumentException.class)
	public void testMaxElem_null() 
	{
		int []ar = null;
		AList0 rr = new AList0(ar);
		rr.maxElem();	
	}
	/*-------------------
	 Test function minInd
	 ------------------*/

	@Test
	public void testMinInd_many() 
	{
		int []ar = {10,20,30,88,41,65};
		AList0 rr = new AList0(ar);
		int min = rr.minInd();
		assertEquals(0,min);
	}
	@Test
	public void testMinInd_two() 
	{
		int []ar = {10,20};
		AList0 rr = new AList0(ar);
		int min = rr.minInd();
		assertEquals(0,min);
	}
	@Test
	public void testMinInd_one() 
	{
		int []ar = {10};
		AList0 rr = new AList0(ar);
		int min = rr.minInd();
		assertEquals(0,min);
	}
	@Test (expected = IllegalArgumentException.class)
	public void testMinInd_0() 
	{
		int []ar = {};
		AList0 rr = new AList0(ar);
		rr.minInd();
	}
	@Test (expected = IllegalArgumentException.class)
	public void testMinInd_null() 
	{
		int []ar = null;
		AList0 rr = new AList0(ar);
		rr.minInd();
	}

	/*-------------------
	 Test function maxInd
	-------------------*/

	@Test
	public void testMaxInd_many() 
	{
		int []ar = {10,20,30,88,41,65};
		AList0 rr = new AList0(ar);
		int max = rr.maxInd();
		assertEquals(3,max);
	}
	@Test
	public void testMaxInd_two() 
	{
		int []ar = {10,20};
		AList0 rr = new AList0(ar);
		int max = rr.maxInd();
		assertEquals(1,max);
	}
	@Test
	public void testMaxInd_one() 
	{
		int []ar = {10};
		AList0 rr = new AList0(ar);
		int max = rr.maxInd();
		assertEquals(0,max);
	}
	@Test (expected = IllegalArgumentException.class)
	public void testMaxInd_0() 
	{
		int []ar = {};
		AList0 rr = new AList0(ar);
		rr.maxInd();
	}
	@Test (expected = IllegalArgumentException.class)
	public void testMaxInd_null() 
	{
		int []ar = null;
		AList0 rr = new AList0(ar);
		rr.maxInd();
	}

	/*--------------------
	 Test function reverse
	 -------------------*/

	@Test
	public void testReverse_many() 
	{
		int []ar = {10,20,30,88,41,65};
		AList0 rr = new AList0(ar);
		rr.reverse();
		int []res = {65,41,88,30,20,10};
		assertArrayEquals(res,rr.toArray());
	}
	@Test
	public void testReverse_two() 
	{
		int []ar = {10,20};
		AList0 rr = new AList0(ar);
		rr.reverse();
		int []res = {20,10};
		assertArrayEquals(res,rr.toArray());
	}
	@Test
	public void testReverse_one() 
	{
		int []ar = {10};
		AList0 rr = new AList0(ar);
		rr.reverse();
		int []res = {10};
		assertArrayEquals(res,rr.toArray());
	}
	@Test(expected = IllegalArgumentException.class)
	public void testReverse_0()
	{
		int []ar = {};
		AList0 rr = new AList0(ar);
		rr.reverse();
	}
	@Test(expected = IllegalArgumentException.class)
	public void testReverse_null()
	{
		int []ar = null;
		AList0 rr = new AList0(ar);
		rr.reverse();
	}

	/*------------------------
	 Test function reverseHalf
	 -----------------------*/

	@Test
	public void testReverseHalf_many() 
	{
		int []ar = {10,20,30,88,41,65};
		AList0 rr = new AList0(ar);
		rr.reverseHalf();
		int []res = {88,41,65,10,20,30};
		assertArrayEquals(res,rr.toArray());
	}
	@Test
	public void testReverseHalf_manyOdd() 
	{
		int []ar = {10,20,30,88,41,65,71};
		AList0 rr = new AList0(ar);
		rr.reverseHalf();
		int []res = {41,65,71,88,10,20,30};
		assertArrayEquals(res,rr.toArray());
	}
	@Test
	public void testReverseHalf_two() 
	{
		int []ar = {10,20};
		AList0 rr = new AList0(ar);
		rr.reverseHalf();
		int []res = {20,10};
		assertArrayEquals(res,rr.toArray());
	}
	@Test
	public void testReverseHalf_one() 
	{
		int []ar = {10};
		AList0 rr = new AList0(ar);
		rr.reverseHalf();
		int []res = {10};
		assertArrayEquals(res,rr.toArray());
	}
	@Test(expected = IllegalArgumentException.class)
	public void testReverseHalf_0()
	{
		int []ar = {};
		AList0 rr = new AList0(ar);
		rr.reverseHalf();
	}
	@Test(expected = IllegalArgumentException.class)
	public void testReverseHalf_null()
	{
		int []ar = null;
		AList0 rr = new AList0(ar);
		rr.reverseHalf();
	}

	/*-----------------------
	 Test function sortSelect
	 ----------------------*/

	@Test
	public void testSortSelect_many() 
	{
		int []ar = {10,20,30,88,41,65,71};
		AList0 rr = new AList0(ar);
		rr.sortSelect();
		int []res = {10,20,30,41,65,71,88};
		assertArrayEquals(res,rr.toArray());
	}
	@Test
	public void testSortSelect_two() 
	{
		int []ar = {20,10};
		AList0 rr = new AList0(ar);
		rr.sortSelect();
		int []res = {10,20};
		assertArrayEquals(res,rr.toArray());
	}
	@Test
	public void testSortSelect_one() 
	{
		int []ar = {10};
		AList0 rr = new AList0(ar);
		rr.sortSelect();
		int []res = {10};
		assertArrayEquals(res,rr.toArray());
	}
	@Test (expected = IllegalArgumentException.class)
	public void testSortSelect_0() 
	{
		int []ar = {};
		AList0 rr = new AList0(ar);
		rr.sortSelect();
	}
	@Test (expected = IllegalArgumentException.class)
	public void testSortSelect_null() 
	{
		int []ar = null;
		AList0 rr = new AList0(ar);
		rr.sortSelect();
	}
}
