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
	public void createRepository(String fileLocation) {

		File file = new File(fileLocation);
		try {

			FileInputStream inputStream = new FileInputStream(file);

			Workbook myWorkbook = null;

			String fileExtensionName = file.getName().substring(file.getName().indexOf("."));

			if (fileExtensionName.equals(".xlsx")) {

				myWorkbook = new XSSFWorkbook(inputStream);

			} else if (fileExtensionName.equals(".xls")) {

				myWorkbook = new HSSFWorkbook(inputStream);

			}

			Sheet guru99Sheet = myWorkbook.getSheet(FilloQueries.TBL_TEST_DATA);

			int rowCount = guru99Sheet.getLastRowNum() - guru99Sheet.getFirstRowNum();

			for (int i = 1; i < rowCount + 1; i++) {

				Row row = guru99Sheet.getRow(i);

				filloRepo.put(row.getCell(0).getStringCellValue(), row.getCell(1).getStringCellValue());

			}

		} catch (Exception e) {
			// TODO: handle exception
		}

	}

}
