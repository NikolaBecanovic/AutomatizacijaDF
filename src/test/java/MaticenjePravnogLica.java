import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.webdriver.OptionsWithArguments;
import org.junit.Test;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;





public class MaticenjePravnogLica {

@Test

    public void MaticenjePravnogLica() throws Exception {

    ChromeOptions options = new ChromeOptions();
    options.addArguments("--remote-allow-origins=*");
    WebDriverManager.chromedriver().setup();
    WebDriver driver = new ChromeDriver(options);
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
    JavascriptExecutor js = (JavascriptExecutor) driver;
    Actions actions = new Actions(driver);



    //logovanje

    By username = By.xpath("//*[@name='Username']");
    By password = By.xpath("//*[@name='Password']");
    By logIn = By.xpath("//*[@class='btn btn-primary']");

    //search lupica

    By searchIcon = By.xpath("//mat-icon[text()='search']");
    By searchField = By.xpath("//input[@data-placeholder='Search customers...']");

    //promjena jezika

    By promenaJezika = By.xpath("//*[@id='mat-select-value-1']/span/mat-select-trigger");
    By promenaJezikaSrpski = By.xpath("//span[text()=' Srpski ']");


    //promjena role

    By promenaRole = By.xpath("(//p[@class='mat-tooltip-trigger user-info-display'])[1]");
    By promenaRoleDirektor = By.xpath("//span[text()='Direktor Odeljenja za naplatu spornih potraživanja']");
    By promenaRoleBranchManager = By.xpath("//span[text()=' Branch manager ']");

    //Lokatori za left side

    By cif = By.xpath("(//span[@class='mat-list-item-content'])[8]");
    By customerList = By.xpath("//span[text()='Customer list']");
    By newIndividual = By.xpath("//span[text()='New individual']");
    By newOrganization = By.xpath("//span[text()='New organization']");

    //biranje enrollment levela

    By enrollmentLevel = By.xpath("//*[@id='mat-select-value-11']/span");
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

    //Forma Customer segment

    By customerSegment = By.xpath("//*[@id='mat-input-28']");
    By sme = By.xpath("//span[text()='SME']");
    By corporate = By.xpath("//span[text()='CORPORATE']");
    By agro = By.xpath("//span[text()='AGRO']");
    By noSegmet = By.xpath("//span[text()='No segment']");
    By vip = By.xpath("//span[text()='VIP']");

    //Forma Organization profile

    //Ownership kind polje i opcije iz padajuceg menija

    By ownershipKind = By.xpath("//*[@id='mat-select-value-29']/span");
    By privateEntity = By.xpath("//span[text()=' Identifies an that is owned by private entity(es)']");
    By publicUse = By.xpath("//span[text()=' Identifies an that is dedicated to public use and it is an subset of state owner property']");
    By ownedByState = By.xpath("//span[text()=' Identifies an that is owned by a state']");

    //Legal structure polje i NEKE opcije iz padajuceg menija

    By legalStructure = By.xpath("//*[@id='mat-select-value-31']/span");
    By doo = By.xpath("//span[text()=' Društvo sa ograničenom odgovornošću']");
    By preduzetnik = By.xpath("//span[text()=' Preduzetnik']");

    //Registrovana delatnost firme u CIFu i jedna opcije zbog testa

    By delatnost = By.xpath("//*[@id='mat-input-29']");
    By bezDelatnosti = By.xpath("//span[text()='0000 – 0000–Bez oznake delatnosti']");

    //Organization size polje i opcije iz padajuceg menija

    By organizationSize = By.xpath("//*[@id='mat-select-value-33']/span");
    By notClassified = By.xpath("//span[text()=' Not classified']");
    By microOrganization = By.xpath("//span[text()=' Micro organization']");
    By smallOrganization = By.xpath("//span[text()=' Small organization']");
    By middleSizeOrganization = By.xpath("//span[text()=' Middle–size organization']");
    By largeOrganization = By.xpath("//span[text()=' Large organization']");

    //Residental status polje i opcije iz padajuceg menija

    By residentalStatus = By.xpath("//*[@id='mat-select-value-35']/span");
    By notClassifiedResidental = By.xpath("//span[text()=' Not classified']");
    By domesticCapital = By.xpath("//span[text()=' Domestic capital']");
    By foreignCapital = By.xpath("//span[text()=' Foreign capital']");
    By mixedCapital = By.xpath("//span[text()=' Mixed capital']");

    //Sector structure polje i opcija testiranje za test

    By sectorStructure = By.xpath("//*[@id='mat-select-value-37']/span");
    By testiranje = By.xpath("//span[text()=' testiranje']");

    //Forma Representative

    By zastupnik = By.xpath("//*[@id='mat-input-30']");
    By zastupnikTest = By.xpath("//span[text()=' Julijan Test ']");
    By addNewEmployment = By.xpath("(//span[@class='mat-button-wrapper'])[9]");
    By employmentPosition = By.xpath("//*[@id='mat-select-value-41']/span");
    By civilServantManagement = By.xpath("//span[text()=' Civil servant – management function']");
    By civilServant = By.xpath("//span[text()=' Civil servant']");
    By executiveDirector = By.xpath("//span[text()=' Executive Director / Senior Management']");
    By employmentDate = By.xpath("//*[@id='mat-input-37']");
    By dugmeSačuvaj = By.xpath("//span[text()='Sačuvaj']");
    By startDate = By.xpath("//*[@id='mat-input-33']");

    //Forma Owner

    By addOwner = By.xpath("//span[text()='Add owner']");
    By vlasnici = By.xpath("//*[@id='mat-input-0']");
    By procenatVlasnistva = By.xpath("//*[@id='mat-input-1']");

    //forma Beneficial owner

    By BeneficialOwner = By.xpath("//*[@id='mat-input-5']");
    By BeneficialOwnerZastupnikTest = By.xpath("//span[text()=' Test Test ']");

    //Forma KYC i neki checkboxevi

    By KycTask = By.xpath("//span[text()=' TESTFIRMA / KYC  - Dodeljeno je Vama ']");
    By pitanjeBr1 = By.xpath("//*[@id='mat-select-value-25']");
    By CurrentAccount = By.xpath("//span[text()=' Current account']");
    By pitanjeBr2 = By.xpath("//*[@id='mat-select-value-27']");
    By TermDeposits = By.xpath("//span[text()=' Term deposits']");
    By pitanjeBr3 = By.xpath("//*[@id='dinarsOrForeignCurrencies']");
    By pitanjeBr4 = By.xpath("//*[@id='countryWhereMainPartOfOperationsIsConducted']");
    By pitanjeBr6 = By.xpath("//*[@id='mat-select-value-29']");
    By Securities = By.xpath("//span[text()=' Securities']");
    By praznoPolje = By.xpath("div[class@='cdk-overlay-backdrop cdk-overlay-transparent-backdrop cdk-overlay-backdrop-showing']");
    By toggleButton = By.xpath("//span[@class='mat-button-wrapper']");

    //KYC upload signed documents

    By UploadSignedDocument = By.xpath("//span[text()=' TESTFIRMA / KYC / Upload signed documents  - Dodeljeno je Vama ']");
    By KycForm = By.xpath("//span[text()=' • Mandatory']");
    By DragAndDrop = By.xpath("//span[text()='Drag and drop file or click to upload']");




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
    driver.findElement(By.xpath("//*[@id='roleSelectionCancelButton']/span[1]")).click();


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
    driver.findElement(idNumber).sendKeys("55749183");
    driver.findElement(commercialName).click();
    driver.findElement(commercialName).sendKeys("TESTFIRMA");
    driver.findElement(legalName).click();
    driver.findElement(legalName).sendKeys("TESTFIRMA");
    driver.findElement(establishmentDate).click();
    driver.findElement(establishmentDate).sendKeys("1. 1. 1970.");
    driver.findElement(dugmeComplete).click();
    Thread.sleep(3000);
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
    Thread.sleep(3000);
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
    driver.findElement(taxNumber).clear();
    driver.findElement(taxNumber).sendKeys("103143815");
    Thread.sleep(3000);
    wait.until(ExpectedConditions.elementToBeClickable(dugmeComplete));
    driver.findElement(dugmeComplete).click();

    //forma Customer segment

    wait.until(ExpectedConditions.elementToBeClickable(customerSegment));
    driver.findElement(customerSegment).click();
    wait.until(ExpectedConditions.elementToBeClickable(noSegmet));
    driver.findElement(noSegmet).click();
    Thread.sleep(3000);
    wait.until(ExpectedConditions.elementToBeClickable(dugmeComplete));
    driver.findElement(dugmeComplete).click();

    //forma Organization profile

    wait.until(ExpectedConditions.elementToBeClickable(ownershipKind));
    driver.findElement(ownershipKind).click();
    wait.until(ExpectedConditions.elementToBeClickable(privateEntity));
    driver.findElement(privateEntity).click();
    wait.until(ExpectedConditions.elementToBeClickable(legalStructure));
    driver.findElement(legalStructure).click();
    wait.until(ExpectedConditions.elementToBeClickable(doo));
    driver.findElement(doo).click();
    wait.until(ExpectedConditions.elementToBeClickable(delatnost));
    driver.findElement(delatnost).click();
    wait.until(ExpectedConditions.elementToBeClickable(bezDelatnosti));
    driver.findElement(bezDelatnosti).click();
    wait.until(ExpectedConditions.elementToBeClickable(organizationSize));
    driver.findElement(organizationSize).click();
    wait.until(ExpectedConditions.elementToBeClickable(microOrganization));
    driver.findElement(microOrganization).click();
    wait.until(ExpectedConditions.elementToBeClickable(residentalStatus));
    driver.findElement(residentalStatus).click();
    wait.until(ExpectedConditions.elementToBeClickable(notClassifiedResidental));
    driver.findElement(notClassified).click();
    wait.until(ExpectedConditions.elementToBeClickable(sectorStructure));
    driver.findElement(sectorStructure).click();
    wait.until(ExpectedConditions.elementToBeClickable(testiranje));
    driver.findElement(testiranje).click();
    //Thread.sleep(3000);
    wait.until(ExpectedConditions.elementToBeClickable(dugmeComplete));
    driver.findElement(dugmeComplete).click();

    //forma Representative

    wait.until(ExpectedConditions.elementToBeClickable(zastupnik));
    driver.findElement(zastupnik).click();
    driver.findElement(zastupnik).sendKeys("Julijan Test");
    wait.until(ExpectedConditions.elementToBeClickable(zastupnikTest));
    driver.findElement(zastupnikTest).click();
    wait.until(ExpectedConditions.elementToBeClickable(startDate));
    driver.findElement(startDate).click();
    driver.findElement(startDate).sendKeys("1. 3. 2023.");
    //Thread.sleep(3000);
    wait.until(ExpectedConditions.elementToBeClickable(dugmeComplete));
    driver.findElement(dugmeComplete).click();

    //forma Owner

    wait.until(ExpectedConditions.elementToBeClickable(addOwner));
    driver.findElement(addOwner).click();
    driver.navigate().refresh();
    wait.until(ExpectedConditions.elementToBeClickable(addOwner));
    driver.findElement(addOwner).click();
    wait.until(ExpectedConditions.elementToBeClickable(vlasnici));
    driver.findElement(vlasnici).click();
    driver.findElement(vlasnici).sendKeys("Julijan test");
    wait.until(ExpectedConditions.elementToBeClickable(zastupnikTest));
    driver.findElement(zastupnikTest).click();
    wait.until(ExpectedConditions.elementToBeClickable(procenatVlasnistva));
    driver.findElement(procenatVlasnistva).click();
    driver.findElement(procenatVlasnistva).sendKeys("100");
    //Thread.sleep(3000);
    wait.until(ExpectedConditions.elementToBeClickable(dugmeComplete));
    driver.findElement(dugmeComplete).click();
    Thread.sleep(5000);
    wait.until(ExpectedConditions.elementToBeClickable(dugmeComplete));
    driver.findElement(dugmeComplete).click();

    //forma Beneficial owner

    wait.until(ExpectedConditions.elementToBeClickable(BeneficialOwner));
    driver.findElement(BeneficialOwner).sendKeys("Test Test");
    wait.until(ExpectedConditions.elementToBeClickable(BeneficialOwnerZastupnikTest));
    driver.findElement(BeneficialOwnerZastupnikTest).click();
    wait.until(ExpectedConditions.elementToBeClickable(dugmeComplete));
    driver.findElement(dugmeComplete).click();

    //forma KYC

    Thread.sleep(5000);
    wait.until(ExpectedConditions.elementToBeClickable(KycTask));
    driver.findElement(KycTask).click();
    wait.until(ExpectedConditions.elementToBeClickable(pitanjeBr4));
    driver.findElement(pitanjeBr4).click();
    driver.findElement(pitanjeBr4).sendKeys("Serbia");
    wait.until(ExpectedConditions.elementToBeClickable(pitanjeBr3));
    driver.findElement(pitanjeBr3).click();
    driver.findElement(pitanjeBr3).sendKeys("NO");
    wait.until(ExpectedConditions.elementToBeClickable(pitanjeBr2));
    driver.findElement(pitanjeBr2).click();
    driver.findElement(TermDeposits).click();
    wait.until(ExpectedConditions.elementToBeClickable(pitanjeBr1));
    driver.findElement(pitanjeBr1).click();
    driver.findElement(CurrentAccount).click();
    Thread.sleep(5000);
    driver.findElement(pitanjeBr6).click();
    driver.findElement(Securities).click();
    wait.until(ExpectedConditions.elementToBeClickable(dugmeComplete));
    driver.findElement(dugmeComplete).click();
    Thread.sleep(5000);
    wait.until(ExpectedConditions.elementToBeClickable(dugmeComplete));
    driver.findElement(dugmeComplete).click();

    //Customer overview

    wait.until(ExpectedConditions.elementToBeClickable(UploadSignedDocument));
    driver.findElement(UploadSignedDocument).click();
    wait.until(ExpectedConditions.elementToBeClickable(KycForm));
    driver.findElement(KycForm).click();
    wait.until(ExpectedConditions.elementToBeClickable(DragAndDrop));
    driver.findElement(DragAndDrop).click();



}


}
