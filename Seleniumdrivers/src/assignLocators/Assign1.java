package assignLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assign1 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.linkText("Register")).click();
		driver.findElement(By.id("gender-female")).click();
		driver.findElement(By.id("FirstName")).sendKeys("Ramya");
		driver.findElement(By.id("LastName")).sendKeys("M");
		driver.findElement(By.id("Email")).sendKeys("ramya.abhi95@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("Ram@123");
		driver.findElement(By.id("ConfirmPassword")).sendKeys("Ram@123");
		driver.findElement(By.id("register-button")).click();
		driver.findElement(By.linkText("Log in")).click();
		driver.findElement(By.id("Email")).sendKeys("ramya.abhi95@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("Ram@123");
		driver.findElement(By.id("RememberMe")).click();
		driver.findElement(By.className("button-1 login-button")).click();
		
	}

}
