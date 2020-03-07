package com.seleniumwizard.fillo.repoMap;

import com.codoid.products.fillo.Connection;
import com.codoid.products.fillo.Fillo;
import com.codoid.products.fillo.Recordset;
import com.seleniumwizard.fillo.queryConstants.FilloQueries;

public class RepoMapFillImpl implements RepoMapFillo {

	
	
	@Override
	public void createRepository() {
		try {

			Fillo fillo = new Fillo();
			

			Connection connection = fillo.getConnection(
					"E:\\Work\\Workspaces\\STS4\\SeleniumWizard\\ExcelFileReadWrite\\excel-readWrite\\src\\main\\resources\\Students.xlsx");
	
			String strQuery = FilloQueries.SELECT_ALL + " " + FilloQueries.TBL_TEST_DATA;
			Recordset recordset = connection.executeQuery(strQuery);

			while(recordset.next()){
				filloRepo.put(recordset.getField("Key"), recordset.getField("Data"));
				//System.out.println("Key = "+recordset.getField("Key")+", Data = "+recordset.getField("Data"));
				}

			recordset.close();
			connection.close();

		} catch (Exception e) {
			System.err.println(e.getMessage() + " ----> " + e.getCause());
		}

	}

}
