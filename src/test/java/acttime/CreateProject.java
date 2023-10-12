package acttime;

import java.util.concurrent.TimeUnit;



import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

 

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateProject {


			public static void main(String[] args) throws Throwable

			{

				WebDriver driver = WebDriverManager.edgedriver().create();

				driver.manage().window().maximize();

				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

				

				driver.get("https://demo.actitime.com/login.do");

				

				driver.findElement(By.id("username")).sendKeys("admin");

				driver.findElement(By.name("pwd")).sendKeys("manager");

				driver.findElement(By.xpath("//div[text()='Login ']")).click();

				

				driver.findElement(By.id("container_tasks")).click();

				driver.findElement(By.xpath("//div[text()='Add New']")).click();

				driver.findElement(By.xpath("//div[text()='+ New Project']")).click();

				driver.findElement(By.xpath("(//input[@placeholder='Enter Project Name'])[2]")).sendKeys("Synechron Project");

						

				driver.findElement(By.xpath("//textarea[@placeholder='Add Project Description']")).sendKeys(" New Project Description");

				driver.findElement(By.xpath("//div[text()='Create Project']")).click();

				
				Thread.sleep(3000);

				driver.findElement(By.xpath("//a[text()='Logout']")).click();

				System.out.println("Created New Project Successfully");

				driver.quit();

			}

		

		 
	}



