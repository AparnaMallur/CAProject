package ca.caProject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import pageObjects.AddClient;
import pageObjects.ReadExcel;


public class ClientMaster {
	public static WebDriver driver1 = null;
		
	private static String client_name="";
	private static String no_of_emp="";
	private static String client_number="";
	private static String client_email="";
	private static String client_password="";
	private static String cp_name1="";
	private static String cp_email1="";
	private static String cp_number1="";
	private static String cp_desig1 ="";
	private static String cp_name2="";
	private static String cp_email2="";
	private static String cp_number2="";
	private static String cp_desig2 ="";
	
	private static String cp_name3="";
	private static String cp_email3="";
	private static String cp_number3="";
	private static String cp_desig3 ="";
	private static String Remark ="";
	private static String DOB="";

 // @Test
  public static void Init(WebDriver driver) {	//  System.out.println("Init");
	  driver1=driver;
	  
  }
  @Test
  public static void AddClient() throws Exception {
	 // WebElement element=driver1.findElement(By.xpath("/html/body/div[3]/div/div/div/div/form/div[4]/div/div/div/button"));
	 // System.out.println(driver1.getTitle());
	  WebElement lnkMaster=pageObjects.Navigation.lnk_Master(driver1);
			  JavascriptExecutor executor = (JavascriptExecutor)driver1;
		executor.executeScript("arguments[0].click();", lnkMaster);
	  
		// Actions actions = new Actions(driver1);
	WebElement client= pageObjects.Navigation.lnk_Client(driver1);
	executor.executeScript("arguments[0].click();", client);
	// actions.moveToElement(client).click().perform();
	  WebElement addclient=pageObjects.AddClient.addNew(driver1);
	  executor.executeScript("arguments[0].click();", addclient);
	  callData(project.data.constants.ClientMaster.client_add_rowno);
	  SetData();
	  WebElement submit=pageObjects.AddClient.btn_Submit(driver1);
	  executor.executeScript("arguments[0].click();", submit);
	  AddClient.btn_search(driver1).sendKeys(client_name);
	  List<WebElement> listOfRows = AddClient.client_lst_tbl(driver1).findElements(By.tagName("tr"));
	  
		int RowCount= listOfRows.size();
		//System.out.println("The Row Count is " + RowCount);
		int ColCount=0;
		int i=0;
		Boolean isValid=true;
		//  System.out.println(listOfRows.size());
		if (RowCount >0) {
			//Reporter.log("Search Returned " + (RowCount-1) + "Records");
			//Reporter.log("Now Check Each column values has Entered value "+ "\n");
		//System.out.println("Done");
		List<WebElement> iColumns = driver1.findElements(By.xpath("//*[@id=\"page-wrapper\"]/div[3]/div/div/div[2]/div/table/tbody/tr[1]/th"));
		ColCount=iColumns.size();
		//for(i=1;i<ColCount;i++) {
		//List<WebElement> iColumns = driver1.findElements(By.xpath("//*[@id=\"page-wrapper\"]/div[3]/div/div/div[2]/div/table/tbody/tr[1]/th"));
		ColCount=iColumns.size();
		//for(i=1;i<ColCount;i++) {
	//	String  client_name=
	//	String  client_number=
	//	String  client_email=
		
		}
  }
  @Test
  public static void ViewClient() throws Exception {
	  driver1.findElement(By.xpath("//*[@id=\"button_datatables_example\"]/tbody/tr/td[7]/a[1]")).click();
	  String name=pageObjects.AddClient.client_name(driver1).getText();
	   System.out.println("Text is" +pageObjects.AddClient.client_name(driver1).getAttribute("value"));
	  System.out.println(pageObjects.AddClient.client_name(driver1).getAttribute("id"));
	  JavascriptExecutor jse = (JavascriptExecutor)driver1;
		 WebElement element=pageObjects.AddClient.client_name(driver1);
	//	String name1= jse.executeScript("return arguments[0].value",  element).toString();
		String text = jse.executeScript("return document.getElementById('info_client_name').innerHTML").toString();
	  System.out.println("View nameis " + text);
	  //Assert.assertTrue(manu_name.contains(manufacture_Name));
  }
 public static void callData(int Rowno ) throws Exception {
	 client_name=ReadExcel.getCellData(Rowno, project.data.constants.ClientMaster.Addclient_clientname_columnno);
	System.out.println(client_name);
	 no_of_emp=ReadExcel.getCellData(Rowno, project.data.constants.ClientMaster.Addclient_no_ofemployee_columnno);
		 client_number=ReadExcel.getCellData(Rowno, project.data.constants.ClientMaster.Addclient_mobileno_columnno);;
		 client_email=ReadExcel.getCellData(Rowno, project.data.constants.ClientMaster.Addclient_emailid_columnno);
		 client_password=ReadExcel.getCellData(Rowno, project.data.constants.ClientMaster.Addclient_password_columnno);
		 
cp_name1=ReadExcel.getCellData(Rowno, project.data.constants.ClientMaster.Addclient_contactperson1_name_columnno);
 cp_email1=ReadExcel.getCellData(Rowno, project.data.constants.ClientMaster.Addclient_contactperson1_email_columnno);
 cp_number1=ReadExcel.getCellData(Rowno, project.data.constants.ClientMaster.Addclient_contactperson1_mobileno_columnno);;;
 cp_desig1 =ReadExcel.getCellData(Rowno, project.data.constants.ClientMaster.Addclient_contactperson1_designation_columnno);
	
 cp_name2=ReadExcel.getCellData(Rowno, project.data.constants.ClientMaster.Addclient_contactperson2_name_columnno);
		 cp_email2=ReadExcel.getCellData(Rowno, project.data.constants.ClientMaster.Addclient_contactperson2_email_columnno);
		 cp_number2=ReadExcel.getCellData(Rowno, project.data.constants.ClientMaster.Addclient_contactperson2_mobileno_columnno);
		 cp_desig2 =ReadExcel.getCellData(Rowno, project.data.constants.ClientMaster.Addclient_contactperson2_designation_columnno);
		
		 cp_name3=ReadExcel.getCellData(Rowno, project.data.constants.ClientMaster.Addclient_contactperson3_name_columnno);;;
		 cp_email3=ReadExcel.getCellData(Rowno, project.data.constants.ClientMaster.Addclient_contactperson3_email_columnno);;;
		 cp_number3=ReadExcel.getCellData(Rowno, project.data.constants.ClientMaster.Addclient_contactperson3_mobileno_columnno);;;
		 cp_desig3 =ReadExcel.getCellData(Rowno, project.data.constants.ClientMaster.Addclient_contactperson3_designation_columnno);;;
		  Remark =ReadExcel.getCellData(Rowno, project.data.constants.ClientMaster.Addclient_remark_columnno);;;
		 	DOB=ReadExcel.getCellData(Rowno, project.data.constants.ClientMaster.Addclient_DOB);																			 
	    }
 public static void SetData() throws Exception {
	 /*System.out.println(client_name);
	 
	 JavascriptExecutor jse = (JavascriptExecutor)driver1;
	 WebElement element=pageObjects.AddClient.txtbx_client_name(driver1);
	 jse.executeScript("arguments[0].setAttribute('value', '"+client_name+"')",  element);
	 
*/
	 /*System.out.println( client_name);
		System.out.println( no_of_emp);
		System.out.println( client_number);
		System.out.println( client_email);
		System.out.println( client_password);
		System.out.println( cp_name1);
		System.out.println( cp_email1);
		System.out.println( cp_number1);
		System.out.println( cp_desig1 );
		System.out.println( cp_name2);
		System.out.println( cp_email2);
		System.out.println( cp_number2);
		System.out.println( cp_desig2 );
		
		System.out.println( cp_name3);
		System.out.println( cp_email3);
		System.out.println( cp_number3);
		System.out.println( cp_desig3 );
		System.out.println( Remark );
*/
	
	// jse.executeScript("document.getElementById('ssn').value='555-55-5555';");
	// pageObjects.AddClient.txtbx_client_name(driver1).getAttribute(name)
	pageObjects.AddClient.txtbx_client_name(driver1).sendKeys(client_name);
	pageObjects.AddClient.txtbx_no_of_emp(driver1).sendKeys(no_of_emp);
	pageObjects.AddClient.txtbx_client_number(driver1).sendKeys(client_number);
	pageObjects.AddClient.txtbx_client_email(driver1).sendKeys(client_email);
	pageObjects.AddClient.DOBClient(driver1).sendKeys(DOB);
	pageObjects.AddClient.txtbx_client_password(driver1).sendKeys(client_password);
	pageObjects.AddClient.txtbx_cp_name1(driver1).sendKeys(cp_name1);
	pageObjects.AddClient.txtbx_cp_number1(driver1).sendKeys(cp_number1);
	AddClient.txtbx_cp_email1(driver1).sendKeys(cp_email1);
	pageObjects.AddClient.txtbx_cp_desig1(driver1).sendKeys(cp_desig1);
	
	pageObjects.AddClient.txtbx_cp_name2(driver1).sendKeys(cp_name2);
	pageObjects.AddClient.txtbx_cp_number2(driver1).sendKeys(cp_number2);
	AddClient.txtbx_cp_email2(driver1).sendKeys(cp_email2);
	pageObjects.AddClient.txtbx_cp_desig2(driver1).sendKeys(cp_desig2);
	
	pageObjects.AddClient.txtbx_cp_name3(driver1).sendKeys(cp_name3);
	pageObjects.AddClient.txtbx_cp_number3(driver1).sendKeys(cp_number3);
	AddClient.txtbx_cp_email3(driver1).sendKeys(cp_email3);
		pageObjects.AddClient.txtbx_cp_desig3(driver1).sendKeys(cp_desig3);
	AddClient.txtbx_remark(driver1).sendKeys(Remark);
	
	
 }
}
