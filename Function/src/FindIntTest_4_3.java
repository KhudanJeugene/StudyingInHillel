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
		String word = "ноль";
		int res=0;
		assertEquals(res, HW4.findInt(word));
	}
	@Test 
	public void testFindInt_1()
	{
		String word = "один";
		int res=1;
		assertEquals(res, HW4.findInt(word));
	}
	@Test 
	public void testFindInt_2()
	{
		String word = "два";
		int res=2;
		assertEquals(res, HW4.findInt(word));
	}
	@Test 
	public void testFindInt_3()
	{
		String word = "три";
		int res=3;
		assertEquals(res, HW4.findInt(word));
	}
	@Test 
	public void testFindInt_4()
	{
		String word = "четыре";
		int res=4;
		assertEquals(res, HW4.findInt(word));
	}
	@Test 
	public void testFindInt_5()
	{
		String word = "пять";
		int res=5;
		assertEquals(res, HW4.findInt(word));
	}
	@Test 
	public void testFindInt_7()
	{
		String word = "семь";
		int res=7;
		assertEquals(res, HW4.findInt(word));
	}
	@Test 
	public void testFindInt_8()
	{
		String word = "восемь";
		int res=8;
		assertEquals(res, HW4.findInt(word));
	}
	@Test 
	public void testFindInt_9()
	{
		String word = "девять";
		int res=9;
		assertEquals(res, HW4.findInt(word));
	}
	@Test 
	public void testFindInt_10()
	{
		String word = "десять";
		int res=10;
		assertEquals(res, HW4.findInt(word));
	}
	@Test 
	public void testFindInt_11()
	{
		String word = "одиннадцать";
		int res=11;
		assertEquals(res, HW4.findInt(word));
	}
	@Test 
	public void testFindInt_12()
	{
		String word = "двенадцать";
		int res=12;
		assertEquals(res, HW4.findInt(word));
	}
	@Test 
	public void testFindInt_13()
	{
		String word = "тринадцать";
		int res=13;
		assertEquals(res, HW4.findInt(word));
	}
	@Test 
	public void testFindInt_14()
	{
		String word = "четырнадцать";
		int res=14;
		assertEquals(res, HW4.findInt(word));
	}
	@Test 
	public void testFindInt_15()
	{
		String word = "пятнадцать";
		int res=15;
		assertEquals(res, HW4.findInt(word));
	}
	@Test 
	public void testFindInt_16()
	{
		String word = "шестнадцать";
		int res=16;
		assertEquals(res, HW4.findInt(word));
	}
	@Test 
	public void testFindInt_17()
	{
		String word = "семнадцать";
		int res=17;
		assertEquals(res, HW4.findInt(word));
	}
	@Test 
	public void testFindInt_18()
	{
		String word = "восемнадцать";
		int res=18;
		assertEquals(res, HW4.findInt(word));
	}
	@Test 
	public void testFindInt_19()
	{
		String word = "девятнадцать";
		int res=19;
		assertEquals(res, HW4.findInt(word));
	}
	@Test 
	public void testFindInt_20()
	{
		String word = "двадцать";
		int res=20;
		assertEquals(res, HW4.findInt(word));
	}
	@Test 
	public void testFindInt_25()
	{
		String word = "двадцать пять";
		int res=25;
		assertEquals(res, HW4.findInt(word));
	}
	@Test 
	public void testFindInt_30()
	{
		String word = "тридцать";
		int res=30;
		assertEquals(res, HW4.findInt(word));
	}
	@Test 
	public void testFindInt_35()
	{
		String word = "тридцать пять";
		int res=35;
		assertEquals(res, HW4.findInt(word));
	}
	@Test 
	public void testFindInt_40()
	{
		String word = "сорок";
		int res=40;
		assertEquals(res, HW4.findInt(word));
	}
	@Test 
	public void testFindInt_50()
	{
		String word = "пятьдесят";
		int res=50;
		assertEquals(res, HW4.findInt(word));
	}
	@Test 
	public void testFindInt_60()
	{
		String word = "шестьдесят";
		int res=60;
		assertEquals(res, HW4.findInt(word));
	}
	@Test 
	public void testFindInt_70()
	{
		String word = "семьдесят";
		int res=70;
		assertEquals(res, HW4.findInt(word));
	}
	@Test 
	public void testFindInt_80()
	{
		String word = "восемьдесят";
		int res=80;
		assertEquals(res, HW4.findInt(word));
	}
	@Test 
	public void testFindInt_90()
	{
		String word = "девяносто";
		int res=90;
		assertEquals(res, HW4.findInt(word));
	}
	@Test 
	public void testFindInt_100()
	{
		String word = "сто";
		int res=100;
		assertEquals(res, HW4.findInt(word));
	}
	@Test 
	public void testFindInt_101()
	{
		String word = "сто один";
		int res=101;
		assertEquals(res, HW4.findInt(word));
	}
	@Test 
	public void testFindInt_111()
	{
		String word = "сто одиннадцать";
		int res=111;
		assertEquals(res, HW4.findInt(word));
	}
	@Test 
	public void testFindInt_121()
	{
		String word = "сто двадцать один";
		int res=121;
		assertEquals(res, HW4.findInt(word));
	}
	@Test 
	public void testFindInt_200()
	{
		String word = "двести";
		int res=200;
		assertEquals(res, HW4.findInt(word));
	}
	@Test 
	public void testFindInt_300()
	{
		String word = "триста";
		int res=300;
		assertEquals(res, HW4.findInt(word));
	}
	@Test 
	public void testFindInt_400()
	{
		String word = "четыреста";
		int res=400;
		assertEquals(res, HW4.findInt(word));
	}
	@Test 
	public void testFindInt_500()
	{
		String word = "пятьсот";
		int res=500;
		assertEquals(res, HW4.findInt(word));
	}
	@Test 
	public void testFindInt_600()
	{
		String word = "шестьсот";
		int res=600;
		assertEquals(res, HW4.findInt(word));
	}
	@Test 
	public void testFindInt_700()
	{
		String word = "семьсот";
		int res=700;
		assertEquals(res, HW4.findInt(word));
	}
	@Test 
	public void testFindInt_800()
	{
		String word = "восемьсот";
		int res=800;
		assertEquals(res, HW4.findInt(word));
	}
	@Test 
	public void testFindInt_900()
	{
		String word = "девятьсот";
		int res=900;
		assertEquals(res, HW4.findInt(word));
	}
}
