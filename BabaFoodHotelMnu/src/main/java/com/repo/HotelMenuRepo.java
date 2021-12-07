package com.repo;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.entity.HotelMenu;

@Repository
public interface HotelMenuRepo extends CrudRepository<HotelMenu, String> {
	 
	@Query("SELECT u FROM hotelmenu u WHERE u.mname = ?1")    
	public List<HotelMenu> findByProductName(String mname);
	

}
