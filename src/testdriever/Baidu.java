package testdriever;
import org.openqa.selenium.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.*;

import static org.testng.Assert.assertEquals;

import java.util.*;
import org.junit.*;

public class Baidu {
	
	@Test
	public void test() {
		System.out.println("Start selenium");
		System.out.println("start chrome browser...");
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe"); 
		WebDriver driver = new ChromeDriver();
		String url = "http://www.baidu.com/";
		driver.get(url);	
		List<WebElement> links=driver.findElements(By.cssSelector("#nv a"));
		assertEquals(10,links.size());
		for(int i=0;i<links.size();i++){
			System.out.println(links.get(i).getAttribute("href"));
		}
		driver.close();
	}

}
