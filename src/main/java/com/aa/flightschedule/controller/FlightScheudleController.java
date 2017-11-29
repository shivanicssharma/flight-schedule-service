package com.aa.flightschedule.controller;


import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.aa.flightschedule.model.FlightSchedule;
import com.aa.flightschedule.service.FlightScheduleService;

import lombok.extern.log4j.Log4j;
import lombok.extern.slf4j.Slf4j;

//import antlr.collections.List;
//@Slf4j automatic create a log object.To avoid to add boilerplate code(getter setter, tostring,hashcode
// lombok automatically add all these methods
// restcontroller to make 
@RestController
@Slf4j
public class FlightScheudleController {
//	Logger log = LoggerFactory.getLogger(FlightScheudleController.class);
	
	@Autowired
	FlightScheduleService  flightScheduleService;
	
	@PostMapping("create")
	public FlightSchedule createFlightSchedule(@RequestBody	FlightSchedule flightSchedule){
		   // we need to log the controller
		log.info("Creating flight schedule.");
		log.debug("Creating flight schedule input object" + flightSchedule);
		

		
     //FlightScheduleService  flightScheduleService=new FlightScheduleService();
   return flightScheduleService.createFlightSchedule(flightSchedule);
		// Do mapping with URL
		
		
		
	}
	@GetMapping("findallflights")
	public List<FlightSchedule> getAllFllightSchdeule(){
		log.info("Finding all flight schedules");
		log.debug("Finding flight schedule input object" + flightScheduleService);
		
		
		return flightScheduleService.getAllFllightSchdeule();
		
		 }
	@GetMapping("findflightbyID/{id}")
    public  FlightSchedule flightScheduleGetByID(@PathVariable("id") int id) {
		log.info("Finding all flight schedule by ID");
		log.debug("Finding flight schedule by ID input object" + flightScheduleService);
		
        return flightScheduleService.flightScheduleGetByID(id);
    }

}
