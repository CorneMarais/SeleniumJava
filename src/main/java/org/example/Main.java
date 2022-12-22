package org.example;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.diver", "Users/cmarais/Downloads/chromedriver.exe");
        WebDriver driver=new ChromeDriver();

        driver.navigate().to("https://rahulshettyacademy.com/");

        driver.manage().window().maximize();;






    }
}