package com.carnival.www.Interfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

@DefaultUrl("https://www.carnival.com/")
public class HomePage extends PageObject {

    public static Target close_popUp = Target.the("close popUp").located(By.xpath("//*[@id='MainBody']/div[2]/div/div[10]"));

    public static Target close_banner = Target.the("banner").located(By.id("cookie-consent-btn"));

    public static Target MenuOption_SailTo = Target.the("OptionMenu_SAIL").located(By.xpath("//*[@id='cdc-destinations']"));
    public static Target Option_Bahamas = Target.the("Option_Bahamas").located(By.xpath("//*[@id='ccl-cruise-search']/ccl-cruise-search/div[3]/ccl-cruise-search-bar/div/div[2]/div/div[2]/div/ccl-search-bar-expandable-filter/div/ul/li[2]/button"));

    public static Target MenuOption_Duration = Target.the("OptionMenu_DURATION").located(By.xpath("//*[@id='cdc-durations']"));
    public static Target Option_6to9 = Target.the("Option_6to9").located(By.xpath("//*[@id='ccl-cruise-search']/ccl-cruise-search/div[3]/ccl-cruise-search-bar/div/div[2]/div/div[2]/div/ul/li[2]/button"));

    public static Target BtnSearch = Target.the("BtnSearch").located(By.xpath("//*[@id='ccl-cruise-search']/ccl-cruise-search/div[3]/ccl-cruise-search-bar/div/div[2]/div/ul/li[5]/a"));

    public static Target SupportLink = Target.the("SupportLink").located(By.xpath("//*[@id='ccl-refresh-footer']/div[1]/ul[4]/li[3]/a"));

}
