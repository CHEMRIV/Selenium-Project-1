package com_saucedemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class Multi_Browser_Com_SauceDemo {
    static String browser = "firefox";
    static String baseUrl = "https://www.saucedemo.com";
    static WebDriver driver;

    public static void main(String[] args) {
        if (browser.equalsIgnoreCase("chrome")) {
            System.setProperty("webdriver.chrome.driver","Driver/chromedriver.exe");
            driver=new ChromeDriver();
        }else if (browser.equalsIgnoreCase("firefox")){
            System.setProperty("webdriver.gecko.driver","Driver/geckodriver.exe");
            driver=new FirefoxDriver();
        }else if (browser.equalsIgnoreCase("edge")){
            System.setProperty("webdriver.edge.driver","Driver/msedgedriver.exe");
            driver=new EdgeDriver();
        }else {
            System.out.println("Wrong browser name");}

        driver.get(baseUrl);//open window
//        driver.manage().window().maximize();//maximised window
        // to set payload time//we give implicit time to driver
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        //get the title of the page
        String title = driver.getTitle();
        System.out.println(title);
        //Get current URL
        String loginUrl = "https://www.saucedemo.com/";
        driver.navigate().to(loginUrl);
        System.out.println("Current URL" + driver.getCurrentUrl());

        //find the emailfield element
        WebElement emailField = driver.findElement(By.id("user-name"));
        //sending email to email field element
        emailField.sendKeys("standard_user");
        //Find the password field element
        WebElement passwordField = driver.findElement(By.name("password"));
        //sending password to password field element
        passwordField.sendKeys("secret_sauce");
        driver.close();
    }

}
