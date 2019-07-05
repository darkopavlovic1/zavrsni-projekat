package action;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pageObjects.LogInPage;
import pageObjects.PostDashboard;
import utillity.Constant;
import utillity.ExcelUtils;

public class MakeAPostAction {

	public static void postMan(WebDriver driver) {
		
		Scanner in = new Scanner(System.in);
		try {
			//PostDashboard.openUrl(driver);
			driver.manage().window().maximize();
			LogInAction.LogInMan(driver, "login");
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);	
			Thread.sleep(1000);
			PostDashboard.clickMakeAPostButton(driver);
			System.out.println("naziv: ");
			PostDashboard.nazivInput(driver, in.nextLine());
			System.out.println("lokacija: ");
			PostDashboard.lokacijaInput(driver, in.nextLine());
			PostDashboard.selectDropDown(driver, "Walk");
			PostDashboard.clickTransport(driver);
			System.out.println("opis: ");
			PostDashboard.opisInput(driver, in.nextLine());
			PostDashboard.clickPostButton(driver);
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			
		}
	}
	
	public static void postAuto () throws Exception {
			WebDriver driver = new ChromeDriver();
			try {
				ExcelUtils.setExcelFile(Constant.Path_TestData + Constant.File_TestData,"Tekst");
				PostDashboard.openUrl(driver);
				driver.manage().window().maximize();
				for (int i=1; i<ExcelUtils.getWorkSheet().getLastRowNum(); i++) {
					PostDashboard.clickMakeAPostButton(driver);
					String naziv=ExcelUtils.getCellData(i, 0);
					String lokacija=ExcelUtils.getCellData(i, 1);
					String opis= ExcelUtils.getCellData(i, 2);
					PostDashboard.nazivInput(driver, naziv);
					PostDashboard.lokacijaInput(driver, lokacija);
					PostDashboard.opisInput(driver, opis);
					LogInPage.clickLogInButton(driver);
					driver.navigate().to("http://localhost/izlet/dashboard.php#");
				}
			} catch (Exception e) {
				e.printStackTrace();
			}finally {
			
			}
	}
}
