package testdriever;

import java.security.PublicKey;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestDouBanByName {
	@Test
	public static void DoubanByName(){
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe"); 
		WebDriver td =new ChromeDriver();
		String url="https://www.douban.com/";
		td.get(url);
		//ͨ��Name����ҳ��Ԫ��
		WebElement searchBox= td.findElement(By.name("q"));
		searchBox.sendKeys("test Douban By Name");
		searchBox.submit();
	}

}
