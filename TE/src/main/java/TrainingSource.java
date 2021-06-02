import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.asserts.SoftAssert;


import java.util.concurrent.TimeUnit;

public class TrainingSource {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Billy\\IdeaProjects\\TugasSelenium\\src\\main\\resources\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        SoftAssert softAssert = new SoftAssert();
        driver.get("https://orangehrm-demo-6x.orangehrmlive.com/");
        WebElement username = driver.findElement(By.id("txtUsername"));
        WebElement password = driver.findElement(By.id("txtPassword"));
        WebElement login = driver.findElement(By.name("Submit"));
        username.sendKeys("");
        password.sendKeys("");
        login.click();
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        driver.findElement(By.id("menu_training_defaultTrainingModulePage")).click();
        driver.findElement(By.id("menu_training_viewCourseList")).click();
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        driver.findElement(By.linkText("/index.php/training/addCourse/courseId/10")).click();
    }
}
