package pagefactory;

import org.openqa.selenium.By;
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

    private static final String LOGIN_FIELD = "//*[@id='login_field']";
    private static final String PASSWORD_FIELD = "//*[@id='password']";

    public By getLoginField(){
        return By.xpath(LOGIN_FIELD);
    }

    public By getPasswordField(){
        return By.xpath(PASSWORD_FIELD);
    }

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
