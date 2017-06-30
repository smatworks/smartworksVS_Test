/*	
 * file 		 : Login.java
 * created by    : kmyu
 * creation-date : 2017. 1. 19.
 */

package net.smartworks.test.input;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import net.smartworks.AbstractTester;

public class Input extends AbstractTester{
	
	public static void main(String[] args) {
		WebDriver driver = null;
		try {
			
			//DRIVER_CHROME , DRIVER_FIREFOX , DRIVER_SAFARI
			driver = setSystemPropertyNgetDriver(DRIVER_CHROME);

			driver.get("http://localhost:8080/smartworksV3");

			Thread.sleep(3000);
			
			driver.findElement(By.id("j_username")).clear();
	        driver.findElement(By.id("j_username")).sendKeys("kmyu@smartworks.net");
	        driver.findElement(By.id("j_password")).clear();
	        driver.findElement(By.id("j_password")).sendKeys("1");
	        driver.findElement(By.cssSelector("input.fl.btn_login")).click();
			
	        Thread.sleep(3000);
	       
	        driver.get("http://localhost:8080/smartworksV3/home.sw#iwork_list.sw%3Fcid%3Diw.li.pkg_c8d53678b3a74ab6809e8f7ea418fc09%26resetRequestParams%3Dtrue");

	        Thread.sleep(3000);
	        
	        driver.findElement(By.linkText("새항목 등록하기")).click();
	        driver.findElement(By.cssSelector("div.js_form_content.js_click_start_form")).click();
	        driver.findElement(By.xpath("(//input[@type='text'])[6]")).clear();
	        driver.findElement(By.xpath("(//input[@type='text'])[6]")).sendKeys("321");
	        driver.findElement(By.cssSelector("span.txt_btn_center")).click();

	        Thread.sleep(3000);
	        
	        //driver.findElement(By.xpath("//div[@id='my_works']/ul/li[3]/a/span[2]")).click();
	        
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
	        driver.quit();
		}
	}
}

