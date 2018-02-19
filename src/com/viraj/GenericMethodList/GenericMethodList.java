package com.viraj.GenericMethodList;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GenericMethodList {
	
private WebDriver driver;
	
	public GenericMethodList(WebDriver driver){
		this.driver = driver;
		}
		
	public List<WebElement> getElements(String locator, String type){
		type = type.toLowerCase();
		if(type.equals("id")){
			System.out.println("driver found with id: " + locator);
			return driver.findElements(By.id(locator));
			
		} else if(type.equals("xpath")){
			System.out.println("driver found with xpath: " + locator);
			return driver.findElements(By.xpath(locator));
		} else
			 return null;		
	}


}
