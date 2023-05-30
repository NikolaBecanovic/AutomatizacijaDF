import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class KYC {

    @Test

    public void KYC() throws Exception {

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver(options);
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(60));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        Actions action = new Actions(driver);

        //logovanje

        By username = By.xpath("//*[@name='Username']");
        By password = By.xpath("//*[@name='Password']");
        By logIn = By.xpath("//*[@class='btn btn-primary']");
        By dugmeComplete = By.xpath("//span[text()='COMPLETE']");



        driver.get("https://digital-agent.cabank.co.yu/dfrontline/agent/customer-information-file/documents/upload/84072990?taskId=fad38580-fe23-11ed-b1e0-72947917c325&customerNumber=84072990");
        driver.manage().window().maximize();
        wait.until(ExpectedConditions.presenceOfElementLocated(username));
        driver.findElement(username).sendKeys("nikola.becanovic");
        driver.findElement(password).sendKeys("Test123456#");
        driver.findElement(logIn).click();

        By validityDataTask = By.xpath("//span[@class='mat-tooltip-trigger activity-name ng-star-inserted']");
        By validitityDataUpload = By.xpath("//span[text()=' • Confirmation of the validity of the data of the legal entity']");
        By dragAndDropValidity = By.xpath("//span[text()='Drag and drop file or click to upload']");

        //KYC upload signed documents

        //By UploadSignedDocument = By.xpath("//span[text()=' TESTFIRMA / KYC / Upload signed documents  - Dodeljeno je Vama ']");
        //By KycForm = By.xpath("//span[@class='mat-content ng-tns-c207-18']");
        //By DragAndDrop = By.xpath("(//mat-icon[@class='mat-icon notranslate material-icons mat-icon-no-color'])[9]");

        //popunjavanje KYC forme

        //By pitanjeBR3 = By.xpath("//*[@id='dinarsOrForeignCurrencies']");
        //By pitanjeBR4 = By.xpath("//*[@id='countryWhereMainPartOfOperationsIsConducted']");
        //By pitanjeBR2 = By.xpath("(//div[contains(@id, 'mat-select-value-')])[3]");
        //By pitanjeBR1 = By.xpath("(//div[contains(@id, 'mat-select-value-')])[2]");
        //By pitanjeBR6 = By.xpath("(//mat-select[contains(@id, 'mat-select-')])[4]");
        //By pitanjeBR1odgovor = By.xpath("//span[text()=' Current account']");
        //By pitanjeBR2odgovor = By.xpath("//span[text()=' Loan to be granted']");
        //By pitanjeBR6odg = By.xpath("//span[text()=' Securities']");

        //Upload signed documents

        //wait.until(ExpectedConditions.elementToBeClickable(UploadSignedDocument));
        //driver.findElement(UploadSignedDocument).click();
        //wait.until(ExpectedConditions.elementToBeClickable(KycForm));
        //driver.findElement(KycForm).click();
        //Thread.sleep(7000);
        //wait.until(ExpectedConditions.elementToBeClickable(DragAndDrop));
        //driver.findElement(DragAndDrop).sendKeys("C:\\Users\\nikola.becanovic\\Desktop\\KYC\\KYC Form.pdf");

        wait.until(ExpectedConditions.elementToBeClickable(validitityDataUpload));
        driver.findElement(validitityDataUpload).click();
        Thread.sleep(5000);
        wait.until(ExpectedConditions.elementToBeClickable(dragAndDropValidity));
        driver.findElement(dragAndDropValidity).sendKeys("C:\\Users\\nikola.becanovic\\Desktop\\KYC\\KYC Form.pdf");








        /*


        //popunjavanje KYC forme

        //pitanje br. 3

        //wait.until(ExpectedConditions.elementToBeClickable(pitanjeBR3));
        //driver.findElement(pitanjeBR3).click();
        //driver.findElement(pitanjeBR3).sendKeys("YES");

        //pitanje br.4

        wait.until(ExpectedConditions.elementToBeClickable(pitanjeBR4));
        driver.findElement(pitanjeBR4).click();
        driver.findElement(pitanjeBR4).sendKeys("Serbia");

        //pitanje br. 2

        wait.until(ExpectedConditions.elementToBeClickable(pitanjeBR2));
        driver.findElement(pitanjeBR2).click();
        driver.findElement(pitanjeBR2odgovor).click();

        //pitanje br.1

        wait.until(ExpectedConditions.elementToBeClickable(pitanjeBR1));
        driver.findElement(pitanjeBR1).click();
        driver.findElement(pitanjeBR1odgovor).click();
        action.sendKeys(Keys.ESCAPE).perform();



        //pitanje br.6

        action.sendKeys(Keys.ESCAPE).perform();
        Thread.sleep(7000);
        wait.until(ExpectedConditions.elementToBeClickable(pitanjeBR6));
        driver.findElement(pitanjeBR6).click();
        driver.findElement(pitanjeBR6odg).click();
        action.sendKeys(Keys.ESCAPE).perform();
        wait.until(ExpectedConditions.elementToBeClickable(dugmeComplete));
        driver.findElement(dugmeComplete).click();

        //Print and sign documents

        wait.until(ExpectedConditions.elementToBeClickable(dugmeComplete));
        driver.findElement(dugmeComplete).click();

        //Upload signed documents

        wait.until(ExpectedConditions.presenceOfElementLocated(organizationKycForm));
        driver.findElement(organizationKycForm).click();
        wait.until(ExpectedConditions.elementToBeClickable(dragAndDrop));
        driver.findElement(dragAndDrop).click();
        driver.findElement(dragAndDrop).sendKeys("C:\\Users\\nikola.becanovic\\Desktop\\KYC"); */


    }

}
