package stepsDefinition;

import Pages.Login;
import Pages.RegistrationPage;
import io.cucumber.java.en.*;

public class LoginSteps {
    Login loginPage = new Login();
    RegistrationPage registerPage = new RegistrationPage();
    @Given("user go to website")
    public void user_go_to_website() {
        loginPage.navigateTo("https://juice-shop.herokuapp.com/#/");

    }
    @Given("close banner")
    public void close_banner() {
        registerPage.dismissWelcomeBanner();
    }
    @When("user open login page")
    public void user_open_login_page() {
        registerPage.openRegistrationPage();
    }
    @When("Fill login form")
    public void fill_login_form() {
        registerPage.fillRegistrationForm("email", "password", "answer");
    }
    @When("Enter credentials")
    public void enter_credentials() {
        loginPage.login("email", "password");
    }
    @Then("user successfully login")
    public void user_successfully_login() {
        loginPage.loginSuccessful();
    }

}
