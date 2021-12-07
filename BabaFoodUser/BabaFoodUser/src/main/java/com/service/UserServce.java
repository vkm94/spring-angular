package com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.controller.UserController;
import com.entity.User;

@RestController

public class UserServce {
	@Autowired
	
public UserController uc;

	@PostMapping("/login")
	public String login(@RequestBody User user) {
		String email=user.getEmail();
		String pass=user.getPass();
		//System.out.println(user);
	String result=	uc.login(email,pass);
	//System.out.println(result);
		return result;
		
	}
	@PostMapping("/GetData")
	public User GetData(@RequestBody User user){
		String email=user.getEmail();
		String pass=user.getPass();
		//System.out.println(user);
	User result=	uc.GetData(email,pass);
		return result;
		
	}
	
	@PostMapping("/register")
	public String register(@RequestBody User user) {
		
		String reg= uc.regiser(user);
		return reg;
		
	}
	@PutMapping("/update/{id}")
 public String UpdataUser(@PathVariable String id, @RequestBody User user) {
	String Update=uc.UpdateData(id,user);
	return Update;
	 
 }
}
