package com.ecommerce.Product.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.ecommerce.Product.entity.Product;
import com.ecommerce.Product.service.ProductService;
import com.ecommerce.Product.service.ProductServiceImpl;



@RestController
public class ProductController {

	@Autowired
	ProductService productService;
	
	@PostMapping("/product")
	public Product addProduct(@RequestBody Product product){
		
		return productService.addProduct(product);
		
	}

	
	@GetMapping("/product")
	public List<Product> getAllProducts(){
		return null;
	}
//	
//	@GetMapping("/product/{product_type}")
//	public List<Product> getProductsByType(@PathVariable("product_type") String product_type){
//		return null;
//	}
//	
//	@PatchMapping("/product")
//	public ResponseEntity<Object> updateProduct(){
//		return null;
//	}
//	
//	@DeleteMapping("/product")
//	public ResponseEntity<Object> deleteProduct(){
//		return null;
//	}
}
