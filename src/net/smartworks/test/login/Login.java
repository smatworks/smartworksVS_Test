/*	
 * file 		 : Login.java
 * created by    : kmyu
 * creation-date : 2017. 1. 19.
 */

package net.smartworks.test.login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import net.smartworks.AbstractTester;

public class Login extends AbstractTester{
	
	public static void main(String[] args) {
		WebDriver driver = null;
		try {
			
			//DRIVER_CHROME , DRIVER_FIREFOX , DRIVER_SAFARI
			driver = setSystemPropertyNgetDriver(DRIVER_CHROME);
			
			driver.get("http://great.smartworks.net/");

	        driver.findElement(By.id("j_username")).clear();
	        driver.findElement(By.id("j_username")).sendKeys("kmyu@smartworks.net");
	        driver.findElement(By.id("j_password")).clear();
	        driver.findElement(By.id("j_password")).sendKeys("1");
	        driver.findElement(By.cssSelector("input.fl.btn_login")).click();

	        //driver.findElement(By.xpath("//div[@id='my_works']/ul/li[3]/a/span[2]")).click();
	        
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
	        driver.quit();
		}
	}
}

