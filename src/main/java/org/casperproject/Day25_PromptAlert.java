package org.casperproject;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Day25_PromptAlert {
    public static void main(String[] args) throws InterruptedException {
        // Set the path to your ChromeDriver executable
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");

        // Initialize the WebDriver
        WebDriver driver = new ChromeDriver();

        // Navigate to the DemoQA
        driver.get("https://demoqa.com/alerts");
        driver.manage().window().maximize();

        // Trigger Alert
        WebElement promptButton = driver.findElement(By.id("promtButton"));
        promptButton.click();

        // Switch to Prompt Alert
        Alert promptAlert = driver.switchTo().alert();

        // Send Keys to the Prompt Alert
        promptAlert.sendKeys("Ajeesh");

        // Accept the Prompt Alert
        promptAlert.accept(); // or promptAlert.dismiss();

        // Quit the WebDriver
        driver.quit();
    }
}
