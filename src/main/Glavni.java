package main;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import action.DeletePostAction;
import action.EditPostAction;
import action.LogInAction;
import action.MakeAPostAction;
import action.RegisterAction;

public class Glavni {

	public static void main(String[] args) throws Exception {
		WebDriver driver = null;
		try {
			driver = new ChromeDriver();
		//RegisterAction.RegAuto();
		//RegisterAction.RegMan();
		//LogInAction.LogInAuto("Test");
		//LogInAction.LogInAuto("Login");
		//LogInAction.LogInMan("Test");
		//LogInAction.LogInMan("Login");
		//DeletePostAction.deletePost();
		//DeletePostAction.deletePost();
			MakeAPostAction.postMan(driver);
			EditPostAction.editPost(driver);
			//DeletePostAction.deletePost(driver);
		}finally {
			if(driver!=null)
				driver.quit();
		}
		
		

	}

}
