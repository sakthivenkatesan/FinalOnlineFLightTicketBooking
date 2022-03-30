//Sakthi B V
package com.capg.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capg.springboot.entity.User;
import com.capg.springboot.exceptions.UserNotFoundException;
import com.capg.springboot.service.UserService;

import antlr.collections.List;

@RequestMapping("/userController")
@RestController
public class UserController 
{
	@Autowired
	private UserService userservice;
	
	//Add user method
	  @PostMapping("/addUser") public ResponseEntity<User> addUser(@RequestBody
	  User customer) { User custImpl=userservice.addUser(customer); return new
	  ResponseEntity(custImpl,HttpStatus.OK); }
	  
	  //Modify user method
	  
	  @PostMapping("/updateUser") public ResponseEntity<User>
	  modifyCustomer(@RequestBody User customer) { User
	  custImpl=userservice.updateUser(customer); return new
	  ResponseEntity(custImpl,HttpStatus.OK); }
	  
	  //Deleting an user 
	  @DeleteMapping("/removeUser")
		public ResponseEntity<User> removeUser(@RequestBody User add){
			userservice.removeUser(add);
			return new ResponseEntity(add,HttpStatus.OK);
		}
}
