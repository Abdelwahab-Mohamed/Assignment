package Pages;
import com.github.javafaker.Faker;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestRun {
    private RegistrationPage registerPage;
    private Login login = new Login();
    private Cart cartActions = new Cart();
    private Faker faker;
    private String userEmail;
    private String userPassword;
    private String userSecurityAnswer;

    @BeforeClass
    public void setUp() {
        // Initialize WebDriver and page objects
        Setup setup = new Setup();
        setup.getDriver();
        registerPage = new RegistrationPage();
        faker = new Faker();

        // Generate test data
        userEmail = faker.internet().emailAddress();
        userPassword = faker.internet().password(8, 20, true, true, true);
        userSecurityAnswer = faker.lorem().word();
    }

    @Test //Postive test
    public void testUserRegistration() {
        // Navigate to the website
        registerPage.navigateTo("https://juice-shop.herokuapp.com/#/");
        // Open registration page
        registerPage.dismissWelcomeBanner();
        registerPage.openRegistrationPage();
        // Fill and submit registration form
        registerPage.fillRegistrationForm(userEmail, userPassword, userSecurityAnswer);

        // Verify registration was successful
        registerPage.registrationSuccessful();
    }
    @Test
    public void testUserLogin() {
        testUserRegistration();
        login.login(userEmail, userPassword);
        login.loginSuccessful();
    }

    @Test
    public void addToCart() {
        testUserLogin();
        cartActions.addProductToCart(7);

        //  cartActions.openCart();
    }
    @AfterClass
    public void tearDown() throws InterruptedException {
        Thread.sleep(3000);
        Setup.closeDriver();
    }
}

