package ByPartialLinkText;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class example {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "E:\\testing\\selenium tools\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		String baseUrl="http://demo.guru99.com/test/link.html";
		
		driver.get(baseUrl);
		
		driver.findElement(By.partialLinkText("click")).click();
		
		
		
		
		System.out.println("*********");
	}

}
