import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handling_Authentication_PopUp {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse\\project1\\SeleniumJava_Framework\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
	    //In the authentication popup we know the username & password value then we have to send that in the link only like "admin:admin@"
		driver.get("https://admin:admin@the-internet.herokuapp.com/");
		
	}

}
