package com.bellicose.jspbootangular.repository;

import org.springframework.data.repository.CrudRepository;

import com.bellicose.jspbootangular.modelo.User;

public interface UserRepository extends CrudRepository<User, Long> {

	public User findByUsername(String name);
}
