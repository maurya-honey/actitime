import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchFirefox {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","./exefiles/geckodriver.exe");
		WebDriver ff=new FirefoxDriver();
		
		ff.navigate().to("https://www.youtube.com");
		

	}

}
