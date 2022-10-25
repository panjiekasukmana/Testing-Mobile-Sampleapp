package com.example.steps;

import com.example.BaseTest;
import com.example.app.pages.ListPage;
import io.appium.java_client.MobileBy;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidTouchAction;
import io.appium.java_client.touch.LongPressOptions;
import io.appium.java_client.touch.offset.ElementOption;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebElement;

import java.time.Duration;

import static com.example.app.drivers.AndroidDriverInit.driver;
import static java.nio.file.Files.find;

public class ListTugasStepDef extends BaseTest {
    @When("user go to list menu field")
    public void userGoToListMenuField() {
        navigationMenu.clickHamburgerBtn();
        navigationMenu.clickListMenu();
    }

    @And("click long press in list ke-5")
    public void clickLongPressInList() {
        listPage.longPress();
    }

    @Then("Pop up notification appears")
    public void popUpNotificationAppears() {
        //kosong
    }

    @And("click multiple times in list ke-3")
    public void clickMultipleTimesInList() {
        listPage.multipleTimes();
    }
}
