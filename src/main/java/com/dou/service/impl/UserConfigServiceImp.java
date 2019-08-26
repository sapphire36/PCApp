package com.dou.service.impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.dou.dao.UserConfigDao;
import com.dou.domain.Userinfo;
import com.dou.service.UserConfigService;

@Service
public class UserConfigServiceImp implements UserConfigService {

	@Resource
	private UserConfigDao UserConfigdao;
	
	public List<Map<String, Userinfo>> getUserList() {
		return UserConfigdao.getUserList();
	}
	
	
	public void addUser(Userinfo user) {
		UserConfigdao.addUser(user);
	}


	public void deleteUser(Userinfo user) {
		UserConfigdao.deleteUser(user);		
	}


	public void updateUser(Userinfo user) {
		UserConfigdao.updateUser(user);
	}

}
