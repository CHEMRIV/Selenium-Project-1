package com_saucedemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class FireFox_Browser_Com_SauceDemo {
    public static void main(String[] args) {
        //add URL link
        String baseurl = "https://www.saucedemo.com";
        //path and key
        System.setProperty("webdriver.gecko.driver", "Driver/geckodriver.exe");//from driver.exe file right click open
        WebDriver driver = new FirefoxDriver();//driver object
        //Launch the URL. method
        driver.get(baseurl);//open window
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