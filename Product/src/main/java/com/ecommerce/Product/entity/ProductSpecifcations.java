package com.ecommerce.Product.entity;

public class ProductSpecifcations {

	private String size;
	private String color;
	private Integer price;

	public ProductSpecifcations() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ProductSpecifcations(String size, String color, Integer price) {
		super();
		this.size = size;
		this.color = color;
		this.price = price;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public Integer getPrice() {
		return price;
	}

	public void setPrice(Integer price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "ProductSpecifcations [size=" + size + ", color=" + color + ", price=" + price + "]";
	}

}
