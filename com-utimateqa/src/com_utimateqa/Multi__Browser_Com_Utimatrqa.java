package com_utimateqa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class Multi__Browser_Com_Utimatrqa {
    static String browser = "firefox";
    static String baseUrl = "https://courses.ultimateqa.com/users/sign_in";
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
        String title = driver.getTitle();
        System.out.println(title);
        //Get current URL
        String loginUrl = "https://courses.ultimateqa.com/users/sign_in";
        driver.navigate().to(loginUrl);
        System.out.println("Current URL" + driver.getCurrentUrl());
        //find the emailfield element
        WebElement emailField = driver.findElement(By.id("user[email]"));
        //sending email to email field element
        emailField.sendKeys("prime123@gmail.com");
        //Find the password field element
        WebElement passwordField = driver.findElement(By.name("user[password]"));
        //sending password to password field element
        passwordField.sendKeys("Prime123564");

        driver.close();

    }

}
