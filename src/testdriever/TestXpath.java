package testdriever;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestXpath {

	@Test
	public static void GetElementByXpath() throws InterruptedException{
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe"); 
		WebDriver driver =new ChromeDriver();
		driver.get("http://www.google.com");
		WebElement searchBox =driver.findElement(By.xpath("//*[@id=\"lst-ib\"]"));
		searchBox.sendKeys("selenium");
	}
}
