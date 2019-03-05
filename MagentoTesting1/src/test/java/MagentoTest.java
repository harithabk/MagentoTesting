import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;





public class MagentoTest 
{
	@Test
	public void validLogin()
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("https://magento.com/");
		
		Welcome w=new Welcome(driver);
		w.clickMyAcct();
		
		LogIn l=new LogIn(driver);
		l.typeEmail("harithabk@gmail.com");
		l.typePwd("Rainbow815");
		l.clickonLogIn();
		
		Home h=new Home(driver);
		h.clickOnLogout();
		
		driver.quit();
	}
}
