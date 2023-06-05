import io.github.bonigarcia.wdm.WebDriverManager;
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

public class MaticenjePravnogLicaTest1 {

    private WebDriver driver;
    private WebDriverWait wait;
    private Actions action;

    private static final String URL = "https://digital-agent.cabank.co.yu/dfrontline/agent/dashboard";
    private static final String USERNAME = "nikola.becanovic";
    private static final String PASSWORD = "Test123456#";
    private static final String ID_NUMBER = "21917508";
    private static final String COMMERCIAL_NAME = "TESTFIRMA";
    private static final String LEGAL_NAME = "TESTFIRMA";
    private static final String ESTABLISHMENT_DATE = "1. 1. 1970.";
    private static final String REGISTRATION_DOCUMENT_NUMBER = "12ds3223e12";
    private static final String ISSUING_DATE = "1. 3. 2023.";

    @Before
    public void setUp() throws Exception {


        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver(options);
        wait = new WebDriverWait(driver, Duration.ofSeconds(60));
        action = new Actions(driver);

        // logovanje

        driver.get(URL);
        driver.manage().window().maximize();
        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("Username"))).sendKeys(USERNAME);
        driver.findElement(By.id("Password")).sendKeys(PASSWORD);
        driver.findElement(By.xpath("//*[@class='btn btn-primary']")).click();

        // promjena jezika

        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@class='mat-select-arrow ng-tns-c236-13']"))).click();
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//span[text()=' Srpski ']"))).click();

    }


    @Test
    public void testMaticenjePravnogLica() throws Exception {


        // biranje enrollment levela

        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//span[@class='mat-list-item-content'])[8]"))).click();
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='New organization']"))).click();
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div[contains(@id, 'mat-select-value-')])[2]"))).click();
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()=' Klijent']"))).click();
        driver.findElement(By.xpath("//span[text()='Start process']")).click();

        // Forma General information

        wait.until(ExpectedConditions.elementToBeClickable(By.id("idNumber"))).sendKeys(ID_NUMBER);
        driver.findElement(By.id("commercialName")).sendKeys(COMMERCIAL_NAME);
        driver.findElement(By.id("legalName")).sendKeys(LEGAL_NAME);
        driver.findElement(By.id("establishmentDate")).sendKeys(ESTABLISHMENT_DATE);
        driver.findElement(By.id("dugmeComplete")).click();
        wait.until(ExpectedConditions.elementToBeClickable(By.id("dugmeComplete"))).click();

        // stranica AML score

        wait.until(ExpectedConditions.elementToBeClickable(By.id("dugmeComplete"))).click();

        // forma Registration document

        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("registrationDocumentNumber"))).sendKeys(REGISTRATION_DOCUMENT_NUMBER);
        driver.findElement(By.id("issuingDate")).sendKeys(ISSUING_DATE);
        driver.findElement(By.id("dugmeComplete")).click();
        wait.until(ExpectedConditions.elementToBeClickable(By.id("dugmeComplete"))).click();

    }

}
