package  shoppingtest;

import commonLibs.implementation.CommonDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import org.junit.jupiter.api.Assertions.*;

public class ShopSteps {

    CommonDriver commonDriver;

    @Given("I add four random items to my cart")
    public void i_add_four_random_items_to_my_cart() {
        // Write code here that turns the phrase above into concrete actions
        commonDriver=new CommonDriver("chrome");
        commonDriver.getDriver().get("https://cms.demo.katalon.com/");
        System.out.println("I add four random items to my cart");
    }
}
