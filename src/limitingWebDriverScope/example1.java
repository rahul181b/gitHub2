package limitingWebDriverScope;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class example1 {

	public static void main(String[] args) {
		String baseUrl="http://www.tutorialsninja.com/demo/";
		System.setProperty("webdriver.chrome.driver", "E:\\testing\\selenium tools\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get(baseUrl);
		
	WebElement	w =driver.findElement(By.className("container"));
	
	System.out.println(w.findElements(By.xpath("//li/a")).size());
//	int count=1;
//	for(int i=0; i<elements.size();i++)
//	{
//		count++;
//	}
//		System.out.println(count);
//		
		driver.close();
	}
	
	

}
