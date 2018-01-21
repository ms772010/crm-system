package com.jc.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.jc.beans.User;
import com.jc.service.IUserService;

@Controller  
@RequestMapping("/user")
public class UserController {  
    @Resource  
    private IUserService userService;  
      
    @RequestMapping("/showUser")  
    public String toIndex(String userid,Model model,int id){  
  //      int userId = Integer.parseInt(request.getParameter("id"));  
        int userId=Integer.parseInt(userid);
        String errmessage="没有权限这么做";
    	User user = this.userService.getUserById(userId);  
    	User user2 = this.userService.getUserById(id);
    	if(user.getPid()>=user2.getPid() || user2.getPid()==0) {
    	System.out.println(user.getPassword());
        model.addAttribute("user", user);  
        return "main"; 
    	}
    	else {
    		model.addAttribute("errmessage", errmessage);
    		return "main"; 
    	}
}
    @RequestMapping("login")
    public String login(String userName,String password,Model model) {
		
			User user1=this.userService.getUserByName(userName);
		if(password.equals(user1.getPassword())) {
			System.out.print("成功");
			System.out.print(user1.getPassword());
			System.out.print(user1.getPid());
			model.addAttribute("user1", user1);
			 return "main";  
		}
    	return "loginfailed";
    	
    }
}
