package org.casperproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day8_Locators2 {
    public static void main(String[] args) {
        // Set the path to your ChromeDriver executable
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");

        // Initialize the WebDriver
        WebDriver driver = new ChromeDriver();

        // Navigate to a website
        driver.get("https://www.linkedin.com/login/");

        //Locators Exploration on Linkedin Login Page
        WebElement joinNow = driver.findElement(By.linkText("Join now"));
        WebElement forgotPassword = driver.findElement(By.partialLinkText("password"));

    }
}
