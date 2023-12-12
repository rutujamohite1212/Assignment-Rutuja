package stepDefination;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import lib.BaseClass;
import lib.RegistratorNewUser;

public class NewUserRegister extends BaseClass {
    RegistratorNewUser registratorNewUser=new RegistratorNewUser(getDriver());
    @Given("Enter click on signUp Button")
    public void enter_click_on_sign_up_button() throws InterruptedException {
        registratorNewUser.newUserRegistration();

    }
    @When("Enter All Details")
    public void enter_all_details() {
        registratorNewUser.setCreateNewUser();
    }
    @Then("Click on verify Mobile")
    public void click_on_verify_mobile() {
        registratorNewUser.setVerifyMobileNumber();

    }
}
