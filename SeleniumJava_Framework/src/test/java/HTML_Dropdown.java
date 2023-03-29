//import org.apache.xmlbeans.impl.xb.xsdschema.ListDocument.List;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HTML_Dropdown {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse\\project1\\SeleniumJava_Framework\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://omayo.blogspot.com/");
		WebElement wb = driver.findElement(By.id("drop1"));
		
		Select sel = new Select (wb);
		sel.selectByVisibleText("doc 4");
		
		wb= sel.getFirstSelectedOption();
		String s =wb.getText();
		System.out.println(s);
		
		List<WebElement> ls = sel.getOptions();
		int count = ls.size();
		for(WebElement abc : ls) {
			String dropdownlist = abc.getText();
			System.out.println(dropdownlist);
		}
		driver.quit();
	}

}
