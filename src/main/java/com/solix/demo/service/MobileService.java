package com.solix.demo.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.solix.demo.entity.Mobile;
import com.solix.demo.repo.MobileRepo;

public class MobileService {
	
	@Autowired
	MobileRepo mobileRepo;
	
	
}
