import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static java.time.Duration.ofSeconds;


public class MavenClass {

    public static void main(String[] args) {

        //Setup Chrome driver
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://google.com");
        driver.manage().window().maximize();

        //Нажимаем кнопку согласиться

//        try {
//            //ofSeconds(6)
//            //Ожидаем появление accceptBtn 2 seconds
//            WebElement accceptBtn = new WebDriverWait(driver, ofSeconds(2)).until(ExpectedConditions
//                    .presenceOfElementLocated(By.id("L2AGLb")));
//            accceptBtn.click();
//
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        WebElement accceptBtn = driver.findElement(By.id("L2AGLb"));
//        accceptBtn.click();

        WebElement input = driver.findElement(By.name("q"));
        input.sendKeys("Open Ai");

        WebElement searchBtn = driver.findElement(By.name("btnK"));
//        searchBtn.click();

        JavascriptExecutor js= (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click()", searchBtn);
//        driver.quit();
//        driver.close();
    }
}
