package AppiumProj;

import java.io.IOException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;

public class DemoAppium {
public static void main(String[] args) throws IOException 
{

	DesiredCapabilities des= new DesiredCapabilities();
	des.setCapability("deviceName", "DeviceName");
	des.setCapability("platformName", "Android");
	des.setCapability("version", "6.1");
	des.setCapability(CapabilityType.BROWSER_NAME, "Chrome");
	des.setCapability("autoAcceptAlerts", true);
	des.setCapability("disable-popup-blocking", false);
	des.setCapability("noReset", true);
	
	
	AppiumDriver<WebElement> Appdriver=new AndroidDriver(new URL("http://127.0.0.1:4725/wd/hub"),des);
	
	Appdriver.navigate().to("https://www.google.co.in/");
	
	WebElement element =Appdriver.findElement(By.xpath("//input[@id='lst-ib']"));
	System.out.println("Element have taken");
	((JavascriptExecutor)Appdriver).executeScript("arguments[0].style.border='3px solid red'", element);
	element.clear();
	
	element.sendKeys("Heelo");
	System.out.println("Completed");
	((JavascriptExecutor)Appdriver).executeScript("arguments[0].style.border='3px solid red'", element);
	
	
}
}
