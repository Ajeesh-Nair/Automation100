package org.casperproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day12_WebElementInteraction2 {
    public static void main(String args[]){
        // Set the path to your ChromeDriver executable
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");

        // Initialize the WebDriver
        WebDriver driver = new ChromeDriver();

        // Navigate to a websiteuse
        driver.get("https://www.linkedin.com/login/");
        driver.manage().window().maximize();

        // Identify Sigin button and Click, to generate Error Field
        WebElement signinButton = driver.findElement(By.xpath("//button[text()='Sign in']"));
        signinButton.click();

        // Identify the usernameError
        WebElement userNameError = driver.findElement(By.id("error-for-username"));

        // Identify the password field
        WebElement passwordField = driver.findElement(By.id("password"));

        // Using getText() to get the Error Text
        String placeholderText = userNameError.getText();
        System.out.println("Error Message: " + placeholderText);

        // Using getAttribute() to get the Name attribute value of the password field
        String fieldType = passwordField.getAttribute("name");
        System.out.println("Field Name: " + fieldType);

        // Close the browser
        driver.quit();

    }
}
