package EPage;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;

public class Homepage {
    WebDriver driver;

    public Homepage(WebDriver driver) {
        this.driver = driver;
    }

    public void SearchinHomepage(String item) {
        driver.findElement(By.id("search")).sendKeys(item);
        driver.findElement(By.cssSelector("button[type='submit']")).click();
    }

    public void SortDropdown() {
    	WebElement dropdown=driver.findElement(By.className("sorter-options"));
        Select sel = new Select(dropdown);
        sel.selectByIndex(1);
    }


    public void ClickOnCart() {
        driver.findElement(By.cssSelector(".action.showcart")).click();
    }

    public void ClickonAscArrow() {
        driver.findElement(By.xpath("(//a[@title='Set Ascending Direction'])[1]")).click();
    }

   
    public void ClickOnSale() {
        driver.findElement(By.linkText("Sale")).click();
    }
    public void ClickOnShortBlue() {
        driver.findElement(By.linkText("Shorts")).click();
    }

    public void ClickOnItemsGrid() {
        driver.findElement(By.cssSelector(".products-grid")).click();
    }

    public void ClickOnStyle() {
       driver.findElement(By.xpath("(//div[@class='filter-options-item'])[1]")).click();
       
    }
    public void ClickOnBasic() {
    	driver.findElement(By.xpath("//a[contains(text(), 'Basic')]")).click();
    }
    public void ClickOnGear() {
        driver.findElement(By.id("ui-id-6")).click();
    }
    public void ClickonBags() {
    	driver.findElement(By.linkText("Bags")).click();
    }
    public void ClickOnStyle1() {
        driver.findElement(By.xpath("//div[@data-role='collapsible' and contains(., 'Style')]")).click();
        
     }
    
    public void ClickOnLuggage() {
    	driver.findElement(By.xpath("//a[contains(text(), 'Luggage')]")).click();
    }
    
   
    public void GoHomepage() {
        driver.findElement(By.cssSelector(".logo")).click();
    }
}

