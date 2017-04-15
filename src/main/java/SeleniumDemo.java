import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumDemo {
    public static void main(String[] args) throws InterruptedException {
        String property = System.getProperty("user.dir") + "/driver/chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", property);
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://prestashop-automation.qatestlab.com.ua/admin147ajyvk0/");
        WebElement element = driver.findElement(By.name("email"));
        element.sendKeys("webinar.test@gmail.com");
        element = driver.findElement(By.name("passwd"));
        element.sendKeys("Xcg7299bnSmMuRLp9ITw");
        element = driver.findElement(By.name("submitLogin"));
        element.click();
        Thread.sleep(2000);
        element = driver.findElement(By.id("header_employee_box"));
        element.click();
        element = driver.findElement(By.id("header_logout"));
        element.click();
    }
}
