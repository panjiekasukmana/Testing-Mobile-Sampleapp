package com.example.steps;

import static org.assertj.core.api.Assertions.assertThat;

import com.example.app.Calculator;
import com.example.app.pages.CalculatorPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MathsStepDefinitions {

    int angkaA = 0;
    int angkaB = 0;
    int total = 0;

    Calculator calculator = new Calculator();

    @Given("a is {int}")
    public void givenAIs(int value) {
        angkaA = value;
    }

    @Given("b is {int}")
    public void givenBIs(int value) {
        angkaB = value;
    }

    @When("I add a and b")
    public void iAddAAndB() {
        total = calculator.add(angkaA,angkaB);
    }

    @Then("the total should be {int}")
    public void theTotalShouldBe(int expectedTotal) {
        assertThat(total).isEqualTo(expectedTotal);
    }


}
