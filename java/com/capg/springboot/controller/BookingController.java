//Manoj Kumar V
package com.capg.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.capg.springboot.entity.Booking;
import com.capg.springboot.service.BookingService;

@RequestMapping("/BookingController")
@RestController
public class BookingController 
{
	@Autowired
	private BookingService bookingservice;
	
	
	//Add user method
	  @PostMapping("/addBooking") public ResponseEntity<Booking> addBooking(@RequestBody
	  Booking customer) { Booking custImpl=bookingservice.addBooking(customer); return new
	  ResponseEntity(custImpl,HttpStatus.OK); }
	  
	  //Modify user method
	  
	  @PostMapping("/modifyBooking") public ResponseEntity<Booking>
	  modifyCustomer(@RequestBody Booking customer) { Booking
	  custImpl=bookingservice.updateBooking(customer); return new
	  ResponseEntity(custImpl,HttpStatus.OK); }
	  
	  //Deleting an user 
	  @DeleteMapping("/removeBooking")
		public ResponseEntity<Booking> removeAddress(@RequestBody Booking add){
			((BookingService) bookingservice).removeBooking(add);
			return new ResponseEntity(add,HttpStatus.OK);
		}
	
}