package project_2_com_orangehrmlive;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangehrmliveChromeTest {
    public static void main(String[] args) {

        //set up ChromeBrowser
        WebDriver driver = new ChromeDriver();

        //Open the URL into the Browser
        String baseUrl = "https://opensource-demo.orangehrmlive.com";
        driver.get(baseUrl);


        //Print the title of the page
        String title = driver.getTitle();
        System.out.println("Title of te page is" + title);

        //Print current URL
        String currentUrl = driver.getCurrentUrl();
        System.out.println("Current URL is" + currentUrl);

        //Print the page source
        String pageSource = driver.getPageSource();
        System.out.println("Print the page source" + pageSource);

        //Enter the username to username field
        WebElement username = driver.findElement(By.name("username"));
        username.sendKeys("aarti12@gmail.com");

        //Enter Password to password field
        WebElement password = driver.findElement(By.name("password"));
        password.sendKeys("Prime123");


        //Close the browser
        driver.close();

        //There seems to be an issue with this link as some time it runs properly and some time it dont run complety but with no error.


    }
}
