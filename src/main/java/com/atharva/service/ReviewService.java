package com.atharva.service;

import java.util.List;

import com.atharva.exception.ProductException;
import com.atharva.modal.Review;
import com.atharva.modal.User;
import com.atharva.request.ReviewRequest;

public interface ReviewService {

	public Review createReview(ReviewRequest req,User user) throws ProductException;
	
	public List<Review> getAllReview(Long productId);
	
	
}
