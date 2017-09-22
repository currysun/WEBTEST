package webtest;

import java.util.List;

import static org.testng.Assert.assertEquals;

import java.io.File;

import javax.swing.JSeparator;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

public final class jQueryLocator {
	@Test
	public static void JqueryTest() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","E:\\chromedriver.exe"); 
		String chromebin="E:/Google/Chrome/Application/chrome.exe";
		ChromeOptions options = new ChromeOptions();
        options.setBinary(chromebin);
        DesiredCapabilities capabilities = DesiredCapabilities.chrome();
        capabilities.setCapability(ChromeOptions.CAPABILITY, options);
        
        //jQuery element locator
		WebDriver driver =new ChromeDriver(capabilities);
		JavascriptExecutor jse =(JavascriptExecutor)driver;
		String url="http://jquery.com/";
		driver.get(url);
		List<WebElement> elements=(List<WebElement>)jse.executeScript("return jQuery.find('.menu-item')");
		Thread.sleep(1000);
		assertEquals(5, elements.size());
		assertEquals("Blog", elements.get(2).getText());
		Thread.sleep(1000);
		driver.quit();
	}
}
