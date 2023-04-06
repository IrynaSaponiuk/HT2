import manager.PageFactoryManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.log4testng.Logger;
import pagefactory.HomePage;
import pagefactory.MainPage;
import pagefactory.SignInPage;
import propertiesReader.PropertiesReaderClass;

import java.time.Duration;

import static io.github.bonigarcia.wdm.WebDriverManager.chromedriver;

public class Test {

    Logger logger = Logger.getLogger(Test.class);

    private static final String URL = "https://github.com/";
    private static final String nameOfTheProject = "HT2";

    WebDriver driver;
    HomePage homePage;
    SignInPage signInPage;
    MainPage mainPage;
    PageFactoryManager pageFactoryManager;
    PropertiesReaderClass propertiesReaderClass = new PropertiesReaderClass();
    PrintPomDependenciesClass printPomDependenciesClass = new PrintPomDependenciesClass();

    @BeforeClass
    public void testsSetUp() {
        chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        pageFactoryManager = new PageFactoryManager(driver);
    }

    @org.testng.annotations.Test
    public void test() throws Exception {
        mainPage = pageFactoryManager.getMainPage();
        mainPage.openMainPage(URL);
        mainPage.clickOnSignInButton();
        mainPage.waitForLoadingComplete(Duration.ofSeconds(10));
        signInPage = pageFactoryManager.getSignInPage();
        signInPage.typeInLogin(propertiesReaderClass.getLogin());
        signInPage.typeInPassword(propertiesReaderClass.getPassword());
        signInPage.clickOnSubmitButton();
        homePage = pageFactoryManager.getHomePage();
        homePage.waitForLoadingComplete(Duration.ofSeconds(10));
        homePage.typeInSearchBarRepository(nameOfTheProject);
        homePage.clickOnMyProject();
        printPomDependenciesClass.printPomDependencies();

    }


    @AfterClass
    public void tearDown() {
        driver.close();
    }

}
