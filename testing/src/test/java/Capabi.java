import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;


public class Capabi {
	WebDriver driver=null;
	public Capabi(WebDriver driver){
		this.driver=driver;
	}
	public RemoteWebDriver cap() throws MalformedURLException{
		DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability(CapabilityType.BROWSER_NAME, "Chrome");
        capabilities.setCapability(CapabilityType.VERSION, "40.0");
        capabilities.setCapability(CapabilityType.PLATFORM, "Windows 7");
        return new RemoteWebDriver(
                new URL("http://Ariel92:0d96aac1-b462-4846-9062-c77e43031e9e@ondemand.saucelabs.com:80/wd/hub"),
                capabilities);
		 
		 
	}
	public RemoteWebDriver cap2() throws MalformedURLException{
		DesiredCapabilities capabilities = DesiredCapabilities.internetExplorer();
        capabilities.setCapability("version", "8");
        capabilities.setCapability("platform", "Windows XP");
        // 
        return new RemoteWebDriver(
                new URL("http://Ariel92:0d96aac1-b462-4846-9062-c77e43031e9e@ondemand.saucelabs.com:80/wd/hub"),
                capabilities);
    }
		 
		 
	}

