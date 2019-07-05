package action;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pageObjects.LogInPage;
import pageObjects.RegisterManual;
import utillity.Constant;
import utillity.ExcelUtils;

public class RegisterAction {

	public static void RegMan () {
		WebDriver driver = new ChromeDriver();
		Scanner in = new Scanner(System.in);
		try {
			RegisterManual.openUrl(driver);
			driver.manage().window().maximize();
			System.out.println("first name: ");
			RegisterManual.unosTextaFirstName(driver, in.nextLine());
			System.out.println("last name: ");
			RegisterManual.unosTextaLastName(driver, in.nextLine());
			System.out.println("user name: ");
			RegisterManual.unosTextaUserName(driver, in.nextLine());
			System.out.println("email: ");
			RegisterManual.unosTextaEmail(driver, in.nextLine());
			System.out.println("password: ");
			RegisterManual.unosTekstaPassword(driver, in.nextLine());
			RegisterManual.clickRegisterButton(driver);;
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			driver.quit();
		}
	}
	
	public static void RegAuto () {
		WebDriver driver = new ChromeDriver();
		try {
			RegisterManual.openUrl(driver);
			driver.manage().window().maximize();
			ExcelUtils.setExcelFile(Constant.Path_TestData + Constant.File_TestData,"Registracija");
			
			for (int i=0; i<ExcelUtils.getWorkSheet().getLastRowNum()+1; i++) {
				String firstName=ExcelUtils.getCellData(i, 0);
				String lastName=ExcelUtils.getCellData(i, 1);
				String userName=ExcelUtils.getCellData(i, 2);
				String eMail=ExcelUtils.getCellData(i, 3);
				String password=ExcelUtils.getCellData(i, 4);
				RegisterManual.unosTextaFirstName(driver, firstName);
				RegisterManual.unosTextaLastName(driver, lastName);
				RegisterManual.unosTextaUserName(driver, userName);
				RegisterManual.unosTextaEmail(driver, eMail);
				RegisterManual.unosTekstaPassword(driver, password);
				RegisterManual.clickRegisterButton(driver);
			}
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			driver.quit();
		}
	}
}
