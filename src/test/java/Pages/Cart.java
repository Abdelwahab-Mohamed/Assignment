package Pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class Cart extends Setup {
    @FindBy(xpath = " //button[@aria-label='Show the shopping cart'] ")
    private WebElement cart;
    List<WebElement> addProductsButton = driver.findElements(By.className("btn-basket"));
    @FindBy(xpath = "/html/body/app-root/mat-sidenav-container/mat-sidenav-content/app-search-result/div/div/div[2]/mat-grid-list/div/mat-grid-tile[2]/div/mat-card/div/div[2]/button/span[2]/span")
    private WebElement addTotest;
    public void addProductToCart(int i ) {
        // addProductsButton.get(i).click();
        driver.findElement(By.xpath("//mat-grid-tile[" + i + "]/div/mat-card/div/div[2]/button")).click();
    }

    public void openCart() {
        addTotest.click();


    }
}