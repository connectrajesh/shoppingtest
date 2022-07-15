package  shoppingtest;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import org.junit.jupiter.api.Assertions.*;

public class StepDefinitions {

    @When("I view the cart")
    public void i_view_the_cart() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("view cart");
    }
    @Then("I find total four items listed in my cart")
    public void i_find_total_four_items_listed_in_my_cart() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("find total items listed in cart");
    }

    @When("I search for lowest price item")
    public void i_search_for_lowest_price_item() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("search lowest item");
    }
    @When("I am able to remove the lowest priced item from my cart")
    public void i_am_able_to_remove_the_lowest_priced_item_from_my_cart() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("remove the lowest priced item");
    }
    @Then("I am able to verify three items are in my cart")
    public void i_am_able_to_verify_three_items_are_in_my_cart() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("able to verify three items in cart");
    }

}
