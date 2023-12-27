package org.casperproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day13_WebElementInteraction3 {
    public static void main(String args[]){
        // Set the path to your ChromeDriver executable
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");

        // Initialize the WebDriver
        WebDriver driver = new ChromeDriver();

        // Navigate to a websiteuse
        driver.get("https://www.linkedin.com/login/");
        driver.manage().window().maximize();

        // Identify the LinkedinLogo
        WebElement linkedinLogo = driver.findElement(By.id("linkedin-logo"));

        // isDiplayed will give Boolean return
        Boolean isDisplayed = linkedinLogo.isDisplayed();

        if(isDisplayed){
            System.out.println("Linkedin Logo is visible on Page");
        }else {
            System.out.println("Linkedin Logo is not visible on Page");
        }

        // Close the browser
        driver.quit();

    }
}
