import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.webdriver.OptionsWithArguments;
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





public class MaticenjePravnogLica {

@Test

    public void MaticenjePravnogLica() throws Exception {

    ChromeOptions options = new ChromeOptions();
    options.addArguments("--remote-allow-origins=*");
    WebDriverManager.chromedriver().setup();
    WebDriver driver = new ChromeDriver(options);
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
    JavascriptExecutor js = (JavascriptExecutor) driver;
    Actions action = new Actions(driver);



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

    By enrollmentLevel = By.xpath("//span[@class='mat-select-placeholder mat-select-min-line ng-tns-c236-31 ng-star-inserted']");
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
    By registrationDocumentNumber = By.xpath("(//input[contains(@id, 'mat-input-')])[1]");
    By issuingDate = By.xpath("(//input[contains(@id, 'mat-input-')])[4]");

    //Forma Legal address

    By mesto = By.xpath("(//input[contains(@id, 'mat-input-')])[2]");
    By popUp = By.xpath("(//span[@class='ng-star-inserted'])[2]");
    By street = By.xpath("(//input[contains(@id, 'mat-input-')])[4]");
    By buildingNo = By.xpath("(//input[contains(@id, 'mat-input-')])[5]");

    //Forma Landline phone

    By areaCode = By.xpath("(//input[contains(@id, 'mat-input-')])[2]");
    By number = By.xpath("(//input[contains(@id, 'mat-input-')])[3]");

    //Forma email

    By email = By.xpath("(//input[contains(@id, 'mat-input-')])[1]");

    //Forma Tax profile

    By taxNumber = By.xpath("(//input[contains(@id, 'mat-input-')])[2]");

    //Forma Customer segment

    By customerSegment = By.xpath("(//input[contains(@id, 'mat-input-')])[1]");
    By sme = By.xpath("//span[text()='SME']");
    By corporate = By.xpath("//span[text()='CORPORATE']");
    By agro = By.xpath("//span[text()='AGRO']");
    By noSegmet = By.xpath("//span[text()='No segment']");
    By vip = By.xpath("//span[text()='VIP']");

    //Forma Organization profile

    //Ownership kind polje i opcije iz padajuceg menija

    By ownershipKind = By.xpath("(//div[contains(@id, 'mat-select-value-')])[2]");
    By privateEntity = By.xpath("//span[text()=' Identifies an that is owned by private entity(es)']");
    By publicUse = By.xpath("//span[text()=' Identifies an that is dedicated to public use and it is an subset of state owner property']");
    By ownedByState = By.xpath("//span[text()=' Identifies an that is owned by a state']");

    //Legal structure polje i NEKE opcije iz padajuceg menija

    By legalStructure = By.xpath("(//div[contains(@id, 'mat-select-value-')])[3]");
    By doo = By.xpath("//span[text()=' Društvo sa ograničenom odgovornošću']");
    By preduzetnik = By.xpath("//span[text()=' Preduzetnik']");

    //Registrovana delatnost firme u CIFu i jedna opcije zbog testa

    By delatnost = By.xpath("//input[contains(@id, 'mat-input-')]");
    By bezDelatnosti = By.xpath("//span[text()='0000 – 00000–Bez oznake delatnosti']");

    //Organization size polje i opcije iz padajuceg menija

    By organizationSize = By.xpath("(//div[contains(@id, 'mat-select-value-')])[4]");
    By notClassified = By.xpath("//span[text()=' Not classified']");
    By microOrganization = By.xpath("//span[text()=' Micro organization']");
    By smallOrganization = By.xpath("//span[text()=' Small organization']");
    By middleSizeOrganization = By.xpath("//span[text()=' Middle–size organization']");
    By largeOrganization = By.xpath("//span[text()=' Large organization']");

    //Residental status polje i opcije iz padajuceg menija

    By residentalStatus = By.xpath("(//div[contains(@id, 'mat-select-value-')])[5]");
    By notClassifiedResidental = By.xpath("//span[text()=' Not classified']");
    By domesticCapital = By.xpath("//span[text()=' Domestic capital']");
    By foreignCapital = By.xpath("//span[text()=' Foreign capital']");
    By mixedCapital = By.xpath("//span[text()=' Mixed capital']");


    //Forma Representative

    By zastupnik = By.xpath("(//input[contains(@id, 'mat-input-')])[1]");
    By zastupnikTest = By.xpath("//span[text()='Julijan ']");
    By zastupnikTestKlik = By.xpath("//span[text()=' Julijan Test ']");
    By okKlik = By.xpath("//span[text()='OK']");
    By addNewEmployment = By.xpath("(//span[@class='mat-button-wrapper'])[9]");
    By employmentPosition = By.xpath("//*[@id='mat-select-value-41']/span");
    By civilServantManagement = By.xpath("//span[text()=' Civil servant – management function']");
    By civilServant = By.xpath("//span[text()=' Civil servant']");
    By executiveDirector = By.xpath("//span[text()=' Executive Director / Senior Management']");
    By employmentDate = By.xpath("//*[@id='mat-input-37']");
    By dugmeSačuvaj = By.xpath("//span[text()='Sačuvaj']");
    By startDate = By.xpath("(//input[contains(@id, 'mat-input-')])[4]");

    //Forma Owner

    By addOwner = By.xpath("//span[text()='Add owner']");
    By vlasnici = By.xpath("(//input[contains(@id, 'mat-input-')])[1]");
    By procenatVlasnistva = By.xpath("(//input[contains(@id, 'mat-input-')])[2]");

    //forma Beneficial owner

    By BeneficialOwner = By.xpath("//input[contains(@id, 'mat-input-')]");
    By BeneficialOwnerZastupnikTest = By.xpath("//span[text()=' Test Test ']");

    //Forma KYC i neki checkboxevi

    By KycTask = By.xpath("//span[text()=' TESTFIRMA / KYC  - Dodeljeno je Vama ']");
    By pitanjeBR3 = By.xpath("//*[@id='dinarsOrForeignCurrencies']");
    By pitanjeBR4 = By.xpath("//*[@id='countryWhereMainPartOfOperationsIsConducted']");
    By pitanjeBR2 = By.xpath("(//div[contains(@id, 'mat-select-value-')])[3]");
    By pitanjeBR1 = By.xpath("(//div[contains(@id, 'mat-select-value-')])[2]");
    By pitanjeBR6 = By.xpath("(//mat-select[contains(@id, 'mat-select-')])[4]");
    By pitanjeBR1odgovor = By.xpath("//span[text()=' Current account']");
    By pitanjeBR2odgovor = By.xpath("//span[text()=' Loan to be granted']");
    By pitanjeBR6odg = By.xpath("//span[text()=' Securities']");

    //KYC upload signed documents

    By UploadSignedDocument = By.xpath("//span[text()=' TESTFIRMA / KYC / Upload signed documents  - Dodeljeno je Vama ']");
    By KycForm = By.xpath("//span[text()=' • Mandatory']");
    By DragAndDrop = By.xpath("(//mat-icon[@class='mat-icon notranslate material-icons mat-icon-no-color'])[9]");

    //Print and sign documents the of validity data of the legal entity

    By validityDataTask = By.xpath("//span[@class='mat-tooltip-trigger activity-name ng-star-inserted']");
    By validitityDataUpload = By.xpath("//span[text()=' • Confirmation of the validity of the data of the legal entity']");
    By dragAndDropValidity = By.xpath("//span[text()='Drag and drop file or click to upload']");







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

    //promjena role sada nije potrebna sa novom verzijom, ostavljam korake ali cu ih zakomentarisati

    //wait.until(ExpectedConditions.presenceOfElementLocated(promenaRole));
    //driver.findElement(promenaRole).click();
    //wait.until(ExpectedConditions.presenceOfElementLocated(promenaRoleBranchManager));
    //driver.findElement(promenaRoleBranchManager).click();
    //driver.findElement(By.xpath("//*[@id='roleSelectionCancelButton']/span[1]")).click();


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
    driver.findElement(idNumber).sendKeys("21909912");
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

    wait.until(ExpectedConditions.presenceOfElementLocated(registrationDocumentNumber));
    driver.findElement(registrationDocumentNumber).click();
    driver.findElement(registrationDocumentNumber).sendKeys("12ds3223e12");
    wait.until(ExpectedConditions.elementToBeClickable(issuingDate));
    driver.findElement(issuingDate).click();
    driver.findElement(issuingDate).sendKeys("1. 3. 2023.");
    wait.until(ExpectedConditions.elementToBeClickable(dugmeComplete));
    driver.findElement(dugmeComplete).click();

    //forma Legal address

    Thread.sleep(3000);
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

    Thread.sleep(3000);
    wait.until(ExpectedConditions.elementToBeClickable(areaCode));
    driver.findElement(areaCode).click();
    driver.findElement(areaCode).sendKeys("13");
    wait.until(ExpectedConditions.elementToBeClickable(number));
    driver.findElement(number).click();
    driver.findElement(number).sendKeys("1243435");
    wait.until(ExpectedConditions.elementToBeClickable(dugmeComplete));
    driver.findElement(dugmeComplete).click();

    //forma Email

    Thread.sleep(3000);
    wait.until(ExpectedConditions.elementToBeClickable(email));
    driver.findElement(email).click();
    driver.findElement(email).sendKeys("rere2@re.re");
    wait.until(ExpectedConditions.elementToBeClickable(dugmeComplete));
    driver.findElement(dugmeComplete).click();

    //forma Tax profile

    Thread.sleep(3000);
    wait.until(ExpectedConditions.elementToBeClickable(taxNumber));
    driver.findElement(taxNumber).click();
    driver.findElement(taxNumber).clear();
    driver.findElement(taxNumber).sendKeys("113664002");
    Thread.sleep(3000);
    wait.until(ExpectedConditions.elementToBeClickable(dugmeComplete));
    driver.findElement(dugmeComplete).click();

    //forma Customer segment

    Thread.sleep(3000);
    wait.until(ExpectedConditions.elementToBeClickable(customerSegment));
    driver.findElement(customerSegment).click();
    wait.until(ExpectedConditions.elementToBeClickable(noSegmet));
    driver.findElement(noSegmet).click();
    Thread.sleep(3000);
    wait.until(ExpectedConditions.elementToBeClickable(dugmeComplete));
    driver.findElement(dugmeComplete).click();

    //forma Organization profile

    Thread.sleep(3000);

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
    wait.until(ExpectedConditions.elementToBeClickable(dugmeComplete));
    driver.findElement(dugmeComplete).click();

    //forma Representative

    Thread.sleep(15000);

    wait.until(ExpectedConditions.presenceOfElementLocated(zastupnik));
    driver.findElement(zastupnik).click();
    driver.findElement(zastupnik).sendKeys("Julijan ");
    wait.until(ExpectedConditions.elementToBeClickable(zastupnikTestKlik));
    driver.findElement(zastupnikTestKlik).click();
    //Thread.sleep(3000);
    //wait.until(ExpectedConditions.presenceOfElementLocated(okKlik));
    //driver.findElement(okKlik).click();
    //wait.until(ExpectedConditions.elementToBeClickable(zastupnikTestKlik));
    //driver.findElement(zastupnikTestKlik).click();
    wait.until(ExpectedConditions.elementToBeClickable(startDate));
    driver.findElement(startDate).click();
    driver.findElement(startDate).sendKeys("1. 3. 2023.");
    Thread.sleep(3000);
    wait.until(ExpectedConditions.elementToBeClickable(dugmeComplete));
    driver.findElement(dugmeComplete).click();

    //forma Owner

    Thread.sleep(3000);

    wait.until(ExpectedConditions.elementToBeClickable(addOwner));
    driver.findElement(addOwner).click();
    //driver.navigate().refresh();
    //wait.until(ExpectedConditions.elementToBeClickable(addOwner));
    //driver.findElement(addOwner).click();
    wait.until(ExpectedConditions.elementToBeClickable(vlasnici));
    driver.findElement(vlasnici).click();
    driver.findElement(vlasnici).sendKeys("Julijan test");
    wait.until(ExpectedConditions.elementToBeClickable(zastupnikTestKlik));
    driver.findElement(zastupnikTestKlik).click();
    wait.until(ExpectedConditions.elementToBeClickable(procenatVlasnistva));
    driver.findElement(procenatVlasnistva).click();
    driver.findElement(procenatVlasnistva).sendKeys("100");
    Thread.sleep(3000);
    wait.until(ExpectedConditions.elementToBeClickable(dugmeComplete));
    driver.findElement(dugmeComplete).click();
    Thread.sleep(3000);
    wait.until(ExpectedConditions.elementToBeClickable(dugmeComplete));
    driver.findElement(dugmeComplete).click();

    //forma Beneficial owner

    Thread.sleep(5000);

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

    //popunjavanje KYC forme

    //pitanje br. 3

    wait.until(ExpectedConditions.elementToBeClickable(pitanjeBR3));
    driver.findElement(pitanjeBR3).click();
    driver.findElement(pitanjeBR3).sendKeys("YES");

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
    Thread.sleep(6000);
    wait.until(ExpectedConditions.elementToBeClickable(dugmeComplete));
    driver.findElement(dugmeComplete).click();
    wait.until(ExpectedConditions.elementToBeClickable(dugmeComplete));
    driver.findElement(dugmeComplete).click();

    //Customer overview

    wait.until(ExpectedConditions.elementToBeClickable(UploadSignedDocument));
    driver.findElement(UploadSignedDocument).click();
    wait.until(ExpectedConditions.elementToBeClickable(KycForm));
    driver.findElement(KycForm).click();
    Thread.sleep(4000);
    wait.until(ExpectedConditions.elementToBeClickable(DragAndDrop));
    driver.findElement(DragAndDrop).sendKeys("C:\\Users\\nikola.becanovic\\Desktop\\KYC\\KYC Form.pdf");
    wait.until(ExpectedConditions.elementToBeClickable(dugmeComplete));
    driver.findElement(dugmeComplete).click();

    //Print and sign documents the of validity data of the legal entity

    wait.until(ExpectedConditions.elementToBeClickable(validityDataTask));
    driver.findElement(validityDataTask).click();
    wait.until(ExpectedConditions.elementToBeClickable(dugmeComplete));
    driver.findElement(dugmeComplete).click();
    wait.until(ExpectedConditions.elementToBeClickable(validitityDataUpload));
    driver.findElement(validitityDataUpload).click();
    Thread.sleep(5000);
    wait.until(ExpectedConditions.elementToBeClickable(dragAndDropValidity));
    driver.findElement(dragAndDropValidity).sendKeys("C:\\Users\\nikola.becanovic\\Desktop\\KYC\\KYC Form.pdf");








}


}
