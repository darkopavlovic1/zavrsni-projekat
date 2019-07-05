package action;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pageObjects.DeletePost;
import pageObjects.EditPost;

public class EditPostAction {

	public static void editPost(WebDriver driver) {
		
		try {
			EditPost.openUrl(driver);
			driver.manage().window().maximize();
			EditPost.clickDots(driver);
			EditPost.clickPencil(driver);
			EditPost.getTextBox(driver);
			EditPost.selText(driver, "Ovo je zamenski tekst!");
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			
		}
	}
}
