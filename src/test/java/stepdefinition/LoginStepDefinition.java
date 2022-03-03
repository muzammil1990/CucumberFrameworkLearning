package stepdefinition;

import org.junit.runner.RunWith;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

/**
 * Login Step Definition class
 */

public class LoginStepDefinition {

    @Given("^User is on netbanking landing page$")
    public void user_is_on_netbanking_landing_page() {
        System.out.println("In-landing page");
    }

    @When("^User logs into application using username and password$")
    public void user_logs_into_application_using_username_and_password() {
        System.out.println("In-username and pwd page");
    }

    @Then("^Home page is displayed$")
    public void home_page_is_displayed() {
        System.out.println("In-home page");
    }

    @When("^User logs into application using \"([^\"]*)\" and \"([^\"]*)\"$")
    public void user_logs_into_application_using(String username, String password) {
        System.out.println(username);
        System.out.println(password);
    }
    
    @And("^Cards are displayed$")
    public void cards_are_displayed(){
        // Write code here that turns the phrase above into concrete actions
    }
    
    @And("^Cards displayed are \"([^\"]*)\"$")
    public void cards_displayed_are(String value) throws Throwable {
        System.out.println(value);
    }

}
