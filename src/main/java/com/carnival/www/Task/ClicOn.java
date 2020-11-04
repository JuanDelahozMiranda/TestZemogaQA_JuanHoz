package com.carnival.www.Task;

import com.carnival.www.Interfaces.HomePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

import static net.serenitybdd.screenplay.Tasks.instrumented;

    public class ClicOn implements Task {

        private WebDriver driver;
        public ClicOn(WebDriver Driver){
            this.driver = Driver;
        }

        public <T extends Actor> void performAs(T actor) {
            driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
            //driver.findElement(By.xpath("//*[@id='cookie-consent-btn']")).click();
            driver.findElement(By.xpath("//*[@id='cdc-destinations']")).click();
        }

        public static ClicOn inElement(WebDriver Driver){
            return instrumented(ClicOn.class, Driver);
        }

}
