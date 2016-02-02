import static org.junit.Assert.*;

import org.junit.Test;

public class CalcEvalTest_5
{

	@Test (expected = IllegalArgumentException.class)
	public void testCalcEval_0()
	{	
		HW1.calcEval(0);	
	}
	@Test
	public void testCalcEval_1()
	{
		char res = HW1.calcEval(1);
		assertEquals('F',res);
	}
	@Test
	public void testCalcEval_4() 
	{
		char res = HW1.calcEval(4);
		assertEquals('F',res);
	}
	@Test
	public void testCalcEval_19() 
	{
		char res = HW1.calcEval(19);
		assertEquals('F',res);
	}
	@Test
	public void testCalcEval_20() 
	{
		char res = HW1.calcEval(20);
		assertEquals('E',res);
	}
	@Test
	public void testCalcEval_30() 
	{
		char res = HW1.calcEval(30);
		assertEquals('E',res);
	}
	@Test
	public void testCalcEval_39() 
	{
		char res = HW1.calcEval(39);
		assertEquals('E',res);
	}
	@Test
	public void testCalcEval_40() 
	{
		char res = HW1.calcEval(40);
		assertEquals('D',res);
	}
	@Test
	public void testCalcEval_50() 
	{
		char res = HW1.calcEval(50);
		assertEquals('D',res);
	}
	@Test
	public void testCalcEval_59() 
	{
		char res = HW1.calcEval(59);
		assertEquals('D',res);
	}
	@Test
	public void testCalcEval_60() 
	{
		char res = HW1.calcEval(60);
		assertEquals('C',res);
	}
	@Test
	public void testCalcEval_70() 
	{
		char res = HW1.calcEval(70);
		assertEquals('C',res);
	}
	@Test
	public void testCalcEval_74() 
	{
		char res = HW1.calcEval(74);
		assertEquals('C',res);
	}
	@Test
	public void testCalcEval_75() 
	{
		char res = HW1.calcEval(75);
		assertEquals('B',res);
	}
	@Test
	public void testCalcEval_80() 
	{
		char res = HW1.calcEval(80);
		assertEquals('B',res);
	}
	@Test
	public void testCalcEval_89() 
	{
		char res = HW1.calcEval(89);
		assertEquals('B',res);
	}
	@Test
	public void testCalcEval_90() 
	{
		char res = HW1.calcEval(90);
		assertEquals('A',res);
	}
	@Test
	public void testCalcEval_95() 
	{
		char res = HW1.calcEval(95);
		assertEquals('A',res);
	}
	@Test
	public void testCalcEval_100() 
	{
		char res = HW1.calcEval(100);
		assertEquals('A',res);
	}
	@Test (expected = IllegalArgumentException.class)
	public void testCalcEval_101() 
	{
		HW1.calcEval(101);		
	}
}
