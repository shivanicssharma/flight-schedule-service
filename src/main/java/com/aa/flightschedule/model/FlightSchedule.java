package com.aa.flightschedule.model;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;
import lombok.NoArgsConstructor;
@Entity
@NoArgsConstructor
public @ Data class FlightSchedule{
	// @data annotation have added getter,setter, to string methods
	//this is data class
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id")
    private int id;
	
	private String source;
	private String destination;
	private Date orginalDepartTime;
	private Date originalArrivalTime;
	private Date actualDepartTime;
	private Date actualArrivalTime;
	private int flightNumber;
	private String airlineName;
	private String equipment;

	public FlightSchedule(String source, String destination, Date orginalDepartTime,
			Date originalArrivalTime, Date actualDepartTime, Date actualArrivalTime, int flightNumber,
			String airlineName, String equipment) {
		super();
		this.source = source;
		this.destination = destination;
		this.orginalDepartTime = orginalDepartTime;
		this.originalArrivalTime = originalArrivalTime;
		this.actualDepartTime = actualDepartTime;
		this.actualArrivalTime = actualArrivalTime;
		this.flightNumber = flightNumber;
		this.airlineName = airlineName;
		this.equipment = equipment;
	}

	
	
	
	
	
	
	
	
	
	

}
