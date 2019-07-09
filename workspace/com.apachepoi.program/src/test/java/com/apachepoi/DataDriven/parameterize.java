package com.apachepoi.DataDriven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.apachepoi.excel.ExcelUtil;

public class parameterize {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C://Users//GOM//Desktop//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://reg.ebay.com/reg/PartialReg?ru=https%3A%2F%2Fwww.ebay.com%2F");
		
		ExcelUtil util = new ExcelUtil("C:\\Users\\GOM\\workspace\\com.apachepoi.program\\src\\test\\java\\com\\TestData\\apacheexcel.xlsx");
		int rowcount = util.getRowCount("RegTestDat");
		System.out.println(rowcount);
		//util.addColumn("RegTestDat", "Status");
		
		for (int rownum = 2; rownum <= rowcount; rownum++) {
			System.out.println("**********");
			String firstname = util.getCellData("RegTestDat", "firstname", rownum);
			System.out.println(firstname);

			String lastname = util.getCellData("RegTestDat", "lastname", rownum);
			System.out.println(lastname);

			String email = util.getCellData("RegTestDat", "email", rownum);
			System.out.println(email);

			String password = util.getCellData("RegTestDat", "password", rownum);
			System.out.println(password);

			driver.findElement(By.xpath("//input[@id='firstname']")).clear();
			driver.findElement(By.xpath("//input[@id='firstname']")).sendKeys(firstname);
			driver.findElement(By.xpath("//input[@id='lastname']")).clear();
			driver.findElement(By.xpath("//input[@id='lastname']")).sendKeys(lastname);
			driver.findElement(By.xpath("//input[@id='email']")).clear();
			driver.findElement(By.xpath("//input[@id='email']")).sendKeys(email);
			driver.findElement(By.xpath("//input[@id='PASSWORD']")).clear();
			driver.findElement(By.xpath("//input[@id='PASSWORD']")).sendKeys(password);
			
			//util.setCellData("RegTestDat", "Status", rownum, "Pass");
			
		}driver.quit();
	}

}
