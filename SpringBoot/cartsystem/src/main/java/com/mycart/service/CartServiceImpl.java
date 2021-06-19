package com.mycart.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mycart.model.CartModel;
import com.mycart.repository.CartDB;

@Service
@Transactional
public class CartServiceImpl implements CartService {
	@Autowired
	private CartDB cartDb;


	@Override //servis untuk menambahkan entry pada cart
	public CartModel addCart(CartModel cart) {
		return cartDb.save(cart);
		
	}


	@Override//servis untuk mendapatkan sebuah entry dalam cart berdasarkan nama produk
	public CartModel getCardModelByProductName(String productName) {
		return cartDb.getByProductName(productName);
	}


	@Override //servis untuk mengambil seluruh data dalam database cart
	public List<CartModel> getAllItem() {
		return cartDb.findAll();
	}


	@Override //servis untuk menghapus sebuah entry pada cart
	public void deleteEntry(CartModel cart) {
		cartDb.delete(cart);
		
	}

}
