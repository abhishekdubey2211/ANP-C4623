package com.moviebs.service;
import com.moviebs.dto.*;
import com.moviebs.model.*;
public interface BookingService 
{

	Booking getBookingDetailById(int bookingId);
	TicketDTO bookTicket(BookingDTO bookingDTO);
	String cancelTicket(int id);
}