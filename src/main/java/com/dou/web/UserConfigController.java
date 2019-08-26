package com.dou.web;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.dou.domain.Userinfo;
import com.dou.service.UserConfigService;

@Controller
@RequestMapping("/userConfig")
public class UserConfigController {
	
	@Resource
	private UserConfigService userConfigService;
	
	   /**
	    * 获取用户列表
	    * 
	    */
	
	@RequestMapping("/getUserList.do")
	public String getUserList(Map<String,Object> map , HttpServletRequest re) {
		ModelAndView mav = new ModelAndView();
		List<Map<String, Userinfo>>  list=userConfigService.getUserList();
		
		mav.addObject("list",list);
		mav.setViewName("redirect:right");
		mav.setViewName("right");
		return "right";
		
	}
	
	
	
	/**
	 *  增加
	 */
	@ResponseBody
	@RequestMapping("addUser.do")
	public String addUser(Map<String,Object> map ,Userinfo User) {
		
		
		try {
			userConfigService.addUser(User);
			map.put("1", "添加信息成功");
		} catch (Exception e) {
			map.put("0", "添加信息失败");

		}
		return null;
		
	}
	
	/**
	 *   删除
	 */
	@ResponseBody
	@RequestMapping("deleteUser.do")
	public String deleteUser(Map<String,Object> map ,Userinfo User) {
		try {
			userConfigService.deleteUser(User);
			map.put("1", "添加信息成功");
		} catch (Exception e) {
			map.put("0", "添加信息失败");

		}
		return null;
		
	}
	
	
	/**
	 *   修改
	 */
	@ResponseBody
	@RequestMapping("updateUser.do")
	public String updateUser(Map<String,Object> map ,Userinfo User) {
		try {
			userConfigService.updateUser(User);
			map.put("1", "添加信息成功");
		} catch (Exception e) {
			map.put("0", "添加信息失败");

		}
		return null;
		
	}
	
	

}
