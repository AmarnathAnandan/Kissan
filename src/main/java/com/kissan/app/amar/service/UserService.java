package com.kissan.app.amar.service;


import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.kissan.app.amar.model.User;
import com.kissan.app.amar.repository.UserRepository;

@Service
public class UserService {
	@Autowired
	UserRepository userRepository;
	
	
	public List<User> getAllUser()   
	{  
	List<User> Users = new ArrayList<User>();  
	userRepository.findAll().forEach(User -> Users.add(User));  
	return Users;  
	}  
	
	
	//getting a specific record  
	public User getUserById(long id)   
	{  
	return userRepository.findById(id).get();  
	}  
	
	
	public void saveOrUpdate(User User, Model model)   
	{  
		userRepository.save(User); 
        model.addAttribute("users", userRepository.findAll());
	}  
	
	
	//deleting a specific record  
	public void delete(long id)   
	{  
		userRepository.deleteById(id);  
	}  
	}  