package main;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;

import action.DeletePostAction;
import action.LogInAction;
import action.MakeAPostAction;

public class ManOrAuto {

	public static void manOrAauto (WebDriver driver) throws Exception {
		Scanner in = new Scanner(System.in);
		System.out.println("Sta zelite da testirate?(login, dodaj post ili izbrisi post)");
		String test=in.nextLine();
		System.out.println("Manuelni ili automatski test(manual ili auto)");
		String s=in.nextLine();

		switch (test+ s) {
		case "login"+"manual": LogInAction.LogInMan(driver,"Login");;break;
		case "login"+"auto": LogInAction.LogInAuto("Login");;break;
		case "dodaj post" +"manual": MakeAPostAction.postMan(driver);break;
		case "dodaj post"+"auto": MakeAPostAction.postAuto();break;
		case "izbrisi post" + " ": DeletePostAction.deletePost(driver);break;
		default : System.out.println("Pogresan unos!");
		}
		
	}
}
