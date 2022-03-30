package com.capg.springboot.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capg.springboot.entity.Contact;
import com.capg.springboot.repository.ContactRepository;

@Service
public class ContactServiceImplementation implements ContactService{
	@Autowired
	private ContactRepository contactRepository;
	
	//Add User
		@Override
		public Contact addContact(Contact add) {
			
			return contactRepository.save(add);
			
		}
		
		//Modify User
		@Override
		public Contact updateContact(Contact add) {
			return contactRepository.save(add);
		}
		
		//Delete User
		public Contact removeContact(Contact add) {
			contactRepository.delete(add);
			return add;
			//return contactRepository.delete(add);
		}
}