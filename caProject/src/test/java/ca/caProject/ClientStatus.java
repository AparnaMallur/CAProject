package ca.caProject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.AddClient;
import pageObjects.ReadExcel;
import project.data.constants.Constant;

public class ClientStatus {
	public static WebDriver driver1=null;
  
  public static void Init(WebDriver driver) throws Exception {
	  
	 driver1= driver;
	// System.out.println("Client Status" + driver1.getTitle());
	 ReadExcel.setExcelFile(project.data.constants.Constant.Path_TestData+project.data.constants.Constant.File_TestData, project.data.constants.Constant.ClientStatusSheetName);
  }
  @Test(priority=1)
  public static void AddClientStatus() throws Exception {
	  //click Master 
	  WebElement lnkMaster=pageObjects.Navigation.lnk_Master(driver1);
	  JavascriptExecutor executor = (JavascriptExecutor)driver1;
executor.executeScript("arguments[0].click();", lnkMaster);

//click client status
WebElement clientStatus= pageObjects.Navigation.lnk_Client_Status(driver1);
executor.executeScript("arguments[0].click();", clientStatus);
// Add new button
WebElement clientStatusAdd= pageObjects.ClientStatus.AddClientStatus(driver1);
executor.executeScript("arguments[0].click();", clientStatusAdd);
String client_status=ReadExcel.getCellData(1, project.data.constants.ClientStatus.clientactionadd_ClientStatusName_columnno);
pageObjects.ClientStatus.ClientStaustext(driver1).sendKeys(client_status);
Thread.sleep(2000);
WebElement submit=pageObjects.ClientStatus.submitbtn(driver1);
executor.executeScript("arguments[0].click();", submit);

pageObjects.ClientStatus.ClientSearch(driver1).sendKeys(client_status);
List<WebElement> listOfRows = AddClient.client_lst_tbl(driver1).findElements(By.tagName("tr"));

	int RowCount= listOfRows.size();
	//System.out.println("The Row Count is " + RowCount);
	int ColCount=0;
	int i=0;
	Boolean isValid=true;
	  System.out.println("Row count is " +listOfRows.size());
	if (RowCount >0) {
		List<WebElement> columns=listOfRows.get(1).findElements(By.tagName("td"));
		System.out.println("column Count is" + columns.size());
		System.out.println(columns.get(0).getText());
		System.out.println(columns.get(1).getText());
String clientStatusName=columns.get(1).getText();
		
		Assert.assertTrue(clientStatusName.contains(client_status));
	}

  }
  @Test(priority=1)
  public static void ClientStatusRequired() throws Exception {
	  WebElement lnkMaster=pageObjects.Navigation.lnk_Master(driver1);
	  JavascriptExecutor executor = (JavascriptExecutor)driver1;
executor.executeScript("arguments[0].click();", lnkMaster);

//click client status
WebElement clientStatus= pageObjects.Navigation.lnk_Client_Status(driver1);
executor.executeScript("arguments[0].click();", clientStatus);
// Add new button
WebElement clientStatusAdd= pageObjects.ClientStatus.AddClientStatus(driver1);
executor.executeScript("arguments[0].click();", clientStatusAdd);
JavascriptExecutor js = (JavascriptExecutor)driver1;
WebElement submit=pageObjects.ClientStatus.submitbtn(driver1);
executor.executeScript("arguments[0].click();", submit);

WebElement field = pageObjects.ClientStatus.ClientStaustext(driver1);
//Boolean is_valid = (Boolean)js.executeScript("return arguments[0].checkValidity();", field);
String message = (String)js.executeScript("return arguments[0].validationMessage;", field);
System.out.println(message);
Assert.assertTrue(Constant.RequiredFieldMsg.contains(message));
  }
  
