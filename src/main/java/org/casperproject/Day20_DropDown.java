package org.casperproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class Day20_DropDown {
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

        // Select options using different methods
        Select Dropdown = new Select(filterDropdown);
        Dropdown.selectByValue("az");
        Dropdown.selectByIndex(2);
        Dropdown.selectByVisibleText("Name (Z to A)");


        // Quit the WebDriver
        driver.quit();
    }
}
