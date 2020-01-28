import org.openqa.selenium.chrome.ChromeDriver;

public class launchchrome {

	public static void main(String[] args) throws InterruptedException {
	
		System.setProperty("webdriver.chrome.driver","./exefiles/chromedriver.exe");
		
		ChromeDriver cd=new ChromeDriver();
		Thread.sleep(2000);
		cd.manage().window().maximize();
		
		Thread.sleep(2000);
		cd.get("https://www.google.com");
		Thread.sleep(2000);

		cd.navigate().back();
		Thread.sleep(2000);

		cd.navigate().forward();
		Thread.sleep(2000);

		cd.navigate().refresh();
		


		

	}

}
