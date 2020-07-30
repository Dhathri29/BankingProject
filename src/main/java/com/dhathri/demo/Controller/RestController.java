package com.dhathri.demo.Controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.dhathri.demo.model.User;
import com.dhathri.demo.services.UserService;

@org.springframework.web.bind.annotation.RestController
public class RestController {

	@Autowired
	public UserService userService;
	
	@RequestMapping("/")
	public  String hello() {
		return "This is home page";
	}
	
	@GetMapping("/saveuser")
    public String saveUser(@RequestParam int transactionamount, @RequestParam int balance ) {
	    User user =new User(transactionamount,balance);
		userService.saveMyUser(user);
	    return "user saved";
	}
}
