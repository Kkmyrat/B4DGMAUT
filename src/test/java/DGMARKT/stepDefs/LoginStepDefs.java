package DGMARKT.stepDefs;

import DGMARKT.pages.FirstLoginPage;
import DGMARKT.pages.MainPage;
import DGMARKT.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class LoginStepDefs {

    FirstLoginPage firstLoginPage = new FirstLoginPage();
    MainPage mainPage = new MainPage();

    @Given("The user is on the first login page")
    public void the_user_is_on_the_first_login_page() {
        firstLoginPage.navigatesToFirstLogin();
    }

    @When("The user enters first username {string} and first password {string}")
    public void the_user_enters_first_username_and_first_password(String username, String password) {
        firstLoginPage.firstLogin(username, password);
    }

    @Then("The user should be on the main page and can see the {string} text as title")
    public void the_user_should_be_on_the_main_page_and_can_see_the_text_as_title(String expectedTitle) {
        Assert.assertEquals(expectedTitle, Driver.get().getTitle());
    }

    @When("The user clicks the {string} link under {string} menu")
    public void the_user_clicks_the_link_under_menu(String loginLink, String myAccountMenu) {
        mainPage.navigatesToLoginLink(myAccountMenu, loginLink);
    }

    @When("The user enters the personal username and password")
    public void the_user_enters_the_personal_username_and_password() {
        mainPage.enterCredentials();
    }

    @Then("The user should be on the dashboard page and can see the {string} success message")
    public void the_user_should_be_on_the_dashboard_page_and_can_see_the_success_message(String expectedSuccessMessage) {
        Assert.assertEquals(expectedSuccessMessage, mainPage.successMessage());
    }


}
