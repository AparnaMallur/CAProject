package pageObjects;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ClientIndustry {
	private static WebElement element = null;
	 public static WebElement AddClientIndustry(WebDriver driver)
	 {

		
	
			  element = driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/div[2]/div/div/div[1]/div[2]/div/button"));
		       return element;
	 }
	 public static WebElement EnterClientindustryname(WebDriver driver)
	 {
		       
		       element = driver.findElement(By.id("category_type_name"));
		       
		       return element;
	 }
	 public static WebElement submitbtn(WebDriver driver)
	 {
		 
	 
		       element = driver.findElement(By.xpath("//*[@id=\"add_price_type_form\"]/div[3]/button[1]"));
		       return element;
}

}
