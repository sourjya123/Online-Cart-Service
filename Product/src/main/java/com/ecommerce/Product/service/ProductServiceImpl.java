package com.ecommerce.Product.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecommerce.Product.DAO.ProductRepository;
import com.ecommerce.Product.entity.Product;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	ProductRepository productRepository;

	@Override
	public Product addProduct(Product product) {

		Product addedProduct = productRepository.save(product);
		return addedProduct;
	}
}
