package com.mycart.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.persistence.Id;
import javax.persistence.Column;

	
//product model
//bind attribut ke tabel database
@Entity
@Table(name = "Product")
public class ProductModel implements Serializable {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long Id;
	
	@NotNull
	@Size(max = 255)
	@Column(name = "product_name", nullable = false, unique = true)
	private String productName;
	
	@NotNull
	@Column(name="price", nullable = false)
	private double price;

	public long getId() {
		return Id;
	}

	public void setId(long id) {
		Id = id;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	
	

}
