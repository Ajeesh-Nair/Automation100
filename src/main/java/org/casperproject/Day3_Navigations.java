package org.casperproject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day3_Navigations {
    public static void main(String args[]) {
        // Specify the path to the WebDriver executable
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");

        // Instantiate a ChromeDriver class.
        WebDriver driver = new ChromeDriver();

        // Launch Website
        driver.get("https://www.linkedin.com/");
        // Perform some actions and navigate through pages
        // ...

        // Use navigation methods
        driver.navigate().back();      // Navigate backward
        System.out.println("After Back: " + driver.getCurrentUrl());

        driver.navigate().forward();   // Navigate forward
        System.out.println("After Forward: " + driver.getCurrentUrl());

        driver.navigate().refresh();   // Refresh the page
        System.out.println("After Refresh: " + driver.getCurrentUrl());

        // Close the browser window
        driver.quit();
    }
}
