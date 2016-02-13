import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CalcUITest
{
	WebDriver drv = new FirefoxDriver();
	@Before
	public void testBefore()
	{
		drv.get("file:///E:/Workspace2/Calculator/Calculator.html");
	}
	
	//========================
	//
	//========================
	@Test
	public void test1()
	{
		drv.findElement( By.id("btn1")).click();
		String act = drv.findElement(By.id("res")).getAttribute("value");
		assertEquals("1",act);
	}
	@After
	public void testAfter()
	{
		drv.close();
	}

}
