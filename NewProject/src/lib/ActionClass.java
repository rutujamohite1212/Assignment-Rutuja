package lib;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class ActionClass {
    public void type(WebDriver driver, By locator, String value) {
        driver.findElement(locator).sendKeys(value);
    }

    public void clickOnElement(WebDriver driver, By locator) {
        driver.findElement(locator).click();
    }

    public String getElementText(WebDriver driver, By locator) {
        return driver.findElement(locator).getText();
    }

    public void mouseActions(WebDriver driver, By locator) {
        Actions actions = new Actions(driver);
        actions.moveToElement(driver.findElement(locator)).click().build().perform();

    }

    public List<WebElement> getElements(WebDriver driver, By locator) {
        return driver.findElements(locator);
    }

    public void selectElement(WebDriver driver, By location, String value) {
        Select select = new Select(driver.findElement(location));
        select.selectByValue(value);
    }

    public WebElement getElement(WebDriver driver, By locator) {
        return driver.findElement(locator);
    }
}
