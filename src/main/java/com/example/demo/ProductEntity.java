package com.example.demo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="product")
public class ProductEntity {

	@Id
	@GeneratedValue
	@Column(name="product_id")
	private Integer productId;
	@Column(name="product_name")
	private String productName;
	@Column(name="product_img")
	private String productImg;
	@Column(name="product_details")
	private String productDetails;
	private Integer price;
	private String size;
	private String manufacture;
	private String color;
	@Column(name="category_id")
	private Integer categoryId;
	private Integer stock;
	
	public ProductEntity() {
		super();
	}
	
	public Integer getProductId(){
		return productId;
	}
	public String getProductName() {
		return productName;
	}

	public String getProductImg() {
		return productImg;
	}

	public String getProductDetails() {
		return productDetails;
	}

	public Integer getPrice() {
		return price;
	}

	public String getSize() {
		return size;
	}

	public String getManufacture() {
		return manufacture;
	}

	public String getColor() {
		return color;
	}

	public Integer getCategoryId() {
		return categoryId;
	}

	public Integer getStock() {
		return stock;
	}

	public void setProductId(Integer productId) {
		this.productId = productId;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public void setProductImg(String productImg) {
		this.productImg = productImg;
	}

	public void setProductDetails(String productDetails) {
		this.productDetails = productDetails;
	}

	public void setPrice(Integer price) {
		this.price = price;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public void setManufacture(String manufacture) {
		this.manufacture = manufacture;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public void setCategoryId(Integer categoryId) {
		this.categoryId = categoryId;
	}

	public void setStock(Integer stock) {
		this.stock = stock;
	}
}
