package stepDefinitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.And;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
public class stepDefinition {

    @Given("^User is on Netbanking landing page$")
    public void user_is_on_netbanking_landing_page() throws Throwable {
     
    	System.out.println("Navigated to the landing page.");
    }

    @When("^User logs in to the application using the username and password$")
    public void user_logs_in_to_the_application_using_the_username_and_password() throws Throwable {
       
    	System.out.println("User is successfully logged in.");
    }

    @Then("^Home page is populated$")
    public void home_page_is_populated() throws Throwable {
     
    	System.out.println("Home page is populated.");
    }

	/*
	 * @And("^Cards are displayed$") public void cards_are_displayed() throws
	 * Throwable { System.out.println("Cards are displayed."); }
	 */
    
    @When("^User logs in to the application using the username \"([^\"]*)\" and password \"([^\"]*)\"$")
    public void user_logs_in_to_the_application_using_the_username_something_and_password_something(String strArg1, String strArg2) throws Throwable {
        System.out.println(strArg1);
        System.out.println(strArg2);
    }
    
    @Then("^Cards displayed are \"([^\"]*)\"$")
    public void cards_are_displayed_are(String arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
       System.out.println(arg1);
    }

}