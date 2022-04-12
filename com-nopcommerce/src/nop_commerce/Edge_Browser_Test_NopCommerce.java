package nop_commerce;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import java.util.List;
import java.util.Set;

public class Edge_Browser_Test_NopCommerce {

    public static void main(String[] args) {
        //addURL link
        String baseurl = "https://demo.nopcommerce.com/login?returnUrl=%2";
        //path and key
        System.setProperty("webdriver.edge.driver", "Driver/msedgedriver.exe");
        WebDriver driver = new EdgeDriver();
        driver.get(baseurl);//open window
        String title = driver.getTitle();
        System.out.println(title);
        String loginUrl = "https://demo.nopcommerce.com/login?returnUrl=%2F";
        driver.navigate().to(loginUrl);
        System.out.println("Current URL" + driver.getCurrentUrl());

        //find element
        WebElement emailField = driver.findElement(By.id("Email"));
        //sending email to email field element
        emailField.sendKeys("prime123@gmail.com");
        //Find the password field element
        WebElement passwordField = driver.findElement(By.name("Password"));
        //sending password to password field element
        passwordField.sendKeys("Prime123564");
        driver.close();//for close the browser

    }

    }