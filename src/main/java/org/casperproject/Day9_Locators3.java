package org.casperproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day9_Locators3 {
    public static void main(String args[]) {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");

        // Initialize the WebDriver
        WebDriver driver = new ChromeDriver();

        // Navigate to a website
        driver.get("https://www.linkedin.com/login/");

        //Locators Exploration on Linkedin Login Page
        // Xpath Syntax --> "//tagName[@attribute='value']"
        WebElement userName = driver.findElement(By.xpath("//input[@id='username']"));
        WebElement password = driver.findElement(By.xpath("//input[@name='session_password']"));
        WebElement joinNow = driver.findElement(By.xpath("//a[@id='join_now']"));

        // Close the browser when done
        driver.quit();
    }
}
