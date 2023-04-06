package manager;

import org.openqa.selenium.WebDriver;
import pagefactory.HomePage;
import pagefactory.MainPage;
import pagefactory.SignInPage;

public class PageFactoryManager {

    WebDriver driver;

    public PageFactoryManager(WebDriver driver) {
        this.driver = driver;
    }

    public MainPage getMainPage() {
        return new MainPage(driver);
    }

    public HomePage getHomePage() {
        return new HomePage(driver);
    }

    public SignInPage getSignInPage() {
        return new SignInPage(driver);
    }
}
