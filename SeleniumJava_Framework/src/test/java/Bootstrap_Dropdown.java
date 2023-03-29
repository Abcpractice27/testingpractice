import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Bootstrap_Dropdown {
	static WebDriver driver;
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse\\project1\\SeleniumJava_Framework\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.hdfcbank.com/");
		
		By productdropdown = By.xpath("//div[@class='drp1']//a");
		By selectproductdropdown = By.xpath("//div[@class='drp2']//a");
		
		selectdropdownvalue(productdropdown, "Accounts");
		selectdropdownvalue(selectproductdropdown, "Savings Accounts");
		
//		driver.findElement(By.xpath("//li[text()='Accounts']")).click();
//		driver.findElement(By.xpath("//li[text()='Savings Accounts']")).click();
	}
	
	public static WebElement getwebelement(By field) {
		
		return driver.findElement(field);
		
	} 
	
	public static void selectdropdownvalue(By field, String options) {
		getwebelement(field).click();
		
		String xpath = "//li[text()=\'"+options+"\']";
		getwebelement(By.xpath(xpath)).click();
	}

}
