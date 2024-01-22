package com.atharva.service;

import com.atharva.exception.UserException;
import com.atharva.modal.User;

public interface UserService {
	
	public User findUserById(Long userId) throws UserException;
	
	public User findUserProfileByJwt(String jwt) throws UserException;

}
