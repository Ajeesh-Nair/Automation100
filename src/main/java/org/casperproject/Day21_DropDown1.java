package org.casperproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Day21_DropDown1 {
    public static void main(String[] args) {
        // Set the path to your ChromeDriver executable
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");

        // Initialize the WebDriver
        WebDriver driver = new ChromeDriver();

        // Navigate to the SauceDemo login page
        driver.get("https://www.saucedemo.com/");
        driver.manage().window().maximize();

        //Login to Application
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.id("login-button")).click();

        WebElement filterDropdown = driver.findElement(By.className("product_sort_container"));
        Select Dropdown = new Select(filterDropdown);

        //element supports multiple selection options at the same time or not.
        boolean b = Dropdown.isMultiple();

        // Quit the WebDriver
        driver.quit();
    }
}
