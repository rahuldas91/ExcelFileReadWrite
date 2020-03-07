package com.seleniumwizard.fillo.repo;

import com.seleniumwizard.fillo.repoMap.RepoMapFillo;

public class FilloDataRepoImpl implements FilloDataRepo{

	@Override
	public String getData(String key) {
		
		return RepoMapFillo.filloRepo.get(key).toString();
	}

}
