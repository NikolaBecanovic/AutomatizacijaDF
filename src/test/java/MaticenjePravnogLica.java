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

    //Forma Registration document

    By vrsta = By.xpath("//span[@class='mat-select-min-line ng-tns-c236-49 ng-star-inserted']");
    By registrationDocumentNumber = By.xpath("//*[@id='mat-input-5']");
    By issuingDate = By.xpath("//*[@id='mat-input-7']");

    //Forma Legal address

    By mesto = By.xpath("//*[@id='mat-input-17']");
    By popUp = By.xpath("(//span[@class='ng-star-inserted'])[2]");
    By street = By.xpath("//*[@id='mat-input-18']");
    By buildingNo = By.xpath("//*[@id='mat-input-10']");

    //Forma Landline phone

    By areaCode = By.xpath("//*[@id='mat-input-21']");
    By number = By.xpath("//*[@id='mat-input-22']");

    //Forma email

    By email = By.xpath("//*[@id='mat-input-25']");

    //Forma Tax profile

    By taxNumber = By.xpath("//*[@id='mat-input-27']");










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

    Thread.sleep(7000);
    wait.until(ExpectedConditions.elementToBeClickable(dugmeComplete));
    driver.findElement(dugmeComplete).click();


    // forma Registration document

    wait.until(ExpectedConditions.elementToBeClickable(vrsta));
    wait.until(ExpectedConditions.elementToBeClickable(registrationDocumentNumber));
    driver.findElement(registrationDocumentNumber).click();
    driver.findElement(registrationDocumentNumber).sendKeys("12ds3223e12");
    wait.until(ExpectedConditions.elementToBeClickable(issuingDate));
    driver.findElement(issuingDate).click();
    driver.findElement(issuingDate).sendKeys("1. 3. 2023.");
    Thread.sleep(7000);
    wait.until(ExpectedConditions.elementToBeClickable(dugmeComplete));
    driver.findElement(dugmeComplete).click();

    //forma Legal address

    wait.until(ExpectedConditions.elementToBeClickable(mesto));
    driver.findElement(mesto).click();
    driver.findElement(mesto).sendKeys("NOVI SAD");
    //ovdje klikcemo na pop up kad ukucamo u polju mesto/ulica
    wait.until(ExpectedConditions.elementToBeClickable(popUp));
    driver.findElement(popUp).click();
    wait.until(ExpectedConditions.elementToBeClickable(street));
    driver.findElement(street).click();
    driver.findElement(street).sendKeys("AKSENTIJA MAKSIMOVIĆA");
    driver.findElement(popUp).click();
    wait.until(ExpectedConditions.elementToBeClickable(buildingNo));
    driver.findElement(buildingNo).click();
    driver.findElement(buildingNo).sendKeys("188");
    wait.until(ExpectedConditions.elementToBeClickable(dugmeComplete));
    driver.findElement(dugmeComplete).click();

    //forma Landline phone

    wait.until(ExpectedConditions.elementToBeClickable(areaCode));
    driver.findElement(areaCode).click();
    driver.findElement(areaCode).sendKeys("13");
    wait.until(ExpectedConditions.elementToBeClickable(number));
    driver.findElement(number).click();
    driver.findElement(number).sendKeys("1243435");
    wait.until(ExpectedConditions.elementToBeClickable(dugmeComplete));
    driver.findElement(dugmeComplete).click();

    //forma Email

    wait.until(ExpectedConditions.elementToBeClickable(email));
    driver.findElement(email).click();
    driver.findElement(email).sendKeys("rere2@re.re");
    wait.until(ExpectedConditions.elementToBeClickable(dugmeComplete));
    driver.findElement(dugmeComplete).click();

    //forma Tax profile

    wait.until(ExpectedConditions.elementToBeClickable(taxNumber));
    driver.findElement(taxNumber).click();
    driver.findElement(taxNumber).sendKeys("");







}


}
