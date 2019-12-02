package grid;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Reporter;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class NodeClass {
@Test
@Parameters({"node","browser"})
public void test(String n,String b) throws MalformedURLException, InterruptedException
{
	URL ra = new URL(n); //ip address of node system
	DesiredCapabilities c = new DesiredCapabilities();
	c.setBrowserName(b);//set the browser name
	WebDriver driver = new RemoteWebDriver(ra, c);
	System.out.println("Opening browser");
	driver.get("http://google.com");
	Reporter.log(driver.getTitle(),true);
	Thread.sleep(5000);
	driver.close();
	
}
}
