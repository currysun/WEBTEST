package webtest;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;



public class testdriver {
	@Test
	public static void StartChrome(){
		System.out.println("start chrome browser...");
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe"); 
		WebDriver driver = new ChromeDriver();
		String url = "http://10.20.0.79:8080/agilereporter";
		driver.get(url);	
		System.out.println("start chrome browser succeed...");
		

	}
	
}
