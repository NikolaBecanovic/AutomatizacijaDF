import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class E2EOtvaranjeRacuna {

@Test

    public void OtvaranjeRacuna()  throws  Exception{

    WebDriverManager.chromedriver().setup();
    WebDriver driver = new ChromeDriver();
    WebDriverWait wait = new WebDriverWait(driver, 70);
    JavascriptExecutor js = (JavascriptExecutor) driver;

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

    By racuniPravnaLica = By.xpath("//*[@id=\"DO-CURRENT-ACCOUNTS-LEproductDetails\"]/span[1]");
    By dinarskiPlatniPromet = By.xpath("//*[@id=\"productDO-CURRENT-ACCOUNTS-RSD-LE\"]/mat-card-actions/button/span[1]");
    By osnovniRacun = By.xpath("//*[@id=\"productDO-CA-LE\"]/mat-card-actions/button");
    By uslovi = By.xpath("//*[@id=\"applyForProductButton\"]/span[1]");

    //promjena jezika

    By promenaJezika = By.xpath("//*[@id=\"mat-select-value-1\"]/span/mat-select-trigger");
    By promenaJezikaSrpski = By.xpath("//*[@id=\"mat-option-2\"]/span");

    //promjena role

    By promenaRole = By.xpath("(//p[@class='mat-tooltip-trigger user-info-display'])[1]");
    By promenaRoleDirektor = By.xpath("//*[@id=\"mat-select-value-7\"]/span/span");
    By promenaRoleBranchManager = By.xpath("//*[@id=\"Branch manager\"]/span");

    //taskovi
    By informacijaCrmTask = By.xpath("//span[text()=' Informacija CRM  - Dodeljeno je Vama ']");
    By dugmeComplete = By.xpath("//span[text()='COMPLETE']");
    By togglePecat = By.xpath("//*[@id=\"isDiferent\"]");
    By izborZakonskogZastupanja = By.xpath("//*[@id='mat-select-value-17']/span");
    By pojedinacnoZastupanje = By.xpath("//span[text()=' Pojedinačno zastupanje']");
    By dodajteZastupnikaEvidentiranogUCif = By.xpath("//span[text()='Dodajte zastupnika evidentiranog u CIF']");
    By dodajteZastupnika = By.xpath("//*[@id=\"mat-select-value-19\"]/span");
    By biranjeZastupnika = By.xpath("(//span[@class='ng-star-inserted'])[1]");
    By dodajteZastupnikaDugme = By.xpath("//span[text()='DODAJTE ZASTUPNIKA']");
    By zahtevi = By.xpath("//span[text()='Zahtevi']");
    By skipKyc = By.xpath("//span[@class='mat-slide-toggle-thumb']");






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

    //ulazak u katalog proizvoda

    wait.until(ExpectedConditions.elementToBeClickable(katalogProizvoda));
    driver.findElement(katalogProizvoda).click();

    // stavljanje klijenta u kontekst

    wait.until(ExpectedConditions.elementToBeClickable(searchIcon));
    driver.findElement(searchIcon).click();
    wait.until(ExpectedConditions.presenceOfElementLocated(searchField));
    driver.findElement(searchField).sendKeys("20177268");
    wait.until(ExpectedConditions.elementToBeClickable(clientPopUp));
    driver.findElement(clientPopUp).click();
    driver.findElement(okButtonOnClientPopUp).click();

    //biranje proizvoda

    wait.until(ExpectedConditions.presenceOfElementLocated(racuniPravnaLica));
    driver.findElement(racuniPravnaLica).click();
    wait.until(ExpectedConditions.presenceOfElementLocated(dinarskiPlatniPromet));
    driver.findElement(dinarskiPlatniPromet).click();
    wait.until(ExpectedConditions.presenceOfElementLocated(osnovniRacun));
    driver.findElement(osnovniRacun).click();
    wait.until(ExpectedConditions.presenceOfElementLocated(uslovi));
    driver.findElement(uslovi).click();

    //TASKOVI

    //Informacija za Crm
    wait.until(ExpectedConditions.elementToBeClickable(informacijaCrmTask));
    driver.findElement(informacijaCrmTask).click();

    wait.until(ExpectedConditions.elementToBeClickable(dugmeComplete));
    driver.findElement(dugmeComplete).click();

    //Izbor računa za naplatu naknada
    Thread.sleep(5000);
    wait.until(ExpectedConditions.elementToBeClickable(dugmeComplete));
    driver.findElement(dugmeComplete).click();

    //Informacija za Crm

    Thread.sleep(8000);
    wait.until(ExpectedConditions.elementToBeClickable(dugmeComplete));
    driver.findElement(dugmeComplete).click();

    //Prikaz detatalja racuna sa Odlukom o pecatu

    wait.until(ExpectedConditions.elementToBeClickable(togglePecat));
    driver.findElement(togglePecat).click();
    driver.findElement(dugmeComplete).click();

    //Izbor tipa zakonskog zastupanja

    wait.until(ExpectedConditions.elementToBeClickable(izborZakonskogZastupanja));
    driver.findElement(izborZakonskogZastupanja).click();
    driver.findElement(pojedinacnoZastupanje).click();
    wait.until(ExpectedConditions.elementToBeClickable(dodajteZastupnikaEvidentiranogUCif));
    driver.findElement(dodajteZastupnikaEvidentiranogUCif).click();
    wait.until(ExpectedConditions.elementToBeClickable(dodajteZastupnika));
    driver.findElement(dodajteZastupnika).click();
    wait.until(ExpectedConditions.elementToBeClickable(biranjeZastupnika));
    driver.findElement(biranjeZastupnika).click();
    wait.until(ExpectedConditions.elementToBeClickable(dodajteZastupnikaDugme));
    driver.findElement(dodajteZastupnikaDugme).click();
    wait.until(ExpectedConditions.elementToBeClickable(dugmeComplete));
    driver.findElement(dugmeComplete).click();

    //Informacije za CRM

    Thread.sleep(7000);
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

    //Potvrda email adrese

    Thread.sleep(7000);
    wait.until(ExpectedConditions.elementToBeClickable(dugmeComplete));
    driver.findElement(dugmeComplete).click();

    //Informacija o sadržaju email poruke

    Thread.sleep(7000);
    wait.until(ExpectedConditions.elementToBeClickable(dugmeComplete));
    driver.findElement(dugmeComplete).click();

    //Skip KYC
    Thread.sleep(8000);
    wait.until(ExpectedConditions.elementToBeClickable(skipKyc));
    driver.findElement(skipKyc).click();

    Thread.sleep(15000);
    wait.until(ExpectedConditions.elementToBeClickable(dugmeComplete));
    driver.findElement(dugmeComplete).click();

    //Uvoz dokumentacije

    Thread.sleep(7000);
    wait.until(ExpectedConditions.elementToBeClickable(dugmeComplete));
    driver.findElement(dugmeComplete).click();
















}



}
