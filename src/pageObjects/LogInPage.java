package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LogInPage {
	public static String url = "http://localhost/izlet/index.php";
	private static String userName = "//input[@placeholder='username']";
	private static String password = "//input[@placeholder='password']";
	private static String logInButton = "//input[@name='login']";
	
	
	public static void openUrl (WebDriver dr) {
		dr.get(url);
	}
	//user name
	public static WebElement getUserName (WebDriver dr) {
		WebElement usName= dr.findElement(By.xpath(userName));
		return usName;
	}
	public static void unosTextaUserName (WebDriver dr, String str) {
		getUserName(dr).sendKeys(str);
	}
	
	//password
	public static WebElement getPassword (WebDriver dr) {
		WebElement passW= dr.findElement(By.xpath(password));
		return passW;
	}
	public static void unosTextaPassword (WebDriver dr, String str) {
		getPassword(dr).sendKeys(str);
	}
	
	//prijava
		public static WebElement getLogInButton (WebDriver dr) {
			WebElement prButton= dr.findElement(By.xpath(logInButton));
			return prButton;
		}
		public static void clickLogInButton (WebDriver dr) {
			getLogInButton(dr).click();
		}
}
