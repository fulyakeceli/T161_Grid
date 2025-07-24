package stepDefinitions;

import io.cucumber.java.en.Given;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import static org.testng.Assert.assertEquals;


public class babayigitStepDefinitions {

    WebDriver driver=Hooks.driver;

    @Given("kullanici url adresine gider")
    public void kullanici_url_adresine_gider() {
        driver.get("https://www.babayigit.net");
    }
    @Given("kullanici url adresini dogrular")
    public void kullanici_url_adresini_dogrular() {
        String expUrl="https://www.babayigit.net";
        String actualUrl=driver.getCurrentUrl();

        assertEquals(actualUrl,expUrl);



    }
    @Given("kullanici title bilgisini yazdirir")
    public void kullanici_title_bilgisini_yazdirir() {
        System.out.println(driver.getTitle());
    }
    @Given("kullanici sayfayi kapatir")
    public void kullanici_sayfayi_kapatir() {
        // sayfa hooks after ile kapndığı için işleme gerek yoktur
    }

}