package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class EditPost {

	public static String url = "http://localhost/izlet/dashboard.php";
	private static String treeDots="fa-ellipsis-v";
	private static String pencil="fa-edit";
	
	
	
	//tree dots
	public static WebElement getTreeDots(WebDriver dr) {
		WebElement dots = dr.findElement(By.className(treeDots));
		return dots;
	}
	public static void clickDots (WebDriver dr) {
		getTreeDots(dr).click();
	}
	
	//pencil
	public static WebElement getPencil (WebDriver dr) {
		WebElement pen= dr.findElement(By.className(pencil));
		return pen;
	}
	public static void clickPencil (WebDriver dr) {
		getPencil(dr).click();
	}

	//text box
	public static WebElement getTextBox (WebDriver dr) {
		WebElement tBox = dr.findElement(By.className("fa-edit"));
		return tBox;
	}
	
	public static void selText(WebDriver dr, String str) {
		WebElement tBox = dr.findElement(By.id("description"));
		String text_value = str;
		tBox.click();
		String val=tBox.getAttribute("value");
		tBox.clear();
		tBox.sendKeys(text_value);
	}
	
	public static void openUrl(WebDriver dr) {
		dr.get(url);
		
	}
	
	
	
}

