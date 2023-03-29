import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

//Headless chrome browser testing meaning u can't see the UI and all the testing is done at backend
//HTMLUnitDriver is deafult headless browser
public class Headlessbrowsertest {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse\\project1\\SeleniumJava_Framework\\Drivers\\chromedriver.exe");
		
		ChromeOptions option = new ChromeOptions(); //it is applicable only for chrome browser
		option.setHeadless(true);
		
		WebDriver driver = new ChromeDriver(option);
		driver.get("https://www.freepik.com/");
		System.out.println("Title of the page is" + driver.getTitle());
	}
	
}
