package org.casperproject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day1_LaunchChrome {
    public static void main(String args[])
    {   // Specify the path to the WebDriver executable
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");

        // Instantiate a ChromeDriver class.
        WebDriver driver = new ChromeDriver();

        // Maximize the browser
        driver.manage().window().maximize();

        // Launch Website
        driver.get("https://www.linkedin.com/");
    }
}
