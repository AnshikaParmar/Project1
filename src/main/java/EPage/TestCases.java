package EPage;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class TestCases {
    WebDriver driver;

    public TestCases(WebDriver driver) {
        this.driver = driver;
    }

    public void ClickonAccountLink() {
        driver.findElement(By.linkText("Create an Account")).click();
    }

    public void ClickonFirstname(String firstName) {
        driver.findElement(By.id("firstname")).sendKeys(firstName);
    }

    public void ClickonLastname(String lastName) {
        driver.findElement(By.id("lastname")).sendKeys(lastName);
    }

    public void EnterEmail(String email) {
    	JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(0, 600)");
        driver.findElement(By.id("email_address")).sendKeys(email);
    }

    public void EnterPassword(String password) {
        driver.findElement(By.id("password")).sendKeys(password);
    }

    public void EnterPasswordAgain(String password) {
        driver.findElement(By.id("password-confirmation")).sendKeys(password);
    }

    public void ClickonSubmit() {
        driver.findElement(By.cssSelector("button[title='Create an Account']")).click();
    }

    public void ClickonWhatsNew() {
        driver.findElement(By.linkText("What's New")).click();
    }

    public void ClickonPants() {
        driver.findElement(By.linkText("Pants")).click();
    }

    public void ClickonPantsImage() {
        driver.findElements(By.cssSelector(".product-image-photo")).get(0).click();
    }
    public void ChooseColor(String color) {
        driver.findElement(By.id("option-label-color-93-item-50")).sendKeys(color);

    }

    public void ChooseSize(String size) {
        driver.findElement(By.id("option-label-size-143-item-171")).sendKeys(size);
    }
    
    public void ClickOnCart() {
        driver.findElement(By.xpath("(//button[@title='Add to Cart'])[1]")).click();
    }

    public void ClickonMoreInfo() {
    	JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(0, 600)");
        driver.findElement(By.id("tab-label-additional-title")).click();
    }

    public void ClickonHome() {
        driver.findElement(By.linkText("Home")).click();
    }

    public void ClickOnSignin() {
        driver.findElement(By.linkText("Sign In")).click();
    }

    public void loginCredentials(String email, String password) {
        driver.findElement(By.id("email")).sendKeys(email);
        driver.findElement(By.id("pass")).sendKeys(password);
        driver.findElement(By.id("send2")).click();
    }
    public void ClickonWhatsNew1() {
        driver.findElement(By.linkText("What's New")).click();
    }
   
}
