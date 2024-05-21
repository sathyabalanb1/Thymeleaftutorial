package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.demo.model.User;

@Controller
public class UserController {
	
	@GetMapping("/variable-expression")
	public String variableExpression(Model model) {
		
		User user = new User("Sathya","sathya@gmail.com","Admin","Male");
		model.addAttribute("user", user);
		return "variable-expression";
	}
	
	@GetMapping("/selection-expression")
	public String selectionExpression(Model model) {
		User user = new User("Ramkumar","ramkumar@gmail.com","Admin","Male");
		model.addAttribute("user", user);
		return "selection-expression";
	}
	
	@GetMapping("/message-expression")
	public 	String messageExpression() {
		return "message-expression";
	}
	
	@GetMapping("/link-expression")
	public String linkExpression(Model model) {
		model.addAttribute("id", "1");
		return "link-expression";
	}
	
	@GetMapping("/fragment-expression")
	public String fragmentExpression() {
		return "fragment-expression";
	}
	
	@GetMapping("/users")
	public String users(Model model) {
		User admin = new User("Reshma","reshma@gmail.com","Admin","Female");
		User monisha = new User("Monisha","monisha@gmail.com","User","Female");
		User srimathi = new User("Srimathi","srimathi@gmail.com","User","Female");
		
		List<User>users = new ArrayList<>();
		users.add(admin);
		users.add(monisha);
		users.add(srimathi);
		
		model.addAttribute("users", users);
		return "users";
	}
	
	@GetMapping("/if-unless")
	public String ifUnless(Model model) {
		User admin = new User("Reshma","reshma@gmail.com","Admin","Female");
		User monisha = new User("Monisha","monisha@gmail.com","User","Female");
		User srimathi = new User("Srimathi","srimathi@gmail.com","User","Female");
		
		List<User>users = new ArrayList<>();
		users.add(admin);
		users.add(monisha);
		users.add(srimathi);
		
		model.addAttribute("users", users);
		return "if-unless";
	}
	
	@GetMapping("switch-case")
	public String switchCase(Model model) {
		
		User user = new User("Ramesh","ramesh@gmail.com","ADMIN","Male");
		
		model.addAttribute("user", user);
		
		return "switch-case";
	}
	

}
