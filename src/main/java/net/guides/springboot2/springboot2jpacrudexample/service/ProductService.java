package net.guides.springboot2.springboot2jpacrudexample.service;

import java.util.List;

import org.springframework.web.multipart.MultipartFile;

import net.guides.springboot2.springboot2jpacrudexample.model.ProductModel;

public interface ProductService {
	
List<ProductModel> getProductDetails(String type, Double minPrice, Double maxPrice, String city, String color, Integer gbLimitMin, Integer gbLimitMax);

	
	//saving multipart file
	void save(MultipartFile file);

}
