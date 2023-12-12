package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import lib.BaseClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import java.io.IOException;

@CucumberOptions(
        features = "src/features",
        glue = {"stepDefination"},
        plugin = {"pretty",
                "html:target/cucumber-reports/cucumber.html",
                "json:target/cucumber-reports/cucumber.json"
        })

public class TestRunner extends AbstractTestNGCucumberTests {
        BaseClass baseClass=new BaseClass();
        @BeforeSuite
      public void broserIti() throws IOException {
              baseClass.initBrowser();
      }
      @AfterSuite
        public void tearDown(){
              //  baseClass.tearDown();
      }



}
