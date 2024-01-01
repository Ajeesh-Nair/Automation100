package org.casperproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day17_RadioButton {
    public static void main(String args[]) throws InterruptedException {
        // Set the path to your ChromeDriver executable
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");

        // Initialize the WebDriver
        WebDriver driver = new ChromeDriver();

        // Navigate to a website
        driver.get("https://demoqa.com/radio-button");
        driver.manage().window().maximize();

        //Locate Radio Button
        WebElement yesButton = driver.findElement(By.xpath("//label[@for='yesRadio']"));
        //Select Radio Button
        yesButton.click();

        String successText=driver.findElement(By.xpath("//span[@class='text-success']")).getText();
        System.out.println("Radio Button selected is : "+successText);

        driver.quit();


    }
}
