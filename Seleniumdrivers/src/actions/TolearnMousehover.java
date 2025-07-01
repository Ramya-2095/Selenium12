package actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TolearnMousehover {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.vtiger.com/");
		//WebElement features = driver.findElement(By.partialLinkText("Features"));
		Actions act=new Actions(driver);
		//act.moveToElement(features).perform();
		act.moveByOffset(350, 102).perform();
		

	}

}
