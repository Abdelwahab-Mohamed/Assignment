package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import java.time.Duration;


import static Pages.Setup.driver;

public class RegistrationPage extends Setup{

    @FindBy(linkText = "Online Demo")
    private WebElement demoPage;
    @FindBy(xpath = "//button[@aria-label='Close Welcome Banner']")
    private WebElement closeWelcomeBannerButton;
    @FindBy (id = "navbarAccount")
    private WebElement Account;
    @FindBy (id = "navbarLoginButton")
    private WebElement Login;
    @FindBy (xpath = "//div [@id='newCustomerLink']//a")
    private WebElement NewCustomer;
    @FindBy (id  ="emailControl")
    private WebElement emailInput;
    @FindBy (id = "passwordControl")
    private WebElement passwordInput;
    @FindBy (id = "repeatPasswordControl")
    private WebElement repeatPassword;
    @FindBy(name = "securityQuestion")
    private WebElement securityQuestionDropdown;
    @FindBy (id = "mat-option-4")
    private WebElement securityQuestionOption;
    @FindBy(id = "securityAnswerControl")
    private WebElement securityAnswerInput;
    @FindBy(id = "login-form")
    private WebElement loginForm;
    @FindBy(id = "registerButton")
    private WebElement registerButton;
    @FindBy(xpath = "(//simple-snack-bar//div)[1]")
    private WebElement snackBarLocator;
    public RegistrationPage() {
        PageFactory.initElements(driver, this);
    }
    public void dismissWelcomeBanner() {
        click(closeWelcomeBannerButton);
    }
    public void openRegistrationPage() {
        //  click(demoPage);
        click(Account);
        click(Login);
        click(NewCustomer);
    }

    public void fillRegistrationForm(String email, String password, String securityAnswer) {
        sendKeys(emailInput, email);
        sendKeys(passwordInput, password);
        sendKeys(repeatPassword, password);
        click(securityQuestionDropdown);
        click(securityQuestionOption);
        sendKeys(securityAnswerInput, securityAnswer);
        click(registerButton);
    }
    public void registrationSuccessful() {
        wait.until(ExpectedConditions.visibilityOf(loginForm));
        Assert.assertTrue(loginForm.isDisplayed());
    }


}

