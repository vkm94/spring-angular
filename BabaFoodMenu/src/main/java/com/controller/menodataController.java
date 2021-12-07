package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.entity.Menu;

@RestController
public class menodataController {
	@Autowired
	public MenuController mc;
	
	@PostMapping("/addMenu")
	public String addmenu(@RequestBody Menu menu) {
		String add=mc.addMenu(menu);		
		return add;
		
	}
	
	@GetMapping("/getItems")
	public List<Menu> getItems() {
		
		return mc.GetItems();
		
	}
	@PutMapping("/UpdateMenu/{id}")
	public String UpdateItems(@PathVariable String id,@RequestBody Menu menu) {
		
		return mc.Updatemenu(id,menu);
	}
	@GetMapping("/getmenuname")
	public List<Menu> getmenuname(){
		return mc.getmenuname();
	}
}
