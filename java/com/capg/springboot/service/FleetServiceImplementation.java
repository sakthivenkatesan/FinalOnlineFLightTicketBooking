package com.capg.springboot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capg.springboot.entity.Fleet;
import com.capg.springboot.repository.FleetRepository;

@Service
public class FleetServiceImplementation implements FleetService {
	
	@Autowired
	FleetRepository fleetrepository;

	@Override
	public Fleet addFleet(Fleet add) {
		// TODO Auto-generated method stub
		return fleetrepository.save(add);
	}

	@Override
	public Fleet updateFleet(Fleet add) {
		// TODO Auto-generated method stub
		return fleetrepository.save(add);
	}

	@Override
	public Fleet removeFleet(Fleet add) {
		// TODO Auto-generated method stub
		fleetrepository.delete(add);
		return add;
	}


}