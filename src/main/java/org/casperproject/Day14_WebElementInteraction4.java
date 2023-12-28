package org.casperproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day14_WebElementInteraction4 {
    public static void main(String args[]){
        // Set the path to your ChromeDriver executable
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");

        // Initialize the WebDriver
        WebDriver driver = new ChromeDriver();

        // Navigate to a website
        driver.get("https://www.linkedin.com/login/");
        driver.manage().window().maximize();

        // Identify the SignIn Button
        WebElement signinButton = driver.findElement(By.xpath("//button[text()='Sign in']"));

        // isEnabled will give Boolean return
        Boolean isEnabled = signinButton.isEnabled();

        if(isEnabled){
            System.out.println("Sigin Button is Enabled");
        }else {
            System.out.println("Signin Button is Disabled");
        }

        // Close the browser
        driver.quit();

    }
}
