import static org.junit.Assert.*;
import org.junit.Test;
public class NumberToWordsTes_2
{
	@Test (expected = IllegalArgumentException.class)
	public void testNumberToWords_Neg1()
	{
		int n = -1;
		HW4.numberToWords(n);
	}
	@Test (expected = IllegalArgumentException.class)
	public void testNumberToWords_1000()
	{
		int n = 1000;
		HW4.numberToWords(n);
	}
	@Test
	public void testNumberToWords_1()
	{
		int n = 1;
		String res ="����";
		assertEquals(res,HW4.numberToWords(n));
	}
	@Test
	public void testNumberToWords_2()
	{
		int n = 2;
		String res ="���";
		assertEquals(res,HW4.numberToWords(n));
	}
	@Test
	public void testNumberToWords_3()
	{
		int n = 3;
		String res ="���";
		assertEquals(res,HW4.numberToWords(n));
	}
	@Test
	public void testNumberToWords_4()
	{
		int n = 4;
		String res ="������";
		assertEquals(res,HW4.numberToWords(n));
	}
	@Test
	public void testNumberToWords_5()
	{
		int n = 5;
		String res ="����";
		assertEquals(res,HW4.numberToWords(n));
	}
	@Test
	public void testNumberToWords_6()
	{
		int n = 6;
		String res ="�����";
		assertEquals(res,HW4.numberToWords(n));
	}
	@Test
	public void testNumberToWords_7()
	{
		int n = 7;
		String res ="����";
		assertEquals(res,HW4.numberToWords(n));
	}
	@Test
	public void testNumberToWords_8()
	{
		int n = 8;
		String res ="������";
		assertEquals(res,HW4.numberToWords(n));
	}
	@Test
	public void testNumberToWords_9()
	{
		int n = 9;
		String res ="������";
		assertEquals(res,HW4.numberToWords(n));
	}
	@Test
	public void testNumberToWords_10()
	{
		int n = 10;
		String res ="������";
		assertEquals(res,HW4.numberToWords(n));
	}
	@Test
	public void testNumberToWords_11()
	{
		int n = 11;
		String res ="�����������";
		assertEquals(res,HW4.numberToWords(n));
	}
	@Test
	public void testNumberToWords_12()
	{
		int n = 12;
		String res ="����������";
		assertEquals(res,HW4.numberToWords(n));
	}
	@Test
	public void testNumberToWords_14()
	{
		int n = 14;
		String res ="������������";
		assertEquals(res,HW4.numberToWords(n));
	}
	@Test
	public void testNumberToWords_15()
	{
		int n = 15;
		String res ="����������";
		assertEquals(res,HW4.numberToWords(n));
	}
	@Test
	public void testNumberToWords_16()
	{
		int n = 16;
		String res ="�����������";
		assertEquals(res,HW4.numberToWords(n));
	}
	@Test
	public void testNumberToWords_17()
	{
		int n = 17;
		String res ="����������";
		assertEquals(res,HW4.numberToWords(n));
	}
	@Test
	public void testNumberToWords_18()
	{
		int n = 18;
		String res ="������������";
		assertEquals(res,HW4.numberToWords(n));
	}
	@Test
	public void testNumberToWords_19()
	{
		int n = 19;
		String res ="������������";
		assertEquals(res,HW4.numberToWords(n));
	}
	@Test
	public void testNumberToWords_20()
	{
		int n = 20;
		String res ="��������";
		assertEquals(res,HW4.numberToWords(n));
	}
	@Test
	public void testNumberToWords_25()
	{
		int n = 25;
		String res ="�������� ����";
		assertEquals(res,HW4.numberToWords(n));
	}
	@Test
	public void testNumberToWords_29()
	{
		int n = 29;
		String res ="�������� ������";
		assertEquals(res,HW4.numberToWords(n));
	}
	@Test
	public void testNumberToWords_30()
	{
		int n = 30;
		String res ="��������";
		assertEquals(res,HW4.numberToWords(n));
	}
	@Test
	public void testNumberToWords_35()
	{
		int n = 35;
		String res ="�������� ����";
		assertEquals(res,HW4.numberToWords(n));
	}
	@Test
	public void testNumberToWords_39()
	{
		int n = 39;
		String res ="�������� ������";
		assertEquals(res,HW4.numberToWords(n));
	}
	@Test
	public void testNumberToWords_40()
	{
		int n = 40;
		String res ="�����";
		assertEquals(res,HW4.numberToWords(n));
	}
	@Test
	public void testNumberToWords_45()
	{
		int n = 45;
		String res ="����� ����";
		assertEquals(res,HW4.numberToWords(n));
	}
	@Test
	public void testNumberToWords_49()
	{
		int n = 49;
		String res ="����� ������";
		assertEquals(res,HW4.numberToWords(n));
	}
	@Test
	public void testNumberToWords_50()
	{
		int n = 50;
		String res ="���������";
		assertEquals(res,HW4.numberToWords(n));
	}
	@Test
	public void testNumberToWords_60()
	{
		int n = 60;
		String res ="����������";
		assertEquals(res,HW4.numberToWords(n));
	}
	@Test
	public void testNumberToWords_70()
	{
		int n = 70;
		String res ="���������";
		assertEquals(res,HW4.numberToWords(n));
	}
	public void testNumberToWords_80()
	{
		int n = 80;
		String res ="�����������";
		assertEquals(res,HW4.numberToWords(n));
	}
	public void testNumberToWords_90()
	{
		int n = 90;
		String res ="���������";
		assertEquals(res,HW4.numberToWords(n));
	}
	public void testNumberToWords_100()
	{
		int n = 100;
		String res ="���";
		assertEquals(res,HW4.numberToWords(n));
	}
	public void testNumberToWords_200()
	{
		int n = 200;
		String res ="������";
		assertEquals(res,HW4.numberToWords(n));
	}
	public void testNumberToWords_300()
	{
		int n = 300;
		String res ="������";
		assertEquals(res,HW4.numberToWords(n));
	}
	public void testNumberToWords_400()
	{
		int n = 50;
		String res ="���������";
		assertEquals(res,HW4.numberToWords(n));
	}
	public void testNumberToWords_452()
	{
		int n = 452;
		String res ="��������� ��������� ���";
		assertEquals(res,HW4.numberToWords(n));
	}
	public void testNumberToWords_500()
	{
		int n = 500;
		String res ="�������";
		assertEquals(res,HW4.numberToWords(n));
	}
	public void testNumberToWords_600()
	{
		int n = 600;
		String res ="��������";
		assertEquals(res,HW4.numberToWords(n));
	}
	public void testNumberToWords_700()
	{
		int n = 700;
		String res ="���������";
		assertEquals(res,HW4.numberToWords(n));
	}
	public void testNumberToWords_800()
	{
		int n = 800;
		String res ="���������";
		assertEquals(res,HW4.numberToWords(n));
	}
	public void testNumberToWords_900()
	{
		int n = 900;
		String res ="���������";
		assertEquals(res,HW4.numberToWords(n));
	}
}
