package com_herokuapp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Edge_Browser_ComHerokuapp {
    public static void main(String[] args) {
        //addURL link
        String baseurl = "http://the-internet.herokuapp.com/login";
        //path and key
        System.setProperty("webdriver.edge.driver", "Driver/msedgedriver.exe");
        WebDriver driver = new EdgeDriver();
        driver.get(baseurl);//open window
        String title = driver.getTitle();
        System.out.println(title);
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