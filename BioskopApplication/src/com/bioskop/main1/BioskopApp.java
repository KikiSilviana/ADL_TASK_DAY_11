package com.bioskop.main1;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import com.bioskop.main.dao.FilmDaoImplementation;
import com.bioskop.main.model.BookingModel;
import com.bioskop.main.model.FilmModel;
//import com.bioskop.main.utility.DatabaseConnection;


public class BioskopApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Film();
		Booking();
		
	}
	public static void Film() {
		try {
			
		     FilmModel film = new FilmModel();
		     film.setFilmName("Beranak dalam Kardus");
		     film.setCategory("Horror");
		     film.setSubTitle("Sunda");
		     
		     FilmDaoImplementation filmDao = new FilmDaoImplementation();
		     filmDao.save(film);
		     
		     
		     List <FilmModel> lstFilm = filmDao.getAll();
		     
		     System.out.println("====================Judul Film=======================");
		     for (FilmModel filmModel : lstFilm) {
				System.out.print(filmModel.getFilmId() +" | " +  filmModel.getFilmName()+" | " +  filmModel.getCategory()+" | " +  filmModel.getSubTitle());
				System.out.println(); 
			}
		     
		    FilmModel updateFilm = new FilmModel();
		    updateFilm.setFilmId(8);
		    updateFilm.setFilmName("Suzanna");
		    updateFilm.setCategory("Horror");
		    updateFilm.setSubTitle("Indonesia");
		    filmDao.update(updateFilm); 
		    
		    
		     
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
			//KIKI
		}					
	}
	
	public static void Booking () {
		try {
		     BookingModel booking = new BookingModel();
		     booking.setBookingId(0);
		     booking.setSeatId(1);
		     booking.setScreeningId(2);
		     booking.setCustomerId(3);
		     
		     FilmDaoImplementation bookingDao = new FilmDaoImplementation();
//		     bookingDao.save(booking);DSFSF
		    
		} catch (Exception e) {
			// TODO: handle exception
			
		}
	}
} 

	
