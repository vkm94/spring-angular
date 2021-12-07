package com.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.entity.User;
import com.repo.UserRepo;

@RestController
public class UserController {
	@Autowired
	UserRepo ur;

	public String login(String email,  String pass) {
		//String email=user.getEmail();
		if(ur.findAll().toString().contains(email)) {
			User details=ur.findByEmail(email);
			if(details.getEmail().equals(email)&&details.getPass().equals(pass)) {
				return details.getType().toString();
			}
			return "Invalid Credencials";
		}
		return "Please Enter valid Email";
				
	}
 
	public String regiser(User user) {
		String email=user.getEmail();
		if(ur.findAll().toString().contains(email)) {
			return "This email is already Exists Please Login.. ";
		// TODO Auto-generated method stub
		}
		
		if(ur.save(user) != null) {
			return "Success";
		}
		
		return "Error";
	}

	public String UpdateData(String id, User user) {
		User use=ur.findById(id).orElse(null);
		use.setEmail(user.getEmail());
		use.setName(user.getName());
		use.setPass(user.getPass());
		use.setPhno(user.getPhno());
		use.setType(user.getType());
		use.setStatus(user.getStatus());
		use.setAddress(user.getAddress());
	if(ur.save(use) != null) {
		return "Success";
	}
		return "Error While Adding";
	}

	public User GetData(String email, String pass) {
		if(ur.findAll().toString().contains(email)) {
			User details=ur.findByEmail(email);
			if(details.getEmail().equals(email)&&details.getPass().equals(pass)) {
				return details;
			}
			return null;
		}
		return null;
	}
	
	
}
