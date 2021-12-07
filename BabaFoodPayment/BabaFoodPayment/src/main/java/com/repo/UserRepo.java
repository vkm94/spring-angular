package com.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.entity.User;
@Repository
public interface UserRepo extends CrudRepository<User, String> {
	

}
