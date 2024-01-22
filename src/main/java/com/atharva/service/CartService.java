package com.atharva.service;

import com.atharva.exception.ProductException;
import com.atharva.modal.Cart;
import com.atharva.modal.CartItem;
import com.atharva.modal.User;
import com.atharva.request.AddItemRequest;

public interface CartService {
	
	public Cart createCart(User user);
	
	public String addCartItem(Long userId,AddItemRequest req) throws ProductException;
	
	public Cart findUserCart(Long userId);

}
