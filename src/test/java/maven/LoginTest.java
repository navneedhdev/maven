package maven;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

public final class LoginTest {

	@Test	
	public void verifyFacebookLogin(){
	System.setProperty("phantomjs.binary.path", "/usr/local/bin/phantomjs");	
	DesiredCapabilities cap = DesiredCapabilities.phantomjs();	
	WebDriver driver = new PhantomJSDriver(cap);
	driver.get("https://www.facebook.com");
	System.out.println(driver.getTitle());
		
	}
	
}
