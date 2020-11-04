package com.carnival.www.Interfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

@DefaultUrl("https://www.carnival.com/booking/rooms-and-guests?currency=USD&durDays=7&embkCode=BWI&isMilitary=N&isOver55=N&isPastGuest=N&itinCode=ECY&locality=1&numGuests=2&sailDate=01032021&sailingID=93653&shipCode=PR&subRegionCode=BH")
public class BookingPage extends PageObject {

    public static Target TitlePageQuestion = Target.the("TitleQuestion").located(By.xpath("//*[@id='shell-wrapper']/div/div/div/div[1]/div/div/section/h2"));

    public static Target ContactLink = Target.the("ContactLink").located(By.xpath("//*[@id='ccl-refresh-footer']/div[1]/ul[4]/li[3]/a"));
}
