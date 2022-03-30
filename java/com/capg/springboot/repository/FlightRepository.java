package com.capg.springboot.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.capg.springboot.entity.Flight;
import com.capg.springboot.entity.User;


public interface FlightRepository extends JpaRepository<Flight, String>{
	
	}