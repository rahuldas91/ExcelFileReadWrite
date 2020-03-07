package com.seleniumwizard.fillo.repo;

import com.seleniumwizard.repo.DataRepo;
import com.seleniumwizard.repo.RepoMap;

public class FilloDataRepoImpl implements DataRepo{

	@Override
	public String getData(String key) {
		
		return RepoMap.filloRepo.get(key).toString();
	}

}
