package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.entity.Menu;
import com.repo.MenuRepo;

@RestController
public class MenuController {
	@Autowired
	public MenuRepo mr;

	public String addMenu(Menu menu) {
		 if(mr.save(menu) != null) {
			 return "Added";
			 }
		 
		return "Error While Adding";
	}

	public List<Menu> GetItems() {
	
		return (List<Menu>) mr.findAll();
	}

	public String Updatemenu(String id,Menu menu) {
		Menu m=mr.findById(id).orElse(null);
		m.setImg(menu.getImg());
		m.setName(menu.getName());
		m.setDescr(menu.getDescr());
		mr.save(m);
		if(mr.save(m) != null) {
			return "Successfully Updated";
		}
		return "Error";
	}
	public List<Menu> getmenuname(){
		
		
		return (List<Menu>)mr.findAll();
		
	}

}
