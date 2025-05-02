package com.solix.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.solix.demo.entity.Mobile;

public interface MobileRepo extends JpaRepository<Mobile, Integer>{

}
