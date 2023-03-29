import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Handling_calender {
	static WebDriver driver = null;
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse\\project1\\SeleniumJava_Framework\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-handle-calendar-in-selenium.html");
		driver.findElement(By.id("datepicker")).click();
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("ui-datepicker-div")));
		
		selectdate("25","February", "2024");
	}

	public static void selectdate(String expDay, String expMon, String expYear) {
		
		String monthyear = driver.findElement(By.className("ui-datepicker-title")).getText();
		System.out.println(monthyear);
		
        String month = monthyear.split(" ")[0];
		String year = monthyear.split(" ")[1];
		
		while(!(month.equals(expMon) && year.equals(expYear)))
		{
			driver.findElement(By.xpath("//span[text()='Next']")).click();
			monthyear = driver.findElement(By.className("ui-datepicker-title")).getText();
			month = monthyear.split(" ")[0];
			year = monthyear.split(" ")[1];
			
		}
		
		String xpathexp = "//td[@data-handler='selectDay']/a[text()=\'"+expDay+"\']"; //dynamic xpath exp
		driver.findElement(By.xpath(xpathexp)).click();
	}
	
}
