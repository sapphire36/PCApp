package com.dou.web;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.dou.domain.User;
import com.dou.service.UserService;

@Controller
public class UserController {
   @Autowired(required = false)
   private UserService userService;

   @RequestMapping(value = "/login")
   public String login(User model, HttpSession session) {
	   System.out.println(model.getPassword()+"@@@@@@");
       User user = userService.findUserByName(model.getUsername());
       if (user == null || !user.getPassword().equals(model.getPassword())) {
           return "redirect:/error.jsp";
       } else {
           session.setAttribute("user", user);
           ModelAndView mav = new ModelAndView();
           mav.setViewName("login");
           return "login";
       }
   }
   
   
   
}