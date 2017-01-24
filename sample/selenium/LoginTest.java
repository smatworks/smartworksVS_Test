/*	
 * file 		 : FirstTester.java
 * created by    : kmyu
 * creation-date : 2017. 1. 17.
 */

package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "/Users/smart/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();

        driver.get("http://great.smartworks.net/");

        driver.findElement(By.id("j_username")).clear();
        driver.findElement(By.id("j_username")).sendKeys("kmyu@smartworks.net");
        driver.findElement(By.id("j_password")).clear();
        driver.findElement(By.id("j_password")).sendKeys("12");
        driver.findElement(By.cssSelector("input.fl.btn_login")).click();

        driver.findElement(By.xpath("//div[@id='my_works']/ul/li[3]/a/span[2]")).click();
        
        driver.quit();
		
	}
}

