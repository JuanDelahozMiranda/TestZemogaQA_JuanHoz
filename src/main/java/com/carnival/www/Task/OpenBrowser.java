package com.carnival.www.Task;

import com.carnival.www.Interfaces.HomePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class OpenBrowser implements Task {


    private String url = "https://www.carnival.com/";
    private WebDriver driver;

    public OpenBrowser(WebDriver Driver){
        this.driver = Driver;
    }

    public <T extends Actor> void performAs(T actor) {
        //Operacion con CHROME
        System.setProperty("webdriver.chrome.driver","src/test/Resources/Drivers/chromedriver.exe");
        ChromeOptions opt = new ChromeOptions();
        opt.setAcceptInsecureCerts(true);
        driver = new ChromeDriver(opt);
        driver.manage().window().maximize();
        driver.navigate().to(url);
        driver.manage().timeouts().pageLoadTimeout(5000, TimeUnit.MILLISECONDS);
    }

    public static OpenBrowser using(WebDriver Driver){
        return instrumented(OpenBrowser.class, Driver);
    }
}
