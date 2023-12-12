package stepDefination;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import lib.BaseClass;
import lib.ProductPage;
import org.openqa.selenium.WebDriver;

import static java.sql.DriverManager.getDriver;

public class ProductPageAddToCart  extends BaseClass {
    ProductPage productPage=new ProductPage(getDriver());
    @Given("Verify Page")
    public void verify_page() {
        productPage.VerifyProductPage();

    }
    @When("chick on Add to Cart")
    public void chick_on_add_to_cart() throws InterruptedException {
        productPage.setSelectMemoryConfiguration();

    }
    @Then("Added to Add to Cart")
    public void added_to_add_to_cart() throws InterruptedException {
       productPage.setAddToCart();
    }

}
