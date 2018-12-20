

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {
	
	WebDriver driver;	
	public Login(WebDriver driver) {
		this.driver = driver;
	}
	public void typeEmail()
	{
		WebElement email=driver.findElement(By.id("email"));
		email.sendKeys("mzaidurrahman@gmail.com");
	}
	public void typePassword()
	{
		WebElement pass=driver.findElement(By.id("pass"));
		pass.sendKeys("Welcome123");
	}
	public void clickOnLogin()
	{
		WebElement login=driver.findElement(By.id("send2"));
		login.click();
	}

}
