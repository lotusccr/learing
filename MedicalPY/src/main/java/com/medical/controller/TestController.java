package com.medical.controller;
import javax.annotation.Resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.medical.dimain.User;
import com.medical.service.UserService;
@RestController
@RequestMapping(value="/test")
public class TestController {
@Resource
private UserService userService;




	@RequestMapping("/addLoginTicket")
	  public String addLoginTicket(int id) {
		String person = userService.addLoginTicket(id);
	    return person;
	  }
	
	
	@RequestMapping("/save")
	  public void save(User u) {
		userService.addUser(u);
	  }
	
	@GetMapping("/seletByName")
	  public User  seletByName(@RequestParam("username") String name) {
	    return userService.seletByName(name);
	  }
	
	@GetMapping("/query")
	  public User  query() {
	    return userService.seletUser();
	  }
	
	
	
	
	
	

}
