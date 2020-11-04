package com.carnival.www.Interfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;


@DefaultUrl("https://www.carnival.com/itinerary/7-day-the-bahamas-cruise/baltimore/pride/7-days/ecy?abCode=&currency=USD&hideSailingEvents=true&itinportcode=bwi&locality=1&military=N&numGuests=2&offerCode=&pastGuest=N&promoCode=&rateCode=&roomType=IS&sailDate=01032021&senior=N&smp=Y")
public class ItineraryPage extends PageObject {

    public static Target BtnBookNow = Target.the("BtnBookNow").located(By.xpath("//*[@id='sm-booking-btn']/booking-button/div/span/span/span[4]/span"));

    public static Target ContactLink = Target.the("ContactLink").located(By.xpath("//*[@id='ccl-refresh-footer']/div[1]/ul[4]/li[3]/a"));
}
