import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiSelection_dropdown {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse\\project1\\SeleniumJava_Framework\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://omayo.blogspot.com/");
		WebElement multiselectionbox = driver.findElement(By.id("multiselect1"));
		
		Select sel = new Select(multiselectionbox);
		sel.selectByVisibleText("Volvo");
		sel.selectByIndex(2);
		
		sel.selectByValue("swiftx");
		sel.deselectAll();
	}

}
