package action;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pageObjects.LogInPage;
import utillity.Constant;
import utillity.ExcelUtils;

public class LogInAction {

	public static void LogInMan (WebDriver driver ,String type) {
		
		Scanner in = new Scanner(System.in);
		try {
			LogInPage.openUrl(driver);
			driver.manage().window().maximize();
			System.out.println("user name: ");
			String userName= in.nextLine();
			LogInPage.unosTextaUserName(driver,userName);
			System.out.println("password: ");
			String password= in.nextLine();
			LogInPage.unosTextaPassword(driver, password);
			LogInPage.clickLogInButton(driver);
			String testStatus="";
			if (type.equals("Login")){
				driver.navigate().to("http://localhost/izlet/");
			} else {
				if (driver.getCurrentUrl().equals("http://localhost/izlet/dashboard.php")) {
					testStatus= "pass!";
					System.out.println("Login test is passed for user: "+userName);
				}else {
					testStatus= "fail";
					System.out.println("Login test failed for user: "+userName);
				}
				ExcelUtils.setExcelFile(Constant.Path_TestData + Constant.File_TestData,"Registracija");
				ExcelUtils.setCellData(testStatus, 1, 8);
			}
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
		
		}
	}
	
	public static void LogInAuto (String type) {
		WebDriver driver = new ChromeDriver();
		
		try {
			ExcelUtils.setExcelFile(Constant.Path_TestData + Constant.File_TestData,"Registracija");
			LogInPage.openUrl(driver);
			driver.manage().window().maximize();
			for (int i=1; i<ExcelUtils.getWorkSheet().getLastRowNum(); i++) {
				String userName=ExcelUtils.getCellData(i, 2);
				String passWord=ExcelUtils.getCellData(i, 4);
				LogInPage.unosTextaUserName(driver, userName);
				LogInPage.unosTextaPassword(driver, passWord);
				LogInPage.clickLogInButton(driver);
				String testStatus="";
				if (type.equals("Login")){
					driver.navigate().to("http://localhost/izlet/");
				} else {
					if (driver.getCurrentUrl().equals("http://localhost/izlet/dashboard.php")) {
						testStatus = "pass!";
						System.out.println("Login test is passed for user: "+userName);
					}else {
						testStatus = "fail!";
						System.out.println("Login test failed for user: "+userName);
					}
					driver.navigate().to("http://localhost/izlet/");
					ExcelUtils.setExcelFile(Constant.Path_TestData + Constant.File_TestData,"Registracija");
					ExcelUtils.setCellData(testStatus, i, 7);
					
				}
			}
			
		}catch (Exception e) {
			System.out.println("halp");
			e.printStackTrace();
		}finally {
			
;		}
	}
}
