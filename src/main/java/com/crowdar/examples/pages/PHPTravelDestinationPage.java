package com.crowdar.examples.pages;

import com.crowdar.core.pageObjects.PageBaseMobile;
import io.appium.java_client.MobileBy;
import org.openqa.selenium.remote.RemoteWebDriver;

public class PHPTravelDestinationPage extends PageBaseMobile {

    private final String BUTTON_DESTINATION_XPATH="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.FrameLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.RelativeLayout/android.support.v4.view.ViewPager/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.EditText";
    private final String INPUT_DESTINATION_XPATH="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.EditText";
    private final String FIRST_DESTINATION_XPATH="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ListView/android.widget.LinearLayout[1]";
    private final String SELECT_CHECKIN_XPATH="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.FrameLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.RelativeLayout/android.support.v4.view.ViewPager/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.TextView";
    private final String DATE_XPATH="//android.view.View[@content-desc=\"";
    private final String BUTTON_ACEPT_CHECKIN_XPATH="/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.Button[2]";
    private final String SELECT_CHECKOUT_XPATH="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.FrameLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.RelativeLayout/android.support.v4.view.ViewPager/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.TextView";
    private final String BUTTON_SEARCH_XPATH="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.FrameLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.RelativeLayout/android.support.v4.view.ViewPager/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.RelativeLayout/android.widget.Button";


    public PHPTravelDestinationPage(RemoteWebDriver driver) {
        super(driver);
    }

    public void enterDestination(String destination){
        clickElement(MobileBy.xpath(BUTTON_DESTINATION_XPATH));
        completeField(MobileBy.xpath(INPUT_DESTINATION_XPATH),destination);
        clickElement(MobileBy.xpath(FIRST_DESTINATION_XPATH));
    }

    public void checkinDate(String date){
        clickElement(MobileBy.xpath(SELECT_CHECKIN_XPATH));
        clickElement(MobileBy.xpath(DATE_XPATH+date+ " June 2020\"]"));
        clickElement(MobileBy.xpath(BUTTON_ACEPT_CHECKIN_XPATH));
    }
    public void checkoutDate(String date){
        clickElement(MobileBy.xpath(SELECT_CHECKOUT_XPATH));
        clickElement(MobileBy.xpath(DATE_XPATH+date+ " June 2020\"]"));
        clickElement(MobileBy.xpath(BUTTON_ACEPT_CHECKIN_XPATH));
    }

    public void clickSearch(){
        clickElement(MobileBy.xpath(BUTTON_SEARCH_XPATH));
    }


}
