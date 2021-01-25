package com.techelevator.dao.jdbc;

import com.techelevator.dao.ReservationDAO;
import com.techelevator.model.Reservation;
import org.junit.Before;
import org.junit.Test;
import org.junit.rules.TestName;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;

import java.time.LocalDate;
import java.util.List;

import static org.junit.Assert.*;

public class JDBCReservationDAOTests extends BaseDAOTests
{

	private ReservationDAO dao;
	private JdbcTemplate jdbcTemplate;

	@Before
	public void setup()
	{
		dao = new JDBCReservationDAO(dataSource);
		jdbcTemplate = new JdbcTemplate(dataSource);
	}

	@Test
	public void createReservation_Should_ReturnNewReservationId()
	{
		// !! THIS TEST FAILS FOR SOME REASON !!
		// goal is for the tests to be readable!
		// had to change what was here before to what exists below
		
		//arrange
		int siteId = 1;
		String name = "TEST NAME";
		LocalDate startDate = LocalDate.now().plusDays(1);
		LocalDate endDate = LocalDate.now().plusDays(3);
		
		String verifySql = "SELECT * FROM reservation WHERE reservation_id = ?;";
		
		//act -- Testing an insert into the database
		int newReservationId = dao.createReservation(siteId, name, startDate, endDate);
		
		//assert -- How do I verify that the record is in the database?
		// 			We need to go check the db to confirm.
		SqlRowSet rows = jdbcTemplate.queryForRowSet(verifySql, newReservationId);
		
		if(rows.next())
		{
			String actualName = rows.getString("name");
			assertEquals("Because the name in the database should match what I inserted.", name, actualName);
		}
		else
		{
			fail("No rows with id " + newReservationId + " was found.");
		}
	}

}
