package acttime;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Login_pageWithDDT {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		 FileInputStream file =new FileInputStream(".\\src\\test\\resources\\CommonData.properties");
		 
		 
		 //Step 2: Create object for property file		 
	      Properties p = new Properties();
		 
		//Step 3: Load the file into object of properties
		  p.load(file);
		  
		//Step 4: Get the values of property file based on key
		String BROWSER=  p.getProperty("browser");
		String URL=  p.getProperty("url");
		String USERNAME=  p.getProperty("username");
		String PASSWORD=  p.getProperty("password");
		WebDriver driver=null;
		if(BROWSER.equalsIgnoreCase("Edge"))
		{
			driver=WebDriverManager.edgedriver().create();
			System.out.println("Edge Browser Launched Successfully");
		}
		
		else
			System.out.println("Invalid Browser Launched");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

		driver.get("https://demo.actitime.com/login.do");

		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.xpath("//div[text()='Login ']")).click();

		
		driver.findElement(By.xpath("//a[text()='Logout']")).click();

		driver.quit();
		
		
		
	}

}
