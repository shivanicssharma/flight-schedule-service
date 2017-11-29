package com.aa.flightschedule.service;
import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.aa.flightschedule.dao.FlightScheduleDao;
import com.aa.flightschedule.dao.FlightScheduleJDBCDao;
import com.aa.flightschedule.model.FlightSchedule;
@Service
public class FlightScheduleService {
 @Autowired
 FlightScheduleDao flightScheduleDao;
 
 FlightScheduleJDBCDao flightScheduleJdbcDao;
 @Transactional
	public FlightSchedule createFlightSchedule(	FlightSchedule flightSchedule){
		//FlightScheduleDao flightScheduleDao= new FlightScheduleDao();
		return flightScheduleDao.createFlightSchedule(flightSchedule);
		
	
	}
 @Transactional
 public List<FlightSchedule> getAllFllightSchdeule( ){
	 
	 List<FlightSchedule> allflights=new ArrayList<FlightSchedule>();
	 for(FlightSchedule flightschedule: flightScheduleDao.getAllFllightSchdeule()){
		 allflights.add(flightschedule);
	 }
	 return allflights;

	
}
 public  FlightSchedule flightScheduleGetByID(int id){
	 return flightScheduleDao.flightScheduleGetByID(id);
 }
}