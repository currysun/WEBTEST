package testdriever;


import org.junit.experimental.theories.suppliers.TestedOn;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class testdriver {
	
	@Test
	public static void StartChrome(){
		System.out.println("start chrome browser...");
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe"); 
		WebDriver driver = new ChromeDriver();
		String url = "http://cn.bing.com/";
		driver.get(url);	
		System.out.println("start chrome browser succeed...");
		//driver.manage().window().maximize();
		String title = driver.getTitle();
		System.out.println(title);
		driver.close();
	}
	
}
