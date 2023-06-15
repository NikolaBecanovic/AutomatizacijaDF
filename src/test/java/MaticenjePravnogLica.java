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
import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;






public class MaticenjePravnogLica {

    private Robot robot;
    @Test


    public void MaticenjePravnogLica() throws Exception {

    ChromeOptions options = new ChromeOptions();
    options.addArguments("--remote-allow-origins=*");
    WebDriverManager.chromedriver().setup();
    WebDriver driver = new ChromeDriver(options);
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
    JavascriptExecutor js = (JavascriptExecutor) driver;
    Actions action = new Actions(driver);
    robot = new Robot();



    //logovanje

    By username = By.xpath("//*[@name='Username']");
    By password = By.xpath("//*[@name='Password']");
    By logIn = By.xpath("//*[@class='btn btn-primary']");

    //promjena jezika

    By promenaJezika = By.xpath("//div[@class='mat-select-arrow ng-tns-c236-13']");
    By promenaJezikaSrpski = By.xpath("//span[text()=' Srpski ']");

    //Lokatori za left side

    By cif = By.xpath("(//span[@class='mat-list-item-content'])[8]");
    By newOrganization = By.xpath("//span[text()='New organization']");

    //biranje enrollment levela

    By enrollmentLevel = By.xpath("(//div[contains(@id, 'mat-select-value-')])[2]");
    By klijent = By.xpath("//span[text()=' Klijent']");
    By startProcess = By.xpath("//span[text()='Start process']");

    //Forma General information

    By idNumber = By.xpath("//*[@id='mat-input-0']");
    By commercialName = By.xpath("//*[@id='mat-input-1']");
    By legalName = By.xpath("//*[@id='mat-input-2']");
    By establishmentDate = By.xpath("//*[@id='mat-input-3']");
    By dugmeZatvori = By.xpath("//span[text()='Zatvori']");
    By dugmeComplete = By.xpath("//span[text()='Complete']");

    //Forma Registration document


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
    By noSegmet = By.xpath("//span[text()='No segment']");


    //Forma Organization profile

    //Ownership kind polje i opcije iz padajuceg menija

    By ownershipKind = By.xpath("(//div[contains(@id, 'mat-select-value-')])[2]");
    By privateEntity = By.xpath("//span[text()=' Identifies an that is owned by private entity(es)']");

    //Legal structure polje i NEKE opcije iz padajuceg menija

    By legalStructure = By.xpath("(//div[contains(@id, 'mat-select-value-')])[3]");
    By doo = By.xpath("//span[text()=' Društvo sa ograničenom odgovornošću']");

    //Registrovana delatnost firme u CIFu i jedna opcije zbog testa

    By delatnost = By.xpath("//input[contains(@id, 'mat-input-')]");
    By bezDelatnosti = By.xpath("//span[text()='0000 – 00000–Bez oznake delatnosti']");

    //Organization size polje i opcije iz padajuceg menija

    By organizationSize = By.xpath("(//div[contains(@id, 'mat-select-value-')])[4]");
    By notClassified = By.xpath("//span[text()=' Not classified']");
    By microOrganization = By.xpath("//span[text()=' Micro organization']");

    //Residental status polje i opcije iz padajuceg menija

    By residentalStatus = By.xpath("(//div[contains(@id, 'mat-select-value-')])[5]");
    By notClassifiedResidental = By.xpath("//span[text()=' Not classified']");

    //Forma Representative

    By zastupnik = By.xpath("(//input[contains(@id, 'mat-input-')])[1]");
    By zastupnikTestKlik = By.xpath("//span[text()=' Julijan Test ']");
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

    System.out.println("Korisnik je uspješno ulogovan.");

    //promjena jezika

    wait.until(ExpectedConditions.presenceOfElementLocated(promenaJezika));
    driver.findElement(promenaJezika).click();
    wait.until(ExpectedConditions.presenceOfElementLocated(promenaJezikaSrpski));
    driver.findElement(promenaJezikaSrpski).click();

    System.out.println("Korisnik je uspjesno promijenio jezik");

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
    System.out.println("Korisnik je uspješno započeo proces matičenja pravnog lica. ");

    //forma General information

    wait.until(ExpectedConditions.elementToBeClickable(idNumber));
    driver.findElement(idNumber).click();
    driver.findElement(idNumber).sendKeys("67030664");
    driver.findElement(commercialName).click();
    driver.findElement(commercialName).sendKeys("TESTFIRMA");
    driver.findElement(legalName).click();
    driver.findElement(legalName).sendKeys("TESTFIRMA");
    driver.findElement(establishmentDate).click();
    driver.findElement(establishmentDate).sendKeys("1. 1. 1970.");
    driver.findElement(dugmeComplete).click();
    wait.until(ExpectedConditions.elementToBeClickable(dugmeZatvori));
    driver.findElement(dugmeZatvori).click();
    wait.until(ExpectedConditions.elementToBeClickable(dugmeComplete));
    driver.findElement(dugmeComplete).click();
    System.out.println("Korisnik je uspješno unio osnovne podatke.");

    //stranica AML score

    wait.until(ExpectedConditions.elementToBeClickable(dugmeComplete));
    driver.findElement(dugmeComplete).click();


    //forma Registration document

    wait.until(ExpectedConditions.presenceOfElementLocated(registrationDocumentNumber));
    driver.findElement(registrationDocumentNumber).click();
    driver.findElement(registrationDocumentNumber).sendKeys("12ds3223e12");
    wait.until(ExpectedConditions.elementToBeClickable(issuingDate));
    driver.findElement(issuingDate).click();
    driver.findElement(issuingDate).sendKeys("1. 3. 2023.");
    wait.until(ExpectedConditions.elementToBeClickable(dugmeComplete));
    driver.findElement(dugmeComplete).click();

    //forma Legal address

    wait.until(ExpectedConditions.elementToBeClickable(mesto));
    driver.findElement(mesto).click();
    driver.findElement(mesto).sendKeys("NOVI SAD");
    System.out.println("Korisnik je uspješno unio adresu pravnog lica.");

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
    System.out.println("Korisnik je uspješno unio broj telefona.");

    //forma Email

    wait.until(ExpectedConditions.elementToBeClickable(email));
    driver.findElement(email).click();
    driver.findElement(email).sendKeys("rere2@re.re");
    wait.until(ExpectedConditions.elementToBeClickable(dugmeComplete));
    driver.findElement(dugmeComplete).click();
    System.out.println("Korisnik je uspješno unio email adresu.");

    //forma Tax profile

    wait.until(ExpectedConditions.elementToBeClickable(taxNumber));
    driver.findElement(taxNumber).click();
    driver.findElement(taxNumber).clear();
    driver.findElement(taxNumber).sendKeys("113719584");
    wait.until(ExpectedConditions.elementToBeClickable(dugmeComplete));
    driver.findElement(dugmeComplete).click();
    System.out.println("Korisnik je uspješno unio PIB pravnog lica.");

    //forma Customer segment

    wait.until(ExpectedConditions.elementToBeClickable(customerSegment));
    driver.findElement(customerSegment).click();
    wait.until(ExpectedConditions.elementToBeClickable(noSegmet));
    driver.findElement(noSegmet).click();
    wait.until(ExpectedConditions.elementToBeClickable(dugmeComplete));
    driver.findElement(dugmeComplete).click();
    System.out.println("Korisnik je uspješno izabrao segment pravnog lica.");

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
    wait.until(ExpectedConditions.elementToBeClickable(dugmeComplete));
    driver.findElement(dugmeComplete).click();

    //forma Representative

    wait.until(ExpectedConditions.presenceOfElementLocated(zastupnik));
    driver.findElement(zastupnik).click();
    driver.findElement(zastupnik).sendKeys("Julijan T");
    wait.until(ExpectedConditions.elementToBeClickable(zastupnikTestKlik));
    driver.findElement(zastupnikTestKlik).click();
    wait.until(ExpectedConditions.elementToBeClickable(startDate));
    driver.findElement(startDate).click();
    driver.findElement(startDate).sendKeys("1. 3. 2023.");
    wait.until(ExpectedConditions.elementToBeClickable(dugmeComplete));
    driver.findElement(dugmeComplete).click();
    System.out.println("Korisnik je uspješno unio zastpunika pravnog lica.");

    //forma Owner

    wait.until(ExpectedConditions.elementToBeClickable(addOwner));
    driver.findElement(addOwner).click();
    wait.until(ExpectedConditions.elementToBeClickable(vlasnici));
    driver.findElement(vlasnici).click();
    driver.findElement(vlasnici).sendKeys("Julijan test");
    wait.until(ExpectedConditions.elementToBeClickable(zastupnikTestKlik));
    driver.findElement(zastupnikTestKlik).click();
    wait.until(ExpectedConditions.elementToBeClickable(procenatVlasnistva));
    driver.findElement(procenatVlasnistva).click();
    driver.findElement(procenatVlasnistva).sendKeys("100");
    wait.until(ExpectedConditions.elementToBeClickable(dugmeComplete));
    driver.findElement(dugmeComplete).click();
    wait.until(ExpectedConditions.elementToBeClickable(dugmeComplete));
    driver.findElement(dugmeComplete).click();
    System.out.println("Korisnik je uspješno unio vlasnika pravnog lica.");

    //forma Beneficial owner

    wait.until(ExpectedConditions.elementToBeClickable(BeneficialOwner));
    driver.findElement(BeneficialOwner).sendKeys("Test Test");
    wait.until(ExpectedConditions.elementToBeClickable(BeneficialOwnerZastupnikTest));
    driver.findElement(BeneficialOwnerZastupnikTest).click();
    wait.until(ExpectedConditions.elementToBeClickable(dugmeComplete));
    driver.findElement(dugmeComplete).click();
    System.out.println("Korisnik je uspješno unio stvarnog vlasnika pravnog lica.");

    //forma KYC

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
    wait.until(ExpectedConditions.elementToBeClickable(pitanjeBR6));
    driver.findElement(pitanjeBR6).click();
    driver.findElement(pitanjeBR6odg).click();
    action.sendKeys(Keys.ESCAPE).perform();
    wait.until(ExpectedConditions.elementToBeClickable(dugmeComplete));
    driver.findElement(dugmeComplete).click();
    wait.until(ExpectedConditions.elementToBeClickable(dugmeComplete));
    driver.findElement(dugmeComplete).click();
    wait.until(ExpectedConditions.elementToBeClickable(dugmeComplete));
    driver.findElement(dugmeComplete).click();
    System.out.println("Korisnik je uspješno ispunio KYC formu.");

    //Customer overview

    wait.until(ExpectedConditions.elementToBeClickable(UploadSignedDocument));
    driver.findElement(UploadSignedDocument).click();
    wait.until(ExpectedConditions.elementToBeClickable(KycForm));
    driver.findElement(KycForm).click();
    wait.until(ExpectedConditions.elementToBeClickable(DragAndDrop));
    driver.findElement(DragAndDrop).click();

    // Otvori dijalog za odabir datoteke
        StringSelection stringSelection = new StringSelection("C:\\Users\\nikola.becanovic\\Desktop\\KYC\\KYC Form.pdf");
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection, null);
        robot.setAutoDelay(1000);

