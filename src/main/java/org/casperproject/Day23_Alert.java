package org.casperproject;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Day23_Alert {
    public static void main(String[] args) {
        // Set the path to your ChromeDriver executable
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");

        // Initialize the WebDriver
        WebDriver driver = new ChromeDriver();

        // Navigate to the DemoQA
        driver.get("https://demoqa.com/alerts");
        driver.manage().window().maximize();

        //Trigger Alert
        WebElement alertButton = driver.findElement(By.id("alertButton"));
        alertButton.click();

        Alert simpleAlert = driver.switchTo().alert();
        String alertMessage = simpleAlert.getText();
        System.out.println("Alert Message: " + alertMessage);

        // Accepting the simple alert (clicking OK)
        simpleAlert.accept();


        // Quit the WebDriver
        driver.quit();
    }
}
