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


public class E2EOtvaranjeDeviznogRacuna {

    @Test

    public void OtvaranjeDeviznogRacuna() throws Exception {

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver(options);
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(60));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        Actions action = new Actions(driver);

        //LOKATORI

        //logovanje

        By username = By.xpath("//*[@name='Username']");
        By password = By.xpath("//*[@name='Password']");
        By logIn = By.xpath("//*[@class='btn btn-primary']");


        //lokatori za stavljanje klijenta u kontekst

        By searchIcon = By.xpath("//mat-icon[text()='search']");
        By searchField = By.xpath("//input[@data-placeholder='Search customers...']");
        By clientPopUp = By.xpath("//div[@class='customer-info-component ng-star-inserted']");
        By okButtonOnClientPopUp = By.xpath("//span[text()='Ok']");

        //ulazak u katalog proizvoda

        By katalogProizvoda = By.xpath("//span[text()='Katalog proizvoda']");

        //racuni pravnih lica

        By racuniPravnaLica = By.xpath("//*[@id='DO-CURRENT-ACCOUNTS-LEproductDetails']/span[1]");
        By devizniPlatniPromet = By.xpath("//*[@id='productDO-CURRENT-ACCOUNTS-FOREIGN-LE']/mat-card-actions/button/span[1]");
        By devizniOsnovniRacun = By.xpath("//*[@id='productDO-CA-FOREIGN-LE']/mat-card-actions/button");
        By uslovi = By.xpath("//*[@id='applyForProductButton']/span[1]");

        //promjena jezika

        By promenaJezika = By.xpath("//*[@id='mat-select-value-1']/span/mat-select-trigger");
        By promenaJezikaSrpski = By.xpath("//span[text()=' Srpski ']");

        //Informacija za CRM

        By informacijaCrmTask = By.xpath("//span[text()=' Informacija CRM  - Dodeljeno je Vama ']");
        By dugmeComplete = By.xpath("//span[text()='COMPLETE']");

        //Izbor racuna za naplatu naknada

        By izaberiteOsnovniRacun = By.xpath("(//div[contains(@id, 'mat-select-value-')])[2]");
        By osnovniRacunIzabran = By.xpath("(//span[@class='ng-star-inserted'])[1]");

        //Prikaz detalja racuna sa Odlukom o pecatu

        By togglePecat = By.xpath("//*[@id='isDiferent']");

        //Izbor tipa zakonskog zastupanja

        By izborZakonskogZastupanja = By.xpath("(//div[contains(@id, 'mat-select-value-')])[2]");
        By izaberiteZastupnik = By.xpath("(//div[contains(@id, 'mat-select-value-')])[3]");
        By pojedinacnoZastupanje = By.xpath("//span[text()=' Pojedinačno zastupanje']");
        By dodajteZastupnikaEvidentiranogUCif = By.xpath("//span[text()='Dodajte zastupnika evidentiranog u CIF']");
        By biranjeZastupnika = By.xpath("(//span[@class='mat-option-text'])[1]");
        By dodajteZastupnikaDugme = By.xpath("//span[text()='DODAJTE ZASTUPNIKA']");

        //popunjavanje KYC forme

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























        //POCETAK TESTA





        //logovanje

        driver.get("https://digital-agent.cabank.co.yu/dfrontline/agent/dashboard");
        driver.manage().window().maximize();
        wait.until(ExpectedConditions.presenceOfElementLocated(username));
        driver.findElement(username).sendKeys("nikola.becanovic");
        driver.findElement(password).sendKeys("Test123456#");
        driver.findElement(logIn).click();

        //promjena jezika
        Thread.sleep(7000);
        wait.until(ExpectedConditions.presenceOfElementLocated(promenaJezika));
        driver.findElement(promenaJezika).click();
        wait.until(ExpectedConditions.presenceOfElementLocated(promenaJezikaSrpski));
        driver.findElement(promenaJezikaSrpski).click();

        //ulazak u katalog proizvoda

        wait.until(ExpectedConditions.elementToBeClickable(katalogProizvoda));
        driver.findElement(katalogProizvoda).click();

        // stavljanje klijenta u kontekst

        wait.until(ExpectedConditions.elementToBeClickable(searchIcon));
        driver.findElement(searchIcon).click();
        wait.until(ExpectedConditions.presenceOfElementLocated(searchField));
        driver.findElement(searchField).sendKeys("20441402");
        wait.until(ExpectedConditions.elementToBeClickable(clientPopUp));
        driver.findElement(clientPopUp).click();
        driver.findElement(okButtonOnClientPopUp).click();

