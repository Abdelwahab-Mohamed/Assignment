package Pages;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class Setup {
    protected static WebDriver driver;
    public WebDriver getDriver(){return driver;}
    protected WebDriverWait wait;
    public WebDriverWait getWait(){return wait;}
    public Setup() {
        if (driver == null) {
            driver = new ChromeDriver();
            driver.manage().window().maximize();

        }
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }
    public void navigateTo(String url) {
        driver.get(url);
    }
    public void click(WebElement element) {
        wait.until(ExpectedConditions.elementToBeClickable(element)).click();
    }
    public void jsClick(WebElement element) {
        wait.until(ExpectedConditions.visibilityOf(element)).click();
    }
    public void sendKeys(WebElement element, String text) {
        wait.until(ExpectedConditions.visibilityOf(element)).sendKeys(text);
    }
    public String getText(WebElement element) {
        return wait.until(ExpectedConditions.visibilityOf(element)).getText();
    }
    public static void closeDriver() {
        if (driver != null) {
            driver.quit();
            driver = null;
        }
    }
}

