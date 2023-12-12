package lib;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class HomePage extends ActionClass {
    WebDriver driver;;
    By searchFiled = By.xpath("//*[@id='twotabsearchtextbox']");
    By selectItem=By.xpath("//*[@class='s-suggestion-container']//*[@aria-label='iphone 15 plus 128 gb blue']");
    By searchItem = By.xpath("//*[@id='nav-search-submit-button']");
    By newItemSelect = By.xpath("//span[contains(text(),'iPhone 15 Plus (128 GB) - Blue')]");






    public HomePage(WebDriver driver) {
        this.driver = driver;
    }


    public void searchPhone() throws InterruptedException {
        type(driver, searchFiled, "iPhone 15 Plus (128 GB) - Blue");

    }

    public void setIphone12Page() throws InterruptedException {

        Thread.sleep(3000);
        mouseActions(driver,selectItem);
        clickOnElement(driver,searchItem);

    }

    public void setNewItemSelect() throws InterruptedException {
        Thread.sleep(3000);
        clickOnElement(driver, newItemSelect);




    }


}


