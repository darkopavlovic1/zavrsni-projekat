package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DeletePost {

	public static String url = "http://localhost/izlet/index.php";
	private static String treeDots="fa-ellipsis-v";
	private static String trashCan="fa-trash-alt";
	
	
	
	//tree dots
	public static WebElement getTreeDots(WebDriver dr) {
		WebElement dots = dr.findElement(By.className(treeDots));
		return dots;
	}
	public static void clickDots (WebDriver dr) {
		getTreeDots(dr).click();
	}
	
	//trash can
	public static WebElement getTrashCan (WebDriver dr) {
		WebElement tCan= dr.findElement(By.className(trashCan));
		return tCan;
	}
	public static void clickTrashCan (WebDriver dr) {
		getTrashCan(dr).click();
	}

	public static void openUrl(WebDriver dr) {
		dr.get(url);
		
	}
	
	
	
}
