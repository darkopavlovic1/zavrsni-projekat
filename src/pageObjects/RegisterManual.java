package pageObjects;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RegisterManual {

	public static String url = "http://localhost/izlet/index.php";
	private static String firstName ="//input[@name='firstname']";
	private static String lastName="//input[@name='lastname']";
	private static String userName = "//div[@class='register_form']//input[@name='username']";
	private static String email ="//input[@name='email']";
	private static String password ="//div[@class='register_form']//input[@name='password']";
	private static String registerButton = "//input[@id='blue_btn']";
	
	
	
		public static void openUrl (WebDriver dr) {
			dr.get(url);
		}
		
		//first name
		public static WebElement getFirstName (WebDriver dr) {
			WebElement fName= dr.findElement(By.xpath(firstName));
			return fName;
		}
		public static void unosTextaFirstName (WebDriver dr, String str) {
			getFirstName(dr).sendKeys(str);
		}
		
		//last name
		public static WebElement getLastName (WebDriver dr) {
			WebElement lName= dr.findElement(By.xpath(lastName));
			return lName;
		}
		public static void unosTextaLastName (WebDriver dr, String str) {
			getLastName(dr).sendKeys(str);
		}
		
		//user name
		public static WebElement getUserName (WebDriver dr) {
			WebElement uName= dr.findElement(By.xpath(userName));
			return uName;
		}
		public static void unosTextaUserName (WebDriver dr, String str) {
			getUserName(dr).sendKeys(str);
		}
		
		//email
		public static WebElement getEmail (WebDriver dr) {
			WebElement eMail= dr.findElement(By.xpath(email));
			return eMail;
		}
		public static void unosTextaEmail (WebDriver dr, String str) {
			getEmail(dr).sendKeys(str);
		}
		//password
		public static WebElement getPassWord (WebDriver dr) {
			WebElement passW= dr.findElement(By.xpath(password));
			return passW;
		}
		public static void unosTekstaPassword (WebDriver dr, String str) {
			getPassWord(dr).sendKeys(str);
		}
		
		//register button
			public static WebElement getRegisterButton (WebDriver dr) {
				WebElement potButt = dr.findElement(By.xpath(registerButton));
				return potButt;
			}
			public static void clickRegisterButton (WebDriver dr) {
				getRegisterButton(dr).click();
			}
		}
	

