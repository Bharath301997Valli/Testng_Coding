package MavenProject.BuildMaven;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class BaseClass_AllFunction {

	public static WebDriver driver;
	
	public static WebDriver Browser_Launch(String browser) {
		
		if (browser.equalsIgnoreCase("chrome")) {
			
			System.setProperty("webdriver.chrome.driver", 
				"G:\\SeleniumDriver_TestNG_MavenRepository\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver();
			
		}
		
		else if (browser.equalsIgnoreCase("gecko")) {
			
			System.setProperty("webdriver.gecko.driver", 
				"G:\\SeleniumDriver_TestNG_MavenRepository\\geckodriver-v0.30.0-win64\\geckodriver.exe");
		}
	
		return driver;
	}
	

	public static void getURl(String url) {
		
		driver.get(url);
		driver.manage().window().maximize();
	}
	
	
	public static void navigateTo_Refresh(String urlname) {
	
		driver.navigate().to(urlname);
		driver.navigate().refresh();
	}

	public static void navigateTo_Back(String urlname) {
		
		driver.navigate().to(urlname);
		driver.navigate().back();
	
	public static void sendKeys(WebElement element, String value) {
		
		element.sendKeys(value);
	}
	
	
	public static void waits(int sleep) throws InterruptedException {
		
		Thread.sleep(sleep);

	}

	public static void DropDown_select(WebElement element, String text) {
		
		Select selectBy = new Select(element);
		selectBy.selectByVisibleText(text);
	}
	
	public static void click() {
		
		driver.close();
	}

	public static void click(WebElement element) {
		
		element.click();
	}

}
