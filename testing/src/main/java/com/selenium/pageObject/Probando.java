package com.selenium.pageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class Probando {
	public static void main (String args[]){
		WebDriver driver = new HtmlUnitDriver();
		driver.get("Http://www.google.com");
		
		WebElement element= driver.findElement(By.name("q"));
		
		
		
		//element.sendKeys("lalala");
		//element.submit();
		//System.out.println("page title is "+ driver.getTitle());
		//System.out.println("asd");
	}
}
