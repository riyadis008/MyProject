package com.mycart.service;
import java.util.Optional;

import com.mycart.model.ProductModel;
//Service Product
public interface ProductService {
	Optional<ProductModel> getProductDetailById(long id);
	Optional<ProductModel> getProductDetailByProductName(String productName);
	ProductModel addProduct(ProductModel product);
	void deleteProduct(ProductModel product);
	void updateProduct(long productId, ProductModel product);

}
