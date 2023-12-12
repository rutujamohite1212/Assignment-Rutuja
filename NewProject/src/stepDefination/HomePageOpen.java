package stepDefination;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import lib.BaseClass;
import lib.HomePage;

public class HomePageOpen extends BaseClass {
    HomePage homePage=new HomePage(getDriver());
    @Given("user search Phone")
    public void user_search_phone() throws InterruptedException {
        Thread.sleep(3000);
        homePage.searchPhone();
    }
    @Then("Select Iphone6")
    public void select_iphone6() throws InterruptedException {
        homePage.setIphone12Page();
    }
    @Then("Product page open")
    public void product_page_open() throws InterruptedException {
        homePage.setNewItemSelect();
    }
}
