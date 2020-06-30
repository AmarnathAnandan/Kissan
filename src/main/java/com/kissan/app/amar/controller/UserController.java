package com.kissan.app.amar.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.kissan.app.amar.model.User;
import com.kissan.app.amar.service.UserService;


@Controller
public class UserController {
	
	@Autowired UserService userService;
     
	@GetMapping("/start")
    public String showStart(User user) {
        return "index";
    }
	
//	@GetMapping("/start")
//    public String showUser(User user) {
//        return "index";
//    }
     
//    @PostMapping("/adduser")
//    public String addUser( User user, BindingResult result, Model model) {
//        if (result.hasErrors()) {
//            return "add-user";
//        }
//        userService.saveOrUpdate(user, model);
//        return "redirect:/index";
//    }
    
    
}