package com.ecommerce.Product.entity;



import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Product {

	@Id
	private String product_id;
	private String product_type;
	private String brand_name;
	private String description;
	private ProductSpecifcations product_specifications;

	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Product(String product_id, String product_type, String brand_name, String description,
			ProductSpecifcations product_specifications) {
		super();
		this.product_id = product_id;
		this.product_type = product_type;
		this.brand_name = brand_name;
		this.description = description;
		this.product_specifications = product_specifications;
	}

	public String getProduct_id() {
		return product_id;
	}

	public void setProduct_id(String product_id) {
		this.product_id = product_id;
	}

	public String getProduct_type() {
		return product_type;
	}

	public void setProduct_type(String product_type) {
		this.product_type = product_type;
	}

	public String getBrand_name() {
		return brand_name;
	}

	public void setBrand_name(String brand_name) {
		this.brand_name = brand_name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public ProductSpecifcations getProduct_specifications() {
		return product_specifications;
	}

	public void setProduct_specifications(ProductSpecifcations product_specifications) {
		this.product_specifications = product_specifications;
	}

	@Override
	public String toString() {
		return "Product [product_id=" + product_id + ", product_type=" + product_type + ", brand_name=" + brand_name
				+ ", description=" + description + ", product_specifications=" + product_specifications + "]";
	}

}
