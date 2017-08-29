package testdriever;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class testXiaomiByTagName {
@Test
	public static void Tagname(){
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe"); 
		WebDriver driver =new ChromeDriver();
		driver.get("http://www.xiaomi.com");
		List <WebElement> scriptList=driver.findElements(By.tagName("script"));
		System.out.print("There are"+scriptList.size()+" scripts on Xiaomi's main page.");
	}
	
}
