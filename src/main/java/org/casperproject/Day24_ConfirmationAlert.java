package org.casperproject;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day24_ConfirmationAlert {
    public static void main(String[] args) {
        // Set the path to your ChromeDriver executable
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");

        // Initialize the WebDriver
        WebDriver driver = new ChromeDriver();

        // Navigate to the DemoQA
        driver.get("https://demoqa.com/alerts");
        driver.manage().window().maximize();

        //Trigger Alert
        WebElement alertButton = driver.findElement(By.id("confirmButton"));
        alertButton.click();

        Alert confirmationAlert = driver.switchTo().alert();
        String alertMessage = confirmationAlert.getText();
        System.out.println("Alert Message: " + alertMessage);

        // Accepting the Confirmation alert (clicking OK)
        confirmationAlert.accept(); // or confirmationAlert.dismiss();

        // Quit the WebDriver
        driver.quit();
    }
}
