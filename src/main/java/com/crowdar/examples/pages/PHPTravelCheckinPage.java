package com.crowdar.examples.pages;

import com.crowdar.core.pageObjects.PageBaseMobile;
import io.appium.java_client.MobileBy;
import org.openqa.selenium.remote.RemoteWebDriver;

public class PHPTravelCheckinPage extends PageBaseMobile {
    private final String INPUT_CARD_NUMBER_XPATH="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.EditText[1]";
    private final String INPUT_MONTHYEAR_XPATH="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.EditText[1]";
    private final String INPUT_CVV_XPATH="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.EditText[2]";
    private final String INPUT_CARD_NAME_XPATH="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.EditText[2]";

    private final String NAME_XPATH="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.EditText";
    private final String LASTNAME_XPATH="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.EditText";
    private final String EMAIL_XPATH="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.LinearLayout[1]/android.widget.FrameLayout/android.widget.EditText";
    private final String NUMBER_XPATH="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.EditText";

    private final String CONTINUE_XPATH="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[3]/android.widget.Button";

    public PHPTravelCheckinPage(RemoteWebDriver driver) {
        super(driver);
    }

    public void enterCardNumber(String number){
        completeField(MobileBy.xpath(INPUT_CARD_NUMBER_XPATH),number);
    }

    public void enterMonthYear(String number){
        completeField(MobileBy.xpath(INPUT_MONTHYEAR_XPATH),number);
    }
    public void enterCVV(String number){
        completeField(MobileBy.xpath(INPUT_CVV_XPATH),number);
    }
    public void enterCardName(String name){
        completeField(MobileBy.xpath(INPUT_CARD_NAME_XPATH),name);
    }

    public void enterName(String name){
        completeField(MobileBy.xpath(NAME_XPATH),name);
    }

    public void enterLastName(String name){
        completeField(MobileBy.xpath(LASTNAME_XPATH),name);
    }

    public void enterEmail(String email){
        completeField(MobileBy.xpath(EMAIL_XPATH),email);
    }

    public void enterPhoneNumber(String phone){
        completeField(MobileBy.xpath(NUMBER_XPATH),phone);
    }

    public void clickContinue(){clickElement(MobileBy.xpath(CONTINUE_XPATH));}

}
