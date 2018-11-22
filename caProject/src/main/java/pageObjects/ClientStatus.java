package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ClientStatus {
	private static WebElement element = null;
	 public static WebElement AddClientStatus(WebDriver driver){
		 
	element = driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/div[2]/div/div/div[1]/div[2]/div/button"));
	       
	                                       
	       return element;

	       }
	 public static WebElement submitbtn(WebDriver driver){
		 
			element = driver.findElement(By.xpath("//*[@id=\"add_price_type_form\"]/div[2]/button[1]"));
			                                     //*[@id="add_price_type_form"]/div[2]/button[1]

			       return element;

			       }
	 public static WebElement ResetBtn(WebDriver driver){
		 
			element = driver.findElement(By.xpath("//*[@id=\"add_price_type_form\"]/div[2]/button[2]"));
			       

			       return element;

			       }

	 public static WebElement ClientStaustext(WebDriver driver){
		 
			element = driver.findElement(By.id("client_type_name"));
			       

			       return element;

			       }
	 public static WebElement ClientSearch(WebDriver driver){
		 
			element = driver.findElement(By.xpath("//*[@id=\"button_datatables_example_filter\"]/label/input"));
			
			       

			       return element;

			       }
	 public static WebElement clientstat_lst_tbl(WebDriver driver) {
			element =driver.findElement(By.id("button_datatables_example"));
			return element;
		}
	public static WebElement clientStatus_Edit(WebDriver driver) {
		                     
		element =driver.findElement(By.id("edit_client_type_name"));
		return element;
		
	}
	public static WebElement EditClientStatusSubmit(WebDriver driver) {
		element=driver.findElement(By.xpath("//*[@id=\"edit_price_type_form\"]/div[2]/button[1]"));
		return element;
		
	}
}
