package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnLocators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
				driver.manage().window().maximize();
				driver.get("https://www.facebook.com/");
				driver.findElement(By.id("email")).sendKeys("Ramya");
				driver.findElement(By.id("pass")).sendKeys("Abc@123");
	}

}
