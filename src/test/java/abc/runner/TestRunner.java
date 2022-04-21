package abc.runner;
import abc.poms.WikiHome;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.time.Duration;

@RunWith(Cucumber.class) // It determines what class it run with which is Cucumber.
@CucumberOptions(features = {"src/test/resources/features/WikiLinks.feature"},
        glue = "src/test/java/abc/steps"
        //plugin =
)
public class TestRunner {

    public static WebDriver driver;
    public static WikiHome wikiHome;

    @BeforeClass
    public static void setup(){
        File file = new File("src/test/resources/chromedriver.exe");
        System.setProperty("webdriver.chrome.driver", file.getAbsolutePath());
        driver = new ChromeDriver();
        wikiHome = new WikiHome(driver);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
    }

    @AfterClass
    public static void teardown(){

        driver.quit();
    }
}
