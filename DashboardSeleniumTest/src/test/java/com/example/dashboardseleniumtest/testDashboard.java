package com.example.dashboardseleniumtest;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class testDashboard {
    // Tests if Pregnancy Status dashboard element is invisible after unchecking the box
    public static void main(String[] args){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Leander\\IdeaProjects\\SeleniumDemo\\src\\Drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://cchun01.github.io/CodeBlue/");

        JavascriptExecutor jse = (JavascriptExecutor) driver;
        WebElement iframe = (WebElement)
                jse.executeScript("return document.querySelector(\"#tableau-viz\").shadowRoot.querySelector(\"#tableau-viz\")", args);
        driver.switchTo().frame(iframe);
        driver.findElement(By.xpath("//*[@id=\"primary-auth\"]")).click(); // sign into tableau cloud

        new WebDriverWait(driver, 60)
                .until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"tabZoneId5\"]/div/div/div/div"))); // wait 60 seconds for person to login

        driver.findElement(By.xpath("//*[@id=\"tabZoneId13\"]/div/div/div/div")).click();

        new WebDriverWait(driver, 60)
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"FI_sqlproxy.0nf7op40ste7lm1adyqem0d124h5,none:Team (Custom SQL Query1):nk14751424574618452880_14121274278462894772_(All)\"]/div[2]/input")));
        driver.findElement(By.xpath("//*[@id=\"FI_sqlproxy.0nf7op40ste7lm1adyqem0d124h5,none:Team (Custom SQL Query1):nk14751424574618452880_14121274278462894772_(All)\"]/div[2]/input")).click();

        new WebDriverWait(driver, 10)
                .until(ExpectedConditions.invisibilityOfElementLocated(
                        By.xpath("*[@id=\"view14751424574618452880_14121274278462894772\"]/div[1]/div[2]/canvas[2]")));

        driver.close();
    }
}
