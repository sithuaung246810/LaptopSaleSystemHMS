package com.laptopsale.Service;


import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Page;

import com.laptopsale.entity.Brand;

public interface BrandService {
	void addBrand(Brand brand);
	List<Brand> getAllBrands(String keyword);
	void deleteBrandById(Integer id);
	Optional<Brand> getBrandById(Integer id);
	Page<Brand> getBrandBySorting(String sortField,String sortDirection);
	 public List<Brand> getAllBrandsSorted(String sortField, String sortDir);
	 
	 
	 public List<Brand> findAllActiveBrands();
	 
	 public void softDeletBrands(Integer id);
	 
	 Integer countActiveBrand();
	 
	 
	 
}
