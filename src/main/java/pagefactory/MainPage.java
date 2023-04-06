package pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MainPage extends BasePage{

    public MainPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//*[@href='/login']")
    private WebElement singInButton;


    public void openMainPage(String URL) {
        driver.get(URL);
    }

    public void clickOnSignInButton(){
        singInButton.click();
    }

}
