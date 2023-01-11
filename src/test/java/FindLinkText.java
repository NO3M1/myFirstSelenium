import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindLinkText {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://the-internet.herokuapp.com/");
        //i want to navigate fti form authentication
        //driver.findElement(By.partialLinkText("Auth")).click(); // when we have duplicated elements he choses the 1st one
        //driver.findElement(By.partialLinkText("JavaScript onload")).click();// if you have part of the link text -
        //Thread.sleep(5000);
        //driver.navigate().back();
        driver.findElement(By.linkText("Form Authentication")).click();
        driver.findElement(By.id("username")).sendKeys("tomsmith");
        driver.findElement(By.name("password")).sendKeys("SuperSecretPassword!");
        //driver.findElement(By.className("radius")).click();
        driver.findElement(By.tagName("button")).click();

        Thread.sleep(2000);
        driver.quit();


    }
}
