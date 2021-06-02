import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.asserts.SoftAssert;

import java.util.concurrent.TimeUnit;

public class MyInfoEdit {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Billy\\IdeaProjects\\TugasSelenium\\src\\main\\resources\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        SoftAssert softAssert = new SoftAssert();
        driver.get("https://opensource-demo.orangehrmlive.com/");
        WebElement username = driver.findElement(By.id("txtUsername"));
        WebElement password = driver.findElement(By.id("txtPassword"));
        WebElement login = driver.findElement(By.name("Submit"));
        username.sendKeys("Admin");
        password.sendKeys("admin123");
        login.click();
        driver.findElement(By.id("menu_pim_viewMyDetails")).click();
        driver.findElement(By.id("btnSave")).click();
        WebElement middleName = driver.findElement(By.id("personal_txtEmpMiddleName"));
        WebElement firstName = driver.findElement(By.id("personal_txtEmpFirstName"));
        WebElement lastName = driver.findElement(By.id("personal_txtEmpLastName"));
        WebElement empID = driver.findElement(By.id("personal_txtEmployeeId"));
        WebElement driverLcns = driver.findElement(By.id("personal_txtLicenNo"));
        WebElement ssnNumber = driver.findElement(By.id("personal_txtNICNo"));
        Select cmbn = new Select(driver.findElement(By.id("personal_cmbNation")));
        cmbn.selectByVisibleText("Indonesian");
        firstName.clear();
        firstName.sendKeys("Paul");
        middleName.sendKeys("Paul");
        lastName.clear();
        lastName.sendKeys("Paul");
        empID.sendKeys("12312");
        driverLcns.sendKeys("1039123");
        ssnNumber.sendKeys("32103129");
        driver.findElement(By.id("btnSave")).click();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.findElement(By.id("btnEditCustom")).click();
        Select drop = new Select(driver.findElement(By.name("custom1")));
        drop.selectByVisibleText("A+");
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.findElement(By.id("btnEditCustom")).click();
        driver.findElement(By.id("btnEditCustom")).click();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.findElement(By.id("btnAddAttachment")).click();
        WebElement text = driver.findElement(By.id("txtAttDesc"));
        WebElement upload = driver.findElement(By.id("ufile"));
        upload.sendKeys("C:\\Users\\Billy\\Downloads\\kuis_akhir_juni_2021_B.pdf");
        text.sendKeys("Test");
        driver.findElement(By.id("btnSaveAttachment")).click();
    }
}
