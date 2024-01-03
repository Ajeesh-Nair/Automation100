package org.casperproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

public class Day19_BrokenLinks {
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

        // Print all the links and check for broken links
        System.out.println("List of links:");
        for (WebElement link : allLinks) {
            String url = link.getAttribute("href");
            System.out.println(url);
            verifyLink(url);
        }

        // Quit the WebDriver
        driver.quit();
    }

    private static void verifyLink(String url) {
        try {
            URL link = new URL(url);
            HttpURLConnection httpURLConnection = (HttpURLConnection) link.openConnection();
            httpURLConnection.setConnectTimeout(3000);
            httpURLConnection.connect();

            if (httpURLConnection.getResponseCode() == 200) {
                System.out.println("  - " + url + " is a valid link.");
            } else {
                System.out.println("  - " + url + " is a broken link. Response Code: " + httpURLConnection.getResponseCode());
            }
        } catch (Exception e) {
            System.out.println("  - " + url + " is a broken link. Exception: " + e.getMessage());
        }
    }
}