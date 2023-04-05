package pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignInPage extends BasePage{

    public SignInPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//*[@id='login_field']")
    private WebElement loginField;

    @FindBy(xpath = "//*[@id='password']")
    private WebElement passwordField;

    @FindBy(xpath = "//*[@name='commit']")
    private WebElement submitButton;

    public void typeInLogin(String login){
        loginField.sendKeys(login);
    }

    public void typeInPassword(String password){
        passwordField.sendKeys(password);
    }

    public void clickOnSubmitButton(){
        submitButton.click();
    }

}
