package com.techelevator.dao.jdbc;

import com.techelevator.dao.ReservationDAO;
import com.techelevator.model.Reservation;
import com.techelevator.model.Site;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;

import javax.sql.DataSource;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class JDBCReservationDAO implements ReservationDAO
{

	private JdbcTemplate jdbcTemplate;

	public JDBCReservationDAO(DataSource dataSource)
	{
		jdbcTemplate = new JdbcTemplate(dataSource);
	}

	@Override
	public int createReservation(int siteId, String name, LocalDate fromDate, LocalDate toDate)
	{		
		int nextId = getNextReservationId();
		
		// insert the reservation into the database
		String sql = "INSERT INTO reservation" 
					+ "( " + " site_id, " 
					+ " name, " 
					+ " from_date, " 
					+ " to_date " 
					+ ")"
					+ "VALUES (?, ?, ?, ?);";
		
		jdbcTemplate.update(sql
							, nextId
							, siteId
							, name
							, fromDate
							, toDate);
		
		// return the new reservation_id
		return nextId;
	}
	
	private int getNextReservationId()
	{
		String sql = "SELECT nextval('reservation_reservation_id_seq') AS id;";
		
		SqlRowSet rows = jdbcTemplate.queryForRowSet(sql);
		
		if(rows.next())
		{
			return rows.getInt("id");
		}
		// should never return this -1, but need to satisfy the function contract
		return -1;
	}

	private Reservation mapRowToReservation(SqlRowSet results)
	{
		Reservation r = new Reservation();
		r.setReservationId(results.getInt("reservation_id"));
		r.setSiteId(results.getInt("site_id"));
		r.setName(results.getString("name"));
		r.setFromDate(results.getDate("from_date").toLocalDate());
		r.setToDate(results.getDate("to_date").toLocalDate());
		r.setCreateDate(results.getDate("create_date").toLocalDate());
		return r;
	}

}
