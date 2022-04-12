package com_utimateqa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class Firefox_Browser_Com_Utimatrqa {
    public static void main(String[] args) {
        //add URL link
        String baseurl = "https://courses.ultimateqa.com/users/sign_in";
        //path and key
        System.setProperty("webdriver.gecko.driver", "Driver/geckodriver.exe");//from driver.exe file right click open
        WebDriver driver = new FirefoxDriver();//driver object
        //Launch the URL. method
        driver.get(baseurl);//open window
        driver.manage().window().maximize();//maximised window
        // to set payload time//we give implicit time to driver
      //  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        //get the title of the page
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