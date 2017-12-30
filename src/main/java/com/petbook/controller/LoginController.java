package com.petbook.controller;

import com.petbook.model.User;

public interface LoginController {

	public User signUp();
	
	public User login();
	
	public User validateUser();
	
}
