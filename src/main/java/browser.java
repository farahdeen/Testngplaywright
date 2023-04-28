import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class browser {

public static final String USERNAME = "mohameddeen_VumeU1";
public static final String AUTOMATE_KEY = "TLmzz5U8aUNepfdyhpT1";

public static final String url = "https://" + USERNAME + ":" + AUTOMATE_KEY + "@hub-cloud.browserstack.com/wd/hub";
    public static void main(String[] args) throws MalformedURLException {


     DesiredCapabilities cap = new DesiredCapabilities();

     cap.setCapability("os","windows");
        cap.setCapability("os_version","10");
        cap.setCapability("browser","firefox");


        WebDriver driver= new RemoteWebDriver(new URL(url),cap);

        driver.get("https://www.alexanderwatch.com/");
        driver.findElement(By.xpath("//input[@name='EMAIL")).sendKeys("deen");
    }
}// java -jar selenium-server-4.9.0.jar standalone
