package action;

import java.awt.Transparency;
import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pageObjects.DeletePost;
import pageObjects.PostDashboard;

public class DeletePostAction {

	public static void deletePost(WebDriver driver) {
		try {
			DeletePost.openUrl(driver);
			driver.manage().window().maximize();
			DeletePost.clickDots(driver);
			DeletePost.clickTrashCan(driver);
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			
		}
	}



}
