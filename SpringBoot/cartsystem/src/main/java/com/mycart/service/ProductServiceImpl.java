package com.mycart.service;

import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mycart.model.ProductModel;
import com.mycart.repository.ProductDB;

@Service
@Transactional
public class ProductServiceImpl implements ProductService {
	
	@Autowired
	private ProductDB productDb;

	@Override //servis mencari produk berdasarkan nama produk
	public Optional<ProductModel> getProductDetailByProductName(String productName) {
		return productDb.findByProductName(productName);
	}

	@Override //servis untuk meyimpan record produk ke dalam database
	public ProductModel addProduct(ProductModel product) {
		return productDb.save(product);
		
	}

	@Override //servis untuk menghapus record sebuah produk
	public void deleteProduct(ProductModel product) {
		productDb.delete(product);
		
	}

	@Override //servis untuk mendapatkan detil produk berdasarkan id produk
	public Optional<ProductModel> getProductDetailById(long id) {
		
		return productDb.findById(id);
	}

	@Override //servis untuk mengubah info sebuah produk
	public void updateProduct(long productId, ProductModel product) {
		ProductModel productDetail = productDb.getById(productId);
		productDetail.setProductName(product.getProductName());
		productDetail.setPrice(product.getPrice());
		productDb.save(productDetail);
		
		
	}

}
