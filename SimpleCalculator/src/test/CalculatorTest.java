import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class CalculatorTest
{
	private WebDriver driver;
	private String baseUrl;
	private boolean acceptNextAlert = true;
	private StringBuffer verificationErrors = new StringBuffer();

	@Before
	public void setUp() throws Exception 
	{
		driver = new FirefoxDriver();
		baseUrl = "file:///E:/Workspace2/SimpleCalculator/src/main/resources/Calculator.html";
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	@Test
	public void testAaa1() throws Exception 
	{
		driver.get(baseUrl + "file:///E:/Workspace2/SimpleCalculator/src/main/resources/Calculator.html");
		driver.findElement(By.id("1")).click();
		assertEquals("res", driver.findElement(By.tagName("BODY")).getText());
		driver.findElement(By.id("2")).click();
		assertEquals("res", driver.findElement(By.tagName("BODY")).getText());
		driver.findElement(By.id("+")).click();
		assertEquals("id=res", driver.findElement(By.tagName("BODY")).getText());
		driver.findElement(By.id("1")).click();
		driver.findElement(By.id("2")).click();
		assertEquals("res", driver.findElement(By.tagName("BODY")).getText());
		driver.findElement(By.id("=")).click();
		assertEquals("res", driver.findElement(By.tagName("BODY")).getText());
	}

	@After
	public void tearDown() throws Exception 
	{
		driver.quit();
		String verificationErrorString = verificationErrors.toString();
		if (!"".equals(verificationErrorString)) {
			fail(verificationErrorString);
		}
	}

	private boolean isElementPresent(By by) 
	{
		try {
			driver.findElement(by);
			return true;
		} catch (NoSuchElementException e) 
		{
			return false;
		}
	}

	private boolean isAlertPresent() 
	{
		try {
			driver.switchTo().alert();
			return true;
		} catch (NoAlertPresentException e) 
		{
			return false;
		}
	}

	private String closeAlertAndGetItsText() 
	{
		try 
		{
			Alert alert = driver.switchTo().alert();
			String alertText = alert.getText();
			if (acceptNextAlert) {
				alert.accept();
			} 
			else 
			{
				alert.dismiss();
			}
			return alertText;
		} 
		finally 
		{
			acceptNextAlert = true;
		}
	}
}
