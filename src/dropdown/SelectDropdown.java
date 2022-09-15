package dropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDropdown {

	public static void main(String[] args) {
		
		String baseUrl="https://output.jsbin.com/osebed/2";
		System.setProperty("webdriver.chrome.driver", "E:\\testing\\selenium tools\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get(baseUrl);
        WebElement options= driver.findElement(By.id("fruits"));
        
        Select s=new Select(options);
        //s.selectByIndex(0);
        s.selectByIndex(1);
        s.selectByIndex(3);
        System.out.println("********");
        
       // List <WebElement> allselected =s.getAllSelectedOptions();
        
        WebElement ele=s.getFirstSelectedOption();
        System.out.println(ele.getText());      
      
        
	}

}
