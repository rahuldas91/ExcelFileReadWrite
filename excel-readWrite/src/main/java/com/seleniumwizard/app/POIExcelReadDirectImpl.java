package com.seleniumwizard.app;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class POIExcelReadDirectImpl {

	public static void main(String[] args) {

		final String EXCEL_FILE_PATH = ".\\src\\main\\resources\\Students.xlsx";
		final String SHEET_NAME = "STUDENTS";

		File file = null;
		FileInputStream inputStream;
		Workbook myWorkbook;
		Sheet sheet;
		DataFormatter formatter;

		int rowCount = 10;

		file = new File(EXCEL_FILE_PATH);
		try {

			inputStream = new FileInputStream(file);

			myWorkbook = null;

			String fileExtensionName = file.getName()
					.substring(file.getName().indexOf("."));

			if (fileExtensionName.equals(".xlsx")) {

				myWorkbook = new XSSFWorkbook(inputStream);

			} else if (fileExtensionName.equals(".xls")) {

				myWorkbook = new HSSFWorkbook(inputStream);

			}

			sheet = myWorkbook.getSheet(SHEET_NAME);

			/*
			 * int rowCount = sheet.getLastRowNum() - sheet.getFirstRowNum();
			 */

			formatter = new DataFormatter();
			StringBuilder builder = new StringBuilder();
			for (int i = 1; i < rowCount + 1; i++) {

				for (int j = 0; j < sheet.getLastRowNum(); j++) {

					builder.append("  |  ");
					builder.append(formatter
							.formatCellValue(sheet.getRow(i).getCell(j)));
				}
				builder.append("  |  ");
				builder.append("\n");
			}
			System.out.println(builder);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
