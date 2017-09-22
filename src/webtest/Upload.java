package webtest;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;


public class Upload {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		test1();
	}
	
	@Test
	public static void UploadTest() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","E:\\chromedriver.exe"); 
		String chromebin="E:/Google/Chrome/Application/chrome.exe";
		ChromeOptions options = new ChromeOptions();
        options.setBinary(chromebin);
        DesiredCapabilities capabilities = DesiredCapabilities.chrome();
        capabilities.setCapability(ChromeOptions.CAPABILITY, options);
        ChromeDriver driver = new ChromeDriver(capabilities);

		WebDriver driver1 =new ChromeDriver(capabilities);
		File file=new File("E:\\upload.html");
		String filepath=file.getAbsolutePath();
		driver.get(filepath);
		driver.findElement(By.name("file")).sendKeys("E:\\xa.zip");
		Thread.sleep(5000);
		driver.quit();
	}
	
	public static void test1(){
        File file1 = new File(".\\test1.txt");
        File file2 = new File("D:\\workspace\\test\\test1.txt");
        System.out.println("-----默认相对路径：取得路径不同------");
        System.out.println(file1.getPath());
        System.out.println(file1.getAbsolutePath());
        System.out.println("-----默认绝对路径:取得路径相同------");
        System.out.println(file2.getPath());
        System.out.println(file2.getAbsolutePath());
        
    }

}
