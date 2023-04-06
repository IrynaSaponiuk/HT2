package pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage{

    public HomePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//*[@id='dashboard-repos-filter-left']")
    private WebElement searchBarRepositories;

    @FindBy(xpath = "//*[@href=\"/IrynaSaponiuk/HT2\" and @class=\"mr-2 d-flex flex-items-center\" ][1]")
    private WebElement repositoryProject;

    public void typeInSearchBarRepository(String nameOfProject){
        searchBarRepositories.sendKeys(nameOfProject);
    }

    public void clickOnMyProject(){
        repositoryProject.click();
    }
}
