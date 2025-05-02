package com.solix.demo.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.solix.demo.entity.Brand;
import com.solix.demo.repo.BrandRepo;
import com.solix.demo.service.BrandService;

@RestController
public class BrandController {
	
	@Autowired
	BrandService brandService;
	
	@PostMapping("/insertNewBrand")
	public Brand insertNewBrand(@RequestBody Brand newBrand) {
		return brandService.insertNewBrand(newBrand);
	}
	
	@GetMapping("/fetchBrandById")
	public Optional<Brand> fetchBrandById(@RequestParam Integer brandId){
		return brandService.fetchBrandById(brandId);
	}
	
	

}
