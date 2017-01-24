/*	
 * file 		 : AbstractTester.java
 * created by    : kmyu
 * creation-date : 2017. 1. 19.
 */

package net.smartworks;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import net.smartworks.util.Util;

public abstract class AbstractTester {

	public static final String DRIVER_CHROME = "chromedriver";
	public static final String DRIVER_FIREFOX = "geckodriver";
	public static final String DRIVER_SAFARI = "safaridriver";
	
	protected static WebDriver setSystemPropertyNgetDriver(String webDriverType) throws Exception{

		WebDriver driver = null;
		if (webDriverType.equals(AbstractTester.DRIVER_CHROME)) {
			System.setProperty("webdriver.chrome.driver", Util.getWebDriverPath() + webDriverType);
			driver = new ChromeDriver();
		} else if (webDriverType.equals(AbstractTester.DRIVER_FIREFOX)) {
			System.setProperty("webdriver.gecko.driver", Util.getWebDriverPath() + webDriverType);
			driver = new FirefoxDriver();
		} else if (webDriverType.equals(AbstractTester.DRIVER_SAFARI)) {
			
			//사파리브라우져의 개발자 환경 설정 중 '원격자동화설정' 을 활성화 시켜주어야 한다. 
			
			//System.setProperty("webdriver.safari.driver", Util.getWebDriverPath() + webDriverType);
			
			driver = new SafariDriver();
		}
		
		return driver;
	}
	
}

