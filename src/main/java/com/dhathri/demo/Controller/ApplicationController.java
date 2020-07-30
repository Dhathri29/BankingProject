package com.dhathri.demo.Controller;
import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;


import com.dhathri.demo.model.User;
import com.dhathri.demo.services.UserService;

@Controller
public class ApplicationController {

	@Autowired
	UserService userService;

	@RequestMapping("/welcome") 
	public String welcome(HttpServletRequest request) {
		request.setAttribute("mode", "MODE_HOME");
		return "welcomepage";
	}
	@RequestMapping("/transaction") 
	public String transpage(HttpServletRequest request) {
		request.setAttribute("mode", "MODE_TRANSACTION");
		request.setAttribute("users", userService.showAllUsers());
		//request.setAttribute("mode", "MODE_ALL_TRANSACTIONS");
		return "welcomepage";
	}
	@GetMapping("/alltransactions")
	public String showAllTransactions(HttpServletRequest request) {
		request.setAttribute("mode", "MODE_ALL_TRANSACTIONS");
		request.setAttribute("users", userService.showAllUsers());
		
		return "welcomepage";
	}
	
	  @PostMapping("/save-user") 
	  public String registerUser(@ModelAttribute User user, BindingResult bindingResult, HttpServletRequest request) {
	 userService.saveMyUser(user); 
	 request.setAttribute("users", userService.showUsers()); 
	 request.setAttribute("mode", "MODE_ALL_TRANSACTIONS");
	  
	  return "welcomepage"; 
	  }
}