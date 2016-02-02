import static org.junit.Assert.*;

import org.junit.Test;

public class FindIntTest_4_3
{

	@Test (expected = IllegalArgumentException.class)
	public void testFindInt_null()
	{
		String word = null;
		HW4.findInt(word);
	}
	@Test (expected = IllegalArgumentException.class)
	public void testFindInt_empty()
	{
		String word = "";
		HW4.findInt(word);
	}
	@Test 
	public void testFindInt_0()
	{
		String word = "����";
		int res=0;
		assertEquals(res, HW4.findInt(word));
	}
	@Test 
	public void testFindInt_1()
	{
		String word = "����";
		int res=1;
		assertEquals(res, HW4.findInt(word));
	}
	@Test 
	public void testFindInt_2()
	{
		String word = "���";
		int res=2;
		assertEquals(res, HW4.findInt(word));
	}
	@Test 
	public void testFindInt_3()
	{
		String word = "���";
		int res=3;
		assertEquals(res, HW4.findInt(word));
	}
	@Test 
	public void testFindInt_4()
	{
		String word = "������";
		int res=4;
		assertEquals(res, HW4.findInt(word));
	}
	@Test 
	public void testFindInt_5()
	{
		String word = "����";
		int res=5;
		assertEquals(res, HW4.findInt(word));
	}
	@Test 
	public void testFindInt_7()
	{
		String word = "����";
		int res=7;
		assertEquals(res, HW4.findInt(word));
	}
	@Test 
	public void testFindInt_8()
	{
		String word = "������";
		int res=8;
		assertEquals(res, HW4.findInt(word));
	}
	@Test 
	public void testFindInt_9()
	{
		String word = "������";
		int res=9;
		assertEquals(res, HW4.findInt(word));
	}
	@Test 
	public void testFindInt_10()
	{
		String word = "������";
		int res=10;
		assertEquals(res, HW4.findInt(word));
	}
	@Test 
	public void testFindInt_11()
	{
		String word = "�����������";
		int res=11;
		assertEquals(res, HW4.findInt(word));
	}
	@Test 
	public void testFindInt_12()
	{
		String word = "����������";
		int res=12;
		assertEquals(res, HW4.findInt(word));
	}
	@Test 
	public void testFindInt_13()
	{
		String word = "����������";
		int res=13;
		assertEquals(res, HW4.findInt(word));
	}
	@Test 
	public void testFindInt_14()
	{
		String word = "������������";
		int res=14;
		assertEquals(res, HW4.findInt(word));
	}
	@Test 
	public void testFindInt_15()
	{
		String word = "����������";
		int res=15;
		assertEquals(res, HW4.findInt(word));
	}
	@Test 
	public void testFindInt_16()
	{
		String word = "�����������";
		int res=16;
		assertEquals(res, HW4.findInt(word));
	}
	@Test 
	public void testFindInt_17()
	{
		String word = "����������";
		int res=17;
		assertEquals(res, HW4.findInt(word));
	}
	@Test 
	public void testFindInt_18()
	{
		String word = "������������";
		int res=18;
		assertEquals(res, HW4.findInt(word));
	}
	@Test 
	public void testFindInt_19()
	{
		String word = "������������";
		int res=19;
		assertEquals(res, HW4.findInt(word));
	}
	@Test 
	public void testFindInt_20()
	{
		String word = "��������";
		int res=20;
		assertEquals(res, HW4.findInt(word));
	}
	@Test 
	public void testFindInt_25()
	{
		String word = "�������� ����";
		int res=25;
		assertEquals(res, HW4.findInt(word));
	}
	@Test 
	public void testFindInt_30()
	{
		String word = "��������";
		int res=30;
		assertEquals(res, HW4.findInt(word));
	}
	@Test 
	public void testFindInt_35()
	{
		String word = "�������� ����";
		int res=35;
		assertEquals(res, HW4.findInt(word));
	}
	@Test 
	public void testFindInt_40()
	{
		String word = "�����";
		int res=40;
		assertEquals(res, HW4.findInt(word));
	}
	@Test 
	public void testFindInt_50()
	{
		String word = "���������";
		int res=50;
		assertEquals(res, HW4.findInt(word));
	}
	@Test 
	public void testFindInt_60()
	{
		String word = "����������";
		int res=60;
		assertEquals(res, HW4.findInt(word));
	}
	@Test 
	public void testFindInt_70()
	{
		String word = "���������";
		int res=70;
		assertEquals(res, HW4.findInt(word));
	}
	@Test 
	public void testFindInt_80()
	{
		String word = "�����������";
		int res=80;
		assertEquals(res, HW4.findInt(word));
	}
	@Test 
	public void testFindInt_90()
	{
		String word = "���������";
		int res=90;
		assertEquals(res, HW4.findInt(word));
	}
	@Test 
	public void testFindInt_100()
	{
		String word = "���";
		int res=100;
		assertEquals(res, HW4.findInt(word));
	}
	@Test 
	public void testFindInt_101()
	{
		String word = "��� ����";
		int res=101;
		assertEquals(res, HW4.findInt(word));
	}
	@Test 
	public void testFindInt_111()
	{
		String word = "��� �����������";
		int res=111;
		assertEquals(res, HW4.findInt(word));
	}
	@Test 
	public void testFindInt_121()
	{
		String word = "��� �������� ����";
		int res=121;
		assertEquals(res, HW4.findInt(word));
	}
	@Test 
	public void testFindInt_200()
	{
		String word = "������";
		int res=200;
		assertEquals(res, HW4.findInt(word));
	}
	@Test 
	public void testFindInt_300()
	{
		String word = "������";
		int res=300;
		assertEquals(res, HW4.findInt(word));
	}
	@Test 
	public void testFindInt_400()
	{
		String word = "���������";
		int res=400;
		assertEquals(res, HW4.findInt(word));
	}
	@Test 
	public void testFindInt_500()
	{
		String word = "�������";
		int res=500;
		assertEquals(res, HW4.findInt(word));
	}
	@Test 
	public void testFindInt_600()
	{
		String word = "��������";
		int res=600;
		assertEquals(res, HW4.findInt(word));
	}
	@Test 
	public void testFindInt_700()
	{
		String word = "�������";
		int res=700;
		assertEquals(res, HW4.findInt(word));
	}
	@Test 
	public void testFindInt_800()
	{
		String word = "���������";
		int res=800;
		assertEquals(res, HW4.findInt(word));
	}
	@Test 
	public void testFindInt_900()
	{
		String word = "���������";
		int res=900;
		assertEquals(res, HW4.findInt(word));
	}
}
