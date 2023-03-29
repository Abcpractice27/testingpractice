import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Handling_WebPush_Notification_Popup {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse\\project1\\SeleniumJava_Framework\\Drivers\\chromedriver.exe");
		
		//it is like if u open any application then random notification popup u will get
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--disable-notifications");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		//it is like if u open any application then random notification popup u will get
	    driver.get("https://www.justdial.com/");
	    
	    driver.close();
	}

}
