package com.bioskop.main.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import com.bioskop.main.model.BookingModel;
import com.bioskop.main.model.FilmModel;
//import com.bioskop.main.model.FilmModel;
import com.bioskop.main.model.Model;
import com.bioskop.main.untility.DatabaseConnection;

public class BookingDaoImplementation implements DaoInterfaces<BookingModel> {

static Connection con = DatabaseConnection.getConnection();
	
	@Override
	public int save(BookingModel model) throws SQLException {
		// TODO Auto-generated method stub
		
		String query = "insert into booking (seat_id, screening_id, customer_id) values (?,?,?,?)";
		PreparedStatement ps = con.prepareStatement(query);
		BookingModel booking = (BookingModel) model;
		ps.setInt(1, booking.getSeatId());
		ps.setInt(2, booking.getScreeningId());
		ps.setInt(3, booking.getCustomerId());
		int result = ps.executeUpdate();
		return 0;
	}

	@Override
	public void delete(BookingModel model) throws SQLException {
		// TODO Auto-generated method stub
		String query = "delete from film where booking_id = ?";
		PreparedStatement ps = con.prepareStatement(query);
	
		ps.setInt(1, model.getBookingId());
	
		ps.executeUpdate();
	}

	@Override
	public void delete(int id) throws SQLException {
		// TODO Auto-generated method stub
		String query = "delete from booking where booking_id = ?";
		PreparedStatement ps = con.prepareStatement(query);
		ps.setInt(1,id);
		ps.executeUpdate();
	}

	@Override
	public void update(BookingModel model) throws SQLException {
		// TODO Auto-generated method stub
		String query = "update booking set seat_id = ? , screening_id = ?,  customer_id = ?  where booking_id = ?";
		PreparedStatement ps = con.prepareStatement(query);
		
		ps.setInt(1, model.getSeatId());
		ps.setInt(2, model.getScreeningId());
		ps.setInt(3, model.getCustomerId());
		ps.setInt(4, model.getBookingId());
		
		ps.executeUpdate();
	}
	

	@Override
	public BookingModel getById(BookingModel model) throws SQLException {
		// TODO Auto-generated method stub
		String query = " select * from booking where booking_id =?";
		PreparedStatement ps = con.prepareStatement(query);
		
		ps.setInt(1, model.getBookingId());
		ResultSet rs = ps.executeQuery();
		
		BookingModel bookingModel = new BookingModel();
		
		while(rs.next()) {
			bookingModel.setBookingId(1);
			bookingModel.setSeatId(2);
			bookingModel.setScreeningId(3);
			bookingModel.setCustomerId(4);
					
		}
		return bookingModel;
	}

	@Override
	public BookingModel getById(int id) throws SQLException {
		// TODO Auto-generated method stub
		String query = " select * from booking where booking_id =?";
		PreparedStatement ps = con.prepareStatement(query);
		
//		ps.setInt(1, model.getBookingId());
		ResultSet rs = ps.executeQuery();
		
		BookingModel bookingModel = new BookingModel();
		
		while(rs.next()) {
			bookingModel.setBookingId(1);
			bookingModel.setSeatId(2);
			bookingModel.setScreeningId(3);
			bookingModel.setCustomerId(4);
					
		}
		return bookingModel;
	}

	@Override
	public List<BookingModel> getAll() throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int add(BookingModel model) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	
	}


