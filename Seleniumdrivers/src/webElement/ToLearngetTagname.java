package webElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearngetTagname {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       WebDriver driver=new ChromeDriver();
       driver.manage().window().maximize();
       driver.get("https://demowebshop.tricentis.com/");
       String tagname = driver.findElement(By.xpath("//a[text()='Register']")).getTagName();
       System.out.println(tagname);
	}

}
