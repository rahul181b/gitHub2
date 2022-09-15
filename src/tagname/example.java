package tagname;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class example {

	public static void main(String[] args) throws InterruptedException {
			/*
			 * by id 
			 * by classname 
			 * by name 
			 * by linktext
			 */
		System.setProperty("webdriver.chrome.driver", "E:\\testing\\selenium tools\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.id("email")).sendKeys("selenium snehal");
		
		driver.findElement(By.className("_9npi")).sendKeys("sdfghj");
		Thread.sleep(3000);
		
		driver.findElement(By.name("login")).click();;
		
//		Actions a = new Actions(driver);
//		
//		WebElement e=driver.findElement(By.linkText("Create New Account"));
//		
//		
//		a.moveToElement(e).click().build().perform();
//		
		
		
		System.out.println("*******");
	}

}
