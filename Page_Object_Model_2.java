package MavenProject.BuildMaven;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Page_Object_Model_2 {

	public static void pom() {
		
	}

	@FindBy(id="email")
	public static WebElement UserSign;
	
	@FindBy(xpath="//input[@type='password']")
	public static WebElement UserPassword;
	
	@FindBy(name="login")
	public static WebElement Login;
	
	



}
