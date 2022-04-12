package nop_commerce;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

    public class Chrome_Browser_Test_NopCommerce {
        public static void main(String[] args) {
            //add URL link
            String baseurl = "https://demo.nopcommerce.com/";
            //path and key
            System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");//from driver.exe file right click open
            WebDriver driver = new ChromeDriver();//driver object
            //Launch the URL. method
            driver.get(baseurl);//open window
            driver.manage().window().maximize();//maximised window
            // to set payload time//we give implicit time to driver
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
            //get the title of the page
            String title = driver.getTitle();
            System.out.println(title);
            //Get current URL


            String loginUrl = "https://demo.nopcommerce.com/login?returnUrl=%2F";
            driver.navigate().to(loginUrl);
            System.out.println("Current URL" + driver.getCurrentUrl());

            //find the emailfield element
            WebElement emailField = driver.findElement(By.id("Email"));
            //sending email to email field element
            emailField.sendKeys("prime123@gmail.com");
            //Find the password field element
            WebElement passwordField = driver.findElement(By.name("Password"));
            //sending password to password field element
            passwordField.sendKeys("Prime123564");

            // driver.close();//for close the browser
            driver.quit();
    }
}
