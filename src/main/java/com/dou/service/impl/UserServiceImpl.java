package com.dou.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dou.dao.UserDao;
import com.dou.domain.User;
import com.dou.service.UserService;

@Service
@Transactional
public class UserServiceImpl implements UserService{

    @Autowired
    private UserDao userDao;
    
    public User findUserByName(String name) {
        // TODO Auto-generated method stub
        return userDao.findByUsername(name);
    }
	public User findByUsername(String name) {
		// TODO Auto-generated method stub
		return null;
	}
}