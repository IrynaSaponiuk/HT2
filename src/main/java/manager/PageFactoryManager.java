package manager;

import org.openqa.selenium.WebDriver;
import pagefactory.MainPage;

public class PageFactoryManager {

    WebDriver driver;

    public PageFactoryManager(WebDriver driver) {
        this.driver = driver;
    }

    public MainPage getHomePage(){
        return new MainPage(driver);
    }
}
