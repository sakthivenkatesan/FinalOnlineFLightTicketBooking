package com.capg.springboot.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.capg.springboot.entity.Passenger;
import com.capg.springboot.repository.PassengerRepository;


@Service
@Transactional
public class PassengerServiceImplementation implements PassengerService {

	@Autowired 
	private PassengerRepository passengerRepository;
	
	@Override
	public Passenger addPassenger(Passenger add) {
		
		return passengerRepository.save(add);
	}
	
	@Override
	public Passenger updatePassenger(Passenger add) {
		return passengerRepository.save(add);
	}
	
	@Override
	public Passenger removePassenger(Passenger add) {
		
		passengerRepository.delete(add);
	return add;
	}
}