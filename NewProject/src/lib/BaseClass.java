package lib;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class BaseClass {

    public static WebDriver driver;

    @BeforeSuite
    public void initBrowser() throws IOException {
        String webURL = readProperty().getProperty("URL");
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get(webURL);
        driver.manage().window().maximize();
    }
    public WebDriver getDriver(){
        return driver;
    }

    public static Properties readProperty() throws IOException {
        File file = new File("N:\\NewProject\\src\\config\\config.properties");
        FileInputStream fin = new FileInputStream(file);
        Properties prop = new Properties();
        prop.load(fin);
        return prop;
    }
    @AfterSuite
    public void tearDown(){
     driver.quit();
    }
}
