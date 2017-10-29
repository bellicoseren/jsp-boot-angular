package com.bellicose.jspbootangular.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.bellicose.jspbootangular.modelo.User;
import com.bellicose.jspbootangular.repository.UserRepository;

@Service("userService")
@Transactional
public class UserServiceImp implements UserService {

	@Autowired
	private UserRepository userRepository;

	public List<User> findAllUsers(){
		return (List<User>) userRepository.findAll();
	}
	
	
	public User findById(long id) {
		return userRepository.findOne(id);
	}

	
	public User findByName(String name) {
		return userRepository.findByUsername(name);
	}

	
	public void saveUser(User user) {
		userRepository.save(user);
	}

	@Override
	public void updateUser(User user) {
		userRepository.save(user);
	}

	@Override
	public void deleteUserById(long id) {
		userRepository.delete(id);
	}


	@Override
	public void deleteAllUsers() {
		userRepository.deleteAll();
	}

	@Override
	public boolean isUserExist(User user) {
		return findByName(user.getUsername()) != null;
	}

}
