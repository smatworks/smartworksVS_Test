/*	
 * file 		 : FirstTester.java
 * created by    : kmyu
 * creation-date : 2017. 1. 17.
 */

package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

import net.smartworks.AbstractTester;

public class FirstTester2 extends AbstractTester {
	
	public static void main(String[] args) throws Exception{
		
		
		
		WebDriver driver = setSystemPropertyNgetDriver(DRIVER_CHROME);

       
		
		
		driver.get("http://www.google.com");
        WebElement element = driver.findElement(By.name("q"));
        
        element.sendKeys("Cheese!");

        element.submit();

        System.out.println("Page title is: " + driver.getTitle());
        
        (new WebDriverWait(driver, 10)).until(new ExpectedCondition<Boolean>() {
            public Boolean apply(WebDriver d) {
                return d.getTitle().toLowerCase().startsWith("cheese!");
            }
        });

        System.out.println("Page title is: " + driver.getTitle());
        
        driver.quit();
		
	}


}

