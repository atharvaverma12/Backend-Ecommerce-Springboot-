package com.atharva.service;

import java.util.List;

import com.atharva.exception.ProductException;
import com.atharva.modal.Rating;
import com.atharva.modal.User;
import com.atharva.request.RatingRequest;

public interface RatingServices {
	
	public Rating createRating(RatingRequest req,User user) throws ProductException;
	
	public List<Rating> getProductsRating(Long productId);

}
