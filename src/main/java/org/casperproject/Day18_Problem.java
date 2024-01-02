package org.casperproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Day18_Problem {
    public static void main(String[] args) {
        // Set the path to your ChromeDriver executable
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");

        // Initialize the WebDriver
        WebDriver driver = new ChromeDriver();

        // Navigate to the LinkedIn login page
        driver.get("https://www.linkedin.com/login/");
        driver.manage().window().maximize();

        // Find all the links on the page
        List<WebElement> allLinks = driver.findElements(By.tagName("a"));

        // Display the count of links
        System.out.println("Total links on the page: " + allLinks.size());

        // Print all the links
        System.out.println("List of links:");
        for (WebElement link : allLinks) {
            System.out.println(link.getAttribute("href"));
        }

        // Quit the WebDriver
        driver.quit();
    }
}
