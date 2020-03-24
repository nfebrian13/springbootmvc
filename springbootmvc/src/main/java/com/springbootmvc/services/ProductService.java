package com.springbootmvc.services;

import java.util.List;

import com.springbootmvc.domain.Product;

public interface ProductService {
	List<Product> listAllProducts();
	Product getProductById(Integer id);
}
