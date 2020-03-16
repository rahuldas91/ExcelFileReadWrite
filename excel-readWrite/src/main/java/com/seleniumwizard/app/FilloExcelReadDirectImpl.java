package com.seleniumwizard.app;

import java.io.File;

import com.codoid.products.fillo.Connection;
import com.codoid.products.fillo.Fillo;
import com.codoid.products.fillo.Recordset;

public class FilloExcelReadDirectImpl {

	final static String FETCH_QUERY = "SELECT * FROM STUDENTS WHERE AGE < 10";
	// Path to the excel file
	// sample excel file is given in the resource folder of
	// this project.
	final static String EXCEL_FILE_PATH = ".\\src\\main\\resources\\Students.xlsx";
	public static void main(String[] args) {
		Connection connection = null;
		Fillo fillo;
		Recordset recordset = null;
		try {
			fillo = new Fillo();
			connection = fillo.getConnection(new File(EXCEL_FILE_PATH).getPath());
			recordset = connection.executeQuery(FETCH_QUERY);

			while (recordset.next()) {
				System.out.println(recordset.getField("FIRST_NAME") + "  |  "
						+ recordset.getField("AGE") + "  |  "
						+ recordset.getField("WEIGHT"));
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			recordset.close();
			connection.close();
		}
	}
}
