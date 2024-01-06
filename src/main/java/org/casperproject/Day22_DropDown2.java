package org.casperproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Day22_DropDown2 {
    public static void main(String[] args) {
        // Set the path to your ChromeDriver executable
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");

        // Initialize the WebDriver
        WebDriver driver = new ChromeDriver();

        // Navigate to the LambdaTest
        driver.get("https://www.lambdatest.com/selenium-playground/select-dropdown-demo");
        driver.manage().window().maximize();

        //Identify Dropdown
        WebElement multiDropdown = driver.findElement(By.name("States"));
        Select Dropdown = new Select(multiDropdown);
        if (Dropdown.isMultiple()){
        Dropdown.selectByIndex(0);
        Dropdown.selectByValue("Florida");
        Dropdown.selectByVisibleText("Ohio");
        Dropdown.selectByValue("Washington");
        }

        // Deselect methods
        Dropdown.deselectByIndex(0);
        Dropdown.deselectByValue("Florida");
        Dropdown.deselectByVisibleText("Ohio");
        Dropdown.deselectAll();

        // Quit the WebDriver
        driver.quit();
    }
}
