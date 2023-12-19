package org.casperproject;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class Day5_CookieManagement {
    public static void main(String[] args) {
        // Set the path to your ChromeDriver executable
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");

        // Create a new instance of the ChromeDriver
        WebDriver driver = new ChromeDriver();

        // Navigate to a website
        driver.get("https://www.linkedin.com");

        // Add a new cookie
        Cookie myCookie = new Cookie("myCookieName", "myCookieValue");
        driver.manage().addCookie(myCookie);

        // Get all cookies
        Set<Cookie> allCookies = driver.manage().getCookies();
        System.out.println("All Cookies: " + allCookies);

        // Get a specific cookie by name
        Cookie specificCookie = driver.manage().getCookieNamed("myCookieName");
        System.out.println("Specific Cookie: " + specificCookie);

        // Delete a specific cookie
        driver.manage().deleteCookie(specificCookie);

        // Get all cookies after deletion
        allCookies = driver.manage().getCookies();
        System.out.println("All Cookies after deletion: " + allCookies);

        // Delete all cookies
        driver.manage().deleteAllCookies();

        // Get all cookies after deleting all
        allCookies = driver.manage().getCookies();
        System.out.println("All Cookies after deleting all: " + allCookies);

        // Close the browser
        driver.quit();
    }
}
