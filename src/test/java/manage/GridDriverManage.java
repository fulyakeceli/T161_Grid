package manage;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class GridDriverManage {

    static WebDriver driver;
    DesiredCapabilities capabilities=new DesiredCapabilities();

    public  WebDriver setupChromeDriver(){

        capabilities.setPlatform(Platform.ANY);
        capabilities.setBrowserName("chrome");
        capabilities.setVersion("138.0.7204.158");

        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.merge(capabilities);

        try {
            driver=new RemoteWebDriver(new URL("http://192.168.1.5:4444"),chromeOptions);
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }


        return driver;
    }

    public  WebDriver setupFirefoxDriver(){

        capabilities.setPlatform(Platform.ANY);
        capabilities.setBrowserName("firefox");
        capabilities.setVersion("141.0");

        FirefoxOptions firefoxOptions = new FirefoxOptions();
        firefoxOptions.merge(capabilities);

        try {
            driver=new RemoteWebDriver(new URL("http://192.168.1.5:4444"),firefoxOptions);
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }


        return driver;
    }

    public  WebDriver setupEdgeDriver(){

        capabilities.setPlatform(Platform.ANY);
        capabilities.setBrowserName("edge");
        capabilities.setVersion("138.0.3351.95");

        EdgeOptions edgeOptions = new EdgeOptions();
        edgeOptions.merge(capabilities);

        try {
            driver=new RemoteWebDriver(new URL("http://192.168.1.5:4444"),edgeOptions);
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }


        return driver;
    }






}