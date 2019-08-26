package com.dou.service;

import java.util.List;
import java.util.Map;

import com.dou.domain.Userinfo;

public interface UserConfigService {
	
	
	/**
	 * 	获取用户列表
	 * @return
	 */
	public List<Map<String, Userinfo>> getUserList();
	/**
	 *  添加用户
	 * @param user
	 */
	public void addUser(Userinfo user);
	
	// 删除
	public void deleteUser(Userinfo user);
	
	// 修改
	public void updateUser(Userinfo user);

}
