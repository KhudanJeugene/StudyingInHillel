import static org.junit.Assert.*;

import org.junit.Test;

public class HW2Test
{
	//=====================
	//calcSum
	//=====================

	@Test
	public void testCalcSumt() 
	{
		int res = HW2.calcSum();
		assertEquals(2450,res);
	}
	
	//======================
	//calcCount
	//======================
	
	@Test
	public void testCalcCount() 
	{
		int res = HW2.calcCount();
		assertEquals(49,res);
	}
	
	//=======================
	//findSimple
	//=======================
	
	@Test
	public void testFindSimple_NoSimple()
	{
		boolean res = HW2.findSimple(16);
		assertEquals(false,res);
	}
	@Test
	public void testFindSimple_Simple() 
	{
		boolean res = HW2.findSimple(17);
		assertEquals(true,res);
	}
	@Test (expected = IllegalArgumentException.class)
	public void testFindSimple_Exc()
	{
		HW2.findSimple(0);
	}
	
	//=====================
	//findRoot
	//=====================
	
	@Test
	public void testFindRoot_17()
	{
		int res = HW2.findRoot(17);
		assertEquals(4,res);
	}
	@Test
	public void testFindRoot_16()
	{
		int res = HW2.findRoot(16);
		assertEquals(4,res);
	}
	@Test
	public void testFindRoot_0()
	{
		int res = HW2.findRoot(0);
		assertEquals(0,res);
	}
	@Test (expected = IllegalArgumentException.class)
	public void testFindRoot_NegNumb()
	{
		HW2.findRoot(-1);
	}
	
	//======================
	//findRootBin
	//======================

	@Test
	public void testFindRoot_1()
	{
		int res = HW2.findRootBin(17);
		assertEquals(4,res);
	}
	@Test
	public void testFindRoot_2()
	{
		int res = HW2.findRootBin(16);
		assertEquals(4,res);
	}
	@Test
	public void testFindRoot_3()
	{
		int res = HW2.findRootBin(0);
		assertEquals(0,res);
	}
	@Test (expected = IllegalArgumentException.class)
	public void testFindRoot_4()
	{		
		HW2.findRootBin(-1);
	}
	
	//====================
	//factorial
	//====================
	
	@Test
	public void testFactorial_5()
	{
		int res = HW2.factorial(5);
		assertEquals(120,res);
	}
	@Test
	public void testFactorial_1()
	{
		int res = HW2.factorial(1);
		assertEquals(1,res);
	}
	@Test (expected = IllegalArgumentException.class)
	public void testFactorial_0()
	{	
		HW2.factorial(0);
	}
	@Test (expected = IllegalArgumentException.class)
	public void testFactorial_NegNumb()
	{	
		HW2.factorial(-1);
	}
	
	//=====================
	//sumDig
	//=====================
	
	@Test
	public void testsumDig_1()
	{
		int res = HW2.sumDig(0);
		assertEquals(0,res);
	}
	@Test
	public void testsumDig_2()
	{
		int res = HW2.sumDig(1);
		assertEquals(1,res);
	}
	@Test
	public void testsumDig_3()
	{
		int res = HW2.sumDig(123);
		assertEquals(6,res);
	}
	@Test
	public void testsumDig_4()
	{
		int res = HW2.sumDig(-123);
		assertEquals(6,res);
	}
	
	//=====================
	//mirror
	//=====================
	
	@Test
	public void testMirror_Neg152()
	{
		int res = HW2.mirror(-152);
		assertEquals(-251,res);
	}
	@Test
	public void testMirror_152()
	{
		int res = HW2.mirror(152);
		assertEquals(251,res);
	}
	@Test
	public void testMirror_23()
	{
		int res = HW2.mirror(23);
		assertEquals(32,res);
	}
	@Test
	public void testMirror_1()
	{
		int res = HW2.mirror(1);
		assertEquals(1,res);
	}
	@Test
	public void testMirror_0()
	{
		int res = HW2.mirror(0);
		assertEquals(0,res);
	}
}
