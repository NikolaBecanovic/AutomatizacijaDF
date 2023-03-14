import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MaticenjePravnogLica {

@Test

    public void MaticenjePravnogLica() throws Exception {

    WebDriverManager.chromedriver().setup();
    WebDriver driver = new ChromeDriver();
    WebDriverWait wait = new WebDriverWait(driver, 70);
    Actions actions = new Actions(driver);
    JavascriptExecutor js = (JavascriptExecutor) driver;

    //logovanje

    By username = By.xpath("//*[@name='Username']");
    By password = By.xpath("//*[@name='Password']");
    By logIn = By.xpath("//*[@class='btn btn-primary']");

    //promjena jezika

    By promenaJezika = By.xpath("//*[@id=\"mat-select-value-1\"]/span/mat-select-trigger");
    By promenaJezikaSrpski = By.xpath("//*[@id=\"mat-option-2\"]/span");

    //promjena role

    By promenaRole = By.xpath("(//p[@class='mat-tooltip-trigger user-info-display'])[1]");
    By promenaRoleDirektor = By.xpath("//*[@id=\"mat-select-value-7\"]/span/span");
    By promenaRoleBranchManager = By.xpath("//*[@id=\"Branch manager\"]/span");

    //Lokatori za left side

    By cif = By.xpath("(//span[@class='mat-list-item-content'])[8]");
    By customerList = By.xpath("//span[text()='Customer list']");
    By newIndividual = By.xpath("//span[text()='New individual']");
    By newOrganization = By.xpath("//span[text()='New organization']");

    //biranje enrollment levela

    By enrollmentLevel = By.xpath("//div[@class='mat-select-arrow ng-tns-c236-36']");
    By prospect = By.xpath("//span[text()=' Prospect']");
    By klijent = By.xpath("//span[text()=' Klijent']");
    By startProcess = By.xpath("//span[text()='Start process']");

    //Forma General information

    By customerType = By.xpath("//span[@class='mat-select-min-line ng-tns-c236-39 ng-star-inserted']");
    By company = By.xpath("//span[text()=' Company ']");
    By entrepreneur = By.xpath("//span[text()=' Entrepreneur ']");
    By idNumber = By.xpath("//*[@id='mat-input-0']");
    By commercialName = By.xpath("//*[@id='mat-input-1']");
    By legalName = By.xpath("//*[@id='mat-input-2']");
    By establishmentDate = By.xpath("//*[@id='mat-input-3']");
    By dugmeComplete = By.xpath("//span[text()='Complete']");









    //POCETAK TESTA

    //logovanje

    driver.get("https://digital-agent.cabank.co.yu/dfrontline/agent/dashboard");
    driver.manage().window().maximize();
    wait.until(ExpectedConditions.presenceOfElementLocated(username));
    driver.findElement(username).sendKeys("nikola.becanovic");
    driver.findElement(password).sendKeys("Test123456#");
    driver.findElement(logIn).click();

    //promjena jezika

    wait.until(ExpectedConditions.presenceOfElementLocated(promenaJezika));
    driver.findElement(promenaJezika).click();
    wait.until(ExpectedConditions.presenceOfElementLocated(promenaJezikaSrpski));
    driver.findElement(promenaJezikaSrpski).click();

    // promjena role

    wait.until(ExpectedConditions.presenceOfElementLocated(promenaRole));
    driver.findElement(promenaRole).click();
    wait.until(ExpectedConditions.presenceOfElementLocated(promenaRoleDirektor));
    driver.findElement(promenaRoleDirektor).click();
    wait.until(ExpectedConditions.presenceOfElementLocated(promenaRoleBranchManager));
    driver.findElement(promenaRoleBranchManager).click();
    driver.findElement(By.xpath("//*[@id=\"roleSelectionCancelButton\"]/span[1]")).click();



    //biranje enrollment levela

    wait.until(ExpectedConditions.elementToBeClickable(cif));
    driver.findElement(cif).click();
    wait.until(ExpectedConditions.elementToBeClickable(newOrganization));
    driver.findElement(newOrganization).click();
    wait.until(ExpectedConditions.elementToBeClickable(enrollmentLevel));
    driver.findElement(enrollmentLevel).click();
    wait.until(ExpectedConditions.elementToBeClickable(klijent));
    driver.findElement(klijent).click();
    driver.findElement(startProcess).click();

    //forma General information

     wait.until(ExpectedConditions.elementToBeClickable(idNumber));
     driver.findElement(idNumber).click();
     driver.findElement(idNumber).sendKeys("23321212");
     driver.findElement(commercialName).click();
     driver.findElement(commercialName).sendKeys("TESTFIRMA");
     driver.findElement(legalName).click();
     driver.findElement(legalName).sendKeys("TESTFIRMA");
     driver.findElement(establishmentDate).click();
     driver.findElement(establishmentDate).sendKeys("1. 1. 1970.");
     driver.findElement(dugmeComplete).click();
     Thread.sleep(5000);
     wait.until(ExpectedConditions.elementToBeClickable(dugmeComplete));
     driver.findElement(dugmeComplete).click();

     // stranica AML score

    Thread.sleep(5000);
    wait.until(ExpectedConditions.elementToBeClickable(dugmeComplete));
    driver.findElement(dugmeComplete);


    // forma Registration document



}


}
