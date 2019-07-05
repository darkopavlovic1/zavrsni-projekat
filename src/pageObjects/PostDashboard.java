package pageObjects;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class PostDashboard {

	public static String url = "http://localhost/izlet/index.php";
	private static String makeAPostButton =  "//div[@id='newPostBtn']";  //"//a[contains(text(),'Make a post')]";
	private static String naziv ="//input[@placeholder='Naziv']";
	private static String lokacija ="//input[@placeholder='Lokacija']";
	private static String opis ="//textarea[@placeholder='Opis']";
	private static String postButton ="//div[@class='popupPost']//input[@name='postSubmit']";
	private static String dropDown = "/html/body/div[1]/div[4]/form/select";///
	
	public static void openUrl (WebDriver dr) {
		dr.get(url);
	}
	
	//post button
	public static WebElement getMakeAPostButton (WebDriver dr) {
		WebElement postButton= dr.findElement(By.xpath(makeAPostButton));
		return postButton;
	}
	public static void clickMakeAPostButton (WebDriver dr) {
		getMakeAPostButton(dr).click();
	}
	
	//naziv input
	public static WebElement getNaziv (WebDriver dr) {
		WebElement naz = dr.findElement(By.xpath(naziv));
		return naz;
	}
	public static void nazivInput (WebDriver dr, String str) {
		getNaziv(dr).sendKeys(str);
	}
	
	//lokacija input
	public static WebElement getLokacija (WebDriver dr) {
		WebElement naz = dr.findElement(By.xpath(lokacija));
		return naz;
	}
	public static void lokacijaInput (WebDriver dr, String str) {
		getLokacija(dr).sendKeys(str);
	}
	
	//dd
	public static WebElement getDropDown (WebDriver dr) {
		WebElement dDown = dr.findElement(By.xpath(dropDown));
		return dDown;
	}
	public static void selectDropDown (WebDriver dr, String str) {
		Select transport = new Select (getDropDown(dr));
		transport.selectByVisibleText(str);
	}
	public static void clickTransport (WebDriver dr) {
		getDropDown(dr).click();
	}
	

	//opis input
	public static WebElement getOpis (WebDriver dr) {
		WebElement op = dr.findElement(By.xpath(opis));
		return op;
	}
	public static void opisInput (WebDriver dr, String str) {
		getOpis(dr).sendKeys(str);
	}
	
	//post button
	public static WebElement getPostButton (WebDriver dr) {
		WebElement pButton = dr.findElement(By.xpath(postButton));
		return pButton;
	}
	public static void clickPostButton (WebDriver dr) {
		getPostButton(dr).click();
	}
}
