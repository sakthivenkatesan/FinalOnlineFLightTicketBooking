//Manoj Kumar N
package com.capg.springboot.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capg.springboot.entity.Contact;
import com.capg.springboot.entity.User;
import com.capg.springboot.service.ContactService;

@RequestMapping("/contactController")
@RestController
public class contactController {
	@Autowired
	private ContactService contactservice;
	
	//Add contact method
		@PostMapping("/addContact")
		public ResponseEntity<Contact> addContact(@RequestBody Contact customer)
		{
			Contact contImpl=contactservice.addContact(customer);
			return new ResponseEntity(contImpl,HttpStatus.OK);
		}
		//Modify contact method
			@PostMapping("/modifyContact")
			public ResponseEntity<Contact> updateContact(@RequestBody Contact customer)
			{
				Contact contImpl=contactservice.updateContact(customer);
				return new ResponseEntity(contImpl,HttpStatus.OK);
			}
			
			//Deleting a contact
			@DeleteMapping("/removeContact") 
			public ResponseEntity<Contact> removeContact(@RequestBody Contact add)
			{
		       contactservice.removeContact(add);
		       return new ResponseEntity(add,HttpStatus.OK); 
		    }

}