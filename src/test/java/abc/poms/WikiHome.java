package abc.poms;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WikiHome {

    private WebDriver driver;

    public WikiHome(WebDriver driver){
        this.driver = driver;

        // the page factory abstract away the logic for interacting with web element
        PageFactory.initElements(driver,this);
    }

    // we use FindBy to tell the page factory what selector and associated values to use to find the element.
    @FindBy(id = "js-link-box-en")
    public WebElement english;

    @FindBy(css = "div[lang='es']")
    public WebElement spanish;

    // bellow to use xpath we inspect from italian home page, look the Id, class, and anchor with italian language
    // then use copy full xpath.

    @FindBy(xpath = "/html/body/div[2]/div[8]/a")
    public WebElement italian;

}
