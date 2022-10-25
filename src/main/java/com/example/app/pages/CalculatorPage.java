package com.example.app.pages;

import static com.example.app.drivers.AndroidDriverInit.driver;

import com.example.app.base.BasePageObject;
import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CalculatorPage extends BasePageObject {



  public String getTitle() {
//    By locator = MobileBy.xpath(
//        "//android.view.ViewGroup[@resource-id='com.isl.simpleapp:id/toolbar']//android.widget.TextView");
//    AndroidElement labelTitle = driver.findElement(locator);
//    return labelTitle.getText();
    return getText(MobileBy.xpath("//android.view.ViewGroup[@resource-id='com.isl.simpleapp:id/toolbar']//android.widget.TextView"));
  }

  public boolean checkHamburgerBtnAppear() {
//    By locator = MobileBy.AccessibilityId("Open navigation drawer");
//    AndroidElement hamburgerBtn = driver.findElement(locator);
//    return hamburgerBtn.isDisplayed();

    //explicit wait
    By locator = MobileBy.AccessibilityId("Open navigation drawer");
    WebDriverWait wait = new WebDriverWait(driver, 10, 1000);
    AndroidElement hamburgerBtn = (AndroidElement) wait.until(ExpectedConditions.presenceOfElementLocated(locator));
    return hamburgerBtn.isDisplayed();
  }

  public void InputAngkaA (int angkaA){
    type(MobileBy.id("et_1"), (Integer.toString(angkaA)));
  }

  public void InputAngkaAdesimal (double angkaA) {type(MobileBy.id("et_1"), (Double.toString(angkaA)));}

  public void InputAngkaBdesimal (double angkaB) {type(MobileBy.id("et_2"), (Double.toString(angkaB)));}
  public void InputAngkaB (int angkaB){
    type(MobileBy.id("et_2"), (Integer.toString(angkaB)));
  }
  public void ClickEqualBtn (){
    click(MobileBy.id("acb_calculate"));
  }
  public void ClickDropDownButton(){
    click(MobileBy.id("spinner_1"));
  }
  public void ClickSubsBtn(){
    click(MobileBy.xpath("//android.widget.TextView[@text=\"-\"]"));
  }
  public void clickTimeBtn(){
    click(MobileBy.xpath("//android.widget.TextView[@text=\"*\"]"));
  }
  public void clickDivideBtn(){
    click(MobileBy.xpath("//android.widget.TextView[@text=\"/\"]"));
  }
  public void clickPlusBtn(){
    click(MobileBy.xpath("//android.widget.TextView[@text=\"+\"]"));
  }
  public String getHasil(){
    return getText(MobileBy.id("tv_result"));
  }

  public boolean checkHasilAppear(){
    By locator = MobileBy.id("tv_result");
    AndroidElement hasilAppear = driver.findElement(locator);
    return hasilAppear.isDisplayed();
  }

}
