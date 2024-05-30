package EPage;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ProjectCases {
    WebDriver driver;
    TestCases casehandler;
    Homepage casehandler2;

    @BeforeTest
    public void beforeTest() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
        driver.get("https://magento.softwaretestingboard.com/");
        driver.manage().window().maximize();
    }
    
    @Test(priority = 1)
    public void Account() {
        casehandler = new TestCases(driver);
        casehandler.ClickonAccountLink();
    }

    @Test(priority = 2)
    public void FillAccountDetails() {
        casehandler = new TestCases(driver);
        casehandler.ClickonFirstname("Anushka");
        casehandler.ClickonLastname("Singh");
        casehandler.EnterEmail("Anushka201@gmail.com");
        casehandler.EnterPassword("Luma@298");
        casehandler.EnterPasswordAgain("Luma@298");
        casehandler.ClickonSubmit();
    }

    @Test(priority = 3)
    public void WhatsNew() {
        casehandler = new TestCases(driver);
        casehandler.ClickonWhatsNew();
    }

    @Test(priority = 4)
    public void ClickPants() {
        casehandler = new TestCases(driver);
        casehandler.ClickonPants();
    }

    @Test(priority = 5)
    public void ClickPantsImage() {
        casehandler = new TestCases(driver);
        casehandler.ClickonPantsImage();
    }

    @Test(priority = 6)
    public void ChooseColor() {
        casehandler = new TestCases(driver);
        casehandler.ChooseColor("blue");
    }

    @Test(priority = 7)
    public void ChooseSize() {
        casehandler = new TestCases(driver);
        casehandler.ChooseSize("28");
    }

    @Test(priority = 8)
    public void AddToCart() {
        casehandler = new TestCases(driver);
        casehandler.ClickOnCart();
    }

    @Test(priority = 9)
    public void ClickMoreInfo() {
        casehandler = new TestCases(driver);
        casehandler.ClickonMoreInfo();
    }

    @Test(priority = 10)
    public void GoHome() {
        casehandler = new TestCases(driver);
        casehandler.ClickonHome();
    }

    @Test(priority = 11)
    public void Signin() {
        casehandler = new TestCases(driver);
        casehandler.ClickOnSignin();
    }

    @Test(priority = 12)
    public void Login() {
        casehandler = new TestCases(driver);
        casehandler.loginCredentials("Anushka201@gmail.com", "Luma@298");
    }

    @Test(priority = 13)
    public void Search() {
        casehandler2 = new Homepage(driver);
        casehandler2.SearchinHomepage("jacket");
    }

    @Test(priority = 14)
    public void Sort() {
        casehandler2 = new Homepage(driver);
        casehandler2.SortDropdown();
    }


    @Test(priority = 15)
    public void CartClick() {
        casehandler2 = new Homepage(driver);
        casehandler2.ClickOnCart();
    }

    @Test(priority = 16)
    public void AscendingOrder() {
        casehandler2 = new Homepage(driver);
        casehandler2.ClickonAscArrow();
    }
    @Test(priority = 17)
    public void WhatsNew1() {
        casehandler = new TestCases(driver);
        casehandler.ClickonWhatsNew();
    }
    
    @Test(priority = 18)
    public void Sale() {
        casehandler2 = new Homepage(driver);
        casehandler2.ClickOnSale();
    }
    @Test(priority = 19)
    public void ClickShort() {
        casehandler2 = new Homepage(driver);
        casehandler2.ClickOnShortBlue();
    }
    @Test(priority = 20)
    public void ItemGrid() {
        casehandler2 = new Homepage(driver);
        casehandler2.ClickOnItemsGrid();
    }

    @Test(priority = 21)
    public void Style() {
        casehandler2 = new Homepage(driver);
        casehandler2.ClickOnStyle();
    }
    @Test(priority = 22)
    public void Basic() {
        casehandler2 = new Homepage(driver);
        casehandler2.ClickOnBasic();
    }
    @Test(priority = 23)
    public void Gear() {
        casehandler2 = new Homepage(driver);
        casehandler2.ClickOnGear();
    
    }
    @Test(priority = 24)
    public void Bags() {
        casehandler2 = new Homepage(driver);
        casehandler2.ClickonBags();
    }
    
    @Test(priority = 25)
    public void Style1() {
        casehandler2 = new Homepage(driver);
        casehandler2.ClickOnStyle1();
    }
    @Test(priority = 26)
    public void Luggage() {
        casehandler2 = new Homepage(driver);
        casehandler2.ClickOnLuggage();
    }
   

    @Test(priority = 27)
    public void HomepageAfterAddingItemToCart() {
        casehandler2 = new Homepage(driver);
        casehandler2.GoHomepage();
    }

    @AfterTest
    public void afterTest() {
        driver.quit();
    }
}


