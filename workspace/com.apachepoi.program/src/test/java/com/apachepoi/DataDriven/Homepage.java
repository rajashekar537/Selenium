package com.apachepoi.DataDriven;

import com.apachepoi.excel.ExcelUtil;

public class Homepage {

	public static void main(String[] args) {
		ExcelUtil util = new ExcelUtil(
				"C:\\Users\\GOM\\workspace\\com.apachepoi.program\\src\\test\\java\\com\\TestData\\apacheexcel.xlsx");
		if (!util.isSheetExist("HomePage")) {
			util.addSheet("HomePage");
		}
		
		int rownumber=util.getCellRowNum("RegTestDat", "lastname", "gone");
		System.out.println(rownumber);
	}

}
