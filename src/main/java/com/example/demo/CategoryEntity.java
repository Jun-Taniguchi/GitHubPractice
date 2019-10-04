package com.example.demo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;




@Entity
@Table(name="category")
public class CategoryEntity {

	@Id
	@GeneratedValue
	@Column(name="category_id")
	private Integer categoryId;
	@Column(name="category_name")
	private String categoryName;

	public CategoryEntity(){
		super();
	}

	public CategoryEntity(String categoryName) {
		super();
		this.categoryName = categoryName;
	}
	public Integer getCategoryId() {
		return categoryId;
	}
	public String getCategoryName() {
		return categoryName;
	}
	public void setCategory_id(Integer categoryId) {
		this.categoryId = categoryId;
	}
	public void setCategory_name(String categoryName) {
		this.categoryName = categoryName;
	}

}