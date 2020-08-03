package com.ecommerce.Product.DAO;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.ecommerce.Product.entity.Product;

@Repository
public interface ProductRepository extends MongoRepository<Product, String>{

}
