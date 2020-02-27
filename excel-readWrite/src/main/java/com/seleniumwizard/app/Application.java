package com.seleniumwizard.app;

import java.io.File;

import com.codoid.products.fillo.Connection;
import com.codoid.products.fillo.Fillo;
import com.codoid.products.fillo.Recordset;

public class Application {

	public static void main(String[] args) {

		try {
			
			Fillo fillo=new Fillo();
			/*String fileName = "Students.xlsx";
			ClassLoader classLoader = new Application().getClass().getClassLoader();
			 
	        File file = new File(classLoader.getResource(fileName).getFile());*/
			
			Connection connection=fillo.getConnection("D:\\PublicGit\\ExcelFileReadWrite\\excel-readWrite\\src\\main\\resources\\Students.xlsx");
			//String strQuery="Select * from Students where Height=189 and First_Name='David'";
			String strQuery="Select * from Students";
			Recordset recordset=connection.executeQuery(strQuery);

			while(recordset.next()){
			System.out.println(recordset.getField("Age"));
			}

			recordset.close();
			connection.close();

		} catch (Exception e) {
			System.err.println(e.getMessage() +" ----> "+e.getCause());
		}

	}
}
