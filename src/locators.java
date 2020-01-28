import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class locators {

	public static void main(String[] args) {
		  WebDriver driver = Browserfactory.LaunchBrowser("chrome");
		  driver.get("file:///C:/Users/Honey/Desktop/NSSM12.html");
		  driver.manage().window().maximize();
		  
		
		   driver.findElement(By.id("user")).sendKeys("admin");
		 driver.findElement(By.name("pwd")).sendKeys("1234");
		 driver.findElement(By.tagName("a")).click();
		 driver.findElement(By.xpath("//input[@value='LOGIN']")).click();
		  

	}

}
