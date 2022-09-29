package com.example;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Login 
{
	 public static void main(String[] args)
	    {
	        System.setProperty("webdriver.chrome.driver","C:\\Users\\Kanimozhi\\Downloads\\chromedriver_win32/chromedriver.exe");
	        WebDriver driver = new ChromeDriver();
	        driver.get("https://courses.skillsnet.simplilearn.com/login");
	        driver.manage().window().maximize();
	        driver.findElement(By.id("login-email")).sendKeys("kani@gmail.com");
	        driver.findElement(By.id("login-password")).sendKeys("Kani@00");
	        driver.findElement(By.id("login-button")).click();       
	    }
}