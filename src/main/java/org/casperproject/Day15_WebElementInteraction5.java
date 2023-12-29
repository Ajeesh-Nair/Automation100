package org.casperproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day15_WebElementInteraction5 {
    public static void main(String args[]){
        // Set the path to your ChromeDriver executable
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");

        // Initialize the WebDriver
        WebDriver driver = new ChromeDriver();

        // Navigate to a website
        driver.get("https://demoqa.com/checkbox");
        driver.manage().window().maximize();

        // Identify the Checkbox
        WebElement checkBox = driver.findElement(By.className("rct-checkbox"));

        // isSelected will give Boolean return
        Boolean isSelected = checkBox.isSelected();

        if(isSelected){
            System.out.println("Home CheckBox is Checked");
        }else {
            System.out.println("Home CheckBox is Unchecked");
        }

        // Close the browser
        driver.quit();

    }
}
