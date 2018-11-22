package ca.caProject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import pageObjects.LoginPage;
import pageObjects.ReadExcel;

public class launchAppCA {
	public static WebDriver driver = null;
  @Test
  public void f() throws Exception {
	 

		
				System.setProperty("webdriver.chrome.driver", "C:\\Users\\Samisami\\Downloads\\selenium\\chromedriver_win32\\chromedriver.exe");
					 driver=new ChromeDriver();
					  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.get("http://sublimetechnocorp.com/ca_pro_new_new");
			LoginPage.txtbx_UserName(driver).clear();
			LoginPage.txtbx_UserName(driver).sendKeys("superadmin@admin.com");
			LoginPage.txtbx_Password(driver).clear();
			LoginPage.txtbx_Password(driver).sendKeys("12345");
			WebElement element=driver.findElement(By.xpath("/html/body/div[3]/div/div/div/div/form/div[4]/div/div/div/button"));
			

	//actions.moveToElement(element).click().perform();                          
	//LoginPage.btn_LogIn(driver).click();
			JavascriptExecutor executor = (JavascriptExecutor)driver;
			executor.executeScript("arguments[0].click();", element);
			driver.manage().window().maximize(); 
			Thread.sleep(5000);
			ClientMaster.Init(driver);
			ClientStatus.Init(driver);
  
}
}