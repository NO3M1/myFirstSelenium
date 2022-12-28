import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.DriverManager;

public class myFirstClass {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://google.com");

        String googleHandle = driver.getWindowHandle(); // get uniqe ID of the page - for doing some assertions for ex.
        System.out.println(googleHandle);

        String googleSource = driver.getPageSource(); //get driver source
      System.out.println(googleSource);

       String googleTitle = driver.getTitle();  // get title
        System.out.println("Google title is: " + googleTitle);
        driver.navigate().to("https://www.udemy.com");
        String udemyTitle = driver.getTitle();
        System.out.println("Udemy title is:" + udemyTitle);
        String udemyURL = driver.getCurrentUrl();
        System.out.println(" Udemy URL is: " + udemyURL);
        driver.navigate().back();
        driver.getCurrentUrl();
        String googleUrl = driver.getCurrentUrl();
        System.out.println(" Google URL is: " + googleUrl);
        driver.manage().window().fullscreen();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.navigate().refresh();
        System.out.println(" Google URL is: " + googleUrl);
        driver.navigate().forward();
        System.out.println(" Udemy URL is: " + udemyURL);
       // try {
       //     Thread.sleep(3000);
      //  } catch (InterruptedException e) {
      //      throw new RuntimeException(e);
      //  }


        driver.quit();

    }
}
