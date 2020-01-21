package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SeleniumTraining {
	public static void main(String[] args) throws InterruptedException{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Tovology\\eclipse-workspace\\Flipkart\\Driv\\chromedriver.exe");
		
		WebDriver dr = new ChromeDriver();
		
		dr.get("https://www.amazon.in/");
		
		dr.manage().window().maximize();
		
		Thread.sleep(3000);
		
		WebElement lgn = dr.findElement(By.xpath("//*[@id=\"nav-signin-tooltip\"]"));
		lgn.click();
		
		WebElement elc = dr.findElement(By.id("ap_email"));
		elc.sendKeys("viknesh2494@gmail.com");
		
		dr.findElement(By.id("continue")).click();
		
		dr.findElement(By.id("ap_password")).sendKeys("golmaal@6a");
	
		dr.findElement(By.id("signInSubmit")).click();
		
		JavascriptExecutor js = (JavascriptExecutor) dr;
		js.executeScript("window.scrollBy(0,2500)");
		
		Thread.sleep(3000);
		
        js.executeScript("window.scrollTo(0, document.body.scrollHeight)");

	}

}
