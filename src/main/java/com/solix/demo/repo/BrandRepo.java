package com.solix.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.solix.demo.entity.Brand;

@Repository
public interface BrandRepo extends JpaRepository<Brand, Integer> {

}
