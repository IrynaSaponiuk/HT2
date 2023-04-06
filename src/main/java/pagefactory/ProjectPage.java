package pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProjectPage extends BasePage{

    public ProjectPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//*[contains(text(), 'pom.xml')]")
    private WebElement pomXmlFile;

    public void clickOnPomFile(){
        pomXmlFile.click();
    }
}
