package stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class Grid01 {

    static WebDriver driver;

    public static void main(String[] args) throws MalformedURLException, InterruptedException {

        // driver = new ChromeDriver();

        driver = new RemoteWebDriver(new URL("http://192.168.1.8:4444"), new ChromeOptions());
        //Webdriver'ı remoteDriver'a cevirdik
        // Bunu yaparken RemoteDriver classindan hangi node'un calisacagini belirttik
        //Ayrica bu node icinden hangi driver'in optionslarını kullanacgini belirledik

        //not: firefoxta yapmak istersem ChromeOptions'i firefox'a cevirmeliyim

        driver.get("https://www.babayigit.net");
        System.out.println(driver.getCurrentUrl());
        System.out.println(driver.getTitle());
        driver.quit();
    }

    @Test
    void FireFoxGridTest() throws MalformedURLException {
        driver = new RemoteWebDriver(new URL("http://192.168.1.8:4444"), new FirefoxOptions());

        //not: firefoxta yapmak istersem ChromeOptions'i firefox'a cevirmeliyim

        driver.get("https://www.babayigit.net");
        System.out.println(driver.getCurrentUrl());
        System.out.println(driver.getTitle());
        driver.quit();

    }

    @Test
    void EdgeGridTest() throws MalformedURLException {
        driver = new RemoteWebDriver(new URL("http://192.168.1.8:4444"), new EdgeOptions());

        //not: firefoxta yapmak istersem ChromeOptions'i firefox'a cevirmeliyim

        driver.get("https://www.babayigit.net");
        System.out.println(driver.getCurrentUrl());
        System.out.println(driver.getTitle());
        driver.quit();
    }
}
