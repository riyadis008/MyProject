package com.mycart.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mycart.model.ProductModel;

//repository untuk database product
public interface ProductDB extends JpaRepository<ProductModel, Long> {
	Optional<ProductModel> findByProducId(long id); //search vy Id
	Optional<ProductModel> findByProductName(String productName); //search by Product Name
	void deleteByProductname(String productname); //delete by productname

}
