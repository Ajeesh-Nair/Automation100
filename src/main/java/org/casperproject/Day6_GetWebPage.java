package org.casperproject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day6_GetWebPage {
    public static void main(String[] args) {
        // Set the path to your ChromeDriver executable
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");

        // Initialize the WebDriver
        WebDriver driver = new ChromeDriver();

        //Setting webPage as a string variable
        String webPage="https://www.linkedin.com/login/";

        // Using driver.get() to navigate to the first URL
        driver.get(webPage);


        // Performing some actions on the first page (e.g., interacting with elements, capturing screenshots)

        // Using driver.navigate().to() to navigate to a different URL
        driver.navigate().to(webPage);

        // Performing some actions on the second page

        // Close the browser
        driver.quit();
    }
}
