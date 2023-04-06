import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class StavljanjeKlijentaUKontekst {


    @Test

    public void StavljanjeKlijentaUKontekst(){



        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(60));
        Actions actions = new Actions(driver);
        By searchIcon = By.xpath("//mat-icon[text()='search']");
        By searchField = By.xpath("//input[@data-placeholder='Search customers...']");
        By clientPopUp = By.xpath("//div[@class='customer-info-component ng-star-inserted']");
        By okButtonOnClientPopUp = By.xpath("//span[text()='Ok']");


        driver.get("https://digital-agent.cabank.co.yu/dfrontline/agent/dashboard");
        driver.manage().window().maximize();
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@name='Username']")));
        driver.findElement(By.xpath("//*[@name='Username']")).sendKeys("nikola.becanovic");
        driver.findElement(By.xpath("//*[@name='Password']")).sendKeys("Test123456#");
        driver.findElement(By.xpath("//*[@class='btn btn-primary']")).click();
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//mat-icon[text()='arrow_drop_down']")));
        WebElement DropDown=driver.findElement(By.xpath("//mat-icon[text()='arrow_drop_down']"));
        actions.moveToElement(DropDown).doubleClick().perform();
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html[1]/body[1]/app-root[1]/default-shell[1]/mat-sidenav-container[1]/mat-sidenav[1]/div[1]/mat-nav-list[1]/ul[1]/div[1]/app-menu-list-item[6]/span[1]/li[1]/a[1]/span[1]/span[3]")));
        driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/default-shell[1]/mat-sidenav-container[1]/mat-sidenav[1]/div[1]/mat-nav-list[1]/ul[1]/div[1]/app-menu-list-item[6]/span[1]/li[1]/a[1]/span[1]/span[3]")).click();
        driver.findElement(searchIcon).click();
        wait.until(ExpectedConditions.presenceOfElementLocated(searchField));
        driver.findElement(searchField).sendKeys("07649282");
        wait.until(ExpectedConditions.elementToBeClickable(clientPopUp));
        driver.findElement(clientPopUp).click();
        driver.findElement(okButtonOnClientPopUp).click(); // radi 07.02.2023

    }
}
