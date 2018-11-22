package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AddClient {
	//no changes
	private static WebElement element = null;
	 public static WebElement txtbx_client_name(WebDriver driver){
		 
       element = driver.findElement(By.id("client_name"));

       return element;

       }
	 public static WebElement addNew(WebDriver driver){
		 
	       element = driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/div[2]/div/div/div[1]/div[2]/div/button"));

	       return element;

	       }

	

   public static WebElement txtbx_no_of_emp(WebDriver driver){

       element = driver.findElement(By.name("no_of_emp"));

       return element;

       }

   public static WebElement txtbx_client_number(WebDriver driver){

       element = driver.findElement(By.name("client_number"));

       return element;

       }
   public static WebElement txtbx_client_email(WebDriver driver){

       element = driver.findElement(By.name("client_email"));

       return element;

       }
   public static WebElement txtbx_client_password(WebDriver driver){

       element = driver.findElement(By.name("client_password"));

       return element;

       }
   public static WebElement txtbx_cp_name1(WebDriver driver){

       element = driver.findElement(By.name("cp_name1"));

       return element;

       }
   public static WebElement txtbx_cp_email1(WebDriver driver){

       element = driver.findElement(By.id("cp_email1"));

       return element;

       }
   public static WebElement txtbx_cp_number1(WebDriver driver){

       element = driver.findElement(By.id("cp_number1"));

       return element;

       }
   public static WebElement txtbx_cp_desig1(WebDriver driver){

       element = driver.findElement(By.id("cp_desig1"));

       return element;

       }
   public static WebElement txtbx_cp_name2(WebDriver driver){

       element = driver.findElement(By.id("cp_name2"));

       return element;

       }

   public static WebElement txtbx_cp_email2(WebDriver driver){

       element = driver.findElement(By.id("cp_email2"));

       return element;

       }
   public static WebElement txtbx_cp_number2(WebDriver driver){

       element = driver.findElement(By.id("cp_number2"));

       return element;

       }
   public static WebElement txtbx_cp_desig2(WebDriver driver){

       element = driver.findElement(By.id("cp_desig2"));

       return element;

       }
   public static WebElement txtbx_cp_name3(WebDriver driver){

       element = driver.findElement(By.id("cp_name3"));

       return element;

       }
   public static WebElement txtbx_cp_email3(WebDriver driver){

       element = driver.findElement(By.id("cp_email3"));

       return element;

       }
   public static WebElement txtbx_cp_number3(WebDriver driver){

       element = driver.findElement(By.id("cp_number3"));

       return element;

       }
   public static WebElement txtbx_cp_desig3(WebDriver driver){

       element = driver.findElement(By.id("cp_desig3"));

       return element;

       }
   public static WebElement txtbx_remark(WebDriver driver){

       element = driver.findElement(By.id("remark"));

       return element;

       }

   public static WebElement btn_Submit(WebDriver driver){

       element = driver.findElement(By.xpath("//*[@id=\"add_price_type_form\"]/div[9]/button[1]"));
        
       return element;

       }
   public static WebElement btnReset(WebDriver driver){

       element = driver.findElement(By.xpath("//*[@id=\"add_price_type_form\"]/div[9]/button[2]"));
        
       return element;

       }
   public static WebElement btn_Close(WebDriver driver){

       element = driver.findElement(By.xpath("//*[@id=\"add_price_type_form\"]/div[9]/button[3]"));
        
       return element;

       }
public static WebElement btn_search(WebDriver driver) {
	element =driver.findElement(By.xpath("//*[@id=\"button_datatables_example_filter\"]/label/input"));
	return element;
}
 //*[@id="button_datatables_example_filter"]/label/input
public static WebElement client_lst_tbl(WebDriver driver) {
	element =driver.findElement(By.id("button_datatables_example"));
	return element;
}
////// ****************** VIEW PAGE ****************************************


public static WebElement client_name(WebDriver driver) {
	element =driver.findElement(By.id("info_client_name"));
	
	return element;
}
public static WebElement no_of_emp(WebDriver driver) {
	element =driver.findElement(By.id("info_no_of_emp"));
	return element;
}
public static WebElement client_email(WebDriver driver) {
	element =driver.findElement(By.id("info_client_email"));
	return element;
}
public static WebElement client_number(WebDriver driver) {
	element =driver.findElement(By.id("info_client_number"));
	return element;
}

public static WebElement cp_name(WebDriver driver) {
	element =driver.findElement(By.id("info_cp_name1"));
	return element;
}
public static WebElement cp_email(WebDriver driver) {
	element =driver.findElement(By.id("info_cp_email1"));
	return element;
}
public static WebElement cp_number1(WebDriver driver) {
	element =driver.findElement(By.id("info_cp_number1"));
	return element;
}
public static WebElement cp_design1(WebDriver driver) {
	element =driver.findElement(By.id("info_cp_desig1"));
	return element;
}

public static WebElement cp_name2(WebDriver driver) {
	element =driver.findElement(By.id("info_cp_name2"));
	return element;
}
public static WebElement cp_email2(WebDriver driver) {
	element =driver.findElement(By.id("info_cp_email2"));
	return element;
}
public static WebElement cp_number2(WebDriver driver) {
	element =driver.findElement(By.id("info_cp_number2"));
	return element;
}
public static WebElement cp_design2(WebDriver driver) {
	element =driver.findElement(By.id("info_cp_desig2"));
	return element;
}
public static WebElement cp_name3(WebDriver driver) {
	element =driver.findElement(By.id("info_cp_name3"));
	return element;
}
public static WebElement cp_email3(WebDriver driver) {
	element =driver.findElement(By.id("info_cp_email3"));
	return element;
}
public static WebElement cp_number3(WebDriver driver) {
	element =driver.findElement(By.id("info_cp_number3"));
	return element;
}
public static WebElement cp_design3(WebDriver driver) {
	element =driver.findElement(By.id("info_cp_desig3"));
	return element;
}
public static WebElement remark(WebDriver driver) {
	element =driver.findElement(By.id("info_remark"));
	return element;
}
public static WebElement btnclose(WebDriver driver){

    element = driver.findElement(By.xpath("//*[@id=\"info_price_type_form\"]/div[8]/button"));
     
    return element;

    }
public static WebElement DOBClient(WebDriver driver) {
	element=driver.findElement(By.name("client_dob"));
	return element;
	
}
}