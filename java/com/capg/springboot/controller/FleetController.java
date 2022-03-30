package com.capg.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.capg.springboot.entity.Fleet;
import com.capg.springboot.service.FleetService;


@SuppressWarnings("unused")
@RequestMapping("/FleetController")
@RestController
public class FleetController {
	@Autowired
	private FleetService Fleetservice;
	
	//Add Fleet method
	@PostMapping("/addFleet")
	public ResponseEntity<Fleet> addCustomer(@RequestBody Fleet add)
	{
		Fleetservice.addFleet(add);
		return new ResponseEntity(add,HttpStatus.OK);
	}
	
	//Modify Fleet method
	@PostMapping("/UpdateFleet")
	public ResponseEntity<Fleet> updateCustomer(@RequestBody Fleet add)
	{
		Fleetservice.updateFleet(add);
		return new ResponseEntity(add,HttpStatus.OK);
	}
	
	//Deleting a Fleet
	@DeleteMapping("/deleteFleet") 
	public ResponseEntity<Fleet> removeFleet(@RequestBody Fleet add)
	{
       Fleetservice.removeFleet(add);
       return new ResponseEntity(add,HttpStatus.OK); 
    }
}