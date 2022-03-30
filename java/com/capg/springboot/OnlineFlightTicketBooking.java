package com.capg.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class OnlineFlightTicketBooking {

  public static void main(String[] args) {
    SpringApplication.run(OnlineFlightTicketBooking.class, args);
    System.out.println("Server started");
  }

}