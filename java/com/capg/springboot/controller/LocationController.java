//Anantha Krishnan V S
package com.capg.springboot.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.capg.springboot.entity.Location;
import com.capg.springboot.service.LocationService;


@RequestMapping("/LocationController")
@RestController
public class LocationController {
	@Autowired
	private LocationService locationservice;
	
	//Add Location method
		@PostMapping("/addLocation")
		public ResponseEntity<Location> add(@RequestBody Location add)
		{
			Location locImpl=locationservice.addLocation(add);
			return new ResponseEntity(locImpl,HttpStatus.OK);
		}
		
		//Modify Location method
		@PostMapping("/modifyLocation")
		public ResponseEntity<Location> modifyLocation(@RequestBody Location add)
		{
			Location locImpl=locationservice.updateLocation(add);
			return new ResponseEntity(locImpl,HttpStatus.OK);
		}
		
		//Deleting location method
		@DeleteMapping("/deleteLocation") 
		public ResponseEntity<Location> removeLocation(@RequestBody Location add)
		{
	       Location locImpl=locationservice.removeLocation(add);
	       return new ResponseEntity(locImpl,HttpStatus.OK); 
	    }
}
