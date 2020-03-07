package com.seleniumwizard.app;

import com.seleniumwizard.fillo.repo.FilloDataRepoImpl;
import com.seleniumwizard.fillo.repoMap.RepoMapFillImpl;

public class Application {

	
	/***
	 * Example with Fillo
	 * @param args
	 */
	public static void main(String[] args) {

		try {
			RepoMapFillImpl rr = new RepoMapFillImpl();
			FilloDataRepoImpl obj = new FilloDataRepoImpl();
			rr.createRepository();

			System.err.println(obj.getData("Key_9"));
		} catch (Exception e) {
			System.err.println(e.getMessage() + " ----> " + e.getCause());
		}

	}
}
