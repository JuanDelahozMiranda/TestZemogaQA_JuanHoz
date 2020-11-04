package com.carnival.www.Task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import org.openqa.selenium.WebDriver;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class CloseBrowser implements Task {

    private WebDriver driver;

    public CloseBrowser(WebDriver driver){
        this.driver = driver;
    }

    public <T extends Actor> void performAs(T actor) {
        //close driver
        driver.close();
        driver.quit();
    }

    public static CloseBrowser using(WebDriver driver){
        return instrumented(CloseBrowser.class, driver);
    }


}
