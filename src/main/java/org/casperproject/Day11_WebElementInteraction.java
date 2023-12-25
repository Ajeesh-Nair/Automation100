package org.casperproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day11_WebElementInteraction {
    public static void main(String args[]){
        // Set the path to your ChromeDriver executable
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");

        // Initialize the WebDriver
        WebDriver driver = new ChromeDriver();

        // Navigate to a website
        driver.get("https://www.linkedin.com/login/");
        driver.manage().window().maximize();

        //Storing Locators in Webelement
        WebElement userName= driver.findElement(By.id("username"));
        WebElement password = driver.findElement(By.name("session_password"));
        WebElement signinButton = driver.findElement(By.xpath("//button[text()='Sign in']"));

        //Login to Linkedin
        userName.sendKeys("youremailID@gmail.com");
        password.sendKeys("yourPassword");
        signinButton.click();

        // Close the browser when done
        driver.quit();

    }
}
