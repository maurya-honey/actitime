import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SetRediff {

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=Browserfactory.LaunchBrowser("abc");
		driver.navigate().to("https://www.rediff.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		driver.findElement(By.className("mailicon")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.id("login1")).sendKeys("honey.maurya@rediffmail.com");
		Thread.sleep(3000);
		
		driver.findElement(By.id("password")).sendKeys("RHoney@123");
		Thread.sleep(3000);
		
		driver.findElement(By.id("remember")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.name("proceed")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.className("rd_logout")).click();
		
		
	}


	}


