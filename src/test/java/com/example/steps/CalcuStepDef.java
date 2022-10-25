package com.example.steps;

import com.example.BaseTest;
import com.example.app.Calculator;
import com.example.app.pages.CalculatorPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.junit.jupiter.api.Assertions;

public class CalcuStepDef extends BaseTest {
    int angkaA = 0;
    int angkaB = 0;
    int total = 0;
    double angkaAdesimal = 0;
    double angkaBdesimal = 0;

    @When("user input on angkaA is {int}")
    public void userInputOnAngkaAIs(int value) {
        angkaA = value;
        calculatorPage.InputAngkaA(value);
    }

    @And("user input on angkaB is {int}")
    public void userInputOnAngkaBIs(int value) {
        angkaB = value;
        calculatorPage.InputAngkaB(value);
    }


    @And("user click equal button")
    public void userClickEqualButton() {
        calculatorPage.ClickEqualBtn();
    }

    @And("user click drop down button")
    public void userClickDropDownButtonn() {
        calculatorPage.ClickDropDownButton();
    }

    @And("user click minus button")
    public void userClickMinusButton() {
        calculatorPage.ClickSubsBtn();
    }

    @And("user click time button")
    public void userClickTimeButton() {
        calculatorPage.clickTimeBtn();
    }


    @Then("hasil should be substract {int}")
    public void hasilShouldBeSubstract(int hasil) {
        String hasilText = calculatorPage.getHasil();
        Assertions.assertEquals("Hasil : 20", hasilText);
        boolean isDisplayed = calculatorPage.checkHasilAppear();
        Assertions.assertTrue(isDisplayed);
        MatcherAssert.assertThat(isDisplayed, Matchers.equalTo(true));
    }

    @Then("hasil should be multiplication {int}")
    public void hasilShouldBeMultiplication(int hasil) {
        String hasilText = calculatorPage.getHasil();
        Assertions.assertEquals("Hasil : 48", hasilText);
        boolean isDisplayed = calculatorPage.checkHasilAppear();
        Assertions.assertTrue(isDisplayed);
        MatcherAssert.assertThat(isDisplayed, Matchers.equalTo(true));
    }

    @And("user click divided button")
    public void userClickDividedButton() {
        calculatorPage.clickDivideBtn();
    }



    @Then("hasil should be distribution {int}")
    public void hasilShouldBeDistribution(int hasil) {
        String hasilText = calculatorPage.getHasil();
        Assertions.assertEquals("Hasil : 15", hasilText);
        boolean isDisplayed = calculatorPage.checkHasilAppear();
        Assertions.assertTrue(isDisplayed);
        MatcherAssert.assertThat(isDisplayed, Matchers.equalTo(true));
    }

    @And("user click plus button")
    public void userClickPlusButton() {
        calculatorPage.clickPlusBtn();
    }


    @Then("hasil should be adding {int}")
    public void hasilShouldBeAdding(int hasil) {
        String hasilText = calculatorPage.getHasil();
        Assertions.assertEquals("Hasil : 99", hasilText);
        boolean isDisplayed = calculatorPage.checkHasilAppear();
        Assertions.assertTrue(isDisplayed);
        MatcherAssert.assertThat(isDisplayed, Matchers.equalTo(true));
    }

    @Then("hasil should be adding negative numbers {int}")
    public void hasilShouldBeAddingNegativeNumbers(int hasil) {
        String hasilText = calculatorPage.getHasil();
        Assertions.assertEquals("Hasil : -20", hasilText);
        boolean isDisplayed = calculatorPage.checkHasilAppear();
        Assertions.assertTrue(isDisplayed);
        MatcherAssert.assertThat(isDisplayed, Matchers.equalTo(true));
    }

    @Then("hasil should be substract negative numbers {int}")
    public void hasilShouldBeSubstractNegativeNumbers(int hasil) {
        String hasilText = calculatorPage.getHasil();
        Assertions.assertEquals("Hasil : -10", hasilText);
        boolean isDisplayed = calculatorPage.checkHasilAppear();
        Assertions.assertTrue(isDisplayed);
        MatcherAssert.assertThat(isDisplayed, Matchers.equalTo(true));
    }

    @Then("hasil should be multiplication negative number {int}")
    public void hasilShouldBeMultiplicationNegativeNumber(int hasil) {
        String hasilText = calculatorPage.getHasil();
        Assertions.assertEquals("Hasil : 72", hasilText);
        boolean isDisplayed = calculatorPage.checkHasilAppear();
        Assertions.assertTrue(isDisplayed);
        MatcherAssert.assertThat(isDisplayed, Matchers.equalTo(true));
    }

    @Then("hasil should be distribution negative number {int}")
    public void hasilShouldBeDistributionNegativeNumber(int hasil) {
        String hasilText = calculatorPage.getHasil();
        Assertions.assertEquals("Hasil : 5", hasilText);
        boolean isDisplayed = calculatorPage.checkHasilAppear();
        Assertions.assertTrue(isDisplayed);
        MatcherAssert.assertThat(isDisplayed, Matchers.equalTo(true));
    }

    @Then("hasil should be distribution NaN")
    public void hasilShouldBeDistributionNaN() {
        String hasilText = calculatorPage.getHasil();
        Assertions.assertEquals("Hasil : NaN", hasilText);
        boolean isDisplayed = calculatorPage.checkHasilAppear();
        Assertions.assertTrue(isDisplayed);
        MatcherAssert.assertThat(isDisplayed, Matchers.equalTo(true));
    }

    @When("user input on angkaAdesimal is {double}")
    public void userInputOnAngkaAdesimalIs(double value) {
        angkaAdesimal = value;
        calculatorPage.InputAngkaAdesimal(value);
    }

    @And("user input on angkaBdesimal is {double}")
    public void userInputOnAngkaBdesimalIs(double value) {
        angkaBdesimal = value;
        calculatorPage.InputAngkaBdesimal(value);
    }

    @Then("hasil should be adding desimal number {double}")
    public void hasilShouldBeAddingDesimalNumber(double hasil) {
        String hasilText = calculatorPage.getHasil();
        Assertions.assertEquals("Hasil : 6.7", hasilText);
        boolean isDisplayed = calculatorPage.checkHasilAppear();
        Assertions.assertTrue(isDisplayed);
        MatcherAssert.assertThat(isDisplayed, Matchers.equalTo(true));
    }
}
