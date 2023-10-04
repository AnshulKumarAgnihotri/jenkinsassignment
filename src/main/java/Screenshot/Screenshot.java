package Screenshot;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Screenshot {
public static  String capturescreenshot(WebDriver driver , String testname) throws IOException{
        
        String imagepath = System.getProperty("user.dir")+"/FailedtestScreenshot/"+testname +".jpg";
        File srcfile= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(srcfile, new File (imagepath)); 
		return imagepath;
        	
        }

}
