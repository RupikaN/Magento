

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class MagentoTest {
@Test
	public void magentoTest() {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.navigate().to("https://magento.com");
		Main m=new Main(driver);
		m.clickOnMyacct();
		Login l=new Login(driver);
		
		Home h=new Home(driver);
		
		l.typeEmail();
		l.typePassword();
		l.clickOnLogin();
		h.clickOnLogout();
		driver.quit();
		
		
	}

}

