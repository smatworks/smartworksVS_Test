/*	
 * file 		 : Util.java
 * created by    : kmyu
 * creation-date : 2017. 1. 19.
 */

package net.smartworks.util;

import java.io.File;

public class Util {
	
	
	public static String getWebDriverPath(){

	    File path = new File("");
	    String myPath = path.getAbsolutePath();
	    String webDriverPath = myPath + "/src/net/smartworks/webdriver/";
	    return webDriverPath;
	    
	}
	
	
}

