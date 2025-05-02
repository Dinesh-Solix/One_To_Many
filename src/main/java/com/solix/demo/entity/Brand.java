package com.solix.demo.entity;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Brand {
	@Id
	private Integer brandId;
	private String brandName;
	private String brandCode;
	
	@OneToMany(cascade = CascadeType.ALL)
	List<Mobile> mobiles;
	
	

}
