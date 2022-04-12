package com_herokuapp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class FireFox_Browser_ComHerokuapp {

    public static void main(String[] args) {
        //add URL link
        String baseurl = "https://opensource-demo.orangehrmlive.com";
        //path and key
        System.setProperty("webdriver.gecko.driver", "Driver/geckodriver.exe");//from driver.exe file right click open
        WebDriver driver = new FirefoxDriver();//driver object
        //Launch the URL. method
        driver.get(baseurl);//open window
        String title = driver.getTitle();
        System.out.println(title);
        //Get current URL


        String loginUrl = "https://opensource-demo.orangehrmlive.com";
        driver.navigate().to(loginUrl);
        System.out.println("Current URL" + driver.getCurrentUrl());

        WebElement emailField = driver.findElement(By.id("username"));

        emailField.sendKeys("tomsmith");

        WebElement passwordField = driver.findElement(By.id("password"));

        passwordField.sendKeys("SuperSecretPassword!");

        driver.close();
    }
}
