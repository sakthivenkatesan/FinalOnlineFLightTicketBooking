package com.capg.springboot.service;

import java.util.Optional;

import com.capg.springboot.entity.Fleet;

public interface FleetService {

	Fleet addFleet(Fleet Fleet);

	Fleet updateFleet(Fleet Fleet);

	Fleet removeFleet(Fleet Fleet);

}