  @Test(priority=3)
  public static void EditClientStatus() throws Exception {
	  //***************Click Master
	  WebElement lnkMaster=pageObjects.Navigation.lnk_Master(driver1);
	  JavascriptExecutor executor = (JavascriptExecutor)driver1;
executor.executeScript("arguments[0].click();", lnkMaster);

//click client status
WebElement clientStatus= pageObjects.Navigation.lnk_Client_Status(driver1);
executor.executeScript("arguments[0].click();", clientStatus);
//***************Read value from Excel to search record to be edited
String client_status=ReadExcel.getCellData(1, project.data.constants.ClientStatus.clientactionadd_ClientStatusName_columnno);
String client_status_Edit=ReadExcel.getCellData(2, project.data.constants.ClientStatus.clientactionadd_ClientStatusName_columnno);
pageObjects.ClientStatus.ClientSearch(driver1).sendKeys(client_status);

List<WebElement> listOfRows = AddClient.client_lst_tbl(driver1).findElements(By.tagName("tr"));

int RowCount= listOfRows.size();
//System.out.println("The Row Count is " + RowCount);
int ColCount=0;
int i=0;
Boolean isValid=true;
  System.out.println("Row count is " +listOfRows.size());
if (RowCount >1) {
	List<WebElement> lnkEdit=driver1.findElements(By.xpath("//tr/td[contains(text(),'"+client_status+"')]/following-sibling::td[1]//a"));
	System.out.println(lnkEdit.size());
	//lnkEdit.get(1).click();
	//System.out.println(lnkEdit.get(index));
	executor.executeScript("arguments[0].click();", lnkEdit.get(1));

WebElement element=pageObjects.ClientStatus.clientStatus_Edit(driver1);
System.out.println(element.getAttribute("id"));
Thread.sleep(2000);
element.clear();
element.sendKeys(client_status_Edit);
Thread.sleep(2000);
WebElement submit=pageObjects.ClientStatus.EditClientStatusSubmit(driver1);
executor.executeScript("arguments[0].click();", submit);
//****************Search for added Client Status
pageObjects.ClientStatus.ClientSearch(driver1).sendKeys(client_status);
List<WebElement> listOfRows1 = AddClient.client_lst_tbl(driver1).findElements(By.tagName("tr"));

	int RowCount1= listOfRows1.size();
	
	
	  System.out.println("Row count is " +listOfRows1.size());
	if (RowCount1 >0) {
		List<WebElement> columns=listOfRows1.get(1).findElements(By.tagName("td"));
		System.out.println("column Count is" + columns.size());
		System.out.println(columns.get(0).getText());
		System.out.println(columns.get(1).getText());
String clientStatusName=columns.get(1).getText();
		
		Assert.assertTrue(clientStatusName.contains(client_status_Edit));

  }
}
}
  @Test(priority=2)
  public static void EditClientStatusRequired() throws Exception {
	  //***************Click Master
	  WebElement lnkMaster=pageObjects.Navigation.lnk_Master(driver1);
	  JavascriptExecutor executor = (JavascriptExecutor)driver1;
executor.executeScript("arguments[0].click();", lnkMaster);

//click client status
WebElement clientStatus= pageObjects.Navigation.lnk_Client_Status(driver1);
executor.executeScript("arguments[0].click();", clientStatus);
//***************Read value from Excel to search record to be edited
String client_status=ReadExcel.getCellData(1, project.data.constants.ClientStatus.clientactionadd_ClientStatusName_columnno);

pageObjects.ClientStatus.ClientSearch(driver1).sendKeys(client_status);

List<WebElement> listOfRows = AddClient.client_lst_tbl(driver1).findElements(By.tagName("tr"));

int RowCount= listOfRows.size();
//System.out.println("The Row Count is " + RowCount);

  System.out.println("Row count is " +listOfRows.size());
if (RowCount >1) {
	List<WebElement> lnkEdit=driver1.findElements(By.xpath("//tr/td[contains(text(),'"+client_status+"')]/following-sibling::td[1]//a"));
	System.out.println(lnkEdit.size());
	//lnkEdit.get(1).click();
	//System.out.println(lnkEdit.get(index));
	executor.executeScript("arguments[0].click();", lnkEdit.get(1));
	WebElement element=pageObjects.ClientStatus.clientStatus_Edit(driver1);
	
	Thread.sleep(2000);
	element.clear();
	
	Thread.sleep(2000);
	WebElement submit=pageObjects.ClientStatus.EditClientStatusSubmit(driver1);
	executor.executeScript("arguments[0].click();", submit);


	  //Boolean is_valid = (Boolean)js.executeScript("return arguments[0].checkValidity();", field);
String message = (String)executor.executeScript("return arguments[0].validationMessage;", element);
System.out.println(message);
Assert.assertTrue(Constant.RequiredFieldMsg.contains(message));
  }

}
}