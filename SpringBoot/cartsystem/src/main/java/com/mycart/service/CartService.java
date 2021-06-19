package com.mycart.service;
import java.util.List;

import com.mycart.model.CartModel;

public interface CartService {
	CartModel getCardModelByProductName(String productname);
	CartModel addCart(CartModel cart);
	public List<CartModel> getAllItem();
	void deleteEntry(CartModel cart);
	

}
