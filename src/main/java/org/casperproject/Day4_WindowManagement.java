package org.casperproject;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day4_WindowManagement {
    public static void main(String args[]) {
        // Specify the path to the WebDriver executable
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");

        // Instantiate a ChromeDriver class.
        WebDriver driver = new ChromeDriver();

        // Launch Website
        driver.get("https://www.linkedin.com/");

        // Maximize Window
        driver.manage().window().maximize();

        // Enter Fullscreen Mode
        driver.manage().window().fullscreen();

        // Set Custom Window Size
        Dimension customSize = new Dimension(800, 600);
        driver.manage().window().setSize(customSize);

        // Get Current Window Size
        Dimension currentSize = driver.manage().window().getSize();
        System.out.println("Current Window Size: " + currentSize);

        // Set Window Position
        Point customPosition = new Point(500, 300);
        driver.manage().window().setPosition(customPosition);

        // Close the Browser
        driver.quit();
    }
}
