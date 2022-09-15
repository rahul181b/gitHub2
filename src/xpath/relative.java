package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class relative {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String baseUrl="https://demo.guru99.com/test/selenium-xpath.html";
		System.setProperty("webdriver.chrome.driver", "E:\\testing\\selenium tools\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(baseUrl);
		
	WebElement yedi=driver.findElement(By.xpath("//tbody/tr/td/input"));
	
	Actions a=new Actions(driver);
	
	a.moveToElement(yedi).click().keyDown(Keys.SHIFT).sendKeys("husshhaar").build().perform();
		
		System.out.println("****************+++++++***************");
	}

}
