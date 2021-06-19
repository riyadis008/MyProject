package com.mycart.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.mycart.model.ProductModel;
import com.mycart.service.ProductService;
//RestController product
@RestController
@RequestMapping("/product")
public class ProductController {
	
	@Autowired
	private ProductService productService;
	
	@PostMapping(value="/add") //fungsi untuk menambahkan objek produk ke database
	public ProductModel addProductSubmit(@RequestBody ProductModel product) {
		return productService.addProduct(product);
	}
	
	@GetMapping(value="/view/{productName}") //fungsi untuk melihat infor produk sesuai nama produk
	public ProductModel productView(@PathVariable("productName") String productName) {
		return  productService.getProductDetailByProductName(productName).get();
		}
	
	@DeleteMapping(value="/delete") //fungsi untuk menghapus record sebuah produk di database
	public String deleteProduct(@RequestParam("productName") String productName) {
		ProductModel product = productService.getProductDetailByProductName(productName).get();
		productService.deleteProduct(product);
		return "success";
	}
	
	@PutMapping(value = "/update/{productId}")//funsi untuk update info produk berdasarkan id produk
	public String updateProductSubmit(@PathVariable("productId") long productId,
			@RequestParam("productName") String productname,
			@RequestParam("price") double price) {
		ProductModel product = productService.getProductDetailById(productId).get();
		if(product.equals(null)) {
			return "product not found";
		}
		product.setProductName(productname);
		product.setPrice(price);
		productService.updateProduct(productId, product);
		return "data diupdate";
		
	}

}
