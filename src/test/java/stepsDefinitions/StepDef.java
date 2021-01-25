package stepsDefinitions;
import org.junit.runner.RunWith;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
public class StepDef {
	
    @Given("^User is on Class landing page$")
    public void user_is_on_class_landing_page() throws Throwable {
       System.out.println("User landing page executed () ");}

    @When("^User login into application with username and password$")
    public void user_login_into_application_with_username_and_password() throws Throwable {
    	System.out.println("User LogIn executed () ");}

    @Then("^Home page is populated$")
    public void home_page_is_populated() throws Throwable {
    	System.out.println("Home page is Populated executed () ");}

    @And("^Cards are displayed$")
    public void cards_are_displayed() throws Throwable {
    	System.out.println("Displayed executed () ");}
}