        // Simulira pritisak na dugmad CTRL+V za zalijepiti putanju do datoteke

        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_CONTROL);
        robot.setAutoDelay(1000);

        // Simulira pritisak na Enter  za potvrdu odabira datoteke

        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
        Thread.sleep(5000);
        wait.until(ExpectedConditions.elementToBeClickable(dugmeComplete));
        driver.findElement(dugmeComplete).click();
        System.out.println("Korisnik je uspješno uradio upload KYC forme.");

        //Otvaranje taska validity data of the legal entity

        wait.until(ExpectedConditions.presenceOfElementLocated(validityDataTask));
        driver.findElement(validityDataTask).click();
        wait.until(ExpectedConditions.presenceOfElementLocated(dugmeComplete));
        driver.findElement(dugmeComplete).click();

        //upload signed documents of the validity data

        wait.until(ExpectedConditions.elementToBeClickable(validitityDataUpload));
        driver.findElement(validitityDataUpload).click();
        wait.until(ExpectedConditions.elementToBeClickable(dragAndDropValidity));
        driver.findElement(dragAndDropValidity).click();


        // Otvori dijalog za odabir datoteke
        StringSelection validityDataSelection = new StringSelection("C:\\Users\\nikola.becanovic\\Desktop\\KYC\\KYC Form.pdf");
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(validityDataSelection, null);
        robot.setAutoDelay(1000);

        // Simulira pritisak na dugmad CTRL+V za zalijepiti putanju do datoteke

        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_CONTROL);
        robot.setAutoDelay(1000);

        // Simuliraj pritisak na tipku Enter za potvrdu odabira datoteke

        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
        Thread.sleep(5000);
        wait.until(ExpectedConditions.elementToBeClickable(dugmeComplete));
        driver.findElement(dugmeComplete).click();
        wait.until(ExpectedConditions.elementToBeClickable(dugmeComplete));
        driver.findElement(dugmeComplete).click();
        System.out.println(" Klijent je uspješno umatičen. ");

        // KRAJ TESTA


    }


}
