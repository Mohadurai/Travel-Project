package org.project;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
	
	static WebDriver driver; static WebElement webelement; static TakesScreenshot tk;
	public static void browesr()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\7oaseb.com.saaa\\eclipse-workspace\\Airline\\Driver\\chromedriver1.exe");
		driver = new ChromeDriver();
		
	}
	public static void geturl(String url) 	
	{
		driver.get(url);	
		driver.manage().window().maximize();
		driver.manage().timeouts().setScriptTimeout(10000000, TimeUnit.SECONDS);
	}
	public void path(String fe) 
	{
		 webelement = driver.findElement(By.xpath(fe));
			String namef = webelement.getAttribute("value");
		
			System.out.println("aaaa"+namef);
		
	}
	public static void id(String id1) 
	{
		webelement = driver.findElement(By.xpath(id1));
		
	}
	
	public static void btnClick(WebElement w) 
	{
		webelement.click();
		
	}
	public static void txtsend(String s) 
	{
		webelement.sendKeys(s);
		
	}
	
	public static void quit() 
	{
		 driver.quit();
		
	}
	public static void script(WebElement s) 
	{
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", s);

		
	}
	public static void Screenshot(String filNmae) throws Throwable 
	{
		
		 tk = (TakesScreenshot)driver;
		 File temp = tk.getScreenshotAs(OutputType.FILE);
		File desc = new File("C:\\Users\\7oaseb.com.saaa\\eclipse-workspace\\Airline\\Screenshot\\Airline"+filNmae);
		FileUtils.copyFile(temp, desc);
				
	}
	
	
	

	
	
}
