

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home 
{
	WebDriver driver;
	public Home(WebDriver driver) {
		this.driver = driver;
	}
	public void clickOnLogout()
	{
		WebElement logout=driver.findElement(By.linkText("Log Out"));
		logout.click();
	}
	

}
