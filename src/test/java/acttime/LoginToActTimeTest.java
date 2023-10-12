package acttime;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import Object_Repository.Login_Page;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginToActTimeTest
{

	@Test
	public void loginToAppTest() throws IOException
	{
		FileInputStream fis = new FileInputStream(".\\src\\test\\resources\\CommonData.properties");
		Properties p =new Properties();
		p.load(fis);

		String BROWSER = p.getProperty("browser");
		String URL = p.getProperty("url");
		String USERNAME = p.getProperty("username");
		String PASSWORD = p.getProperty("password");


 

		WebDriver driver=null;
		if (BROWSER.equalsIgnoreCase("Edge"))
		{
			driver = WebDriverManager.edgedriver().create();
			System.out.println("Edge browser launched");
		} 
		else if (BROWSER.equalsIgnoreCase("Chrome"))
		{
			driver = WebDriverManager.chromedriver().create();
			System.out.println("Chrome browser launched");
		}
		else if (BROWSER.equalsIgnoreCase("Firefox")) 
		{
			driver = WebDriverManager.firefoxdriver().create();
			System.out.println("Firefox browser launched");
		}
		else
		{
			System.out.println("Invalid browser launched");
		}		

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get(URL);

		Login_Page l = new Login_Page(driver);
		l.loginToApp(USERNAME, PASSWORD);

	/*	
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[text()='Logout']")).click();
		System.out.println("Logged out successfully3");
		driver.quit();
	*/

	}
}
	

