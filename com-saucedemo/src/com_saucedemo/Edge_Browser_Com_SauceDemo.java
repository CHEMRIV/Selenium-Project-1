package com_saucedemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Edge_Browser_Com_SauceDemo {
    public static void main(String[] args) {
        //addURL link
        String baseurl = "https://www.saucedemo.com/";
        //path and key
        System.setProperty("webdriver.edge.driver", "Driver/msedgedriver.exe");
        WebDriver driver = new EdgeDriver();
        driver.get(baseurl);//open window
        String title = driver.getTitle();
        System.out.println(title);

        //find element
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