package com.apachepoi.DataDriven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.apachepoi.excel.ExcelUtil;

public class DataDriven {
	public static void main(String[] args) {
		
		ExcelUtil util = new ExcelUtil("C:\\Users\\GOM\\workspace\\com.apachepoi.program\\src\\test\\java\\com\\TestData\\apacheexcel.xlsx");
		String firstname=util.getCellData("RegTestDat", "firstname", 2);
		System.out.println(firstname);
		
		String lastname=util.getCellData("RegTestDat", "lastname", 2);
		System.out.println(lastname);
		
		String email=util.getCellData("RegTestDat", "email", 2);
		System.out.println(email);
		
		String password=util.getCellData("RegTestDat", "password", 2);
		System.out.println(password);
		
		System.setProperty("webdriver.chrome.driver", "C://Users//GOM//Desktop//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://reg.ebay.com/reg/PartialReg?ru=https%3A%2F%2Fwww.ebay.com%2F");
		
		driver.findElement(By.xpath("//input[@id='firstname']")).sendKeys(firstname);
		
		driver.findElement(By.xpath("//input[@id='lastname']")).sendKeys(lastname);
		
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys(email);
		
		driver.findElement(By.xpath("//input[@id='PASSWORD']")).sendKeys(password);
	}
}