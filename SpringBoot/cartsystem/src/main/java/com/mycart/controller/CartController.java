package com.mycart.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.mycart.model.CartModel;
import com.mycart.service.CartService;
import com.mycart.service.ProductService;

//rest controller untuk cart

@RestController
@RequestMapping("/cart")
public class CartController {
	
	@Autowired
	private CartService cartService;
	
	@Autowired
	private ProductService productService;
	
	@PostMapping(value="/add") //menambah sebuah entry cart
	public CartModel addCart(@RequestBody CartModel cart ) {
		return cartService.addCart(cart);
	}
	
	@GetMapping(value="/viewcart") //melihat seluruh isi cart
	public List<CartModel> allItem(){
		return cartService.getAllItem();
		
	}
	
	@GetMapping(value="/total") //fungsi sementara untuk mencari total harga
	public double calculateTotal() {
		List<CartModel> allCart = cartService.getAllItem();
		double price = 0;
		for(CartModel c : allCart) {
			price += c.getFinalPrice();
		}
		
		return price;
		
	}
	
	@DeleteMapping(value="/delete") //delete sebuah entry di cart
	public String deleteItem(@RequestParam("productName") String productName) {
		CartModel cartEntry = cartService.getCardModelByProductName(productName);
		
		return "deleted";
		
	}

}
