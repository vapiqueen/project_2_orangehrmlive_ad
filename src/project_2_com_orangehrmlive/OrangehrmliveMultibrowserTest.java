package project_2_com_orangehrmlive;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class OrangehrmliveMultibrowserTest {
    static String browser = "Edge";

    static String baseUrl = "https://opensource-demo.orangehrmlive.com";

    static WebDriver driver;

    public static void main(String[] args) {
        if (browser.equalsIgnoreCase("Edge")) {
            driver = new EdgeDriver();
        } else if (browser.equalsIgnoreCase("Chrome")) {
            driver = new ChromeDriver();
        } else if (browser.equalsIgnoreCase("Firefox")) {
            driver = new FirefoxDriver();
        } else {
            System.out.println("Wrong Browser Name.Please try again");

            //Open URL
            driver.get(baseUrl);

            // Maximise Browser
           // driver.manage().window().maximize();

            //Implicit wait driver
           // driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

            //Print the title of the Page
            String title = driver.getTitle();
            System.out.println("Title of the Page" + title);

            //Print the current url
            String currentUrl = driver.getCurrentUrl();
            System.out.println("Get Current URL" + currentUrl);

            //Print the page source
            String pageSource = driver.getPageSource();
            System.out.println("Page Source" + pageSource);

            //Enter the Username to username field
            WebElement username = driver.findElement(By.name("username"));
            username.sendKeys("ad123456@yahoo.com");

            //Enter the Password to password field
            WebElement password = driver.findElement(By.name("password"));
            password.sendKeys("Abcd1111");

            //Close the browser
            driver.close();

        }
    }
}
