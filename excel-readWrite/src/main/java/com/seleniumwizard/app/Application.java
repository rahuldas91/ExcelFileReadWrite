package com.seleniumwizard.app;

import com.seleniumwizard.poi.repo.POIDataRepoImpl;
import com.seleniumwizard.poi.repoMap.RepoMapPoiImpl;

public class Application {

	/***
	 * Example with Fillo
	 * 
	 * @param args
	 *//*
		 * public static void main(String[] args) {
		 * 
		 * try { RepoMapFilloImpl rr = new RepoMapFilloImpl(); FilloDataRepoImpl obj =
		 * new FilloDataRepoImpl(); rr.createRepository();
		 * 
		 * System.err.println(obj.getData("Key_9")); } catch (Exception e) {
		 * System.err.println(e.getMessage() + " ----> " + e.getCause()); }
		 * 
		 * }
		 */

	/***
	 * Example using Apache POI
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		try {
			RepoMapPoiImpl rmpi = new RepoMapPoiImpl();
			POIDataRepoImpl pdri = new POIDataRepoImpl();
			rmpi.createRepository("D:\\Users\\RahulDas\\PublicGit\\SeleWiz\\ExcelFileReadWrite\\excel-readWrite\\src\\main\\resources\\Students.xlsx");

			System.err.println(pdri.getData("Key_9"));
		} catch (Exception e) {
			System.err.println(e.getMessage() + " ----> " + e.getCause());
		}

	}

}
