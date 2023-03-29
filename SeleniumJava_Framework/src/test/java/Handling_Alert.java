import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handling_Alert {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse\\project1\\SeleniumJava_Framework\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://omayo.blogspot.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("alert1")).click();
		
		Thread.sleep(2000);
		
		Alert a = driver.switchTo().alert();
		
		String message = a.getText();
		System.out.println(message);
		
		Thread.sleep(2000);
		
		a.accept();
		
		Thread.sleep(2000);

		driver.close();
	}
}
