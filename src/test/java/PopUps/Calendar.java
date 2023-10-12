package PopUps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Calendar {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = WebDriverManager.edgedriver().create();
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://www.yatra.com");
		driver.findElement(By.xpath("//label[@for='BE_flight_origin_date']")).click();
		driver.findElement(By.id("16/10/2023"));
		Thread.sleep(2000);
		driver.close();
		
		

	}

}
