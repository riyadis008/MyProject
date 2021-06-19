package com.mycart.model;
import java.io.Serializable;
import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import com.fasterxml.jackson.annotation.JsonIgnore;

//cart model
@Entity
@Table(name = "cart") //nama table
public class CartModel implements Serializable {
	
	

	//bind attribut ke nama kolom
	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "product_name", referencedColumnName = "product_name", nullable = false)
	@OnDelete(action = OnDeleteAction.NO_ACTION)
	@JsonIgnore
	private ProductModel product;
	
	@NotNull
	@Column(name = "quantity")
	private int qty;
	
	@NotNull
	@Column(name = "final_price" )
	private double finalPrice =  this.product.getPrice() * this.qty;

	

	public ProductModel getProduct() {
		return product;
	}

	public void setProduct(ProductModel product) {
		this.product = product;
	}

	public int getQty() {
		return qty;
	}

	public void setQty(int qty) {
		this.qty = qty;
	}

	public double getFinalPrice() {
		return finalPrice;
	}

	public void setFinalPrice(double finalPrice) {
		this.finalPrice = finalPrice;
	}
	
	

}
