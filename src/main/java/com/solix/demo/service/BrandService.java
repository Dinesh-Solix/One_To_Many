package com.solix.demo.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.solix.demo.entity.Brand;
import com.solix.demo.repo.BrandRepo;

@Service
public class BrandService {
	
	@Autowired
	BrandRepo brandRepo;
	
	public Brand insertNewBrand(Brand newBrand) {
		return brandRepo.save(newBrand);
	}
	
	public Optional<Brand> fetchBrandById(Integer brandId) {
		return brandRepo.findById(brandId);
	}
	
	
	
	

}
