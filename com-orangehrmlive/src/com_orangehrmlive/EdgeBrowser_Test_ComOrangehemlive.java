package com_orangehrmlive;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class EdgeBrowser_Test_ComOrangehemlive {
    public static void main(String[] args) {
        //addURL link
        String baseurl = "https://opensource-demo.orangehrmlive.com";
        //path and key
        System.setProperty("webdriver.edge.driver", "Driver/msedgedriver.exe");
        WebDriver driver = new EdgeDriver();
        driver.get(baseurl);//open window
        String title = driver.getTitle();
        System.out.println(title);
        String loginUrl = "https://opensource-demo.orangehrmlive.com";
        driver.navigate().to(loginUrl);
        System.out.println("Current URL" + driver.getCurrentUrl());

        //find the emailfield element
        WebElement emailField = driver.findElement(By.id("txtUsername"));
        //sending email to email field element
        emailField.sendKeys("Admin");
        //Find the password field element
        WebElement passwordField = driver.findElement(By.name("txtPassword"));
        //sending password to password field element
        passwordField.sendKeys("admin123");
        // driver.close();//for close the browser
    }
}