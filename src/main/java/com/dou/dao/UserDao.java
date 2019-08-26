package com.dou.dao;

import com.dou.domain.User;

public interface UserDao {
	
	
	 User findByUsername(String username);
}
