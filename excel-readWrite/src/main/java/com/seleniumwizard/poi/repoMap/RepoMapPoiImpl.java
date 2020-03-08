package com.seleniumwizard.poi.repoMap;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.seleniumwizard.fillo.queryConstants.FilloQueries;
import com.seleniumwizard.repo.RepoMap;

public class RepoMapPoiImpl implements RepoMap {

	@Override
	public void createRepository() {
		String filePath = "E:\\Work\\Workspaces\\STS4\\SeleniumWizard\\ExcelFileReadWrite\\excel-readWrite\\src\\main\\resources\\Students.xlsx";
		File file = new File(filePath);
		try {

			FileInputStream inputStream = new FileInputStream(file);

			Workbook myWorkbook = null;

			String fileExtensionName = file.getName().substring(file.getName().indexOf("."));

			if (fileExtensionName.equals(".xlsx")) {

				myWorkbook = new XSSFWorkbook(inputStream);

			} else if (fileExtensionName.equals(".xls")) {

				myWorkbook = new HSSFWorkbook(inputStream);

			}
			
			
			//Read sheet inside the workbook by its name

		    Sheet guru99Sheet = myWorkbook.getSheet(FilloQueries.TBL_TEST_DATA);

		    //Find number of rows in excel file

		    int rowCount = guru99Sheet.getLastRowNum()-guru99Sheet.getFirstRowNum();

		    //Create a loop over all the rows of excel file to read it

		    for (int i = 0; i < rowCount+1; i++) {

		        Row row = guru99Sheet.getRow(i);

		        //Create a loop to print cell values in a row

		        for (int j = 0; j < row.getLastCellNum(); j++) {

		            //Print Excel data in console

		            System.out.print(row.getCell(j).getStringCellValue()+"|| ");

		        }

		        System.out.println();
		    } 
			
			
			
			

		} catch (Exception e) {
			// TODO: handle exception
		}

	}

}
