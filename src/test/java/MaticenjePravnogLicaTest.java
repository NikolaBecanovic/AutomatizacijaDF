import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.interactions.*;
import org.openqa.selenium.support.ui.*;
import org.junit.Test;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
import java.time.Duration;

public class MaticenjePravnogLicaTest {

    private WebDriver driver;
    private WebDriverWait wait;

    private By username = By.xpath("//*[@name='Username']");
    private By password = By.xpath("//*[@name='Password']");
    private By logIn = By.xpath("//*[@class='btn btn-primary']");

    private By promenaJezika = By.xpath("//*[@id='mat-select-value-1']/span/mat-select-trigger");
    private By promenaJezikaSrpski = By.xpath("//span[text()=' Srpski ']");

    private By cif = By.xpath("(//span[@class='mat-list-item-content'])[8]");
    private By newOrganization = By.xpath("//span[text()='New organization']");

    private By enrollmentLevel = By.xpath("//span[@class='mat-select-placeholder mat-select-min-line ng-tns-c236-31 ng-star-inserted']");
    private By klijent = By.xpath("//span[text()=' Klijent']");
    private By startProcess = By.xpath("//span[text()='Start process']");

    private By idNumber = By.xpath("//*[@id='mat-input-0']");
    private By commercialName = By.xpath("//*[@id='mat-input-1']");
    private By legalName = By.xpath("//*[@id='mat-input-2']");
    private By establishmentDate = By.xpath("//*[@id='mat-input-3']");
    private By dugmeComplete = By.xpath("//span[text()='Complete']");

    private By registrationDocumentNumber = By.xpath("(//input[contains(@id, 'mat-input-')])[1]");
    private By issuingDate = By.xpath("(//input[contains(@id, 'mat-input-')])[4]");

    private By mesto = By.xpath("(//input[contains(@id, 'mat-input-')])[2]");
    private By popUp = By.xpath("(//span[@class='ng-star-inserted'])[2]");
    private By street = By.xpath("(//input[contains(@id, 'mat-input-')])[4]");
    private By buildingNo = By.xpath("(//input[contains(@id, 'mat-input-')])[5]");

    private By areaCode = By.xpath("(//input[contains(@id, 'mat-input-')])[2]");
    private By number = By.xpath("(//input[contains(@id, 'mat-input-')])[3]");

    private By email = By.xpath("(//input[contains(@id, 'mat-input-')])[1]");

    private By dugmeSačuvaj = By.xpath("//span[text()='Sačuvaj']");

    public void setUp() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver(options);
        wait = new WebDriverWait(driver, Duration.ofSeconds(60));
    }

    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }

    public void login() throws Exception {
        driver.get("https://digital-agent.cabank.co.yu/dfrontline/agent/dashboard");
        driver.manage().window().maximize();
        wait.until(ExpectedConditions.presenceOfElementLocated(username));
        driver.findElement(username).sendKeys("nikola.becanovic");
        driver.findElement(password).sendKeys("Test123456#");
        driver.findElement(logIn).click();
    }

    public void changeLanguage() {
        wait.until(ExpectedConditions.presenceOfElementLocated(promenaJezika));
        driver.findElement(promenaJezika).click();
        wait.until(ExpectedConditions.presenceOfElementLocated(promenaJezikaSrpski));
        driver.findElement(promenaJezikaSrpski).click();
    }

    public void navigateToNewOrganization() {
        wait.until(ExpectedConditions.presenceOfElementLocated(cif));
        driver.findElement(cif).click();
        wait.until(ExpectedConditions.presenceOfElementLocated(newOrganization));
        driver.findElement(newOrganization).click();
    }

    public void startProcess() {
        wait.until(ExpectedConditions.presenceOfElementLocated(enrollmentLevel));
        driver.findElement(enrollmentLevel).click();
        wait.until(ExpectedConditions.presenceOfElementLocated(klijent));
        driver.findElement(klijent).click();
        driver.findElement(startProcess).click();
    }

    public void maticenjePravnogLica() throws Exception {
        wait.until(ExpectedConditions.presenceOfElementLocated(idNumber));
        driver.findElement(idNumber).sendKeys("21915980");
        driver.findElement(commercialName).sendKeys(" Digital Agency ");
        driver.findElement(legalName).sendKeys(" Digital Agency DOO ");
        driver.findElement(establishmentDate).sendKeys("1. 5. 2023.");
        driver.findElement(dugmeComplete).click();
        driver.findElement(dugmeComplete).click();

    }

    public void fillRegistrationDocument() throws Exception {
        Thread.sleep(9000);
        wait.until(ExpectedConditions.presenceOfElementLocated(registrationDocumentNumber));
        driver.findElement(registrationDocumentNumber).sendKeys("123");
        driver.findElement(issuingDate).sendKeys("1. 5. 2023.");
    }

    public void fillAddress() {
        wait.until(ExpectedConditions.presenceOfElementLocated(mesto));
        driver.findElement(mesto).sendKeys("Novi Sad");
        wait.until(ExpectedConditions.presenceOfElementLocated(popUp));
        driver.findElement(popUp).click();
        driver.findElement(street).sendKeys("Bulevar Oslobođenja");
        driver.findElement(buildingNo).sendKeys("1");
    }

    public void fillContactDetails() {
        wait.until(ExpectedConditions.presenceOfElementLocated(areaCode));
        driver.findElement(areaCode).sendKeys("021");
        driver.findElement(number).sendKeys("123456");
        driver.findElement(email).sendKeys("test@test.com");
    }

    public void saveOrganization() {
        driver.findElement(dugmeSačuvaj).click();
    }

    @Test
    public void testMaticenjePravnogLica() throws Exception {
        setUp();
        login();
        changeLanguage();
        navigateToNewOrganization();
        startProcess();
        maticenjePravnogLica();
        fillRegistrationDocument();
        fillAddress();
        fillContactDetails();
        saveOrganization();
        tearDown();
    }
}
