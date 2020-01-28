import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Istqb {

	public static void main(String[] args) {
		WebDriver driver = Browserfactory.LaunchBrowser("chrome");
		driver.manage().window().maximize();
		driver.navigate().to("https://www.youtube.com/");
		
		List<WebElement> links = driver.findElements(By.tagName("a"));
		int count = links.size();
	   System.out.println(count);	
	   
	   for(int i=0; i<count; i++)
	   {
		   WebElement linkvalue = links.get(i);
		   String linktext = linkvalue.getText();
		   System.out.println(linktext);
	   }
		
	    
		
		

	}

}
