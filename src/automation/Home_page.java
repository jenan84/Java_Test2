package automation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class Home_page extends Parameters{

	public static void main(String[] args)  {
	
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		
		driver.get(URL);
		
		customerLogin.click();

	}

}
