package com_utimateqa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Edge_Browser_Com_Utimatrqa {
    public static void main(String[] args) {
        //addURL link
        String baseurl = "https://courses.ultimateqa.com/users/sign_in";
        //path and key
        System.setProperty("webdriver.edge.driver", "Driver/msedgedriver.exe");
        WebDriver driver = new EdgeDriver();
        driver.get(baseurl);//open window
        String title = driver.getTitle();
        System.out.println(title);

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