package com.mycart.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mycart.model.CartModel;

public interface CartDB extends JpaRepository<CartModel, Long> {
	CartModel getByProductName(String productname);
	void deleteByProductname(String productname);

}
