import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.webdriver.OptionsWithArguments;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;


public class E2EMaticenjeFizickogLica {

    @Test

    public void MaticenjeFizickogLica() throws Exception {

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver(options);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        Actions actions = new Actions(driver);
        WebDriverManager.edgedriver().setup();
        EdgeOptions optionsEdge = new EdgeOptions();
        WebDriver driverEdge = new EdgeDriver(optionsEdge);

        //logovanje

        By username = By.xpath("//*[@name='Username']");
        By password = By.xpath("//*[@name='Password']");
        By logIn = By.xpath("//*[@class='btn btn-primary']");

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
        By kontakt = By.xpath("//span[text()=' Kontakt']");
        By prospect = By.xpath("//span[text()=' Prospect']");
        By klijent = By.xpath("//span[text()=' Klijent']");
        By maloletnik = By.xpath("//span[text()=' Customer minor']");
        By zastupanoLice = By.xpath("//span[text()=' Customer represented']");
        By startProcess = By.xpath("//span[text()='Start process']");

        //forma General information
        By customerType = By.xpath("//span[@class='mat-select-placeholder mat-select-min-line ng-tns-c236-39 ng-star-inserted']");
        By domesticIndividualResident = By.xpath("//span[text()=' Domestic individual resident']");
        By jmbg = By.xpath("//*[@id='mat-input-5']");
        By firstName = By.xpath("//*[@id='mat-input-1']");
        By middleName = By.xpath("//*[@id='mat-input-2']");
        By lastName = By.xpath("//*[@id='mat-input-3']");
        By placeOfBirth = By.xpath("//*[@id='mat-input-7']");
        By dugmeComplete = By.xpath("//span[text()='Complete']");

        //logovanje u Edge brauzer

        By usernameEdge = By.xpath("//input[@placeholder='Username']");
        By passwordEdge = By.xpath("//input[@placeholder='Password']");
        By logInEdge = By.xpath("//*[@class='btn btn-primary']");







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


        //lokatori left side

        wait.until(ExpectedConditions.elementToBeClickable(cif));
        driver.findElement(cif).click();
        wait.until(ExpectedConditions.elementToBeClickable(newIndividual));
        driver.findElement(newIndividual).click();
        wait.until(ExpectedConditions.elementToBeClickable(enrollmentLevel));
        driver.findElement(enrollmentLevel).click();
        wait.until(ExpectedConditions.elementToBeClickable(klijent));
        driver.findElement(klijent).click();
        driver.findElement(startProcess).click();

        //biranje enrollment levela

        wait.until(ExpectedConditions.elementToBeClickable(customerType));
        driver.findElement(customerType).click();
        wait.until(ExpectedConditions.elementToBeClickable(domesticIndividualResident));
        driver.findElement(domesticIndividualResident).click();
        driver.findElement(jmbg).sendKeys("1307981310103");
        driver.findElement(firstName).sendKeys("TEST");
        driver.findElement(middleName).sendKeys("TEST");
        driver.findElement(lastName).sendKeys("TEST");
        driver.findElement(placeOfBirth).sendKeys("Knin");
        driver.findElement(dugmeComplete).click();
        wait.until(ExpectedConditions.elementToBeClickable(dugmeComplete));
        driver.findElement(dugmeComplete).click();
        Thread.sleep(3000);
        wait.until(ExpectedConditions.elementToBeClickable(dugmeComplete));
        driver.findElement(dugmeComplete).click();

        //logovanje na AML rolu u edge brauzeru

        driverEdge.get("https://digital-agent.cabank.co.yu/dfrontline/agent");
        driverEdge.manage().window().maximize();
        driverEdge.navigate().refresh();
        Thread.sleep(4000);
        wait.until(ExpectedConditions.presenceOfElementLocated(usernameEdge));
        driverEdge.findElement(usernameEdge).click();
        driverEdge.findElement(usernameEdge).sendKeys("backOffice");
        wait.until(ExpectedConditions.elementToBeClickable(passwordEdge));
        driverEdge.findElement(passwordEdge).click();
        driverEdge.findElement(passwordEdge).sendKeys("Test123456#");
        wait.until(ExpectedConditions.elementToBeClickable(logInEdge));
        driver.findElement(logInEdge).click();

    }
}

