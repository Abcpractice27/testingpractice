import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Auto_suggestive_dropdown {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse\\project1\\SeleniumJava_Framework\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.makemytrip.com/");
		
		WebElement wb = driver.findElement(By.xpath("//img[@alt='Make My Trip']"));
		Actions act = new Actions(driver);
		act.moveToElement(wb).click().build().perform();
		
		driver.findElement(By.id("fromCity")).click();

		WebElement fromfield = driver.findElement(By.xpath("//input[@placeholder='From']"));
		fromfield.sendKeys("bang");
		
		for(int i=1; i<=3; i++)
		{
			Thread.sleep(2000);
			fromfield.sendKeys(Keys.ARROW_DOWN);
		}
		fromfield.sendKeys(Keys.ENTER);
	//	driver.quit();
	}
	

}
