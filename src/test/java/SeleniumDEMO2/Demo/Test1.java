package SeleniumDEMO2.Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Test1 {
  @Test
  public void f() {
	  
	  WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		
		Actions a= new Actions(driver);
		
//		hovering through moveToElement method to partiular webelement... 
//		need to use build() and perform() to execute this
		a.moveToElement(driver.findElement(By.cssSelector("a#nav-link-accountList"))).build().perform();
		
//		to write in the search bar first click() then sendKey()...keyDown(Keys.SHIFT) for pressing key to write in capitals
		a.moveToElement(driver.findElement(By.cssSelector("input#twotabsearchtextbox"))).click().keyDown(Keys.SHIFT).sendKeys("kindle").build().perform();

//		contextClick() for double clicking element
      a.moveToElement(driver.findElement(By.cssSelector("input#twotabsearchtextbox"))).contextClick().build().perform();	
	
  }
}
