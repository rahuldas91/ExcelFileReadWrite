package com.seleniumwizard.poi.repo;

import com.seleniumwizard.repo.DataRepo;
import com.seleniumwizard.repo.RepoMap;

public class POIDataRepoImpl implements DataRepo {

	@Override
	public String getData(String key) {
		return RepoMap.filloRepo.get(key).toString();
	}

}
