package org.casperproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day10_Locators4 {
    public static void main(String args[]) {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");

        // Initialize the WebDriver
        WebDriver driver = new ChromeDriver();

        // Navigate to a website
        driver.get("https://www.linkedin.com/login/");

        //Locators Exploration on Linkedin Login Page
        // Using ID to locate the username input field
        driver.findElement(By.cssSelector("#username"));

        // Using Class to locate the Join Now
        driver.findElement(By.cssSelector(".join-now"));

        // Using Attribute to locate the "Password" field
        driver.findElement(By.cssSelector("[name='session_password']"));

        // Close the browser when done
        driver.quit();
    }
}
