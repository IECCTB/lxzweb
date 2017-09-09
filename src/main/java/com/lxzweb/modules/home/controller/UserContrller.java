package com.lxzweb.modules.home.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lxzweb.modules.home.domain.TUser;
import com.lxzweb.modules.home.service.UserService;


@RestController
public class UserContrller {
	
	@Autowired
	private UserService userService;
	
	 @RequestMapping("/hi.do")
	  String home() {
	  return   "hello";
	  }
	
	@RequestMapping("/getAll.do")
	public List<TUser> getAll(){
		List<TUser> userlist= new  ArrayList<TUser>();
    	TUser u = userService.selectByPrimaryKey(1);
    	TUser u2= userService.selectByPrimaryKey(2);
    	TUser u3 = userService.selectByPrimaryKey(3);
    	userlist.add(u);
    	userlist.add(u2);
    	userlist.add(u3);
    	return userlist;
		
	}
	
	    @RequestMapping("/getlists.do") 
	   	public List<TUser> getlist(){
	       	return userService.getAll();
	       }
	    
	    @RequestMapping("/getmap.do") 
	   	public Map<String,TUser> getmap(){
	    	Map<String,TUser> usermap= new  HashMap<>();
	    	TUser u = userService.selectByPrimaryKey(1);
	    	TUser u2= userService.selectByPrimaryKey(2);
	    	TUser u3 = userService.selectByPrimaryKey(3);
	    	usermap.put("1",u);
	    	usermap.put("2",u2);
	    	usermap.put("3",u3);
	       	return usermap;
	       }

}
