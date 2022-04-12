package com_herokuapp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Chrome_Browser_ComHerokuapp {
    public static void main(String[] args) {
        //add URL link
        String baseurl = "http://the-internet.herokuapp.com/login";
        //path and key
        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");//from driver.exe file right click open
        WebDriver driver = new ChromeDriver();//driver object
        //Launch the URL. method
        driver.get(baseurl);//open window
        String title = driver.getTitle();
        System.out.println(title);
        //Get current URL
        String loginUrl = "http://the-internet.herokuapp.com/login";
        driver.navigate().to(loginUrl);
        System.out.println("Current URL" + driver.getCurrentUrl());

        WebElement emailField = driver.findElement(By.id("username"));

        emailField.sendKeys("tomsmith");

        WebElement passwordField = driver.findElement(By.id("password"));

        passwordField.sendKeys("SuperSecretPassword!");

        driver.close();

    }
}




