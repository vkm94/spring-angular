package com.rest;

import java.util.List;

import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.EntityManager;
import javax.persistence.JoinColumn;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.entity.HotelMenu;
import com.repo.HotelMenuRepo;
@RestController 
public class HotelMenuOperations {
@Autowired
	public HotelMenuRepo hr;
	public String AddItems(HotelMenu menu) {
		if(hr.save(menu) != null) {
			return "Success";
		}
		return "Failed";
		
	}
	public String UpdateItems(String id, HotelMenu menu) {
		
		HotelMenu hm=hr.findById(id).orElse(null);
		hm.setStatus(menu.getStatus());
		hm.setPrice(menu.getPrice());
		if(hr.save(hm) != null) {
			return "Success";
			
		}
		return"Failed";
	}
	
	

	 
	public List<HotelMenu> getList() {

		return (List<HotelMenu>) hr.findAll();
	}
	/*
	 * @ManyToMany
	 * 
	 * @JoinTable( name = "menu", joinColumns =@JoinColumn( name = "hotel_id",
	 * referencedColumnName = "hid" ), inverseJoinColumns = @JoinColumn( name =
	 * "hid", referencedColumnName = "hid" ) )
	 */
	public List<HotelMenu> Search(String mname) {
		return hr.findByProductName(mname);
		
	}
	
}
