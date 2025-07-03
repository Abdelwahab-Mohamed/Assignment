package stepsDefinition;

import Pages.Cart;
import io.cucumber.java.en.*;

public class CartSteps {
    Cart addProduct = new Cart();
    @When("add product to cart")
    public void add_product_to_cart() {
        addProduct.addProductToCart(2);
    }
    @Then("product is added to cart")
    public void product_is_added_to_cart() {
        addProduct.openCart();    }
}
