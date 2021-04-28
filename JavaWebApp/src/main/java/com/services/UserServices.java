package com.services;

import com.model.User;

public interface UserServices {
	
	
	void saveDetails(User user);
	
	boolean checkDetails(String un,String pswd);
	

}
