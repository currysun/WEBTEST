package testdriever;

import java.io.File;
import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;



public class TestBiYingById {

	@Test
	public static void FindById() {
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe"); 
		String chromebin="D:/Google/Chrome/Application/chrome.exe";
		ChromeOptions options = new ChromeOptions();
        options.setBinary(chromebin);
        DesiredCapabilities capabilities = DesiredCapabilities.chrome();
        capabilities.setCapability(ChromeOptions.CAPABILITY, options);
        ChromeDriver driver = new ChromeDriver(capabilities);
        
		//String chromebin="D:\\Google\\Chrome\\Application\\chrome.exe";
		//System.setProperty("webdriver.chrome.bin",chromebin);
		WebDriver td =driver;
		String url="http://cn.bing.com/";
		td.get(url);
		//通过ID查找页面元素
		//WebElement searchBox= td.findElement(By.id("sb_form_q"));
		//searchBox.sendKeys("test Biying By Id");
		//WebElement button=td.findElement(By.id("sb_form_go"));
		//button.submit();
		//searchBox.submit();
		
				
	}

}
