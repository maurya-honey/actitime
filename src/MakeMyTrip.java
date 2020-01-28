import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MakeMyTrip {

	public static void main(String[] args) {
		WebDriver driver=Browserfactory.LaunchBrowser("chrome");
		driver.navigate().to("https://retail.onlinesbi.com/retail/login.htm");
		driver.manage().window().maximize();
	    driver.findElement(By.xpath("//a[text()='CONTINUE TO LOGIN']")).click();

	}

}
