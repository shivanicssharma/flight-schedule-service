package com.aa.flightschedule.dao;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowCallbackHandler;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.aa.flightschedule.model.FlightSchedule;

import java.util.ArrayList;
import java.util.List;

//@Repository

public class FlightScheduleJDBCDao {
	private JdbcTemplate jdbcTemplate;
	@Transactional(readOnly=true)
    public List<FlightSchedule> getAllFllightSchdeule() {
    return jdbcTemplate.query("select source from FlightSchedule",

                new FlightRowMapper());

    }

}
