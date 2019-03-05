

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Welcome 
{
	WebDriver driver;
	public Welcome(WebDriver driver)
	{
		this.driver=driver;
	}
	
	By myacct=By.linkText("My Account");
	
	public void clickMyAcct()
	{
		driver.findElement(myacct).click();
	}
}
