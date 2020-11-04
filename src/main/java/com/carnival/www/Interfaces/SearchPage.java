package com.carnival.www.Interfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

@DefaultUrl("https://www.carnival.com/cruise-search#?dest=bh&dur=d2&layout=grid&numAdults=2&pageNumber=1&pageSize=8&showBest=true&sort=fromprice&useSuggestions=true")
public class SearchPage extends PageObject {

    public static Target Option_pricing = Target.the("FilterPricing").located(By.xpath("//*[@id='sfn-nav-pricing']/span[1]"));
    public static Target BarElement = Target.the("BarElement").located(By.xpath("//*[@id='sfc-xfilters']/ccl-cruise-search-bar-xfilters-pricing/div/div/div/div[2]/div/div/div/span[2]"));

    public static Target LinkOption = Target.the("OptionTrip1").located(By.xpath("//*[@id='ccl-refresh-homepage']/div/div/div/div/div/ccl-cruise-search/div[3]/ccl-view-result-container/div/ccl-view-result-grid/article[1]/ccl-view-result-grid-item/div/a/ccl-route-map/div"));
    public static Target BtnLearnMore = Target.the("").located(By.xpath("//*[@id='ccl-refresh-homepage']/div/div/div/div/div/ccl-cruise-search/div[3]/ccl-view-result-container/div/ccl-view-result-grid/article[1]/ccl-view-result-grid-item/div/div[1]/ccl-view-result-grid-footer/div/div[2]/a"));

    public static Target ContactLink = Target.the("ContactLink").located(By.xpath("//*[@id='ccl-refresh-footer']/div[1]/ul[4]/li[3]/a"));

}
