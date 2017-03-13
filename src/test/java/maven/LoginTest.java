package maven;

import java.awt.AWTException;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.phantomjs.PhantomJSDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public final class LoginTest {

	@Test	
	public void verifyFacebookLogin() throws IOException{
	/*System.setProperty("phantomjs.binary.path", "/usr/local/bin/phantomjs");	
	DesiredCapabilities cap = DesiredCapabilities.phantomjs();	
	WebDriver driver = new PhantomJSDriver(cap);*/
		System.setProperty("webdriver.gecko.driver","/usr/local/bin/geckodriver");		          
		WebDriver driver = new FirefoxDriver();
	driver.get("https://www.facebook.com");
	 TakesScreenshot scrShot =((TakesScreenshot)driver);

     //Call getScreenshotAs method to create image file

             File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);

         //Move image file to new destination

           //  File DestFile=new File("/Users/Shared/Jenkins/Home/workspace/Jenkins/screenshot1.jpeg");

             //Copy file at destination

          //   FileUtils.copyFile(SrcFile, DestFile);
	System.out.println(driver.getTitle());
	driver.quit();
	}
}
	/*@Test
	public void mainTest() throws InterruptedException, AWTException, IOException
	{
		System.setProperty("webdriver.gecko.driver","/usr/local/bin/geckodriver");
		FirefoxProfile profile = new FirefoxProfile(new File("/Users/Dev/Library/Application Support/Firefox/Profiles/j3y30yg4.dev-edition-default"));                  
		WebDriver driver = new FirefoxDriver(profile);
	    
		File pathToBinary = new File("/usr/local/bin/Firefox.app");
		FirefoxBinary fxBinary = new FirefoxBinary(pathToBinary);
		FirefoxProfile fxProfile = new FirefoxProfile();

	    fxProfile.setPreference("browser.download.folderList",2);
	    fxProfile.setPreference("browser.download.manager.showWhenStarting",false);
	    fxProfile.setPreference("browser.download.dir","/Users/Dev/Downloads");
	    fxProfile.setPreference("browser.helperApps.neverAsk.saveToDisk","text/csv");

	    WebDriver driver = new FirefoxDriver();
		System.setProperty("phantomjs.binary.path", "/usr/local/bin/phantomjs");	
		DesiredCapabilities cap = DesiredCapabilities.phantomjs();	
		WebDriver driver = new PhantomJSDriver(cap);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("http://live.guru99.com/index.php/backendlogin");
		 TakesScreenshot scrShot =((TakesScreenshot)driver);

	        //Call getScreenshotAs method to create image file

	                File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);

	            //Move image file to new destination

	                //File DestFile=new File("/Users/Shared/Jenkins/Home/workspace/Jenkins/screenshot.jpeg");

	                //Copy file at destination

	               // FileUtils.copyFile(SrcFile, DestFile);
		//new WebDriverWait(driver, 30).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='username']"))).sendKeys("user01");
		driver.findElement(By.xpath("//*[@id='username']")).sendKeys("user01");
		driver.findElement(By.xpath("//*[@id='login']")).sendKeys("guru99com");
		driver.findElement(By.xpath("//*[@class='form-button']")).click();
		Thread.sleep(20000);
		String parent = driver.getWindowHandle();
		System.out.println(parent);
		for(String handle : driver.getWindowHandles())
		{
			System.out.println(handle);
			driver.switchTo().window(handle);
			driver.findElement(By.xpath("//*[@class='message-popup-head']//descendant::span")).click();
		}
		Thread.sleep(5000);
		 driver.findElement(By.linkText("Sales")).click();
		//driver.findElement(By.linkText("Orders")).click();     
	
		driver.get("http://live.guru99.com/index.php/backendlogin/sales_order/index/key/8fb6e51708850a975c39ed979997cb1e/");
		 Thread.sleep(3000);
		 new Select(driver.findElement(By.xpath("//*[@id='sales_order_grid_export']"))).selectByVisibleText("CSV");
		 driver.findElement(By.xpath("//*[@id='sales_order_grid_export']//following-sibling::button[1]")).click();
		 Thread.sleep(7000);
		 String filePath= System.getProperty("user.home")+"/Downloads/orders.csv";
		 System.out.println(filePath);
			File f = new File(filePath);
		
				FileReader fr = new FileReader(f);
				BufferedReader br = new BufferedReader(fr);
				String line = br.readLine();
				while(line!=null){
					System.out.println(line);
					line = br.readLine();
				}
				fr.close();
				br.close();
		
		driver.quit();
	}
	
	
	}
	

*/