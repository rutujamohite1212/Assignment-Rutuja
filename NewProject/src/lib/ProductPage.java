package lib;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class ProductPage extends ActionClass {
    WebDriver driver;
    By itemPage = By.xpath("//title[contains(text(), 'Apple iPhone 15 Plus (128 GB) - Blue')]");
    By selectMemoryConfiguration = By.xpath("//div[@class='twisterTextDiv text']//p[contains(text(), '256 GB')]");
    By addToCart = By.id("add-to-cart-button");
    By clikOnCart = By.xpath("//*[@id='attach-sidesheet-checkout-button']/span/input");

    public ProductPage(WebDriver driver) {
        this.driver = driver;
    }

    public void VerifyProductPage() {
        String windw = driver.getWindowHandle();
//        System.out.printf(windw);
//        driver.switchTo().window(windw);
        Set<String> window = driver.getWindowHandles();
        List<String> stringList = new ArrayList<>(window);
        if (!stringList.isEmpty()) {
            for (String ly : stringList) {
                if (!windw.equals(ly)) {
                    System.out.println(ly);
                    driver.switchTo().window(ly);
                }
            }
        }


        WebElement productItem = driver.findElement(itemPage);

        String itemTitle = productItem.getText();
        System.out.println("dtaaga  " + itemTitle);
        String actualItemTitle = "Apple iPhone 15 Plus (128 GB) - Blue";


    }

    public void setSelectMemoryConfiguration() throws InterruptedException {
        Thread.sleep(3000);

        //   mouseActions(driver, selectMemoryConfiguration);
    }

    public void setAddToCart() throws InterruptedException {
        Thread.sleep(2000);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        wait.until(ExpectedConditions.elementToBeClickable(addToCart));
        mouseActions(driver, addToCart);
        wait.until(ExpectedConditions.elementToBeClickable(clikOnCart));
        clickOnElement(driver, clikOnCart);
    }


}
