package stepsDefinition;
import Pages.Login;
import Pages.RegistrationPage;
import Pages.Setup;
import io.cucumber.java.en.*;
public class RegistrationSteps {
    RegistrationPage registerPage = new RegistrationPage();
    @Given("user go to website")
    public void user_go_to_website() {
        registerPage.navigateTo("https://juice-shop.herokuapp.com/#/");
    }
    @Given("close banner")
    public void close_banner() {
        registerPage.dismissWelcomeBanner();
    }
    @When("user open register page")
    public void user_open_register_page() {
        registerPage.openRegistrationPage();
    }
    @When("Fill registration form")
    public void fill_registration_form() {
        registerPage.fillRegistrationForm("email", "password", "answer");
    }
    @Then("user successfully register")
    public void user_successfully_register() {
        registerPage.registrationSuccessful();
    }

}
