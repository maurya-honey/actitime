import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SessionID {

	public static void main(String[] args) 
	{
	   
		System.setProperty("webdriver.chrome.driver","./exefiles/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
	   driver.navigate().to("https://www.facebook.com/");
	   
	   String sessionID = driver.getWindowHandle();
         System.out.println(sessionID);
	}

}
