package com.aa.flightschedule.dao;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.ui.Model;

import com.aa.flightschedule.model.FlightSchedule;
@Component
public class FlightScheduleDao {
	
	@Autowired
	EntityManager em;
	
	@Transactional
	public FlightSchedule createFlightSchedule(FlightSchedule flightSchedule){
		em.persist(flightSchedule);
		
		return flightSchedule;
		
	}
	@Transactional
	public List<FlightSchedule> getAllFllightSchdeule( ){
		String hql = "from FlightSchedule";
		return em.createQuery(hql).getResultList();
		//return em.createQuery(FlightSchedule.class);
		
	}
	@Transactional
	public  FlightSchedule flightScheduleGetByID(int id){
		return em.find(FlightSchedule.class, id);
 

	

}
}