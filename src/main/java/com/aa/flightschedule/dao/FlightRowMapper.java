package com.aa.flightschedule.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.aa.flightschedule.model.FlightSchedule;

public class FlightRowMapper implements RowMapper<FlightSchedule >
{

	@Override
	public FlightSchedule mapRow(ResultSet rs, int rowNum) throws SQLException {
		FlightSchedule flightschedule=new FlightSchedule ();
		flightschedule.setSource(rs.getString("source"));
		flightschedule.setSource(rs.getString("destination"));

		return null;
	}

}
