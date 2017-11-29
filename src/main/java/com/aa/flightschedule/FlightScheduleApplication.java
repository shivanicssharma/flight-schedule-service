package com.aa.flightschedule;

import java.util.Date;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.Transactional;

import com.aa.flightschedule.model.FlightSchedule;

@SpringBootApplication
public class FlightScheduleApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(FlightScheduleApplication.class, args);
	}
	
	@Autowired
	EntityManager em;

	@Override
	@Transactional
	public void run(String... args) throws Exception {
		FlightSchedule flightSchedule=new FlightSchedule("Denver", "Nashville", new Date(), new Date(), 
				new Date(),new Date(), 2222,"Delta", "3333");
		em.persist(flightSchedule);
		
		}
}
