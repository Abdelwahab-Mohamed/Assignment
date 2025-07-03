package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

public class Login extends Setup {
    @FindBy(id = "email")
    private WebElement emailInput;

    @FindBy(id = "password")
    private WebElement passwordInput;

    @FindBy(id = "loginButton")
    private WebElement loginButton;

    @FindBy(xpath = "//a[@href='/register/account ']")
    private WebElement notYetACustomerLink;
    @FindBy(xpath = " //button[@aria-label='Show the shopping cart'] ")
    private WebElement cart;
    public Login() {PageFactory.initElements(driver, this);
    }
    public void navigateToRegistration() {
        jsClick(notYetACustomerLink);
    }

    public void login(String email, String password) {
        sendKeys(emailInput, email);
        sendKeys(passwordInput, password);
        click(loginButton);
    }
    public void loginSuccessful() {
        wait.until(ExpectedConditions.visibilityOf(cart));
        Assert.assertTrue(cart.isDisplayed());
    }
}
