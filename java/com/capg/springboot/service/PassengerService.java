package com.capg.springboot.service;

import java.util.List;


import com.capg.springboot.entity.Passenger;
import com.capg.springboot.entity.User;
import com.capg.springboot.exceptions.PassengerNotFoundException;

public interface PassengerService {

	Passenger addPassenger(Passenger add);
	Passenger removePassenger(Passenger add);
	Passenger updatePassenger(Passenger add);

}