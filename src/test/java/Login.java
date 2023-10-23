import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Login {
    @Test
    public void login_success(){
        WebDriver driver;
        String baseUrl = "https://www.saucedemo.com/v1/";

        WebDriverManager.chromedriver().setup();
        ChromeOptions opt = new ChromeOptions();
        opt.setHeadless(false);

        driver = new ChromeDriver(opt);
        driver.manage().window().maximize();
        driver.get(baseUrl);

        WebElement username = driver.findElement(By.id("user-name"));
        username.click();
        username.sendKeys("standard_user");

        WebElement pass = driver.findElement(By.id("password"));
        pass.click();
        pass.sendKeys("secret_sauce");

        WebElement submit = driver.findElement(By.id("login-button"));
        submit.click();

        WebElement assertion = driver.findElement(By.className("product_label"));
        assertion.isDisplayed();

        driver.close();
    }

    @Test
    public void login_failed(){
        WebDriver driver;
        String baseUrl = "https://www.saucedemo.com/v1/";

        WebDriverManager.chromedriver().setup();
        ChromeOptions opt = new ChromeOptions();
        opt.setHeadless(false);

        driver = new ChromeDriver(opt);
        driver.manage().window().maximize();
        driver.get(baseUrl);

        WebElement username = driver.findElement(By.id("user-name"));
        username.click();
        username.sendKeys("standard_user");

        WebElement pass = driver.findElement(By.id("password"));
        pass.click();
        pass.sendKeys("salahpassword");

        WebElement submit = driver.findElement(By.id("login-button"));
        submit.click();

        WebElement assertion = driver.findElement(By.className("error-button"));
        assertion.isDisplayed();

        driver.close();
    }
}
