package com.seleniumwizard.app;

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
			rmpi.createRepository();

			//System.err.println(obj.getData("Key_9"));
		} catch (Exception e) {
			System.err.println(e.getMessage() + " ----> " + e.getCause());
		}

	}

}
