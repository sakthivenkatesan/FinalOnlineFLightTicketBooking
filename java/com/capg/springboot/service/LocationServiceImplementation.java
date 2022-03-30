package com.capg.springboot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.capg.springboot.entity.Location;
import com.capg.springboot.repository.LocationRepository;

@Service
@Transactional
public class LocationServiceImplementation implements LocationService
{
	@Autowired
	LocationRepository locationRepository;
	
	//Add User
			@Override
		
			public Location addLocation(Location add) {
				
				return locationRepository.save(add);
				
			}
			//Modify User
			@Override
			public Location updateLocation(Location add)
			{
				return locationRepository.save(add);
			}	
			//Delete User
			@Override
		
			public Location removeLocation(Location add) {
				
				locationRepository.delete(add);
			return add;
			}
}