        //biranje proizvoda

        wait.until(ExpectedConditions.presenceOfElementLocated(racuniPravnaLica));
        driver.findElement(racuniPravnaLica).click();
        wait.until(ExpectedConditions.elementToBeClickable(devizniPlatniPromet));
        driver.findElement(devizniPlatniPromet).click();
        wait.until(ExpectedConditions.elementToBeClickable(devizniOsnovniRacun));
        driver.findElement(devizniOsnovniRacun).click();
        wait.until(ExpectedConditions.presenceOfElementLocated(uslovi));
        driver.findElement(uslovi).click();

        //Informacija za CRM


        wait.until(ExpectedConditions.elementToBeClickable(informacijaCrmTask));
        driver.findElement(informacijaCrmTask).click();
        Thread.sleep(7000);
        wait.until(ExpectedConditions.elementToBeClickable(dugmeComplete));
        driver.findElement(dugmeComplete).click();

        //Izbor racuna za naplatu naknada

        Thread.sleep(7000);
        wait.until(ExpectedConditions.elementToBeClickable(izaberiteOsnovniRacun));
        driver.findElement(izaberiteOsnovniRacun).click();
        wait.until(ExpectedConditions.elementToBeClickable(osnovniRacunIzabran));
        driver.findElement(osnovniRacunIzabran).click();
        wait.until(ExpectedConditions.elementToBeClickable(dugmeComplete));
        driver.findElement(dugmeComplete).click();

        //Informacija za CRM

        Thread.sleep(5000);
        wait.until(ExpectedConditions.elementToBeClickable(dugmeComplete));
        driver.findElement(dugmeComplete).click();

        //Prikaz detalja racuna sa Odlukom o pecatu

        wait.until(ExpectedConditions.elementToBeClickable(togglePecat));
        driver.findElement(togglePecat).click();
        wait.until(ExpectedConditions.elementToBeClickable(dugmeComplete));
        driver.findElement(dugmeComplete).click();

        //Izbor tipa zakonskog zastupanja

        Thread.sleep(7000);
        wait.until(ExpectedConditions.elementToBeClickable(izborZakonskogZastupanja));
        driver.findElement(izborZakonskogZastupanja).click();
        driver.findElement(pojedinacnoZastupanje).click();
        wait.until(ExpectedConditions.elementToBeClickable(dodajteZastupnikaEvidentiranogUCif));
        driver.findElement(dodajteZastupnikaEvidentiranogUCif).click();
        wait.until(ExpectedConditions.elementToBeClickable(izaberiteZastupnik));
        driver.findElement(izaberiteZastupnik).click();
        wait.until(ExpectedConditions.elementToBeClickable(biranjeZastupnika));
        driver.findElement(biranjeZastupnika).click();
        wait.until(ExpectedConditions.elementToBeClickable(dodajteZastupnikaDugme));
        driver.findElement(dodajteZastupnikaDugme).click();
        wait.until(ExpectedConditions.elementToBeClickable(dugmeComplete));
        driver.findElement(dugmeComplete).click();

        //Nacin dostave dokumentacije

        Thread.sleep(7000);
        wait.until(ExpectedConditions.elementToBeClickable(dugmeComplete));
        driver.findElement(dugmeComplete).click();

        //Potvrda email adrese

        Thread.sleep(7000);
        wait.until(ExpectedConditions.elementToBeClickable(dugmeComplete));
        driver.findElement(dugmeComplete).click();

        //Informacija o sadrzaju email poruke

        Thread.sleep(7000);
        wait.until(ExpectedConditions.elementToBeClickable(dugmeComplete));
        driver.findElement(dugmeComplete).click();

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
        wait.until(ExpectedConditions.elementToBeClickable(dugmeComplete));
        driver.findElement(dugmeComplete).click();

        //Print and sign documents

        Thread.sleep(5000);
        wait.until(ExpectedConditions.elementToBeClickable(dugmeComplete));
        driver.findElement(dugmeComplete).click();

        //Upload signed documents

        Thread.sleep(5000);
        wait.until(ExpectedConditions.elementToBeClickable(dugmeComplete));
        driver.findElement(dugmeComplete).click();

        //Upload signed documents

        wait.until(ExpectedConditions.elementToBeClickable(DragAndDrop));
        driver.findElement(DragAndDrop).sendKeys("C:\\Users\nikola.becanovic\\Desktop\\KYC\\KYC Form.pdf");
        wait.until(ExpectedConditions.elementToBeClickable(dugmeComplete));
        driver.findElement(dugmeComplete).click();

























    }
}
