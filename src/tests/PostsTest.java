package tests;

import java.util.List;

import org.apache.xpath.operations.Equals;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import action.MakeAPostAction;

public class PostsTest {

	public static void testP (WebDriver dr) {
		List<WebElement> lista_postova = dr.findElements(By.className("posts"));
		System.out.println("Broj postova je: "+lista_postova.size());
		MakeAPostAction.postMan(dr);
		int lp = lista_postova.size();
		
		List<WebElement> lista_postova2 = dr.findElements(By.className("posts"));
		System.out.println("Broj postova nakon dodavanja postova je: "+lista_postova2.size());
		int lp2 = lista_postova2.size();
		if (lp == lp2) {
			System.out.println("Test status za postavljanje postova: Fail!");
		}else {
			System.out.println("Test status za postavljanje postova: Pass!");
		}
	}
}
