
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LogIn 
{
	WebDriver driver;

	public LogIn(WebDriver driver) {
		super();
		this.driver = driver;
	}
	
	By email=By.id("email");
	By pwd=By.id("pass");
	By login=By.id("send2");
	
	public void typePwd(String un)
	{
		driver.findElement(pwd).sendKeys(un);
	}
	
	public void typeEmail(String un)
	{
		driver.findElement(email).sendKeys(un);
	}
	
	public void clickonLogIn()
	{
		driver.findElement(login).click();
	}
}
