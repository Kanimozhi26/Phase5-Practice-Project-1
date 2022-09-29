package com.example;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Registration 
{
    public static void main(String[] args)
    {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Kanimozhi\\Downloads\\chromedriver_win32/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://courses.skillsnet.simplilearn.com/register");
        driver.manage().window().maximize();
        driver.findElement(By.id("register-name")).sendKeys("Kanimozhi M");
        driver.findElement(By.id("register-username")).sendKeys("kanimozhi_mahendran");
        driver.findElement(By.id("register-email")).sendKeys("kani@gmail.com");
        driver.findElement(By.id("register-password")).sendKeys("Qwert@00");
        driver.findElement(By.id("register-button")).click();
    }
}