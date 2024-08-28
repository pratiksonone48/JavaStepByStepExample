package Selenium.Genral;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GetTitle

{
	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		
		System.out.println("pratik");
		
		System.out.println("never");
		
		
		//Implicit Wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement hh=driver.findElement(By.xpath("dsfsf"));
		//Explicit Wait
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		
		System.out.println(driver.getTitle());
		driver.quit();
		
		
	}

}
