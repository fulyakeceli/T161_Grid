package stepDefinitions;

import manage.GridDriverManage;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class Grid02 {


    GridDriverManage manage=new GridDriverManage();
    static WebDriver driver;


    // java -jar selenium-server-4.34.0.jar standalone


    @Test
    void chromeTest(){

        driver= manage.setupChromeDriver();
        driver.get("https://www.babayigit.net");
        System.out.println(driver.getTitle());
        driver.quit();

    }

    @Test
    void firefoxTest(){
        driver= manage.setupFirefoxDriver();
        driver.get("https://www.wisequarter.com");
        System.out.println(driver.getTitle());
    }

    @Test
    void setupEdgeDriver(){
        driver= manage.setupEdgeDriver();
        driver.get("https://www.amazon.com.tr");
        System.out.println(driver.getTitle());
        driver.quit();
    }


}