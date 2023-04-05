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

    public void typeInSearchBarRepository(String nameOfProject){
        searchBarRepositories.sendKeys(nameOfProject);
    }
}
